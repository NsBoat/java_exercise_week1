/**
 * Created by apple on 1/18/17.
 */
import java.util.Collections;
import java.util.ArrayList;

public class q1_3 {
    private ArrayList<String> string = new ArrayList<String>();

    private void inputStrings() {
        Input in = new Input();
        for (int i = 0; i < 10; i++) {
            System.out.printf("Please input your 10 words. This is word no. %d: ", i + 1);
            String str = in.next();
            string.add(str);
        }
    }

    private void sortList(){
            Collections.sort(string);
            Collections.reverse(string);

    }

    private void displayList(){
        for (String j : string){
            System.out.println(j);
        }
    }

    private void run(){
        inputStrings();
        sortList();
        displayList();
    }

    public static void main (String []args){
        new q1_3().run();
    }
}
