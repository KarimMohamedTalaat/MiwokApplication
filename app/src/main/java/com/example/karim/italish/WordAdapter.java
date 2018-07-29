package com.example.karim.italish;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity activity, ArrayList<Word> list) {
        super(activity, 0 , list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokWordTextView = convertView.findViewById(R.id.miwokTextView);
        miwokWordTextView.setText(currentWord.getmMiwokTranslation());

        TextView englishWordTextView = convertView.findViewById(R.id.englishTextView);
        englishWordTextView.setText(currentWord.getEnglishTranslation());

        ImageView imageView = convertView.findViewById(R.id.image);

        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else imageView.setVisibility(View.GONE);
        return convertView;
    }
}
