package Week04Project;

import java.util.Arrays;


public class Week04Project {

	public static void main(String[] args) {

	

/*
 *********
 *Problem 1
 *********
*/
		
//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.


int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

//We now need to subtract the first element and the last element.

int difference = ages[ages.length - 1] - ages[0];

	System.out.println("The difference of the first element from the last element is " + difference);
	
//My answer is 90, which makes sense as 3 is our first number and 93 is the last number in the array, so the difference of 90-3 would equal 90.
	
	
//We now need to create a new array with 9 elements and repeat the steps we just did to make sure it is dynamic
	int[] nine = {45, 21, 5, 23, 13, 52, 88, 4, 62};
	int minus = nine[nine.length - 1] - nine[0];
	System.out.println("The difference of the first element from the last element is " + minus);
	
//My answer is 17, which is correct as 45 is the first element and 62 is the last element in the array, so the difference of 62-45 would equal 17.
	
//We now need to add a loop to iterate through the array and calculate the average age
	int sum = 0;
	for (int i = 0; i < ages.length; i ++) {
	sum += ages[i];
	}
	int average = sum / ages.length;
	System.out.println("The average age in the array ages is " + average);
// I created a for loop to iterate through the array and add all the numbers in the first array (ages) together.
// I then took the sum that the loop came up with and divided it by the total amount of elements array to get the answer 28, which is the correct average.
	
/*
 **********
 *Problem 2
 **********
 */
// We need to create an array for a list of names
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};	
	
//We now need to us a loop to iterate through the Array and calculate the average number of letters per name.
	int sum1 = 0;
	for(int i = 0; i < names.length; i++) {
	sum1 += names[i].length();
	}
	int average1 = sum1 / names.length;
	System.out.println("The average number of letters is " + average1);
	
//I used a for loop to iterate through the Array to get the total sum of letters from the names. 
//I then was able to calculate the average by dividing the sum total by the amount of elements in the name array.

//We will now use a loop to iterate through the names array and put the names together with a space.
	String names2 = " ";
	for (int i = 0; i < names.length; i++) {
		names2 += names[i] + " ";
	}
	System.out.println(names2);
	
	
//I used a for loop to iterate through the Array to concatenate the names together from the names array and to print the names with spaces between.
	
/*
 **************
 *Problem 3
 **************
 */
	
System.out.println("The last element in an array can be found by array [array.length - 1]");

/*Using array [array.length - 1] will find the last element of an area because the index of an array starts at 0, 
 * meaning that the last element will be sitting at one less than the total amount of elements.
 */

/*
 **************
 *Problem 4
 **************
 */

System.out.println("The first element in an array can be found by array[0]");

// Using array[0] will find the first element in the array as an array starts it's index at 0.
  
/*
 *************
 *Problem 5
 *************
 */
//Create a new array called nameLengths and write a loop to iterate over the previously created names Array and add the length of each name into the new Array.

int[] nameLengths = new int[names.length];
for(int i = 0; i < names.length; i++){
	nameLengths[i] = names[i].length();
}
System.out.println(Arrays.toString(nameLengths));

// I created a new array that was the same length as the previous names Array.
//I then used a for loop to iterate through the names Array.
//I then printed out using Arrays.toString to show the contents from the names array, since it was a String array.

/*
 ***********
 *Problem 6
 ***********
 */
// We need to use a loop to iterate over the nameLengths Array to calculate the sum of all the elements.
int sum2 = 0;
for(int i = 0; i < nameLengths.length; i++) {
	sum2 += nameLengths[i];
}
	System.out.println(sum2);
	
//I created a new sum, called sum2. I then used a for loop to iterate over the Array.
// I then added the value of i going through the Array adding the numbers to the variable sum2 to get the total sum amount of the numbers in the array.
	
	
/*
 ************
 *Problem 7
 ************
 *Write a method to take a String word, and int n, and return the word concatenated to itself n # of times.
 */
System.out.println(repeat("Yay", 7)); //the word Yay will repeat 7 times by using the method titled repeat that was created below.

	
	

	
/*
 ************
 *Problem 8
 ************
 *Write a method that takes two Strings, firstName and lastName, and returns a full name
 */

System.out.println("Full name is " + fullName("Tony", "Stark"));

	

/*
 ************
 *Problem 9
 ************
 *Write a method that takes an Array of int and returns true if the sum of all the ints in the Array is greater than 100
 */

System.out.println(greaterThan(ages));



/*
 *************
 *Problem 10
 *************
 *Write a method that takes an Array of double and returns the average of all the elements in the Array
 */

double[] array1 = {4.82, 5.60, 3.78, 18.62, 52.1};
System.out.println("The average is " + averageOfDoubles(array1));
	
	
	
/*
 **************
 *Problem 11
 **************
 *Write a method that takes two Arrays of double and returns true if the average of the elements in the first Array is greater than the average in the second Array.
 */

double[] array2 = {41.23, 5.40, 9.70, 2.00, 24.6, 1.22};
System.out.println("Question 11: " + firstArrayGreater(array1, array2));
System.out.println("Question 11: " + firstArrayGreater(array2, array1));

/*
 *************
 *Problem 12
 *************
 *Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket and returns true if it is hot outside and if moneyInPocket is greater than 10.50
 */
boolean isHotOutside = true;
double moneyInPocket = 8.52;
System.out.println("The answer for Question 12 is " + willBuyDrink(isHotOutside, moneyInPocket));

	
/*
 **************
 *Problem 13
 **************
 *Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
 */
double [] quarterbackMahomes = {25.34, 34.60, 36.88};
double [] quarterbackHurts = {18.80, 34.82, 29.68};
System.out.println(pointSum(quarterbackMahomes));
System.out.println(pointSum(quarterbackHurts));
System.out.println("The Quarterback that has done better in the first three weeks, has scored " + betterQuarterback(quarterbackMahomes, quarterbackHurts));
}
//The problem that I decided to solve was to take the fantasy football points scored by two quarterbacks in the first three games played so far and to see who had scored more so far in the season.
//To accomplish this, I created two methods. The first method is able to give the total sum of an array. I used this to see the total amount of both quarterbacks so far.
//The second method was able to take both quarterback's points and figure out which one was greater and then print that total.

	
	
/*
 **************************
 *METHODS for Problems 7-13
 **************************
 */

//Problem 7 Method
public static String repeat(String word, int n) {
	String repeat = " ";
for (int i = 0; i < n; i++) {
	repeat += word;  //each iteration of the for loop will concatenate a copy of the word onto the repeat String
}
return repeat;
}
//This method will iterate through a loop and for each iteration, will concatenate a copy of the word
	
//Problem 8 Method

public static String fullName(String firstName, String lastName) {
	return firstName + " " + lastName;
}


//Problem 9 Method

public static boolean greaterThan(int [] nums) {
	int sum = 0;
	for (int i: nums) {
		sum += i;
	}
	if(sum > 100) {
		return true;
	} else {
		return false;
//This method takes the array nums, an int array, and checks the sum of it's elements
//If the sum is greater than 100 it will print true to the console. If the sum is less than 100, it will print false.
	}
}

//Problem 10 Method
public static double averageOfDoubles(double[] array1) {
double avg = 0;
for(double i : array1) {
	avg += i;
}
if(array1.length > 0) {
	return avg / array1.length;
} else {
	return 0;
	
//This method takes the array of doubles called array1, and returns the average of the elements.
}
}


//Problem 11 Method

public static boolean firstArrayGreater(double [] a, double [] b) {
	double averageA = averageOfDoubles(a);
	double averageB = averageOfDoubles(b);
	if(averageA > averageB) {
		return true;
	} else {
		return false;
		
//This method takes two arrays, both of them are double arrays, and finds the average of both arrays.
//It then returns true if the first array's average is greater than second array's average.
//It then returns false if the second array's average is greater than the first array's average.
	}
	}


//Problem 12 Method

public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	if(isHotOutside == true && moneyInPocket > 10.50) {
		return true;
	} else {
		return false;
//This method checks if the boolean isHotOutside is true and if double moneyInPocket is greater than 10.50. 
//If isHotOutside is true AND moneyInPocket is greater than 10.50, it will return true
//If either one is false, then it will return false.
		
	}
}

//Problem 13 Method

public static double pointSum(double[] arrayQuarterback) {
double totalSum = 0.0;
for(double i : arrayQuarterback) {
	totalSum += i;		} 
		return totalSum;
}
//The first method is able to give the total sum of the elements in an Array.

public static double betterQuarterback (double[] c, double [] d) {
	double totalPoints1 = pointSum(c);
	double totalPoints2 = pointSum(d);
	if(totalPoints1 > totalPoints2) {
		return totalPoints1;
	} else {
		return totalPoints2;
	}
	//The second method is able to compare the sums of elements in two different arrays and provide the one that scored the higher points.
}
}
