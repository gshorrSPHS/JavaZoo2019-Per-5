public class Yeti extends Animal implements Climbing
{
    public Yeti(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String play()
    {
        return "The yeti snowboards down Mount Everest.";
    }
     
    @Override
    public String makeNoise()
    {
        return "AaWooRaOOO";
    }
    
    @Override
    public String eat()
    {
        return "The yeti feasts on the flesh of a mountain goat.";
    }
    
    @Override
    public String climb()
    {
        return "The yeti uses its claws to go up the mountain.";
    }
}

