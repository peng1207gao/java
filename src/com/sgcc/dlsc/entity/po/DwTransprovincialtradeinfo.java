package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwTransprovincialtradeinfo的POJO类
 *
 * @author  Administrator  [Sun Feb 23 17:55:00 CST 2014]
 * 
 */
public class DwTransprovincialtradeinfo implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
    private String  marketname;
    private String powertypename;
    private String sourcename;
    private String geogrregionname;
    public String getMarketname() {
		return marketname;
	}

	public void setMarketname(String marketname) {
		this.marketname = marketname;
	}

	public String getPowertypename() {
		return powertypename;
	}

	public void setPowertypename(String powertypename) {
		this.powertypename = powertypename;
	}

	public String getSourcename() {
		return sourcename;
	}

	public void setSourcename(String sourcename) {
		this.sourcename = sourcename;
	}

	public String getGeogrregionname() {
		return geogrregionname;
	}

	public void setGeogrregionname(String geogrregionname) {
		this.geogrregionname = geogrregionname;
	}


	/** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性thetype
     */
    private String thetype;
	
    /** 
     * 属性elecquantity
     */
    private BigDecimal elecquantity;
	
    /** 
     * 属性source
     */
    private String source;
	
    /** 
     * 属性destination
     */
    private String destination;
	
    /**
     * DwTransprovincialtradeinfo构造函数
     */
    public DwTransprovincialtradeinfo() {
        super();
    }  
	
    /**
     * DwTransprovincialtradeinfo完整的构造函数
     */  
    public DwTransprovincialtradeinfo(String guid){
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
     * 属性 source 的get方法
     * @return String
     */
    public String getSource(){
        return source;
    }
	
    /**
     * 属性 source 的set方法
     * @return
     */
    public void setSource(String source){
        this.source = source;
    } 
	
    /**
     * 属性 destination 的get方法
     * @return String
     */
    public String getDestination(){
        return destination;
    }
	
    /**
     * 属性 destination 的set方法
     * @return
     */
    public void setDestination(String destination){
        this.destination = destination;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwTransprovincialtradeinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwTransprovincialtradeinfo other = (DwTransprovincialtradeinfo) o;	        
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
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("marketid"+":"+getMarketid())
            .append("thetype"+":"+getThetype())
            .append("elecquantity"+":"+getElecquantity())
            .append("source"+":"+getSource())
            .append("destination"+":"+getDestination())
            .append("marketname"+":"+getMarketname())
            .append("powertypename"+":"+getPowertypename())
            .append("sourcename"+":"+getSourcename())
            .append("geogrregionname"+":"+getGeogrregionname())
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