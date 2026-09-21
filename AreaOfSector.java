/*AreaOfSector
*Trent Hardacre
*Solve the Area of a sector in a circle
 */

import java.util.Scanner;

public class AreaOfSector {
    private double aValue;
    private double radius;
    public void acceptInputAreaSector(){
        Scanner inputA = new Scanner(System.in);
        System.out.print("Enter Degrees of Sector: ");
        aValue = inputA.nextDouble();
        System.out.print("Enter radius of Cricle: ");
        radius = inputA.nextDouble();
        inputA.close();
    }
    public double solveArea(){
        double areaAnswer = (aValue/360)*(Math.PI*Math.pow(radius, 2));
        return areaAnswer;
    }
}
