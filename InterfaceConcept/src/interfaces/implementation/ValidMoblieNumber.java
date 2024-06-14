package interfaces.implementation;

import interfaces.study.Validator;

public class ValidMoblieNumber implements Validator{
	@Override
	public boolean isValid(String Number) {
		return (Number.matches("[6-9][0-9]{9}")?true:false);
	}

}
