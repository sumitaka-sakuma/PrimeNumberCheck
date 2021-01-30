package PrimeNumber;

import java.util.ArrayList;
import java.util.List;

public class ListSetterGetter {

	// 素数リスト
	private static List<Integer> primeNumList = new ArrayList<>();
	// 合成数リスト
	private static List<Integer> compositeNumList = new ArrayList<>();

	public List<Integer> getPrimeNumList() {
		return primeNumList;
	}

	public void setPrimeNumList(List<Integer> primeNumList) {
		this.primeNumList = primeNumList;
	}

	public List<Integer> getCompositeNumList() {
		return compositeNumList;
	}

	public void setCompositeNumList(List<Integer> compositeNumList) {
		this.compositeNumList = compositeNumList;
	}

}
