package com.example.android.quakereport;

/**
 * Created by Johnny on 2017-01-11.
 */

public class Quake {

    private String mPlace;
    private String mDate;
    private double mMagnitude;

    public Quake(double m , String p, String d) {
        mMagnitude = m;
        mPlace = p;
        mDate = d;

    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmPlace() {
        return mPlace;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public void setmMagnitude(float mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public void setmPlace(String mPlace) {
        this.mPlace = mPlace;
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
