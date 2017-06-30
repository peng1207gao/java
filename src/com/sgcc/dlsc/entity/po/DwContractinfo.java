package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwContractinfo的POJO类
 *
 * @author  wangqibin  [Fri Mar 07 09:30:28 CST 2014]
 * 
 */
public class DwContractinfo implements Serializable{

    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性contractname
     */
    private String contractname;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性vendeetradeunit
     */
    private String vendeetradeunit;
	
    /** 
     * 属性saletradeunit
     */
    private String saletradeunit;
	
    /** 
     * 属性vendeeparticipantid
     */
    private String vendeeparticipantid;
	
    /** 
     * 属性saleparticipantid
     */
    private String saleparticipantid;
	
    /** 
     * 属性tradeseqid
     */
    private String tradeseqid;
	
    /** 
     * 属性contracttype
     */
    private String contracttype;
	
    /** 
     * 属性tradetype
     */
    private String tradetype;
	
    /** 
     * 属性contractperiod
     */
    private BigDecimal contractperiod;
	
    /** 
     * 属性startdate
     */
    private Date startdate;
	
    /** 
     * 属性enddata
     */
    private Date enddata;
	
    /** 
     * 属性contractstatus
     */
    private BigDecimal contractstatus;
	
    /** 
     * 属性tradeelecquantity
     */
    private BigDecimal tradeelecquantity;
	
    /** 
     * 属性isdelete
     */
    private BigDecimal isdelete;
	
    /**
     * DwContractinfo构造函数
     */
    public DwContractinfo() {
        super();
    }  
	
    /**
     * DwContractinfo完整的构造函数
     */  
    public DwContractinfo(String contractid){
        this.contractid = contractid;
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
        if(contractid != null && contractid.trim().length() == 0){
            this.contractid = null;
        }else{
            this.contractid = contractid;
        }
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
     * 属性 vendeeparticipantid 的get方法
     * @return String
     */
    public String getVendeeparticipantid(){
        return vendeeparticipantid;
    }
	
    /**
     * 属性 vendeeparticipantid 的set方法
     * @return
     */
    public void setVendeeparticipantid(String vendeeparticipantid){
        this.vendeeparticipantid = vendeeparticipantid;
    } 
	
    /**
     * 属性 saleparticipantid 的get方法
     * @return String
     */
    public String getSaleparticipantid(){
        return saleparticipantid;
    }
	
    /**
     * 属性 saleparticipantid 的set方法
     * @return
     */
    public void setSaleparticipantid(String saleparticipantid){
        this.saleparticipantid = saleparticipantid;
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
     * 属性 contracttype 的get方法
     * @return String
     */
    public String getContracttype(){
        return contracttype;
    }
	
    /**
     * 属性 contracttype 的set方法
     * @return
     */
    public void setContracttype(String contracttype){
        this.contracttype = contracttype;
    } 
	
    /**
     * 属性 tradetype 的get方法
     * @return String
     */
    public String getTradetype(){
        return tradetype;
    }
	
    /**
     * 属性 tradetype 的set方法
     * @return
     */
    public void setTradetype(String tradetype){
        this.tradetype = tradetype;
    } 
	
    /**
     * 属性 contractperiod 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractperiod(){
        return contractperiod;
    }
	
    /**
     * 属性 contractperiod 的set方法
     * @return
     */
    public void setContractperiod(BigDecimal contractperiod){
        this.contractperiod = contractperiod;
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
     * 属性 enddata 的get方法
     * @return Date
     */
    public Date getEnddata(){
        return enddata;
    }
	
    /**
     * 属性 enddata 的set方法
     * @return
     */
    public void setEnddata(Date enddata){
        this.enddata = enddata;
    } 
	
    /**
     * 属性 contractstatus 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractstatus(){
        return contractstatus;
    }
	
    /**
     * 属性 contractstatus 的set方法
     * @return
     */
    public void setContractstatus(BigDecimal contractstatus){
        this.contractstatus = contractstatus;
    } 
	
    /**
     * 属性 tradeelecquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradeelecquantity(){
        return tradeelecquantity;
    }
	
    /**
     * 属性 tradeelecquantity 的set方法
     * @return
     */
    public void setTradeelecquantity(BigDecimal tradeelecquantity){
        this.tradeelecquantity = tradeelecquantity;
    } 
	
    /**
     * 属性 isdelete 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdelete(){
        return isdelete;
    }
	
    /**
     * 属性 isdelete 的set方法
     * @return
     */
    public void setIsdelete(BigDecimal isdelete){
        this.isdelete = isdelete;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwContractinfo))
	        return false; 
			
        if(getContractid() == null) 
	        return false;

        DwContractinfo other = (DwContractinfo) o;	        
	    return new EqualsBuilder()
            .append(this.getContractid(), other.getContractid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("contractid"+":"+getContractid())
            .append("contractname"+":"+getContractname())
            .append("marketid"+":"+getMarketid())
            .append("vendeetradeunit"+":"+getVendeetradeunit())
            .append("saletradeunit"+":"+getSaletradeunit())
            .append("vendeeparticipantid"+":"+getVendeeparticipantid())
            .append("saleparticipantid"+":"+getSaleparticipantid())
            .append("tradeseqid"+":"+getTradeseqid())
            .append("contracttype"+":"+getContracttype())
            .append("tradetype"+":"+getTradetype())
            .append("contractperiod"+":"+getContractperiod())
            .append("startdate"+":"+getStartdate())
            .append("enddata"+":"+getEnddata())
            .append("contractstatus"+":"+getContractstatus())
            .append("tradeelecquantity"+":"+getTradeelecquantity())
            .append("isdelete"+":"+getIsdelete())
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