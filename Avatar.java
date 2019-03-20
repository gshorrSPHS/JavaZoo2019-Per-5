public class Avatar extends Navi implements Infiltrating 
{
    public Avatar(String name, String desc)
    {
        super(name,desc);
    }
    
    @Override 
    public String eat()
    {
        return "Grabs an MRE (meal ready to eat) from its government issued survival rations";
    }
    
    @Override
    public String play()
    {
        return "Too busy infiltrating the Na'vi, so they can take all their resources.";
    }
    
    @Override 
    public String infiltrate()
    {
        return "Infiltrates the Na'vi people and tricks them into believing the Avatar is friendly only to betray them.";
    }
}
