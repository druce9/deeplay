import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @RepeatedTest(100)
    public void test_human() {
        // test Human
        Random random = new Random();
        String generatedString = random.ints(80, 88)
                .filter(i -> (i == 80 || i == 83 || i == 84 || i == 87))
                .limit(16)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        assertEquals(Dijkstra.dijkstra(generatedString, "Human"),
                Solution.getResult(generatedString, "Human"));
    }

    @RepeatedTest(100)
    public void test_swamper() {
        // test Swamper
        Random random = new Random();
        String generatedString = random.ints(80, 88)
                .filter(i -> (i == 80 || i == 83 || i == 84 || i == 87))
                .limit(16)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        assertEquals(Dijkstra.dijkstra(generatedString, "Swamper"),
                Solution.getResult(generatedString, "Swamper"));
    }

    @RepeatedTest(100)
    public void test_woodman() {
        // test Woodman
        Random random = new Random();
        String generatedString = random.ints(80, 88)
                .filter(i -> (i == 80 || i == 83 || i == 84 || i == 87))
                .limit(16)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        assertEquals(Dijkstra.dijkstra(generatedString, "Woodman"),
                Solution.getResult(generatedString, "Woodman"));
    }
}

