package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwContractmarketmember的POJO类
 *
 * @author  djdeng  [Thu Mar 13 15:31:51 CST 2014]
 * 
 */
public class DwContractmarketmember implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性vendeeparticipantid
     */
    private String vendeeparticipantid;
	
    /** 
     * 属性saleparticipantid
     */
    private String saleparticipantid;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性vendeeenergy
     */
    private BigDecimal vendeeenergy;
	
    /** 
     * 属性vendeegrosseng
     */
    private BigDecimal vendeegrosseng;
	
    /** 
     * 属性vendeeaveprice
     */
    private BigDecimal vendeeaveprice;
	
    /** 
     * 属性contractaveprice
     */
    private BigDecimal contractaveprice;
	
    /** 
     * 属性saleenergy
     */
    private BigDecimal saleenergy;
	
    /** 
     * 属性salegrosseng
     */
    private BigDecimal salegrosseng;
	
    /** 
     * 属性saleaveprice
     */
    private BigDecimal saleaveprice;
	
    /** 
     * 属性approveaveprice
     */
    private BigDecimal approveaveprice;
	
    /** 
     * 属性saleaddquantity
     */
    private BigDecimal saleaddquantity;
	
    /** 
     * 属性saleaddhour
     */
    private BigDecimal saleaddhour;
	
    /** 
     * 属性salecapacity
     */
    private BigDecimal salecapacity;
	
    /**
     * DwContractmarketmember构造函数
     */
    public DwContractmarketmember() {
        super();
    }  
	
    /**
     * DwContractmarketmember完整的构造函数
     */  
    public DwContractmarketmember(String guid){
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
     * 属性 vendeeaveprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeaveprice(){
        return vendeeaveprice;
    }
	
    /**
     * 属性 vendeeaveprice 的set方法
     * @return
     */
    public void setVendeeaveprice(BigDecimal vendeeaveprice){
        this.vendeeaveprice = vendeeaveprice;
    } 
	
    /**
     * 属性 contractaveprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractaveprice(){
        return contractaveprice;
    }
	
    /**
     * 属性 contractaveprice 的set方法
     * @return
     */
    public void setContractaveprice(BigDecimal contractaveprice){
        this.contractaveprice = contractaveprice;
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
     * 属性 saleaveprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleaveprice(){
        return saleaveprice;
    }
	
    /**
     * 属性 saleaveprice 的set方法
     * @return
     */
    public void setSaleaveprice(BigDecimal saleaveprice){
        this.saleaveprice = saleaveprice;
    } 
	
    /**
     * 属性 approveaveprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getApproveaveprice(){
        return approveaveprice;
    }
	
    /**
     * 属性 approveaveprice 的set方法
     * @return
     */
    public void setApproveaveprice(BigDecimal approveaveprice){
        this.approveaveprice = approveaveprice;
    } 
	
    /**
     * 属性 saleaddquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleaddquantity(){
        return saleaddquantity;
    }
	
    /**
     * 属性 saleaddquantity 的set方法
     * @return
     */
    public void setSaleaddquantity(BigDecimal saleaddquantity){
        this.saleaddquantity = saleaddquantity;
    } 
	
    /**
     * 属性 saleaddhour 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleaddhour(){
        return saleaddhour;
    }
	
    /**
     * 属性 saleaddhour 的set方法
     * @return
     */
    public void setSaleaddhour(BigDecimal saleaddhour){
        this.saleaddhour = saleaddhour;
    } 
	
    /**
     * 属性 salecapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSalecapacity(){
        return salecapacity;
    }
	
    /**
     * 属性 salecapacity 的set方法
     * @return
     */
    public void setSalecapacity(BigDecimal salecapacity){
        this.salecapacity = salecapacity;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwContractmarketmember))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwContractmarketmember other = (DwContractmarketmember) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("vendeeparticipantid"+":"+getVendeeparticipantid())
            .append("saleparticipantid"+":"+getSaleparticipantid())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("vendeeenergy"+":"+getVendeeenergy())
            .append("vendeegrosseng"+":"+getVendeegrosseng())
            .append("vendeeaveprice"+":"+getVendeeaveprice())
            .append("contractaveprice"+":"+getContractaveprice())
            .append("saleenergy"+":"+getSaleenergy())
            .append("salegrosseng"+":"+getSalegrosseng())
            .append("saleaveprice"+":"+getSaleaveprice())
            .append("approveaveprice"+":"+getApproveaveprice())
            .append("saleaddquantity"+":"+getSaleaddquantity())
            .append("saleaddhour"+":"+getSaleaddhour())
            .append("salecapacity"+":"+getSalecapacity())
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