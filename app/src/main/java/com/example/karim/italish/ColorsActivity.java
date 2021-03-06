package com.example.karim.italish;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    ListView listView;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_global_activity);

        listView = findViewById(R.id.GlobalListView);

        final ArrayList<Word> colorsArrayList = new ArrayList<>();

        colorsArrayList.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        colorsArrayList.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        colorsArrayList.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colorsArrayList.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        colorsArrayList.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        colorsArrayList.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        colorsArrayList.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        colorsArrayList.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));

        WordAdapter itemsAdapter = new WordAdapter (this, colorsArrayList);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = colorsArrayList.get(position);
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
