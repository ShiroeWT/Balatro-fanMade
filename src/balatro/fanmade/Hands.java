
package balatro.fanmade;

import balatro.fanmade.entity.Effect;
import balatro.fanmade.entity.Multiplier;
import java.util.ArrayList;


public class Hands {
    public ArrayList<Multiplier> pokerHands = new ArrayList<>();
    {
        pokerHands.add(new Multiplier("Straight Flush", 100, 8));
        pokerHands.add(new Multiplier("Four of a Kind", 60, 7));
        pokerHands.add(new Multiplier("Full House", 40, 4));
        pokerHands.add(new Multiplier("Flush", 35, 4));
        pokerHands.add(new Multiplier("Straight", 30, 4));
        pokerHands.add(new Multiplier("Three of a Kind", 30, 3));
        pokerHands.add(new Multiplier("Two Pair", 20, 2));
        pokerHands.add(new Multiplier("Pair", 10, 2));
        pokerHands.add(new Multiplier("High Card", 5, 1));
    }
    
    
}
