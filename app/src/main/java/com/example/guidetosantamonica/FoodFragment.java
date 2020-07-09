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
        words.add(new Word(getResources().getString(R.string.ye_olde_kings_head_description), getResources().getString(R.string.ye_olde_kings_head), R.drawable.ye_olde_kings_head));
        words.add(new Word(getResources().getString(R.string.bay_city_deli_description), getResources().getString(R.string.bay_city_deli), R.drawable.bay_city_deli));
        words.add(new Word(getResources().getString(R.string.the_independence_description), getResources().getString(R.string.the_independence), R.drawable.the_independence));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_food);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}