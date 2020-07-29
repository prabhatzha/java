  import java.util.Scanner;
 class TableByUser
{
   public static void main(String[] args)
{
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the number you want the table of: ");
  int table = s.nextInt();
   
for(int i = 1; i <= 10; i++)
{
        System.out.println(table+"*"+i +"= " +table*i);

}
}

}