package edu.mytrdairy.zlotin_k.mytrdairy.Managers;

import edu.mytrdairy.zlotin_k.mytrdairy.Objects.Training;

public class TrainingManager {
    private static final TrainingManager ourInstance = new TrainingManager();

    public static TrainingManager getInstance() {
        return ourInstance;
    }

    private TrainingManager() {
    }
}
