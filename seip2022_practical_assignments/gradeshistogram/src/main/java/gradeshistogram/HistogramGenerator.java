package gradeshistogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class HistogramGenerator
{

    public static ArrayList<Integer> readNumbers(String file_path){
        
        ArrayList<Integer> grades = new ArrayList<Integer>();

        try {
            File myObj = new File(file_path);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {

                int grade = Integer.parseInt(myReader.nextLine());
                grades.add(grade);
                System.out.println(grade);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error while reading the file occurred.");
            e.printStackTrace();
            System.exit(0);
          }
          return grades;
    }









    public static void main( String[] args )
    {
        String file_path = args[0];
        readNumbers(file_path);
    }
}
