package com.ariirwandi13.katalogfilm;

import android.os.Parcel;
import android.os.Parcelable;

class MoviesItem implements Parcelable {

    public static final Creator<MoviesItem> CREATOR = new Creator<MoviesItem>() {
        @Override
        public MoviesItem createFromParcel(Parcel in) {
            return new MoviesItem(in);
        }

        @Override
        public MoviesItem[] newArray(int size) {
            return new MoviesItem[size];
        }
    };

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



    private MoviesItem(Parcel in) {
        imageMovie = in.readInt();
        mTitle = in.readString();
        mDate = in.readString();
        mRating = in.readString();
        mDescription = in.readString();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imageMovie);
        dest.writeString(mTitle);
        dest.writeString(mDate);
        dest.writeString(mRating);
        dest.writeString(mDescription);
    }
}
