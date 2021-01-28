package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import PrimeNumber.PrimeNumber;

public class PrimeNumberTest {

	private static PrimeNumber rn;
	public static boolean primeNumFlg = false;

	@Rule
    public ExpectedException thrown = ExpectedException.none();

	@Before
	public void getTestClass() {
		rn = new PrimeNumber();
		primeNumFlg = false;
	}

	@SuppressWarnings("static-access")
	@Test
	public void PrimeNumCheckTrue() {

		String str[] = {"31"};
		int except = 31;
		rn.main(str);
		assertTrue(rn.primeNumFlg);
	}

	@SuppressWarnings("static-access")
	@Test
	public void PrimeNumCheckFalse() {

		String str[] = {"30"};
		int except = 30;
		rn.main(str);
		assertFalse(primeNumFlg);
	}
}
