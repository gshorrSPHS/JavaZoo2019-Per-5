public class Appa extends Animal implements Walking, Swimming
{
    public Appa (String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String play()
    {
       return "Appa bounces after bubbles, chuffing with joy.";
    }
    
    @Override
    public String makeNoise()
    {
        return "\"Appa, Yip Yip!\" ROOAAAARRRRRRR";
    }
    
    @Override
    public String eat()
    {
        return "Appa the Flying Bison eats watermelon with Team Avatar\n"
       + "and Momo, the winged lemur.";
    }
    
    @Override
    public String walk()
    {
        return "Appa takes a tranquil stroll, sniffing the\n"
               + "fine pine trees and sweet-smelling roses.";
    }
    
    @Override
    public String swim()
    {
        return "Appa bounds into the clear, blue stream,\n"
               + "splashing around happily.";
    }
}

