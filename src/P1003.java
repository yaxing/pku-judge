/**
 * PKU
 * 1003
 * @author Yaxing
 * @date 05/13/2011
 *
 */
import java.util.*;
public class P1003 {
	private int getResult(Double x){
		Double tmp = 0.0;
		for(int i = 2;; i ++){
			tmp += 1 / (double)i;
			if(tmp >= x){
				return i-1;
			}
		}
	}
	
	public static void main(String[] args){
		ArrayList<Double> input = new ArrayList<Double>();
		Scanner in = new Scanner(System.in);
		Double tmp = 0.00;
		while((tmp = in.nextDouble())!=0.00){
			input.add(tmp);
		}
		
		P1003 cal = new P1003();
		for(Double e : input){
			System.out.println(cal.getResult(e) + " card(s)");
		}
	}
}
