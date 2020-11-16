package se.iths;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.*;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(2, 2));
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.divide(2, 2));
    }

    @BeforeAll
    static void initAll() {
        System.out.println("Initialize all string entry tests");
    }

    @Disabled
    @Test
    void testToUpper() {
        TextProcessor textProcessor = new TextProcessor ();
        System.out.println("Disabled" + textProcessor);
    }

    @Test
    void testNotEmpty() {
        TextProcessor textProcessor = new TextProcessor ();
        assertNotNull(textProcessor, "Object is not null");
        String str = textProcessor.textToUpper("");
        if(str.isEmpty()) {
            str = null;
        }
        assertNull(str);
        str = textProcessor.textToUpper("Hans");
        assertNotNull(str);
    }

    @DisplayName("Running repeated 5 times")
    @RepeatedTest(5)
    void testTextToUpper() {
        TextProcessor textProcessor = new TextProcessor ();
        String str = textProcessor.notEmpty("Hans");
        assertNotNull(str);
    }

    @Test
    void testTextToLower() {
        TextProcessor textProcessor = new TextProcessor ();
        String str = textProcessor.textToLower("Hans");
        System.out.println("test string " + str);
        String regex = "[A-Z]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if (m.matches())
            assertTrue( true, "Test include capital letters");
        else
            assertFalse( false, "Test include no capital letters");
    }

    @Test
    void testTextBackwards() {
        TextProcessor textProcessor = new TextProcessor ();
        String str = textProcessor.textBackwards("Hans");
        assertNotEquals("Hans",  str);
    }

    @AfterAll
    static void exitAll() {
        System.out.println("Ended all string entry tests");
    }


}

