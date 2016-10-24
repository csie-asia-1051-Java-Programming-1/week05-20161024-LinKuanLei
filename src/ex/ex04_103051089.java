package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，以字元 '*' 輸出邊長為 n 的正方形 (請利用迴圈，不要直接用 printf 方式直接輸出)。
 * Date: 2016/10/24
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex04_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("輸入一正整數 n，以字元 '*' 輸出邊長為 n 的正方形：");
		int n = input.nextInt();
		for(int i = 0 ; i < n ; i ++){
			for(int j = 0 ; j < n ; j ++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
