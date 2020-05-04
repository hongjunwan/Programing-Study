package server_test;

import java.io.*;
import java.net.*;

public class EchoClient {
	public EchoClient() {
		try {
			Socket s = new Socket("localhost", 3000);
			
			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			bw.write(" ==> Ŭ���̾�Ʈ �Դϴ�.\n");
			bw.flush();
			
			String message = br.readLine();
			System.out.println("[���� �޼���]" + message);
		}catch(UnknownHostException e) {
			System.out.println("[���] ������ ã�� �� �����ϴ�.");
		}catch(IOException e) {
			System.out.println("[���] ������ �ʴ� port ��ȣ �Դϴ�.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EchoClient();

	}

}
