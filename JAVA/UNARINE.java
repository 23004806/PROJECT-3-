/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unarine;
import java.util.Scanner;
/**
 *
 * @author unarine
 */
public class UNARINE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner UNARINE = new Scanner(System.in);
    System.out.println("Enter Marks :");
    int marks = UNARINE.nextInt();
    /*
    LEVELS    MARKS    RESULTS
    Level 7 : 80-100% (Outstanding performance)
    Level 6 : 70-79%  (Meritorious achievement)
    Level 5 : 60-69%  (Substantial achievement)
    Level 4 : 50-59%  (Moderate achievement)
    Level 3 : 40-49%  (Adequate achievement)
    Level 2 : 30-39%  (Elementary achievement)
    Level 1 : 00-29%  (Fail-Not achieved)
    */
   
    if (marks>=80 && marks <=100){
        System.out.println("Outstanding Performance");
        }
    else if (marks >=70 && marks <=79){
        System.out.println("Meritorious achievement");
        }
    else if (marks >=60 && marks <=69){
        System.out.println("Substantial achievement");
        }
    else if (marks >=50 && marks <=59){
        System.out.println("Moderate Achievement");
        }
    else if (marks >=40 && marks <=49){
        System.out.println("Adequate Achievement");
        }
    else if (marks >=30 && marks <=39){
        System.out.println("Below Average, Needs Improvement");
        }
    else if (marks >=0 && marks <=29){
        System.out.println("Fail-Not achieved");
        }
    else{
        System.out.println("The marks entered are not in the range");
        }

    }
    
}
