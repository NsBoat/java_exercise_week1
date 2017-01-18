/**
 * Created by apple on 1/18/17.
 */
public class q1_7 {

    private int inputValue(){
        Input in = new Input();
        System.out.print("Please input the value: ");
        int number = in.nextInt();
        return number;
    }


    public String toBase(int n, int b){

        String str = "";

        while (n >= b){
            str += Integer.toString(n % b);
            n /= b;
        }
        if (n > 0){
            str += Integer.toString(n);
        }
        str = new StringBuilder(str).reverse().toString();

        return str;
    }

    public void run(){
        int n = inputValue();
        int b = inputValue();

        String str = toBase(n, b);

        System.out.println(str);
    }


    public static void main(String []args){
        new q1_7().run();

    }
}

