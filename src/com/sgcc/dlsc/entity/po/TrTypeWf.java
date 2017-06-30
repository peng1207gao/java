package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTypeWf的POJO类
 *
 * @author  Administrator  [Tue Jul 30 15:07:21 CST 2013]
 * 
 */
public class TrTypeWf implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradetypeId
     */
    private String tradetypeId;
	
    /** 
     * 属性wfId
     */
    private String wfId;
	
    /** 
     * 属性wfName
     */
    private String wfName;
	
    /** 
     * 属性updateTime
     */
    private Date updateTime;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * TrTypeWf构造函数
     */
    public TrTypeWf() {
        super();
    }  
	
    /**
     * TrTypeWf完整的构造函数
     */  
    public TrTypeWf(String guid,String tradetypeId,String wfId,Date updateTime,String marketId){
        this.guid = guid;
        this.tradetypeId = tradetypeId;
        this.wfId = wfId;
        this.updateTime = updateTime;
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
     * 属性 wfId 的get方法
     * @return String
     */
    public String getWfId(){
        return wfId;
    }
	
    /**
     * 属性 wfId 的set方法
     * @return
     */
    public void setWfId(String wfId){
        this.wfId = wfId;
    } 
	
    /**
     * 属性 wfName 的get方法
     * @return String
     */
    public String getWfName(){
        return wfName;
    }
	
    /**
     * 属性 wfName 的set方法
     * @return
     */
    public void setWfName(String wfName){
        this.wfName = wfName;
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
		
        if (o == null || !(o instanceof TrTypeWf))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrTypeWf other = (TrTypeWf) o;	        
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
            .append("wfId"+":"+getWfId())
            .append("wfName"+":"+getWfName())
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