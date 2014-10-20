package exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		int a = input();
		String bin = toBin(a);
		System.out.println(bin);
		calTheNum(a, 0);
	}
	
	/**
	 * 转换成二进制
	 * @param i
	 * @return
	 */
	public static String toBin(int i){
		String str;
		str = Integer.toBinaryString(i);
		return str;
	}

	/**
	 * 输入整数
	 * @return
	 */
	public static int input(){
		
		int i = 0;
		String temp = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入一个整数:");
		
		try {
			temp = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		i = Integer.parseInt(temp);
		
		return i;
	}
	
	/**
	 * 统计1的个数
	 * @param i
	 * @return
	 */
	public static void calTheNum(int i, int m){
		
		int q = i % 2;
		i = i / 2;
		
		if(q == 1){
			m++;
		}
		
		if(i == 0){
			System.out.println("有" + m + "个1");
		} else {

			calTheNum(i, m);
		}

	}
	
}
