package Lab_OOPDS.Lab00;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab00_q2 {
    public static void main (String[] args){
        ArrayList<String> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String word;

        do{
            System.out.print("Enter a word (0 to end): ");
            word = input.next();
            if (word.equals("0"))
                break;
            words.add(word);
        } while (!word.equals("0"));

        System.out.println("You entered: " + words);    // shorter version of below commented

        // System.out.print("You entered: ");
        // for (int i = 0; i < words.size(); i++)
        //     System.out.print(words.get(i) + " ");
        // System.out.println();

        boolean ascending = true;
        boolean duplicate = false;
        for (int i = 0; i < words.size()-1; i++){
            if (words.get(i).compareTo(words.get(i+1)) > 0)
                ascending = false;
            
            for (int j = i+1; j < words.size(); j++)
                if (words.get(i).equals(words.get(j)))
                    duplicate = true;
        }

        if (ascending)
            System.out.println("In ascending order.");
        else
            System.out.println("Not in ascending order.");

        if (duplicate)
            System.out.println("Has duplicate words.");
        else
            System.out.println("No duplicate words.");
    }
}
