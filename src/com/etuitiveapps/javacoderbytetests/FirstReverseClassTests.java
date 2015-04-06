package com.etuitiveapps.javacoderbytetests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.etuitiveapps.javacoderbyte.FirstReverseClass;

public class FirstReverseClassTests {

	@Test
	public void ReverseWordLong() {
		FirstReverseClass f = new FirstReverseClass();
		String input = "long";
		String expected = "gnol";
		String actual = f.FirstReverse(input);
		assertEquals("Reverse word '"+input+"' is not 'gnol' ", expected, actual);
		
	}

}