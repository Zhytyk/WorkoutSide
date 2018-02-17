package com.workout.workoutside.ioc;

import com.workout.workoutside.ioc.api.Injector;
import com.workout.workoutside.ioc.api.Registrator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pavel on 17.02.2018.
 */

public class DI implements Injector, Registrator {

    private List<RegisteredType> types;

    {
        types = new ArrayList<>();
    }

    @Override
    public void register(Class<?> clazz, Scope scope) {
        types.add(new RegisteredType(clazz, scope));
    }

    @Override
    public void register(Class<?> clazz, Scope scope, Object... params) {
        types.add(new RegisteredType(clazz, scope, params));
    }

    @Override
    public <T> T getInstance(Class<?> clazz, Object... params) {
        for (RegisteredType type : types) {
            if (type.getClazz().equals(clazz)) {
                return (T) type.get_instance(params);
            }
        }

        return null;
    }
}
