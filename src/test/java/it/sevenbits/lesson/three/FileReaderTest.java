package it.sevenbits.lesson.three;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FileReaderTest {

    @Before
    public void setUp() {

    }

    @Test
    public void testReadLine() throws IOException {
        File dir = new File(".");
        File file = new File(dir, "MyHomework.txt ");
        FileReader filereader = new FileReader(file);
        assertEquals("wrong result", "MyHomework.txt line 1: .", filereader.readLine());
    }
}
