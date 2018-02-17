package com.workout.workoutside.models;

/**
 * Created by pavel on 17.02.2018.
 */

public class ExecutedExercise extends Exercise {

    private int iterations;

    private long rest;

    private boolean done;

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public long getRest() {
        return rest;
    }

    public void setRest(long rest) {
        this.rest = rest;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
