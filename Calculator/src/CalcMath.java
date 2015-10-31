public class CalcMath {
    //Sean Ng Pack
    //May 13, 2015
    public static double getDistance(double v, double a, double t) {
        double x = ((v*t) + (.5*a*(t*t)));
        return x;
    }
    public static double pressure(double v, double n, double t){
        double temp = .08206*n*t;
        temp = temp / v;
        return temp;
    }
    /**
     * Solves a quadratic equation using the quadratic equation
     *
     * @author Michael Eberhardt 
     * @version 1.0 5-22-15
     */
    public static double solveQuadratic(double a, double b, double c)
    {
        double answer = 0;
        double temp = java.lang.Math.pow(b, 2) - (4.0 * a * c);
        answer = java.lang.Math.sqrt(temp) + (b * -1.0);
        temp = answer / (2.0 * a);
        answer = temp;

        return answer;

    }

    /**
     * This class solves for x with the inputted numbers.
     *
     * @author Mitch Bosquet-Fleurival
     * @version 05/14/15
     */
    public static double FindX(double a, double b, double c)
    {
        double x = a - c;
        double y = x / b;
        if(b == 0)
        {
            System.out.println("Does not exist");
        }
        return y;
    }
}
