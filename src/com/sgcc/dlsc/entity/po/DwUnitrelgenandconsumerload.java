package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwUnitrelgenandconsumerload的POJO类
 *
 * @author  tiger  [Tue Mar 11 20:38:58 CST 2014]
 * 
 */
public class DwUnitrelgenandconsumerload implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性busiunitid
     */
    private String busiunitid;
	
    /** 
     * 属性ecounitidorecoloadid
     */
    private String ecounitidorecoloadid;
	
    /**
     * DwUnitrelgenandconsumerload构造函数
     */
    public DwUnitrelgenandconsumerload() {
        super();
    }  
	
    /**
     * DwUnitrelgenandconsumerload完整的构造函数
     */  
    public DwUnitrelgenandconsumerload(String guid){
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
     * 属性 busiunitid 的get方法
     * @return String
     */
    public String getBusiunitid(){
        return busiunitid;
    }
	
    /**
     * 属性 busiunitid 的set方法
     * @return
     */
    public void setBusiunitid(String busiunitid){
        this.busiunitid = busiunitid;
    } 
	
    /**
     * 属性 ecounitidorecoloadid 的get方法
     * @return String
     */
    public String getEcounitidorecoloadid(){
        return ecounitidorecoloadid;
    }
	
    /**
     * 属性 ecounitidorecoloadid 的set方法
     * @return
     */
    public void setEcounitidorecoloadid(String ecounitidorecoloadid){
        this.ecounitidorecoloadid = ecounitidorecoloadid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwUnitrelgenandconsumerload))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwUnitrelgenandconsumerload other = (DwUnitrelgenandconsumerload) o;	        
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
            .append("busiunitid"+":"+getBusiunitid())
            .append("ecounitidorecoloadid"+":"+getEcounitidorecoloadid())
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