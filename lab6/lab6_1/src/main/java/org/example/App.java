package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");

        Product p1 = (Product) context.getBean("product");
        Product p2 = (Product) context.getBean("product2");
        Product p3 = (Product) context.getBean("product3");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());
    }
}
