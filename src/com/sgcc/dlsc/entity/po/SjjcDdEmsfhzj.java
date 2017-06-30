package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcDdEmsfhzj的POJO类
 *
 * @author  Administrator  [Mon Mar 17 10:10:03 CST 2014]
 * 
 */
public class SjjcDdEmsfhzj implements Serializable{

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
     * 属性gridname
     */
    private String gridname;
	
    /** 
     * 属性infoTime
     */
    private Date infoTime;
	
    /** 
     * 属性totalload
     */
    private BigDecimal totalload;
	
    /** 
     * 属性dispatchcompanyname
     */
    private String dispatchcompanyname;
	
     
	
    /**
     * SjjcDdEmsfhzj构造函数
     */
    public SjjcDdEmsfhzj() {
        super();
    }  
	
    /**
     * SjjcDdEmsfhzj完整的构造函数
     */  
    public SjjcDdEmsfhzj(String objId,String companyname,String companyid,String gridname,Date infoTime){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.gridname = gridname;
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
     * 属性 gridname 的get方法
     * @return String
     */
    public String getGridname(){
        return gridname;
    }
	
    /**
     * 属性 gridname 的set方法
     * @return
     */
    public void setGridname(String gridname){
        this.gridname = gridname;
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
     * 属性 totalload 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTotalload(){
        return totalload;
    }
	
    /**
     * 属性 totalload 的set方法
     * @return
     */
    public void setTotalload(BigDecimal totalload){
        this.totalload = totalload;
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
		
        if (o == null || !(o instanceof SjjcDdEmsfhzj))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcDdEmsfhzj other = (SjjcDdEmsfhzj) o;	        
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
            .append("gridname"+":"+getGridname())
            .append("infoTime"+":"+getInfoTime())
            .append("totalload"+":"+getTotalload())
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