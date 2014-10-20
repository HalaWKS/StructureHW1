package exercise3;

public class Main {

	public static void main(String[] args){
		int m = 0;
		int k = 1;
		int[] a = {5, 6};
		
		findMax(a, m, k);
		double max = calAve(a, a.length - 1);
		System.out.println(max);
	}
	
	/**
	 * 找到最大值
	 * @param a
	 * @param m
	 * @param k
	 */
	public static void findMax(int[] a, int m, int k){	
		if(k == a.length){
			System.out.println("Max is " + a[m]);
			return;
		}
		if(a[m] > a[k]){
			int temp = a[k];
			a[k] = a[m];
			a[m] = temp;
			m++;
			k++;
			findMax(a, m, k);
		} else {
			m++;
			k++;
			findMax(a, m, k);
		}
	}
	
	/**
	 * 求平均值
	 * @param a
	 * @return
	 */
	public static double calAve(int[] a, int m){
		if(m == 0){
			return (double)a[0] / a.length;
		} else {
			return (double)a[m] / a.length + calAve(a, m - 1);
		}
	}

}
