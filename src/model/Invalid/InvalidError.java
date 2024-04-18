package model.Invalid;

public class InvalidError {
	static public InvalidError getInstance() {
		return new InvalidError();
	}
	
	public boolean isUpperCase(String str) {
	    return str.matches("^[A-Z]+$");
	}
	
	public boolean isDigit(String str) {
        return str.matches("\\d+");
	}
}
