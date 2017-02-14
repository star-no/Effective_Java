package chapter03.규칙08_equals_rule.transitivity;

import java.awt.*;

/**
 * Created by star.no
 * on 2017. 2. 14..
 */
public class NewColorPoint {
    private final Point point;
    private final Color color;

    public NewColorPoint(int x, int y, Color color) {
        if (color == null)
            throw new NullPointerException();
        this.point = new Point(x, y);
        this.color = color;
    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof NewColorPoint))
            return false;
        NewColorPoint cp = (NewColorPoint) obj;
        return cp.point.equals(point) && cp.color.equals(color);
    }

}
