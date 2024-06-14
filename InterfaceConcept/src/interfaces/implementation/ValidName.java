package interfaces.implementation;

public class ValidName {
	public boolean isValid(String property) {
		return (property.length()>8?true:false);
	}

}
