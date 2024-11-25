package delft;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericClassTest {

    @Test
    void testDoStuff() {
        // Arrange: Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            // Act: Call the method
            GenericClass.doStuff();

            // Assert: Capture the output and compare it exactly
            String output = outputStream.toString(); // Do not trim
            System.out.println("Captured output: '" + output + "'"); // Debugging
            assertEquals("    ", output); // Expect four spaces
        } finally {
            // Restore original System.out to avoid side effects
            System.setOut(originalOut);
        }
    }
}
