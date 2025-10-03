import java.util.*;
public class TypeC extends Thing{
    int timeSinceLast;
    
    public TypeC(int row, int col) {
    super(row,col);
    this.lab = 'y';
    }
    

    public void maybeTurn(Random rand) {
        timeSinceLast++;
        if( timeSinceLast == 15){
            timeSinceLast = 0;
            int i = rand.nextInt(3);

            if (i == 1) {
            this.rightTurn();
            step();
            this.leftTurn();
            }

            if (i == 2) {
            this.leftTurn();
             step();
            this.rightTurn();
            }
        }
    }

}