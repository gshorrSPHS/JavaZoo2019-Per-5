public class Godzilla extends Animal implements Swimming, Flying, Walking, Climbing
{
    private int x;
    public Godzilla(String name, String desc)
    {
        super(name, desc);
    }

    @Override
    public String play()
    {
        return "GODZILLA destroys toy buidlings the zoo provided for it.";
    }

    @Override
    public String makeNoise()
    {
        return "* classic Godzilla roar *";
    }

    @Override
    public String eat()
    {
        return "Godzilla grabs a nearby cannister of nuclear engery and swollows it whole.";    
    }
    
    @Override
    public String swim()
    {
        return "Dives into the nearest largest body of water and swims around, only its spines can be seen wading the water.";
    }
    
    @Override
    public String fly()
    {
        return "Godzilla looks up at the sky enviously.";
    }
    
    @Override
    public String walk()
    {
        return "The loud stomps of its mighty foot makes the ground tremor with each step.";
    }
    
    @Override
    public String climb()
    {
        return "Godzilla feels no reason to climb a wall like pitful creatures.";
    }
}