package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import PrimeNumber.PrimeNumber;

public class PrimeNumberTest {

	private static PrimeNumber rn;

	@BeforeClass
	public static void getTestClass() {
		rn = new PrimeNumber();
	}

	@Test
	public void parseToInteger() {

		String str = "31";
		int except = 31;
		int actual = PrimeNumber.parseToInteger(str);
		assertThat(except, is(actual));
	}

}
