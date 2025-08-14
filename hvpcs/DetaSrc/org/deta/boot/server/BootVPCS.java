package DetaSrc.org.deta.boot.server;
import java.io.IOException;
import DetaSrc.org.deta.boot.vpc.controller.ServerInitController;
import DetaSrc.org.html5.upload.FileUploaderSimpleDNA;
/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */public class BootVPCS {
	public static void main(String[] args) throws IOException
	, InterruptedException {
		FileUploaderSimpleDNA.newADNAMap();
		ServerInitController.initServer();
	}
}