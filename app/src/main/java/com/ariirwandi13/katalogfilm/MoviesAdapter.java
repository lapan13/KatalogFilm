package com.ariirwandi13.katalogfilm;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {
    private ArrayList<MoviesItem> moviesList;

    MoviesAdapter(ArrayList<MoviesItem> moviesList, Context context) {
        this.moviesList = moviesList;
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movies, parent, false);
        return new MoviesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, final int position) {
        final MoviesItem moviesItem = moviesList.get(position);

        GlideApp.with(holder.itemView)
                .load(moviesItem.getImageMovie())
                .into(holder.mImageMovies);
        holder.mTvTitle.setText(moviesItem.getmTitle());
        holder.mTvDate.setText(moviesItem.getmDate());
        holder.mRatingBar.setRating(Float.parseFloat(moviesItem.getmRating()) / 2);
        holder.mTvRating.setText(moviesItem.getmRating());
        holder.mTvDescription.setText(moviesItem.getmDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), moviesItem.getmTitle(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra("Example Item", moviesList.get(position));

                v.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    class MoviesViewHolder extends RecyclerView.ViewHolder {

        CardView item_movies;
        ImageView mImageMovies;
        TextView mTvTitle, mTvDate, mTvRating, mTvDescription;
        RatingBar mRatingBar;

        MoviesViewHolder(@NonNull View itemView) {
            super(itemView);

            item_movies = itemView.findViewById(R.id.cardview);
            mImageMovies = itemView.findViewById(R.id.img_movie);
            mTvTitle = itemView.findViewById(R.id.tv_title);
            mTvDate = itemView.findViewById(R.id.tv_release_date);
            mRatingBar = itemView.findViewById(R.id.rtb_movies);
            mTvRating = itemView.findViewById(R.id.tv_rating);
            mTvDescription = itemView.findViewById(R.id.tv_description);

        }
    }
}
