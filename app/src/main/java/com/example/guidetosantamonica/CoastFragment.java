package com.example.guidetosantamonica;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CoastFragment newInstance} factory method to
 * create an instance of this fragment.
 */
public class CoastFragment extends Fragment {

    public CoastFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create an array of words
        final ArrayList<Word> words = new ArrayList<Word>();

//        words.add("one");
        words.add(new Word("200 Santa Monica Pier, Santa Monica, CA 90401", "Santa Monica Pier", R.drawable.santa_monica_pier));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_coast);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}