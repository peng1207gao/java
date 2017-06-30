package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * StKqdljysjsb的POJO类
 *
 * @author  yuhe  [Tue Feb 11 11:56:10 CST 2014]
 * 
 */
public class StKqdljysjsb implements Serializable{

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
     * 属性tradingtype
     */
    private String tradingtype;
	
    /** 
     * 属性jytdid
     */
    private BigDecimal jytdid;
	
    /** 
     * 属性jsname
     */
    private String jsname;
	
    /** 
     * 属性jscf
     */
    private String jscf;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性ssgx
     */
    private String ssgx;
	
    /** 
     * 属性electricity
     */
    private BigDecimal electricity;
	
    /** 
     * 属性theprice
     */
    private BigDecimal theprice;
	
    /** 
     * 属性ldsfhdbgdj
     */
    private BigDecimal ldsfhdbgdj;
	
    /** 
     * 属性version
     */
    private String version;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性sbzt
     */
    private String sbzt;
	
    /** 
     * 属性theunit
     */
    private String theunit;
	
    /**
     * StKqdljysjsb构造函数
     */
    public StKqdljysjsb() {
        super();
    }  
	
    /**
     * StKqdljysjsb完整的构造函数
     */  
    public StKqdljysjsb(String guid,BigDecimal theyear,BigDecimal themonth,String tradingtype,BigDecimal jytdid,String jsname,String jscf,String marketid,String version){
        this.guid = guid;
        this.theyear = theyear;
        this.themonth = themonth;
        this.tradingtype = tradingtype;
        this.jytdid = jytdid;
        this.jsname = jsname;
        this.jscf = jscf;
        this.marketid = marketid;
        this.version = version;
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
     * 属性 tradingtype 的get方法
     * @return String
     */
    public String getTradingtype(){
        return tradingtype;
    }
	
    /**
     * 属性 tradingtype 的set方法
     * @return
     */
    public void setTradingtype(String tradingtype){
        this.tradingtype = tradingtype;
    } 
	
    /**
     * 属性 jytdid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJytdid(){
        return jytdid;
    }
	
    /**
     * 属性 jytdid 的set方法
     * @return
     */
    public void setJytdid(BigDecimal jytdid){
        this.jytdid = jytdid;
    } 
	
    /**
     * 属性 jsname 的get方法
     * @return String
     */
    public String getJsname(){
        return jsname;
    }
	
    /**
     * 属性 jsname 的set方法
     * @return
     */
    public void setJsname(String jsname){
        this.jsname = jsname;
    } 
	
    /**
     * 属性 jscf 的get方法
     * @return String
     */
    public String getJscf(){
        return jscf;
    }
	
    /**
     * 属性 jscf 的set方法
     * @return
     */
    public void setJscf(String jscf){
        this.jscf = jscf;
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
     * 属性 ssgx 的get方法
     * @return String
     */
    public String getSsgx(){
        return ssgx;
    }
	
    /**
     * 属性 ssgx 的set方法
     * @return
     */
    public void setSsgx(String ssgx){
        this.ssgx = ssgx;
    } 
	
    /**
     * 属性 electricity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricity(){
        return electricity;
    }
	
    /**
     * 属性 electricity 的set方法
     * @return
     */
    public void setElectricity(BigDecimal electricity){
        this.electricity = electricity;
    } 
	
    /**
     * 属性 theprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTheprice(){
        return theprice;
    }
	
    /**
     * 属性 theprice 的set方法
     * @return
     */
    public void setTheprice(BigDecimal theprice){
        this.theprice = theprice;
    } 
	
    /**
     * 属性 ldsfhdbgdj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLdsfhdbgdj(){
        return ldsfhdbgdj;
    }
	
    /**
     * 属性 ldsfhdbgdj 的set方法
     * @return
     */
    public void setLdsfhdbgdj(BigDecimal ldsfhdbgdj){
        this.ldsfhdbgdj = ldsfhdbgdj;
    } 
	
    /**
     * 属性 version 的get方法
     * @return String
     */
    public String getVersion(){
        return version;
    }
	
    /**
     * 属性 version 的set方法
     * @return
     */
    public void setVersion(String version){
        this.version = version;
    } 
	
    /**
     * 属性 updatetime 的get方法
     * @return Date
     */
    public Date getUpdatetime(){
        return updatetime;
    }
	
    /**
     * 属性 updatetime 的set方法
     * @return
     */
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
    } 
	
    /**
     * 属性 updatepersonid 的get方法
     * @return String
     */
    public String getUpdatepersonid(){
        return updatepersonid;
    }
	
    /**
     * 属性 updatepersonid 的set方法
     * @return
     */
    public void setUpdatepersonid(String updatepersonid){
        this.updatepersonid = updatepersonid;
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
     * 属性 theunit 的get方法
     * @return String
     */
    public String getTheunit(){
        return theunit;
    }
	
    /**
     * 属性 theunit 的set方法
     * @return
     */
    public void setTheunit(String theunit){
        this.theunit = theunit;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof StKqdljysjsb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        StKqdljysjsb other = (StKqdljysjsb) o;	        
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
            .append("tradingtype"+":"+getTradingtype())
            .append("jytdid"+":"+getJytdid())
            .append("jsname"+":"+getJsname())
            .append("jscf"+":"+getJscf())
            .append("marketid"+":"+getMarketid())
            .append("ssgx"+":"+getSsgx())
            .append("electricity"+":"+getElectricity())
            .append("theprice"+":"+getTheprice())
            .append("ldsfhdbgdj"+":"+getLdsfhdbgdj())
            .append("version"+":"+getVersion())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("sbzt"+":"+getSbzt())
            .append("theunit"+":"+getTheunit())
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