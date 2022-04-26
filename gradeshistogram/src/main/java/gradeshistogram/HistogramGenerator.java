package gradeshistogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * The HistogramGenerator program is used to generate a
 * Histogram graph with data from using a .txt file given 
 * as input.
 *
 * @author Dimitris Bouris
 */

public class HistogramGenerator {

    /**
     * This method is used to read the numbers in a .txt file
     * and add them in an Array
     * 
     * @param file_path the absolute path of the .txt file
     * @return returns the numbers in an ArrayList
     */

    public static ArrayList<Integer> readNumbers(String file_path) {

        ArrayList<Integer> grades = new ArrayList<Integer>();

        try {
            File myObj = new File(file_path);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {

                int grade = Integer.parseInt(myReader.nextLine());
                grades.add(grade);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error while reading the file occurred.");
            e.printStackTrace();
            System.exit(0);
        }
        return grades;
    }

    /**
     * This method is used to render the Histogram Chart using
     * the data given as input.
     * It uses the JFreeChart library.
     * 
     * @param dataValues the frequencies of the numbers.
     * This method belongs to Antonis Gkortzis.
     */

    public static void generateChart(int[] dataValues) {

        //initialize the dataset to add the numbers
        XYSeriesCollection dataset = new XYSeriesCollection();
        /*
         * The XYSeries that are loaded in the dataset. There might be many
         * series in one dataset.
         */
        XYSeries data = new XYSeries("random values");

        for (int i = 0; i < dataValues.length; i++) {
            data.add(i, dataValues[i]);
        }
        dataset.addSeries(data);

        boolean legend = false; // do not visualize a legend
        boolean tooltips = false; // do not visualize tooltips
        boolean urls = false; // do not visualize urls

        // Declare and initialize a createXYLineChart JFreeChart
        JFreeChart chart = ChartFactory.createXYLineChart("Histogram", "Grades", "Frequencies", dataset,
                PlotOrientation.VERTICAL, legend, tooltips, urls);

        /*
         * Initialize a frame for visualizing the chart and attach the
         * previously created chart.
         */
        ChartFrame frame = new ChartFrame("Histogram Generator", chart);
        frame.pack();
        // makes the previously created frame visible
        frame.setVisible(true);
    }

    /**
     * This method is used to calculate the frequencies of the numbers
     * given as input.
     * 
     * @param gradeList the list of the grades generated from readNumbers()
     * @return returns the frequencies in an int table. freq[x] represents the
     *         frequency of number x
     */

    public static int[] calculateFreq(ArrayList<Integer> gradeList) {
        int[] freq = new int[Collections.max(gradeList)+1];

        for (int i = 1; i < freq.length; i++) {
            freq[i] = 0;
        }

        for (int i = 0; i < gradeList.size(); i++) {
            freq[gradeList.get(i)]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        
        // read the file_path
        String file_path = args[0];

        // read the numbers of the .txt file given
        ArrayList<Integer> grades = readNumbers(file_path);

        // get the frequencies and generate the chart
        int[] frequencies = calculateFreq(grades);
        generateChart(frequencies);

    }
}
