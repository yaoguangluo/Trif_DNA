package DetaSrc.org.deta.boot.sets;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
//���� ������
/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */
public class Response_S{

	public InputStream inputStream;
	public FileInputStream fileInputStream;
	public InputStreamReader inputStreamReader; 
	public BufferedReader bufferedReader;

	protected OutputStream outputStream;
	public PrintWriter printWriter;
	public DataOutputStream dataOutputStream;
	public ByteArrayOutputStream byteArrayOutputStream;
	public BufferedWriter bufferedWriter; 

	public Socket socket;
	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public void closeInputStream() throws IOException {
		if(null!= inputStream) {
			inputStream.close();
		}
	}

	public void closeOutputStream() throws IOException {
		if(null!= outputStream) {
			outputStream.close();
		}
	}

	public void closePrintWriter() throws IOException {
		if(null!= printWriter) {
			printWriter.close();
		}
	}

	public void closeAllBeforeGC() {
		try { 
			if(null != fileInputStream) {
				fileInputStream.close();
			}
			fileInputStream = null;
			if(null != inputStreamReader) {
				inputStreamReader.close(); 
			}
			inputStreamReader = null;
			if(null != bufferedReader) {
				bufferedReader.close();
			}
			bufferedReader = null;
			if(null != inputStream) {
				inputStream.close();
			}
			inputStream = null;
			if(null != dataOutputStream) {
				dataOutputStream.close();
			}
			dataOutputStream = null;
			if(null != byteArrayOutputStream) {
				byteArrayOutputStream.close();
			}
			byteArrayOutputStream = null;
			if(null != bufferedWriter) {
				if(!socket.isClosed()) {
					bufferedWriter.close();}
			}
			bufferedWriter = null;
			if(null != printWriter) {
				if(!socket.isClosed()) {
					printWriter.close();}
			}
			printWriter = null;
			if(null != outputStream){
				outputStream.close();
			}
			outputStream = null;
			if(null != socket) {
				socket.close();
				while(!this.socket.isClosed()) {
					Thread.sleep(1000);
				}
			}
			socket = null;
		}catch(Exception e) {
			System.out.flush();
			System.out.println("-closeAllBeforeGC err");
			//StableBlob.addException();
			e.printStackTrace();
		}
	}

	public void feedAndCloseAllBeforeGC() {
		try { 
			if(null!=this.socket) {
				if(null!= fileInputStream) {
					fileInputStream.close();}

				if(null!= inputStreamReader) {
					inputStreamReader.close(); }

				if(null!= bufferedReader) {
					bufferedReader.close();}

				if(null!= inputStream) {
					inputStream.close();}

				if(null!= dataOutputStream) {
					dataOutputStream.close();}

				if(null!= byteArrayOutputStream) {
					byteArrayOutputStream.close();}

				if(null!= bufferedWriter) {
					if(!socket.isClosed()) {
						bufferedWriter.close();}}

				if(null!= printWriter) {
					if(!socket.isClosed()) {
						printWriter.close();}}

				if(null!= outputStream){
					outputStream.close();}

				if(null!=socket) {
					socket.close();
				}
				while(!this.socket.isClosed()) {
					Thread.sleep(1000);
				}
			}
		}catch(Exception e) {
			System.out.flush();System.out.println("-closeAllBeforeGC err");
			//StableBlob.addException();
			//e.printStackTrace();
		}
	}

	public void closeSocket() throws IOException {
		if(null!= socket) {
			socket.close();
		}
	}

	public void registInputStream(InputStream inputStream) {
		// TODO Auto-generated method stub
		this.inputStream = inputStream;
	}

	public void doPrintWriter(Integer errorCode) throws IOException {
		if(null == outputStream) {
			outputStream= this.socket.getOutputStream(); 
			printWriter = new PrintWriter(outputStream, true);
			printWriter.flush();
			printWriter.println("HTTP/1.1 " + errorCode + " OK\n\n"); 
			printWriter.close();
		}
	} 
 }