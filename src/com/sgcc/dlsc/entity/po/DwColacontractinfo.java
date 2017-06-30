package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwColacontractinfo的POJO类
 *
 * @author  wangqibin  [Mon Mar 24 14:05:43 CST 2014]
 * 
 */
public class DwColacontractinfo implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
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
     * 属性contractenergy
     */
    private BigDecimal contractenergy;
	
    /** 
     * 属性capacitylevel
     */
    private String capacitylevel;
	
    /**
     * DwColacontractinfo构造函数
     */
    public DwColacontractinfo() {
        super();
    }  
	
    /**
     * DwColacontractinfo完整的构造函数
     */  
    public DwColacontractinfo(String guid){
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
     * 属性 contractenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractenergy(){
        return contractenergy;
    }
	
    /**
     * 属性 contractenergy 的set方法
     * @return
     */
    public void setContractenergy(BigDecimal contractenergy){
        this.contractenergy = contractenergy;
    } 
	
    /**
     * 属性 capacitylevel 的get方法
     * @return String
     */
    public String getCapacitylevel(){
        return capacitylevel;
    }
	
    /**
     * 属性 capacitylevel 的set方法
     * @return
     */
    public void setCapacitylevel(String capacitylevel){
        this.capacitylevel = capacitylevel;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwColacontractinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwColacontractinfo other = (DwColacontractinfo) o;	        
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
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("gridenergy"+":"+getGridenergy())
            .append("contractenergy"+":"+getContractenergy())
            .append("capacitylevel"+":"+getCapacitylevel())
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