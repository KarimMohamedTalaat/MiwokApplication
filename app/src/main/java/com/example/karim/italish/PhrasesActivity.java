package com.example.karim.italish;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    ListView listView;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_global_activity);

        listView = findViewById(R.id.GlobalListView);

        final ArrayList<Word> phrasesArrayList = new ArrayList<>();

        phrasesArrayList.add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        phrasesArrayList.add(new Word("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        phrasesArrayList.add(new Word("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        phrasesArrayList.add(new Word("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        phrasesArrayList.add(new Word("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        phrasesArrayList.add(new Word("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        phrasesArrayList.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        phrasesArrayList.add(new Word("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        phrasesArrayList.add(new Word("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
        phrasesArrayList.add(new Word("Come here.", "әnni'nem", R.raw.phrase_come_here));

        WordAdapter itemsAdapter = new WordAdapter (this , phrasesArrayList);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = phrasesArrayList.get(position);
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
