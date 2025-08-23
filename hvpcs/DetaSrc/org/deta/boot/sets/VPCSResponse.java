package DetaSrc.org.deta.boot.sets;

import java.io.IOException;
import java.io.PrintWriter;

import DetaSrc.org.deta.boot.vpc.sleeper.SleeperHall;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class VPCSResponse extends Response_S {
	public boolean huashengketest = false;
	public int errorCode;
	public Integer hashCode;
	private String ResponseContentType;
	public SleeperHall sleeperHall;

	public SleeperHall getSleeperHall() {
		return sleeperHall;
	}

	public void setSleeperHall(SleeperHall sleeperHall) {
		this.sleeperHall = sleeperHall;
	}

	public Integer getHashCode() {
		return hashCode;
	}

	public void setHashCode(Integer hashCode) {
		this.hashCode = hashCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getResponseContentType() {
		return ResponseContentType;
	}

	public void setResponseContentType(String responseContentType) {
		ResponseContentType = responseContentType;
	}

	public void returnNull() throws IOException {
		if (null != inputStream) {
			inputStream.close();
		}
		if (null != this.socket) {
			socket.close();
		}
		this.sleeperHall.removeThreadById(this.hashCode);
		System.out.flush();
		System.out.println(this.getHashCode() + "-fatar");
		this.sleeperHall.callSkivvy();
	}

	public void returnCode(Integer errorCode) {
		try {
			if (errorCode == 204) {
				System.out.flush();
				System.out.println(this.getHashCode() + "-bicha");
			}
			if (null == this.socket) {
				closeAllBeforeGC();
				this.sleeperHall.removeThreadById(this.hashCode);
				return;
			}
			if (!this.socket.isClosed()) {
				doPrintWriter(errorCode);
				if (null != inputStream) {
					inputStream.close();
				}
				this.socket.close();
			}
			if (null != inputStream) {
				inputStream.close();
			}
			closeAllBeforeGC();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clearBuffer() {
		this.sleeperHall.removeThreadById(this.hashCode);
		System.out.flush();
		System.out.println(this.hashCode + " -clear");
	}

	// old interface
	public void return404() {
		try {
			if (socket.isClosed()) {
				this.sleeperHall.removeThreadById(this.hashCode);
				return;
			}
			PrintWriter pw = new PrintWriter(this.socket.getOutputStream(),
					true);
			pw.println("HTTP/1.1 404 OK\n\n");
			pw.flush();
			pw.close();
			socket.close();
			this.sleeperHall.removeThreadById(this.hashCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void returnErrorCode(Integer errorCode) {
		try {
			if (socket.isClosed()) {
				this.sleeperHall.removeThreadById(this.hashCode);
				return;
			}
			PrintWriter pw = new PrintWriter(this.socket.getOutputStream(),
					true);
			pw.println("HTTP/1.1 " + errorCode + " OK\n\n");
			pw.flush();
			pw.close();
			socket.close();
			this.sleeperHall.removeThreadById(this.hashCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}