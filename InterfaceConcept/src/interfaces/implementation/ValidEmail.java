package interfaces.implementation;

import interfaces.study.Validator;

public class ValidEmail implements Validator{

	@Override
	public boolean isValid(String property) {
		return ("[\\w]*@*[a-z]*\\.*[\\w]{5,}(\\.)*(com)*(@gmail\\.com"));
	}

}
