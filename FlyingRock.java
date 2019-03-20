public class FlyingRock extends Rock implements Flying, Walking, Swimming, Climbing
{
    public FlyingRock(String name, String desc)
    {
        super(name, desc);
    }
  
    @Override
    public String fly()
    {
        return "Brock becomes Lenny Kravitz and 'Flys away... YEEEEAAAAH YEEEEAAAAH YEEEEEEEEEEAAAAAAAAAHHHHHHHHHH'";
    }
    
    @Override
    public String swim()
    {
        return "Brock decided to go to morning practice and achieved an 0:58 in the 100 Freestyle"; 
    }
    
    @Override
    public String climb()
    {
        return "Brock decides to join his brothers on the mountain. Yeah idk any meme for this dont judge me >:(";
    }
    
}
