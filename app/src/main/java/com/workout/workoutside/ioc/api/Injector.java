package com.workout.workoutside.ioc.api;

/**
 * Created by pavel on 17.02.2018.
 */

public interface Injector {
    <T> T getInstance(Class<?> clazz, Class<?>[] paramTypes, Object... params);

    <T> T getInstance(Class<?> clazz, Class<?> paramType, Object param);
}
