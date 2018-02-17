package com.workout.workoutside.models;

import com.workout.workoutside.models.abstracts.AbstractModel;

import java.util.List;

/**
 * Created by pavel on 17.02.2018.
 */

public class Week extends AbstractModel {

    private int number;

    private List<Week> weeks;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Week> getWeeks() {
        return weeks;
    }

    public void setWeeks(List<Week> weeks) {
        this.weeks = weeks;
    }
}
