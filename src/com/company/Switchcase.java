package com.company;
import java.util.Scanner;
  public class Switchcase {
    public static void main(String[]arg)
    {
      System.out.println("Enter day nums:");
      Scanner sc=new Scanner(System.in);
      String day1=sc.nextLine();
      String day2=sc.nextLine();
      System.out.println("Enter the option:");
      String option=sc.nextLine();

      switch(option)
      {
        case "add":System.out.println(day1+day2);
        break;
        case "Two":System.out.println("Tue");
          break;
        case "Three":System.out.println("Wed");
          break;
        case "Four":System.out.println("Thur");
          break;
        case "Five":System.out.println("Fri");
          break;
        case "Six":System.out.println("Sat");
          break;
        case "Seven":System.out.println("Sun");
          break;
        default :System.out.println("Invalid day number");
          break;
      }


    }
}
