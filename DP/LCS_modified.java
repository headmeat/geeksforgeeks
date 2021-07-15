package ax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTest {
	public static int factor(int n) {
	    int fact = 1;
	    for (int i = 2; i <= n; i++) {
	        fact = fact * i;
	    }
	    return fact;
	}
	
	static String common(String[] s1, String[] s2) {
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {
					return s1[i];
				}
			}
		}
		
		return null;
	}
	
	static String[] combs(String s, int n, int start) {
		int idx = 0;
		int len = factor(s.length()-start)/(factor(s.length()-start-n)*factor(n));
		String[] combs = new String[len];
		
		if(n==0) return null;
		
		for(int i=start;i<(s.length()-n+1);i++) {
			String[] recurse = combs(s, n-1, i+1);
			
			if(recurse!=null) {
				for(int j=0;j<recurse.length;j++) {
					combs[idx++] = s.charAt(i)+""+recurse[j];
				}
			}else {
				combs[idx++] = s.charAt(i)+"";
			}
		}
		
		return combs;
	}
	
	public static void main(String[] args) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";

		for(int i=Math.min(s1.length(), s2.length())-1;i>0;i--) {
			String com = common(combs(s1, i, 0), combs(s2, i, 0));
			
			if(com!=null) {
				System.out.println("LCS for input Sequences is: "+com);
				break;
			}
		}
	}
}
