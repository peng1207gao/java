package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DdKqksllxrjhap的POJO类
 *
 * @author  wangqibin  [Thu Mar 20 11:24:05 CST 2014]
 * 
 */
public class DdKqksllxrjhap implements Serializable{

    /** 
     * 属性objId
     */
    private String objId;
	
    /** 
     * 属性companyname
     */
    private String companyname;
	
    /** 
     * 属性companyid
     */
    private String companyid;
	
    /** 
     * 属性tableDate
     */
    private Date tableDate;
	
    /** 
     * 属性linename
     */
    private String linename;
	
    /** 
     * 属性compositionname
     */
    private String compositionname;
	
    /** 
     * 属性tableTime
     */
    private Timestamp tableTime;
	
    /** 
     * 属性powerplan
     */
    private BigDecimal powerplan;
	
    /** 
     * 属性dispatchcompanyid
     */
    private String dispatchcompanyid;
	
    /** 
     * 属性deptCode
     */
    private String deptCode;
	
    /** 
     * 属性tabYear
     */
    private BigDecimal tabYear;
	
    /** 
     * 属性tabMonth
     */
    private BigDecimal tabMonth;
	
    /** 
     * 属性tabDay
     */
    private BigDecimal tabDay;
	
    /**
     * DdKqksllxrjhap构造函数
     */
    public DdKqksllxrjhap() {
        super();
    }  
	
    /**
     * DdKqksllxrjhap完整的构造函数
     */  
    public DdKqksllxrjhap(String objId,String companyid,Date tableDate,String linename,String compositionname,Timestamp tableTime,BigDecimal powerplan,String deptCode,BigDecimal tabYear,BigDecimal tabMonth,BigDecimal tabDay){
        this.objId = objId;
        this.companyid = companyid;
        this.tableDate = tableDate;
        this.linename = linename;
        this.compositionname = compositionname;
        this.tableTime = tableTime;
        this.powerplan = powerplan;
        this.deptCode = deptCode;
        this.tabYear = tabYear;
        this.tabMonth = tabMonth;
        this.tabDay = tabDay;
    }
 
    /**
     * 属性 objId 的get方法
     * @return String
     */
    public String getObjId(){
        return objId;
    }
	
    /**
     * 属性 objId 的set方法
     * @return
     */
    public void setObjId(String objId){
        if(objId != null && objId.trim().length() == 0){
            this.objId = null;
        }else{
            this.objId = objId;
        }
    } 
	
    /**
     * 属性 companyname 的get方法
     * @return String
     */
    public String getCompanyname(){
        return companyname;
    }
	
    /**
     * 属性 companyname 的set方法
     * @return
     */
    public void setCompanyname(String companyname){
        this.companyname = companyname;
    } 
	
    /**
     * 属性 companyid 的get方法
     * @return String
     */
    public String getCompanyid(){
        return companyid;
    }
	
    /**
     * 属性 companyid 的set方法
     * @return
     */
    public void setCompanyid(String companyid){
        this.companyid = companyid;
    } 
	
    /**
     * 属性 tableDate 的get方法
     * @return Date
     */
    public Date getTableDate(){
        return tableDate;
    }
	
    /**
     * 属性 tableDate 的set方法
     * @return
     */
    public void setTableDate(Date tableDate){
        this.tableDate = tableDate;
    } 
	
    /**
     * 属性 linename 的get方法
     * @return String
     */
    public String getLinename(){
        return linename;
    }
	
    /**
     * 属性 linename 的set方法
     * @return
     */
    public void setLinename(String linename){
        this.linename = linename;
    } 
	
    /**
     * 属性 compositionname 的get方法
     * @return String
     */
    public String getCompositionname(){
        return compositionname;
    }
	
    /**
     * 属性 compositionname 的set方法
     * @return
     */
    public void setCompositionname(String compositionname){
        this.compositionname = compositionname;
    } 
	
    /**
     * 属性 tableTime 的get方法
     * @return Date
     */
    public Timestamp getTableTime(){
        return tableTime;
    }
	
    /**
     * 属性 tableTime 的set方法
     * @return
     */
    public void setTableTime(Timestamp tableTime){
        this.tableTime = tableTime;
    } 
	
    /**
     * 属性 powerplan 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowerplan(){
        return powerplan;
    }
	
    /**
     * 属性 powerplan 的set方法
     * @return
     */
    public void setPowerplan(BigDecimal powerplan){
        this.powerplan = powerplan;
    } 
	
    /**
     * 属性 dispatchcompanyid 的get方法
     * @return String
     */
    public String getDispatchcompanyid(){
        return dispatchcompanyid;
    }
	
    /**
     * 属性 dispatchcompanyid 的set方法
     * @return
     */
    public void setDispatchcompanyid(String dispatchcompanyid){
        this.dispatchcompanyid = dispatchcompanyid;
    } 
	
    /**
     * 属性 deptCode 的get方法
     * @return String
     */
    public String getDeptCode(){
        return deptCode;
    }
	
    /**
     * 属性 deptCode 的set方法
     * @return
     */
    public void setDeptCode(String deptCode){
        this.deptCode = deptCode;
    } 
	
    /**
     * 属性 tabYear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTabYear(){
        return tabYear;
    }
	
    /**
     * 属性 tabYear 的set方法
     * @return
     */
    public void setTabYear(BigDecimal tabYear){
        this.tabYear = tabYear;
    } 
	
    /**
     * 属性 tabMonth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTabMonth(){
        return tabMonth;
    }
	
    /**
     * 属性 tabMonth 的set方法
     * @return
     */
    public void setTabMonth(BigDecimal tabMonth){
        this.tabMonth = tabMonth;
    } 
	
    /**
     * 属性 tabDay 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTabDay(){
        return tabDay;
    }
	
    /**
     * 属性 tabDay 的set方法
     * @return
     */
    public void setTabDay(BigDecimal tabDay){
        this.tabDay = tabDay;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DdKqksllxrjhap))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        DdKqksllxrjhap other = (DdKqksllxrjhap) o;	        
	    return new EqualsBuilder()
            .append(this.getObjId(), other.getObjId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("objId"+":"+getObjId())
            .append("companyname"+":"+getCompanyname())
            .append("companyid"+":"+getCompanyid())
            .append("tableDate"+":"+getTableDate())
            .append("linename"+":"+getLinename())
            .append("compositionname"+":"+getCompositionname())
            .append("tableTime"+":"+getTableTime())
            .append("powerplan"+":"+getPowerplan())
            .append("dispatchcompanyid"+":"+getDispatchcompanyid())
            .append("deptCode"+":"+getDeptCode())
            .append("tabYear"+":"+getTabYear())
            .append("tabMonth"+":"+getTabMonth())
            .append("tabDay"+":"+getTabDay())
            .toString(); 
			
    } 
   

    /**
     * hashcode方法
     * @return int
     * 
     */
    @Override
    public int hashCode(){
		return super.hashCode();
	}

}