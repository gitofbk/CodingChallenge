package module;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.AfterTest;

public class PARTA {
	@Test
	public void test1() {
  
	  for(int i=100000;i<=30000;i++)
	  {
		  int o=i*2;
		  if(compare(Integer.toString(i),Integer.toString(o)))
		  	  	System.out.println(i+" "+o);
	  }
  
  }
  
  private boolean compare(String i, String j) {
	// TODO Auto-generated method stub
	  Set<Character> s1= new HashSet<>();
	  Set<Character> s2= new HashSet<>();
	  for(Character c:i.toCharArray())
		  s1.add(c);
	  for(Character c:j.toCharArray())
		  s2.add(c);
	  return s1.containsAll(s2)  && s2.containsAll(s1);
	   
}
	
 

@BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
