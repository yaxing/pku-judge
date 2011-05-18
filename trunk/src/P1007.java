/**
 * PKU
 * P1007
 * @author Yaxing Chen
 * @date 05/17/2011
 *
 */
import java.util.*;
public class P1007 {
	public static LinkedList<Integer> sortedness = new LinkedList<Integer>();
	public static LinkedList<String> input = new LinkedList<String>();

	public static int getSortedness(String input){
		int sort = 0;
		for(int i = 0; i < input.length() - 1; i ++){
			for(int j = i + 1; j < input.length(); j ++){
				if(input.charAt(i) > input.charAt(j)){
					sort ++;
				}
			}
		}
		return sort;
	}
	
	public static void main(String[] args){
		int lineN = 0;
		Scanner in = new Scanner(System.in);
		String[] tmpP = in.nextLine().split(" ");
		lineN = Integer.parseInt(tmpP[1]);
		for(int i = 0; i < lineN; i ++){
			String tmp = in.nextLine();
			Integer sort = getSortedness(tmp);
			if(sortedness.size() == 0){
				input.add(0, tmp);
				sortedness.add(0, sort);
				continue;
			}
			for(int j = 0; j < sortedness.size(); j ++){
				if(sortedness.get(j) >= sort){
					sortedness.add(j, sort);
					input.add(j, tmp);
					break;
				}
				else if(j == sortedness.size() - 1){
					sortedness.add(sort);
					input.add(tmp);
					break;
				}
			}
		}
		for(String e : input){
			System.out.println(e);
		}
	}
}
