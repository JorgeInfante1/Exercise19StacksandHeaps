package com.exercise19stacksandheaps.app;

import java.util.Stack;
public class StacksandHeaps 
{
    public static void main(String[] args) 
	{
		//Variables declaration
    	String cad="LA palabra entr� en el vocabulario de los hispanohablantes debido a que muchas de las tecnolog�as que consumimos, provenientes de pa�ses de habla inglesa, contienen la palabra random entre sus funciones.";
    	
    	Stack<Character> letters = new Stack<Character>();
        char[] lettersArray = cad.toCharArray();
        
        for(Character c: lettersArray)
        {
        	if(Character.toUpperCase(c)=='A')
        	{
        		letters.push(c);
        	}
        }
        while(!letters.isEmpty())
        {
        	System.out.print(letters.pop());
        }
        /*for(Character c: letters)
        {
        	System.out.println(letters.pop());
        }*/
	}

}
