import com.odde.tennis.Tennis;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {
    private Tennis game = new Tennis();

    @Test
    public void love_all(){
        assertEquals("Love All", game.getScore());
    }

    @Test
    public void fifteen_love_after_player1_scores() throws Exception {
        game.player1Score();
        assertEquals("Fifteen Love", game.getScore());
    }

    @Test
    public void Thirty_love_after_player1_scores_twice() throws Exception {
        game.player1Score();
        game.player1Score();
        assertEquals("Thirty Love", game.getScore());
    }
}
