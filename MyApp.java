import Mycalculator.Addition;
import Mycalculator.Multiplication;

public class MyApp{
    public static void main(String [] args){
        int a=0;
        int b=7;
        System.out.println(Mycalculator.Addition.add(a,b));

        double x=2.5;
        double y= 4.0;
        System.out.println(Mycalculator.Multiplication.mul(x,y));


    }
}