package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwEcogeneratortraderesult的POJO类
 *
 * @author  tiger  [Fri Mar 14 09:46:19 CST 2014]
 * 
 */
public class DwEcogeneratortraderesult implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性ecounitid
     */
    private String ecounitid;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性elecquantity
     */
    private BigDecimal elecquantity;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * DwEcogeneratortraderesult构造函数
     */
    public DwEcogeneratortraderesult() {
        super();
    }  
	
    /**
     * DwEcogeneratortraderesult完整的构造函数
     */  
    public DwEcogeneratortraderesult(String guid){
        this.guid = guid;
    }
 
    /**
     * 属性 guid 的get方法
     * @return String
     */
    public String getGuid(){
        return guid;
    }
	
    /**
     * 属性 guid 的set方法
     * @return
     */
    public void setGuid(String guid){
        if(guid != null && guid.trim().length() == 0){
            this.guid = null;
        }else{
            this.guid = guid;
        }
    } 
	
    /**
     * 属性 ecounitid 的get方法
     * @return String
     */
    public String getEcounitid(){
        return ecounitid;
    }
	
    /**
     * 属性 ecounitid 的set方法
     * @return
     */
    public void setEcounitid(String ecounitid){
        this.ecounitid = ecounitid;
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
     * 属性 contractid 的get方法
     * @return String
     */
    public String getContractid(){
        return contractid;
    }
	
    /**
     * 属性 contractid 的set方法
     * @return
     */
    public void setContractid(String contractid){
        this.contractid = contractid;
    } 
	
    /**
     * 属性 elecquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElecquantity(){
        return elecquantity;
    }
	
    /**
     * 属性 elecquantity 的set方法
     * @return
     */
    public void setElecquantity(BigDecimal elecquantity){
        this.elecquantity = elecquantity;
    } 
	
    /**
     * 属性 marketid 的get方法
     * @return String
     */
    public String getMarketid(){
        return marketid;
    }
	
    /**
     * 属性 marketid 的set方法
     * @return
     */
    public void setMarketid(String marketid){
        this.marketid = marketid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwEcogeneratortraderesult))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwEcogeneratortraderesult other = (DwEcogeneratortraderesult) o;	        
	    return new EqualsBuilder()
            .append(this.getGuid(), other.getGuid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("guid"+":"+getGuid())
            .append("ecounitid"+":"+getEcounitid())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("contractid"+":"+getContractid())
            .append("elecquantity"+":"+getElecquantity())
            .append("marketid"+":"+getMarketid())
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