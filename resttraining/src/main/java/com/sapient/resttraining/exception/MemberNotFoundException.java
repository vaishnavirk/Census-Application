/**
 * 
 */
package com.sapient.resttraining.exception;

/**
 * @author admi
 *
 */
public class MemberNotFoundException extends RuntimeException {

	public MemberNotFoundException(String id) {
		super("Could not find family " + id);
	}
}

