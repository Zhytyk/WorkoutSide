package com.workout.workoutside.models;

import com.workout.workoutside.models.abstracts.AbstractModel;

/**
 * Created by pavel on 17.02.2018.
 */

public class Day extends AbstractModel {

    private String name;

    private Schedule schedule;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
