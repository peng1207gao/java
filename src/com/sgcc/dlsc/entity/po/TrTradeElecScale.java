package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeElecScale的POJO类
 *
 * @author  DWJ  [Wed Mar 26 10:28:22 CST 2014]
 * 
 */
public class TrTradeElecScale implements Serializable{

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
    private BigDecimal tradetype;
	
    /** 
     * 属性busiunitid
     */
    private String busiunitid;
	
    /** 
     * 属性reportqty
     */
    private BigDecimal reportqty;
	
    /** 
     * 属性affirmqty
     */
    private BigDecimal affirmqty;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性isrpt
     */
    private BigDecimal isrpt;
	
    /** 
     * 属性repdate
     */
    private Date repdate;
	
    /** 
     * 属性chkdate
     */
    private Date chkdate;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性isaffirm
     */
    private BigDecimal isaffirm;
	
    /**
     * TrTradeElecScale构造函数
     */
    public TrTradeElecScale() {
        super();
    }  
	
    /**
     * TrTradeElecScale完整的构造函数
     */  
    public TrTradeElecScale(String guid,String participantId,BigDecimal tradetype,String busiunitid,BigDecimal theyear,BigDecimal themonth,String marketid){
        this.guid = guid;
        this.participantId = participantId;
        this.tradetype = tradetype;
        this.busiunitid = busiunitid;
        this.theyear = theyear;
        this.themonth = themonth;
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
     * 属性 busiunitid 的get方法
     * @return String
     */
    public String getBusiunitid(){
        return busiunitid;
    }
	
    /**
     * 属性 busiunitid 的set方法
     * @return
     */
    public void setBusiunitid(String busiunitid){
        this.busiunitid = busiunitid;
    } 
	
    /**
     * 属性 reportqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getReportqty(){
        return reportqty;
    }
	
    /**
     * 属性 reportqty 的set方法
     * @return
     */
    public void setReportqty(BigDecimal reportqty){
        this.reportqty = reportqty;
    } 
	
    /**
     * 属性 affirmqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAffirmqty(){
        return affirmqty;
    }
	
    /**
     * 属性 affirmqty 的set方法
     * @return
     */
    public void setAffirmqty(BigDecimal affirmqty){
        this.affirmqty = affirmqty;
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
     * 属性 isrpt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsrpt(){
        return isrpt;
    }
	
    /**
     * 属性 isrpt 的set方法
     * @return
     */
    public void setIsrpt(BigDecimal isrpt){
        this.isrpt = isrpt;
    } 
	
    /**
     * 属性 repdate 的get方法
     * @return Date
     */
    public Date getRepdate(){
        return repdate;
    }
	
    /**
     * 属性 repdate 的set方法
     * @return
     */
    public void setRepdate(Date repdate){
        this.repdate = repdate;
    } 
	
    /**
     * 属性 chkdate 的get方法
     * @return Date
     */
    public Date getChkdate(){
        return chkdate;
    }
	
    /**
     * 属性 chkdate 的set方法
     * @return
     */
    public void setChkdate(Date chkdate){
        this.chkdate = chkdate;
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
     * 属性 isaffirm 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsaffirm(){
        return isaffirm;
    }
	
    /**
     * 属性 isaffirm 的set方法
     * @return
     */
    public void setIsaffirm(BigDecimal isaffirm){
        this.isaffirm = isaffirm;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTradeElecScale))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrTradeElecScale other = (TrTradeElecScale) o;	        
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
            .append("busiunitid"+":"+getBusiunitid())
            .append("reportqty"+":"+getReportqty())
            .append("affirmqty"+":"+getAffirmqty())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("isrpt"+":"+getIsrpt())
            .append("repdate"+":"+getRepdate())
            .append("chkdate"+":"+getChkdate())
            .append("marketid"+":"+getMarketid())
            .append("isaffirm"+":"+getIsaffirm())
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