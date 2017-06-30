package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrRegionReason的POJO类
 *
 * @author  sss  [Tue Dec 03 18:15:37 CST 2013]
 * 
 */
public class TrRegionReason implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性reason
     */
    private String reason;
	
    /** 
     * 属性userId
     */
    private String userId;
	
    /** 
     * 属性updateTime
     */
    private Timestamp updateTime;
	
    /**
     * TrRegionReason构造函数
     */
    public TrRegionReason() {
        super();
    }  
	
    /**
     * TrRegionReason完整的构造函数
     */  
    public TrRegionReason(String guid){
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
     * 属性 reason 的get方法
     * @return String
     */
    public String getReason(){
        return reason;
    }
	
    /**
     * 属性 reason 的set方法
     * @return
     */
    public void setReason(String reason){
        this.reason = reason;
    } 
	
	
	
    /**
     * 属性 userId 的get方法
     * @return String
     */
    public String getUserId(){
        return userId;
    }
	
    /**
     * 属性 userId 的set方法
     * @return
     */
    public void setUserId(String userId){
        this.userId = userId;
    } 
	
	
	
    /**
     * 属性 updateTime 的get方法
     * @return Date
     */
    public Timestamp getUpdateTime(){
        return updateTime;
    }
	
    /**
     * 属性 updateTime 的set方法
     * @return
     */
    public void setUpdateTime(Timestamp updateTime){
        this.updateTime = updateTime;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrRegionReason))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrRegionReason other = (TrRegionReason) o;	        
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
            .append("tradeseqId"+":"+getTradeseqId())
            .append("marketId"+":"+getMarketId())
            .append("reason"+":"+getReason())
            .append("userId"+":"+getUserId())
            .append("updateTime"+":"+getUpdateTime())
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