package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwTranscontract的POJO类
 *
 * @author  djdeng  [Thu Mar 13 15:37:57 CST 2014]
 * 
 */
public class DwTranscontract implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性thyear
     */
    private BigDecimal thyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性source
     */
    private String source;
	
    /** 
     * 属性linkid
     */
    private String linkid;
	
    /** 
     * 属性serialno
     */
    private BigDecimal serialno;
	
    /** 
     * 属性elecquantity
     */
    private BigDecimal elecquantity;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * DwTranscontract构造函数
     */
    public DwTranscontract() {
        super();
    }  
	
    /**
     * DwTranscontract完整的构造函数
     */  
    public DwTranscontract(String guid){
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
     * 属性 thyear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getThyear(){
        return thyear;
    }
	
    /**
     * 属性 thyear 的set方法
     * @return
     */
    public void setThyear(BigDecimal thyear){
        this.thyear = thyear;
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
     * 属性 source 的get方法
     * @return String
     */
    public String getSource(){
        return source;
    }
	
    /**
     * 属性 source 的set方法
     * @return
     */
    public void setSource(String source){
        this.source = source;
    } 
	
    /**
     * 属性 linkid 的get方法
     * @return String
     */
    public String getLinkid(){
        return linkid;
    }
	
    /**
     * 属性 linkid 的set方法
     * @return
     */
    public void setLinkid(String linkid){
        this.linkid = linkid;
    } 
	
    /**
     * 属性 serialno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSerialno(){
        return serialno;
    }
	
    /**
     * 属性 serialno 的set方法
     * @return
     */
    public void setSerialno(BigDecimal serialno){
        this.serialno = serialno;
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
		
        if (o == null || !(o instanceof DwTranscontract))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwTranscontract other = (DwTranscontract) o;	        
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
            .append("contractid"+":"+getContractid())
            .append("thyear"+":"+getThyear())
            .append("themonth"+":"+getThemonth())
            .append("source"+":"+getSource())
            .append("linkid"+":"+getLinkid())
            .append("serialno"+":"+getSerialno())
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