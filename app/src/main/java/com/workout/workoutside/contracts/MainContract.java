package com.workout.workoutside.contracts;

import android.widget.ListView;

/**
 * Created by pavel on 17.02.2018.
 */

public interface MainContract {
    interface View {
        ListView getListView();
    }

    interface Presenter {
        void init();
    }
}
