public class Rock extends Animal implements Walking
{
    public Rock(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String play()
    {
        return "Brock the rock makes the UwU face, then decides to cosplay as Belle Delphine.";
    }
    
    @Override
    public String makeNoise()
    {
        return "Silence.";
    }
    
    @Override
    public String eat()
    {
        return "Brock eats a meme.";
    }
    
    @Override
    public String walk()
    {
        return "Brock can't walk because ya know, he's a rock.";
    }
}   
