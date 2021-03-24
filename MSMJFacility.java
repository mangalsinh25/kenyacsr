package com.smj.salud.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MSMJFacility extends X_SMJ_Facility {
	
	private static final long serialVersionUID = 7942089275780388979L;

	public MSMJFacility(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	public MSMJFacility(Properties ctx, int SMJ_Facility_ID, String trxName) {
		super(ctx, SMJ_Facility_ID, trxName);
	}

}
