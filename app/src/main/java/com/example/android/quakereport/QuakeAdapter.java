package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Johnny on 2017-01-11.
 */

public class QuakeAdapter extends ArrayAdapter<Quake> {

    private static final String LOCATION_SEPARATOR = " of ";

    public QuakeAdapter(Activity context, ArrayList<Quake> quakeAdapter) {
        super(context, 0, quakeAdapter);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Quake currentQuake = getItem(position);

        DecimalFormat formatter = new DecimalFormat("0.0");


        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude_text_view);
        magnitudeTextView.setText(String.valueOf(formatter.format(currentQuake.getmMagnitude())));

        String originalLocation = currentQuake.getmPlace();
        String place;
        String offset;
        if (originalLocation.contains(LOCATION_SEPARATOR)) {
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            offset = parts[0] + LOCATION_SEPARATOR;
            place = parts[1];
        } else {
            offset = "Near the";
            place = originalLocation;
        }

        TextView offsetTextView = (TextView) listItemView.findViewById(R.id.offset_text_view);
        offsetTextView.setText(offset);

        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        placeTextView.setText(place);


        //Formatting the time and date

        long UTime = currentQuake.getmDate();
        Date dateObject = new Date(UTime);
        String dateToDisplay = formatDate(dateObject);
        String timeToDisplay = formatTime(dateObject);

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        dateTextView.setText(dateToDisplay);

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time_text_view);
        timeTextView.setText(timeToDisplay);

        return listItemView;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
