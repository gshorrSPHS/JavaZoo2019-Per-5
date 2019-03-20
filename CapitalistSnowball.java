
/**
 * Write a description of class CapitalistSnowball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CapitalistSnowball extends Snowball implements Flying
{
    int capitalistScumLevels = 0; 
    public CapitalistSnowball(String name, String desc, int capitalistScumLevels)
    {
        super(name,desc);
        this.capitalistScumLevels = capitalistScumLevels;
    }
    @Override
    public String play()
    {
        return "Snowball the pig says runs from dogs";
    }
    @Override
    public String makeNoise()
    {
        return "Ay blyat comrade";
    }
    @Override
    public String eat()
    {
        return "Ay blyat comrade";
    
    }
    public String walk()
    {
        return "Trootsky trips over";   
    }
    public String fly()
    {
       return "Capitalist Snowball uses his CapitalistScumBag levels to fly at " + capitalistScumLevels + "mp/h"; 
    }
}
