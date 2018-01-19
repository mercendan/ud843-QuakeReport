package com.example.android.quakereport;

/**
 * Created by DD on 2018-01-14.
 */

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    private long mTimeMilliseconds;

    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object
     * @param magnitude is the magnitude of the earthquake
     * @param location is the city location of the earthquake
     * @param timeMilliseconds is the date of the earthquake
     * @param url is the url to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeMilliseconds = timeMilliseconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeMilliseconds() {
        return mTimeMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
