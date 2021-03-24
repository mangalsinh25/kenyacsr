package org.smj.webui.factory;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.base.IColumnCallout;
import org.adempiere.base.IColumnCalloutFactory;
import org.compiere.model.MBPartner;

import com.smj.callout.BPartnerCallout;

public class CalloutFactory implements IColumnCalloutFactory {

	@Override
	public IColumnCallout[] getColumnCallouts(String tableName, String columnName) {
		List<IColumnCallout> callouts = new ArrayList<IColumnCallout>();

		if (MBPartner.Table_Name.equalsIgnoreCase(tableName) && "SMJ_Facility_ID".equalsIgnoreCase(columnName)) {
			callouts.add(new BPartnerCallout());
		}
		return callouts != null ? callouts.toArray(new IColumnCallout[0]) : new IColumnCallout[0];
	}

}
