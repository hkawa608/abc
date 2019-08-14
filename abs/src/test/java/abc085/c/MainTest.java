package abc085.c;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    @Test
    public void test1() {
        String input = "9 45000";
        String expected = "4 0 5";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test2() {
        String input = "20 196000";
        String expected = "-1 -1 -1";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test3() {
        String input = "1000 1234000";
        String expected = "14 27 959";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test4() {
        String input = "2000 20000000";
        String expected = "2000 0 0";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }


    private String execute(String input) {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        Main.solve(
                new ByteArrayInputStream(input.getBytes()), new PrintStream(os)
        );
        return os.toString().replace(System.lineSeparator(), "\n");
    }
}
