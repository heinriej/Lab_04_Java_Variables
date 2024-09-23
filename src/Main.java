public class Main
{
    public static void main(String[] args)
    {
      int intOperandA = 26;
      int intOperandB = 14;

      int intSum = 0;
      int intProduct = 0;
      int intQuotient = 0;
      int intDifference = 0;
      int intModulo = 0;

      intSum = intOperandA + intOperandB;
      System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);
      intProduct = intOperandA * intOperandB;
      System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);
      intQuotient = intOperandA / intOperandB;
      intModulo = intOperandA % intOperandB;
      System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient  + " with a remainder of " + intModulo);
      intDifference = intOperandA - intOperandB;
      System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);


      double doubleOperandA = 45.32;
      double doubleOperandB = 12.87;

      double doubleSum = 0;
      double doubleProduct = 0;
      double doubleQuotient = 0;
      double doubleDifference = 0;

      doubleSum = doubleOperandA + doubleOperandB;
      System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
      doubleProduct = doubleOperandA * doubleOperandB;
      System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
      doubleQuotient = doubleOperandA / doubleOperandB;
      System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
      doubleDifference = doubleOperandA - doubleOperandB;
      System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

    }
}

