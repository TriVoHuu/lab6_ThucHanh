package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        TextEditor p1 = (TextEditor) context.getBean(TextEditor.class);
        p1.input("this is a new test");
        p1.save("text");
    }
}
