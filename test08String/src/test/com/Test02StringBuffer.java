package test.com;

public class Test02StringBuffer {

	public static void main(String[] args) {
		System.out.println("StringBuffer StringBuilder");
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("aaaa"); //String 이면 concat을 쓰지만, 여기선append를 사용
		sb.append("aaaa"); //concat은 =을 사용해서 넣어야하지만 append는 자동으로 넣어짐. 따라서 속도효율이 좋음!!!!
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		System.out.println(sb.toString());
		
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		System.out.println(sb2.toString());
		
		
		long startTime = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis()-startTime);
		
		
		//Test02StringBuffer.printRunTime1();
		//printRunTime1(); 5~6초
		//printRunTime2();//0.007초
		printRunTime3();//3초
		//같은 클래스에 있기 때문에 생략이 가능!
	}
	//메소드로 빼서 사용한다면?
	public static void printRunTime1() {  //->이렇게 넣으면 1600초 정도 넘게 걸림
		long startTime = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s +="ssss";
		}
		System.out.println(System.currentTimeMillis()-startTime);
	}
	
	
	public static void printRunTime2() { //->append를 이용하면 6초~7초 사이
		long startTime = System.currentTimeMillis();
		//String s = "";
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 100000; i++) {
			sb.append("ssss");
		}
		System.out.println(System.currentTimeMillis()-startTime);
	}

	
	public static void printRunTime3() { //->concat를 이용하면 3초
		long startTime = System.currentTimeMillis();
		String s = "";
	
		for (int i = 0; i < 100000; i++) {
			s= s.concat("ssss");
		}
		System.out.println(System.currentTimeMillis()-startTime);
	}
	
	//알고리즘을 작성할때 엔지니어로서 속도 효율을 계싼해봐. 무심코 썻던 알고리즘이 큰 속도저하를 가져올 수도 있다.
	

}
