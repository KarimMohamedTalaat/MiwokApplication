package com.example.karim.italish;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    ListView listView;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_global_activity);

        listView = findViewById(R.id.GlobalListView);

        final ArrayList<Word> familyArrayList = new ArrayList<>();

        familyArrayList.add(new Word("father", "әpә", R.drawable.family_father, R.raw.family_father));
        familyArrayList.add(new Word("mother", "әṭa", R.drawable.family_mother,R.raw.family_mother));
        familyArrayList.add(new Word("son", "angsi", R.drawable.family_son,R.raw.family_son));
        familyArrayList.add(new Word("daughter", "tune", R.drawable.family_daughter,R.raw.family_daughter));
        familyArrayList.add(new Word("older brother", "taachi", R.drawable.family_older_brother,R.raw.family_older_brother));
        familyArrayList.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother,R.raw.family_younger_brother));
        familyArrayList.add(new Word("older sister", "teṭe", R.drawable.family_older_sister,R.raw.family_older_sister));
        familyArrayList.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister,R.raw.family_younger_sister));
        familyArrayList.add(new Word("grandmother ", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyArrayList.add(new Word("grandfather", "paapa", R.drawable.family_grandfather,R.raw.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter (this , familyArrayList);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = familyArrayList.get(position);
                mediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
