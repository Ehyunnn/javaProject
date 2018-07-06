package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test01main {

	public static void main(String[] args) {
		System.out.println("network................");
		
		try {
			String address="http://192.168.0.163/IOTstudy177/javaProject/test15network/data.txt";
			URL url=new URL(address);// �ּ� �ٷ� �־�ǰ� �ʹ� �� address���� ������� �ͻ�!
			url.openConnection();
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			InputStream is = conn.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String data = "";
			String str = "";
			while ((str = br.readLine()) != null) {
				
				int total = 0;
				for (String x : str.split(":")) {
					total +=Integer.parseInt(x);
				}
				//System.out.println(str+">>>"+total);
				data += str+">>>"+total+"\n";
			}
				System.out.println(data);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
