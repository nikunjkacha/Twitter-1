package com.example.nanmihai.twitter;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.nanmihai.twitter.models.Tweet;

public class Principala extends ListActivity {
    private ListView tweetListView;
    private Tweet[] tweets ;
    private ArrayAdapter tweetItemArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principala);
        tweets = new Tweet[4];
        Tweet tweet = new Tweet("Nume1", "username1", "Primul mesaj");
        tweets[0] = tweet;
        tweet = new Tweet("Nume2", "username2", "Al doilea mesaj");
        tweets[1] = tweet;
        tweet = new Tweet("Nume3", "username3", "Al treilea mesaj");
        tweets[2] = tweet;
        tweet = new Tweet("Nume4", "username4", "Al patrulea mesaj");
        tweets[3] = tweet;
        tweetItemArrayAdapter = new TweetAdapter(this, tweets);
        setListAdapter(tweetItemArrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(this, TweetDetail.class);
        startActivity(intent);
    }
}
