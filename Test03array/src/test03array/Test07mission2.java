package test03array;

public class Test07mission2 {

	public static void main(String[] args) {
		System.out.println("mission");

		// ��ȣ �̸� ���� ���� ���� ���� ��� ���
		String[] titles= new String[]{ "��ȣ", "�̸�", "����", "����", "����", "����", "���", "���" };
		for (int i = 0; i < titles.length; i++) {
			System.out.print(titles[i]+" ");
		}
		System.out.println();
		
		
		// 1 ȫ�浿1 99 88 77 264 88 A
		String[] row01 = new String[] { "1", "ȫ�浿1", "99", "88", "77", null, null, null }; //null���� �⺻������� �ؿ��� ������ ���� �Է���.
		
		row01[5]=""+(Integer.parseInt(row01[2])+Integer.parseInt(row01[3])+Integer.parseInt(row01[4]));
		row01[6]=""+Integer.parseInt(row01[5])/3.0;
		
		//String grade = null; grade�� ���� �迭�����ʿ����. �ֳ��ϸ� ������ row01[7]�ڸ��� ������!!!
		//����� ���� �տ����� �������������鼭 avg�� �迭�� �°� ������
		switch ((int) Double.parseDouble(row01[6]) / 10) {//row01[6]�� �ᱹ�� ���ڿ��� �ν��̵Ǵϱ� ���ڷ� ����� ���� ����.�Ľ�����
		case 10:
		case 9:
			row01[7] = "A";
			break;
		case 8:
			row01[7] = "B";
			break;
		case 7:
			row01[7] = "C";
			break;
		default:
			row01[7] = "����";
			break;
		}
		
		for (int i = 0; i < row01.length; i++) {
			System.out.print(row01[i] + " ");
		}
		System.out.println();
		
		
		// 2 ȫ�浿2 99 88 77 264 88 A
String[] row02 = new String[] { "2", "ȫ�浿2", "20", "30", "10", null, null, null }; //null���� �⺻������� �ؿ��� ������ ���� �Է���.
		
		row02[5]=""+(Integer.parseInt(row02[2])+Integer.parseInt(row02[3])+Integer.parseInt(row02[4]));
		row02[6]=""+Integer.parseInt(row02[5])/3.0;
		
		//String grade = null; grade�� ���� �迭�����ʿ����. �ֳ��ϸ� ������ row01[7]�ڸ��� ������!!!
		//����� ���� �տ����� �������������鼭 avg�� �迭�� �°� ������
		switch ((int) Double.parseDouble(row02[6]) / 10) {//row01[6]�� �ᱹ�� ���ڿ��� �ν��̵Ǵϱ� ���ڷ� ����� ���� ����.�Ľ�����
		case 10:
		case 9:
			row02[7] = "A";
			break;
		case 8:
			row02[7] = "B";
			break;
		case 7:
			row02[7] = "C";
			break;
		default:
			row02[7] = "����";
			break;
		}
		
		for (int i = 0; i < row02.length; i++) {
			System.out.print(row02[i] + " ");
		}
		System.out.println();
		// 3 ȫ�浿3 99 88 77 264 88 A
		
String[] row03 = new String[] { "2", "ȫ�浿2", "90", "90", "90", null, null, null }; //null���� �⺻������� �ؿ��� ������ ���� �Է���.
		
		row03[5]=""+(Integer.parseInt(row03[2])+Integer.parseInt(row03[3])+Integer.parseInt(row03[4]));
		row03[6]=""+Integer.parseInt(row03[5])/3.0;
		
		//String grade = null; grade�� ���� �迭�����ʿ����. �ֳ��ϸ� ������ row01[7]�ڸ��� ������!!!
		//����� ���� �տ����� �������������鼭 avg�� �迭�� �°� ������
		switch ((int) Double.parseDouble(row03[6]) / 10) {//row01[6]�� �ᱹ�� ���ڿ��� �ν��̵Ǵϱ� ���ڷ� ����� ���� ����.�Ľ�����
		case 10:
		case 9:
			row03[7] = "A";
			break;
		case 8:
			row03[7] = "B";
			break;
		case 7:
			row03[7] = "C";
			break;
		default:
			row03[7] = "����";
			break;
		}
		
		for (int i = 0; i < row03.length; i++) {
			System.out.print(row03[i] + " ");
		}
		System.out.println();
		// �迭�� �̿��Ͽ� ���� ���� ����ϵ��� �Ͻÿ�.
		
		
		
		
		String[][] students = new String[4][titles.length]; //title���⿡ 8�־ ����
		//String[][] students = new String[][]{titles,row01,row02,row03}
		students[0]=titles;
		students[1]=row01;
		students[2]=row02;
		students[3]=row03;
		
		for (int x = 0; x < students.length; x++) {
			for (int i = 0; i < students[x].length; i++) {
				System.out.print(students[x][i]+" ");
			}
			System.out.println();
		}
		
		
	}

}
