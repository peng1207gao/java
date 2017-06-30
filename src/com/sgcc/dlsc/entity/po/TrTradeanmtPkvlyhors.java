package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeanmtPkvlyhors的POJO类
 *
 * @author  DWJ  [Fri Jun 20 18:18:39 CST 2014]
 * 
 */
public class TrTradeanmtPkvlyhors implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性tradeanmtId
     */
    private String tradeanmtId;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性pkVal
     */
    private BigDecimal pkVal;
	
    /** 
     * 属性startTime
     */
    private Timestamp startTime;
	
    /** 
     * 属性endTime
     */
    private Timestamp endTime;
	
    /** 
     * 属性pkvaltime
     */
    private BigDecimal pkvaltime;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * TrTradeanmtPkvlyhors构造函数
     */
    public TrTradeanmtPkvlyhors() {
        super();
    }  
	
    /**
     * TrTradeanmtPkvlyhors完整的构造函数
     */  
    public TrTradeanmtPkvlyhors(String id,String tradeanmtId,BigDecimal tradeseqId,String marketId){
        this.id = id;
        this.tradeanmtId = tradeanmtId;
        this.tradeseqId = tradeseqId;
        this.marketId = marketId;
    }
 
    /**
     * 属性 id 的get方法
     * @return String
     */
    public String getId(){
        return id;
    }
	
    /**
     * 属性 id 的set方法
     * @return
     */
    public void setId(String id){
        if(id != null && id.trim().length() == 0){
            this.id = null;
        }else{
            this.id = id;
        }
    } 
	
    /**
     * 属性 tradeanmtId 的get方法
     * @return String
     */
    public String getTradeanmtId(){
        return tradeanmtId;
    }
	
    /**
     * 属性 tradeanmtId 的set方法
     * @return
     */
    public void setTradeanmtId(String tradeanmtId){
        this.tradeanmtId = tradeanmtId;
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
     * 属性 pkVal 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPkVal(){
        return pkVal;
    }
	
    /**
     * 属性 pkVal 的set方法
     * @return
     */
    public void setPkVal(BigDecimal pkVal){
        this.pkVal = pkVal;
    } 
	
    /**
     * 属性 startTime 的get方法
     * @return Date
     */
    public Timestamp getStartTime(){
        return startTime;
    }
	
    /**
     * 属性 startTime 的set方法
     * @return
     */
    public void setStartTime(Timestamp startTime){
        this.startTime = startTime;
    } 
	
    /**
     * 属性 endTime 的get方法
     * @return Date
     */
    public Timestamp getEndTime(){
        return endTime;
    }
	
    /**
     * 属性 endTime 的set方法
     * @return
     */
    public void setEndTime(Timestamp endTime){
        this.endTime = endTime;
    } 
	
    /**
     * 属性 pkvaltime 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPkvaltime(){
        return pkvaltime;
    }
	
    /**
     * 属性 pkvaltime 的set方法
     * @return
     */
    public void setPkvaltime(BigDecimal pkvaltime){
        this.pkvaltime = pkvaltime;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTradeanmtPkvlyhors))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrTradeanmtPkvlyhors other = (TrTradeanmtPkvlyhors) o;	        
	    return new EqualsBuilder()
            .append(this.getId(), other.getId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("id"+":"+getId())
            .append("tradeanmtId"+":"+getTradeanmtId())
            .append("tradeseqId"+":"+getTradeseqId())
            .append("pkVal"+":"+getPkVal())
            .append("startTime"+":"+getStartTime())
            .append("endTime"+":"+getEndTime())
            .append("pkvaltime"+":"+getPkvaltime())
            .append("marketId"+":"+getMarketId())
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