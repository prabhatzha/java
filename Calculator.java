   class Calculator
{
   public static void main(String [] args)
{

      int num1 = 10;
     int num2 =  20;
     int result = 2;
   

   switch(result)
{
    case 1: result = num1 + num2;
        System.out.println(" The sum of the number is: " +result);
        break;
    case 2: result = num1 - num2;
        System.out.println(" The substraction of the number is: " +result);
        break;
    case 3: result = num1 * num2;
        System.out.println(" The multiplication of the number is: " +result);
        break;
    case 4: result = num1 / num2;
        System.out.println(" The division of the number is: " +result);
        break;
   default: System.out.println("Invalid operation");
     break;

}

}
}