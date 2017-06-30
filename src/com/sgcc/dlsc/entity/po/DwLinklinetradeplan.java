package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwLinklinetradeplan的POJO类
 *
 * @author  wangqibin  [Sun Feb 23 19:16:05 CST 2014]
 * 
 */
public class DwLinklinetradeplan implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性linkid
     */
    private String linkid;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性contractname
     */
    private String contractname;
	
    /** 
     * 属性elecquantity
     */
    private BigDecimal elecquantity;
	
    /** 
     * 属性maxload
     */
    private BigDecimal maxload;
	
    /** 
     * 属性period
     */
    private String period;
	
    /** 
     * 属性direction
     */
    private BigDecimal direction;
	
    /**
     * DwLinklinetradeplan构造函数
     */
    public DwLinklinetradeplan() {
        super();
    }  
	
    /**
     * DwLinklinetradeplan完整的构造函数
     */  
    public DwLinklinetradeplan(String guid){
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
     * 属性 maxload 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxload(){
        return maxload;
    }
	
    /**
     * 属性 maxload 的set方法
     * @return
     */
    public void setMaxload(BigDecimal maxload){
        this.maxload = maxload;
    } 
	
    /**
     * 属性 period 的get方法
     * @return String
     */
    public String getPeriod(){
        return period;
    }
	
    /**
     * 属性 period 的set方法
     * @return
     */
    public void setPeriod(String period){
        this.period = period;
    } 
	
    /**
     * 属性 direction 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDirection(){
        return direction;
    }
	
    /**
     * 属性 direction 的set方法
     * @return
     */
    public void setDirection(BigDecimal direction){
        this.direction = direction;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwLinklinetradeplan))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwLinklinetradeplan other = (DwLinklinetradeplan) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("linkid"+":"+getLinkid())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("contractid"+":"+getContractid())
            .append("contractname"+":"+getContractname())
            .append("elecquantity"+":"+getElecquantity())
            .append("maxload"+":"+getMaxload())
            .append("period"+":"+getPeriod())
            .append("direction"+":"+getDirection())
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