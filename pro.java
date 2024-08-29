import java.util.Scanner;
public class pro{
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args){
        System.out.print("Enter a number:");
     int num=sc.nextInt();
     if(num%2==0){
       System.out.println("it is even number:"+num);
     }else{
        System.out.println("it is odd number:"+num);
     }
    }
}