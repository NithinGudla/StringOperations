package nithin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringOperationsTest {

	
	@Test
	void test1() {
		StringOperations stringOperations = new StringOperations();
		String actual = stringOperations.removeCharA("ABCD");
		assertEquals("BCD",actual);
	}
	@Test
	void test2() {
		StringOperations stringOperations = new StringOperations();
		String actual = stringOperations.removeCharA("AACD");
		assertEquals("CD",actual);
	}
	@Test
	void test3() {
		StringOperations stringOperations = new StringOperations();
		String actual = stringOperations.removeCharA("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	void test4() {
		StringOperations stringOperations = new StringOperations();
		String actual = stringOperations.removeCharA("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	void test5() {
		StringOperations stringOperations = new StringOperations();
		String actual = stringOperations.removeCharA("AABAA");
		assertEquals("BAA",actual);
	}
	@Test
	void test6() {
		StringOperations stringOperations = new StringOperations();
		String actual = stringOperations.removeCharA("A");
		assertEquals("",actual);
	}
	@Test
	void test7() {
		StringOperations stringOperations = new StringOperations();
		String actual = stringOperations.removeCharA("AA");
		assertEquals("",actual);
	}
	@Test
	void test8() {
		StringOperations stringOperations = new StringOperations();
		String actual = stringOperations.removeCharA("BA");
		assertEquals("B",actual);
	}
	@Test
	void test9() {
		StringOperations stringOperations = new StringOperations();
		String actual = stringOperations.removeCharA("AB");
		assertEquals("B",actual);
	}
	@Test
	void test10() {
		StringOperations stringOperations = new StringOperations();
		String actual = stringOperations.removeCharA("B");
		assertEquals("B",actual);
	}
	@Test
	void test11() {
		StringOperations stringOperations = new StringOperations();
		String actual = stringOperations.removeCharA("BB");
		assertEquals("BB",actual);
	}
	@Test
	void test12() {
		StringOperations stringOperations = new StringOperations();
		String actual = stringOperations.removeCharA("");
		assertEquals("",actual);
	}

}
