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
 * Use the {@link FoodFragment newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create an array of words
        final ArrayList<Word> words = new ArrayList<Word>();

//        words.add("one");
        words.add(new Word("An old wharf that has shops, restaurants, and rides, which include both a rollercoaster and a ferris wheel.", "Santa Monica Pier", R.drawable.santa_monica_pier));
        words.add(new Word("One of the most iconic beaches of SoCal stretching 3.5 miles.", "Santa Monica State Beach", R.drawable.santa_monica_state_beach));
        words.add(new Word("A nice relaxing park located next to the coast where you can stroll and sit under the shade.", "Palisades Park", R.drawable.palisades_park));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_food);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}