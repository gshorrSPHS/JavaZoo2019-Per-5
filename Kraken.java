public class Kraken extends Animal implements Swimming, Climbing, Flying
{
    public Kraken(String name, String desc)
    {
        super(name, desc);
    }
     
    @Override
    public String play()
    {
        return "The Kraken is released.";
    }
    
    @Override 
    public String makeNoise()
    {
        return "Roar!";
    }
    
    @Override
    public String eat()
    {
        return "Munch!";
    }
    
    @Override 
    public String swim()
    {
        return "The Kraken swims to the ship.";
    }
    
    @Override
    public String climb()
    {
        return "The Kraken climbs over the ship.";
    }
    
    @Override
    public String fly()
    {
        return "The Kraken flew over the ship!";
    }
    
}















