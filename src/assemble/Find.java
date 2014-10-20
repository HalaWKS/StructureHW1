package assemble;

public class Find {

	private static int[] temp;
	
	private static int k;
	
	public Find(int n, int r){
		temp = new int[n];
		temp[0]= r;
	}
	
	
	public void find (int n, int r){
		
		if(r < 0 || n < r){
			System.out.println("输入不合规范");
			return;
		} 
		
		for (int i = n; i >= r; i--) {
			temp[r] = i;
			if(r > 1){
				find(i - 1, r - 1);
			} else {
				for (int j = temp[0]; j > 0; j--) {
					System.out.print(temp[j] + " ");
				}
				System.out.println();
			}
		}
	}
	
}
