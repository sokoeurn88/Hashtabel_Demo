package hashtable_demo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashtable_Demo {

	public static void main(String[] args) {
		
		Hashtable ht3=new Hashtable();	//default capacity 11, load factor 0.75
		Hashtable ht1=new Hashtable(15);
		Hashtable ht2=new Hashtable(15,(float) 0.90);
		
//		Hashtable<Integer,String> ht3=new Hashtable<Integer,String>();
		
		ht3.put(101, "sokoeurn");
		ht3.put(102, "kosal");
		ht3.put(103, "nitha");
		System.out.println(ht3);
		
		System.out.println( ht3.get(101));
		
		System.out.println( ht3.remove(101));
		System.out.println(ht3);
		
		System.out.println(ht3.containsKey(102)); 
		
		System.out.println(ht3.containsValue("kosal"));
		
		System.out.println(ht3.isEmpty());
		
		System.out.println(ht3.keySet());
		
		System.out.println(ht3.values());
		
		for(Object k: ht3.keySet()) {
			System.out.println(k+" "+ht3.get(k));
		}
		
		
		for(Object ent:ht3.entrySet()) {
			System.out.println( ((Entry) ent).getKey()+" "+((Entry) ent).getValue());
		}
		
		Set s=ht3.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
		
	}

}
