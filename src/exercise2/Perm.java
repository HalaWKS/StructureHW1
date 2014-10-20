package exercise2;

public class Perm {
	
	public static void perm(char[] list, int k){
		int m = list.length - 1;
		int i;
		if(k == m){
			for (i = 0; i <= m; i++) {
				System.out.print(list[i]);
			}
			System.out.println();
		}
		else{
			for (i = k; i <= m; i++) {
				swap(k, i, list);
				perm(list, k + 1);
				swap(k, i, list);
			}
		}
	}
	
	public static char[] swap(int k, int i, char[] list){
		char temp = list[k];
		list[k] = list[i];
		list[i] = temp;
		return list;
	}
	
}
