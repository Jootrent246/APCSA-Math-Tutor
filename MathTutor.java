/*
* Math Tutor
* Trent Hardacre
* A Math Tutor to help solve three types of equations
*/

import java.util.Scanner;

public class MathTutor {
    public static void main(String[]args) {
      System.out.println("Welcome to the Math Tutor");
      Scanner userInput = new Scanner(System.in); 
      System.out.println("1 distance between two points\n2 Area of a sector of a circle\n3 Pythagorean Theorem");
      System.out.print("Enter the number of problem: ");
      int input = userInput.nextInt();
      userInput.close();
      if (input == 2) {
        AreaOfSector area = new AreaOfSector();
        System.out.print(area.acceptInputAreaSector());
        System.out.println(area.solveArea());
      } else if (input == 1) {
        Distance distanceOfPoints = new Distance();
        System.out.print(distanceOfPoints.acceptInputDistance());
        System.out.println(distanceOfPoints.solveDistance());
      } else if (input == 3) {
        PythagoreanTheorem pT = new PythagoreanTheorem();
        System.out.print(pT.acceptInputPT());
        System.out.println(pT.solvePT());
      }else {
        System.out.println("Not a Option");
      }
    }
} 