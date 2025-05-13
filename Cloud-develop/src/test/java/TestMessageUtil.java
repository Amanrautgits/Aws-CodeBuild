import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMessageUtil {

    String message = "Bryan";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage");
        assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage");
        String expectedMessage = "Hi!" + message;
        assertEquals(expectedMessage, messageUtil.salutationMessage());
    }
}
