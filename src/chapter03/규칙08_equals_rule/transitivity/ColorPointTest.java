package chapter03.규칙08_equals_rule.transitivity;

import org.junit.Test;

import java.awt.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by star.no
 * on 2017. 2. 14..
 */
public class ColorPointTest {

    @Test
    public void test_01() {
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);

        // 대칭성 위반
        assertThat(p.equals(cp), is(Boolean.TRUE));
        assertThat(cp.equals(p), is(Boolean.FALSE));
    }

    @Test
    public void test_02() throws Exception {
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLACK);

        // 추이성 위반
        assertThat(p1.equals_2(p2), is(Boolean.TRUE));
        assertThat(p2.equals(p3), is(Boolean.TRUE));
        assertThat(p1.equals(p3), is(Boolean.FALSE));
    }
}