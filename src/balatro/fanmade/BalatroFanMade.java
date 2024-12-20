
package balatro.fanmade;
import balatro.fanmade.GamePlay.HandList;
import balatro.fanmade.GamePlay.PlayBoard;
import balatro.fanmade.entity.PlayCard;
import java.util.ArrayList;
import javax.swing.JFrame;

public class BalatroFanMade {

    public static void main(String[] args) {
        ArrayList<PlayCard> deck = new ArrayList<>();
        Hands hand = new Hands();
        for (int i = 0; i < hand.pokerHands.size(); i++) {
            System.out.println(hand.pokerHands.get(i));
            
        }
        
        PlayBoard play = new PlayBoard();
        
    }
    
}
