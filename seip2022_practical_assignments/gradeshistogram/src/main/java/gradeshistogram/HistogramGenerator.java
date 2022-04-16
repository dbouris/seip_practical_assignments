package gradeshistogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
/**
 * Hello world!
 *
 */
public class HistogramGenerator {
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


    public static void generateChart(int[] dataValues) {
		/*
		 * The XYSeriesCollection object is a set XYSeries series (dataset) that
		 * can be visualized in the same chart
		 */
		XYSeriesCollection dataset = new XYSeriesCollection();
		/*
		 * The XYSeries that are loaded in the dataset. There might be many
		 * series in one dataset.
		 */
		XYSeries data = new XYSeries("random values");

		/*
		 * Populating the XYSeries data object from the input Integer array
		 * values.
		 */
		for (int i = 0; i < dataValues.length; i++) {
			data.add(i, dataValues[i]);
		}

		// add the series to the dataset
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
		ChartFrame frame = new ChartFrame("First", chart);
		frame.pack();
		// makes the previously created frame visible
		frame.setVisible(true);
	}

    public static int[] calculateFreq(ArrayList<Integer> gradeList){
        int[] freq = new int[11];
        
        for (int i = 1; i < freq.length; i++) {
            freq[i] = 0;
        }

        for(int i = 0; i < gradeList.size(); i++) {
            freq[gradeList.get(i)]++;
        }
        return freq;
    }


    public static void main(String[] args) {
        String file_path = args[0];
        ArrayList<Integer> grades = readNumbers(file_path);
        int[] frequencies = calculateFreq(grades);
        generateChart(frequencies);

    }
}
