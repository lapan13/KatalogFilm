package com.ariirwandi13.katalogfilm;

class MoviesItem {

    private int imageMovie;
    private String mTitle;
    private String mDate;
    private String mRating;
    private String mDescription;

    MoviesItem(int imageMovie, String mTitle, String mDate, String mRating, String mDescription) {
        this.imageMovie = imageMovie;
        this.mTitle = mTitle;
        this.mDate = mDate;
        this.mRating = mRating;
        this.mDescription = mDescription;
    }

    int getImageMovie() {
        return imageMovie;
    }

    String getmTitle() {
        return mTitle;
    }

    String getmDate() {
        return mDate;
    }

    String getmRating() {
        return mRating;
    }

    String getmDescription() {
        return mDescription;
    }

}
