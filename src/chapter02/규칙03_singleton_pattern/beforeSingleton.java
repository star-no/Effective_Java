package chapter02.규칙03_singleton_pattern;

import java.io.Serializable;

/**
 * Created by star.no
 * on 2017. 2. 6..
 */
public class beforeSingleton implements Serializable {
    private static final beforeSingleton INSTANCE = new beforeSingleton();

    private beforeSingleton() {}

    public static beforeSingleton getInstance() {
        return INSTANCE;
    }

}
