public class CanaryWingedParakeet extends Parakeet
{
    public CanaryWingedParakeet (String name, String desc)
    {
        super (name, desc);
    }
    @Override
    public String play()
    {
        return "The canary winged parakeet climbs up to your shoulders and decides to nibble your ears\n"+
               " until you give her some attention and start playing with her.";
    }
    @Override
    public String makeNoise()
    {
        return "Bee-wack!! Squack! Scream! Chirrp! Chop! Scream scream scream!";
    }
    @Override
    public String eat()
    {
        return "the canary winged parakeet uses its foot like how humans use their hands,\n" +
               " balancing on one foot and using the other to grip and chew on giant sunflower seeds.";
    }
    @Override
    public String fly()
    {
        return "the canary winged parakeet decides you are now uninteresting and thus it ditches\n"+
               "you to fly off to one of your family member's shoulders instead";
    }
}