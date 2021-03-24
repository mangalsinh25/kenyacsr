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
package com.smj.salud.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for SMJ_Facility
 *  @author iDempiere (generated) 
 *  @version Release 7.1
 */
@SuppressWarnings("all")
public interface I_SMJ_Facility 
{

    /** TableName=SMJ_Facility */
    public static final String Table_Name = "SMJ_Facility";

    /** AD_Table_ID=1000032 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name beds */
    public static final String COLUMNNAME_beds = "beds";

	/** Set Beds	  */
	public void setbeds (String beds);

	/** Get Beds	  */
	public String getbeds();

    /** Column name C_Location_ID */
    public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";

	/** Set Address.
	  * Location or Address
	  */
	public void setC_Location_ID (int C_Location_ID);

	/** Get Address.
	  * Location or Address
	  */
	public int getC_Location_ID();

	public I_C_Location getC_Location() throws RuntimeException;

    /** Column name C_Region_ID */
    public static final String COLUMNNAME_C_Region_ID = "C_Region_ID";

	/** Set Region.
	  * Identifies a geographical Region
	  */
	public void setC_Region_ID (int C_Region_ID);

	/** Get Region.
	  * Identifies a geographical Region
	  */
	public int getC_Region_ID();

	public org.compiere.model.I_C_Region getC_Region() throws RuntimeException;

    /** Column name constituency */
    public static final String COLUMNNAME_constituency = "constituency";

	/** Set Constituency	  */
	public void setconstituency (String constituency);

	/** Get Constituency	  */
	public String getconstituency();

    /** Column name cots */
    public static final String COLUMNNAME_cots = "cots";

	/** Set Cots	  */
	public void setcots (String cots);

	/** Get Cots	  */
	public String getcots();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name facility_type */
    public static final String COLUMNNAME_facility_type = "facility_type";

	/** Set Facility Type	  */
	public void setfacility_type (String facility_type);

	/** Get Facility Type	  */
	public String getfacility_type();

    /** Column name facility_type_cat */
    public static final String COLUMNNAME_facility_type_cat = "facility_type_cat";

	/** Set Facility Type Category	  */
	public void setfacility_type_cat (String facility_type_cat);

	/** Get Facility Type Category	  */
	public String getfacility_type_cat();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsApproved */
    public static final String COLUMNNAME_IsApproved = "IsApproved";

	/** Set Approved.
	  * Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved);

	/** Get Approved.
	  * Indicates if this document requires approval
	  */
	public boolean isApproved();

    /** Column name IsClosed */
    public static final String COLUMNNAME_IsClosed = "IsClosed";

	/** Set Closed Status.
	  * The status is closed
	  */
	public void setIsClosed (boolean IsClosed);

	/** Get Closed Status.
	  * The status is closed
	  */
	public boolean isClosed();

    /** Column name isopenlatenight */
    public static final String COLUMNNAME_isopenlatenight = "isopenlatenight";

	/** Set Open Late Night	  */
	public void setisopenlatenight (boolean isopenlatenight);

	/** Get Open Late Night	  */
	public boolean isopenlatenight();

    /** Column name isopenpublicholiday */
    public static final String COLUMNNAME_isopenpublicholiday = "isopenpublicholiday";

	/** Set Open Public Holiday	  */
	public void setisopenpublicholiday (boolean isopenpublicholiday);

	/** Get Open Public Holiday	  */
	public boolean isopenpublicholiday();

    /** Column name isopenweekends */
    public static final String COLUMNNAME_isopenweekends = "isopenweekends";

	/** Set Open Weekends	  */
	public void setisopenweekends (boolean isopenweekends);

	/** Get Open Weekends	  */
	public boolean isopenweekends();

    /** Column name isopenwholeday */
    public static final String COLUMNNAME_isopenwholeday = "isopenwholeday";

	/** Set Open Whole Day	  */
	public void setisopenwholeday (boolean isopenwholeday);

	/** Get Open Whole Day	  */
	public boolean isopenwholeday();

    /** Column name ispublicvisible */
    public static final String COLUMNNAME_ispublicvisible = "ispublicvisible";

	/** Set Public Visible	  */
	public void setispublicvisible (boolean ispublicvisible);

	/** Get Public Visible	  */
	public boolean ispublicvisible();

    /** Column name keph_level */
    public static final String COLUMNNAME_keph_level = "keph_level";

	/** Set Keph level	  */
	public void setkeph_level (String keph_level);

	/** Get Keph level	  */
	public String getkeph_level();

    /** Column name mfl_code */
    public static final String COLUMNNAME_mfl_code = "mfl_code";

	/** Set MFL Code	  */
	public void setmfl_code (String mfl_code);

	/** Get MFL Code	  */
	public String getmfl_code();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name officialname */
    public static final String COLUMNNAME_officialname = "officialname";

	/** Set Official Name	  */
	public void setofficialname (String officialname);

	/** Get Official Name	  */
	public String getofficialname();

    /** Column name operation_status */
    public static final String COLUMNNAME_operation_status = "operation_status";

	/** Set Operation Status	  */
	public void setoperation_status (String operation_status);

	/** Get Operation Status	  */
	public String getoperation_status();

    /** Column name owner */
    public static final String COLUMNNAME_owner = "owner";

	/** Set Owner	  */
	public void setowner (String owner);

	/** Get Owner	  */
	public String getowner();

    /** Column name owner_type */
    public static final String COLUMNNAME_owner_type = "owner_type";

	/** Set Owner Type	  */
	public void setowner_type (String owner_type);

	/** Get Owner Type	  */
	public String getowner_type();

    /** Column name reg_body */
    public static final String COLUMNNAME_reg_body = "reg_body";

	/** Set Regulatory body	  */
	public void setreg_body (String reg_body);

	/** Get Regulatory body	  */
	public String getreg_body();

    /** Column name reg_no */
    public static final String COLUMNNAME_reg_no = "reg_no";

	/** Set Registration Number	  */
	public void setreg_no (String reg_no);

	/** Get Registration Number	  */
	public String getreg_no();

    /** Column name service_names */
    public static final String COLUMNNAME_service_names = "service_names";

	/** Set Service Names	  */
	public void setservice_names (String service_names);

	/** Get Service Names	  */
	public String getservice_names();

    /** Column name SMJ_Facility_ID */
    public static final String COLUMNNAME_SMJ_Facility_ID = "SMJ_Facility_ID";

	/** Set Facility	  */
	public void setSMJ_Facility_ID (int SMJ_Facility_ID);

	/** Get Facility	  */
	public int getSMJ_Facility_ID();

    /** Column name SMJ_Facility_UU */
    public static final String COLUMNNAME_SMJ_Facility_UU = "SMJ_Facility_UU";

	/** Set SMJ_Facility_UU	  */
	public void setSMJ_Facility_UU (String SMJ_Facility_UU);

	/** Get SMJ_Facility_UU	  */
	public String getSMJ_Facility_UU();

    /** Column name SMJ_SubCounty_ID */
    public static final String COLUMNNAME_SMJ_SubCounty_ID = "SMJ_SubCounty_ID";

	/** Set SubCounty	  */
	public void setSMJ_SubCounty_ID (int SMJ_SubCounty_ID);

	/** Get SubCounty	  */
	public int getSMJ_SubCounty_ID();

	public I_SMJ_SubCounty getSMJ_SubCounty() throws RuntimeException;

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name ward */
    public static final String COLUMNNAME_ward = "ward";

	/** Set Ward	  */
	public void setward (String ward);

	/** Get Ward	  */
	public String getward();
}
