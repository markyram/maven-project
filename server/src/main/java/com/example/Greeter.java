package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /**
 *  @param someone the name of a person
 *   @return greeting string
 *   */ 
 
  public final Strilng greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
