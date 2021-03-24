/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package com.smj.salud.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for SMJ_SubCounty
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_SMJ_SubCounty extends PO implements I_SMJ_SubCounty, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210322L;

    /** Standard Constructor */
    public X_SMJ_SubCounty (Properties ctx, int SMJ_SubCounty_ID, String trxName)
    {
      super (ctx, SMJ_SubCounty_ID, trxName);
      /** if (SMJ_SubCounty_ID == 0)
        {
			setC_Region_ID (0);
			setSMJ_SubCounty_ID (0);
        } */
    }

    /** Load Constructor */
    public X_SMJ_SubCounty (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_SMJ_SubCounty[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_Region getC_Region() throws RuntimeException
    {
		return (org.compiere.model.I_C_Region)MTable.get(getCtx(), org.compiere.model.I_C_Region.Table_Name)
			.getPO(getC_Region_ID(), get_TrxName());	}

	/** Set Region.
		@param C_Region_ID 
		Identifies a geographical Region
	  */
	public void setC_Region_ID (int C_Region_ID)
	{
		if (C_Region_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Region_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Region_ID, Integer.valueOf(C_Region_ID));
	}

	/** Get Region.
		@return Identifies a geographical Region
	  */
	public int getC_Region_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Region_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set SubCounty.
		@param SMJ_SubCounty_ID SubCounty	  */
	public void setSMJ_SubCounty_ID (int SMJ_SubCounty_ID)
	{
		if (SMJ_SubCounty_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_SMJ_SubCounty_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_SMJ_SubCounty_ID, Integer.valueOf(SMJ_SubCounty_ID));
	}

	/** Get SubCounty.
		@return SubCounty	  */
	public int getSMJ_SubCounty_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SMJ_SubCounty_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set SMJ_SubCounty_UU.
		@param SMJ_SubCounty_UU SMJ_SubCounty_UU	  */
	public void setSMJ_SubCounty_UU (String SMJ_SubCounty_UU)
	{
		set_ValueNoCheck (COLUMNNAME_SMJ_SubCounty_UU, SMJ_SubCounty_UU);
	}

	/** Get SMJ_SubCounty_UU.
		@return SMJ_SubCounty_UU	  */
	public String getSMJ_SubCounty_UU () 
	{
		return (String)get_Value(COLUMNNAME_SMJ_SubCounty_UU);
	}
}