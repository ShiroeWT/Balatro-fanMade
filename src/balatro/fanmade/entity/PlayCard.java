
package balatro.fanmade.entity;


public class PlayCard extends Card {
    private int chip = 0;
    private int multiplier = 0;
    private int effect = 0;
    public PlayCard(String name, int chip, int effect){
        super(name);
        this.chip = chip;
        this.effect = effect;
    }
    
    
    //for default (debugging only)
    public PlayCard(){
        super("default");
        this.chip = 0;
        this.multiplier = 1;
        this.effect = 2;
    }
    
    public String getName(){
        return name;
    }
    
    public int getChip(){
        return chip;
    }
}
