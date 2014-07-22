import java.util.*;
public class Main
{
    public static void main ( String[] args ){
        double[] trial = new double[1000000];
        for(int i = 0; i < trial.length; i++){
            trial[i] = Step.step();
            System.out.printf(" %-1d: %-10d",i+1,(int)trial[i]);
            if(i%4 == 0 && i != 0) System.out.println();
        }
        double avg = 0;
        for(int i = 0; i < trial.length; i++){
            avg += trial[i];
        }
        avg = avg/trial.length;
        System.out.println();
        System.out.println();
        System.out.println("Avg amount alive: " + avg); 
        double num = 0;
        for(int i = 0; i < trial.length; i++){
            if(trial[i] >= 100) num++;
        }
        System.out.println("Num cultures that were successful: " + num);
        double blah = (num/trial.length)*(100);
        System.out.printf("Percent cultures that were successful: %4.2f", blah);
        System.out.println("%");
    }
}
