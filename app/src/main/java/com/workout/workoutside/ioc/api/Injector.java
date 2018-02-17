package com.workout.workoutside.ioc.api;

/**
 * Created by pavel on 17.02.2018.
 */

public interface Injector {
    <T> T getInstance(Class<?> clazz, Object... params);
}
