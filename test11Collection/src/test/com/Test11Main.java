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
						//collection�� �ϴ� ������ �������� ���̰� �������̱� �����̴�!!!!
						//TestVO�� num, name�� Ű�� ����� �ټ� ������ �� �ΰ��� ����.
						//������ ���������� ������ֱ� ���ؼ��� list, set, map�� ������ִ°���!
		// 1.list
		List<String> list = new ArrayList<String>(); // <>�� ���׸� : �����迭���� ��Ÿ�� �迭�̴ϱ� string!!!���������
		// List<String> list = new Vector<String>();
		// List<String> list = new LinkedList<String>();
		list.add("10040");
		list.add("10041");
		list.add("10042");
		list.add(String.valueOf(10043));
		list.add(new String(new char[] { 'a', 'b' }));
		list.add(new String(new char[] { 'a', 'b' }));
		list.add(new String(new char[] { 'a', 'b' }));
		list.add(list.toString()); // �ּҸ� ��ȯ�ϴϱ� ������ ����
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

		// 2.set:����������,�ߺ��Ұ�(����ũ�� ������)
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

		// 3.map ����������
		Map<String, String> map = new Hashtable<String, String>();
		map.put("key1", "kim1");
		map.put("key11", "kim2");
		map.put("key111", "kim3");
		map.put("key1111", "kim4");
		
		for (String key : map.keySet()) {
			//System.out.println(key); //���� �ٸ����� key1�� �ϳ��� ������⶧���� �ϳ��� ����̵�
			System.out.println(key+": "+map.get(key)); //������ ��� �� �ٸ��� ����!
		}
		
		//key1:{k1:kim,k2:kim1,k3:a1004,k4:bbb,k5:kim,k6:99}
		//key2:{kim,kim1,a1004,bbb,kim,99}
		//key3:{kim,kim1,a1004,bbb,kim,99}
		
		

		
		
		
		
	}

}
