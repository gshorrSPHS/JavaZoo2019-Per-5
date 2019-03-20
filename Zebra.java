public class Zebra extends Animal implements Walking
{
    public Zebra(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String play()
    {
        return "The zebra runs very fast.";
    }
    
    @Override
    public String makeNoise()
    {
        return "snort snort snort.";
    }
    
    @Override 
    public String eat()
    {
        return "The zebra eats twigs and a variety of grasses as it grazes."; 
    }
    
    @Override
    public String walk()
    {
        return "The zebra runs through the savannas in Africa.";
    }
    
}
