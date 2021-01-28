package PrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	// 素数リスト
	private static List<Integer> primeNumList = new ArrayList<>();
	// 合成数リスト
	private static List<Integer> compositeNumList = new ArrayList<>();
	// 素数判定フラグ
	private static boolean primeNumFlg = false;

	public static void main(String[] args) {

		// 標準入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		try {
			inputStr = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 標準入力値変換処理
		int inputNum = parseToInteger(inputStr);
		// 素数判定処理
		boolean primeNumFlg = primeNumberCheck(inputNum);

		// 結果表示
		if (primeNumFlg) {
			System.out.println("素数です");
		} else {
			System.out.println("素数ではありません");
		}

		for (int primeNum : primeNumList) {
			System.out.println("素数:" + primeNum);
		}
		for (int compositeNum : compositeNumList) {
			System.out.println("合成数:" + compositeNum);
		}
	}

	/*
	 * 標準入力変換処理
	 * @param inputStr
	 * @return inputNum
	 */
	public static int parseToInteger(String inputStr) {

		int inputNum = 0;
		try {
			// 数値に変換
			inputNum = Integer.parseInt(inputStr);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			//System.exit(1);
		}
		return inputNum;
	}

	/*
	 * 素数判定処理
	 * @param inputNum
	 * @return primeNumFlg
	 */
	public static boolean primeNumberCheck(int inputNum) {

		// 約数（約数が2つであるかどうかで、素数判定する）
		int yakusuu = 0;

		// 2未満の素数は存在しないため処理を終了する
		if (inputNum < 2) {
			return primeNumFlg;
		}

		for (int i = 1; i <= inputNum; i++) {

			// 1から順に割っていき割り切れるとき、yakusuuをインクリメント
			yakusuu = 0;
			for (int j = 1; j <= inputNum; j++) {
				if (i % j == 0) {
					yakusuu++;
				}
			}

			// 入力された値が素数かを判定
			if (inputNum == i) {
				// 約数が２つの場合は、素数
				if (yakusuu == 2) {
					// 素数判定フラグをtrueにする
					primeNumFlg = true;
					primeNumList.add(i);
				}
			} else {
				// 約数が２つの場合は、素数
				if (yakusuu == 2) {
					primeNumList.add(i);
					continue;
				}
			}

			// 合成数リストに格納
			compositeNumList.add(i);
		}
		return primeNumFlg;
	}
}
