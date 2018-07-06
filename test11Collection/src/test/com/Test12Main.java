package test.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test12Main {

	public static void main(String[] args) {
		System.out.println("Collection.....");
		
		
		//(매개변수):메소드 생성자 꾸러미 {객체}:블럭과 배열꾸러미,[배열]:배열에 사용된 꾸러미
		//1,2,3,4,5
		//[1,2,3,4,5]
		//{a1:1,a2:2,a3:3,a4:4,a5:5}
		//{arr1:[1,2,3,4,5], arr2:[10,20,30,40,50]}
		//[[1,2,3,4,5],[1,2,3,4,5]]
		
		
		//[{a1:1,a2:2,a3:3,a4:4,a5:5},{a1:1,a2:2,a3:3,a4:4,a5:5}]
		TestVO[] vos = new TestVO[2];
		List<TestVO> list = new ArrayList<TestVO>();
		TestVO vo = new TestVO();
		list.add(new TestVO());
		list.add(new TestVO());
		list.add(new TestVO());
		System.out.println("list.size():"+list.size());
		
		
		//[{a1:1,a2:2,a3:3,a4:4,a5:5},{a1:1,a2:2,a3:3,a4:4,a5:5}]
		Set<TestVO> set = new HashSet<TestVO>();
		set.add(vo);
		set.add(vo);
		set.add(vo);
		System.out.println("set.size() :"+set.size());
	
		//{"vo1":{num:0,name=null},"vo2":{num:0,name=null},"vo3":{num:0,name=null}}
		//오브젝트이기때문에 순서는 의미가 없지만 키에 따라서 다라짐.
		Map<String,TestVO> map = new HashMap<String, TestVO>();
		map.put("vo1", vo);
		map.put("vo2", vo);
		map.put("vo3", vo);
		System.out.println("map.size():"+map.size());
		
		
		
		//[{"vo1":{num:0,name=null},"vo2":{num:0,name=null},"vo3":{num:0,name=null}}]
		//이렇게 나타낼 경우 [3],list,set 모두 사용가능! ,중복허용하고 싶으면 list
		List<Map<String,TestVO>> maps = new ArrayList<Map<String,TestVO>>();
		maps.add(map);
		maps.add(map);
		maps.add(map);
		
		//{key1:{}, key2:{}} ->map, vo
		//{key1:[{},{}] key2:[{}],key3[{{},{},{}]} ->map만들어서 key부여하고 그 안의 내용은 list(가변허용)
		Map<String, List<TestVO>> mm = new Hashtable<String, List<TestVO>>();
		mm.put("key1", new ArrayList<TestVO>());
		mm.put("key2", new ArrayList<TestVO>());
		mm.put("key3", new ArrayList<TestVO>());
		
		
	}

}
