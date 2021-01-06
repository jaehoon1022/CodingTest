package bollingPac;

import java.util.Random;
import java.util.Scanner;

public class b_score {

//	int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	String str = "S";
	String input = null;

	public void b_pin() {

		System.out.println("핀을 쓰러트리세요! [입력값 : S] [2/2] 총 기회: 2 남은기회: 2");
		while (true) {
			int i = ran.nextInt(10);
			int j = ran.nextInt(10 - i);

			input = sc.next();
			if (input.equals(str)) { // 주소값이 아닌 내용 일치 할경우 equals

				System.out.println("핀" + i + "개를 쓰러트리셨습니다!");
				System.out.println("핀을 쓰러트리세요! [1/2] 남은기회: 1");
				sc.next();
				System.out.println("핀" + j + "개를 쓰러트리셨습니다!");
				System.out.println("총" + (i + j) + "개를 쓰러트리셨습니다 [0/2] 남은기회: 0");
				System.out.println("다음 프레임으로 넘어 갑니다.");

			} else {

				System.out.println("잘못된 값을 입력하셨습니다 [입력값 : S] 을 입력해주세요.");

			}

		}

	}

}
