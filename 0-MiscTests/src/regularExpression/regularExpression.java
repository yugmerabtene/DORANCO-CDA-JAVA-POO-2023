package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//on indique quel pattern est recherché
		Pattern pattern = Pattern.compile("Dress", Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher("Dress code Doranco");
		
		
		boolean matchFound = matcher.find();
		
		if(matchFound) {
			System.out.println("Match found dress code");
			
		}else  {
			System.out.println("Match not found pas de dress Code");
		}

	}

}
