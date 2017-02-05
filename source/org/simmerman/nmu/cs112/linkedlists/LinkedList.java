package org.simmerman.nmu.cs112.linkedlists;

import org.simmerman.nmu.cs112.linkedlists.Link;

public class LinkedList {
	private Link start;
	private Link end;
	
	public boolean isEmpty() {
		return start == null;
	}
	
	public int size() {
		int count = 0;
		Link currentLink = start;
		while (currentLink != null) {
			currentLink = currentLink.getNext();
			count++;
		}
		return count;
	}
	
	public void addFirst(int aValue) {
		Link newLink = new Link(aValue);
		if (isEmpty()) {
			end = newLink;
		}
		else {
			newLink.setNext(start);
		}
		start = newLink;
	}
	
	public int removeFirst() {
		Link currentLink = start;
		int check = start.getValue();
		if (start != null) {
			currentLink = currentLink.getNext();
			start = currentLink;
		}
		return check;
	}
	
	public void setEnd() {
		Link currentLink = start;
		while (currentLink.getNext() != null) {
			currentLink = currentLink.getNext();
		}
		end = currentLink;
	}
	
	public void addLast(int aValue) {
		Link newLink = new Link(aValue);
		if (isEmpty()) {
			start = newLink;
		}
		else {
			setEnd();
			end.setNext(newLink);
		}
	}
	
	public int removeLast() {
		int check = end.getValue();
		Link currentLink = start;
		int length = size();			
		for (int i = length; i > 2; i--) {
				currentLink = currentLink.getNext();
		}
		currentLink.setNext(null);
		if (start == end) {
			start = null;
		}
		end = currentLink;
		return check;
	}
	
	public void addAtIndex(int aValue, int index) {
		Link newLink = new Link(aValue);
		Link currentLink = start;
		if (isEmpty()) {
			start = newLink;
			end = newLink;
		}
		else if (index == 0) {
			newLink.setNext(start);
			start = newLink;
		}
		else {
			for (int i = 0; i < index - 1 && currentLink.getNext() != null; i++) {
				currentLink = currentLink.getNext();
			}
			newLink.setNext(currentLink.getNext());
			currentLink.setNext(newLink);
		}
	}
	
	public int removeAtIndex(int anIndex) {
		int check = 0;
		int length = size();
		Link currentLink = start;
		if (anIndex == 0) {
			check = removeFirst();
		}
		else if (length == anIndex) {
			check = removeLast();
		}
		else {
			for (int i = 0; i < anIndex - 1; i++) {
				currentLink = currentLink.getNext();
			}
			check = currentLink.getNext().getValue();
			currentLink.setNext(currentLink.getNext().getNext());
		}
		return check;
	}
}

