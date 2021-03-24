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

/** Generated Model for SMJ_Facility
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_SMJ_Facility extends PO implements I_SMJ_Facility, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210322L;

    /** Standard Constructor */
    public X_SMJ_Facility (Properties ctx, int SMJ_Facility_ID, String trxName)
    {
      super (ctx, SMJ_Facility_ID, trxName);
      /** if (SMJ_Facility_ID == 0)
        {
			setkeph_level (null);
			setName (null);
			setowner_type (null);
			setSMJ_Facility_ID (0);
        } */
    }

    /** Load Constructor */
    public X_SMJ_Facility (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
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
      StringBuffer sb = new StringBuffer ("X_SMJ_Facility[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Beds.
		@param beds Beds	  */
	public void setbeds (String beds)
	{
		set_Value (COLUMNNAME_beds, beds);
	}

	/** Get Beds.
		@return Beds	  */
	public String getbeds () 
	{
		return (String)get_Value(COLUMNNAME_beds);
	}

	public I_C_Location getC_Location() throws RuntimeException
    {
		return (I_C_Location)MTable.get(getCtx(), I_C_Location.Table_Name)
			.getPO(getC_Location_ID(), get_TrxName());	}

	/** Set Address.
		@param C_Location_ID 
		Location or Address
	  */
	public void setC_Location_ID (int C_Location_ID)
	{
		if (C_Location_ID < 1) 
			set_Value (COLUMNNAME_C_Location_ID, null);
		else 
			set_Value (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
	}

	/** Get Address.
		@return Location or Address
	  */
	public int getC_Location_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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
			set_Value (COLUMNNAME_C_Region_ID, null);
		else 
			set_Value (COLUMNNAME_C_Region_ID, Integer.valueOf(C_Region_ID));
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

	/** Set Constituency.
		@param constituency Constituency	  */
	public void setconstituency (String constituency)
	{
		set_Value (COLUMNNAME_constituency, constituency);
	}

	/** Get Constituency.
		@return Constituency	  */
	public String getconstituency () 
	{
		return (String)get_Value(COLUMNNAME_constituency);
	}

	/** Set Cots.
		@param cots Cots	  */
	public void setcots (String cots)
	{
		set_Value (COLUMNNAME_cots, cots);
	}

	/** Get Cots.
		@return Cots	  */
	public String getcots () 
	{
		return (String)get_Value(COLUMNNAME_cots);
	}

	/** Set Facility Type.
		@param facility_type Facility Type	  */
	public void setfacility_type (String facility_type)
	{
		set_Value (COLUMNNAME_facility_type, facility_type);
	}

	/** Get Facility Type.
		@return Facility Type	  */
	public String getfacility_type () 
	{
		return (String)get_Value(COLUMNNAME_facility_type);
	}

	/** Set Facility Type Category.
		@param facility_type_cat Facility Type Category	  */
	public void setfacility_type_cat (String facility_type_cat)
	{
		set_Value (COLUMNNAME_facility_type_cat, facility_type_cat);
	}

	/** Get Facility Type Category.
		@return Facility Type Category	  */
	public String getfacility_type_cat () 
	{
		return (String)get_Value(COLUMNNAME_facility_type_cat);
	}

	/** Set Approved.
		@param IsApproved 
		Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved)
	{
		set_ValueNoCheck (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
	}

	/** Get Approved.
		@return Indicates if this document requires approval
	  */
	public boolean isApproved () 
	{
		Object oo = get_Value(COLUMNNAME_IsApproved);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Closed Status.
		@param IsClosed 
		The status is closed
	  */
	public void setIsClosed (boolean IsClosed)
	{
		set_Value (COLUMNNAME_IsClosed, Boolean.valueOf(IsClosed));
	}

	/** Get Closed Status.
		@return The status is closed
	  */
	public boolean isClosed () 
	{
		Object oo = get_Value(COLUMNNAME_IsClosed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Open Late Night.
		@param isopenlatenight Open Late Night	  */
	public void setisopenlatenight (boolean isopenlatenight)
	{
		set_Value (COLUMNNAME_isopenlatenight, Boolean.valueOf(isopenlatenight));
	}

	/** Get Open Late Night.
		@return Open Late Night	  */
	public boolean isopenlatenight () 
	{
		Object oo = get_Value(COLUMNNAME_isopenlatenight);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Open Public Holiday.
		@param isopenpublicholiday Open Public Holiday	  */
	public void setisopenpublicholiday (boolean isopenpublicholiday)
	{
		set_Value (COLUMNNAME_isopenpublicholiday, Boolean.valueOf(isopenpublicholiday));
	}

	/** Get Open Public Holiday.
		@return Open Public Holiday	  */
	public boolean isopenpublicholiday () 
	{
		Object oo = get_Value(COLUMNNAME_isopenpublicholiday);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Open Weekends.
		@param isopenweekends Open Weekends	  */
	public void setisopenweekends (boolean isopenweekends)
	{
		set_Value (COLUMNNAME_isopenweekends, Boolean.valueOf(isopenweekends));
	}

	/** Get Open Weekends.
		@return Open Weekends	  */
	public boolean isopenweekends () 
	{
		Object oo = get_Value(COLUMNNAME_isopenweekends);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Open Whole Day.
		@param isopenwholeday Open Whole Day	  */
	public void setisopenwholeday (boolean isopenwholeday)
	{
		set_Value (COLUMNNAME_isopenwholeday, Boolean.valueOf(isopenwholeday));
	}

	/** Get Open Whole Day.
		@return Open Whole Day	  */
	public boolean isopenwholeday () 
	{
		Object oo = get_Value(COLUMNNAME_isopenwholeday);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Public Visible.
		@param ispublicvisible Public Visible	  */
	public void setispublicvisible (boolean ispublicvisible)
	{
		set_Value (COLUMNNAME_ispublicvisible, Boolean.valueOf(ispublicvisible));
	}

	/** Get Public Visible.
		@return Public Visible	  */
	public boolean ispublicvisible () 
	{
		Object oo = get_Value(COLUMNNAME_ispublicvisible);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Level 1 = 1 */
	public static final String KEPH_LEVEL_Level1 = "1";
	/** Level 2 = 2 */
	public static final String KEPH_LEVEL_Level2 = "2";
	/** Level 3 = 3 */
	public static final String KEPH_LEVEL_Level3 = "3";
	/** Level 4 = 4 */
	public static final String KEPH_LEVEL_Level4 = "4";
	/** Level 5 = 5 */
	public static final String KEPH_LEVEL_Level5 = "5";
	/** Level 6 = 6 */
	public static final String KEPH_LEVEL_Level6 = "6";
	/** None = None */
	public static final String KEPH_LEVEL_None = "None";
	/** Set Keph level.
		@param keph_level Keph level	  */
	public void setkeph_level (String keph_level)
	{

		set_Value (COLUMNNAME_keph_level, keph_level);
	}

	/** Get Keph level.
		@return Keph level	  */
	public String getkeph_level () 
	{
		return (String)get_Value(COLUMNNAME_keph_level);
	}

	/** Set MFL Code.
		@param mfl_code MFL Code	  */
	public void setmfl_code (String mfl_code)
	{
		set_Value (COLUMNNAME_mfl_code, mfl_code);
	}

	/** Get MFL Code.
		@return MFL Code	  */
	public String getmfl_code () 
	{
		return (String)get_Value(COLUMNNAME_mfl_code);
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

	/** Set Official Name.
		@param officialname Official Name	  */
	public void setofficialname (String officialname)
	{
		set_Value (COLUMNNAME_officialname, officialname);
	}

	/** Get Official Name.
		@return Official Name	  */
	public String getofficialname () 
	{
		return (String)get_Value(COLUMNNAME_officialname);
	}

	/** Operational = Operational */
	public static final String OPERATION_STATUS_Operational = "Operational";
	/** Set Operation Status.
		@param operation_status Operation Status	  */
	public void setoperation_status (String operation_status)
	{

		set_Value (COLUMNNAME_operation_status, operation_status);
	}

	/** Get Operation Status.
		@return Operation Status	  */
	public String getoperation_status () 
	{
		return (String)get_Value(COLUMNNAME_operation_status);
	}

	/** Set Owner.
		@param owner Owner	  */
	public void setowner (String owner)
	{
		set_Value (COLUMNNAME_owner, owner);
	}

	/** Get Owner.
		@return Owner	  */
	public String getowner () 
	{
		return (String)get_Value(COLUMNNAME_owner);
	}

	/** Private Practice = PP */
	public static final String OWNER_TYPE_PrivatePractice = "PP";
	/** Ministry of Health = MOH */
	public static final String OWNER_TYPE_MinistryOfHealth = "MOH";
	/** Non-Governmental Organizations = NGO */
	public static final String OWNER_TYPE_Non_GovernmentalOrganizations = "NGO";
	/** Faith Based Organizationq = FBO */
	public static final String OWNER_TYPE_FaithBasedOrganizationq = "FBO";
	/** Set Owner Type.
		@param owner_type Owner Type	  */
	public void setowner_type (String owner_type)
	{

		set_Value (COLUMNNAME_owner_type, owner_type);
	}

	/** Get Owner Type.
		@return Owner Type	  */
	public String getowner_type () 
	{
		return (String)get_Value(COLUMNNAME_owner_type);
	}

	/** Set Regulatory body.
		@param reg_body Regulatory body	  */
	public void setreg_body (String reg_body)
	{
		set_Value (COLUMNNAME_reg_body, reg_body);
	}

	/** Get Regulatory body.
		@return Regulatory body	  */
	public String getreg_body () 
	{
		return (String)get_Value(COLUMNNAME_reg_body);
	}

	/** Set Registration Number.
		@param reg_no Registration Number	  */
	public void setreg_no (String reg_no)
	{
		set_Value (COLUMNNAME_reg_no, reg_no);
	}

	/** Get Registration Number.
		@return Registration Number	  */
	public String getreg_no () 
	{
		return (String)get_Value(COLUMNNAME_reg_no);
	}

	/** Set Service Names.
		@param service_names Service Names	  */
	public void setservice_names (String service_names)
	{
		set_Value (COLUMNNAME_service_names, service_names);
	}

	/** Get Service Names.
		@return Service Names	  */
	public String getservice_names () 
	{
		return (String)get_Value(COLUMNNAME_service_names);
	}

	/** Set Facility.
		@param SMJ_Facility_ID Facility	  */
	public void setSMJ_Facility_ID (int SMJ_Facility_ID)
	{
		if (SMJ_Facility_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_SMJ_Facility_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_SMJ_Facility_ID, Integer.valueOf(SMJ_Facility_ID));
	}

	/** Get Facility.
		@return Facility	  */
	public int getSMJ_Facility_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SMJ_Facility_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set SMJ_Facility_UU.
		@param SMJ_Facility_UU SMJ_Facility_UU	  */
	public void setSMJ_Facility_UU (String SMJ_Facility_UU)
	{
		set_ValueNoCheck (COLUMNNAME_SMJ_Facility_UU, SMJ_Facility_UU);
	}

	/** Get SMJ_Facility_UU.
		@return SMJ_Facility_UU	  */
	public String getSMJ_Facility_UU () 
	{
		return (String)get_Value(COLUMNNAME_SMJ_Facility_UU);
	}

	public I_SMJ_SubCounty getSMJ_SubCounty() throws RuntimeException
    {
		return (I_SMJ_SubCounty)MTable.get(getCtx(), I_SMJ_SubCounty.Table_Name)
			.getPO(getSMJ_SubCounty_ID(), get_TrxName());	}

	/** Set SubCounty.
		@param SMJ_SubCounty_ID SubCounty	  */
	public void setSMJ_SubCounty_ID (int SMJ_SubCounty_ID)
	{
		if (SMJ_SubCounty_ID < 1) 
			set_Value (COLUMNNAME_SMJ_SubCounty_ID, null);
		else 
			set_Value (COLUMNNAME_SMJ_SubCounty_ID, Integer.valueOf(SMJ_SubCounty_ID));
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

	/** Set Ward.
		@param ward Ward	  */
	public void setward (String ward)
	{
		set_Value (COLUMNNAME_ward, ward);
	}

	/** Get Ward.
		@return Ward	  */
	public String getward () 
	{
		return (String)get_Value(COLUMNNAME_ward);
	}
}