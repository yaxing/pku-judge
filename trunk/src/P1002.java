/**
 * PKU
 * P1002
 * @mem 11296K
 * @time 4829MS
 * @code 1635B
 * 
 * @author Yaxing Chen
 * @date 05/16/2011
 *
 */

import java.util.*;
import java.io.*;

public class P1002{
	public static Map<String, Integer> phone = new TreeMap<String, Integer>();

	public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int qty = Integer.parseInt(in.readLine().trim());
		
		while(qty--!=0){
			String key = in.readLine().trim();
			key = key.replace("-", "");
			StringBuilder f = new StringBuilder();
			for (int j=0; j<key.length(); j++){
				char ch = key.charAt(j);
				if (ch<='9'&&ch>='0')
					f.append(ch);
				else if (ch<='C'&&ch >='A')
					f.append('2');
				else if (ch>='D'&&ch<='F')
					f.append('3');
				else if (ch>='G'&&ch<='I')
					f.append('4');
				else if (ch>='J'&&ch<='L')
					f.append('5');
				else if (ch>='M'&&ch<='O')
					f.append('6');
				else if (ch>='P'&&ch<='S'&&ch!='Q')
					f.append('7');
				else if (ch>='T'&&ch<='V')
					f.append('8');
				else if (ch>='W'&&ch<='Y')
					f.append('9');
			}
			key = f.toString().substring(0, 3) + "-" + f.toString().substring(3);
			if(phone.containsKey(key)){
				phone.put(key, phone.get(key)+1);
			}
			else{
				phone.put(key, 1);
			}
		}
		boolean found = false;
		Iterator<String> itr = phone.keySet().iterator();
		while(itr.hasNext()){
			String key = itr.next();
			Integer value = phone.get(key);
			if(value > 1){
				found = true;
				System.out.println(key + " " + value);
			}
		}
		if(!found){
			System.out.println("No duplicates.");
		}
	}
}

