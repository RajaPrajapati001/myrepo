import java.util.*;
public class pro3 {
    static String rev="";
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args){
        System.out.print("Enter a string:");
        String name=sc.nextLine();
        for(int i=name.length()-1;i>=0;i--){
                  rev=rev+name.charAt(i);
        }if(name.equalsIgnoreCase(rev)){
            System.out.println("String is palindrome:"+name);
        }else{
            System.out.println("String is not palindrome:"+name);
        }

    }}

