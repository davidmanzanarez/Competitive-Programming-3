import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String a,b;
		int c=0;
		int f=0;
		
		while(s.hasNextLine()){
			String[] x=s.nextLine().split(" ");
			a=x[0];
			b=x[1];
			
			for(int i=0;i<a.length();i++){
				for(int j=0;j<b.length();j++){
					if(a.charAt(i)==b.charAt(j)){
						c++;
						j+=i;
					}
				}
			}
			if(c==a.length()){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}			
		}
		
	}
}
