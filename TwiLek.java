public class TwiLek extends Animal implements Swimming, Walking, Climbing
{
   public TwiLek(String name, String desc)
   {
       super(name, desc);
   }
   
   @Override
   public String play()
   {
       return "Kor twilek runku thiku chir separatist threat";
   }
   
   @Override
   public String eat()
   {
       return "Kor twilek eatku li large Blurrg";
   }
   
   @Override
   public String makeNoise()
   {
       return "Duta, ha droids youba stupache!";
   }
   
   @Override
   public String swim()
   {
       return "Leha Twi'lek chir \"swimming\"";
   }
   
   @Override
   public String walk()
   {
       return "Leha Twi'lek chir \"walking\"";
   }
   
   @Override
   public String climb()
   {
       return "Leha Twi'lek chir \"climbing\"";
   }
}
