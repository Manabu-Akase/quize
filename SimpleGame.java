package first;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimpleGame {

	public static void main(String[] args) {

		System.out.println ("[1]　Who said this 'if you can dream it, you can do it'");

		System.out.println ("[2] 1 : George Washinton)");

		System.out.println ("[3] 2 : Walt Disney");

		System.out.println ("[4] 3 :Flanklin Roosevelt");

		System.out.println ("[5]答えを番号で入力し、改行を押してください。=>");
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		int answer = 0;
		String message = "間違いです!。";

		try {

			String buf = bufferedReader.readLine();

			answer = Integer.parseInt(buf);

		} catch (Exception exception) {

			answer = 0;
			message = "答えを番号で入力してください。";
		}
		if (answer ==2) {
			message = "正解です。";
		}
		System.out.println(message);
		
	}
}
