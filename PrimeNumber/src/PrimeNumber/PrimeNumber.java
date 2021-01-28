package PrimeNumber;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	// 素数リスト
	private static List<Integer> primeNumList = new ArrayList<>();
	// 合成数リスト
	private static List<Integer> compositeNumList = new ArrayList<>();
	// 素数判定フラグ
	private static boolean primeNumFlg = false;

	public static void main(String[] args) throws NumberFormatException{

		// 引数がない場合、処理を終了する
		if (args.length == 0) {
			return;
		}

		// 引数を数値に変換
		String inputStr = args[0];
		int inputNum = Integer.parseInt(inputStr);

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
