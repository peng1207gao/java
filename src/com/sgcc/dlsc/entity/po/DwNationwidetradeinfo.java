package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwNationwidetradeinfo的POJO类
 *
 * @author  Administrator  [Mon Feb 24 15:41:03 CST 2014]
 * 
 */
public class DwNationwidetradeinfo implements Serializable{
	private String marketname;
    /** 
     * 属性guid
     */
    private String guid;
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
     * 属性total
     */
    private BigDecimal total;
	
    public String getMarketname() {
		return marketname;
	}

	public void setMarketname(String marketname) {
		this.marketname = marketname;
	}


	/** 
     * 属性coalpower
     */
    private BigDecimal coalpower;
	
    /** 
     * 属性hydroelectric
     */
    private BigDecimal hydroelectric;
	
    /** 
     * 属性nuclearpower
     */
    private BigDecimal nuclearpower;
	
    /** 
     * 属性cocurent
     */
    private BigDecimal cocurent;
	
    /** 
     * 属性exchange
     */
    private BigDecimal exchange;
	
    /** 
     * 属性theother
     */
    private BigDecimal theother;
	
    /**
     * DwNationwidetradeinfo构造函数
     */
    public DwNationwidetradeinfo() {
        super();
    }  
	
    /**
     * DwNationwidetradeinfo完整的构造函数
     */  
    public DwNationwidetradeinfo(String guid){
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
     * 属性 total 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTotal(){
        return total;
    }
	
    /**
     * 属性 total 的set方法
     * @return
     */
    public void setTotal(BigDecimal total){
        this.total = total;
    } 
	
    /**
     * 属性 coalpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCoalpower(){
        return coalpower;
    }
	
    /**
     * 属性 coalpower 的set方法
     * @return
     */
    public void setCoalpower(BigDecimal coalpower){
        this.coalpower = coalpower;
    } 
	
    /**
     * 属性 hydroelectric 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHydroelectric(){
        return hydroelectric;
    }
	
    /**
     * 属性 hydroelectric 的set方法
     * @return
     */
    public void setHydroelectric(BigDecimal hydroelectric){
        this.hydroelectric = hydroelectric;
    } 
	
    /**
     * 属性 nuclearpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNuclearpower(){
        return nuclearpower;
    }
	
    /**
     * 属性 nuclearpower 的set方法
     * @return
     */
    public void setNuclearpower(BigDecimal nuclearpower){
        this.nuclearpower = nuclearpower;
    } 
	
    /**
     * 属性 cocurent 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCocurent(){
        return cocurent;
    }
	
    /**
     * 属性 cocurent 的set方法
     * @return
     */
    public void setCocurent(BigDecimal cocurent){
        this.cocurent = cocurent;
    } 
	
    /**
     * 属性 exchange 的get方法
     * @return BigDecimal
     */
    public BigDecimal getExchange(){
        return exchange;
    }
	
    /**
     * 属性 exchange 的set方法
     * @return
     */
    public void setExchange(BigDecimal exchange){
        this.exchange = exchange;
    } 
	
    /**
     * 属性 theother 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTheother(){
        return theother;
    }
	
    /**
     * 属性 theother 的set方法
     * @return
     */
    public void setTheother(BigDecimal theother){
        this.theother = theother;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwNationwidetradeinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwNationwidetradeinfo other = (DwNationwidetradeinfo) o;	        
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
            .append("total"+":"+getTotal())
            .append("coalpower"+":"+getCoalpower())
            .append("hydroelectric"+":"+getHydroelectric())
            .append("nuclearpower"+":"+getNuclearpower())
            .append("cocurent"+":"+getCocurent())
            .append("exchange"+":"+getExchange())
            .append("theother"+":"+getTheother())
            .append("marketname"+":"+getMarketname())
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