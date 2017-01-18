/**
 * Created by apple on 1/17/17.
 */
public class q1_1 {

    private String str2 = "stop";

    public  void inputString() {
        Input input = new Input();
        while(true) {
            System.out.print("Type a string: ");
            String str = input.nextLine();
            int result = str.compareTo(str2);
            if (result == 0){
                break;
            }
        }
    }

    public static void main(String []args){
        new q1_1().inputString();
    }
}
