public class Navi extends Animal implements Swimming, Flying, Walking, Climbing
{
    public Navi(String name, String desc)
    {
        super(name,desc);
    }
    
    @Override
    public String play()
    {
        return "Na'vi attempts to kill you in its confusion of an alien race.";
    }
    
    @Override
    public String makeNoise()
    {
        return "* Hisses in Na'vi *";
    }
    
    @Override
    public String eat()
    {
        return "grabs a spear and bow, hops on its banshee, and goes hunting";
    }
    
    @Override 
    public String swim()
    {
        return "cannonballs into the nearest pond";
    }
    
    @Override 
    public String fly()
    {
        return "Makes the mind connection with its banshee and leaps into the air.";
    }  

    @Override 
    public String walk()
    {
        return "Walks around its habitat.";
    }  
    
    @Override 
    public String climb()
    {
        return "Climbs the nearest vines.";
    }  
}
