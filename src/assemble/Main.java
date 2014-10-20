package assemble;

public class Main {

	public static void main(String[] args) {
		
		int n = Input.inputN();
		int r = Input.inputR(); 
		Find f = new Find(n, r);
		
		f.find(n, r);
	}

}
