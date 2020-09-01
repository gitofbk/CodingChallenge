package module;

import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PartB_TWO {
	String s;
	
	public boolean areCharactersRepeating(String w)
	{
		Set<Character> s=new HashSet<>();
		for(Character c: w.toCharArray())
			s.add(c);
		if(s.size()!=w.length())
			return true;
		else
			return false;
	}

	@Test
	public void testA() {
		System.out.println("-------------------PART B TEST 2 A---------------------------");
		for(String w: s.split(" "))
		{
			if(areCharactersRepeating(w.toLowerCase()))
				System.out.println(w);
		}
	}

	
	@BeforeTest
	public void beforeTest() {
		s="Bangalore is in India";
	}

	@AfterTest
	public void afterTest() {
		
		System.out.println("__________________________________________");
	}

	@Test
	public  void testB(){
		System.out.println("-------------------PART B TEST 2 B---------------------------");
		HashMap<String,String> output=new HashMap<>();
		for(String w: s.split(" "))
		{
			if(areCharactersRepeating(w.toUpperCase()))
			{
				HashMap<Character,Integer> map=new HashMap<>();
				for(Character c: w.toUpperCase().toCharArray())
					map.put(c,map.getOrDefault(c,0)+1);
				Iterator<Map.Entry<Character, Integer> > 
				iterator = map.entrySet().iterator(); 

				// Iterate over the HashMap 
				while (iterator.hasNext()) 
				{ 
					Map.Entry<Character, Integer>     entry     = iterator.next(); 
					if (1==entry.getValue()) 
					{ 
						iterator.remove(); 
					} 
				}
				System.out.println(w+" :"+map);
			} 
		}  

	}   
}
