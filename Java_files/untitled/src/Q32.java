import java.util.*;
class Q32{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input your age : ");
        int age=input.nextInt();
        System.out.println("Your current age is : "+age);
//--------------Do not modify before this line----
//your are allowed to insert any code here to
//increment the age by 10
//---------------------Do not modify after this line---
       age += 18;
        System.out.println("Your age after 10 years is : " +age);
    }
}
