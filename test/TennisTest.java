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
        player1Score(1);
        assertEquals("Fifteen Love", game.getScore());
    }

    @Test
    public void thirty_love_after_player1_scores_twice() throws Exception {
        player1Score(2);
        assertEquals("Thirty Love", game.getScore());
    }

    @Test
    public void forty_love_after_player1_scores_three_times() throws Exception {
        player1Score(3);
        assertEquals("Forty Love", game.getScore());
    }

    @Test
    public void love_fifteen_after_player2_scores() throws Exception {
        game.player2Score();
        assertEquals("Love Fifteen", game.getScore());
    }

    private void player1Score(int times){
        for(int n = 0; n < times; n++){
            game.player1Score();
        }
    }
}
