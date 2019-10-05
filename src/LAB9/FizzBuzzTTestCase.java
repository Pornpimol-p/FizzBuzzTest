package LAB9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTTestCase {
	FizzBuzz fizzBuzz = new FizzBuzz();
	String input1 = fizzBuzz.getNumber1(1);
	
	@Test
	void test1() {
		assertEquals("1", input1);
	}

}
