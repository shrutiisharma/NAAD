package Streamliners.Task0._1_Introduction;

//Program to Find all Roots of a Quadratic Equation

public class P10
{
    public static void main(String[] args)
    {
        //quadratic equation = a(x^2) + b(x) + c
        double a = 1, b = -4, c = 4;
        double D = (b * b) - (4 * a * c);           //D = determinant

        //roots are real and distinct or equal
        if (D >= 0)
        {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots of the equation are: " + root1 + " and " + root2);
        }

        //roots are imaginary
        else
        {
            double realPart = -b / (2 * a);
            double imgPart = (Math.sqrt(D)) / (2 * a);
            System.out.println("Roots of the equation are: " + realPart + "+" + imgPart + "i and " + realPart + "+" + imgPart + "i");
        }
    }
}
