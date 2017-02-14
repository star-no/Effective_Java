package chapter03.규칙08_equals_rule.symmetry;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by star.no
 * on 2017. 2. 14..
 */
public class CaseInsensitiveStringTest {

    @Test
    public void 대칭성_위반() {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);



        assertThat(cis.equals(s), is(Boolean.TRUE));
        // False가 나온다
        assertThat(s.equals(cis), is(Boolean.FALSE));
    }
}