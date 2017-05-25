package com.gmail.lenertz.isabelle.utilities;
public class Menu{
	
	private int size;
	private String menu;
	
	
	
	/**
	 * Default constructor
	 */
	public Menu(){
		//initialize the menu to 0 options
		this.size = 0;
		this.menu = "";
	}
	
	/**
	 * Overloaded constructor
	 * @param FirstOption: option to add to the menu
	 */
	public Menu(String FirstOption){
		this.size = 0;
		this.menu = "";
		this.AddOption(FirstOption);
	}
	
	/**
	 * Prints the Menu
	 */
	public String DisplayMenu(){
		 return this.menu;
	}
	
	/**
	 * Add an option to the menu
	 * @param newOption: new option to add to the menu
	 */
	public void AddOption(String newOption){
		// Adds one to the count of options
		this.size += 1;
		this.menu = menu + this.size + ") " + newOption + '\n';
		
	}
}