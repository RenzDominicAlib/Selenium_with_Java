
public class Class1 {

	public static void main(String[] args) {
		String myStr = "TODO Auto-generated method stub";
		
		String wordNeeded = "generated";
		String newStr = myStr.substring(myStr.indexOf(wordNeeded , 0));
		System.out.println(newStr);
		System.out.println(myStr + ": the word " + wordNeeded + " is in " + myStr.indexOf(wordNeeded) + " index");
	}

}
