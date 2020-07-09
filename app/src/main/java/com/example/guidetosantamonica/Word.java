package com.example.guidetosantamonica;

public class Word {

    private String mLocation;

    private String mSubtitle;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String location, String subtitle, int imageResourceId) {
        mLocation = location;
        mSubtitle = subtitle;
        mImageResourceId = imageResourceId;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmSubtitle() {
        return mSubtitle;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mLocation='" + mLocation + '\'' +
                ", mSubtitle='" + mSubtitle + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
