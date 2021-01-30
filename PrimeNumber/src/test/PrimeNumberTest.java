package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

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

	@Test
	public void primeNumberList() {

		String str[] = {"13"};
		List<Integer> expectPrimeNumList = Arrays.asList(2,3,5,7,11,13);
		List<Integer> expectCompositeNumList = Arrays.asList(1,4,6,8,9,10,12);
		rn.main(str);
		assertThat(rn.list.getPrimeNumList(), is(expectPrimeNumList));
		assertThat(rn.list.getCompositeNumList(), is(expectCompositeNumList));
	}
}
