package program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class logic {
	
	public static void main(String[] args) {
		
		
		List<wordDictonary> words = new ArrayList<>();
		
		words.add(new wordDictonary("apple", "fruits"));
		words.add(new wordDictonary("ant", "atch"));
		
		words.sort(Comparator.comparing(wordDictonary :: getWord));
		
		System.out.println(words.get(0).meaning);
		//Map<String, String> map = new HashMap<>();
		
		
		
	}

}
