package com.springboot.model;


public class Node
{
	public String ans;
	public String puzzle;
	public Node dot;
	public Node line;
	Node(String ans,String puzzle)
	{
		this.ans = ans;
		this.puzzle = puzzle;
		dot = null;
		line = null;
	}
}