import java.util.Arrays;
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] b = new  double  [1]; double [] c = new double [1]; double [] m = new double [1];
		double a = m(b, c, m);
		System.out.println(a);
		
	}
	public static double m(double [] d, double [] e, double [] f) {
		double [] g = {6, 8, 9, 9, 9, 3, 9, 2, 0}; double v = 2; double z = -1;
		double [] h = {g[0], g[1], g[2]};
		double [] i = {g[0], g[1], g[4]};
		double [] j = {g[6], g[7], g[8]};
		if (Arrays.equals(h, i)) {
			return v;
		}else {
			return z;
		}
	}

}
