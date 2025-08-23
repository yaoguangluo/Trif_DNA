package DetaSrc.org.deta.boot.vpc.vision;

import java.io.File;
import java.net.Socket;
import java.net.URLDecoder;

import DetaSrc.org.deta.boot.rest.VPC;
import DetaSrc.org.deta.boot.sets.StableSets;
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
public class ForwardVision {
	public static void main(String[] args) {
	}

	public static void getForwardType(Socket socket) {
	}

	public static void forwardToRestMap(Socket socket) {
	}

	public static void getForwardType(VPCSRequest vPCSRequest,
			VPCSResponse vPCSResponse) {
		try {
			if (vPCSRequest.getRequestIsRest()) {
				String filePath = VPC.getFilePath(vPCSRequest.getRequestLink());
				if (filePath.contains(".ttf") || filePath.contains(".eot")
						|| filePath.contains(".svg")
						|| filePath.contains(".woff")
						|| filePath.contains(".woff2")
						|| filePath.contains(".otf")) {
					String code = VPC.getCode(filePath);
					vPCSRequest.setRequestFilePath(filePath);
					vPCSRequest.setRequestFileCode(code);
					vPCSRequest.setRequestForwardType("bytes");
					vPCSResponse.setResponseContentType(
							"content-type: application/font-woff \n\n");
					return;
				}
				vPCSRequest.setRequestForwardType("rest");
				return;
			}
			String filePath = VPC.getFilePath(vPCSRequest.getRequestLink());
			String fileString = URLDecoder.decode(filePath, "UTF8");
			File file = new File(fileString);
			System.out.flush();
			System.out.println("-fi-" + fileString);
			if (!file.exists() || !file.isFile()) {
				fileString = URLDecoder.decode(filePath, "UTF8");
				File fileUTF8 = new File(fileString);
				System.out.flush();
				System.out.println("-fi-" + fileString);
				if (!fileUTF8.exists() || !fileUTF8.isFile()) {
					System.out.flush();
					System.out.println(vPCSResponse.getHashCode()
							+ "-getForwardType unfile err");
					vPCSResponse.setErrorCode(404);
					return; // fix later
				}
			}
			String code = VPC.getCode(filePath);
			vPCSRequest.setRequestFilePath(fileString);
			vPCSRequest.setRequestFileCode(code);
			// init---
			vPCSRequest.setRequestForwardType("bytes");
			vPCSResponse.setResponseContentType("content-type: text/html \n\n");
			// ---
			String[] stings = filePath.split("\\.");
			if (1 < stings.length) {
				stings[1] = stings[1] == null ? "" : stings[1];
				if (StableSets.contentTypes.containsKey(stings[1])) {
					if (stings[1].contains("js") || stings[1].contains("map")) {
						if (code.equalsIgnoreCase("UTF-8")) {
							vPCSResponse.setResponseContentType(
									StableSets.contentTypes.get(stings[1]));
							return;
						}
					}
					vPCSResponse.setResponseContentType(
							StableSets.contentTypes.get(stings[1]));
					return;
				}

			}
		} catch (Exception e) {
			System.out.flush();
			System.out.println(e.getMessage());
			System.out.flush();
			System.out.println(
					vPCSResponse.getHashCode() + "-getForwardType 204 err");
			vPCSResponse.setErrorCode(204);
		}
	}

	public static void forwardToRestMap(VPCSRequest vPCSRequest,
			VPCSResponse vPCSResponse) {
		try {
			if (vPCSRequest.getRequestForwardType() == null) {
				System.out.flush();
				System.out.println("-getRequestForwardType 204");
				vPCSResponse.setErrorCode(204);
				return;
			}
			if (vPCSRequest.getRequestForwardType().equalsIgnoreCase("rest")) {
				System.out.flush();
				System.out.println("-rest");
				RestMapVision_XP_rest.processRest(vPCSRequest, vPCSResponse);
				return;
			}
			if (vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytes")) {
				System.out.flush();
				System.out.println("-bytes");
				RestMapVision_XP_bytes.processBytes(vPCSRequest, vPCSResponse);
				return;
			}
		} catch (Exception e) {
			System.out.flush();
			System.out.println(e.getMessage());
			System.out.flush();
			System.out.println(
					vPCSResponse.getHashCode() + "-forwardToRestMap 204 err");
			vPCSResponse.setErrorCode(204);
		}
	}
}

// if(filePath.contains(".png")){
// vPCSResponse.setResponseContentType("content-type:
// image/png \n\n");
// return;
// }
// if(filePath.contains(".ico")){
// vPCSResponse.setResponseContentType("content-type:
// image/ico \n\n");
// return;
// }
// if(filePath.contains(".jpeg")){
// vPCSResponse.setResponseContentType("content-type:
// image/jpeg \n\n");
// return;
// }
// if(filePath.contains(".jpg")){
// vPCSResponse.setResponseContentType("content-type:
// image/jpg \n\n");
// return;
// }
// if(filePath.contains(".gif")){
// vPCSResponse.setResponseContentType("content-type:
// image/gif \n\n");
// return;
// }
// if(filePath.contains(".wav")){
// vPCSResponse.setResponseContentType("content-type:
// audio/wav \n\n");
// return;
// }
// if(filePath.contains(".js") &&
// code.equalsIgnoreCase("UTF-8")){
// vPCSResponse.setResponseContentType(
// "content-type: text/javascript; charset:UTF-8 \n\n");
// return;
// }
// if(filePath.contains(".map") &&
// code.equalsIgnoreCase("UTF-8")){//
// vPCSResponse.setResponseContentType(
// "content-type: text/plain; charset:UTF-8 \n\n");
// return;
// }
// if(filePath.contains(".css")){
// vPCSResponse.setResponseContentType("content-type:
// text/css \n\n");
// return;
// }
// if(filePath.contains(".html")){
// vPCSResponse.setResponseContentType("content-type:
// text/html \n\n");
// return;
// }
// if(filePath.contains(".txt")){
// vPCSResponse.setResponseContentType("content-type:
// text/plain \n\n");
// return;
// }
// if(filePath.contains(".xml")){
// vPCSResponse.setResponseContentType("content-type:
// application/xml \n\n");
// return;
// }
// if(filePath.contains(".pdf")){
// vPCSResponse.setResponseContentType("content-type:
// application/pdf \n\n");
// return;
// }
// if(filePath.contains(".zip")){
// vPCSResponse.setResponseContentType("content-type:
// application/zip \n\n");
// return;
// }
// if(filePath.contains(".rar")){
// vPCSResponse.setResponseContentType("content-type:
// application/rar \n\n");
// return;
// }
// if(filePath.contains(".jar")){
// vPCSResponse.setResponseContentType("content-type:
// application/jar \n\n");
// return;
// }
// if(filePath.contains(".pptx")){
// vPCSResponse.setResponseContentType("content-type:
// application/pptx \n\n");
// return;
// }

// if(!StableBlob.addBlobLimit(filePath,
// System.currentTimeMillis())) {//fix later
// System.out.flush();System.out.println(vPCSResponse.getHashCode()+"-dreaming
// asyc");
// vPCSResponse.returnCode(204);
// return;
// }
// 
// if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("buffer")){
//	 System.out.flush();
//	 System.out.println("-buffer");
//	 RestMapVision_XP_buffer.processBuffer(vPCSRequest, vPCSResponse);
//	 return;
// }
// if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytesBuffer")){
//	 System.out.flush();
//	 System.out.println("-bytesBuffer");
//	 RestMapVision_XP_bufferBytes.processBufferBytes(vPCSRequest, vPCSResponse);
//	 return;
// }
// if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytesWithoutZip")){
//	 System.out.flush();
//	 System.out.println("-bytesWithoutZip");
//	 RestMapVision_XP_bytesZip.processBytesWithoutZip(vPCSRequest, vPCSResponse);
//	 return;
// }