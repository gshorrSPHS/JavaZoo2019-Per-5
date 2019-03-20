public class SpaceZebra extends Zebra
{
    private int oxygenRemaining;
    
    public SpaceZebra(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String walk()
    {
        return "The zebra runs.";
    }
}
