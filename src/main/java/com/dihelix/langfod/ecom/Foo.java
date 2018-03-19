package com.dihelix.langfod.ecom;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Foo {

	@Resource
	private String fubar;

	@Override
	public String toString() {
		return "Foo [fubar=" + fubar + "]";
	}
}
