public class Flerken extends Animal implements Swimming, Walking
{
    private String eatenItems;
    public Flerken(String name, String desc){
        super(name, desc);
    }
    
    public String play(){
        return getName() + " played with the a ball of string it spat out.";
    }
    
    public String eat(){
        return getName() + " opens their mouth and tears apart the food with it's tentacles.";
    }
    
    public String makeNoise(){
        return "Mrow";
    }
    
    public String walk(){
        return getName() + " gets up and walks around for a bit, then lays down again.";
    }
    
    public String swim(){
        return "Flerken hate swimming. " + getName() + " refuses to touch the water.";
    }
    
}