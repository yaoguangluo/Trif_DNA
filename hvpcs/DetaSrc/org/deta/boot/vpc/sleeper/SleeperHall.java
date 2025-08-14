package DetaSrc.org.deta.boot.vpc.sleeper;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

import DetaSrc.org.deta.boot.rest.VPC;
/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */public class SleeperHall{
	private ConcurrentHashMap<Integer, Sleeper> sleepersMap;
	public SleeperHall(){
		sleepersMap = new ConcurrentHashMap<>();
	}
	
	public int getThreadsCount() {
		if(null== sleepersMap) {
			sleepersMap= new ConcurrentHashMap<>();
			return 0;
		}
		return sleepersMap.size();
	}
	
	public void addExecSleeper(Integer sid, Sleeper sleeper) {
		sleepersMap.put(sid, sleeper);
	}
	
	public void removeThreadById(Integer sid) {
		try {
			if(sleepersMap.containsKey(sid)){
				Sleeper sleeper = sleepersMap.get(sid);
				sleeper.closeAllBeforeGC();
				sleepersMap.remove(sid);
				sleeper = null;
				System.out.flush();System.out.println(sid + " -free");
			} 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void callSkivvy(){
		Iterator<Integer> iterater= sleepersMap.keySet().iterator();
		while(iterater.hasNext()) {
			Integer integer = iterater.next();
			Sleeper sleeper = sleepersMap.get(integer);
			if(null!=sleeper) {
				if(!sleeper.getWaitingForShake()) {
					sleepersMap.remove(integer);
					sleeper = null;
					System.out.flush();System.out.println("" + integer 
							+ new Date(System.currentTimeMillis()).toString() + "-h free");
				}
			}
		}
	}

	public int getZipDownloadCount() {
		int output= 0;
		Iterator<Integer> iterator= sleepersMap.keySet().iterator();
		while(iterator.hasNext()) {
			if(VPC.getFilePath(sleepersMap.get(iterator.next())
					.getVPCSRequest().getRequestLink()).contains(".zip")){
				output++;
			}
		}
		return output;
	}

	public void clearWaitingState() {
//		// TODO Auto-generated method stub
//		Iterator<Integer> iterater= sleepersMap.keySet().iterator();
//		while(iterater.hasNext()) {
//			Integer integer= iterater.next();
//			Sleeper sleeper= sleepersMap.get(integer);
//			if(!sleeper.waitingForShake) {
//				sleeper.closeAllBeforeGC();
//				Thread.sleep(10);
//			} 
//		}
	}
}