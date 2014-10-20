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
	 * ת���ɶ�����
	 * @param i
	 * @return
	 */
	public static String toBin(int i){
		String str;
		str = Integer.toBinaryString(i);
		return str;
	}

	/**
	 * ��������
	 * @return
	 */
	public static int input(){
		
		int i = 0;
		String temp = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������һ������:");
		
		try {
			temp = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		i = Integer.parseInt(temp);
		
		return i;
	}
	
	/**
	 * ͳ��1�ĸ���
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
			System.out.println("��" + m + "��1");
		} else {

			calTheNum(i, m);
		}

	}
	
}
