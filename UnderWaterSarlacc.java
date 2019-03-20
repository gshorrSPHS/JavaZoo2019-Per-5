
/**
 * Write a description of class UnderWaterSarlacc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnderWaterSarlacc extends Sarlacc implements Swimming
{
    private int gill;
    public UnderWaterSarlacc(String name, String desc, int gills)
    {
        super(name, desc);
        gill = gills;
    }
    
    @Override
    public String swim()
    {
        return "The under-water sarlacc uses its tentacles to swim!";
    }
}
