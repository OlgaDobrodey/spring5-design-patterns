package com.packt.patterninspring.chapter5.scope.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Dinesh.Rajput
 *
 */

@Component
@Scope(scopeName = "myThreadScope")
public class MyBean {
	String name;

	public String getName() {
		return name;
	}

	@Value("Dinesh")
	public void setName(String name) {
		this.name = name;
	}
	
}
