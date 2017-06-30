package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoBusigeneratorqty的POJO类
 *
 * @author  DELL  [Sat Feb 22 12:00:58 CST 2014]
 * 
 */
public class CoBusigeneratorqty implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性purchaseunit
     */
    private String purchaseunit;
	
    /** 
     * 属性sellerunit
     */
    private String sellerunit;
	
    /** 
     * 属性netqty
     */
    private BigDecimal netqty;
	
    /** 
     * 属性genqty
     */
    private BigDecimal genqty;
	
    /** 
     * 属性timeno
     */
    private BigDecimal timeno;
	
    /** 
     * 属性startdate
     */
    private Date startdate;
	
    /** 
     * 属性enddate
     */
    private Date enddate;
	
    /** 
     * 属性period
     */
    private BigDecimal period;
	
    /** 
     * 属性marketid
     */
    private String marketid;
    
	/** 
     * 属性monthqtytype
     */
    private BigDecimal monthqtytype;
	
    /**
     * CoBusigeneratorqty构造函数
     */
    public CoBusigeneratorqty() {
        super();
    }  
	
    /**
     * CoBusigeneratorqty完整的构造函数
     */  
    public CoBusigeneratorqty(String guid,String contractid,BigDecimal timeno,BigDecimal period){
        this.guid = guid;
        this.contractid = contractid;
        this.timeno = timeno;
        this.period = period;
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
     * 属性 purchaseunit 的get方法
     * @return String
     */
    public String getPurchaseunit(){
        return purchaseunit;
    }
	
    /**
     * 属性 purchaseunit 的set方法
     * @return
     */
    public void setPurchaseunit(String purchaseunit){
        this.purchaseunit = purchaseunit;
    } 
	
	
	
    /**
     * 属性 sellerunit 的get方法
     * @return String
     */
    public String getSellerunit(){
        return sellerunit;
    }
	
    /**
     * 属性 sellerunit 的set方法
     * @return
     */
    public void setSellerunit(String sellerunit){
        this.sellerunit = sellerunit;
    } 
	
	
	
    /**
     * 属性 netqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetqty(){
        return netqty;
    }
	
    /**
     * 属性 netqty 的set方法
     * @return
     */
    public void setNetqty(BigDecimal netqty){
        this.netqty = netqty;
    } 
	
	
	
    /**
     * 属性 genqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenqty(){
        return genqty;
    }
	
    /**
     * 属性 genqty 的set方法
     * @return
     */
    public void setGenqty(BigDecimal genqty){
        this.genqty = genqty;
    } 
	
	
	
    /**
     * 属性 timeno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTimeno(){
        return timeno;
    }
	
    /**
     * 属性 timeno 的set方法
     * @return
     */
    public void setTimeno(BigDecimal timeno){
        this.timeno = timeno;
    } 
	
	
	
    /**
     * 属性 startdate 的get方法
     * @return Date
     */
    public Date getStartdate(){
        return startdate;
    }
	
    /**
     * 属性 startdate 的set方法
     * @return
     */
    public void setStartdate(Date startdate){
        this.startdate = startdate;
    } 
	
	
	
    /**
     * 属性 enddate 的get方法
     * @return Date
     */
    public Date getEnddate(){
        return enddate;
    }
	
    /**
     * 属性 enddate 的set方法
     * @return
     */
    public void setEnddate(Date enddate){
        this.enddate = enddate;
    } 
	
	
	
    /**
     * 属性 period 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPeriod(){
        return period;
    }
	
    /**
     * 属性 period 的set方法
     * @return
     */
    public void setPeriod(BigDecimal period){
        this.period = period;
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
    
    public BigDecimal getMonthqtytype() {
		return monthqtytype;
	}

	public void setMonthqtytype(BigDecimal monthqtytype) {
		this.monthqtytype = monthqtytype;
	}
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoBusigeneratorqty))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        CoBusigeneratorqty other = (CoBusigeneratorqty) o;	        
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
            .append("purchaseunit"+":"+getPurchaseunit())
            .append("sellerunit"+":"+getSellerunit())
            .append("netqty"+":"+getNetqty())
            .append("genqty"+":"+getGenqty())
            .append("timeno"+":"+getTimeno())
            .append("startdate"+":"+getStartdate())
            .append("enddate"+":"+getEnddate())
            .append("period"+":"+getPeriod())
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