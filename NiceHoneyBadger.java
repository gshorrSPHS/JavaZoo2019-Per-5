public class NiceHoneyBadger extends HoneyBadger 
{
    public NiceHoneyBadger(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String play()
    {
        return "The honey badger digs a burrow.";
    }
    
    @Override
    public String eat()
    {
        return "The honey badger licks honey off its paw.";
    }
    
    @Override
    public String swim()
    {
        return "The honey badger enjoys a refreshing swim in the pool.";
    }
    
    @Override
    public String climb()
    {
        return "The honey badger easily climbs up a tree\n"
               + "to admire the beautiful sunset.";
    }
}