public class Kat extends Animal implements Walking
{
    public Kat(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String play()
    {
        return "The Kat purrs and plays with a ball. uwu (=^･ω･^=)";
    }
    
    @Override
    public String makeNoise()
    {
        return "(ﾐⓛᆽⓛﾐ)✧ Meow [^._.^]ﾉ彡 Meow *:･ﾟ✧(=✪ ᆺ ✪=)*:･ﾟ✧ Nya uwu චᆽච";
    }
    
    @Override
    public String eat()
    {
        return "The kat jumps out of a box" + "\n" + 
        "and eats a can of tuna and purrs. Nyaa uwu *:･ﾟ✧(=✪ ᆺ ✪=)*:･ﾟ✧";
    }
    
    @Override
    public String walk()
    {
        return "The Kat walks over to the kitchen" + "\n" +
        "and jumps into a cabinet and purrs. Nyaa uwu [^._.^]ﾉ彡";
    }
}