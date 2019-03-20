public class GoldenDragon extends Dragon
{
    public GoldenDragon(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String fly()
    {
        return "The golden dragon's wings flap simultaneously \n" +
                "in a straight line. The gold is glorious.";
    }
}