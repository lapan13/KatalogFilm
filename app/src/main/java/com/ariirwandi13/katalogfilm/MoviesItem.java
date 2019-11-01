package com.ariirwandi13.katalogfilm;

import android.os.Parcel;
import android.os.Parcelable;

public class MoviesItem implements Parcelable {

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

    private int mImageResource;
    private String mTitle;
    private String mDate;
    private String mRating;
    private String mDescription;

    public MoviesItem(int imageResource, String title, String date, String rating, String description) {
        mImageResource = imageResource;
        mTitle = title;
        mDate = date;
        mRating = rating;
        mDescription= description;
    }

    protected MoviesItem(Parcel in) {
        mImageResource = in.readInt();
        mTitle= in.readString();
        mDate= in.readString();
        mRating= in.readString();
        mDescription= in.readString();
    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDate() { return mDate; }

    public String getRating() {
        return mRating;
    }

    public String getDescription() {
        return mDescription;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageResource);
        dest.writeString(mTitle);
        dest.writeString(mDate);
        dest.writeString(mRating);
        dest.writeString(mDescription);
    }
}
