package com.sage.storage.exceptions;

import java.io.IOException;

public class StoratgeIoException extends RuntimeException {
	// 这个异常在框架本身没有问题的情况下是不应该出的，调试OK之后可以考虑去掉
	public StoratgeIoException(Throwable e) {
		super(e);
	}

}
