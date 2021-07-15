package ax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTest {
	static String common(List<String> s1, List<String> s2) {
		for(int i=0;i<s1.size();i++) {
			for(int j=0;j<s2.size();j++) {
				if(s1.get(i).equals(s2.get(j))) {
					return s1.get(i);
				}
			}
		}
		
		return null;
	}
	
	static List<String> combs(String s, int n, int start) {
		List<String> combs = new ArrayList<>();
		
		if(n==0) {
			return null;
		}
		
		for(int i=start;i<(s.length()-n+1);i++) {			
			List<String> recurse = combs(s, n-1, i+1);
			
			if(recurse!=null) {
				for(int j=0;j<recurse.size();j++) {
					combs.add(s.charAt(i)+""+recurse.get(j));
				}
			}else {
				combs.add(s.charAt(i)+"");
			}
		}
		
		return combs;
	}
	
	public static void main(String[] args) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		
		for(int i=s1.length()-1;i>0;i--) {
			List<String> lst = combs(s1, i, 0);
			List<String> lst2 = combs(s2, i, 0);
			
			String com = common(lst, lst2);
			
			if(com!=null) {
				System.out.println("LCS for input Sequences is: "+com);
				break;
			}
		}
	}
}
