public class Main {
  public static void main(String[] args) {
    int dividend =0;
    int divisor = 0;
    try {
      int result = dividend / divisor; // This will generate Arithmetic Exception
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println("ArithmeticException caught: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Exception caught: " + e.getMessage());
    }

    finally {
      System.out.println("Finally block executed.");
    }
  }
}