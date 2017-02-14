package chapter03.규칙11_clone;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Hashtable;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by star.no
 * on 2017. 2. 14..
 */
public class StackTest {

    @Test
    public void test_stack_clone() throws Exception {
        Stack origin = new Stack();
        Stack correctClone = origin.clone();

        if (origin == correctClone || origin.elements == correctClone.elements) {
            throw new Exception();
        }
    }

    @Test
    public void test_stack_wrongclone() throws Exception {
        Stack origin = new Stack();
        Stack incorrectClone = origin.wrongClone();

        // 통과되지만...
        if (origin == incorrectClone) {
            throw new Exception();
        }
        // 실패
        if (origin.elements == incorrectClone.elements) {
            throw new Exception();
        }
    }

    @Test
    public void test_01() {
        Hashtable<String, String> hashtable = new Hashtable<>();

        String key = "i-am-key";
        String value = new String("i-am-value");

        hashtable.put(key, value);

        //value = new String("i-am-value");
        String returnValue;
        returnValue = hashtable.get(key);

        if (value == returnValue) {
            System.out.println("value와 returnValue 객체가 같다.");
        } else {
            System.out.println("value와 returnValue 객체가 다르다.");
        }

        Hashtable<String, String> cloneTable = (Hashtable<String, String>) hashtable.clone();
        returnValue = cloneTable.get(key);
        if (value == returnValue) {
            System.out.println("value와 returnValue 객체가 같다.");
        } else {
            System.out.println("value와 returnValue 객체가 다르다.");
        }
    }

    @Test
    public void test_02() {
        Hashtable<String, myClass> hashtable = new Hashtable<>();

        String key = "i-am-key";
        myClass value = new myClass("i-am-value");

        hashtable.put(key, value);

        Hashtable<String, myClass> cloneTable = (Hashtable<String, myClass>) hashtable.clone();

        //-------
        myClass returnValue = hashtable.get(key);
        returnValue.str="i-am-not-value";

        // 깊은 복사가 이루어지지 않고 있다.
        assertThat(hashtable.get(key).str.equals("i-am-not-value"), is(Boolean.TRUE));
        assertThat(cloneTable.get(key).str.equals("i-am-value"), is(Boolean.TRUE));
    }
    @Test
    public void test_03() {
        ArrayList<myClass> origin = new ArrayList<>();

        myClass value = new myClass("i-am-value");

        origin.add(value);

        ArrayList<myClass> clone = (ArrayList<myClass>) origin.clone();

        //-------
        myClass returnValue = origin.get(0);
        returnValue.str="i-am-not-value";

        // 깊은 복사가 이루어지지 않고 있다.
        System.out.println(origin.get(0).str);
        System.out.println(clone.get(0).str);

    }
}
class myClass {
    public String str;

    public myClass() {
    }

    public myClass(String str) {
        this.str = str;
    }
}