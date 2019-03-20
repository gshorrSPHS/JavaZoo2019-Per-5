
/**
 * Write a description of class Sarlacc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sarlacc extends Animal implements Flying, Walking
{
    public Sarlacc(String name, String desc)
    {
        super(name, desc);
    }

    @Override
    public String play()
    {
        return "The sarlacc tosses many bodies in the air and juggles them.";
    }

    @Override
    public String eat()
    {
        return "The sarlacc munches on some unfortunate animals that fall in.";
    }

    @Override
    public String makeNoise()
    {
        return "SKreEeEeeeEeeEEEe";
    }
    
    @Override
    public String fly()
    {
        return "What?! The sarlacc is using its tentacles as helicopter wings?!";
    }
    
    @Override
    public String walk()
    {
        return" What?! The sarlacc picked itself out of its hole and moved???";
    }
}
