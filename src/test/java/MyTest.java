import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MyTest {

    @Test
    void testNegative() {
        MathService mathService = new MathService();
        Assertions.assertThrows(NotFoundAnswerException.class, () -> mathService.getAnswer(15, 23, 45));
    }

    @ParameterizedTest
    @CsvSource({"-1,2,3,16", "10,122,33,13564", "4,17,10,129"})
    void testPositive(int a, int b, int c, int d) throws NotFoundAnswerException {
        MathService mathService = new MathService();
        Assertions.assertDoesNotThrow(() -> mathService.getAnswer(-1, 2, 3));
        Assertions.assertEquals(mathService.getD(a,b,c),d);
    }
}
