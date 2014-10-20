package assemble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

	//获取n
	public static int inputN(){
		
		String str = "";
		
		System.out.println("请输入整数n：");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int n = Integer.parseInt(str);
		
		return n;
	}
	
	//获取r
	public static int inputR(){
		
		String str = "";
		
		System.out.println("请输入整数r：");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int r = Integer.parseInt(str);
		
		return r;
	}
	
}
