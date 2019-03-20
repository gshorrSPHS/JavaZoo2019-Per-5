public class Phoenix extends Animal implements Flying, Walking
{
    
    public Phoenix(String name, String desc)
    {
        super(name, desc);
    }

    @Override
    public String play()
    {
        return "The Phoenix dives towards other animals to scare them.";
    }
    
    @Override
    public String makeNoise()
    {
        return "WwwwwWwwwwWwwwwWwwww";
    }
    
    @Override
    public String eat()
    {
        return "The Phoenix lands to eat";
    }
    
    @Override
    public String fly()
    {
        return "The phoenix opens the wings and fly upwards";
    }
    
    @Override
    public String walk()
    {
        return "The phoenix closes the wings";
    }
}

