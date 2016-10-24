package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("輸入一正整數n計算n!後輸出：");
		int n = input.nextInt();
		int m = 1;
		int i=1;
		while( i <=n){
			m *= i;
			i++;
		}		
		System.out.println(n+"!="+m);
	}

}
