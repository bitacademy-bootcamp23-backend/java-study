package chapter04;

public class StringTest04 {

	public static void main(String[] args) {
		// String s1 = "Hello" + " World " + "Java " + 17;
		String s1 = new StringBuffer("Hello ")
				.append(" World ")
				.append("Java ")
				.append(17)
				.toString();
		
		System.out.println(s1);
		
//		String s2 = "";
//		for(int i = 0; i < 100000; i++) {
//			s2 = s2 + i;
//			// s2 = new StringBuffer(s2).append(i).toString();
//		}

		StringBuffer sb = new StringBuffer("");
		for(int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		String s2 = sb.toString();
		System.out.println(s2.length());
	}
}
