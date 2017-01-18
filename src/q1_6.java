/**
 * Created by apple on 1/18/17.
 * trying updating github
 */
import java.lang.Math;

public class q1_6 {
    private double num1;
    private double num2;

    private double inputDouble() {
        Input in = new Input();
        System.out.print("Input a double: ");
        double num = in.nextDouble();
        return num;
    }

    private double sqrt(){
        double result = Math.sqrt(num1 + num2);
        return result;
    }

    public void run(){
        num1 = inputDouble();
        num2 = inputDouble();
        double result = sqrt();
        System.out.println(result);
    }


    public static void main(String []args){
        new q1_6().run();
    }
}
