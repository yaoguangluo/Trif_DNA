package C_A.OSI.AOP.MS.VPC.server;

import O_V.OSI.AOP.VPC.rest.VPCYangliaojing;
import S_A.SVQ.stable.S_Web;

import java.net.Socket;

//import OSI.AOP.VPC.PP.port_E.RestLoginPort_E;
//import PEU.P.map.VtoV;
//合并 数据库和 前端的 vision文件
//罗瑶光 20210730
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ServerForward_Standard {
    public static void main(String[] args) {
    }

    public static void IQ_ForwardType(Socket socket) {
    }

    public static void forwardToRestMap(Socket socket) {
    }

    public static void IQ_ForwardType(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
        if (vPCSRequest.getRequestIsRest()) {
            String filePath = VPCYangliaojing.getFilePath(vPCSRequest.getRequestLink());
            if (filePath.contains(S_Web.FILE_TTF) || filePath.contains(S_Web.FILE_EOT)
                || filePath.contains(S_Web.FILE_SVG) || filePath.contains(S_Web.FILE_WOFF)
                || filePath.contains(S_Web.FILE_WOFF2) || filePath.contains(S_Web.FILE_OTF)) {
                String code = VPCYangliaojing.getCode(filePath);
                vPCSRequest.I_RequestFilePath(filePath);
                vPCSRequest.I_RequestFileCode(code);
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BUFFER);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_FONT_WOFF);
                return;
            }
            vPCSRequest.I_RequestForwardType(S_Web.STREAM_REST);
        } else {
            String filePath = VPCYangliaojing.getFilePath(vPCSRequest.getRequestLink());
            String code = VPCYangliaojing.getCode(filePath);
            vPCSRequest.I_RequestFilePath(filePath);
            vPCSRequest.I_RequestFileCode(code);
            if (filePath.contains(S_Web.FILE_PNG)) {
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BYTES);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_PNG);
            }
            if (filePath.contains(S_Web.FILE_JPEG)) {
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BYTES);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_JPEG);
            }
            if (filePath.contains(S_Web.FILE_JPG)) {
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BYTES);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_JPG);
            }
            if (filePath.contains(S_Web.FILE_GIF)) {
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BYTES);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_GIF);
            }
            if (filePath.contains(S_Web.FILE_JS)
                && code.equalsIgnoreCase(S_Web.CHARSET_UTF_8)) {
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BYTES_BUFFER);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_JS);
            }
            if (filePath.contains(S_Web.FILE_CSS)) {
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BUFFER);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_CSS);
            }
            if (filePath.contains(S_Web.FILE_HTML)) {
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BUFFER);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_HTML);
            }
            if (filePath.contains(S_Web.FILE_PDF)) {
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BYTES_WITHOUT_ZIP);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_PDF);
            }
            if (filePath.contains(S_Web.FILE_ZIP)) {
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BYTES_WITHOUT_ZIP);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_ZIP);
            }
            if (filePath.contains(S_Web.FILE_WAV)) {
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BUFFER);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_WAV);
            }
            if (filePath.contains(S_Web.FILE_RAR)) {
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BYTES_WITHOUT_ZIP);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_RAR);
            }
            if (filePath.contains(S_Web.FILE_XML)) {
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BYTES_WITHOUT_ZIP);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_XML);
            }
            if (filePath.contains(S_Web.FILE_TXT)) {
                vPCSRequest.I_RequestForwardType(S_Web.STREAM_BYTES_WITHOUT_ZIP);
                vPCSResponse.I_ResponseContentType(S_Web.HEADER_CONTENT_TYPE_TXT);
            }
        }
    }

    public static void forwardToRestMap(VPCSRequest vPCSRequest
        , VPCSResponse vPCSResponse) {
        if (vPCSRequest.getRequestForwardType() == null) {
            vPCSResponse.return404();
            return;
        }
        if (vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_REST)) {
            ServerRestMap_Standard.P_Rest(vPCSRequest, vPCSResponse);
        }
        if (vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_BYTES)) {
            ServerRestMap_Standard.P_Bytes(vPCSRequest, vPCSResponse);
        }
        if (vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_BUFFER)) {
            ServerRestMap_Standard.P_Buffer(vPCSRequest, vPCSResponse);
        }
        if (vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_BYTES_BUFFER)) {
            ServerRestMap_Standard.P_BufferBytes(vPCSRequest, vPCSResponse);
        }
        if (vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_BYTES_WITHOUT_ZIP)) {
            ServerRestMap_Standard.P_BytesWithoutZip(vPCSRequest, vPCSResponse);
        }
    }
}


//	public static void forwardToRestMap(App app, VPCSRequest vPCSRequest
//			, VPCSResponse vPCSResponse)  {
//		if(null== vPCSRequest || null== vPCSRequest.getRequestForwardType()){
//			vPCSResponse.return404();
//			return;
//		}
//		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_REST)){
//			//与其设计个sleeper继承, 不如在这里设计个condition函数
//, 然后根据port识别 来继承这个condition 就是了。, 罗瑶光 20210730
//			if(vPCSRequest.getRequestPort().equals(S_HTTP.PORT_DATABASE)) {
//				RestMap_V.P_RestDB(app, vPCSRequest, vPCSResponse);
//			}else {
//				RestMap_V.P_Rest(app, vPCSRequest, vPCSResponse);
//			}
//		}
//		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_BYTES)){
//			RestMap_V.P_Bytes(vPCSRequest, vPCSResponse);
//		}
//		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_BUFFER)){
//			RestMap_V.P_Buffer(vPCSRequest, vPCSResponse);
//		}
//		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_BYTES_BUFFER)){
//			RestMap_V.P_BufferBytes(vPCSRequest, vPCSResponse);
//		}
//		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_BYTES_WITHOUT_ZIP)){
//			RestMap_V.P_BytesWithoutZip(vPCSRequest, vPCSResponse);
//		}
//	}