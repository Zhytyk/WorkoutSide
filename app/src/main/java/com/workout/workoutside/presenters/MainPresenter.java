package com.workout.workoutside.presenters;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.workout.workoutside.contracts.MainContract;
import com.workout.workoutside.views.MainActivity;

/**
 * Created by pavel on 17.02.2018.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    public void init() {
        ListView listView = view.getListView();
        String[] vals = { "Week 1", "Week 2", "Week 3" };

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(
                (MainActivity) view,
                android.R.layout.simple_list_item_1,
                vals
        );

        listView.setAdapter(listViewAdapter);
    }

}
