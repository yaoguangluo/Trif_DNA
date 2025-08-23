package U_A.PEU.P.zip;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

//refer http://www.blogjava.net/dreamstone/archive/2007/08/09/134986.html
//yaoguangluo fix and normalization.

/*
 * 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class UnZip {
	static final int BUFFER= 1024 * 2;
	@SuppressWarnings("rawtypes")
	public static void unZipWithPath(String zipFullPath, String zipCategory) {
		try {
			String fileName= zipFullPath; //需要解压的文件zip地址
			//String filePath= zipCategory; //解压到地址
			ZipFile zipFile= new ZipFile(fileName);
			Enumeration emu= zipFile.entries();
			while(emu.hasMoreElements()){
				ZipEntry entry= (ZipEntry)emu.nextElement();
				if (entry.isDirectory()){
					//new File(filePath + entry.getName()).mkdirs();
					new File(entry.getName()).mkdirs();
					continue;
				}
				InputStream bufferedInputStream 
				= zipFile.getInputStream(entry);
				File file= new File(entry.getName());
				File parent= file.getParentFile();
				if(parent != null && (!parent.exists())){
					parent.mkdirs();
				}
				if(!file.getPath().contains(".lyg")) {
					file.mkdirs();
				}else {
					FileOutputStream fileOutputStream= new FileOutputStream(file);
					BufferedOutputStream bufferedOutputStream 
					= new BufferedOutputStream(fileOutputStream, BUFFER);
					int count;
					byte data[]= new byte[BUFFER];
					while ((count= bufferedInputStream.read(data, 0, BUFFER)) != -1){
						bufferedOutputStream.write(data, 0, count);
					}
					bufferedOutputStream.flush();
					bufferedOutputStream.close();
				}
				bufferedInputStream.close();	
			}
			zipFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
