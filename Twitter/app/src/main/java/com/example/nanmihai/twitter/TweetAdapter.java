package com.example.nanmihai.twitter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.nanmihai.twitter.models.Tweet;

/**
 * Created by Nan Mihai on 14.11.2015.
 */
public class TweetAdapter extends ArrayAdapter<Tweet> {
    private LayoutInflater inflater;

    public TweetAdapter(Activity activity, Tweet[] items){
        super(activity, R.layout.row_tweet, items);
        inflater = activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.row_tweet, parent, false);
        }
        Tweet tweet = this.getItem(position);
        TextView titleLabel = (TextView) v.findViewById(R.id.tweetTitle);
        titleLabel.setText(tweet.getTitle());
        TextView bodyLabel = (TextView) v.findViewById(R.id.tweetBody);
        bodyLabel.setText(tweet.getBody());
        TextView dateLabel = (TextView) v.findViewById(R.id.tweetDate);
        dateLabel.setText(tweet.getDate());
        return v;
    }
}
