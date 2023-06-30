package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10 - a;
		
		System.out.println("some code1");
		
		try {
			System.out.println("some code2");
			
			int result = (1 + 2 + 3) / b;
			
			System.out.println("some code3");
			System.out.println("some code4");
		} catch(ArithmeticException ex) {
			/* 예외 처리 */
			
			//1. 사과
			System.out.println("미안합니다.");
			
			//2. 로깅
			System.out.println("error:" + ex);
			
			//3. 정상적인 종료
			return;
		} finally {
			System.out.println("자원정리");
		}
		
		// 예외가 발생한 이 후에 실행할 가능성이 있는 코드 이기 때문에 비추
		// System.out.println("some code5");
	}

}
