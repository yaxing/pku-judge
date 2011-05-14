/**
 * PKU
 * 1004
 * @author yangcongknight
 * @date 05/13/2011
 */
import java.util.*;
import java.text.*;
public class P1004 {
	public static void main(String[] args){
		//double[] input = new double[12];
		
		double sum = 0.0;
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 12; i ++){
			sum += in.nextDouble();
		}
		
		double avg = sum / 12.00;
		
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("$" + Double.parseDouble(df.format(avg)));
	}
}
