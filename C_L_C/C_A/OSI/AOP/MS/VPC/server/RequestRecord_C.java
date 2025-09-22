package C_A.OSI.AOP.MS.VPC.server;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.SVQ.stable.S_Pos;
import S_A.SVQ.stable.S_Web;
import S_A.pheromone.IMV_SIQ;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

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
public class RequestRecord_C {

	public static void requestIpRecoder(VPCSRequest vPCSRequest,
			VPCSResponse vPCSResponse) {
		vPCSRequest.setRequestIp(
				vPCSResponse.getSocket().getInetAddress().getHostAddress());
		vPCSRequest.setRequestName(
				vPCSResponse.getSocket().getInetAddress().getHostName());
	}

	@SuppressWarnings({ "unused", "resource", "unchecked" })
	public static void requestLinkRecoder(VPCSRequest vPCSRequest,
			VPCSResponse vPCSResponse) {
		DetaBufferedReader br = null;
		try {
			br = new DetaBufferedReader(DetaInputStreamReader.E(
					vPCSResponse.getSocket().getInputStream(),
					S_Web.CHARSET_UTF8));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		String mess = br.readDetaLine();
		if (mess.contains("替") || mess.contains("改") || mess.contains("写")
				|| mess.contains("换") || mess.contains("删")
				|| mess.contains("增") || mess.contains("更")
				|| mess.contains("rop") || mess.contains("rea")
				|| mess.contains("elet") || mess.contains("ate")
				|| mess.contains("ert") || mess.contains("lace")
				|| mess.contains("转")) {
			vPCSResponse.returnCode(S_Web.HTTP_400);
			return;
		}
		if (null == mess) {
			vPCSResponse.returnErrorCode(S_Web.HTTP_400);
			return;
		}
		if (mess.equalsIgnoreCase(S_Web.STRING_EMPTY)) {
			vPCSResponse.returnErrorCode(S_Web.HTTP_400);
			return;
		}
		String[] type = mess.split(S_Web.STRING_SPACE);
		if (type.length < S_Pos.INT_TWO) {
			vPCSResponse.returnErrorCode(S_Web.HTTP_500);
			return;
		}
		String[] content = type[S_Pos.INT_ONE]
				.split(S_Web.STRING_SLASH_QUESTION);
		if (content.length == S_Pos.INT_TWO) {
			vPCSRequest.setRequestIsRest(true);
			if (content[S_Pos.INT_ONE] == null) {
				vPCSResponse.returnErrorCode(S_Web.HTTP_500);
				return;
			}
		}
		if (content[S_Pos.INT_ZERO].contains(S_Web.STRING_QUATE)) {
			// vPCSRequest.I_RequestIsRest(false);
		}
		if (vPCSRequest.getRequestIsRest()) {
			String[] column = content[S_Pos.INT_ONE]
					.split(S_Web.STRING_JUNCTION);
			IMV_SIQ data = new IMV_SIQ();
			for (String cell : column) {
				String[] cells = cell.split(S_Web.MATH_EQUAL);
				try {
					data.put(cells[S_Pos.INT_ZERO], URLDecoder
							.decode(cells[S_Pos.INT_ONE], S_Web.CHARSET_UTF_8));
				} catch (UnsupportedEncodingException e) {
					throw new RuntimeException(e);
				}
			}
			vPCSRequest.setRequestValue(data);
		}
		vPCSRequest.setRequestLink(content[S_Pos.INT_ZERO]);
	}
}
