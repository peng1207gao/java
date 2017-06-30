package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwBalanceinfo的POJO类
 *
 * @author  wangqibin  [Mon Feb 24 10:37:41 CST 2014]
 * 
 */
public class DwBalanceinfo implements Serializable{

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
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性paddingcapacity
     */
    private BigDecimal paddingcapacity;
	
    /** 
     * 属性availablecapacity
     */
    private BigDecimal availablecapacity;
	
    /** 
     * 属性maxdemand
     */
    private BigDecimal maxdemand;
	
    /** 
     * 属性surplusdeficiency
     */
    private BigDecimal surplusdeficiency;
	
    /** 
     * 属性situation
     */
    private Float situation;
	
    /**
     * DwBalanceinfo构造函数
     */
    public DwBalanceinfo() {
        super();
    }  
	
    /**
     * DwBalanceinfo完整的构造函数
     */  
    public DwBalanceinfo(String guid){
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
     * 属性 paddingcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPaddingcapacity(){
        return paddingcapacity;
    }
	
    /**
     * 属性 paddingcapacity 的set方法
     * @return
     */
    public void setPaddingcapacity(BigDecimal paddingcapacity){
        this.paddingcapacity = paddingcapacity;
    } 
	
    /**
     * 属性 availablecapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAvailablecapacity(){
        return availablecapacity;
    }
	
    /**
     * 属性 availablecapacity 的set方法
     * @return
     */
    public void setAvailablecapacity(BigDecimal availablecapacity){
        this.availablecapacity = availablecapacity;
    } 
	
    /**
     * 属性 maxdemand 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxdemand(){
        return maxdemand;
    }
	
    /**
     * 属性 maxdemand 的set方法
     * @return
     */
    public void setMaxdemand(BigDecimal maxdemand){
        this.maxdemand = maxdemand;
    } 
	
    /**
     * 属性 surplusdeficiency 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSurplusdeficiency(){
        return surplusdeficiency;
    }
	
    /**
     * 属性 surplusdeficiency 的set方法
     * @return
     */
    public void setSurplusdeficiency(BigDecimal surplusdeficiency){
        this.surplusdeficiency = surplusdeficiency;
    } 
	
    /**
     * 属性 situation 的get方法
     * @return Float
     */
    public Float getSituation(){
        return situation;
    }
	
    /**
     * 属性 situation 的set方法
     * @return
     */
    public void setSituation(Float situation){
        this.situation = situation;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwBalanceinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwBalanceinfo other = (DwBalanceinfo) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("paddingcapacity"+":"+getPaddingcapacity())
            .append("availablecapacity"+":"+getAvailablecapacity())
            .append("maxdemand"+":"+getMaxdemand())
            .append("surplusdeficiency"+":"+getSurplusdeficiency())
            .append("situation"+":"+getSituation())
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