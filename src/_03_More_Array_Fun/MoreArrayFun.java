package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	static String[] words = {"a", "b", "c", "d", "e"};;
	public static void main(String[] args) {
		
		printS(words);
		printRevirse(words);
		printAlternate(words);
		printRandom(words);
	
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printS(String[] s) {
		for(int i =0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void printRevirse(String[] s) {
		for(int i = s.length-1;i>=0;i--) {
			System.out.println(s[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printAlternate(String[] s) {
		for(int i =0;i<s.length;i+=2) {
			System.out.println(s[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void printRandom(String[] s) {
		int randy = new Random().nextInt(s.length);
		for(int i =0;i<s.length;i++) {
			
			System.out.println(s[randy]);
			randy = new Random().nextInt(s.length);
		}
	}
}
