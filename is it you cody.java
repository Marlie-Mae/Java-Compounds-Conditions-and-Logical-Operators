import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       
        String name = sc.nextLine();
        sc.close();

        if(name.replaceAll(" ", "").equalsIgnoreCase("cody")) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }
}