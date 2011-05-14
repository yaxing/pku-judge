/**
 * PKU
 * P1005
 * @author Yaxing
 * @date 05/13/2011
 *
 */

import java.util.*;
public class P1005 {
	public static void main(String[] args){
		double rate = 50.0;
		double[][] cor;
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		cor = new double[n][2];
		for(int i = 0; i < n; i ++){
			cor[i][0] = in.nextDouble();
			cor[i][1] = in.nextDouble();
		}
		
		double sq = 0;
		for(int i = 0; i < n; i ++){
			sq = (cor[i][0] * cor[i][0] + cor[i][1] * cor[i][1]) * Math.PI;
			sq /= 2;
			int result = ((int)Math.round(sq / rate));
			result = result == 0?1:result;
			System.out.println("Property " + (i + 1) + ": This property will begin eroding in year " + result + ".");
		}
		System.out.println("END OF OUTPUT.");
	}
}
