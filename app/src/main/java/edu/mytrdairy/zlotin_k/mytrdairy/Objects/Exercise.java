package edu.mytrdairy.zlotin_k.mytrdairy.Objects;

/**
 * Created by zlotin_k on 15.03.2018.
 */

public class Exercise {
    private String key;
    private String name;

    public Exercise(String n){
        name = n;
        key = Exercise.GetHashKey(n);
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public static String GetHashKey(String k){
        return k.toLowerCase().replaceAll(" ", "");
    }
}
