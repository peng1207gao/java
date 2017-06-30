package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjYearUseHour的POJO类
 *
 * @author  DWJ  [Wed Mar 26 10:32:04 CST 2014]
 * 
 */
public class TjYearUseHour implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性participantId
     */
    private String participantId;
	
    /** 
     * 属性tradetype
     */
    private BigDecimal tradetype = BigDecimal.valueOf(1);
	
    /** 
     * 属性usehour
     */
    private BigDecimal usehour;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性tabdate
     */
    private Date tabdate;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * TjYearUseHour构造函数
     */
    public TjYearUseHour() {
        super();
    }  
	
    /**
     * TjYearUseHour完整的构造函数
     */  
    public TjYearUseHour(String guid,String participantId,BigDecimal theyear,String marketid){
        this.guid = guid;
        this.participantId = participantId;
        this.theyear = theyear;
        this.marketid = marketid;
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
     * 属性 participantId 的get方法
     * @return String
     */
    public String getParticipantId(){
        return participantId;
    }
	
    /**
     * 属性 participantId 的set方法
     * @return
     */
    public void setParticipantId(String participantId){
        this.participantId = participantId;
    } 
	
    /**
     * 属性 tradetype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradetype(){
        return tradetype;
    }
	
    /**
     * 属性 tradetype 的set方法
     * @return
     */
    public void setTradetype(BigDecimal tradetype){
        this.tradetype = tradetype;
    } 
	
    /**
     * 属性 usehour 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUsehour(){
        return usehour;
    }
	
    /**
     * 属性 usehour 的set方法
     * @return
     */
    public void setUsehour(BigDecimal usehour){
        this.usehour = usehour;
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
     * 属性 tabdate 的get方法
     * @return Date
     */
    public Date getTabdate(){
        return tabdate;
    }
	
    /**
     * 属性 tabdate 的set方法
     * @return
     */
    public void setTabdate(Date tabdate){
        this.tabdate = tabdate;
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
		
        if (o == null || !(o instanceof TjYearUseHour))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjYearUseHour other = (TjYearUseHour) o;	        
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
            .append("participantId"+":"+getParticipantId())
            .append("tradetype"+":"+getTradetype())
            .append("usehour"+":"+getUsehour())
            .append("theyear"+":"+getTheyear())
            .append("tabdate"+":"+getTabdate())
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