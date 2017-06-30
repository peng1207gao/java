package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaDemand的POJO类
 *
 * @author  Administrator  [Tue Aug 06 18:05:53 CST 2013]
 * 
 */
public class BaDemand implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性dateType
     */
    private BigDecimal dateType;
	
    /** 
     * 属性tabdate
     */
    private Date tabdate;
	
    /** 
     * 属性maxloadforecast
     */
    private BigDecimal maxloadforecast;
	
    /** 
     * 属性consumptionforecast
     */
    private BigDecimal consumptionforecast;
	
    /**
     * BaDemand构造函数
     */
    public BaDemand() {
        super();
    }  
	
    /**
     * BaDemand完整的构造函数
     */  
    public BaDemand(String guid,String marketcode,Date tabdate){
        this.guid = guid;
        this.marketcode = marketcode;
        this.tabdate = tabdate;
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
     * 属性 marketcode 的get方法
     * @return String
     */
    public String getMarketcode(){
        return marketcode;
    }
	
    /**
     * 属性 marketcode 的set方法
     * @return
     */
    public void setMarketcode(String marketcode){
        this.marketcode = marketcode;
    } 
	
    /**
     * 属性 dateType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDateType(){
        return dateType;
    }
	
    /**
     * 属性 dateType 的set方法
     * @return
     */
    public void setDateType(BigDecimal dateType){
        this.dateType = dateType;
    } 
	
    /**
     * 属性 tabdate 的get方法
     * @return Date
     */
    public Date getTabdate(){
        return tabdate;
    }
	
    /**
     * 属性 tabdate 的set方法
     * @return
     */
    public void setTabdate(Date tabdate){
        this.tabdate = tabdate;
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
		
        if (o == null || !(o instanceof BaDemand))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaDemand other = (BaDemand) o;	        
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
            .append("marketcode"+":"+getMarketcode())
            .append("dateType"+":"+getDateType())
            .append("tabdate"+":"+getTabdate())
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