package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrResultIspub的POJO类
 *
 * @author  Administrator  [Thu Aug 22 11:29:57 CST 2013]
 * 
 */
public class TrResultIspub implements Serializable{

    /** 
     * 属性isPub
     */
    private BigDecimal isPub;
	
    /** 
     * 属性pubTime
     */
    private Date pubTime;
	
    /** 
     * 属性pubPerson
     */
    private String pubPerson;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性pubRage
     */
    private BigDecimal pubRage;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /**
     * TrResultIspub构造函数
     */
    public TrResultIspub() {
        super();
    }  
	
    /**
     * TrResultIspub完整的构造函数
     */  
    public TrResultIspub(BigDecimal isPub,Date pubTime,String guid,BigDecimal tradeseqId){
        this.isPub = isPub;
        this.pubTime = pubTime;
        this.guid = guid;
        this.tradeseqId = tradeseqId;
    }
 
    /**
     * 属性 isPub 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsPub(){
        return isPub;
    }
	
    /**
     * 属性 isPub 的set方法
     * @return
     */
    public void setIsPub(BigDecimal isPub){
        this.isPub = isPub;
    } 
	
    /**
     * 属性 pubTime 的get方法
     * @return Date
     */
    public Date getPubTime(){
        return pubTime;
    }
	
    /**
     * 属性 pubTime 的set方法
     * @return
     */
    public void setPubTime(Date pubTime){
        this.pubTime = pubTime;
    } 
	
    /**
     * 属性 pubPerson 的get方法
     * @return String
     */
    public String getPubPerson(){
        return pubPerson;
    }
	
    /**
     * 属性 pubPerson 的set方法
     * @return
     */
    public void setPubPerson(String pubPerson){
        this.pubPerson = pubPerson;
    } 
	
    /**
     * 属性 marketId 的get方法
     * @return String
     */
    public String getMarketId(){
        return marketId;
    }
	
    /**
     * 属性 marketId 的set方法
     * @return
     */
    public void setMarketId(String marketId){
        this.marketId = marketId;
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
     * 属性 pubRage 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPubRage(){
        return pubRage;
    }
	
    /**
     * 属性 pubRage 的set方法
     * @return
     */
    public void setPubRage(BigDecimal pubRage){
        this.pubRage = pubRage;
    } 
	
    /**
     * 属性 tradeseqId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradeseqId(){
        return tradeseqId;
    }
	
    /**
     * 属性 tradeseqId 的set方法
     * @return
     */
    public void setTradeseqId(BigDecimal tradeseqId){
        this.tradeseqId = tradeseqId;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrResultIspub))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrResultIspub other = (TrResultIspub) o;	        
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
            .append("isPub"+":"+getIsPub())
            .append("pubTime"+":"+getPubTime())
            .append("pubPerson"+":"+getPubPerson())
            .append("marketId"+":"+getMarketId())
            .append("guid"+":"+getGuid())
            .append("pubRage"+":"+getPubRage())
            .append("tradeseqId"+":"+getTradeseqId())
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