package com.sage.storage.exceptions;

public class StorageNewInstanceException extends RuntimeException {
	// 这个就看用户定义的Setting类有没有问题，
	public StorageNewInstanceException(Throwable e) {
		super(e);
	}
}
