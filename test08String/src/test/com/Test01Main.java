package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("String.......");

		String str = "kiMss";
		System.out.println(str.equals("Kim"));// 대소문자까지 확실히 똑같은지 화인
		System.out.println(str.equalsIgnoreCase("kim")); // 알파벳만 맞는지 확인(대소문자구분없이)
		System.out.println(str.compareTo("kiM")); // 같은 갯수만 나옴
		System.out.println(str.compareTo("kiM") == 0);

		String str2 = "Hello java";
		System.out.println(str2.startsWith("Hel")); // Hel로 시작하는지 확인
		System.out.println(str2.endsWith("va"));// va로 끝나는지 확인
		str2 = "http://www.java.com/aaa/bbb/test.jpg";
		System.out.println(str2.startsWith("http://"));
		System.out.println(str2.endsWith(".jpg"));

		str2 = "무궁화 꽃이 피었습니다.";
		System.out.println(str2.charAt(0)); // 반환타입 char (한글자만 뽑아라)
		System.out.println(str2.charAt(5));
		System.out.println(str2.indexOf("무")); // "무"가 몇번 인덱스인가?
		System.out.println(str2.indexOf("궁"));
		System.out.println(str2.indexOf(" ")); // 첫번째 만나는 공백의 인덱스를 알려줌. 따라서 3
		System.out.println(str2.indexOf("."));
		System.out.println(str2.substring(5)); // 5번 인덱스 부터 끝까지 잘라라
		System.out.println(str2.substring(5, 6)); // 5번인덱스부터 6번인덱스까지 잘라라. 즉 5번인덱스만 나타내라
		System.out.println(str2.substring(5, 8));
		System.out.println(str2.concat("<<<<<<"));// 글자의 병합을 보여줄 뿐 바뀌는건 아님
		str2 = str2.concat("<<<<<<<");
		System.out.println(str2);
		str2 += "aaaa";
		System.out.println(str2);// 합친 결과를 반환! concat과는 확실히 다른 의미임!

		str2 = "AA";
		System.out.println(str2.hashCode());

		str2 = "http://aaa.com/test.png";
		System.out.println(str2.lastIndexOf("/"));
		System.out.println(str2.substring(str2.lastIndexOf("/")));
		System.out.println(str2.length());
		System.out.println(str2.replace('a', 'b')); // a를 찾아서 b로 바꾸라
		System.out.println(str2.replace("test", "java"));
		System.out.println(str2.toCharArray());// 한글자씩 배열로 변환해서 반환하라.to~:~로 바꿔라(메소드) object.메소드
		for (char x : str2.toCharArray()) {
			System.out.println(x);

		}
		String tmp = new String(str2.toCharArray());
		System.out.println(tmp);
		
		int x =99;
		System.out.println(String.valueOf(x));
		Integer x2 = x;//(int의 object타입:Integer)
		System.out.println(x2.toString());
		
		
		CharSequence st = "aaa";
		System.out.println(st.length());

	}

}
