package com.ariirwandi13.katalogfilm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {

    private ArrayList<MoviesItem> mMoviesList;
    private OnItemClickListener mListener;

    public MoviesAdapter(ArrayList<MoviesItem> moviesList) {
        mMoviesList = moviesList;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    @Override
    public MoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movies_item, parent, false);
        MoviesViewHolder evh = new MoviesViewHolder(v, mListener);
        return evh;
    }

    @Override
    public void onBindViewHolder(MoviesViewHolder holder, int position) {
        MoviesItem currentItem = mMoviesList.get(position);

        Glide.with(holder.itemView)
                .load(currentItem.getImageResource())
                .into(holder.mImageMovies);
        holder.mTvTitle.setText(currentItem.getTitle());
        holder.mTvDate.setText(currentItem.getDate());
        holder.mTvRating.setText(currentItem.getRating());
        holder.mTvRatingBar.setRating(Float.parseFloat(currentItem.getRating())/2);
        holder.mTvDescription.setText(currentItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return mMoviesList.size();
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public static class MoviesViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageMovies;
        public TextView mTvTitle;
        public TextView mTvDate;
        public TextView mTvRating;
        public TextView mTvDescription;
        public RatingBar mTvRatingBar;

        public MoviesViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            mImageMovies = itemView.findViewById(R.id.img_movie);
            mTvTitle = itemView.findViewById(R.id.tv_title);
            mTvDate = itemView.findViewById(R.id.tv_release_date);
            mTvRating = itemView.findViewById(R.id.tv_rating);
            mTvRatingBar = itemView.findViewById(R.id.rtb_movies);
            mTvDescription = itemView.findViewById(R.id.tv_description);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
