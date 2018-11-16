package it.sevenbits.lesson.three;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ExampleTest {
    private FileReader mockFileReader;
    private Example example;

    @Before
    public void setUp(){
        mockFileReader = mock(FileReader.class);
        example = new Example();
    }

    @Test
    public void testGetLongestLineCharsCountEqualLines() throws IOException {
        when(mockFileReader.readLine()).thenReturn("a", "a", "a");
        when(mockFileReader.hasLine()).thenReturn(true, true, true, false);
        assertEquals("wrong result", 1,
                example.getLongestLineCharsCount(mockFileReader));
    }

    @Test
    public void testGetLongestLineCharsCountEmptyLines() throws IOException {
        when(mockFileReader.readLine()).thenReturn("", "", "");
        when(mockFileReader.hasLine()).thenReturn(true, true, true, false);
        assertEquals("wrong result", 0,
                example.getLongestLineCharsCount(mockFileReader));
    }
}
