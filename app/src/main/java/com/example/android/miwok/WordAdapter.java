package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kingakimbrel on 7/2/16.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int mBackgroundResource;

    public WordAdapter(Context context, ArrayList<Word> list, int backgroundResource) {
        super(context, 0, list);
        this.mBackgroundResource = backgroundResource;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View listItemView = view;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.single_item, parent, false);
        }

        LinearLayout singleItem = (LinearLayout) listItemView.findViewById(R.id.words_view);
        singleItem.setBackgroundColor(ContextCompat.getColor(getContext(), this.mBackgroundResource));

        Word word = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.word_text_view);
        nameTextView.setText(word.getWord());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.word_english_text_view);
        numberTextView.setText(word.getDefaultTrans());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.icon_view);
        if (word.getImageResourceId() > 0) {
            iconView.setImageResource(word.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
