package DetaSrc.org.deta.boot.vpc.sleeper;
import java.io.IOException;
import java.net.ServerSocket;

import DetaSrc.org.deta.boot.sets.StableBlob;

/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */public class TimeHall extends Thread implements Runnable{
	 public boolean waitingForShake= false;
	 private ServerSocket serverSocket;
	 private SleeperHall sleeperHall;
	 private int maxLimist = 0; 
	 public void registerServer(ServerSocket server) throws IOException {
			 serverSocket = server;
	 }

	 public void registerSleeperHall(SleeperHall hall) {
			if(null== sleeperHall) {
				this.sleeperHall = hall;
			}
	 }
	 
	 public TimeHall(){
		
	 }

	 public void resetLimists() {
		 maxLimist = 70; 
	 }
	 public int getMaxLimist() {
		 maxLimist -= 1;
		 System.out.flush();System.out.println(maxLimist); 
		 return maxLimist;
	 }
	 public void run(){
		 while(true) {
			 try {
				 maxLimist = 70;
				 Thread.sleep(1000 * 60 * 15);
				 if(null!=serverSocket) {
					 if(null!= this.sleeperHall) {
						sleeperHall.callSkivvy();
						StableBlob.checkException();
					 }					
				 }
			 } catch (InterruptedException e) {
				 e.printStackTrace();
			 } 
		 }
	 }
 }