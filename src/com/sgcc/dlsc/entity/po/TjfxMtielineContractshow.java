package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxMtielineContractshow的POJO类
 *
 * @author  dlsc  [Thu Oct 24 14:54:32 CST 2013]
 * 
 */
public class TjfxMtielineContractshow implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性mktMonth
     */
    private Date mktMonth;
	
    /** 
     * 属性linkid
     */
    private String linkid;
	
    /** 
     * 属性linkname
     */
    private String linkname;
	
    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性contractname
     */
    private String contractname;
	
    /** 
     * 属性sellerprice
     */
    private BigDecimal sellerprice;
	
    /** 
     * 属性transprice
     */
    private String transprice;
	
    /** 
     * 属性purchaserprice
     */
    private BigDecimal purchaserprice;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * TjfxMtielineContractshow构造函数
     */
    public TjfxMtielineContractshow() {
        super();
    }  
	
    /**
     * TjfxMtielineContractshow完整的构造函数
     */  
    public TjfxMtielineContractshow(String guid,Date mktMonth,String linkid,String linkname,String contractid){
        this.guid = guid;
        this.mktMonth = mktMonth;
        this.linkid = linkid;
        this.linkname = linkname;
        this.contractid = contractid;
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
     * 属性 mktMonth 的get方法
     * @return Date
     */
    public Date getMktMonth(){
        return mktMonth;
    }
	
    /**
     * 属性 mktMonth 的set方法
     * @return
     */
    public void setMktMonth(Date mktMonth){
        this.mktMonth = mktMonth;
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
     * 属性 linkname 的get方法
     * @return String
     */
    public String getLinkname(){
        return linkname;
    }
	
    /**
     * 属性 linkname 的set方法
     * @return
     */
    public void setLinkname(String linkname){
        this.linkname = linkname;
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
     * 属性 contractname 的get方法
     * @return String
     */
    public String getContractname(){
        return contractname;
    }
	
    /**
     * 属性 contractname 的set方法
     * @return
     */
    public void setContractname(String contractname){
        this.contractname = contractname;
    } 
	
    /**
     * 属性 sellerprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSellerprice(){
        return sellerprice;
    }
	
    /**
     * 属性 sellerprice 的set方法
     * @return
     */
    public void setSellerprice(BigDecimal sellerprice){
        this.sellerprice = sellerprice;
    } 
	
    /**
     * 属性 transprice 的get方法
     * @return String
     */
    public String getTransprice(){
        return transprice;
    }
	
    /**
     * 属性 transprice 的set方法
     * @return
     */
    public void setTransprice(String transprice){
        this.transprice = transprice;
    } 
	
    /**
     * 属性 purchaserprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPurchaserprice(){
        return purchaserprice;
    }
	
    /**
     * 属性 purchaserprice 的set方法
     * @return
     */
    public void setPurchaserprice(BigDecimal purchaserprice){
        this.purchaserprice = purchaserprice;
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
		
        if (o == null || !(o instanceof TjfxMtielineContractshow))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxMtielineContractshow other = (TjfxMtielineContractshow) o;	        
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
            .append("mktMonth"+":"+getMktMonth())
            .append("linkid"+":"+getLinkid())
            .append("linkname"+":"+getLinkname())
            .append("contractid"+":"+getContractid())
            .append("contractname"+":"+getContractname())
            .append("sellerprice"+":"+getSellerprice())
            .append("transprice"+":"+getTransprice())
            .append("purchaserprice"+":"+getPurchaserprice())
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