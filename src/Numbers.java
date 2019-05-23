
public class Numbers {
	public static int unique(int a, int b, int c) {
		int result=a+b+c;
		if (a!=b & b!=c) {
			result=a+b+c;
			return result;
		}
		if (a==b & a!=c) {
			result=c;
			return result;
		}
		if (a==c & a!=b) {
			result=b;
			return result;
		}
		if (b==c & a!=c) {
			result=a;
			return result;
		}
		if (a==b & b==c & a==c) {
			result=0;
			return result;
		}
		else 
			result=0;
			return result;
	}

}
