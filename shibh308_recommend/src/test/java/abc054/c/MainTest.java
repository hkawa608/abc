package abc054.c;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    @Test
    public void test1() {
        String input = "3 3\n" +
                "1 2\n" +
                "1 3\n" +
                "2 3";
        String expected = "2";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test2() {
        String input = "7 7\n" +
                "1 3\n" +
                "2 7\n" +
                "3 4\n" +
                "4 5\n" +
                "4 6\n" +
                "5 6\n" +
                "6 7";
        String expected = "1";

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
