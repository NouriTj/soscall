package tn.triforce.soscall.Adapter;

/**
 * Created by noure on 27/05/2017.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import tn.triforce.soscall.DAO.Country;
import tn.triforce.soscall.R;
import tn.triforce.soscall.Utils.Utils;


public class CountryListAdapter extends ArrayAdapter<Country> {
    int groupid;
    Activity context;
    ArrayList<Country> list;
    LayoutInflater inflater;

    public CountryListAdapter(Activity context, int groupid, int id, ArrayList<Country>
            list) {
        super(context, id, list);
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
        this.groupid = groupid;
        this.list = list;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = inflater.inflate(groupid, parent, false);

        Country country = list.get(position);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.img_country);
        TextView textView = (TextView) itemView.findViewById(R.id.txt_country);

        Picasso.with(context).load(Utils.getPathAssetFlag(country.getCode())).into(imageView);
        textView.setText(country.getName());

        return itemView;
    }

    public View getDropDownView(int position, View convertView, ViewGroup
            parent) {
        return getView(position, convertView, parent);

    }
}