package U_V.ESU.http;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.ESU.code.stable.S_;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

//作者+ 著作权人： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class HttpUnicode {
    //这个函数在作者去年开发股市分析软件的时候从雪球等网站采样抓数据, 发现有UTF8
    //utf-8 gb2312 ascii 等格式数据比较混乱, 于是进行统一格式处理。
    public String getJson(String urlString, String jsonString) {
        StringBuilder stringBuilder = new StringBuilder();
        DetaBufferedReader DetaBufferedReader = null;
        try {
            String code = S_.STRING_EMPTY;
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(S_.HTTP_GET);
            connection.setRequestProperty(S_.CONTENT_TYPE, S_.APPLICATION_JSON_UTF8);
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            StringBuffer sbuffer = new StringBuffer();
            sbuffer.append(jsonString);
            OutputStream os = connection.getOutputStream();
            os.write(sbuffer.toString().getBytes());
            os.flush();
            InputStream inputStream = connection.getInputStream();
            int caherset_size = connection.getHeaderFields().size();
            for (int i = 0; i < caherset_size; i++) {
                String temp = connection.getHeaderField(i);
                if (temp.contains(S_.CHARSET)) {
                    if (temp.toUpperCase().contains(S_.CHARSET_UTF8)) {
                        code = S_.CHARSET_UTF8;
                    }
                    if (temp.toUpperCase().contains(S_.CHARSET_UTF_8)
                            || temp.toUpperCase().contains(S_.CHARSET_UTF8)) {
                        code = S_.CHARSET_UTF_8;
                    }
                    if (temp.toUpperCase().contains(S_.CHARSET_GB2312)) {
                        code = S_.CHARSET_GB2312;
                    }
                    if (temp.toUpperCase().contains(S_.CHARSET_ASCII)) {
                        code = S_.CHARSET_ASCII;
                    }
                    if (temp.toUpperCase().contains(S_.CHARSET_UNICODE)) {
                        code = S_.CHARSET_UNICODE;
                    }
                    if (temp.toUpperCase().contains(S_.CHARSET_ISO_8859_1)) {
                        code = S_.CHARSET_ISO_8859_1;
                    }
                }
            }
            if (null != inputStream) {
                DetaBufferedReader = new DetaBufferedReader(DetaInputStreamReader.E(
                        inputStream, code));
                String lines;
                while ((lines = DetaBufferedReader.readDetaLine()) != null) {
                    stringBuilder.append(lines);
                }
            } else {
                stringBuilder.append(S_.STRING_EMPTY);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (null != DetaBufferedReader) {
                try {
                    DetaBufferedReader.close();
                } catch (IOException ex) {
                    //throw ex;
                }
            }
        }
        try {
            return new String(stringBuilder.toString().getBytes(), S_.CHARSET_UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public String postXML(String urlString, String XMLString) {
        DetaBufferedReader DetaBufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        String requestBody = S_.STRING_EMPTY;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(S_.HTTP_POST);
            connection.setRequestProperty(S_.CONTENT_TYPE, S_.APPLICATION_XML);
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(XMLString);
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(stringBuffer.toString().getBytes());
            outputStream.flush();
            InputStream inputStream = connection.getInputStream();
            if (null != inputStream) {
                DetaBufferedReader = new DetaBufferedReader(DetaInputStreamReader.E(inputStream));
                char[] charBuffer = new char[128];
                int bytesRead = -1;
                while ((bytesRead = DetaBufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append(S_.STRING_EMPTY);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (null != DetaBufferedReader) {
                try {
                    DetaBufferedReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        requestBody = stringBuilder.toString();
        return requestBody;
    }

    public String postJsonWithSercurity(String urlString, String jsonString) {
        String requestBody = S_.STRING_EMPTY;
        StringBuilder stringBuilder = new StringBuilder();
        DetaBufferedReader DetaBufferedReader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(S_.HTTP_POST);
            connection.setRequestProperty(S_.CONTENT_TYPE, S_.APPLICATION_JSON);
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            StringBuffer sbuffer = new StringBuffer();
            sbuffer.append(jsonString);
            OutputStream os = connection.getOutputStream();
            os.write(sbuffer.toString().getBytes());
            os.flush();
            InputStream inputStream = connection.getInputStream();
            if (null != inputStream) {
                DetaBufferedReader = new DetaBufferedReader(DetaInputStreamReader.E(inputStream));
                char[] charBuffer = new char[128];
                int bytesRead = -1;
                while ((bytesRead = DetaBufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append(S_.STRING_EMPTY);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (null != DetaBufferedReader) {
                try {
                    DetaBufferedReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        requestBody = stringBuilder.toString();
        return requestBody;
    }

    public String postXMLWithSercurity(String urlString, String XMLString) {
        String requestBody = S_.STRING_EMPTY;
        StringBuilder stringBuilder = new StringBuilder();
        DetaBufferedReader DetaBufferedReader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(S_.HTTP_POST);
            connection.setRequestProperty(S_.CONTENT_TYPE, S_.APPLICATION_XML);
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            StringBuffer sbuffer = new StringBuffer();
            sbuffer.append(XMLString);
            OutputStream os = connection.getOutputStream();
            os.write(sbuffer.toString().getBytes());
            os.flush();


            InputStream inputStream = connection.getInputStream();
            if (null != inputStream) {
                DetaBufferedReader = new DetaBufferedReader(new InputStreamReader(inputStream));
                char[] charBuffer = new char[128];
                int bytesRead = -1;
                while ((bytesRead = DetaBufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append(S_.STRING_EMPTY);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (null != DetaBufferedReader) {
                try {
                    DetaBufferedReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        requestBody = stringBuilder.toString();
        return requestBody;
    }

    public String getStatusFromString(String response) {
        for (int i = 0; i < response.length(); i++) {
        }
        return null;
    }

    public String getHTML(String urlString, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        DetaBufferedReader DetaBufferedReader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(S_.HTTP_GET);
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            String code = S_.CHARSET_GB2312;
            InputStream inputStream = connection.getInputStream();
            int caherset_size = connection.getHeaderFields().size();
            for (int i = 0; i < caherset_size; i++) {
                String temp = connection.getHeaderField(i);
                if (temp.contains(S_.CHARSET) || temp.contains(S_.TYPE)) {
                    if (temp.toUpperCase().contains(S_.CHARSET_UTF8)) {
                        code = S_.CHARSET_UTF8;
                    }
                    if (temp.toUpperCase().contains(S_.CHARSET_UTF_8)
                            || temp.toUpperCase().contains(S_.CHARSET_UTF8)) {
                        code = S_.CHARSET_UTF_8;
                    }
                    if (temp.toUpperCase().contains(S_.CHARSET_GB2312)) {
                        code = S_.CHARSET_GB2312;
                    }
                    if (temp.toUpperCase().contains(S_.CHARSET_ASCII)) {
                        code = S_.CHARSET_ASCII;
                    }
                    if (temp.toUpperCase().contains(S_.CHARSET_UNICODE)) {
                        code = S_.CHARSET_UNICODE;
                    }
                    if (temp.toUpperCase().contains(S_.CHARSET_ISO_8859_1)) {
                        code = S_.CHARSET_ISO_8859_1;
                    }
                }
            }
            if (null != inputStream) {
                DetaBufferedReader = new DetaBufferedReader(DetaInputStreamReader.E(inputStream, code));
                char[] charBuffer = new char[128];
                int bytesRead = -1;
                while ((bytesRead = DetaBufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append(S_.STRING_EMPTY);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (null != DetaBufferedReader) {
                try {
                    DetaBufferedReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        String out = null;
        try {
            out = new String(stringBuilder.toString().getBytes(), S_.CHARSET_UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return out;
    }
}
