package com.sage.storage;

public class BaseSetting
{		
	public <T> T Get()
	{				
		T setting = (T) StorageSetting.Get(this.getClass());
		return setting;
	}	
	
	public void Set()
	{
		StorageSetting.Set(this);
	}	
}
