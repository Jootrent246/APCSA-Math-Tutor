/*PythagoreanTheorem
*Trent Hardacre
*Find the hypotenuse of a triangle
 */
 
import java.util.Scanner;

public class PythagoreanTheorem{
    private double sideA;
    private double sideB;
    public void acceptInputPT(){
        System.out.println("c = √(a² + b²)");
        Scanner inputP = new Scanner(System.in);
        System.out.print("Enter Value of side a: ");
        sideA = inputP.nextDouble();
        System.out.print("Enter Value of side b: ");
        sideB = inputP.nextDouble();
        inputP.close();
    }
    public double solvePT(){
        double answerPT =  Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return answerPT;
    }

}

    

