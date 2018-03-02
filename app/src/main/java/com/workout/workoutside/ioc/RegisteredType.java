package com.workout.workoutside.ioc;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Created by pavel on 17.02.2018.
 */

public class RegisteredType {

    private Class<?> clazz;

    private Scope scope;

    private Object _instance;

    private Object[] params;

    public RegisteredType(Class<?> clazz, Scope scope) {
        this.clazz = clazz;
        this.scope = scope;
    }

    public RegisteredType(Class<?> clazz, Scope scope, Object... params) {
        this.clazz = clazz;
        this.scope = scope;
        this.params = params;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Object get_instance(Class<?>[] types, Object[] params) {
        if (_instance == null || scope.equals(Scope.PROTOTYPE)) {
            newInstance(types, params);
        }

        return _instance;
    }

    private void newInstance(Class<?>[] types, Object[] params) {
        try {
            if (isParamsEmpty(params)) {
                params = this.params;

                if (isParamsEmpty(params)) {
                    _instance = clazz.newInstance();
                    return;
                }
            }

            _instance = clazz.getDeclaredConstructor(types).newInstance(params);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private boolean isParamsEmpty(Object[] params) {
        return params == null || params.length == 0;
    }
}
