package com.ariirwandi13.katalogfilm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {
    ArrayList<MoviesItem> moviesList;
    Context moviesContext;

    public MoviesAdapter(ArrayList<MoviesItem> moviesList, Context moviesContext) {
        this.moviesList = moviesList;
        this.moviesContext = moviesContext;
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movies, parent, false);
        return new MoviesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {
        MoviesItem moviesItem = moviesList.get(position);

        holder.mImageMovies.setImageResource(moviesItem.getImageMovie());
        holder.mTvTitle.setText(moviesItem.getmTitle());
        holder.mTvDate.setText(moviesItem.getmDate());
        holder.mRatingBar.setRating(Float.parseFloat(moviesItem.getmRating()) / 2);
        holder.mTvRating.setText(moviesItem.getmRating());
        holder.mTvDescription.setText(moviesItem.getmDescription());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    class MoviesViewHolder extends RecyclerView.ViewHolder {

        ImageView mImageMovies;
        TextView mTvTitle, mTvDate, mTvRating, mTvDescription;
        RatingBar mRatingBar;

        public MoviesViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageMovies = itemView.findViewById(R.id.img_movie);
            mTvTitle = itemView.findViewById(R.id.tv_title);
            mTvDate = itemView.findViewById(R.id.tv_release_date);
            mRatingBar = itemView.findViewById(R.id.rtb_movies);
            mTvRating = itemView.findViewById(R.id.tv_rating);
            mTvDescription = itemView.findViewById(R.id.tv_description);

        }
    }
}
