package com.sage.storage.exceptions;

import java.io.IOException;

public class StoratgeIoException extends RuntimeException {
	// ����쳣�ڿ�ܱ���û�������������ǲ�Ӧ�ó��ģ�����OK֮����Կ���ȥ��
	public StoratgeIoException(Throwable e) {
		super(e);
	}

}
