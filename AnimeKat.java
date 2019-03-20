public class AnimeKat extends Kat implements Flying, Swimming
{
    private String animeName;
    public AnimeKat(String name, String desc, String animeName)
    {
        super(name, desc);
        this.animeName = animeName;
    }
    
    @Override
    public String fly()
    {
        return "With magical powers the kat flies through the sky" + "\n" +
        "(=චᆽච=) uwu";
    }
    
    @Override
    public String swim()
    {
        return "The kat tries to swim and fails miserably." + "\n" +
        "meow meow uwu [^._.^]ﾉ彡";
    }
    
    public String getAnimeName()
    {
        return animeName;
    }
}