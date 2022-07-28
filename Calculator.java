import java.util.Scanner;

public class Calculator{
    public static void main (String[] args){
        int n1, n2, select;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:\t");
        n1 = sc.nextInt();
        System.out.print("Enter second number:\t");
        n2 = sc.nextInt();
        System.out.println("Select the operation:\n Press -> \n\t1 for addition\n\t2 for subtraction\n\t3 for multiplication\n\t4 for division");
        select = sc.nextInt();

        System.out.print("");

        switch(select){
            case 1:
            System.out.println("Toplam:\t" + (n1+n2));
            break;
            case 2:
            System.out.println("Cikarma:\t" + (n1-n2));
            break;
            case 3:
            System.out.println("Carpma:\t" + (n1*n2));
            break;
            case 4:
            System.out.printf("Division: %d\t",(n1/n2));
            break;
        }


    }
}