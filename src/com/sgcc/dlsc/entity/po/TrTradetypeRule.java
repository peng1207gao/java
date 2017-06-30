package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradetypeRule的POJO类
 *
 * @author  Administrator  [Sat Aug 17 11:39:26 CST 2013]
 * 
 */
public class TrTradetypeRule implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradetypeId
     */
    private String tradetypeId;
	
    /** 
     * 属性ruleType
     */
    private BigDecimal ruleType;
	
    /** 
     * 属性ruleId
     */
    private String ruleId;
	
    /** 
     * 属性createPerson
     */
    private String createPerson;
	
    /** 
     * 属性updateTime
     */
    private Date updateTime;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * TrTradetypeRule构造函数
     */
    public TrTradetypeRule() {
        super();
    }  
	
    /**
     * TrTradetypeRule完整的构造函数
     */  
    public TrTradetypeRule(String guid,String tradetypeId,BigDecimal ruleType,String marketId){
        this.guid = guid;
        this.tradetypeId = tradetypeId;
        this.ruleType = ruleType;
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
     * 属性 tradetypeId 的get方法
     * @return String
     */
    public String getTradetypeId(){
        return tradetypeId;
    }
	
    /**
     * 属性 tradetypeId 的set方法
     * @return
     */
    public void setTradetypeId(String tradetypeId){
        this.tradetypeId = tradetypeId;
    } 
	
    /**
     * 属性 ruleType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRuleType(){
        return ruleType;
    }
	
    /**
     * 属性 ruleType 的set方法
     * @return
     */
    public void setRuleType(BigDecimal ruleType){
        this.ruleType = ruleType;
    } 
	
    /**
     * 属性 ruleId 的get方法
     * @return String
     */
    public String getRuleId(){
        return ruleId;
    }
	
    /**
     * 属性 ruleId 的set方法
     * @return
     */
    public void setRuleId(String ruleId){
        this.ruleId = ruleId;
    } 
	
    /**
     * 属性 createPerson 的get方法
     * @return String
     */
    public String getCreatePerson(){
        return createPerson;
    }
	
    /**
     * 属性 createPerson 的set方法
     * @return
     */
    public void setCreatePerson(String createPerson){
        this.createPerson = createPerson;
    } 
	
    /**
     * 属性 updateTime 的get方法
     * @return Date
     */
    public Date getUpdateTime(){
        return updateTime;
    }
	
    /**
     * 属性 updateTime 的set方法
     * @return
     */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
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
		
        if (o == null || !(o instanceof TrTradetypeRule))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrTradetypeRule other = (TrTradetypeRule) o;	        
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
            .append("tradetypeId"+":"+getTradetypeId())
            .append("ruleType"+":"+getRuleType())
            .append("ruleId"+":"+getRuleId())
            .append("createPerson"+":"+getCreatePerson())
            .append("updateTime"+":"+getUpdateTime())
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