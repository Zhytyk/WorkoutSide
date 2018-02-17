package com.workout.workoutside.models;

import com.workout.workoutside.models.abstracts.AbstractModel;

import java.util.List;

/**
 * Created by pavel on 17.02.2018.
 */

public class Schedule extends AbstractModel {

    private String title;

    private List<ExecutedExercise> exercises;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ExecutedExercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<ExecutedExercise> exercises) {
        this.exercises = exercises;
    }
}
