package com.dex.main;

import com.dn.fixutils.FixDexUtils;

import android.app.Application;
import android.content.Context;
import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;

public class MyApplication extends Application{
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}
	@Override
	protected void attachBaseContext(Context base) {
		// TODO Auto-generated method stub
//		MultiDex.install(base);
		FixDexUtils.loadFixedDex(base);
		super.attachBaseContext(base);

	}
}
