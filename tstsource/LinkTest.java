import static org.junit.Assert.*;

import org.simmerman.nmu.cs112.linkedlists.Link;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkTest {

	private Link aLink;
	
	@Before
	public void setUp() throws Exception {
		aLink = new Link(9);
	}

	@After
	public void tearDown() throws Exception {
		aLink = null;
	}

	@Test
	public void testGetAndSetValue() {
		assertTrue(aLink.getValue() == 9);
		aLink.setValue(3);
		assertTrue(aLink.getValue() == 3);
	}
	
	@Test
	public void testGetAndSetNext() {
		Link nextLink = new Link(7);
		assertTrue(aLink.getNext() == null);
		aLink.setNext(nextLink);
		assertTrue(aLink.getNext() == nextLink);
	}

}
