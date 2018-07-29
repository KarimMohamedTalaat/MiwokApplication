package com.example.karim.italish;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    ListView listView;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_global_activity);

        listView = findViewById(R.id.GlobalListView);

        /************* 1st *****************
        ArrayList <String> numbersArrayList = new ArrayList<>();
        numbersArrayList.add("One");
        numbersArrayList.add("two");
        numbersArrayList.add("Three");
        numbersArrayList.add("Four");
        numbersArrayList.add("Five");
        numbersArrayList.add("Six");
        numbersArrayList.add("Seven");
        numbersArrayList.add("Eight");
        numbersArrayList.add("Nine");
        numbersArrayList.add("Ten");
        ArrayAdapter <String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, numbersArrayList);
        listView.setAdapter(itemsAdapter);
        */
        //***********************************






        /*
        //************** 2nd ******************
        //in case of creating two arraylists there is no an adapter takes two arraylists together
        ArrayList <Word> numbersArrayList = new ArrayList<>();

        //Word w = new Word("One","Uno"); numbersArrayList.add(w);

        numbersArrayList.add(new Word("one", "lutti"));
        numbersArrayList.add(new Word("two", "otiiko"));
        numbersArrayList.add(new Word("three", "tolookosu"));
        numbersArrayList.add(new Word("four", "oyyisa"));
        numbersArrayList.add(new Word("five", "massokka"));
        numbersArrayList.add(new Word("six", "temmokka"));
        numbersArrayList.add(new Word("seven", "kenekaku"));
        numbersArrayList.add(new Word("eight", "kawinta"));
        numbersArrayList.add(new Word("nine", "wo’e"));
        numbersArrayList.add(new Word("ten", "na’aacha"));

        // wrong ->
        ArrayAdapter <Word> itemsAdapter = new ArrayAdapter<>(this, R.layout.list_item, numbersArrayList);
        listView.setAdapter(itemsAdapter);
        //*****************************************
        */











        /*
        //**************** 3rd *********************
        ArrayList <Word> numbersArrayList = new ArrayList<>();

        numbersArrayList.add(new Word("one", "lutti", R.drawable.number_one));
        numbersArrayList.add(new Word("two", "otiiko", R.drawable.number_two));
        numbersArrayList.add(new Word("three", "tolookosu", R.drawable.number_three));
        numbersArrayList.add(new Word("four", "oyyisa", R.drawable.number_four));
        numbersArrayList.add(new Word("five", "massokka", R.drawable.number_five));
        numbersArrayList.add(new Word("six", "temmokka", R.drawable.number_six));
        numbersArrayList.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        numbersArrayList.add(new Word("eight", "kawinta", R.drawable.number_eight));
        numbersArrayList.add(new Word("nine", "wo’e", R.drawable.number_nine));
        numbersArrayList.add(new Word("ten", "na’aacha", R.drawable.number_ten));

        WordAdapter itemsAdapter = new WordAdapter (this , numbersArrayList);
        listView.setAdapter(itemsAdapter);

        //******************************************
        */

        final ArrayList <Word> numbersArrayList = new ArrayList<>();

        numbersArrayList.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        numbersArrayList.add(new Word("two", "otiiko", R.drawable.number_two,R.raw.number_two));
        numbersArrayList.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        numbersArrayList.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        numbersArrayList.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        numbersArrayList.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        numbersArrayList.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        numbersArrayList.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        numbersArrayList.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        numbersArrayList.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

        WordAdapter itemsAdapter = new WordAdapter (this , numbersArrayList);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = numbersArrayList.get(position);
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }

}