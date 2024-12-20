
public class Card {
    String name = "default";
    
    Card(String name){
        this.name = name;
    }
}

class PlayCard extends Card{
    int chip = 0;
    int multiplier = 0;
    int effect = 0;
    PlayCard(String name, int chip, int multiplier, int effect){
        super(name);
        this.chip = chip;
        this.multiplier = multiplier;
        this.effect = effect;
    }
}

class Joker extends Card{
    int effect = 0;
    Joker(String name, int effect){
        super(name);
        this.effect = effect;
    }
}
