package hw;
/*
 * Topic: 讓使用者輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m=?
 * Date: 2016/10/24
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class hw02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m：");
		int n = input.nextInt();
		int count =0;
		int i =1;
		while (true) {
			if(count==n){
				System.out.println("m="+i);
				break;
			}else if(count>n){
				System.out.println("m="+(i-2));
				break;
			}			
			count +=i;
			i++;			
		}
	
	}

}
