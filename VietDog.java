public class VietDog extends Dog implements Walking, Swimming
{
    private int trees;
    
    public VietDog(String name, String desc, int c)
    {
        super(name, desc);
        trees = c;
    }
    @Override
    public String walk()
    {
        return "The dog walks around.";
    }
    @Override
    public String swim()
    {
        trees = trees + 2;
        return "The dog hides in the" + trees + " trees";
    }
}
