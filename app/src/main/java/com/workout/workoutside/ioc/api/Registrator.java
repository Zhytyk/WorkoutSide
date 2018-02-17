package com.workout.workoutside.ioc.api;

import com.workout.workoutside.ioc.Scope;

/**
 * Created by pavel on 17.02.2018.
 */

public interface Registrator {

    void register(Class<?> clazz, Scope scope);

    void register(Class<?> clazz, Scope scope, Object... params);

}
