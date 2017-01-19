/**
 * Created by apple on 1/19/17.
 */


public class q1_9 {
    private Long input(){
        Input in = new Input();
        Long n;

        while(true) {
            System.out.print("Input the long integer: ");
            if (in.hasNextLong()) {
                n = in.nextLong();
                break;
            }
            in.nextLine();
            System.out.println("Input the valid long integer.");
        }

        return n;
    }

    public void palindrome(){
        Long n = input();
        String str = Long.toString(n);
        String str1 = new StringBuilder(str).reverse().toString();
        if (str1.compareTo(str) == 0){
            System.out.print("This is a palindrome number.");
        }
        else {
            System.out.print("This is not a palindrome number.");
        }

    }

    public static void main(String []args){
        new q1_9().palindrome();
    }
}
