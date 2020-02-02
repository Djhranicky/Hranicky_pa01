import java.util.Scanner;


public class BMICalculator {
	private static Scanner inputs = new Scanner(System.in);
	private double choice;
	private double height;
	private double weight;
	private double BMI;
	private String category;
	
	public double getHeight() {
		return height;
	}
	
	private void setHeight(int height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	private void setWeight(int weight) {
		this.weight = weight;
	}
	
	public double getBmi() {
		return BMI;
	}
	
	public String getBmiCategory() {
		return category;
	}
	
	// Get user data
		// Specify Metric or Imperial Units
		// Get height
		// Get weight
	// Calculate BMI
		// Calculate BMI values based on which system to use
	// Print BMI
		// Display calculated values
		// Display BMI table
	
	private void readUnitType() {
		System.out.println("Please choose between Metric or Imperial units (1 for Metric, 2 for Imperial)");
		while(true) {
			choice = inputs.nextDouble();
			if(choice != 1 && choice != 2) {
				System.out.println("Please enter a valid number");
			}
			else
				break;
		}
		
	}
	
	
	private void readMetricData() {
		System.out.println("Please enter height in meters");
		height = inputs.nextDouble();
		System.out.println("Please enter weight in kilograms");
		weight = inputs.nextDouble();
		if(height < 0 || weight < 0) {
			System.exit(0);
		}
	}
	
	private void readImperialData() {
		System.out.println("Please enter height in inches");
		height = inputs.nextDouble();
		System.out.println("Please enter weight in pounds");
		weight = inputs.nextDouble();
		if(height < 0 || weight < 0) {
			System.exit(0);
		}
	}
	
	private void readMeasurementData() {
		if(choice == 1) {
			readMetricData();
		}
		if(choice == 2) {
			readImperialData();
		}
	}
	
	public void readUserData() {
		// Specify Metric or Imperial
			// Print choice
			// Get the choice
			// Check if valid
		// Get height
		// Get weight
		
		readUnitType();
		readMeasurementData();
	}
	
	private void calculateBmiCategory() {
		if(BMI < 18.5) {
			category = "Underweight";
		}
		else if(BMI < 25) {
			category = "Normal Weight";
		}
		else if(BMI < 30) {
			category = "Overweight";
		}
		else {
			category = "Obese";
		}
	}
	
	public void calculateBmi() {
		// Calculate BMI
			// Calculate BMI values based on which system to use
		
		if(choice == 1) {
			BMI = Math.round(10.0 * weight / (height * height))/10.0;
		}
		if(choice == 2) {
			BMI = Math.round(7030.0 * weight / (height * height))/10.0;
		}
		calculateBmiCategory();
	}
	
	public void displayBmi() {
		// Print BMI
			// Display calculated values
			// Display BMI table
		System.out.println("Your BMI is " + BMI + ", which is " + category);
		System.out.println();
		System.out.println("BMI Categories");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal Weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obese = >30");
	}
	
	public static void main(String args[]) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
}
