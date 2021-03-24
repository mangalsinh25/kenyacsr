package org.smj.webui.factory;

import java.sql.ResultSet;
import java.util.Properties;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;

import com.smj.salud.model.MSMJFacility;
import com.smj.salud.model.X_SMJ_Facility;

public class ModelFactory implements IModelFactory {

	@Override
	public Class<?> getClass(String tableName) {
		if (X_SMJ_Facility.Table_Name.equals(tableName)) {
			return MSMJFacility.class;
		}
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		Properties ctx = Env.getCtx();
		if (X_SMJ_Facility.Table_Name.equals(tableName)) {
			return new MSMJFacility(ctx, Record_ID, trxName);
		}
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		Properties ctx = Env.getCtx();
		if (X_SMJ_Facility.Table_Name.equals(tableName)) {
			return new MSMJFacility(ctx, rs, trxName);
		}
		return null;
	}

}
