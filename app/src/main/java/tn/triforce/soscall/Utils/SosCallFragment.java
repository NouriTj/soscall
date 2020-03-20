package tn.triforce.soscall.Utils;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tn.triforce.soscall.AutoFitGridLayoutManager;
import tn.triforce.soscall.MainActivity;
import tn.triforce.soscall.R;

public class SosCallFragment extends Fragment {

	public RecyclerView recyclerView;
	View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {

		// Inflate the layout for this fragment
		view = inflater.inflate(R.layout.fragment_sos_call, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

		AutoFitGridLayoutManager layoutManager = new AutoFitGridLayoutManager(getContext(), 500);
		recyclerView.setLayoutManager(layoutManager);
		return view;
	}
}
