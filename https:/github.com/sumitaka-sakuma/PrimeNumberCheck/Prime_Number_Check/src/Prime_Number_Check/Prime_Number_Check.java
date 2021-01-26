package Prime_Number_Check;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime_Number_Check {

	public static void main(String[] args) {

		primeNumberCheck();
	}

	public static void primeNumberCheck() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数字を入力してください");

		String inputStr = null;
		int inputNum = 0;
		try {
			inputStr = br.readLine();
			inputNum = Integer.parseInt(inputStr);
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println(inputNum);
	}

}
