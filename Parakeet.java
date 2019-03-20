public class Parakeet extends Animal implements Walking, Flying, Swimming, Climbing
{
    public Parakeet (String name, String desc)
    {
        super(name, desc);
    }
    @Override
    public String play()
    {
        return "The parakeet rips apart foraging toys that contai hidden seedy treats, \n" +
               "then dances while looking at its own reflection in the mirror.";
    }
    @Override
    public String makeNoise()
    {
        return "Ree? Ree! Bee-reep! GiuGiuGiu! Breee...bring bring bring! sqwack! Reeet-chirp:) sweeet~~";
    }
    @Override
    public String eat()
    {
        return "the parakeet practices boxing with its half-devoured millet stem, spraying husks and\n"
             + " sighing at the satisfaction of indulging in every budgie's beloved junkfood.";
    }
    @Override
    public String swim()
    {
        return "the parakeet steps in and out of the bird bath, wading around and fluffing up its\n"
             + " belly feathers while spreading out its wings to let the water soak in.";
    }
    @Override
    public String fly()
    {
        return "the parakeet gets irked at its friend budgie after a long round of bickering, \n"
             + ", and it flaps off to another tree branch after a final annoyed peck.";
    }
    @Override
    public String walk()
    {
        return "the parakeet scampers and hops, skitters and peers, happily exploring its vicinities.";
    }
    @Override
    public String climb()
    {
        return "the parakeet climbs up a small ladder, using its beaks to haul itself up each step.";
    }
}