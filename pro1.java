import java.util.Scanner;
public class pro1 {
    static int a=0,b=1,c=a+b;
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args){
    System.out.print("Enter num for fibonacci series:");
    int num=sc.nextInt();
    pro1.ram(num);
    }static void ram(int num){
       if(num!=0){
        System.out.print(a+" ");
         
         a=b;
         b=c;
         c=a+b;
ram(num-1);
    }
    }}

