package DetaSrc.org.deta.boot.sets;
//���� ������
/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com
 * , 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */public class VPCSRequest extends DetaSrc.org.deta.boot.sets.Request_S {
	private boolean requestIsRest;
	public boolean waitingForShake= true;
	
	public boolean getRequestIsRest() {
		return requestIsRest;
	}

	public void setRequestIsRest(boolean requestIsRest) {
		this.requestIsRest = requestIsRest;
	}

	public void closeAllBeforeGC() {
		// StableBlob.clearBlobLimit(getRequestFilePath());
	}

	public void setWaitingForShake(boolean isWaitingForShake) {
		waitingForShake=isWaitingForShake;
	}

	public boolean getWaitingForShake() {
		// TODO Auto-generated method stub
		return waitingForShake;
	}
}