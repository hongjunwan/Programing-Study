package server_test;

import java.io.*;
import java.net.*;

public class EchoServer {
	public EchoServer() {
		try {
			ServerSocket ss = new ServerSocket(3000);
			System.out.println("===���� ����===");
			
			Socket s = ss.accept();
			System.out.println("=Ŭ���̾�Ʈ ���� ���� ����=");
			
			InetAddress userInfo = s.getInetAddress();
			String ip = userInfo.getHostAddress();
			System.out.println("[" + ip + "] �� ����");
			
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			
			String message = br.readLine();
			System.out.println("[�޼���]" + message);
			
			bw.write("["+ip+"]�� ȯ���մϴ�.\n");
			bw.flush();
		}catch(IOException e) {
			System.out.println("[���] �ش� port�� ������Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		new EchoServer();
	}
}
