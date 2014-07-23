import java.util.*;

public class Step
{
    public static double step(){
        ArrayList<Ameba> array = new ArrayList<Ameba>();
        array.add(new Ameba());
        double count = 0;
        for(int j = 0; j < 40; j++){
            count = 0;
            boolean cultureAlive = false;
            for(int i = 0; i < array.size(); i++){
                if(array.get(i).getState()) cultureAlive = true;
            }
            if(cultureAlive){
                int save = array.size();
                for(int i = 0; i < save; i++){
                    int choice = array.get(i).step();
                    switch(choice){
                        case 0: break;
                        case 1: array.add(new Ameba()); break;
                        case 2: array.add(new Ameba()); array.add(new Ameba()); break;
                        default: break;
                    }
                }
            }
        }
        for(int i = 0; i < array.size(); i++){
            if(array.get(i).getState()) count++;
        }
        return count;
    }
}