package hw;
/*
 * Topic: ���ϥΪ̿�J�@�����n�A��X1+2+3+�K+m<=n���̤j���m=?
 * Date: 2016/10/24
 * Author: 103051089 �L�a�U
 */
import java.util.Scanner;
public class hw02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("��J�@�����n�A��X1+2+3+�K+m<=n���̤j���m�G");
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
