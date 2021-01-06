/*
A씨는 게시판 프로그램을 작성하고 있다.

A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 
총 페이지수를 리턴하는 프로그램이 필요하다고 한다.
입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
출력 : 총페이지수

A씨가 필요한 프로그램을 작성하시오.

예) 프로그램 수행 시 다음과 같은 결과값이 나와야 함.

m	n	출력
0	1	0
1	1	1
2	1	2
1	10	1
10	10	1
11	10	2
*/

//public class practice01 { // 게시판 페이징
//
//	public  totalpage(int m, int n) {
//
//		if (n >= 1 & m % n == 0) {
//
//			int total = m / n;
//
//			System.out.println(total);
//		}
//
//	}
//
//	public static void main(String[] args) {
////		int m = 0; // 지역변수이므로 초기화 필수!
////		int n = 0;
//		practice01 t1 = new practice01();
//
//		t1.totalpage(1, 10);
//	}
//
//}
// n이 1보다 크고 m 나누기 n 의 나머지가 0 이면서 m이 10보다 크면 페이지는 넘어간다. ex) 11이면 2페이지

