public class FlyingKraken extends Kraken implements Flying
{
    public FlyingKraken(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String play()
    {
        return "The Kraken is released!";
    }
    
    @Override 
    public String makeNoise()
    {
        return "Roar!";
    }
    
    @Override
    public String eat()
    {
        return "Munch! The FlyingKraken destroys the ship!";
    }
    
    @Override
    public String fly()
    {
        return "The FlyingKraken flew over the ship!";
    }
}

















