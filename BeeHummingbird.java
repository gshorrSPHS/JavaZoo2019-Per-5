
public class BeeHummingbird extends Hummingbird implements Flying
{
    private int sizeInCentimeters;
    
    public BeeHummingbird(String name, String desc, int size)
    {
        super(name, desc);
         sizeInCentimeters = size;
        
    }
    
   
    
    @Override
    public String play()
    {
        return "Little bird flys into your ear and nests.";
    }
    
    @Override
    public String makeNoise()
    {
        return "meeeeeeeeeeeep";
    }
    
  
}

