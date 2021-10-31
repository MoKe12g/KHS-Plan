package com.example.khsplan.dayfragments;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.khsplan.R;
import com.example.khsplan.Tage;
import com.example.khsplan.scraper;

import java.util.ArrayList;


public class fragment2 extends Fragment {
    final String url2 = "https://www.karl-heine-schule-leipzig.de/Vertretung/V_DC_002.html";
    public RecyclerView recyclerView;
    public ArrayList<Tage> zweitertag = new ArrayList<>();
    Context context;
    public ProgressBar progressbar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment2_layout, container, false);
        recyclerView = view.findViewById(R.id.recView2);
        context = view.getContext();
        progressbar = view.findViewById(R.id.progressbar2);
        new scraper(url2, zweitertag, recyclerView, context, progressbar).execute();
        return view;
    }

}