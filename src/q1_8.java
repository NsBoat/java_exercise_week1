/**
 * Created by apple on 1/18/17.
 */
public class q1_8 {
    private double convertMillimetres(double n){
        double feet = n * 0.00328084;
        return feet;
    }

    private double convertMetres(double n){
        double inch = n * 39.3701;
        return inch;
    }

    private double convertKilometres(double n){
        double yard = n * 1093.613888889;
        return yard;
    }

    private void displayMenu(){
        System.out.println("1. Convert millimetres to feet.");
        System.out.println("2. Convert metres to inches.");
        System.out.println("3. Convert kilometres to yards.");
        System.out.println("4. Quit");
    }

    private int inputMenu(){
        int n;

        Input in = new Input();
        while (true) {
            System.out.print("Please select: ");
            if (in.hasNextInt()) {
                n = in.nextInt();
                break;
            }
            System.out.println("Enter valid selection.");
            in.nextLine();
        }
        return n;
    }

    private double inputData(){
        double p;

        Input in = new Input();
        while (true) {
            System.out.print("Input data: ");
            if (in.hasNextInt()) {
                p = in.nextInt();
                break;
            }
            in.nextLine();
            System.out.println("Enter valid data.");
        }
        return p;
    }

    public void run(){
        double result;

        while(true){
            displayMenu();
            int a = inputMenu();
            if (a == 4){
                break;
            }
            else if (a > 4){
                System.out.println("Input valid selection: ");
                continue;
            }

            double b = inputData();
            switch (a){
                case 1:
                    result = convertMillimetres(b);
                    System.out.println(result);
                    break;
                case 2:
                    result = convertMetres(b);
                    System.out.println(result);
                    break;
                case 3:
                    result = convertKilometres(b);
                    System.out.println(result);
                    break;
                default:
                    break;

            }
        }
    }

    public static void main(String []args){
        new q1_8().run();
    }
}
