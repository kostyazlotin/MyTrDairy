package edu.mytrdairy.zlotin_k.mytrdairy.Managers;

import java.util.ArrayList;
import java.util.HashMap;

import edu.mytrdairy.zlotin_k.mytrdairy.Objects.Exercise;

public class ExerciseManager {
    private HashMap<String, Exercise> exList;

    private static final ExerciseManager ourInstance = new ExerciseManager();

    public static ExerciseManager getInstance() {
        return ourInstance;
    }

    private ExerciseManager() {
        exList = new HashMap<>();
    }


    public void CreateExercise(String name){
        String key = Exercise.GetHashKey(name);
        if (exList.keySet().contains(key)){
            return;
        }
        exList.put(key, new Exercise(name));
    }

    public ArrayList<String> GetExerciseList(){
        ArrayList<String> rv = new ArrayList<String>();
        for (String k: exList.keySet()) {
            rv.add(exList.get(k).getName());
        }
        return rv;
    }
}
