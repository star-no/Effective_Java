package chapter03.규칙08_equals_rule.transitivity;

import java.awt.*;

/**
 * Created by star.no
 * on 2017. 2. 14..
 */
public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // 대칭성이 위반된 equals
    public boolean equals(Object obj) {
        if (!(obj instanceof ColorPoint))
            return false;
        return super.equals(obj) && ((ColorPoint) obj).color == color;
    }

    // 추이성이 위반된 equals
    public boolean equals_2(Object obj) {
        if (!(obj instanceof Point))
            return false;

        if (!(obj instanceof ColorPoint))
            return obj.equals(this);

        return super.equals(obj) && ((ColorPoint) obj).color == color;
    }
}
