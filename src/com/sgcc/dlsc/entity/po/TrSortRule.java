package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;

import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrSortRule的POJO类
 *
 * @author  Administrator  [Mon Aug 19 17:06:09 CST 2013]
 * 
 */
public class TrSortRule implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性sortRuleId
     */
    private String sortRuleId;
	
    /** 
     * 属性factorId
     */
    private String factorId;
	
    /** 
     * 属性updateTime
     */
    private Date updateTime;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * TrSortRule构造函数
     */
    public TrSortRule() {
        super();
    }  
	
    /**
     * TrSortRule完整的构造函数
     */  
    public TrSortRule(String guid,String factorId,String marketId){
        this.guid = guid;
        this.factorId = factorId;
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
     * 属性 sortRuleId 的get方法
     * @return String
     */
    public String getSortRuleId(){
        return sortRuleId;
    }
	
    /**
     * 属性 sortRuleId 的set方法
     * @return
     */
    public void setSortRuleId(String sortRuleId){
        this.sortRuleId = sortRuleId;
    } 
	
    /**
     * 属性 factorId 的get方法
     * @return String
     */
    public String getFactorId(){
        return factorId;
    }
	
    /**
     * 属性 factorId 的set方法
     * @return
     */
    public void setFactorId(String factorId){
        this.factorId = factorId;
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
		
        if (o == null || !(o instanceof TrSortRule))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrSortRule other = (TrSortRule) o;	        
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
            .append("sortRuleId"+":"+getSortRuleId())
            .append("factorId"+":"+getFactorId())
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