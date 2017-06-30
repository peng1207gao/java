package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwApprovetrasnprice的POJO类
 *
 * @author  xiabaike  [Wed Mar 12 19:45:04 CST 2014]
 * 
 */
public class DwApprovetrasnprice implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性starteffecttime
     */
    private Date starteffecttime;
	
    /** 
     * 属性voltagegrade
     */
    private BigDecimal voltagegrade;
	
    /** 
     * 属性price
     */
    private BigDecimal price;
	
    /**
     * DwApprovetrasnprice构造函数
     */
    public DwApprovetrasnprice() {
        super();
    }  
	
    /**
     * DwApprovetrasnprice完整的构造函数
     */  
    public DwApprovetrasnprice(String guid){
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
     * 属性 starteffecttime 的get方法
     * @return Date
     */
    public Date getStarteffecttime(){
        return starteffecttime;
    }
	
    /**
     * 属性 starteffecttime 的set方法
     * @return
     */
    public void setStarteffecttime(Date starteffecttime){
        this.starteffecttime = starteffecttime;
    } 
	
    /**
     * 属性 voltagegrade 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVoltagegrade(){
        return voltagegrade;
    }
	
    /**
     * 属性 voltagegrade 的set方法
     * @return
     */
    public void setVoltagegrade(BigDecimal voltagegrade){
        this.voltagegrade = voltagegrade;
    } 
	
    /**
     * 属性 price 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrice(){
        return price;
    }
	
    /**
     * 属性 price 的set方法
     * @return
     */
    public void setPrice(BigDecimal price){
        this.price = price;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwApprovetrasnprice))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwApprovetrasnprice other = (DwApprovetrasnprice) o;	        
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
            .append("starteffecttime"+":"+getStarteffecttime())
            .append("voltagegrade"+":"+getVoltagegrade())
            .append("price"+":"+getPrice())
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