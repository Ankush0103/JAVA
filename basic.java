import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
        int num1 = sc.nextInt();
        for(int i = 1; i <= num1; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
     	System.out.println("\nEnter value upto which sum of natural numbers must be printed ");
        int num2 = sc.nextInt();
        int sum1 = 0;
        for(int i = 1; i <= num2; i++){
            sum1 = sum1 + i;
        }
        System.out.println("SUm of first " + num2 + " natural numbers is " + sum1);
    }
}

