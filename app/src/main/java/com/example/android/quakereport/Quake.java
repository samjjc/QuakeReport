package com.example.android.quakereport;

/**
 * Created by Johnny on 2017-01-11.
 */

public class Quake {

    private String mPlace;
    private long mDate;
    private String mMagnitude;

    public Quake(String m , String p, long d) {
        mMagnitude= m;
        mPlace = p;
        mDate = d;

    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public long getmDate() {
        return mDate;
    }

    public String getmPlace() {
        return mPlace;
    }

    public void setmDate(long mDate) {
        this.mDate = mDate;
    }

    public void setmMagnitude(String mMagnitude) {
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
