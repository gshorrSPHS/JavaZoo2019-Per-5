public class AirNomadAppa extends Appa implements Flying
{
    public AirNomadAppa(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String fly()
    {
        return "With a flick of his tail, Appa generates a powerful gust\n"
        + "of air and lifts off! He floats peaceflly overhead.";
    }
}