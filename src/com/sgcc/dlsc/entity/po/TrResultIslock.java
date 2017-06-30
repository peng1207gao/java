package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrResultIslock的POJO类
 *
 * @author  sss  [Tue Dec 03 18:20:23 CST 2013]
 * 
 */
public class TrResultIslock implements Serializable{

    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性isLock
     */
    private BigDecimal isLock;
	
    /** 
     * 属性lockTime
     */
    private Timestamp lockTime;
	
    /** 
     * 属性lockPerson
     */
    private String lockPerson;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性dataType
     */
    private BigDecimal dataType;
	
    /**
     * TrResultIslock构造函数
     */
    public TrResultIslock() {
        super();
    }  
	
    /**
     * TrResultIslock完整的构造函数
     */  
    public TrResultIslock(BigDecimal tradeseqId,BigDecimal isLock,Timestamp lockTime,String guid){
        this.tradeseqId = tradeseqId;
        this.isLock = isLock;
        this.lockTime = lockTime;
        this.guid = guid;
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
     * 属性 isLock 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsLock(){
        return isLock;
    }
	
    /**
     * 属性 isLock 的set方法
     * @return
     */
    public void setIsLock(BigDecimal isLock){
        this.isLock = isLock;
    } 
	
	
	
    /**
     * 属性 lockTime 的get方法
     * @return Date
     */
    public Timestamp getLockTime(){
        return lockTime;
    }
	
    /**
     * 属性 lockTime 的set方法
     * @return
     */
    public void setLockTime(Timestamp lockTime){
        this.lockTime = lockTime;
    } 
	
	
	
    /**
     * 属性 lockPerson 的get方法
     * @return String
     */
    public String getLockPerson(){
        return lockPerson;
    }
	
    /**
     * 属性 lockPerson 的set方法
     * @return
     */
    public void setLockPerson(String lockPerson){
        this.lockPerson = lockPerson;
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
     * 属性 dataType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDataType(){
        return dataType;
    }
	
    /**
     * 属性 dataType 的set方法
     * @return
     */
    public void setDataType(BigDecimal dataType){
        this.dataType = dataType;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrResultIslock))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrResultIslock other = (TrResultIslock) o;	        
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
            .append("tradeseqId"+":"+getTradeseqId())
            .append("isLock"+":"+getIsLock())
            .append("lockTime"+":"+getLockTime())
            .append("lockPerson"+":"+getLockPerson())
            .append("marketId"+":"+getMarketId())
            .append("guid"+":"+getGuid())
            .append("dataType"+":"+getDataType())
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