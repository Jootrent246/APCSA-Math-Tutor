/*distance
*Trent Hardacre
*Solve the Distance between two points
 */

import java.util.Scanner;

public class distance {
    private double pointx1;
    private double pointy1;
    private double pointx2;
    private double pointy2;
    public void acceptInputDistance() {
        System.out.println("d = √((x2 - x1)^2 + (y2 - y1)^2)");
        Scanner inputD = new Scanner(System.in);
        System.out.print("Enter First X Coordinate Point: ");
        pointx1 = inputD.nextDouble();
        System.out.print("Enter First Y Coordinate Point: ");
        pointy1 = inputD.nextDouble();
        System.out.print("Enter Second X Coordinate Point: ");
        pointx2 = inputD.nextDouble();
        System.out.print("Enter Second Y Coordinate Point: ");
        pointy2 = inputD.nextDouble();
        inputD.close();
    }
    public double solveDistance(){
        double answerDistance = Math.sqrt(Math.pow(pointx2 - pointx1, 2) + Math.pow(pointy2 - pointy1, 2));
        return answerDistance;
    }
}
