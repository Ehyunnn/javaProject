package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("String.......");

		String str = "kiMss";
		System.out.println(str.equals("Kim"));// ��ҹ��ڱ��� Ȯ���� �Ȱ����� ȭ��
		System.out.println(str.equalsIgnoreCase("kim")); // ���ĺ��� �´��� Ȯ��(��ҹ��ڱ��о���)
		System.out.println(str.compareTo("kiM")); // ���� ������ ����
		System.out.println(str.compareTo("kiM") == 0);

		String str2 = "Hello java";
		System.out.println(str2.startsWith("Hel")); // Hel�� �����ϴ��� Ȯ��
		System.out.println(str2.endsWith("va"));// va�� �������� Ȯ��
		str2 = "http://www.java.com/aaa/bbb/test.jpg";
		System.out.println(str2.startsWith("http://"));
		System.out.println(str2.endsWith(".jpg"));

		str2 = "����ȭ ���� �Ǿ����ϴ�.";
		System.out.println(str2.charAt(0)); // ��ȯŸ�� char (�ѱ��ڸ� �̾ƶ�)
		System.out.println(str2.charAt(5));
		System.out.println(str2.indexOf("��")); // "��"�� ��� �ε����ΰ�?
		System.out.println(str2.indexOf("��"));
		System.out.println(str2.indexOf(" ")); // ù��° ������ ������ �ε����� �˷���. ���� 3
		System.out.println(str2.indexOf("."));
		System.out.println(str2.substring(5)); // 5�� �ε��� ���� ������ �߶��
		System.out.println(str2.substring(5, 6)); // 5���ε������� 6���ε������� �߶��. �� 5���ε����� ��Ÿ����
		System.out.println(str2.substring(5, 8));
		System.out.println(str2.concat("<<<<<<"));// ������ ������ ������ �� �ٲ�°� �ƴ�
		str2 = str2.concat("<<<<<<<");
		System.out.println(str2);
		str2 += "aaaa";
		System.out.println(str2);// ��ģ ����� ��ȯ! concat���� Ȯ���� �ٸ� �ǹ���!

		str2 = "AA";
		System.out.println(str2.hashCode());

		str2 = "http://aaa.com/test.png";
		System.out.println(str2.lastIndexOf("/"));
		System.out.println(str2.substring(str2.lastIndexOf("/")));
		System.out.println(str2.length());
		System.out.println(str2.replace('a', 'b')); // a�� ã�Ƽ� b�� �ٲٶ�
		System.out.println(str2.replace("test", "java"));
		System.out.println(str2.toCharArray());// �ѱ��ھ� �迭�� ��ȯ�ؼ� ��ȯ�϶�.to~:~�� �ٲ��(�޼ҵ�) object.�޼ҵ�
		for (char x : str2.toCharArray()) {
			System.out.println(x);

		}
		String tmp = new String(str2.toCharArray());
		System.out.println(tmp);
		
		int x =99;
		System.out.println(String.valueOf(x));
		Integer x2 = x;//(int�� objectŸ��:Integer)
		System.out.println(x2.toString());
		
		
		CharSequence st = "aaa";
		System.out.println(st.length());

	}

}
