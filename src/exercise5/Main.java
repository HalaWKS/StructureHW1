package exercise5;

public class Main {

	public static void main(String[] args) {
		String s = "Madam, sma, dam?";
		s = s.toLowerCase();
		int i = 0;
		palindrome(s, i, s.length() - 1);

	}

	public static void palindrome(String s, int i, int j){
		if(s.length() == 2){
			if(s.charAt(i) == s.charAt(j)){
				System.out.println("是回文");
				return;
			} else {
				System.out.println("不是回文");
				return;
			}	
		}
		
		if(Math.abs(i - j) <= 1){
			System.out.println("是回文");
			return;
		}
		if(s.charAt(i) < 'a' || s.charAt(i) > 'z'){
			i++;
			palindrome(s, i, j);
			return;
		}
		if(s.charAt(j) < 'a' || s.charAt(j) > 'z'){
			j--;
			palindrome(s, i, j);
			return;
		}
		
		if(s.charAt(i) == s.charAt(j)){
			palindrome(s, i + 1, j - 1);
		} else {
			System.out.println("不是回文");
			return;
		}	

	}
	
}
