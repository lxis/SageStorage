package com.sage.storage;

import android.content.Context;

public class BaseSetting
{		
	public <T> T get()
	{				
		T setting = (T) StorageSetting.get(this.getClass());
		return setting;
	}	
	
	public void set(Context context)
	{
		StorageSetting.set(this,context);
	}	
}
