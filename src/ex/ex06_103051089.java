package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex06_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner input = new Scanner(System.in);		
		System.out.print("多少個學號：");
		int ip = input.nextInt();
		long n[] = new long[ip] ;
		for(int i = 0; i < ip; i++){
			System.out.print("第"+(i+1)+"學號：");
			n[i] = input.nextLong();
		}
		long m = 0;
		for(int i = 0 ; i < n.length ; i++){
			for(int j = 1 ; j < n.length ; j++){
				if( n [ j - 1 ] < n [ j ] ){
					m =n [ j ];
					n [ j ] = n [j - 1 ];
					n [ j - 1 ] = m;
				}
			}
		}
		for(int i = 0 ; i < n.length ; i++){
			System.out.print("("+(i+1)+") "+n[i]+"\t");
		}

	}

}
