/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package unittestdemo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AppTest {
    @Test public void testAppUsesGreetingGenerator() {
        // Arrange
        GreetingGenerator mockGreetingGenerator = mock(GreetingGenerator.class); 
        App classUnderTest = new App(mockGreetingGenerator); 

        // Act
        classUnderTest.getGreeting(); 

        // Assert
        verify(mockGreetingGenerator).getGreeting(); 
    }
}
