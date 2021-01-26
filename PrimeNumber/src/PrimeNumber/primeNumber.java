package PrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class primeNumber {

	public static void main(String[] args) {

		primeNumberCheck();
	}

	public static void primeNumberCheck() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 素数リスト
		List<Integer> primeNumList = new ArrayList<>();
		// 合成数リスト
		List<Integer> compositeNumList = new ArrayList<>();

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
				primeNumList.add(i);
				continue;
			}

			compositeNumList.add(i);
		}

		for (int primeNum : primeNumList) {
			System.out.println("素数:" + primeNum);
		}
		for (int compositeNum : compositeNumList) {
			System.out.println("合成数:" + compositeNum);
		}
	}
}
