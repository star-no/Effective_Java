package chapter03.규칙08_equals_rule.symmetry;

import org.junit.Test;

/**
 * Created by star.no
 * on 2017. 2. 14..
 */
public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        if (s== null)
            throw new NullPointerException();
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
//        if (obj instanceof CaseInsensitiveString)
//            return s.equalsIgnoreCase(
//                    ((CaseInsensitiveString) obj).s);
//        if (obj instanceof String)
//            return s.equalsIgnoreCase((String) obj);
//        return false;
        return obj instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
    }
}
