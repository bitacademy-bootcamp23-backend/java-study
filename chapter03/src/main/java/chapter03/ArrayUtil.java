package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] a) {
		double[] result = null;
		
		if(a == null) {
			return result;
		} 
		
		result = new double[a.length];
		for(int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}
		
		return result;
	}

	public static int[] doubletoInt(double[] d) {
		int[] result = null;
		
		if(d == null) {
			return result;
		}
		
		result = new int[d.length];
		for(int i = 0; i < d.length; i++) {
			result[i] = (int)d[i];
		}
		
		return result;
	}

	public static int[] concat(int[] a, int[] b) {
		int size = 0;
		if(a != null) {
			size += a.length;
		}
		if(b != null) {
			size += b.length;
		}
		
		int[] result = new int[size];
		
		int index = 0;
		for(int v : a) {
			result[index++] = v;
		}

		for(int v : b) {
			result[index++] = v;
		}

		return result;
	}

}
