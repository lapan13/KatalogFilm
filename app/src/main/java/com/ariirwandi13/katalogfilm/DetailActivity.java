package com.ariirwandi13.katalogfilm;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("Detail");
        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(Color.parseColor("#00FFFFFF"));

        Toolbar toolbar = findViewById(R.id.toolbar_detail);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }


        Intent intent = getIntent();
        MoviesItem wisataItem = intent.getParcelableExtra("Example Item");

        int imageRes = wisataItem.getImageResource();
        String title = wisataItem.getTitle();
        String date = wisataItem.getDate();
        String rating = wisataItem.getRating();
        String description = wisataItem.getDescription();

        ImageView imageMovie = findViewById(R.id.image_detail_movie);
        imageMovie.setImageResource(imageRes);

        TextView tvTitle = findViewById(R.id.tv_detail_title);
        tvTitle.setText(title);

        TextView tvDate = findViewById(R.id.tv_deatil_date);
        tvDate.setText(date);

        TextView tvRate = findViewById(R.id.tv_detail_rating);
        tvRate.setText(rating);

        RatingBar rtBar = findViewById(R.id.rtb_detail_movies);
        rtBar.setRating(Float.parseFloat(rating) / 2);

        TextView tvDesc = findViewById(R.id.tv_synopsis);
        tvDesc.setText(description);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}
