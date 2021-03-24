package com.smj.callout;

import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.util.Env;

import com.smj.salud.model.MSMJFacility;

public class BPartnerCallout implements IColumnCallout {

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		if("SMJ_Facility_ID".equalsIgnoreCase(mField.getColumnName()) && value != null) {
			MSMJFacility facility = new MSMJFacility(Env.getCtx(), (int)value, null);
			if(facility != null) {
				mTab.setValue("tier", facility.getkeph_level());
				mTab.setValue("C_Region_ID", facility.getC_Region_ID());
				mTab.setValue("SMJ_SubCounty_ID", facility.getSMJ_SubCounty_ID());
				mTab.setValue("mfl_code", facility.getmfl_code());
			}
		}
		return null;
	}

}
