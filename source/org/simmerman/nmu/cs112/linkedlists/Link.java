package org.simmerman.nmu.cs112.linkedlists;

public class Link {
	private Link next;
	private int value;
	
	public Link(int aValue) {
		value = aValue;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int aValue) {
		value = aValue;
	}
	
	public Link getNext() {
		return next;
	}
	
	public void setNext(Link aLink) {
		next = aLink;
	}
}
