package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwGenerationrightstradeinfo的POJO类
 *
 * @author  Administrator  [Sun Feb 23 17:39:45 CST 2014]
 * 
 */
public class DwGenerationrightstradeinfo implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	private String marketname;
    public String getMarketname() {
		return marketname;
	}

	public void setMarketname(String marketname) {
		this.marketname = marketname;
	}


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
     * 属性elecquantity
     */
    private BigDecimal elecquantity;
	
    /** 
     * 属性savecoal
     */
    private BigDecimal savecoal;
	
    /** 
     * 属性reduceso2
     */
    private BigDecimal reduceso2;
	
    /** 
     * 属性reduceco2
     */
    private BigDecimal reduceco2;
	
    /**
     * DwGenerationrightstradeinfo构造函数
     */
    public DwGenerationrightstradeinfo() {
        super();
    }  
	
    /**
     * DwGenerationrightstradeinfo完整的构造函数
     */  
    public DwGenerationrightstradeinfo(String guid){
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
     * 属性 savecoal 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSavecoal(){
        return savecoal;
    }
	
    /**
     * 属性 savecoal 的set方法
     * @return
     */
    public void setSavecoal(BigDecimal savecoal){
        this.savecoal = savecoal;
    } 
	
    /**
     * 属性 reduceso2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getReduceso2(){
        return reduceso2;
    }
	
    /**
     * 属性 reduceso2 的set方法
     * @return
     */
    public void setReduceso2(BigDecimal reduceso2){
        this.reduceso2 = reduceso2;
    } 
	
    /**
     * 属性 reduceco2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getReduceco2(){
        return reduceco2;
    }
	
    /**
     * 属性 reduceco2 的set方法
     * @return
     */
    public void setReduceco2(BigDecimal reduceco2){
        this.reduceco2 = reduceco2;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwGenerationrightstradeinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwGenerationrightstradeinfo other = (DwGenerationrightstradeinfo) o;	        
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
            .append("elecquantity"+":"+getElecquantity())
            .append("savecoal"+":"+getSavecoal())
            .append("reduceso2"+":"+getReduceso2())
            .append("reduceco2"+":"+getReduceco2())
            .append("marketname"+":"+getMarketname())
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