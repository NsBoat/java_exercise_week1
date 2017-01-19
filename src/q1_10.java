/**
 * Created by apple on 1/19/17.
 */
public class q1_10 {
    private String input(){
        Input in = new Input();
        System.out.print("Input the string: ");
        return in.nextLine().toLowerCase();
    }

    private String fixString(String n){
        String str = n.replaceAll("[\\W]", "");
        System.out.println(str);
        return str;
    }

    private void palindrome(String n){
        String str = new StringBuffer(n).reverse().toString();
        if (n.compareTo(str) == 0){
            System.out.println("This is a palindrome string.");
        }
        else {
            System.out.println("This is not a palindrome.");
        }
    }

    public void run(){
        String str = input();
        palindrome(fixString(str));
    }

    public static void main(String []args){
        new q1_10().run();
    }
}
