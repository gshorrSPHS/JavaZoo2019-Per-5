public class HoneyBadger extends Animal implements Walking, Swimming, Climbing
{
    public HoneyBadger(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String play()
    {
        return "The honey badger doesn't want to play.\n"
               + "It drops a stink bomb and leaves to go dig a burrow.";
    }
    
    @Override
    public String makeNoise()
    {
        return "Khrya-ya-ya-ya";
    }
    
    @Override
    public String eat()
    {
        return "The honey badger tears into the head of a venomous snake.";
    }
    
    @Override
    public String walk()
    {
        return "The honey badger scurries across the terrain\n"
               + "with great speed and agility.";
    }
    
    @Override
    public String swim()
    {
        return "The honey badger enjoys a refreshing swim\n"
               + "while evading the impending crocodile.";
    }
    
    @Override
    public String climb()
    {
        return "The honey badger easily climbs up a tree\n"
               + "to steal honey and honeybee larvae from a beehive.";
    }
}