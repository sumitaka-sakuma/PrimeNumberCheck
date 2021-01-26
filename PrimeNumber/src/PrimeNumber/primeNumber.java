package PrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class primeNumber {

	public static void main(String[] args) {

		primeNumberCheck();
	}

	public static void primeNumberCheck() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String inputStr = null;
		int inputNum = 0;
		try {
			inputStr = br.readLine();
			inputNum = Integer.parseInt(inputStr);
		} catch (IOException e) {
			e.printStackTrace();
		}

		int yakusuu = 0;
		for (int i = 1; i <= inputNum; i++) {

			yakusuu = 0;
			for (int j = 1; j <= inputNum; j++) {

				if (i % j == 0) {
					yakusuu++;
				}
			}

			if (yakusuu == 2) {
				System.out.println(i + "は素数です");
			}
		}
	}
}
