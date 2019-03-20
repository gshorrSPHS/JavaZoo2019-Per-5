public class KillerBunny extends Bunny
{
    public KillerBunny()
    {
        super("Chainsaw Bunny", "BEWARE");
    }
    
    @Override
    public String makeNoise()
    {
        return "GRRRRRRRRRR";
    }
    
    @Override
    public String play()
    {
        return "The bunny hits a small ball with its chainsaw and pops it.";
    }
    
    @Override
    public String walk()
    {
        return "The bunny runs on two feet, chasing after its prey.";
    }
}