package com.gmail.lenertz.isabelle.utilities;
import static org.junit.Assert.*;
import org.junit.Test;

public class MenuTester {
	@Test
	/**
	 * test the default constructor, the overloaded constructor and the addOption method.
	 */
	public void test() {
		Menu menu = new Menu();
		String expected = "";
		String outPut = menu.DisplayMenu();
		assertTrue(outPut.equals(expected));
		
		menu.AddOption("Option one");
		expected = "1) Option one\n";
		outPut = menu.DisplayMenu();
		assertTrue(outPut.equals(expected));
		
		Menu menu2 = new Menu("Option one");
		expected = "1) Option one\n";
		outPut = menu2.DisplayMenu();
		assertTrue(outPut.equals(expected));
	}
}