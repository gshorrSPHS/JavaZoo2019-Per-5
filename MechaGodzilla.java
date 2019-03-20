public class MechaGodzilla extends Godzilla
{
    private int x;
    public MechaGodzilla(String name, String desc)
    {
        super(name, desc);
    }

    @Override
    public String play()
    {
        return "play fights Godzilla.";
    }

    @Override
    public String makeNoise()
    {
        return "* robotic MechaGodzilla roar *";
    }

    @Override
    public String eat()
    {
        return "MechaGodzilla charges nuclear reactor.";    
    }
    
    @Override
    public String swim()
    {
        return "Dives into the nearest body of water.";
    }
    
    @Override
    public String fly()
    {
        return "MechaGodzilla looks up and thinks of ways he could upgrade to fly.";
    }
    
    @Override
    public String walk()
    {
        return "The loud metallic stomps of its mighty foot makes the ground tremor with each step.";
    }
    
    @Override
    public String climb()
    {
        return "MechaGodzilla feels no reason to climb a walls like pitful creatures.";
    }
}