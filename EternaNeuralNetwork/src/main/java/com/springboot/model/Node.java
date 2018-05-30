package com.springboot.model;


public class Node
{
String ans;
String puzzle;
Node dot, line;
Node(String ans,String puzzle)
{
this.ans = ans;
this.puzzle = puzzle;
dot = null;
line = null;
}
}