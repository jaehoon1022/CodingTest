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

		System.out.println("���� ����Ʈ������! [�Է°� : S] [2/2] �� ��ȸ: 2 ������ȸ: 2");
		while (true) {
			int i = ran.nextInt(10);
			int j = ran.nextInt(10 - i);

			input = sc.next();
			if (input.equals(str)) { // �ּҰ��� �ƴ� ���� ��ġ �Ұ�� equals

				System.out.println("��" + i + "���� ����Ʈ���̽��ϴ�!");
				System.out.println("���� ����Ʈ������! [1/2] ������ȸ: 1");
				sc.next();
				System.out.println("��" + j + "���� ����Ʈ���̽��ϴ�!");
				System.out.println("��" + (i + j) + "���� ����Ʈ���̽��ϴ� [0/2] ������ȸ: 0");
				System.out.println("���� ���������� �Ѿ� ���ϴ�.");

			} else {

				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ� [�Է°� : S] �� �Է����ּ���.");

			}

		}

	}

}
