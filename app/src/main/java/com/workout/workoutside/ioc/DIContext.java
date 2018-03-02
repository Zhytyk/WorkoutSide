package com.workout.workoutside.ioc;

import com.workout.workoutside.contracts.MainContract;
import com.workout.workoutside.ioc.api.Injector;
import com.workout.workoutside.ioc.api.Registrator;
import com.workout.workoutside.presenters.MainPresenter;

/**
 * Created by pavel on 17.02.2018.
 */

public class DIContext {
    private static final DI di;

    static {
        di = new DI();
    }

    public static void register() {
        Registrator registrator = getRegistrator();

        registrator.register(MainPresenter.class, Scope.SINGLETON);
    }

    public static Injector getInjector() {
        return di;
    }

    public static Registrator getRegistrator() {
        return di;
    }
}
