import com.odde.tennis.Tennis;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {
    @Test
    public void love_all(){
        Tennis game = new Tennis();
        assertEquals("Love All", game.getScore());
    }
}
