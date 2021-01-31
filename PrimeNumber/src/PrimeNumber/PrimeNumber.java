package PrimeNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PrimeNumber {

	// リストの取得、格納クラスインスタンス
	public static ListSetterGetter list = new ListSetterGetter();
	// 素数判定フラグ
	public static boolean primeNumFlg = false;
	// ロガー
	private static Logger logger;

	public static void main(String[] args) {

		// ロガー
		logger = Logger.getLogger("PrimeNumber");

		// 引数がない場合、処理を終了する
		if (args.length == 0) {
			throw new NullPointerException("引数がありません");
		}

		// 引数を数値に変換
		String inputStr = args[0];
		int inputNum = 0;
		try {
			inputNum = Integer.parseInt(inputStr);
		} catch (NumberFormatException ex) {
			ex.getMessage();
			return;
		}

		// 素数判定処理
		logger.info("素数判定処理を行います");
		boolean primeNumFlg = primeNumberCheck(inputNum);

		// 結果表示
		if (primeNumFlg) {
			logger.info(inputNum + "は素数です");
		} else {
			logger.info(inputNum + "は素数ではありません");
		}

	}

	/*
	 * 素数判定処理
	 * @param inputNum
	 * @return primeNumFlg
	 */
	public static boolean primeNumberCheck(int inputNum) {

		// 素数リスト
		List<Integer> primeNumList = new ArrayList<>();
		// 合成数リスト
		List<Integer> compositeNumList = new ArrayList<>();
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
				// 割る数が割られる数を超えた場合、ループを抜ける
				if (i < j) {
					break;
				}

				if (i % j == 0) {
					yakusuu++;
				}
			}
			// 約数が２つの場合は、素数
			if (yakusuu == 2) {
				primeNumList.add(i);

				// 引数について素数判定フラグをtrueにする
				if (inputNum == i) {
					primeNumFlg = true;
					break;
				}
				continue;
			}
			// 合成数リストに格納
			compositeNumList.add(i);
		}
		// 素数、合成数のリストを格納
		list.setPrimeNumList(primeNumList);
		list.setCompositeNumList(compositeNumList);

		return primeNumFlg;
	}

}
