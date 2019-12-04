package com.ariirwandi13.katalogfilm;


import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {

    private int dummyColor;

    public MoviesFragment() {
    }

    @SuppressLint("ValidFragment")
    MoviesFragment(int color) {
        this.dummyColor = color;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_movies, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final FrameLayout frameLayout = view.findViewById(R.id.frame_layout_dummy);
        frameLayout.setBackgroundColor(dummyColor);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_dummy);
        LinearLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        ArrayList<MoviesItem> mMoviesList = new ArrayList<>();
        Resources resources = getResources();
        String[] titles = resources.getStringArray(R.array.titles_array);
        String[] dates = resources.getStringArray(R.array.dates_array);
        String[] synopsis = resources.getStringArray(R.array.synopsis_array);
        mMoviesList.add(new MoviesItem(R.drawable.poster_joker, titles[0], dates[0], "8.6", synopsis[0]));
        mMoviesList.add(new MoviesItem(R.drawable.poster_maleficent, titles[1], dates[1], "7.3", synopsis[1]));
        mMoviesList.add(new MoviesItem(R.drawable.poster_terminator, titles[2], dates[2], "6.5", synopsis[2]));
        mMoviesList.add(new MoviesItem(R.drawable.poster_ipman, titles[3], dates[3], "0.0", synopsis[3]));
        mMoviesList.add(new MoviesItem(R.drawable.poster_f2f, titles[4], dates[4], "6.5", synopsis[4]));
        mMoviesList.add(new MoviesItem(R.drawable.poster_spiderman, titles[5], dates[5], "7.6", synopsis[5]));
        mMoviesList.add(new MoviesItem(R.drawable.poster_lion, titles[6], dates[6], "7.1", synopsis[6]));
        mMoviesList.add(new MoviesItem(R.drawable.poster_el, titles[7], dates[7], "7.1", synopsis[7]));
        mMoviesList.add(new MoviesItem(R.drawable.poster_angrybird, titles[8], dates[8], "6.6", synopsis[8]));
        mMoviesList.add(new MoviesItem(R.drawable.poster_zombieland, titles[9], dates[9], "7.5", synopsis[9]));
        mMoviesList.add(new MoviesItem(R.drawable.poster_toystory, titles[10], dates[10], "7.6", synopsis[10]));
        mMoviesList.add(new MoviesItem(R.drawable.poster_aladdin, titles[11], dates[11], "7.1", synopsis[11]));

        MoviesAdapter moviesAdapter = new MoviesAdapter(mMoviesList, getContext());
        moviesAdapter.setHasStableIds(true);
        recyclerView.setAdapter(moviesAdapter);
    }
}
