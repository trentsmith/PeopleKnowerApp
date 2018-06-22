package com.springboot.model;


public class Node
{
	public int prob;
	public String sequence;
	public Node up;
	public Node down;
	Node(String sequence,int prob)
	{
		this.sequence = sequence;
		this.prob = prob;
		up = null;
		down = null;
	}
}