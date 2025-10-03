import java.util.*;
/**
   * YOU'LL NEED TO PUT THIS SOMEWHERE ELSE
   * HINT: WOULDN'T IT BE NICE TO HAVE A LIST OR QUEUE SO THAT
   *       WE DON'T HAVE TO USE NODES HERE?
   * This class is for linked lists of Thing's
   */
    

  public class ThingList {
    private class Node {
        public Thing data;
        public Node  next;

        public Node(Thing data){
        this.data = data;
        }
    }

    // For a linked-list based list, the head pointer
    public Node head;
    // The counter to track the number of elements in the list 
    public int count;

    // Parameterless Constructor
    public ThingList() {
        count = 0;
        head = null;
    }

    /// adds a song to the catalog
    ///@param song:the song being added to the catalog
    public void addThing(Thing thing) {
        //turns song into a CatalogItem to be added to the Catalog
        Node append = new Node(thing);
        //checks if there are no songs in the catalog
        if(head == null){
            head = append;
            count++;
        }
        //makes an iteraor to traverse throguh the catalog and adds the song to the last element and points the last element to null
        //increments counter by one
        else{
            Node it = head;
            while(it != null && it.next != null){
                it = it.next;
            }
            count++;
            it.next = append;
            append.next = null;
        }
    }

    // Move each thing.
      // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
      public void moveAll(Random rand){
            Node it = head;
            while(it != null){
                it.data.maybeTurn(rand); 
                it.data.step();
                it = it.next;
            }
      }

       // Print out each thing.
      // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
      // (SEEMS LIKE A toString() METHOD IN THE CLASS WOULD ALSO BE NICE)
      public void printAll(){
            Node it = head;
            while(it != null){
                System.out.print(it.data.toString());
                it = it.next;
            }
         System.out.println("done");
         System.out.flush(); 
      }


      
      
  }