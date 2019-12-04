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
public class TvShowFragment extends Fragment {

    private int dummyColor;

    public TvShowFragment() {
    }

    @SuppressLint("ValidFragment")
    TvShowFragment(int color) {
        this.dummyColor = color;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tv_show, container, false);
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

        ArrayList<MoviesItem> mTvShowList = new ArrayList<>();
        Resources resources = getResources();
        String[] titles = resources.getStringArray(R.array.titles_array);
        String[] dates = resources.getStringArray(R.array.dates_array);
        String[] synopsis = resources.getStringArray(R.array.synopsis_array);
        mTvShowList.add(new MoviesItem(R.drawable.poster_mandalorian, titles[12], dates[12], "7.6", synopsis[12]));
        mTvShowList.add(new MoviesItem(R.drawable.poster_hisdarkm, titles[13], dates[13], "7.8", synopsis[13]));
        mTvShowList.add(new MoviesItem(R.drawable.poster_see, titles[14], dates[14], "7.8", synopsis[14]));
        mTvShowList.add(new MoviesItem(R.drawable.poster_batwoman, titles[15], dates[15], "6.2", synopsis[15]));
        mTvShowList.add(new MoviesItem(R.drawable.poster_carnival, titles[16], dates[16], "7.9", synopsis[16]));
        mTvShowList.add(new MoviesItem(R.drawable.poster_doom, titles[17], dates[17], "6.4", synopsis[17]));
        mTvShowList.add(new MoviesItem(R.drawable.poster_mortel, titles[18], dates[18], "5.6", synopsis[18]));
        mTvShowList.add(new MoviesItem(R.drawable.poster_watchman, titles[19], dates[19], "7.2", synopsis[19]));
        mTvShowList.add(new MoviesItem(R.drawable.poster_case, titles[20], dates[20], "7.0", synopsis[20]));
        mTvShowList.add(new MoviesItem(R.drawable.poster_theboys, titles[21], dates[21], "8.1", synopsis[21]));
        mTvShowList.add(new MoviesItem(R.drawable.poster_dollface, titles[22], dates[22], "3.8", synopsis[22]));
        mTvShowList.add(new MoviesItem(R.drawable.poster_mrsfletcher, titles[23], dates[23], "8.5", synopsis[23]));

        MoviesAdapter moviesAdapter = new MoviesAdapter(mTvShowList, getContext());
        moviesAdapter.setHasStableIds(true);
        recyclerView.setAdapter(moviesAdapter);
    }
}
