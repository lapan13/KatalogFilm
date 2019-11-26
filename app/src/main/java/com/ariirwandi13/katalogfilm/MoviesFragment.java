package com.ariirwandi13.katalogfilm;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {

    int dummyColor;
    MoviesAdapter moviesAdapter;
    ArrayList<MoviesItem> dummyList;

    public MoviesFragment() {
    }

    @SuppressLint("ValidFragment")
    public MoviesFragment(int color) {
        this.dummyColor = color;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies, container, false);

        final FrameLayout frameLayout = view.findViewById(R.id.frame_layout_dummy);
        frameLayout.setBackgroundColor(dummyColor);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_dummy);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        dummyList = new ArrayList<>();
        dummyList.add(new MoviesItem(R.drawable.poster_angrybird, "Palm Beach Food Fest", "Saturday, AUG 23 - AUG 25 @ Rode Island"));
        dummyList.add(new MoviesItem(R.drawable.poster_aladdin, "Palm Beach Food Fest", "Saturday, AUG 23 - AUG 25 @ Rode Island"));
        dummyList.add(new MoviesItem(R.drawable.poster_angrybird, "Palm Beach Food Fest", "Saturday, AUG 23 - AUG 25 @ Rode Island"));
        dummyList.add(new MoviesItem(R.drawable.poster_aladdin, "Palm Beach Food Fest", "Saturday, AUG 23 - AUG 25 @ Rode Island"));
        dummyList.add(new MoviesItem(R.drawable.poster_angrybird, "Palm Beach Food Fest", "Saturday, AUG 23 - AUG 25 @ Rode Island"));
        dummyList.add(new MoviesItem(R.drawable.poster_aladdin, "Palm Beach Food Fest", "Saturday, AUG 23 - AUG 25 @ Rode Island"));
        dummyList.add(new MoviesItem(R.drawable.poster_angrybird, "Palm Beach Food Fest", "Saturday, AUG 23 - AUG 25 @ Rode Island"));
        dummyList.add(new MoviesItem(R.drawable.poster_aladdin, "Palm Beach Food Fest", "Saturday, AUG 23 - AUG 25 @ Rode Island"));

        moviesAdapter = new MoviesAdapter(dummyList, getContext());
        moviesAdapter.setHasStableIds(true);
        recyclerView.setAdapter(moviesAdapter);

        return view;
    }

}
