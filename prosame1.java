import java.util.Scanner;
public class prosame1{
    static int a=0,b=1,c=a+b;
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args){
        System.out.print("enter fiborassi series length:");
        int num=sc.nextInt();
        prosame1.sum(num);
    }static void sum(int num){
        while(num!=0){
        System.out.print(a+" ");
        a=b;
        b=c;
        c=a+b;
        num--;
        }

    }
}
