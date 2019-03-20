public class Dolphin extends Animal implements Swimming, Flying
{
    public Dolphin(String name, String desc)
    {
        super(name, desc);
    }
    
       @Override 
    public String play()
    {
        return "The dolphin blows rings of air and swims through them.";
    }
    
    @Override
    public String makeNoise()
    {
        return "EeeEeeeEeeEee";
    }
    
    @Override
    public String eat()
    {
        return "The dolphin rises out of the water and opens\n"+
               " it's mouth for fish.";
    }
    
    @Override
    public String swim()
    {
        return "The dolphin does a barrel roll in water.";
    }
    
    @Override
    public String fly()
    {
        return "The dolphin does a barrel roll in the air.";
    }
}




