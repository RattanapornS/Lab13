package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.FizzBuzz;

class FizzBuzzTest {
	   @Test
	   public void Input1ShouldBe1() {
	      String expected = "1";
	      int number = 1;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
	   @Test
	   public void Input2ShouldBe2() {
	      String expected = "2";
	      int number = 2;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
	   @Test
	   public void Input3ShouldBeFizz() {
	      String expected = "Fizz";
	      int number = 3;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
	   @Test
	   public void Input4ShouldBe4() {
	      String expected = "4";
	      int number = 4;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
	   @Test
	   public void Input5ShouldBeBuzz() {
	      String expected = "Buzz";
	      int number = 5;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
}