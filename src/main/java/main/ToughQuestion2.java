package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        int calories = 0;
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	calories = cal.calculateCalories(bread);//call the function which calculate the calories for only bread
                        	System.out.println();
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	calories = cal.calculateCalories(bread,jam);//call the function which calculate the calories for only bread & jam
                        	System.out.println();
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	calories = cal.calculateCalories(bread,jam,butter);//call the function which calculate the calories for  bread,jam & butter
                        	System.out.println();
                        	break;
                        }
                        System.out.printf("%.3f",cal.calculateEnergy(calories));
                        System.out.println(" kJ of energy generated from "+calories+" calories");
            }
}
class Calories {
            
            int calculateCalories(int bread ) {
                //you have to overload this function for three parameters refer the question
            	return bread*74 ;
            }
            int calculateCalories(int bread, int jam ) {
                //you have to overload this function for three parameters refer the question
            	return bread*74 + 26 * jam ;
            }
            int calculateCalories(int bread, int jam , int butter) {
                //you have to overload this function for three parameters refer the question
            	return bread*74 + 102 * butter + 26*jam ;
            }
           float calculateEnergy(int cal) {
        	   return (float)4.1868*cal;
           }
            
            
}