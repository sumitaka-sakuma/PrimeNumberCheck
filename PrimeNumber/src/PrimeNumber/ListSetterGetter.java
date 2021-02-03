package PrimeNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * 素数、合成数のリストの取得や格納をまとめたクラス
 * @author sakumasumitaka
 *
 */
@SuppressWarnings("static-access")
public class ListSetterGetter {

	// 素数リスト
	private static List<Integer> primeNumList = new ArrayList<>();
	// 合成数リスト
	private static List<Integer> compositeNumList = new ArrayList<>();

	// 素数リストの取得
	public List<Integer> getPrimeNumList() {
		return primeNumList;
	}

	// 素数リストの格納
	public void setPrimeNumList(List<Integer> primeNumList) {
		this.primeNumList = primeNumList;
	}

	// 合成数リストの取得
	public List<Integer> getCompositeNumList() {
		return compositeNumList;
	}

	// 合成数リストの格納
	public void setCompositeNumList(List<Integer> compositeNumList) {
		this.compositeNumList = compositeNumList;
	}
}
