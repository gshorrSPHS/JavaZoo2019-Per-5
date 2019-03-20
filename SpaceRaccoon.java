public class SpaceRaccoon extends Raccoon implements Flying
{
    private int awesomenessLevel;
    public SpaceRaccoon(int awesomenessLevel)
    {
        super("Rocket","A genetically altered raccoon with the mind of a mad scientist.");
        this.awesomenessLevel = awesomenessLevel;
    }

    @Override
    public String fly()
    {
        return "Rocket the raccoon puts on his space suit and explores the galaxy.";
    }

    @Override 
    public String play()
    {
        return "Rocket the raccoon starts building a bomb with alien scrap metal.";
    }

    @Override
    public String makeNoise()
    {
        return "PEW PEW PEW";
    }

    @Override
    public String eat()
    {
        return "Rocket starts chewing on Baby Groot.";
    }

    @Override
    public String climb()
    {
        return "Rocket climbs the mountain with his exo skeleton.";   
    }

    @Override
    public String walk()
    {
        return "Rocket the raccoon walks on his hind legs holding his stun launcher.";
    }

    @Override
    public String swim()
    {
        return "Rocket surfs the waves with his rocket surf board.";
    }
    
    public int returnAwesomenessLevel()
    {
        return this.awesomenessLevel;
    }
}