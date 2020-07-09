package com.example.guidetosantamonica;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShoppingFragment newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create an array of words
        final ArrayList<Word> words = new ArrayList<Word>();

//        words.add("one");
        words.add(new Word(getResources().getString(R.string.downtown_santa_monica_description), getResources().getString(R.string.downtown_santa_monica), R.drawable.downtown_santa_monica));
        words.add(new Word(getResources().getString(R.string.santa_monica_place_description), getResources().getString(R.string.santa_monica_place), R.drawable.santa_monica_place));
        words.add(new Word(getResources().getString(R.string.pier_gear_description), getResources().getString(R.string.pier_gear), R.drawable.pier_gear));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_shopping);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}