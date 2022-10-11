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
	   @Test
	   public void Input15ShouldBeFizzBuzz() {
	      String expected = "FizzBuzz";
	      int number = 15;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
	   @Test
	   public void Input20ShouldBeBuzz() {
	      String expected = "Buzz";
	      int number = 20;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
	   @Test
	   public void Input25ShouldBeBuzz() {
	      String expected = "Buzz";
	      int number = 25;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
	   @Test
	   public void Input33ShouldBeFizz() {
	      String expected = "Fizz";
	      int number = 33;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
	   @Test
	   public void Input36ShouldBeFizz() {
	      String expected = "Fizz";
	      int number = 36;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
	   @Test
	   public void Input39ShouldBeFizz() {
	      String expected = "Fizz";
	      int number = 39;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
	   @Test
	   public void Input47ShouldBe47() {
	      String expected = "47";
	      int number = 47;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
	   @Test
	   public void Input49ShouldBe49() {
	      String expected = "49";
	      int number = 49;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
}