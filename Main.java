public class Main
{
  public static void main(String[] args)
  {
    // test your functions here to make sure they work
    System.out.println(distanceFormula(5,21,2,1));
  }

  // Implement distance formula method here
  public static double distanceFormula(int x1, int y1, int x2, int y2){
    double d = Math.sqrt(( x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    return d;
  }

  // implement one of your quadratic formula methods here
  public static double posQuadraticFormula(int a, int b, int c){
    if (a != 0 ){
      double x = ( (-1* (b) + Math.sqrt(b * b - 4*a*c)) / 2 * a);
      return x;
    }
    else if (a == 0){
      return 0.0;
    }
    else {
      return -1.0;
    }

  }
  // implement the other quadratic formula here
}
