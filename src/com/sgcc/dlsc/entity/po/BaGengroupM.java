package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaGengroupM的POJO类
 *
 * @author  xuhao  [Mon Mar 10 14:50:24 CST 2014]
 * 
 */
public class BaGengroupM implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性gengroupid
     */
    private String gengroupid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * BaGengroupM构造函数
     */
    public BaGengroupM() {
        super();
    }  
	
    /**
     * BaGengroupM完整的构造函数
     */  
    public BaGengroupM(String guid,String gengroupid,String marketid){
        this.guid = guid;
        this.gengroupid = gengroupid;
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
     * 属性 gengroupid 的get方法
     * @return String
     */
    public String getGengroupid(){
        return gengroupid;
    }
	
    /**
     * 属性 gengroupid 的set方法
     * @return
     */
    public void setGengroupid(String gengroupid){
        this.gengroupid = gengroupid;
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
		
        if (o == null || !(o instanceof BaGengroupM))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaGengroupM other = (BaGengroupM) o;	        
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
            .append("gengroupid"+":"+getGengroupid())
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