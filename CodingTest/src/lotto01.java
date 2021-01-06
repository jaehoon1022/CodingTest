import java.util.Random;

public class lotto01 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = rand.nextInt(46);

			for (int j = 0; j < i; j++) {			// i와 j값을 비교하였을때 같은 값이라면 i를 1을 빼주어 다시 랜덤을 돌리도록 한다.
				if (lotto[i] == lotto[j]) {
					i--;
				}

			}

		} for(int b=0; b<lotto.length; b++) {
			
			System.out.println(lotto[b]);
		}

	}

}
