package com.greatlearning.gradedlab3.bracketbalancing;

import java.util.Stack;

public class BalanceBracket {

	public boolean BalanceBracket (String string) {

		Stack <Character> stack=new Stack<Character>();

		if(string.length()%2==1)
			return false;

		else {

			for(char character : string.toCharArray()) 

				switch(character) {
				case '{':
					stack.push('}');
					break;
				case '(':
					stack.push(')');
					break;
				case '[':
					stack.push(']');
					break;
				default :
					if(stack.isEmpty() || character != stack.peek()) {
						return false;
					}
					stack.pop();
				}
			return stack.isEmpty();

		}
		

	}

}


