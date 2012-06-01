package org.osforce.spring4me.support.validation;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Gavin
 * @since 0.5.0
 * @create 2012-6-1 - 下午3:26:00
 */
public class ValidateProperty {

	private String propertyName;

	private List<ValidateConstraint> validateConstraints = new ArrayList<ValidateConstraint>();

	public ValidateProperty(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public List<ValidateConstraint> getValidateConstraints() {
		return validateConstraints;
	}
	
	public void addValidateConstraint(ValidateConstraint validateConstraint) {
		this.validateConstraints.add(validateConstraint);
	}

	public void setValidateConstraints(List<ValidateConstraint> validateConstraints) {
		this.validateConstraints = validateConstraints;
	}

}
