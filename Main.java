public class Main
{
  public static void main(String[] args)
  {
    // test your functions here to make sure they work
    double distance = distanceFormula(5,21,2,1);
    double x1 = posQuadraticFormula(2, 4, 1);
    double x2 = negQuadraticFormula(2, 4, 1);

    System.out.println("the distance is: " + distance);
    if (x1 == -1111111111){
      System.out.println("error bro, imaginary roots or invalid values");
    }
    else{
      System.out.println("root #1: " + x1);
    }
    if (x2 == -1111111111){
      System.out.println("error bro, imaginary roots or invalid values");
    }
    else{
      System.out.println("root #2: " + x2);
    }
  }

  // Implement distance formula method here
  public static double distanceFormula(int x1, int y1, int x2, int y2){
    double d = Math.sqrt(( x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    return d;
  }

  // implement one of your quadratic formula methods here
  public static double posQuadraticFormula(int a, int b, int c){
    if ((a != 0) && ((b*b-4*a*c) >= 0)){
    double x = ( (-1 * b) + Math.sqrt(b * b - 4*a*c)) / (2 * a);
      return x;
    }
    else{
      return -1111111111;
    }
    }

  // implement the other quadratic formula here
  public static double negQuadraticFormula(int a, int b, int c){
    if ((a != 0) && ((b*b-4*a*c) >= 0)){
      double x = ( (-1 * b) - Math.sqrt(b * b - 4*a*c)) / (2 * a);
        return x;
      }
      else{
        return -1111111111;
      }
}
}
