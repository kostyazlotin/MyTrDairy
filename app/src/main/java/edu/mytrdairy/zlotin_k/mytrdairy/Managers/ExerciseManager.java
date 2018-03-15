package edu.mytrdairy.zlotin_k.mytrdairy.Managers;

import java.util.ArrayList;

import edu.mytrdairy.zlotin_k.mytrdairy.Objects.Exercise;

public class ExerciseManager {
    private static final ExerciseManager ourInstance = new ExerciseManager();

    public static ExerciseManager getInstance() {
        return ourInstance;
    }

    private ExerciseManager() {
    }


    public void CreateExercise(String name){

    }

    public ArrayList<String> GetExerciseList(){
        return new ArrayList<String>();
    }
}
