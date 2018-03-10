package _02_gotta_catchem_all;

public class ExceptionMethods {

	public double divide(double a, double b) throws Exception {
		if (b == 0) {
			throw new Exception();
		}
		return (a / b);
	}

	public String reverseString(String s) throws Exception {
		if (s.length() == 0) {
			throw new Exception();
		} else {
			String ret = "";
			for (int i = s.length() - 1; i > -1; i--) {
				ret += s.substring(i, i + 1);
			}
			return ret;
		}
	}
}
