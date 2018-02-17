package com.workout.workoutside.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.workout.workoutside.R;
import com.workout.workoutside.contracts.MainContract;
import com.workout.workoutside.ioc.DIContext;
import com.workout.workoutside.presenters.MainPresenter;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DIContext.register();


        mainPresenter = DIContext.getInjector().getInstance(MainPresenter.class, this);
    }
}
