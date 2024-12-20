
package balatro.fanmade.entity;


public class Multiplier {
    String name;
    int baseChip;
    int baseMult;
    
    public Multiplier(String name, int baseChip, int baseMult){
        this.name = name;
        this.baseChip = baseChip;
        this.baseMult = baseMult;
    }
    
    public String getName(){
        return name;
    }
    
    public int getbaseChip(){
        return baseChip;
    }
    
    public int getbaseMult(){
        return baseMult;
    }
}
