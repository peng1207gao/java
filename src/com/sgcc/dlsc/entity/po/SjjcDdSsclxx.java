package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
//import java.sql.Date;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcDdSsclxx的POJO类
 *
 * @author  Administrator  [Mon Mar 17 10:11:54 CST 2014]
 * 
 */
public class SjjcDdSsclxx implements Serializable{

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
     * 属性infoDate
     */
    private Date infoDate;
	
    /** 
     * 属性unitlinename
     */
    private String unitlinename;
	
    /** 
     * 属性infoTime
     */
    private Date infoTime;
	
    /** 
     * 属性powernumber
     */
    private BigDecimal powernumber;
	
    /** 
     * 属性dispatchcompanyname
     */
    private String dispatchcompanyname;
	
    
	
    /**
     * SjjcDdSsclxx构造函数
     */
    public SjjcDdSsclxx() {
        super();
    }  
	
    /**
     * SjjcDdSsclxx完整的构造函数
     */  
    public SjjcDdSsclxx(String objId,String companyname,String companyid,Date infoDate,String unitlinename,Date infoTime){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.infoDate = infoDate;
        this.unitlinename = unitlinename;
        this.infoTime = infoTime;
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
     * 属性 infoDate 的get方法
     * @return Date
     */
    public Date getInfoDate(){
        return infoDate;
    }
	
    /**
     * 属性 infoDate 的set方法
     * @return
     */
    public void setInfoDate(Date infoDate){
        this.infoDate = infoDate;
    } 
	
    /**
     * 属性 unitlinename 的get方法
     * @return String
     */
    public String getUnitlinename(){
        return unitlinename;
    }
	
    /**
     * 属性 unitlinename 的set方法
     * @return
     */
    public void setUnitlinename(String unitlinename){
        this.unitlinename = unitlinename;
    } 
	
    /**
     * 属性 infoTime 的get方法
     * @return Date
     */
    public Date getInfoTime(){
        return infoTime;
    }
	
    /**
     * 属性 infoTime 的set方法
     * @return
     */
    public void setInfoTime(Date infoTime){
        this.infoTime = infoTime;
    } 
	
    /**
     * 属性 powernumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowernumber(){
        return powernumber;
    }
	
    /**
     * 属性 powernumber 的set方法
     * @return
     */
    public void setPowernumber(BigDecimal powernumber){
        this.powernumber = powernumber;
    } 
	
    /**
     * 属性 dispatchcompanyname 的get方法
     * @return String
     */
    public String getDispatchcompanyname(){
        return dispatchcompanyname;
    }
	
    /**
     * 属性 dispatchcompanyname 的set方法
     * @return
     */
    public void setDispatchcompanyname(String dispatchcompanyname){
        this.dispatchcompanyname = dispatchcompanyname;
    } 
	
     
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcDdSsclxx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcDdSsclxx other = (SjjcDdSsclxx) o;	        
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
            .append("infoDate"+":"+getInfoDate())
            .append("unitlinename"+":"+getUnitlinename())
            .append("infoTime"+":"+getInfoTime())
            .append("powernumber"+":"+getPowernumber())
            .append("dispatchcompanyname"+":"+getDispatchcompanyname())
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