import java.util.*;

public class Ameba
{
    private boolean alive;
    public Ameba(){
        this.alive = true;
    }
    public void kill(){
        this.alive = false;
    }
    public int step(){
        if(this.alive){
            Random gen = new Random();
            int ran = gen.nextInt();
            ran = ran%4;
            switch(ran){
                case 0: return 0;
                case 1: this.kill(); return 0;
                case 2: return 1;
                case 3: return 2;
                default: return -1;
            }
        }
        else return -1;
    }
    public boolean getState(){
        return this.alive;
    }
}
