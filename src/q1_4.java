/**
 * Created by apple on 1/18/17.
 */
import java.util.Random;

public class q1_4 {
    private double sum;
    private double biggestNumber;
    private double smallestNumber;

    private double generateNumber(){
        Random Rand = new Random();
        double n = Rand.nextDouble();
        boolean sign = Rand.nextBoolean();
        if (sign == false){
            n = 0 - n;
        }
        return n;
    }

    private void findBiggest(double n){
        if (n > biggestNumber){
            biggestNumber = n;
        }
    }

    private void findSmallest(double n){
        if (n < smallestNumber){
            smallestNumber = n;
        }
    }

    private void sumUp(double n){
        sum += n;
    }

    private double findAverage(double sum){
        double average = sum / 10000;
        return average;
    }

    public void run(){
        for (int i = 0; i < 10000; i++){
            double num = generateNumber();
            findBiggest(num);
            findSmallest(num);
            sumUp(num);
        }

        double average = findAverage(sum);
        System.out.print("The biggest number is: ");
        System.out.println(biggestNumber);
        System.out.print("The smallest number is: ");
        System.out.println(smallestNumber);
        System.out.print("The average is: ");
        System.out.println(average);
    }

    public static void main(String []args){
        new q1_4().run();
    }
}
