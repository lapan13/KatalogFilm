package com.ariirwandi13.katalogfilm;

public class MoviesItem {

    int intDummyImage;
    String strDummyTitle;
    String strDummySubtitle;

    public MoviesItem(int intDummyImage, String strDummyTitle, String strDummySubtitle) {
        this.intDummyImage = intDummyImage;
        this.strDummyTitle = strDummyTitle;
        this.strDummySubtitle = strDummySubtitle;
    }

    public int getIntDummyImage() {
        return intDummyImage;
    }

    public void setIntDummyImage(int intDummyImage) {
        this.intDummyImage = intDummyImage;
    }

    public String getStrDummyTitle() {
        return strDummyTitle;
    }

    public void setStrDummyTitle(String strDummyTitle) {
        this.strDummyTitle = strDummyTitle;
    }

    public String getStrDummySubtitle() {
        return strDummySubtitle;
    }

    public void setStrDummySubtitle(String strDummySubtitle) {
        this.strDummySubtitle = strDummySubtitle;
    }
}
