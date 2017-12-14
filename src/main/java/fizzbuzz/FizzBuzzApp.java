package fizzbuzz;

public class FizzBuzzApp {

	public String computeFizzBuzz(int number) {     //don't need 'else if' b/c we want it to run thru each thing
	if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		
	}	
	if(number % 3 == 0) {
		return "Fizz";
	
	}
	if(number % 5 == 0) {
		return "Buzz";
	}
	
	return "" + number;  //  "" making a integer becoming a string

	}
	
}
