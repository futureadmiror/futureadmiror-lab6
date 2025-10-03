import java.util.*;

public class DotChaser {
  public static Random rand = new Random(System.currentTimeMillis()); //static same variable for everything
 
      


  

  

  
  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY.
    ThingList nA = new ThingList();
    int count = 0;
    while(true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {

        // Add a typeA thing to the list.
        // (GEE, THAT'S A LOT OF CODE FOR JUST CREATING ONE THING)
        TypeA tA = new TypeA(45, 50); //typeA extends thing with different para no time since last?
        nA.addThing(tA);

        // Add a typeB thing to the list
        TypeB tB = new TypeB(55, 50); //typeA extends thing with different para no time since last?
        nA.addThing(tB);

        TypeC tC = new TypeC(0, 0); //typeA extends thing with different para no time since last?
        nA.addThing(tC);
      }
      
    nA.printAll();  
    nA.moveAll(rand);
      
    
      
      count++;
    }
  }
}
