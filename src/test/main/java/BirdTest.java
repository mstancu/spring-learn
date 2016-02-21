//File BirdTest.java -----------------------------
import bird.Bird;
import bird.Shelter;
import bird.Nest;
import static org.mockito.Mockito.*;
import org.junit.Test;
public class BirdTest {

    @Test
    public void testBirdShouldCreateNest(){
        Shelter mockNest = mock(Nest.class);
        Bird firstBird = new Bird(mockNest);
        firstBird.builNest();
        verify(mockNest, times(1)).build();
    }
}
