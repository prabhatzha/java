import java.util.Scanner;
class ReverseByUser
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
System.out.println("Enter the name you want: ");
  String name = sc.next();
 int leng = name.length();
String rev = "";
 for( int i = leng-1; i>=0; i--)
{
    rev = rev+name.charAt(i);
}

System.out.println(" The reverse of " +name+ " is: " +rev);
}
}