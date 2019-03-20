// make interfaces for Swimming, Walking, and Climbing
// the methods will return Strings and be swim(), walk(), climb()
public interface Flying
{
    // all methods in interfaces are public and abstract
    // even if you don't explicitly type that
    String fly();
    
    // all variables in interfaces are public static final
    // even if you don't type them
    // in any class, i can access this with Flying.MAX_HEIGHT
    int MAX_HEIGHT = 15000; // in feet
}
