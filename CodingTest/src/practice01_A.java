
public class practice01_A {
	// �Ű������� ���������� ���ֵǾ� �޼��� �������� ����� �� �ִ�.
	private static int getPagingCount(int totalCnt, int pageCnt){
// static�� �������� : main �޼��忡�� �ν��Ͻ� �������� �ٷ� ����ϱ� ���ؼ�
		int cnt = totalCnt / pageCnt;

		cnt = totalCnt % pageCnt > 0 ? cnt + 1 : cnt;

		return cnt;
		}

	
	public static void main(String[] args) {
		
		
		
		System.out.println(getPagingCount(1,10));
		
	}
}
