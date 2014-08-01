package com.sage.storage.exceptions;

import com.sage.core.CommonSimpleHandlerGenic;

public class StorageExceptionHandler
{
	public static boolean handle(Exception e)
	{
		if(exceptionHandler!=null)
		{
			exceptionHandler.run(e);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	private static CommonSimpleHandlerGenic<Exception> exceptionHandler;
	
	public static void setHandler(CommonSimpleHandlerGenic<Exception> handler)
	{
		exceptionHandler = handler;
	}
}
