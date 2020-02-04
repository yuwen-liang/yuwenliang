
public class BasicJavaP1 {


	public static long floor(double num) {
		return (long) num;
	}

	public static double conversion(double fahr) {
		return (fahr - 32)*5/9;
	}

	public static boolean willRoundUp(double d) {
		// I need number behind decimal point
		// Subtract floor of number d from d itself.
		return false;
	}

	public static int addDigits(int i) {
		return (i-1)%9+1;
	}

	public static int sumRange(int i, int j) {
		int sum = 0;
		for(int counter = i; counter < j; counter++) {
			sum = sum + counter;
		}
		return sum;
	}

	public static int countChar(String string, char c) {
		int charCount = 0;
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == c) charCount++;
		}
		return charCount;
	}
	public static boolean isUpper(char aChar) {
		return true;
	}
	public static double computePolynomial(double x) {
		return 0;
	}
	public static long floorAfterMult(int num1, double num2) {
		int sum = (int)(num1 * num2);
		return sum;
	}
	public static boolean containsAllChars(String str, String chars) {
		for(int i = 0; i < str.length(); i++) {
			if(chars.contains(String.valueOf(str.charAt(i)))) {
				return true;
			}
		}
			
		return false;
	}
		

}
}
