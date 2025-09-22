package DetaSrc.org.deta.boot.sets;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public interface StableSets {
	public List<byte[]> stableListPartBytes= new ArrayList<>();
	public Map<String, String> contentTypes= new HashMap<>();
	public static List<byte[]> getListPartBytes() {
		List<byte[]> output= new ArrayList<>();
		output.addAll(stableListPartBytes);
		return output;
	}
	
	public static void intListPartBytes() {
		try {
			if(stableListPartBytes.isEmpty()) { 
				stableListPartBytes.add("HTTP/1.1 200 OK \n".getBytes("UTF8"));
				stableListPartBytes.add("Host:deta software  \n".getBytes("UTF8"));
				stableListPartBytes.add("Accept-Ranges: bytes \n".getBytes("UTF8"));
				stableListPartBytes.add("Content-Encoding:Gzip \n".getBytes("UTF8"));
				stableListPartBytes.add("Cache-control: max-age=315360000 \n".getBytes("UTF8"));
			} 
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	public static void initHttpContentTypeMap() {
		if(contentTypes.isEmpty()) { 
			contentTypes.put("png", "content-type: image/png \n\n");
			contentTypes.put("ico", "content-type: image/ico \n\n");
			contentTypes.put("jpeg", "content-type: image/jpeg \n\n");
			contentTypes.put("jpg", "content-type: image/jpg \n\n");
			contentTypes.put("gif", "content-type: image/gif \n\n");
			contentTypes.put("wav", "content-type: audio/wav \n\n");
			contentTypes.put("js", "content-type: text/javascript; charset:UTF-8  \n\n");
			contentTypes.put("map", "content-type: text/plain; charset:UTF-8  \n\n");
			contentTypes.put("css", "content-type: text/css \n\n");
			contentTypes.put("html", "content-type: text/html \n\n");
			contentTypes.put("txt", "content-type: text/plain \n\n");
			contentTypes.put("xml", "content-type: application/xml \n\n");
			contentTypes.put("pdf", "content-type: application/pdf \n\n");
			contentTypes.put("zip", "content-type: application/zip \n\n");
			contentTypes.put("rar", "content-type: application/rar \n\n");
			contentTypes.put("jar", "content-type: application/jar \n\n");
			contentTypes.put("pptx", "content-type: application/pptx \n\n");
		}
	}
 }
