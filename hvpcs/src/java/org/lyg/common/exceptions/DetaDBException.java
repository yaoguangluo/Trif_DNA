/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */package org.lyg.common.exceptions;

public class DetaDBException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String errorId;
	private String errorMessage;

	public String getErrorId() {
		return errorId;
	}

	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public DetaDBException() {
		super();
	}

	public DetaDBException(String errorId, String errorMessage) {
		super(errorMessage);
		this.errorId = errorId;
		this.errorMessage = errorMessage;
	}
}
