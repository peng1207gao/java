package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwIntertieprice的POJO类
 *
 * @author  eveliy  [Wed Mar 12 10:10:29 CST 2014]
 * 
 */
public class DwIntertieprice implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性linkid
     */
    private String linkid;
	
    /** 
     * 属性linkname
     */
    private String linkname;
	
    /** 
     * 属性price
     */
    private BigDecimal price;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性startstationname
     */
    private String startstationname;
	
    /** 
     * 属性endstationname
     */
    private String endstationname;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * DwIntertieprice构造函数
     */
    public DwIntertieprice() {
        super();
    }  
	
    /**
     * DwIntertieprice完整的构造函数
     */  
    public DwIntertieprice(String guid){
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
     * 属性 starteffectivedate 的get方法
     * @return Date
     */
    public Date getStarteffectivedate(){
        return starteffectivedate;
    }
	
    /**
     * 属性 starteffectivedate 的set方法
     * @return
     */
    public void setStarteffectivedate(Date starteffectivedate){
        this.starteffectivedate = starteffectivedate;
    } 
	
    /**
     * 属性 startstationname 的get方法
     * @return String
     */
    public String getStartstationname(){
        return startstationname;
    }
	
    /**
     * 属性 startstationname 的set方法
     * @return
     */
    public void setStartstationname(String startstationname){
        this.startstationname = startstationname;
    } 
	
    /**
     * 属性 endstationname 的get方法
     * @return String
     */
    public String getEndstationname(){
        return endstationname;
    }
	
    /**
     * 属性 endstationname 的set方法
     * @return
     */
    public void setEndstationname(String endstationname){
        this.endstationname = endstationname;
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
		
        if (o == null || !(o instanceof DwIntertieprice))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwIntertieprice other = (DwIntertieprice) o;	        
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
            .append("linkid"+":"+getLinkid())
            .append("linkname"+":"+getLinkname())
            .append("price"+":"+getPrice())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("startstationname"+":"+getStartstationname())
            .append("endstationname"+":"+getEndstationname())
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