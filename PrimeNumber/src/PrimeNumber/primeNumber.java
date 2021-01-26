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

		// 標準入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 素数リスト
		List<Integer> primeNumList = new ArrayList<>();
		// 合成数リスト
		List<Integer> compositeNumList = new ArrayList<>();

		String inputStr = null;
		int inputNum = 0;
		int yakusuu = 0;
		try {
			// 入力、数値に変換
			inputStr = br.readLine();
			inputNum = Integer.parseInt(inputStr);

			// 2未満の素数は存在しないため処理を終了する
			if (inputNum < 2) {
				return;
			}

			for (int i = 1; i <= inputNum; i++) {

				// 1から順に割っていき割り切れるとき、yakusuuをインクリメント
				yakusuu = 0;
				for (int j = 1; j <= inputNum; j++) {
					if (i % j == 0) {
						yakusuu++;
					}
				}

				// 約数が２つの場合は、素数
				if (yakusuu == 2) {
					System.out.println(i + "は素数です");
					primeNumList.add(i);
					continue;
				}

				// 合成数リストに格納
				compositeNumList.add(i);
			}
		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
		}

		for (int primeNum : primeNumList) {
			System.out.println("素数:" + primeNum);
		}
		for (int compositeNum : compositeNumList) {
			System.out.println("合成数:" + compositeNum);
		}
	}
}
