public class DesertYeti extends Yeti
{
    public DesertYeti(String name, String desc)
    {
        super(name, desc);
    }

    @Override
    public String climb()
    {
        return "The yeti stumbles over a tumbleweed.";
    }
    
    @Override
    public String play()
    {
        return "The yeti plays whack-a-mole with the rattlesnakes.";
    }
    
    @Override
    public String makeNoise()
    {
        return "AAAAAAA GO CRAZY AAAAAAA";
    }
    
    @Override
    public String eat()
    {
        return "The yeti sucks the juice from a cactus.";
    }
}
