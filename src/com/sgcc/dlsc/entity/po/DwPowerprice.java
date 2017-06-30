package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwPowerprice的POJO类
 *
 * @author  Administrator  [Wed Mar 12 14:45:43 CST 2014]
 * 
 */
public class DwPowerprice implements Serializable{

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
     * 属性price
     */
    private BigDecimal price;
	
    /**
     * DwPowerprice构造函数
     */
    public DwPowerprice() {
        super();
    }  
	
    /**
     * DwPowerprice完整的构造函数
     */  
    public DwPowerprice(String guid){
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
		
        if (o == null || !(o instanceof DwPowerprice))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwPowerprice other = (DwPowerprice) o;	        
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