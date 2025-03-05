import java.util.Scanner;

public class SubstringOccurences {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine(); //input
	String sub = sc.nextLine(); //input
	System.out.print(countOccurences(str,sub)); //calling method to count number of occurences of substring
	}
	public static int countOccurences(String str, String sub) { 
	int count = 0;
	int index=0;
	index = str.indexOf(sub,index);
	while(index!= -1){
	count++;
	index+= sub.length();
	index = str.indexOf(sub,index);
	}
	return count;
    	}
}
