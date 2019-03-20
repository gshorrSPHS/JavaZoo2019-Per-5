public class Raccoon extends Animal implements Climbing, Walking, Swimming
{
    public Raccoon(String name, String desc)
    {
        super(name, desc);
    }

    @Override 
    public String play()
    {
        return "The raccoon steals my money then runs away.";
    }
    
    @Override
    public String makeNoise()
    {
        return "RAWRR RAWRRR";
    }
    
    @Override
    public String eat()
    {
        return "The raccoon eats your overpriced $10 hotdog.";
    }
    
    @Override
    public String climb()
    {
     return "The raccoon climbs up the tree with your money.";   
    }
    
    @Override
    public String walk()
    {
        return "The raccoon runs around.";
    }
    
    @Override
    public String swim()
    {
        return "The raccoon waddles around in the pool.";
    }
}
