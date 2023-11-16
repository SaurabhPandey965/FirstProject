package program;

public class wordDictonary {
	
	String word;
	String meaning;
	
	
	@Override
	public String toString() {
		return "wordDictonary [word=" + word + ", meaning=" + meaning + "]";
	}
	public wordDictonary(String word, String meaning) {
		super();
		this.word = word;
		this.meaning = meaning;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	
	
	

}
