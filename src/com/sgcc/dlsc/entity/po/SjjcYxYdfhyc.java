package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxYdfhyc的POJO类
 *
 * @author  Administrator  [Sun Mar 16 14:10:54 CST 2014]
 * 
 */
public class SjjcYxYdfhyc implements Serializable{

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
     * 属性provincename
     */
    private String provincename;
	
    /** 
     * 属性provinceid
     */
    private String provinceid;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性maxloadforecast
     */
    private BigDecimal maxloadforecast;
	
    /** 
     * 属性consumptionforecast
     */
    private BigDecimal consumptionforecast;
	
    /**
     * SjjcYxYdfhyc构造函数
     */
    public SjjcYxYdfhyc() {
        super();
    }  
	
    /**
     * SjjcYxYdfhyc完整的构造函数
     */  
    public SjjcYxYdfhyc(String objId,String companyname,String companyid,String provincename,String provinceid,BigDecimal theyear,BigDecimal themonth){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.theyear = theyear;
        this.themonth = themonth;
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
     * 属性 provincename 的get方法
     * @return String
     */
    public String getProvincename(){
        return provincename;
    }
	
    /**
     * 属性 provincename 的set方法
     * @return
     */
    public void setProvincename(String provincename){
        this.provincename = provincename;
    } 
	
    /**
     * 属性 provinceid 的get方法
     * @return String
     */
    public String getProvinceid(){
        return provinceid;
    }
	
    /**
     * 属性 provinceid 的set方法
     * @return
     */
    public void setProvinceid(String provinceid){
        this.provinceid = provinceid;
    } 
	
    /**
     * 属性 theyear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTheyear(){
        return theyear;
    }
	
    /**
     * 属性 theyear 的set方法
     * @return
     */
    public void setTheyear(BigDecimal theyear){
        this.theyear = theyear;
    } 
	
    /**
     * 属性 themonth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getThemonth(){
        return themonth;
    }
	
    /**
     * 属性 themonth 的set方法
     * @return
     */
    public void setThemonth(BigDecimal themonth){
        this.themonth = themonth;
    } 
	
    /**
     * 属性 maxloadforecast 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxloadforecast(){
        return maxloadforecast;
    }
	
    /**
     * 属性 maxloadforecast 的set方法
     * @return
     */
    public void setMaxloadforecast(BigDecimal maxloadforecast){
        this.maxloadforecast = maxloadforecast;
    } 
	
    /**
     * 属性 consumptionforecast 的get方法
     * @return BigDecimal
     */
    public BigDecimal getConsumptionforecast(){
        return consumptionforecast;
    }
	
    /**
     * 属性 consumptionforecast 的set方法
     * @return
     */
    public void setConsumptionforecast(BigDecimal consumptionforecast){
        this.consumptionforecast = consumptionforecast;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcYxYdfhyc))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxYdfhyc other = (SjjcYxYdfhyc) o;	        
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
            .append("provincename"+":"+getProvincename())
            .append("provinceid"+":"+getProvinceid())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("maxloadforecast"+":"+getMaxloadforecast())
            .append("consumptionforecast"+":"+getConsumptionforecast())
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