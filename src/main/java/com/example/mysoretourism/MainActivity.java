package com.example.mysoretourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler, categoryRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Temple",R.drawable.temp));
        recentsDataList.add(new RecentsData("Palace",R.drawable.palace));
        recentsDataList.add(new RecentsData("Park",R.drawable.park));
        recentsDataList.add(new RecentsData("Restaurant",R.drawable.resta));
        recentsDataList.add(new RecentsData("Cafe",R.drawable.cafe));
        recentsDataList.add(new RecentsData("Spa",R.drawable.spa));
        recentsDataList.add(new RecentsData("Fun",R.drawable.fun));
        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));

        setTopPlacesRecycler(topPlacesDataList);

    }

    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList) {
        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }

    private void setRecentRecycler(List<RecentsData> recentsDataList) {
        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }
}
