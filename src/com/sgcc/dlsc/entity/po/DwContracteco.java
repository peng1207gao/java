package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwContracteco的POJO类
 *
 * @author  djdeng  [Thu Mar 13 15:41:58 CST 2014]
 * 
 */
public class DwContracteco implements Serializable{

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
     * 属性vendeeecounit
     */
    private String vendeeecounit;
	
    /** 
     * 属性saleecounit
     */
    private String saleecounit;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性gridenergy
     */
    private BigDecimal gridenergy;
	
    /** 
     * 属性genenergy
     */
    private BigDecimal genenergy;
	
    /** 
     * 属性contractprice
     */
    private BigDecimal contractprice;
	
    /** 
     * 属性catalogprice
     */
    private BigDecimal catalogprice;
	
    /** 
     * 属性approveprice
     */
    private BigDecimal approveprice;
	
    /**
     * DwContracteco构造函数
     */
    public DwContracteco() {
        super();
    }  
	
    /**
     * DwContracteco完整的构造函数
     */  
    public DwContracteco(String guid){
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
     * 属性 vendeeecounit 的get方法
     * @return String
     */
    public String getVendeeecounit(){
        return vendeeecounit;
    }
	
    /**
     * 属性 vendeeecounit 的set方法
     * @return
     */
    public void setVendeeecounit(String vendeeecounit){
        this.vendeeecounit = vendeeecounit;
    } 
	
    /**
     * 属性 saleecounit 的get方法
     * @return String
     */
    public String getSaleecounit(){
        return saleecounit;
    }
	
    /**
     * 属性 saleecounit 的set方法
     * @return
     */
    public void setSaleecounit(String saleecounit){
        this.saleecounit = saleecounit;
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
     * 属性 gridenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGridenergy(){
        return gridenergy;
    }
	
    /**
     * 属性 gridenergy 的set方法
     * @return
     */
    public void setGridenergy(BigDecimal gridenergy){
        this.gridenergy = gridenergy;
    } 
	
    /**
     * 属性 genenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenenergy(){
        return genenergy;
    }
	
    /**
     * 属性 genenergy 的set方法
     * @return
     */
    public void setGenenergy(BigDecimal genenergy){
        this.genenergy = genenergy;
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
     * 属性 catalogprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCatalogprice(){
        return catalogprice;
    }
	
    /**
     * 属性 catalogprice 的set方法
     * @return
     */
    public void setCatalogprice(BigDecimal catalogprice){
        this.catalogprice = catalogprice;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwContracteco))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwContracteco other = (DwContracteco) o;	        
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
            .append("vendeeecounit"+":"+getVendeeecounit())
            .append("saleecounit"+":"+getSaleecounit())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("gridenergy"+":"+getGridenergy())
            .append("genenergy"+":"+getGenenergy())
            .append("contractprice"+":"+getContractprice())
            .append("catalogprice"+":"+getCatalogprice())
            .append("approveprice"+":"+getApproveprice())
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