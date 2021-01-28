package test;

import org.junit.BeforeClass;
import org.junit.Rule;
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

//	@SuppressWarnings("static-access")
//	@Test
//	public void parseToIntegerSuccess() {
//
//		String str = "31";
//		int except = 31;
//		assertThat(except, is(actual));
//	}

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
