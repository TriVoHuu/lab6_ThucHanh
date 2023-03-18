package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {
//    @Bean
//    public TextEditor textEditor(){
//        return new TextEditor();
//    }
//
//    @Bean
//    public PlainTextWriter plainTextWriter(){
//        return new PlainTextWriter();
//    }
//
//    @Bean
//    public PdfTextWriter pdfTextWriter() { return  new PdfTextWriter();}
}
