import java.util.Random;

public class lotto01 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = rand.nextInt(46);

			for (int j = 0; j < i; j++) {			// i�� j���� ���Ͽ����� ���� ���̶�� i�� 1�� ���־� �ٽ� ������ �������� �Ѵ�.
				if (lotto[i] == lotto[j]) {
					i--;
				}

			}

		} for(int b=0; b<lotto.length; b++) {
			
			System.out.println(lotto[b]);
		}

	}

}
