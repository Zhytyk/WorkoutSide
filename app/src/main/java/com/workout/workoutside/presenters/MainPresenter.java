package com.workout.workoutside.presenters;

import com.workout.workoutside.contracts.MainContract;

/**
 * Created by pavel on 17.02.2018.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

}
