public class Goose extends Flerken implements Climbing
{
    private int tesseractsEaten;
    public Goose(){
        super("Goose", "Captain Marvel's Flerken Friend");
        tesseractsEaten = 1;
    }
    
    public String climb(){
        return "Goose climbs up a wall with a few hops";
    }
}