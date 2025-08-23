package DetaSrc.org.deta.boot.vpc.sleeper;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

import C_A.OSI.AOP.MS.VPC.server.ServerSleeper_Standard;
import DetaSrc.org.deta.boot.rest.VPC;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class SleeperHall {
	private ConcurrentHashMap<Integer, Sleeper_X> sleepersMap;

	public SleeperHall() {
		sleepersMap = new ConcurrentHashMap<>();
	}

	public int getThreadsCount() {
		if (null == sleepersMap) {
			sleepersMap = new ConcurrentHashMap<>();
			return 0;
		}
		return sleepersMap.size();
	}

	public void addExecSleeper(Integer sid, Sleeper_X serverSleeper_Standard) {
		sleepersMap.put(sid, serverSleeper_Standard);
	}

	public void removeThreadById(Integer sid) {
		try {
			if (sleepersMap.containsKey(sid)) {
				Sleeper_X sleeper = (Sleeper_X) sleepersMap.get(sid);//later trif
				sleeper.closeAllBeforeGC();
				sleepersMap.remove(sid);
				sleeper = null;
				System.out.flush();
				System.out.println(sid + " -free");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void callSkivvy() {
		Iterator<Integer> iterater = sleepersMap.keySet().iterator();
		while (iterater.hasNext()) {
			Integer integer = iterater.next();
			Sleeper_X sleeper = (Sleeper_X) sleepersMap.get(integer);//later trif 
			if (null != sleeper) {
				if (!sleeper.getWaitingForShake()) {
					sleepersMap.remove(integer);
					sleeper = null;
					System.out.flush();
					System.out.println("" + integer
							+ new Date(System.currentTimeMillis()).toString()
							+ "-h free");
				}
			}
		}
	}

	public int getZipDownloadCount() {
		int output = 0;
		Iterator<Integer> iterator = sleepersMap.keySet().iterator();
		while (iterator.hasNext()) {
			if (VPC.getFilePath(sleepersMap.get(iterator.next()).getVPCSRequest().getRequestLink()).contains(".zip")) {
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