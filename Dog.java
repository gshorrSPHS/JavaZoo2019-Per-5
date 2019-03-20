public class Dog extends Animal implements Swimming, Walking
{
    public Dog(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String play()
    {
        return "The dog wags its tail";
    }
    @Override
    public String makeNoise()
    {
        return "Bark";
    }
    @Override
    public String eat()
    {
        return "The dog chomps up a t-bone steak";
    }
    @Override
    public String swim()
    {
        return "The dog swims.";
    }
    @Override
    public String walk()
    {
        return "The dog walks.";
    }
}
