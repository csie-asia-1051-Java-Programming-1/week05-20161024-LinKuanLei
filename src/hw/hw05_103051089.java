package hw;
/*
 * Topic: ���@ n x n���x�}(1��n��21)�A��J n ��A�եH�{��ø�X���@��}�A��}���c�p�U�A�Ҧp n=5 �ɡG
 * Date: 2016/10/24
 * Author: 103051089 �L�a�U
 */
import java.util.Scanner;

import sun.util.logging.resources.logging;
public class hw05_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("��J n �G");
		int n = input.nextInt();
		int a[][] = new int[n][n];
		int k = 0 , count = 1;
		if( n>1 && n<21){
			for(int i = 0 ; i < n ; i++){
				k = 0;
				for(int ii = i ; ii >= 0 ; ii--){
					a [ii][k] = count ;
					count++;
					k++;
				}
			}
			count = n*n;
			for(int i =n ; i > 0 ; i--){
				k = n-1;
				for(int ii = 1 ; ii < n ; ii++ ){
					if(ii<i){
						continue;
					}
					a [ii][k] = count ;
					count--;
					k--;
				}
			}
		}
		for(int i = 0 ; i < n ; i++){
			for(int ii = 0 ; ii < n ; ii++){
				System.out.print(a[i][ii]+"\t");
			}
			System.out.println();
		}
	}

}
