package DesignPattern;

public class SingleToneClass {
	
	private static SingleToneClass instance;
	
	private SingleToneClass() {
		
	}
//lazy initielization 	
	static SingleToneClass getInstance() {
		if(instance == null) {
			instance = new SingleToneClass();
		}
		return instance;
	}
//threadSafe 	
	static synchronized SingleToneClass getThredSafeInstance() {
		
		if(instance == null ) {
			instance = new SingleToneClass();
		}
		return instance;
	}

}
