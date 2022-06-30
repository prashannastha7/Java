import java.util.Scanner;

public class Project {
    public static void main(String[] args){
        System.out.println("------Welcome to the Food app------");
        System.out.println("Please create the password: ");
        Scanner scan = new Scanner(System.in);
        String pass1 = scan.next();
        System.out.println("Your password is " + pass1);

//PASSWORD
        System.out.println("Enter your password: ");
        String pass2 = scan.next();

        while (!pass2.equals(pass1)){
            System.out.println("Incorrect. Enter your password again: ");
            pass2 = scan.next();
        }
        System.out.println("Access granted");

//ORDERING FOOD
        System.out.println("Do you want to order food? (Y/N)");
        String ans1 = scan.next();

        if (ans1.equals("Y")){
            System.out.println("Choose your orders \n 1) Pizza \n 2) Burger \n 3) Thakali \n 4) Buff Chilly");
            String ans2 = scan.next();

            while(!ans2.equals("Pizza")&& !ans2.equals("Burger")&& !ans2.equals("Thakali")&& !ans2.equals("Buff Chilly")){
                System.out.println("Your orders is not available please choose again");
                ans2 = scan.next();
            }
            System.out.println("Your order are: " + ans2);
            System.out.println("Please confirm your order (Y/N)");
            String ans3 = scan.next();
            if(!ans3.equals("Y")){
                System.out.println("Type your order again");
                ans2 = scan.next();
                while(!ans2.equals("Pizza")&& !ans2.equals("Burger")&& !ans2.equals("Thakali")&& !ans2.equals("Buff Chilly")){
                    System.out.println("Your orders is not available please choose again");
                    ans2 = scan.next();
                }
                }

            System.out.println("Thank you for your order.");
        }
        else {
            System.out.println("Thank you for Visit");
        }
    }
}
