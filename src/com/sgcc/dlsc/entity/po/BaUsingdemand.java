package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaUsingdemand的POJO类
 *
 * @author  Administrator  [Tue Jul 16 15:18:12 CST 2013]
 * 
 */
public class BaUsingdemand implements Serializable{

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
     * 属性gridconsumption
     */
    private BigDecimal gridconsumption;
	
    /** 
     * 属性socialconsumption
     */
    private BigDecimal socialconsumption;
	
    /**
     * BaUsingdemand构造函数
     */
    public BaUsingdemand() {
        super();
    }  
	
    /**
     * BaUsingdemand完整的构造函数
     */  
    public BaUsingdemand(String guid,String marketcode,Date tabdate){
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
     * 属性 gridconsumption 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGridconsumption(){
        return gridconsumption;
    }
	
    /**
     * 属性 gridconsumption 的set方法
     * @return
     */
    public void setGridconsumption(BigDecimal gridconsumption){
        this.gridconsumption = gridconsumption;
    } 
	
    /**
     * 属性 socialconsumption 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSocialconsumption(){
        return socialconsumption;
    }
	
    /**
     * 属性 socialconsumption 的set方法
     * @return
     */
    public void setSocialconsumption(BigDecimal socialconsumption){
        this.socialconsumption = socialconsumption;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaUsingdemand))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaUsingdemand other = (BaUsingdemand) o;	        
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
            .append("gridconsumption"+":"+getGridconsumption())
            .append("socialconsumption"+":"+getSocialconsumption())
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