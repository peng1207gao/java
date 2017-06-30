package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwTradeunitresult的POJO类
 *
 * @author  eveliy  [Fri Mar 14 11:11:44 CST 2014]
 * 
 */
public class DwTradeunitresult implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeseqid
     */
    private String tradeseqid;
	
    /** 
     * 属性theyear
     */
    private Date theyear;
	
    /** 
     * 属性themonth
     */
    private Date themonth;
	
    /** 
     * 属性tradebrand
     */
    private BigDecimal tradebrand;
	
    /** 
     * 属性vendeetradeunit
     */
    private String vendeetradeunit;
	
    /** 
     * 属性saletradeunit
     */
    private String saletradeunit;
	
    /** 
     * 属性vendeeenergy
     */
    private BigDecimal vendeeenergy;
	
    /** 
     * 属性vendeegrosseng
     */
    private BigDecimal vendeegrosseng;
	
    /** 
     * 属性vendeeprice
     */
    private BigDecimal vendeeprice;
	
    /** 
     * 属性contractprice
     */
    private BigDecimal contractprice;
	
    /** 
     * 属性saleenergy
     */
    private BigDecimal saleenergy;
	
    /** 
     * 属性salegrosseng
     */
    private BigDecimal salegrosseng;
	
    /** 
     * 属性saleprice
     */
    private BigDecimal saleprice;
	
    /** 
     * 属性approveprice
     */
    private BigDecimal approveprice;
	
    /** 
     * 属性thetype
     */
    private String thetype;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * DwTradeunitresult构造函数
     */
    public DwTradeunitresult() {
        super();
    }  
	
    /**
     * DwTradeunitresult完整的构造函数
     */  
    public DwTradeunitresult(String guid){
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
     * 属性 tradeseqid 的get方法
     * @return String
     */
    public String getTradeseqid(){
        return tradeseqid;
    }
	
    /**
     * 属性 tradeseqid 的set方法
     * @return
     */
    public void setTradeseqid(String tradeseqid){
        this.tradeseqid = tradeseqid;
    } 
	
    /**
     * 属性 theyear 的get方法
     * @return Date
     */
    public Date getTheyear(){
        return theyear;
    }
	
    /**
     * 属性 theyear 的set方法
     * @return
     */
    public void setTheyear(Date theyear){
        this.theyear = theyear;
    } 
	
    /**
     * 属性 themonth 的get方法
     * @return Date
     */
    public Date getThemonth(){
        return themonth;
    }
	
    /**
     * 属性 themonth 的set方法
     * @return
     */
    public void setThemonth(Date themonth){
        this.themonth = themonth;
    } 
	
    /**
     * 属性 tradebrand 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradebrand(){
        return tradebrand;
    }
	
    /**
     * 属性 tradebrand 的set方法
     * @return
     */
    public void setTradebrand(BigDecimal tradebrand){
        this.tradebrand = tradebrand;
    } 
	
    /**
     * 属性 vendeetradeunit 的get方法
     * @return String
     */
    public String getVendeetradeunit(){
        return vendeetradeunit;
    }
	
    /**
     * 属性 vendeetradeunit 的set方法
     * @return
     */
    public void setVendeetradeunit(String vendeetradeunit){
        this.vendeetradeunit = vendeetradeunit;
    } 
	
    /**
     * 属性 saletradeunit 的get方法
     * @return String
     */
    public String getSaletradeunit(){
        return saletradeunit;
    }
	
    /**
     * 属性 saletradeunit 的set方法
     * @return
     */
    public void setSaletradeunit(String saletradeunit){
        this.saletradeunit = saletradeunit;
    } 
	
    /**
     * 属性 vendeeenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeenergy(){
        return vendeeenergy;
    }
	
    /**
     * 属性 vendeeenergy 的set方法
     * @return
     */
    public void setVendeeenergy(BigDecimal vendeeenergy){
        this.vendeeenergy = vendeeenergy;
    } 
	
    /**
     * 属性 vendeegrosseng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeegrosseng(){
        return vendeegrosseng;
    }
	
    /**
     * 属性 vendeegrosseng 的set方法
     * @return
     */
    public void setVendeegrosseng(BigDecimal vendeegrosseng){
        this.vendeegrosseng = vendeegrosseng;
    } 
	
    /**
     * 属性 vendeeprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeprice(){
        return vendeeprice;
    }
	
    /**
     * 属性 vendeeprice 的set方法
     * @return
     */
    public void setVendeeprice(BigDecimal vendeeprice){
        this.vendeeprice = vendeeprice;
    } 
	
    /**
     * 属性 contractprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractprice(){
        return contractprice;
    }
	
    /**
     * 属性 contractprice 的set方法
     * @return
     */
    public void setContractprice(BigDecimal contractprice){
        this.contractprice = contractprice;
    } 
	
    /**
     * 属性 saleenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleenergy(){
        return saleenergy;
    }
	
    /**
     * 属性 saleenergy 的set方法
     * @return
     */
    public void setSaleenergy(BigDecimal saleenergy){
        this.saleenergy = saleenergy;
    } 
	
    /**
     * 属性 salegrosseng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSalegrosseng(){
        return salegrosseng;
    }
	
    /**
     * 属性 salegrosseng 的set方法
     * @return
     */
    public void setSalegrosseng(BigDecimal salegrosseng){
        this.salegrosseng = salegrosseng;
    } 
	
    /**
     * 属性 saleprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleprice(){
        return saleprice;
    }
	
    /**
     * 属性 saleprice 的set方法
     * @return
     */
    public void setSaleprice(BigDecimal saleprice){
        this.saleprice = saleprice;
    } 
	
    /**
     * 属性 approveprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getApproveprice(){
        return approveprice;
    }
	
    /**
     * 属性 approveprice 的set方法
     * @return
     */
    public void setApproveprice(BigDecimal approveprice){
        this.approveprice = approveprice;
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
		
        if (o == null || !(o instanceof DwTradeunitresult))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwTradeunitresult other = (DwTradeunitresult) o;	        
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
            .append("tradeseqid"+":"+getTradeseqid())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("tradebrand"+":"+getTradebrand())
            .append("vendeetradeunit"+":"+getVendeetradeunit())
            .append("saletradeunit"+":"+getSaletradeunit())
            .append("vendeeenergy"+":"+getVendeeenergy())
            .append("vendeegrosseng"+":"+getVendeegrosseng())
            .append("vendeeprice"+":"+getVendeeprice())
            .append("contractprice"+":"+getContractprice())
            .append("saleenergy"+":"+getSaleenergy())
            .append("salegrosseng"+":"+getSalegrosseng())
            .append("saleprice"+":"+getSaleprice())
            .append("approveprice"+":"+getApproveprice())
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