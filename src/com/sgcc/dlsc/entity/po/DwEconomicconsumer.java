package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwEconomicconsumer的POJO类
 *
 * @author  xiabaike  [Tue Mar 11 19:57:17 CST 2014]
 * 
 */
public class DwEconomicconsumer implements Serializable{

    /** 
     * 属性economicconsumerid
     */
    private String economicconsumerid;
	
    /** 
     * 属性economicconsumername
     */
    private String economicconsumername;
	
    /** 
     * 属性consumerloadid
     */
    private String consumerloadid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * DwEconomicconsumer构造函数
     */
    public DwEconomicconsumer() {
        super();
    }  
	
    /**
     * DwEconomicconsumer完整的构造函数
     */  
    public DwEconomicconsumer(String economicconsumerid){
        this.economicconsumerid = economicconsumerid;
    }
 
    /**
     * 属性 economicconsumerid 的get方法
     * @return String
     */
    public String getEconomicconsumerid(){
        return economicconsumerid;
    }
	
    /**
     * 属性 economicconsumerid 的set方法
     * @return
     */
    public void setEconomicconsumerid(String economicconsumerid){
        if(economicconsumerid != null && economicconsumerid.trim().length() == 0){
            this.economicconsumerid = null;
        }else{
            this.economicconsumerid = economicconsumerid;
        }
    } 
	
    /**
     * 属性 economicconsumername 的get方法
     * @return String
     */
    public String getEconomicconsumername(){
        return economicconsumername;
    }
	
    /**
     * 属性 economicconsumername 的set方法
     * @return
     */
    public void setEconomicconsumername(String economicconsumername){
        this.economicconsumername = economicconsumername;
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
		
        if (o == null || !(o instanceof DwEconomicconsumer))
	        return false; 
			
        if(getEconomicconsumerid() == null) 
	        return false;

        DwEconomicconsumer other = (DwEconomicconsumer) o;	        
	    return new EqualsBuilder()
            .append(this.getEconomicconsumerid(), other.getEconomicconsumerid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("economicconsumerid"+":"+getEconomicconsumerid())
            .append("economicconsumername"+":"+getEconomicconsumername())
            .append("consumerloadid"+":"+getConsumerloadid())
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