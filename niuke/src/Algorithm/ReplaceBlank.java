package Algorithm;

public class ReplaceBlank {

	public static void main(String[] args) {
		StringBuffer stringBuffer  = new StringBuffer("Hi My Name I s");
		
		String returnString = replaceSpace(stringBuffer);
		System.out.println(returnString);
	}
	
	public static String replaceSpace(StringBuffer str) {
		if (!str.toString().contains(" ")) {
			return str.toString();
		} else {
			String replaceReturnString = "";
			replaceReturnString = replaceSpace(str.replace(str.indexOf(" "), str.indexOf(" ") + 1, "%20"));
			return replaceReturnString;
		}
	}
}