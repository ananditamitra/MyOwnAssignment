package test.utility;

public class AccessModifierTest {
	
	public int subtraction(int first, int second) {
		return first - second;
	}
	
	private int multiplication(int first, int second) {
		return first * second;
	} 
	
	int addition(int first, int second) {
		return first + second;
	}
	
	
	public int multiply(int first, int second) {
		return multiplication( first, second);
	}

}
