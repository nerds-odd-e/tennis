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
        player2Score(1);
        assertEquals("Love Fifteen", game.getScore());
    }

    @Test
    public void fifteen_all_when_both_players_score() throws Exception {
        player1Score(1);
        player2Score(1);
        assertEquals("Fifteen All", game.getScore());
    }

    @Test
    public void deuce_when_both_players_score_three_times() throws Exception {
        deuce();
        assertEquals("Deuce", game.getScore());
    }

    private void deuce() {
        player1Score(3);
        player2Score(3);
    }

    private void player1Score(int times){
        for(int n = 0; n < times; n++){
            game.player1Score();
        }
    }

    private void player2Score(int times){
        for(int n = 0; n < times; n++){
            game.player2Score();
        }
    }
}
