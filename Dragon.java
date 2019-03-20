public class Dragon extends Animal implements Walking, Flying
{
    public Dragon(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String play()
    {
        return "The dragon blows fire in the air and laughs.";
    }
    
    @Override
    public String makeNoise()
    {
        return "Yayaya Yayaya Yayaya.";
    }
    
    @Override
    public String eat()
    {
        return "The dragon opens its mouth, BBQs the meat, and eats it.";
    }
    
    @Override
    public String walk()
    {
        return "The dragon walks with its tail swinging. \n" +
                "It farts twice for every 6 steps.";
    }
    
    @Override
    public String fly()
    {
        return "Its wings flap up and down alternatingly, \n" +
                "meaning the wings always keep a straight line.";
    }
}