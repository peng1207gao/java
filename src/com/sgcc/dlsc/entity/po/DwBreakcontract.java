package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwBreakcontract的POJO类
 *
 * @author  xiabaike  [Fri Mar 14 10:02:49 CST 2014]
 * 
 */
public class DwBreakcontract implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性contractcount
     */
    private BigDecimal contractcount;
	
    /** 
     * 属性thetype
     */
    private String thetype;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * DwBreakcontract构造函数
     */
    public DwBreakcontract() {
        super();
    }  
	
    /**
     * DwBreakcontract完整的构造函数
     */  
    public DwBreakcontract(String guid){
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
     * 属性 contractcount 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractcount(){
        return contractcount;
    }
	
    /**
     * 属性 contractcount 的set方法
     * @return
     */
    public void setContractcount(BigDecimal contractcount){
        this.contractcount = contractcount;
    } 
	
    /**
     * 属性 thetype 的get方法
     * @return String
     */
    public String getThetype(){
        return thetype;
    }
	
    /**
     * 属性 thetype 的set方法
     * @return
     */
    public void setThetype(String thetype){
        this.thetype = thetype;
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
		
        if (o == null || !(o instanceof DwBreakcontract))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwBreakcontract other = (DwBreakcontract) o;	        
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
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("contractcount"+":"+getContractcount())
            .append("thetype"+":"+getThetype())
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