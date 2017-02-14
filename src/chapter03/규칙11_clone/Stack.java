package chapter03.규칙11_clone;

import java.util.Objects;

/**
 * Created by star.no
 * on 2017. 2. 14..
 */
public class Stack implements Cloneable {
    public Object[] elements;
    private int size;
    private static final int DEFAULF_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULF_INITIAL_CAPACITY];
    }
    // ... 생략 ...

    public Stack wrongClone() throws CloneNotSupportedException {
        return (Stack) super.clone();
    }

    @Override
    public Stack clone() throws CloneNotSupportedException {
        // return super.clone();
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
