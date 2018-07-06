package test.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test11Main {

	public static void main(String[] args) {
		System.out.println("Collection.....");
						//collection을 하는 이유는 데이터의 길이가 가변적이기 때문이다!!!!
						//TestVO에 num, name의 키를 만들어 줄수 있지만 이 두개가 끝임.
						//하지만 가변적으로 만들어주기 위해서는 list, set, map을 사용해주는거임!
		// 1.list
		List<String> list = new ArrayList<String>(); // <>는 제네릭 : 가변배열임을 나타냄 배열이니까 string!!!맞춰줘야함
		// List<String> list = new Vector<String>();
		// List<String> list = new LinkedList<String>();
		list.add("10040");
		list.add("10041");
		list.add("10042");
		list.add(String.valueOf(10043));
		list.add(new String(new char[] { 'a', 'b' }));
		list.add(new String(new char[] { 'a', 'b' }));
		list.add(new String(new char[] { 'a', 'b' }));
		list.add(list.toString()); // 주소를 반환하니까 어차피 문자
		System.out.println("list.size()" + list.size());

		// list.remove(0);
		System.out.println("list.size()" + list.size());
		list.set(4, "kim");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		for (String x : list) {
			System.out.println(x);

		}

		// 2.set:순서가없음,중복불가(유니크한 데이터)
		Set<Integer> set = new HashSet<Integer>();
		set.add(1000);
		set.add(10001);
		set.add(1000);
		set.add(10001);
		System.out.println("set.size(): " + set.size());

		set.remove(10001);

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			Integer x = (Integer) it.next();
			System.out.println(x);
		}

		for (Integer x : set) {
			System.out.println(x);
		}

		// 3.map 순서가업음
		Map<String, String> map = new Hashtable<String, String>();
		map.put("key1", "kim1");
		map.put("key11", "kim2");
		map.put("key111", "kim3");
		map.put("key1111", "kim4");
		
		for (String key : map.keySet()) {
			//System.out.println(key); //값은 다르지만 key1는 하나만 만들었기때문에 하나만 출력이됨
			System.out.println(key+": "+map.get(key)); //순서가 없어서 다 다르게 나옴!
		}
		
		//key1:{k1:kim,k2:kim1,k3:a1004,k4:bbb,k5:kim,k6:99}
		//key2:{kim,kim1,a1004,bbb,kim,99}
		//key3:{kim,kim1,a1004,bbb,kim,99}
		
		

		
		
		
		
	}

}
