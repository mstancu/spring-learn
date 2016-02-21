//File BirdConfig.java --------------------------
package bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BirdConfig {
    @Bean
    public Bird bird(){
        return new Bird(nest());
    }

    @Bean
    public Nest nest(){
        return new Nest();
    }
}
