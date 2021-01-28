package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import PrimeNumber.PrimeNumber;

public class PrimeNumberTest {

	private static PrimeNumber rn;

	@Rule
    public ExpectedException thrown = ExpectedException.none();

	@BeforeClass
	public static void getTestClass() {
		rn = new PrimeNumber();
	}

	@SuppressWarnings("static-access")
	@Test
	public void PrimeNumCheckTrue() {

		String str[] = {"31"};
		int except = 31;
		rn.main(str);
		assertTrue(rn.primeNumFlg);
	}

//	@SuppressWarnings("static-access")
//	@Test(expected = NumberFormatException.class)
//	public void parseToIntegerFail() {
//
//		thrown.expect(NumberFormatException.class);
//		String str = "文字列";
//		rn.main(str);
//
//	}

}
