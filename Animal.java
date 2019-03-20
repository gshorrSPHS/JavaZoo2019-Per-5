// abstract class is a concept
// not a concrete thing to be constructed
// abstract classes CANNOT be constructed
// can have a mix of abstract and concrete methods
public abstract class Animal
{
    private String name;
    private String desc;
    
    public Animal(String name, String desc)
    {
        this.name = name;
        this.desc = desc;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    // All Animals will eat. We won't say how. 
    // But if you want to be an Animal, you'll override it
    public abstract String eat();
    public abstract String makeNoise();
    public abstract String play();
}



