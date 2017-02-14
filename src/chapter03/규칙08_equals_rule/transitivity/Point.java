package chapter03.규칙08_equals_rule.transitivity;

/**
 * Created by star.no
 * on 2017. 2. 14..
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof  Point))
            return false;
        Point p = (Point) obj;
        return p.x == x && p.y == y;
    }

}
