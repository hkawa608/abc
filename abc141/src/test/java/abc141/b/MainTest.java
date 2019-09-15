package abc141.b;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    @Test
    public void test1() {
        String input = "RUDLUDR";
        String expected = "Yes";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test2() {
        String input = "DULL";
        String expected = "No";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test3() {
        String input = "UUUUUUUUUUUUUUU";
        String expected = "Yes";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test4() {
        String input = "ULURU";
        String expected = "No";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test5() {
        String input = "RDULULDURURLRDULRLR";
        String expected = "Yes";

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
