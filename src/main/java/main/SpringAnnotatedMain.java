// File SpringAnnotatedMain.java ---------------------------
package main;
import bird.Bird;
import bird.BirdConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SpringAnnotatedMain {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BirdConfig.class);
        Bird bird = context.getBean(Bird.class);
        bird.builNest();
        context.close();
    }
}
