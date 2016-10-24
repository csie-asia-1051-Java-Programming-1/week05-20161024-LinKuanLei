package ex;
/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 103051089 林冠磊
 */
import java.util.Random;
public class ex05_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rdm = new Random();
		int n[ ][ ] = new int[10][10];
		for(int i = 0 ; i < n.length ; i++){
			for(int j = 0 ; j <n[0].length ; j++){
				n[i][j]=rdm.nextInt(10);
				System.out.print(n[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0 ; i <n.length ; i++){
			for(int j = 0 ; j <n[0].length ; j++){				
				System.out.print(n[j][i]+"\t");
			}
			System.out.println();
		}
	}

}
