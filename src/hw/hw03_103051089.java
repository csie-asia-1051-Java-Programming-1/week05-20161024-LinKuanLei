package hw;
/*
 * Topic: 設計一個程式，讓使用者輸入一個正整數n，判斷並輸出n的多少次方才會大於10000
 * Date: 2016/10/24
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class hw03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("輸入一個正整數n，判斷並輸出n的多少次方才會大於10000：");
		int n =input.nextInt();
		double count = 0;
		int i=0;
		while (true) {
			if(count>10000){
				System.out.println(n+"的"+i+"次方>10000");
				break;
			}
			i++;
			count = Math.pow(n, i);			
		}
	}

}
