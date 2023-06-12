package com.genzeon;
import java.util.Scanner;
class MenuBased{

    public static void main(String args[])

    {
    	boolean result =true;
         while(result) {
        System.out.println("*****Menu*******");

        System.out.print("1. Veg Pizza \n2. Cheez pizza \n3. chicken Pizza \n4. cheez corn pizza \n5.Exit\n");

        System.out.println("Enter your choice : ");

        Scanner scr = new Scanner(System.in);

        int choice = scr.nextInt();
 
        switch(choice){

            case 1:

                System.out.println("your veg pizza deliverd successfully");

                break;

            case 2:

             System.out.println("your cheez pizza deliverd successfully");

                break;

            case 3:

             System.out.println("your chicken pizza deliverd successfully");

                break;

            case 4:

             System.out.println("your cheez corn pizza deliverd successfully");

                break;
                
            case 5:

                System.out.println("End of Shopping");
            result =false;
                   break;
                   

            default:

            System.out.println("Invalid Choice");

                break;
        }
        }

    }

}
