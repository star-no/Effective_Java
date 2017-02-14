package chapter02.규칙03_singleton_pattern;

import java.io.Serializable;

/**
 * Created by star.no
 * on 2017. 2. 6..
 */
public class beforeSingleton implements Serializable {
    private static beforeSingleton INSTANCE;

    private beforeSingleton() {
    }

    public static beforeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new beforeSingleton();
        }
        return INSTANCE;
    }

}
