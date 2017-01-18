/**
 * Created by apple on 1/18/17.
 */
import java.lang.Math;

public class q1_5 {
    private double inputDouble(){
        Input in = new Input();
        System.out.print("Input a double: ");
        double num = in.nextDouble();
        return num;
    }

    private double squareRootOfSum(double n1, double n2){
        double result = Math.sqrt(n1 + n2);
        return result;
    }

    public static void main(String []args){
        q1_5 instance = new q1_5();
        double n1 = instance.inputDouble();
        double n2 = instance.inputDouble();
        System.out.print("The sqrt of two doubles is: ");
        System.out.println(instance.squareRootOfSum(n1, n2));
    }
}
