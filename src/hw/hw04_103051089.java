package hw;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數n，計算1/(1*2)+1/(3*4)+1/(5*6)+…+1/[(2n-1)*(2n)]並輸出結果
 * Date: 2016/10/24
 * Author: 103051089 林冠磊
 */
public class hw04_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new  Scanner(System.in);
		int n = input.nextInt();
		double count = 0;
		for (int i = 1 ; i  <= n ; i++){			
			System.out.println(i);
			System.out.println(count);
		}
	}
}
