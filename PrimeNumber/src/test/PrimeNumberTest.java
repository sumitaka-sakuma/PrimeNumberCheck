package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import PrimeNumber.PrimeNumber;

@RunWith(Enclosed.class)
public class PrimeNumberTest {

	////////////////////////////////
	// 引数チェックのテストクラス
	public static class checkTheArugment {

		private static PrimeNumber rn;
		public static boolean primeNumFlg = false;

		@Before
		public void getTestClass() {
			rn = new PrimeNumber();
			primeNumFlg = false;
		}

		@SuppressWarnings("static-access")
		@Test(expected = NullPointerException.class)
		public void emptyArgumentCheck() {

			String[] emptyStr = null;
			rn.main(emptyStr);
		}
	}

	////////////////////////////////
	// 引数に13が渡された時のテストクラス
	public static class arugmentIs13 {

		private static PrimeNumber rn;
		private static boolean primeNumFlg = false;
		private String[] str = new String[1];
		private int except = 0;

		@Before
		public void setUp() {
			rn = new PrimeNumber();
			primeNumFlg = false;
			str[0] = "13";
			except = 13;
		}

		@SuppressWarnings("static-access")
		@Test
		public void PrimeNumCheckTrue() {
			rn.main(str);
			assertTrue(rn.primeNumFlg);
		}

		@SuppressWarnings("static-access")
		@Test
		public void primeNumberList() {

			// 期待値としての素数、合成数のリスト
			List<Integer> expectPrimeNumList = Arrays.asList(2,3,5,7,11,13);
			List<Integer> expectCompositeNumList = Arrays.asList(1,4,6,8,9,10,12);
			rn.main(str);
			assertThat(rn.list.getPrimeNumList(), is(expectPrimeNumList));
			assertThat(rn.list.getCompositeNumList(), is(expectCompositeNumList));
		}
	}

	////////////////////////////////
	// 引数に14が渡された時のテストクラス
	public static class arugmentIs14 {

		private static PrimeNumber rn;
		private static boolean primeNumFlg = false;
		private String[] str = new String[1];
		private int except = 0;

		@Before
		public void setUp() {
			rn = new PrimeNumber();
			primeNumFlg = false;
			str[0] = "14";
			except = 14;
		}

		@SuppressWarnings("static-access")
		@Test
		public void PrimeNumCheckFalse() {

			String str[] = {"14"};
			int except = 14;
			rn.main(str);
			assertFalse(primeNumFlg);
		}
	}
}
