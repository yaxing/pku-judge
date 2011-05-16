/**
 * PKU
 * P1006
 * @author Yaxing Chen
 * @date /5/16/2011
 *
 */

import java.util.*;

public class P1006 {
	int least_common = 21252;
	
	public int getResult(int[] input){
		input[0] %= 23;
		input[1] %= 28;
		input[2] %= 33;
		
		//the upper-bound of searching
		int end = input[4] + least_common;
		
		for(int i = input[2]; i <= end ; i += 33){
			
			if(i < input[0] || i < input[1]){
				continue;
			}
			
			int phy = (i - input[0]) % 23;
			int emo = (i - input[1]) % 28;
			int inte = (i - input[2]) % 33;
			
			if( i > input[3] && phy == 0 && (phy == emo) && (emo == inte) && (phy == inte)){
				end = i;
				break;
			}
		}
		
		return end - input[3];
	}
	
	public static void main(String[] args){
		//System.out.println(21251%365);
		P1006 obj = new P1006();
		
		ArrayList<int[]> tmp = new ArrayList<int[]>();
		
		int[] input;
		Scanner in = new Scanner(System.in);
		
		while(true){
			input = new int[5];
			input[4] = -1;
			
			boolean stop = false;
			
			for(int i = 0; i < 4; i ++){
				if((input[i] = in.nextInt()) == -1){
					stop = true;
					break;
				}
				if(input[i] > input[4]){
					input[4] = input[i];
				}
			}
			if(stop){
				break;
			}
			else{
				tmp.add(input);
			}
		}
		
		for(int i = 0; i < tmp.size(); i ++){
			System.out.println("Case "+ (i + 1) +": the next triple peak occurs in "+ obj.getResult(tmp.get(i)) +" days.");
		}
		
	}
}
