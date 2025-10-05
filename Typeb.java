import java.util.*;
public class TypeB extends Thing{
    int timeSinceLast;
    
    public TypeB(int row, int col) {
    super(row,col);
    this.lab = 'b';
    }
    
    //has to have rand from dot
    public void maybeTurn(Random rand) {
        timeSinceLast++;
        if( timeSinceLast == 10){
            timeSinceLast = 0;
            int i = rand.nextInt(3);
            
            if (i == 1) {
            this.rightTurn();
            }

            if (i == 2) {
            this.leftTurn();
            }
        }
    }
}