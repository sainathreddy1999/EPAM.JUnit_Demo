package junit_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Del_first_2A_test {
	/*
	 * 1.ABCD     =>  BCD
	 * 2.AACD     =>  CD
	 * 3.BACD     => BCD
         * 4.BBAA     => BBAA
         * 5.AABAA    => BAA  
         * 6.A        => ""
         * 7.""       => ""
         * 8.AAAAAAAA => AAAAAA
	 */
	Delete_2A d;
	
	@BeforeEach
	void before()
	{
		d=new Delete_2A();
	}
	@Test
	void testDeleteA() 
	{
		//Delete_2A d=new Delete_2A();
		//String result=d.delete("ABCD");
		assertEquals("BCD",d.delete("ABCD"));
	}
	@Test
	void testDeleteAA() 
	{
		//Delete_2A d=new Delete_2A();
		//String result=d.delete("AACD");
		assertEquals("CD",d.delete("AACD"));
	}
	@Test
	void testDeleteSecondA() 
	{
		//Delete_2A d=new Delete_2A();
		//String result=d.delete("BACD");
		assertEquals("BCD",d.delete("BACD"));
	}
	@Test
	void testA() 
	{
		//Delete_2A d=new Delete_2A();
		//String result=d.delete("BBAA");
		assertEquals("BBAA",d.delete("BBAA"));
	}
	@Test
	void testDelete2A() 
	{
		//Delete_2A d=new Delete_2A();
		//String result=d.delete("AABAA");
		assertEquals("BAA",d.delete("AABAA"));
	}
	@Test
	void testDeleteOneA() 
	{
		//Delete_2A d=new Delete_2A();
		//String result=d.delete("A");
		assertEquals("",d.delete("A"));
	}
	@Test
	void testDeleteEmpty() 
	{
		//Delete_2A d=new Delete_2A();
		//String result=d.delete(" ");
		assertEquals(" ",d.delete(" "));
	}
	@Test
	void testDelete() 
	{
		//Delete_2A d=new Delete_2A();
		//String result=d.delete("AAAAAAAA");
		assertEquals("AAAAAA",d.delete("AAAAAAAA"));
	}
	
}
