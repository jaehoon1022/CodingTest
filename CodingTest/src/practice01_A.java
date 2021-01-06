
public class practice01_A {
	// 매개변수는 지역변수로 간주되어 메서드 내에서만 사용할 수 있다.
	private static int getPagingCount(int totalCnt, int pageCnt){
// static이 붙은이유 : main 메서드에서 인스턴스 생성없이 바로 사용하기 위해서
		int cnt = totalCnt / pageCnt;

		cnt = totalCnt % pageCnt > 0 ? cnt + 1 : cnt;

		return cnt;
		}

	
	public static void main(String[] args) {
		
		
		
		System.out.println(getPagingCount(1,10));
		
	}
}
