package com.webappclouds.workoutadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindWorkoutActivity extends Activity {

    private WorkoutExpert expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickFindWorkout(View view) {
        TextView workouts = findViewById(R.id.workout);

        Spinner workoutType = findViewById(R.id.workoutType);

        String workout = String.valueOf(workoutType.getSelectedItem());

        //workouts.setText(workout);
        List<String> workoutList = expert.getWorkouts(workout);

        StringBuilder workoutsFormatted = new StringBuilder();

        for (String work : workoutList){
            workoutsFormatted.append(work).append('\n');
        }

        workouts.setText(workoutsFormatted);
    }
}
