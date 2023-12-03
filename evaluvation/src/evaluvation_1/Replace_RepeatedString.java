package evaluvation_1;

public class Replace_RepeatedString {

	public static void main(String[] args) {
 String s="ANNOTATION";
 StringBuffer sb=new StringBuffer(s);
 for(int i=0;i<sb.length()-1;i++)
 {
	 if(sb.charAt(i)==sb.charAt(i+1)) {
		 sb.replace(i, i+2, "*");
		 System.out.println(sb);
	 }
 }
}
}