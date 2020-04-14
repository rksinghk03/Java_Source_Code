package concurrencyParallelism;

import java.util.concurrent.Callable;

public class Test extends Fruit {

		 public static void juice (){
			  System.out.println("Fruit juice");
			 }
			
			static class Apple extends Fruit {
			 public static void juice (){
			  System.out.println("Apple juice");
			 }
			 public static void main (String args []) {
			  Fruit fruit = new Fruit();
			  Fruit apple = new Apple();
			  fruit.juice();
			  apple.juice();
			 }
			}
}