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
 * Use the {@link RecreationFragment newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecreationFragment extends Fragment {

    public RecreationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create an array of words
        final ArrayList<Word> words = new ArrayList<Word>();

//        words.add("one");
        words.add(new Word(getResources().getString(R.string.pacific_park_description), getResources().getString(R.string.pacific_park), R.drawable.pacific_park));
        words.add(new Word(getResources().getString(R.string.heal_the_bay_description), getResources().getString(R.string.heal_the_bay), R.drawable.heal_the_bay));
        words.add(new Word(getResources().getString(R.string.the_wende_museum_description), getResources().getString(R.string.the_wende_museum), R.drawable.the_wende_museum));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_recreation);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}