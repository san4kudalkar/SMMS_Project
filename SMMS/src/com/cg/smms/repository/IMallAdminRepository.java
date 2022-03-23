package com.cg.smms.repository;

import com.cg.smms.entities.MallAdmin;

public interface IMallAdminRepository {
	
	public MallAdmin addMallAdmin(MallAdmin mallAdmin);
	
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin);
	
	public MallAdmin deleteMallAdmin(int id);
	
	public MallAdmin searchMallAdmin(int id);
	
	public abstract void beginTransaction();
	
	public abstract void commitTransaction();
}
