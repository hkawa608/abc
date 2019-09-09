package abc140.b;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    @Test
    public void test1() {
        String input = "3\n" +
                "3 1 2\n" +
                "2 5 4\n" +
                "3 6";
        String expected = "14";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test2() {
        String input = "4\n" +
                "2 3 4 1\n" +
                "13 5 8 24\n" +
                "45 9 15";
        String expected = "74";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test3() {
        String input = "2\n" +
                "1 2\n" +
                "50 50\n" +
                "50";
        String expected = "150";

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
