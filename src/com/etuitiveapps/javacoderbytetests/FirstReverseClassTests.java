package com.etuitiveapps.javacoderbytetests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.etuitiveapps.javacoderbyte.FirstReverseClass;

public class FirstReverseClassTests {
  private FirstReverseClass reverse;

  @Before
  public void setup() {
    reverse = new FirstReverseClass();
  }

  @Test
  public void reverseWordLong() {
    String input = "long";
    String expected = "gnol";
    String actual = reverse.FirstReverse(input);
    assertEquals("Reverse word '" + input + "' is not '" + expected + "' ", expected, actual);
  }

  @Test
  public void reversecoderbyte() {
    String input = "coderbyte";
    String expected = "etybredoc";
    String actual = reverse.FirstReverse(input);
    assertEquals("Reverse word '" + input + "' is not '" + expected + "' ", expected, actual);
  }

  @Test
  public void reverseI_Love_Code() {
    String input = "I Love Code";
    String expected = "edoC evoL I";
    String actual = reverse.FirstReverse(input);
    assertEquals("Reverse word '" + input + "' is not '" + expected + "' ", expected, actual);
  }

}
