package org.example;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@Component
public class PlainTextWriter implements TextWriter{
    public void write(String fileName, String text) {
        try {
            FileWriter writer = new FileWriter(fileName + ".txt");
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }
    }
}
