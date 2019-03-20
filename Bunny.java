public class Bunny extends Animal implements Walking, Climbing, Swimming
{
    public Bunny(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String eat()
    {
        return "The bunny begins to nibble on a carrot, but soon \n"
        + "gets tired of nibbling and bites into the carrot.";
    }
    
    @Override
    public String makeNoise()
    {
        return "Woof";
    }
    
    @Override
    public String play()
    {
        return "The bunny hits a small ball with its nose and chases \n"
        + "it around.";
    }
    
    @Override
    public String walk()
    {
        return "The bunny hops around in joy, chasing a dandelion \n"
        + " that was blown by the wind.";
    }
    
    @Override
    public String climb()
    {
        return "The bunny climbs onto a low branch that bears fruit.";
    }
    
    @Override
    public String swim()
    {
        return "The bunny swims elegantly in the water with its small webbings.";
    }
}