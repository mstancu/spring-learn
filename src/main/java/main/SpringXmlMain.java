// File SpringXmlMain.java ------------------------
package main;

import bird.Bird;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bird.xml");
        Bird bird = context.getBean(Bird.class);
        bird.builNest();
        context.close();
    }
}
