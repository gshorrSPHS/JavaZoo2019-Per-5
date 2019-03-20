public class GodsTears extends Animal implements Flying, Swimming
{
    public GodsTears()
    {
        super("GodsTears", "Lacrimation");
    }
    
    public GodsTears(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override 
    public String play()
    {
        return "God's Tears begins to weep, due to the many injustices \n" +
               "facing our world today. It doesn't like you.";
    }
    @Override
    public String makeNoise()
    {
        return "Hello darkness, my old friend \n"+
               "I've come to talk with you again \n"+
               "Because a vision softly creeping \n"+
               "Left its seeds while I was sleeping \n"+
               "And the vision that was planted in my brain \n"+
               "Still remains \n"+
               "Within the sound of silence";
    }
    @Override
    public String eat()
    {
        return "God's Tears emerges to feed upon the visitors own lack \n"+
               "of immoral compasses. Lambs to the cosmic slaughter!";
    }
    @Override
    public String swim()
    {
        return "God's Tears wiggles its way through wave upon wave of \n"+
               "debilitating flashbacks. The kind that won't emerge in \n"+
               "at least five minutes.";
    }
    @Override
    public String fly()
    {
        return "God's Tears is lifted by the cold, lifeless wind. Its \n" +
               "become wedged into fate itseld, making destiny its beach.";
    }
}
