package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrSeqUnion的POJO类
 *
 * @author  sss  [Tue Nov 12 11:06:01 CST 2013]
 * 
 */
public class TrSeqUnion implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradesequnionId
     */
    private BigDecimal tradesequnionId;
	
    /** 
     * 属性tradesequnionName
     */
    private String tradesequnionName;
	
    /** 
     * 属性createTime
     */
    private Date createTime;
	
    /** 
     * 属性createUser
     */
    private String createUser;
	
    /** 
     * 属性defaultI1
     */
    private BigDecimal defaultI1;
	
    /** 
     * 属性defaultI2
     */
    private BigDecimal defaultI2;
	
    /** 
     * 属性defaultF1
     */
    private BigDecimal defaultF1;
	
    /** 
     * 属性defaultF2
     */
    private BigDecimal defaultF2;
	
    /** 
     * 属性defaultUc1
     */
    private String defaultUc1;
	
    /** 
     * 属性defaultUc2
     */
    private String defaultUc2;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * TrSeqUnion构造函数
     */
    public TrSeqUnion() {
        super();
    }  
	
    /**
     * TrSeqUnion完整的构造函数
     */  
    public TrSeqUnion(String guid,BigDecimal tradesequnionId,String tradesequnionName,Date createTime){
        this.guid = guid;
        this.tradesequnionId = tradesequnionId;
        this.tradesequnionName = tradesequnionName;
        this.createTime = createTime;
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
     * 属性 tradesequnionId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradesequnionId(){
        return tradesequnionId;
    }
	
    /**
     * 属性 tradesequnionId 的set方法
     * @return
     */
    public void setTradesequnionId(BigDecimal tradesequnionId){
        this.tradesequnionId = tradesequnionId;
    } 
	
	
	
    /**
     * 属性 tradesequnionName 的get方法
     * @return String
     */
    public String getTradesequnionName(){
        return tradesequnionName;
    }
	
    /**
     * 属性 tradesequnionName 的set方法
     * @return
     */
    public void setTradesequnionName(String tradesequnionName){
        this.tradesequnionName = tradesequnionName;
    } 
	
	
	
    /**
     * 属性 createTime 的get方法
     * @return Date
     */
    public Date getCreateTime(){
        return createTime;
    }
	
    /**
     * 属性 createTime 的set方法
     * @return
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    } 
	
	
	
    /**
     * 属性 createUser 的get方法
     * @return String
     */
    public String getCreateUser(){
        return createUser;
    }
	
    /**
     * 属性 createUser 的set方法
     * @return
     */
    public void setCreateUser(String createUser){
        this.createUser = createUser;
    } 
	
	
	
    /**
     * 属性 defaultI1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDefaultI1(){
        return defaultI1;
    }
	
    /**
     * 属性 defaultI1 的set方法
     * @return
     */
    public void setDefaultI1(BigDecimal defaultI1){
        this.defaultI1 = defaultI1;
    } 
	
	
	
    /**
     * 属性 defaultI2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDefaultI2(){
        return defaultI2;
    }
	
    /**
     * 属性 defaultI2 的set方法
     * @return
     */
    public void setDefaultI2(BigDecimal defaultI2){
        this.defaultI2 = defaultI2;
    } 
	
	
	
    /**
     * 属性 defaultF1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDefaultF1(){
        return defaultF1;
    }
	
    /**
     * 属性 defaultF1 的set方法
     * @return
     */
    public void setDefaultF1(BigDecimal defaultF1){
        this.defaultF1 = defaultF1;
    } 
	
	
	
    /**
     * 属性 defaultF2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDefaultF2(){
        return defaultF2;
    }
	
    /**
     * 属性 defaultF2 的set方法
     * @return
     */
    public void setDefaultF2(BigDecimal defaultF2){
        this.defaultF2 = defaultF2;
    } 
	
	
	
    /**
     * 属性 defaultUc1 的get方法
     * @return String
     */
    public String getDefaultUc1(){
        return defaultUc1;
    }
	
    /**
     * 属性 defaultUc1 的set方法
     * @return
     */
    public void setDefaultUc1(String defaultUc1){
        this.defaultUc1 = defaultUc1;
    } 
	
	
	
    /**
     * 属性 defaultUc2 的get方法
     * @return String
     */
    public String getDefaultUc2(){
        return defaultUc2;
    }
	
    /**
     * 属性 defaultUc2 的set方法
     * @return
     */
    public void setDefaultUc2(String defaultUc2){
        this.defaultUc2 = defaultUc2;
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
		
        if (o == null || !(o instanceof TrSeqUnion))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrSeqUnion other = (TrSeqUnion) o;	        
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
            .append("tradesequnionId"+":"+getTradesequnionId())
            .append("tradesequnionName"+":"+getTradesequnionName())
            .append("createTime"+":"+getCreateTime())
            .append("createUser"+":"+getCreateUser())
            .append("defaultI1"+":"+getDefaultI1())
            .append("defaultI2"+":"+getDefaultI2())
            .append("defaultF1"+":"+getDefaultF1())
            .append("defaultF2"+":"+getDefaultF2())
            .append("defaultUc1"+":"+getDefaultUc1())
            .append("defaultUc2"+":"+getDefaultUc2())
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