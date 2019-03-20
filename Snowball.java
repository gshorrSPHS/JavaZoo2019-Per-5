
public class Snowball extends Animal implements Walking
{
    
    public Snowball(String name, String desc        )
    {
        super(name,desc);
        
    }
    @Override
    public String play()
    {
        return "Snowball the pig says runs from dogs";
    }
    @Override
    public String makeNoise()
    {
        return "Ay blyat comrade";
    }
    @Override
    public String eat()
    {
        return "Ay blyat comrade";
    
    }
    public String walk()
    {
        return "Trootsky trips over";   
    }
}
