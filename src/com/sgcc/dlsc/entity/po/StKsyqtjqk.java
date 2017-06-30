package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * StKsyqtjqk的POJO类
 *
 * @author  yuhe  [Tue Feb 11 16:47:53 CST 2014]
 * 
 */
public class StKsyqtjqk implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性qy
     */
    private String qy;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性zddlqk
     */
    private BigDecimal zddlqk;
	
    /** 
     * 属性zyyy
     */
    private String zyyy;
	
    /** 
     * 属性ksyqtjqk
     */
    private String ksyqtjqk;
	
    /** 
     * 属性sbzt
     */
    private String sbzt;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性thedate
     */
    private Date thedate;
	
    /**
     * StKsyqtjqk构造函数
     */
    public StKsyqtjqk() {
        super();
    }  
	
    /**
     * StKsyqtjqk完整的构造函数
     */  
    public StKsyqtjqk(String guid,BigDecimal theyear,BigDecimal themonth){
        this.guid = guid;
        this.theyear = theyear;
        this.themonth = themonth;
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
     * 属性 qy 的get方法
     * @return String
     */
    public String getQy(){
        return qy;
    }
	
    /**
     * 属性 qy 的set方法
     * @return
     */
    public void setQy(String qy){
        this.qy = qy;
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
     * 属性 zddlqk 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZddlqk(){
        return zddlqk;
    }
	
    /**
     * 属性 zddlqk 的set方法
     * @return
     */
    public void setZddlqk(BigDecimal zddlqk){
        this.zddlqk = zddlqk;
    } 
	
    /**
     * 属性 zyyy 的get方法
     * @return String
     */
    public String getZyyy(){
        return zyyy;
    }
	
    /**
     * 属性 zyyy 的set方法
     * @return
     */
    public void setZyyy(String zyyy){
        this.zyyy = zyyy;
    } 
	
    /**
     * 属性 ksyqtjqk 的get方法
     * @return String
     */
    public String getKsyqtjqk(){
        return ksyqtjqk;
    }
	
    /**
     * 属性 ksyqtjqk 的set方法
     * @return
     */
    public void setKsyqtjqk(String ksyqtjqk){
        this.ksyqtjqk = ksyqtjqk;
    } 
	
    /**
     * 属性 sbzt 的get方法
     * @return String
     */
    public String getSbzt(){
        return sbzt;
    }
	
    /**
     * 属性 sbzt 的set方法
     * @return
     */
    public void setSbzt(String sbzt){
        this.sbzt = sbzt;
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
     * 属性 thedate 的get方法
     * @return Date
     */
    public Date getThedate(){
        return thedate;
    }
	
    /**
     * 属性 thedate 的set方法
     * @return
     */
    public void setThedate(Date thedate){
        this.thedate = thedate;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof StKsyqtjqk))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        StKsyqtjqk other = (StKsyqtjqk) o;	        
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
            .append("qy"+":"+getQy())
            .append("marketid"+":"+getMarketid())
            .append("zddlqk"+":"+getZddlqk())
            .append("zyyy"+":"+getZyyy())
            .append("ksyqtjqk"+":"+getKsyqtjqk())
            .append("sbzt"+":"+getSbzt())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("thedate"+":"+getThedate())
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