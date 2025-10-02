import java.util.*;
public abstract class Thing {
  

    protected int  row;
    protected int  col;
    protected int  dir;
    protected char lab;
    public Thing(int row, int col){
      this.row = row;
      this.col = col;
    }
    
    public void step() {
    final int[] dc = {
      0, 1, 0, -1
    }, dr = {
      1, 0, -1, 0
    };
    this.row += dr[this.dir];
    this.col += dc[this.dir];
  }

  public  void rightTurn() {
    this.dir = (this.dir + 1) % 4;
  }

  public void leftTurn() {
    this.dir = (this.dir + 3) % 4;
  }

  public String toString() {
        return row + " " + col + " " + lab + "\n"; //print all method in  where Dot Chaser?
        }
  public abstract void maybeTurn(Random rand);
  
  }