import java.util.Scanner;

public class Assignment4 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
                System.out.print("Enter Your Age: ");
    int age= input.nextInt();
            input.nextLine();

            System.out.print("Enter Your Nationality:  ");
            String nationality = input.nextLine();

            if (age>= 18 & nationality.equals("Egyptian"))
            { System.out.println("Eligible to Vote");
            }
            else {
                System.out.println("Not Eligible to Vote");
            }
    }
}
