public class FirePhoenix extends Phoenix implements Swimming
{
    
    public FirePhoenix(String name, String desc)
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
    
    @Override
    public String swim()
    {
        return "The phoenix swims to put out the fire on him";
    }
}
