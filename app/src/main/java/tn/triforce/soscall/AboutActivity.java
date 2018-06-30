package tn.triforce.soscall;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

import tn.triforce.soscall.Utils.Utils;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(tn.triforce.soscall.R.layout.activity_about);

/*
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/BRUSHSCI.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
//*/
        try {
            String pInfoVersion = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            int year = Calendar.getInstance().get(Calendar.YEAR);
            TextView version = (TextView) findViewById(tn.triforce.soscall.R.id.version);
            version.setText("V " + pInfoVersion + "  ©" + year);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void onClickContact(View v) {
        Utils.contactAction(this);
    }
}
