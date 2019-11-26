package com.ariirwandi13.katalogfilm;

public class MoviesItem {

    int imageMovie;
    String mTitle;
    String mDate;
    String mRating;
    String mDescription;

    public MoviesItem(int imageMovie, String mTitle, String mDate, String mRating, String mDescription) {
        this.imageMovie = imageMovie;
        this.mTitle = mTitle;
        this.mDate = mDate;
        this.mRating = mRating;
        this.mDescription = mDescription;
    }

    public int getImageMovie() {
        return imageMovie;
    }

    public void setImageMovie(int imageMovie) {
        this.imageMovie = imageMovie;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmRating() {
        return mRating;
    }

    public void setmRating(String mRating) {
        this.mRating = mRating;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
