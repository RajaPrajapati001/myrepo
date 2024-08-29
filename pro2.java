import java.util.*;
public class pro2 {
    static int count=0;
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args){
        System.out.print("Enter any number:");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
             count++;
            }
        }if(count==2){
            System.out.print("it is a prime number:"+num);
        }else{
            System.out.print("it is not a prime number:"+num);
        }

    }
}
