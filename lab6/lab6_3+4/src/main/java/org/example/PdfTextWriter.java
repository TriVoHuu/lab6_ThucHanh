package org.example;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Component;


@Component
public class PdfTextWriter implements TextWriter{
    public void write(String fileName, String text) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName + ".pdf");
            Document doc = new Document();
            PdfWriter.getInstance(doc, fos);
            doc.open();
            doc.add(new Paragraph(text));
            doc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (DocumentException e) {
            System.out.println("An error occurred while creating PDF document: " + e.getMessage());
        }
    }
}
