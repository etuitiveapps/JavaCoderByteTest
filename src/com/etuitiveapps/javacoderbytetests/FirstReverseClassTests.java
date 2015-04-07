package com.etuitiveapps.javacoderbytetests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.etuitiveapps.javacoderbyte.FirstReverseClass;

public class FirstReverseClassTests {

  @Test
  public void reverseWordLong() {
    FirstReverseClass reverse = new FirstReverseClass();
    String input = "long";
    String expected = "gnol";
    String actual = reverse.FirstReverse(input);
    assertEquals("Reverse word '" + input + "' is not '" + expected + "' ", expected, actual);
  }

  @Test
  public void reversecoderbyte() {
    FirstReverseClass reverse = new FirstReverseClass();
    String input = "coderbyte";
    String expected = "etybredoc";
    String actual = reverse.FirstReverse(input);
    assertEquals("Reverse word '" + input + "' is not '" + expected + "' ", expected, actual);
  }

  @Test
  public void reverseI_Love_Code() {
    FirstReverseClass reverse = new FirstReverseClass();
    String input = "I Love Code";
    String expected = "edoC evoL I";
    String actual = reverse.FirstReverse(input);
    assertEquals("Reverse word '" + input + "' is not '" + expected + "' ", expected, actual);
  }

}
