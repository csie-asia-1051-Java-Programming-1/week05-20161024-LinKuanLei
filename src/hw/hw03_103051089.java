package hw;
/*
 * Topic: �]�p�@�ӵ{���A���ϥΪ̿�J�@�ӥ����n�A�P�_�ÿ�Xn���h�֦���~�|�j��10000
 * Date: 2016/10/24
 * Author: 103051089 �L�a�U
 */
import java.util.Scanner;
public class hw03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("��J�@�ӥ����n�A�P�_�ÿ�Xn���h�֦���~�|�j��10000�G");
		int n =input.nextInt();
		double count = 0;
		int i=0;
		while (true) {
			if(count>10000){
				System.out.println(n+"��"+i+"����>10000");
				break;
			}
			i++;
			count = Math.pow(n, i);			
		}
	}

}
