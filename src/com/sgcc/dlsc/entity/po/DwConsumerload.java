package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwConsumerload的POJO类
 *
 * @author  tiger  [Tue Mar 11 20:31:15 CST 2014]
 * 
 */
public class DwConsumerload implements Serializable{

    /** 
     * 属性consumerloadid
     */
    private String consumerloadid;
	
    /** 
     * 属性consumerloadname
     */
    private String consumerloadname;
	
    /** 
     * 属性consumerid
     */
    private String consumerid;
	
    /** 
     * 属性maxLoad
     */
    private BigDecimal maxLoad;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /**
     * DwConsumerload构造函数
     */
    public DwConsumerload() {
        super();
    }  
	
    /**
     * DwConsumerload完整的构造函数
     */  
    public DwConsumerload(String consumerloadid,String guid){
        this.consumerloadid = consumerloadid;
        this.guid = guid;
    }
 
    /**
     * 属性 consumerloadid 的get方法
     * @return String
     */
    public String getConsumerloadid(){
        return consumerloadid;
    }
	
    /**
     * 属性 consumerloadid 的set方法
     * @return
     */
    public void setConsumerloadid(String consumerloadid){
        this.consumerloadid = consumerloadid;
    } 
	
    /**
     * 属性 consumerloadname 的get方法
     * @return String
     */
    public String getConsumerloadname(){
        return consumerloadname;
    }
	
    /**
     * 属性 consumerloadname 的set方法
     * @return
     */
    public void setConsumerloadname(String consumerloadname){
        this.consumerloadname = consumerloadname;
    } 
	
    /**
     * 属性 consumerid 的get方法
     * @return String
     */
    public String getConsumerid(){
        return consumerid;
    }
	
    /**
     * 属性 consumerid 的set方法
     * @return
     */
    public void setConsumerid(String consumerid){
        this.consumerid = consumerid;
    } 
	
    /**
     * 属性 maxLoad 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxLoad(){
        return maxLoad;
    }
	
    /**
     * 属性 maxLoad 的set方法
     * @return
     */
    public void setMaxLoad(BigDecimal maxLoad){
        this.maxLoad = maxLoad;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwConsumerload))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwConsumerload other = (DwConsumerload) o;	        
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
            .append("consumerloadid"+":"+getConsumerloadid())
            .append("consumerloadname"+":"+getConsumerloadname())
            .append("consumerid"+":"+getConsumerid())
            .append("maxLoad"+":"+getMaxLoad())
            .append("marketid"+":"+getMarketid())
            .append("guid"+":"+getGuid())
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