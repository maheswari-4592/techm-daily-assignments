
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		//creating an object for Map interface
		Map<Integer,String> map = new HashMap();
		
		map.put(100, "ram");
		map.put(200, "anjali");
		map.put(300, "mahi");
		map.put(400, "lakshmi");
		
		//using for-each loop
		for(Map.Entry  m: map.entrySet())
		{
			System.out.println("marks:" +m.getKey()+"---->" + "name:" + m.getValue());
		}
		
		
	}

}
