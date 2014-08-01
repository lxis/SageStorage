package com.sage.storage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import android.content.Context;

import com.google.gson.Gson;
import com.sage.storage.exceptions.StorageExceptionHandler;
import com.sage.storage.exceptions.StorageNewInstanceException;
import com.sage.storage.exceptions.StoratgeIoException;

/*
 *  Storage manager,must call init before using storage
 */
public class StorageSetting
{
	private static String BasePath;	
	
	public static void init(Context context)
	{
		BasePath = context.getFilesDir().getPath().toString();
	}
	
	
	/*
	 *  Get setting from file system
	 */
	public static <T> T get(Class<T> classType)
	{
		String key = classType.getName();
		String content = null;
		try
		{
			StringBuffer contents = new StringBuffer();
			if (!new File(key).exists()) return classType.newInstance();
			FileReader fr = new FileReader(key);
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ((str = br.readLine()) != null)
				contents.append(str);
			content = contents.toString();
			br.close();
			fr.close();
		}
		catch (IOException e)
		{
			if (!StorageExceptionHandler.handle(e))
				throw new StoratgeIoException(e);
		}
		catch (InstantiationException e)
		{
			if (!StorageExceptionHandler.handle(e))
				throw new StoratgeIoException(e);
		}
		catch (IllegalAccessException e)
		{
			if (!StorageExceptionHandler.handle(e))
				throw new StoratgeIoException(e);
		}
		return new Gson().fromJson(content, classType);
	}

	/*
	 *  Set setting to file system
	 */
	public static <T> void set(T model,Context context)
	{
		String key = BasePath + "/fileName.txt";
		try
		{
			FileOutputStream out;
			PrintStream ps;
			if (!new File(key).exists()) new File(key).createNewFile();
			out = new FileOutputStream(key);
			ps = new PrintStream(out);
			String jsonText = new Gson().toJson(model);
			ps.println(jsonText);
			ps.close();
			out.close();
		}
		catch (IOException e)
		{
			if (!StorageExceptionHandler.handle(e))
				throw new StoratgeIoException(e);
		}
	}
}
