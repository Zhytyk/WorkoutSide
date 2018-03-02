package com.workout.workoutside.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.workout.workoutside.R;
import com.workout.workoutside.contracts.MainContract;
import com.workout.workoutside.ioc.DIContext;
import com.workout.workoutside.presenters.MainPresenter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter mainPresenter;


    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DIContext.register();


        mainPresenter = DIContext
                .getInjector()
                .getInstance(MainPresenter.class, MainContract.View.class, this);

        mainPresenter.init();
    }

    public ListView getListView() {
        if (listView == null) {
            listView = findViewById(R.id.list_view);
        }

        return listView;
    }
}
