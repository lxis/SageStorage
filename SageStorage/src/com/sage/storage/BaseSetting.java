package com.sage.storage;

import android.content.Context;

public class BaseSetting
{		
	public <T> T Get()
	{				
		T setting = (T) StorageSetting.Get(this.getClass());
		return setting;
	}	
	
	public void Set(Context context)
	{
		StorageSetting.Set(this,context);
	}	
}
