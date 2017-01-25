package com.example.android.quakereport;

/**
 * Created by Johnny on 2017-01-11.
 */

public class Quake {

    private String mPlace;
    private long mDate;
    private double mMagnitude;
    private String mWebpage;

    public Quake(double m , String p, long d, String w) {
        mMagnitude= m;
        mPlace = p;
        mDate = d;
        mWebpage = w;

    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public long getmDate() {
        return mDate;
    }

    public String getmPlace() {
        return mPlace;
    }

    public String getmWebpage() {
        return mWebpage;
    }

    public void setmDate(long mDate) {
        this.mDate = mDate;
    }

    public void setmMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public void setmPlace(String mPlace) {
        this.mPlace = mPlace;
    }

    public void setmWebpage(String mWebpage) {
        this.mWebpage = mWebpage;
    }

    @Override
    public String toString() {
        return "Quake{ " +
                "mPlace:='" + mPlace + '\'' +
                ", mDate='" + mDate + '\'' +
                ", mMagnitude=" + mMagnitude +
                '}';
    }
}
