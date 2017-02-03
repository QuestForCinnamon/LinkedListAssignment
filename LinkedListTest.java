package linkedLists;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	
	private LinkedList aList;

	@Before
	public void setUp() throws Exception {
		aList = new LinkedList();
	}

	@After
	public void tearDown() throws Exception {
		aList = null;
	}

	@Test
	public void testIsEmpty() {
		assertTrue(aList.isEmpty());
		aList.addFirst(7);
		assertFalse(aList.isEmpty());
	}
	
	@Test
	public void testSize() {
		assertTrue(aList.size() == 0);
		aList.addFirst(4);
		assertTrue(aList.size() == 1);
		aList.addFirst(10);
		assertTrue(aList.size() == 2);
	}
	
	@Test
	public void testAddAndRemoveFirst() {
		aList.addFirst(1);
		aList.addFirst(2);
		aList.addFirst(3);
		assertTrue(aList.removeFirst() == 3);
		assertTrue(aList.removeFirst() == 2);
		assertTrue(aList.removeFirst() == 1);
		assertTrue(aList.isEmpty());
	}
	
	@Test
	public void testAddLast() {
		aList.addLast(1);
		aList.addLast(2);
		aList.addLast(3);
		assertTrue(aList.removeFirst() == 1);
		assertTrue(aList.removeFirst() == 2);
		assertTrue(aList.removeFirst() == 3);
		assertTrue(aList.isEmpty());
	}
	
	@Test
	public void testRemoveLast() {
		aList.addFirst(1);
		aList.addFirst(2);
		aList.addFirst(3);
		aList.addFirst(4);
		aList.addFirst(5);
		assertTrue(aList.removeLast() == 1);
		assertTrue(aList.removeLast() == 2);
		assertTrue(aList.removeLast() == 3);
		assertTrue(aList.removeLast() == 4);
		assertTrue(aList.removeLast() == 5);
		assertTrue(aList.isEmpty());
	}
	
	@Test
	public void testAddAtIndex() {
		aList.addAtIndex(10, 0);
		aList.addAtIndex(11, 1);
		aList.addAtIndex(13, 2);
		aList.addAtIndex(12, 2);
		aList.addAtIndex(9, 0);
		assertTrue(aList.removeFirst() == 9);
		assertTrue(aList.removeFirst() == 10);
		assertTrue(aList.removeFirst() == 11);
		assertTrue(aList.removeFirst() == 12);
		assertTrue(aList.removeFirst() == 13);
		assertTrue(aList.isEmpty());
	}
	
	@Test
	public void testRemoveAtIndex() {
		aList.addFirst(13);
		aList.addFirst(12);
		aList.addFirst(11);
		aList.addFirst(10);
		aList.addFirst(9);
		assertTrue(aList.removeAtIndex(0) == 9);
		assertTrue(aList.removeAtIndex(1) == 11);
		assertTrue(aList.removeAtIndex(2) == 13);
		assertTrue(aList.removeAtIndex(1) == 12);
		assertTrue(aList.removeAtIndex(0) == 10);
		assertTrue(aList.isEmpty());
	}

}
