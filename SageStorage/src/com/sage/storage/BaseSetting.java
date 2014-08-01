package com.sage.storage;

import android.content.Context;

/*
 * Storage setting base class
 */
public class BaseSetting
{		
	/*
	 * load setting from storage
	 */
	public <T> T get()
	{				
		T setting = (T) StorageSetting.get(this.getClass());
		return setting;
	}	
	
	/*
	 * save setting from storage
	 */
	public void set(Context context)
	{
		StorageSetting.set(this,context);
	}	
}
