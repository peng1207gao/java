package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwTransregionaltradeinfo的POJO类
 *
 * @author  Administrator  [Mon Feb 24 11:30:56 CST 2014]
 * 
 */
public class DwTransregionaltradeinfo implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	private String marketname;
	
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


	private String powertypename;
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性linkid
     */
    private String linkid;
	
    /** 
     * 属性linkname
     */
    private String linkname;
	
    /** 
     * 属性thetype
     */
    private String thetype;
	
    /** 
     * 属性elecquantity
     */
    private BigDecimal elecquantity;
	
    /** 
     * 属性ssgx
     */
    private String ssgx;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * DwTransregionaltradeinfo构造函数
     */
    public DwTransregionaltradeinfo() {
        super();
    }  
	
    /**
     * DwTransregionaltradeinfo完整的构造函数
     */  
    public DwTransregionaltradeinfo(String guid){
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
     * 属性 ssgx 的get方法
     * @return String
     */
    public String getSsgx(){
        return ssgx;
    }
	
    /**
     * 属性 ssgx 的set方法
     * @return
     */
    public void setSsgx(String ssgx){
        this.ssgx = ssgx;
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
		
        if (o == null || !(o instanceof DwTransregionaltradeinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwTransregionaltradeinfo other = (DwTransregionaltradeinfo) o;	        
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
            .append("linkid"+":"+getLinkid())
            .append("linkname"+":"+getLinkname())
            .append("thetype"+":"+getThetype())
            .append("elecquantity"+":"+getElecquantity())
            .append("ssgx"+":"+getSsgx())
            .append("marketid"+":"+getMarketid())
            .append("marketname"+":"+getMarketname())
            .append("powertypename"+":"+getPowertypename())
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