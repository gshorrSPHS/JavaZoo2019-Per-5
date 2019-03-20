public class SpaceDolphin extends Dolphin implements Walking
{
    private int oxygenRemaining;
    
    public SpaceDolphin(String name, String desc, int oxygen)
    {
        super(name, desc);
        oxygenRemaining = oxygen;
    }
    
    @Override 
    public String fly()
    {
        return "The dolphin zooms around in its water-filled space-shuttle.";
    }
    
    @Override
    public String walk()
    {
        oxygenRemaining--;
        return "The dolphin stomps around in its mech suit.\n" +
                "It has " + oxygenRemaining + " units of oxygen left.";
    }
}
