package C_A.OSI.AOP.MS.VPC.server;

import S_A.pheromone.IMV_SIQ;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Map;

import DetaSrc.org.deta.boot.sets.VPCSRequest;
import DetaSrc.org.deta.boot.sets.VPCSResponse;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RequestFilter_C {
	static Map<String, Boolean> ipBlock;

	public static void main(String[] args) {

	}

	public static void requestIpFilter(Socket socket) {
	}

	public static void requestLinkFilter(Socket socket) {
	}

	public static void requestIpFilter(VPCSRequest vPCSRequest,
			VPCSResponse vPCSResponse) {
		// 过滤block
		if (ipBlock.containsKey(vPCSRequest.getRequestIp())) {
			vPCSResponse.returnErrorCode(403);
		}
		// 同源csrf
		try {
			if (vPCSRequest.getRequestIp().equalsIgnoreCase(
					InetAddress.getLocalHost().getHostAddress())) {
				// vPCSResponse.returnErrorCode(405);
			}
		} catch (UnknownHostException e) {
			throw new RuntimeException(e);
		}
	}

	public static void requestLinkFilter(VPCSRequest vpcsRequest,
			VPCSResponse vPCSResponse) {
		// //限制ddos
		// String ipCount= DetaDBUtil.cacheRequest("get?key="
		// + vpcsRequest.getRequestIp() + "&email="
		// + "313699483@qq.com" + "&password=" + "Fengyue1985!");
		// if(null== ipCount){
		// DetaDBUtil.cacheRequest("put?key="
		// + vpcsRequest.getRequestIp() + "&value=" + "1" + "&time="
		// + (2000+System.currentTimeMillis())
		// + "&email=" + "313699483@qq.com" + "&password=" +
		// "Fengyue1985!");
		// }else if(ipCount.contains("unsuccess")){
		// DetaDBUtil.cacheRequest("put?key="
		// + vpcsRequest.getRequestIp() + "&value=" + "1" + "&time="
		// + (2000+System.currentTimeMillis())
		// + "&email=" + "313699483@qq.com" + "&password=" +
		// "Fengyue1985!");
		// }else if(Integer.valueOf(ipCount) <= 30){
		// int digit= Integer.valueOf(ipCount) + 1;
		// DetaDBUtil.cacheRequest("put?key=" +
		// vpcsRequest.getRequestIp()
		// + "&value=" + digit + "&time="
		// + 0 + "&email=" + "313699483@qq.com"
		// + "&password=" + "Fengyue1985!");
		// }else{
		// vPCSResponse.returnErrorCode(400);
		// }
	}

	// 先注释掉 之后测试 20210405 罗瑶光
	// DB在此处出错后能能DMA读写了. 罗瑶光 20210406 稍后进行block list函数设计 优先级降低
	@SuppressWarnings("unchecked")
	public static void IV_BlockList() {
		ipBlock = new IMV_SIQ();
		// FileInputStream fileInputStream= new FileInputStream(
		// new File("src/main/resources/ipBlock.ips"));
		// InputStreamReader inputStreamReader= new
		// InputStreamReader(fileInputStream, "UTF-8");
		// DetaBufferedReader DetaBufferedReader= new
		// DetaBufferedReader(inputStreamReader);
		// String line= null;
		// while ((line= DetaBufferedReader.readDetaLine()) != null)
		// {
		// ipBlock.put(line, true);
		// }
		// DetaBufferedReader.close();
	}
}
