
public class Hummingbird extends Animal implements Flying
{
    public Hummingbird(String name, String desc)
    {
        super(name, desc);
        
    }
    
    @Override
    public String fly()
    {
        return "The bird flying rapidly up and down";
        
    }
    
    @Override
    public String play()
    {
        return "The bird finds a friend and wrestles him in the air.";
    }
    
    @Override
    public String makeNoise()
    {
        return "brr";
    }
    
    @Override
    public String eat()
    {
        return "VietNomnomnomnom";
    }
}
