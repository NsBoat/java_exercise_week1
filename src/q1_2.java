/**
 * Created by apple on 1/17/17.
 */
import java.util.ArrayList;

public class q1_2 {
    private ArrayList<Double> numbers = new ArrayList<Double>();

    private void inputDouble(){
        Input in = new Input();
        for (int i = 0; i < 10; i ++){
            System.out.print("Input your double: ");
            double n = in.nextDouble();
            numbers.add(n);
        }

    }

    public void calculateAverage(){
        double sum = 0;

        inputDouble();
        for (double element : numbers){
            sum += element;
        }

        double result = sum / 10;
        System.out.println(result);
    }

    public static void main(String []args){
        new q1_2().calculateAverage();
    }

}
