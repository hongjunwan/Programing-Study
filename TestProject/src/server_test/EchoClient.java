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
			
			bw.write(" ==> 클라이언트 입니다.\n");
			bw.flush();
			
			String message = br.readLine();
			System.out.println("[서버 메세지]" + message);
		}catch(UnknownHostException e) {
			System.out.println("[경고] 서버를 찾을 수 없습니다.");
		}catch(IOException e) {
			System.out.println("[경고] 사용되지 않는 port 번호 입니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EchoClient();

	}

}
