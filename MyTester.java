package mycalculator;

//import static org.junit.Assert.*;

//import org.junit.Test;

public class MyTester {

	//@Test
	public void testnfactorial() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorialn(-1);
		
		assertEquals("answer is -1", -1, actual, 0.0);
	}
	
		//@Test
	public void testnfactorial() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorialn(0);
		
		assertEquals("answer is 1", 1, actual, 0.0);
	}
	
		//@Test
	public void testnfactorial() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorialn(10);
		
		assertEquals("answer is 3628800", 3628800, actual, 0.0);
	}
	
	public void testbinarySearch(){
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}
		MyCalculator mc = new MyCalculator();
		int actual = mc.binarySearch(arr, 9);
	}

}
