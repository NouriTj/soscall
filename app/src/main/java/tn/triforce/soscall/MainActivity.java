package tn.triforce.soscall;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import tn.triforce.soscall.Adapter.CountryListAdapter;
import tn.triforce.soscall.Adapter.TabAdapter;
import tn.triforce.soscall.DAO.Country;
import tn.triforce.soscall.Utils.Constants;
import tn.triforce.soscall.Utils.SosCallFragment;
import tn.triforce.soscall.Utils.Utils;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {

    private static final int REQUEST_CALL_PHONE = 1;
    ArrayList<DataModel> SosNumbers;
    String[] Permissions = new String[]{Manifest.permission.CALL_PHONE};
    Utils utils;
    private String currentCountry;
    private TabAdapter tabAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private SosCallFragment sosCallFragment;
    private CovidFragment covidFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, Permissions, REQUEST_CALL_PHONE);
        }

        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        tabAdapter = new TabAdapter(getSupportFragmentManager());

        sosCallFragment = new SosCallFragment();
        covidFragment = new CovidFragment();

        tabAdapter.addFragment(sosCallFragment, "SOS");
        tabAdapter.addFragment(covidFragment, "COVID-19");
        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);

        utils = Utils.getInstance();

        try{
            try{
                TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
                currentCountry = tm.getSimCountryIso();
            }catch (Exception e){ }

            if(currentCountry == null || currentCountry.length() != 2) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    currentCountry = getResources().getConfiguration().getLocales().get(0).getCountry();
                } else {
                    currentCountry = getResources().getConfiguration().locale.getCountry();
                }
            }

            currentCountry = currentCountry.toUpperCase();
        }catch (Exception e){
            currentCountry = Constants.TUNISIA;
        }

        refreshRecyclerViews();
    }

    public void refreshRecyclerViews() {

        if(sosCallFragment.recyclerView != null && covidFragment.recyclerView != null){

            if (currentCountry == null || TextUtils.isEmpty (currentCountry) || !utils.dictionary.containsKey(currentCountry)) {
                currentCountry = Constants.TUNISIA;
            }

            HashMap countryNumbers = (HashMap)utils.dictionary.get(currentCountry);

            ArrayList<DataModel> sosNumbers = (ArrayList<DataModel>) countryNumbers.get( Constants.SOS_Key);
            RecyclerViewAdapter adapterSosNumbers = new RecyclerViewAdapter(this, sosNumbers, this);
            sosCallFragment.recyclerView.setAdapter(adapterSosNumbers);

            ArrayList<DataModel> covidNumbers = (ArrayList<DataModel>) countryNumbers.get( Constants.COVID_Key);
            RecyclerViewAdapter adapterCovidNumbers = new RecyclerViewAdapter(this, covidNumbers, this);
            covidFragment.recyclerView.setAdapter(adapterCovidNumbers);
        }
    }

    @Override
    public void onItemClick(DataModel item) {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            checkRequestedPermission();
            return;
        }
        Toast.makeText(getApplicationContext(), getString(R.string.calling) + getString(item.text), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + item.emergencyNumber));
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startActivity(intent);
    }

    private void checkRequestedPermission() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_Material_Light_Dialog_Alert);
        builder.setMessage(R.string.permission_msg).setNegativeButton(R.string.cancel, null);

        boolean showRationale = ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this, Manifest.permission.CALL_PHONE);
        if (showRationale) {
            builder.setNeutralButton(R.string.grant_permission,
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,
                                            int whichButton) {

                            ActivityCompat.requestPermissions(MainActivity.this, Permissions, REQUEST_CALL_PHONE);
                        }
                    });
        } else {
            builder.setNeutralButton(R.string.permission_setting,
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,
                                            int whichButton) {

                            Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                            Uri uri = Uri.fromParts("package", getPackageName(), null);
                            intent.setData(uri);
                            startActivity(intent);
                        }
                    });
        }
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        ArrayList<Country> list = new ArrayList<>();
        list.add(new Country(Constants.ALGERIA, getResources().getString(R.string.DZ)));
        list.add(new Country(Constants.FRANCE, getResources().getString(R.string.FR)));
        list.add(new Country(Constants.MAROCCO, getResources().getString(R.string.MA)));
        list.add(new Country(Constants.TUNISIA, getResources().getString(R.string.TN)));
        list.add(new Country(Constants.USA, getResources().getString(R.string.US)));
        list.add(new Country(Constants.CANADA, getResources().getString(R.string.CA)));
        list.add(new Country(Constants.MEXICO, getResources().getString(R.string.MX)));
        list.add(new Country(Constants.SOUTH_AFRICA, getResources().getString(R.string.ZA)));
        list.add(new Country(Constants.DEUSTCH, getResources().getString(R.string.DE)));
        list.add(new Country(Constants.ITALY, getResources().getString(R.string.IT)));
        list.add(new Country(Constants.TURKEY, getResources().getString(R.string.TR)));
        list.add(new Country(Constants.PORTUGAL, getResources().getString(R.string.PT)));
        list.add(new Country(Constants.REUNION, getResources().getString(R.string.RE)));
        list.add(new Country(Constants.BELGIUM, getResources().getString(R.string.BE)));
        list.add(new Country(Constants.ROMANIA, getResources().getString(R.string.RO)));
        list.add(new Country(Constants.SPAIN, getResources().getString(R.string.ES)));

        Collections.sort(list);

        MenuItem item = menu.findItem(R.id.spinner);
        Spinner spinner = (Spinner) MenuItemCompat.getActionView(item);

        CountryListAdapter adapter = new CountryListAdapter(this,
                R.layout.spinner_layout, R.id.txt_country, list);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Country country = (Country) parent.getItemAtPosition(position);
                        if (country != null) {
                            currentCountry = country.getCode();
                            refreshRecyclerViews();
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

        int i = 0;
        for (Country country : list) {
            if (country.getCode().equalsIgnoreCase(currentCountry)) {
                spinner.setSelection(i);
                break;
            }
            i++;
        }/*
        //country doesn't exist in the liste
        if(i == list.size()){
            spinner.setSelection(3);//tunisia is the default value
        }//*/

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_share:
                Utils.shareAction(getString(R.string.text_share_app), this);
                return true;

            case R.id.action_about:
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
