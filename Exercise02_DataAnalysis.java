/**
 * 
 */
package slideDeckExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise02_DataAnalysis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		System.out.println("Data Set 1");
//		System.out.println();
//
//		int[] inputArray = dataCollection(8);
//		printDataset(inputArray);
//		System.out.println();
//		averageOfData(inputArray);
//		minOfData(inputArray);
//		maxOfData(inputArray);

		System.out.println();
		System.out.println("Data Set 2");
		System.out.println();

		int[] myArray = new int[] { 6, 10, 5, 3, 2 };
		
		printDataset2(myArray);
		
//		printDataset(myArray);
//		averageOfData(myArray);
//		minOfData(myArray);
//		System.out.println();
//		maxOfData(myArray);
		
		int base = 0;
		
		for (int number : myArray) {
		 System.out.println(myArray[base]);
		 base++;
		}

	}

	/**
	 * This method collects user data entries and creates an array with the data
	 * 
	 * @param numberOfDataEntries - Amount of data entries required by the user
	 * @return - data array of entries
	 */
	public static int[] dataCollection(int numberOfDataEntries) {

		// Instantiate Scanner
		Scanner myScan = new Scanner(System.in);

		// Create Integer Array
		int[] dataArray = new int[numberOfDataEntries];

		// Populate the Array

		for (int i = 0; i < dataArray.length; i++) {
			// User Prompt
			System.out.println("Enter age: (" + (i + 1) + " of " + dataArray.length + ")");
			dataArray[i] = myScan.nextInt();
		}

		// Return dataArray
		return dataArray;
	}

	/**
	 * This method prints the data entries along side the order they were entered -
	 * not zero indexed for customer readability
	 * 
	 * @param dataSet - Array of data to be printed
	 */
	public static void printDataset(int[] dataSet) {
		// Printing Loop
		System.out.println("Input Order\tAge");
		for (int i = 0; i < dataSet.length; i++) {
			System.out.println((i + 1) + "\t\t" + dataSet[i]);
		}

	}
	
	
	/**
	 * This method prints the data entries using an enhance for loop along side the order the data was entered -
	 * not zero indexed for customer readability
	 * 
	 * @param dataSet - Array of data to be printed
	 */
	public static void printDataset2(int[] dataSet) {
		System.out.println("Input Order\tAge");
		int base = 0;
		for (int number : dataSet) {
			System.out.println((base + 1) + "\t\t" + dataSet[base]);
			base++;
		}
	}

	/**
	 * This method calculates the average of the array inputed - this is given to 2
	 * decimal places
	 * 
	 * @param dataSet - The array that is inputed by the user
	 */
	public static void averageOfData(int[] dataSet) {
		int total = 0;
		double average;

		for (int i = 0; i < dataSet.length; i++) {
			total += dataSet[i];
		}

		average = (double) total / dataSet.length;

		System.out.printf("The average to 2 decimal places: %.2f%n", average);

	}

	/**
	 * This method prints the minimum value in the array along with the number's
	 * index position (zero referenced)
	 * 
	 * @param dataSet - Input array of integers
	 */
	public static void minOfData(int[] dataSet) {

		// Declaration and initialisation of variables
		int currentMin = dataSet[0];
		int arrayPositionOfMin = 0;

		// Loop of array
		for (int i = 0; i < dataSet.length; i++) {
			if (currentMin > dataSet[i]) {
				currentMin = dataSet[i];
				arrayPositionOfMin = i;
			}
		}
		// Print Statements
		System.out.println("Minimum value is: " + currentMin);
		System.out.println();
		System.out.println("This value can be found at index [" + arrayPositionOfMin + "] of your array");

	}

	/**
	 * This method prints the maximum value in the array along with the number's
	 * index position (zero referenced_
	 * 
	 * @param dataSet - Input array of integers
	 */
	public static void maxOfData(int[] dataSet) {

		// Declaration and initialisation of variables
		int currentMax = dataSet[0];
		int arrayPositionOfMax = 0;

		// Loop of array

		for (int i = 0; i < dataSet.length; i++) {
			if (currentMax < dataSet[i]) {
				currentMax = dataSet[i];
				arrayPositionOfMax = i;
			}
		}
		System.out.println("Maximum value is: " + currentMax);
		System.out.println();
		System.out.println("This value can be found at index [" + arrayPositionOfMax + "] of your array");
	}
}
