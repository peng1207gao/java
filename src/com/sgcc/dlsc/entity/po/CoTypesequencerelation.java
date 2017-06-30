package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoTypesequencerelation的POJO类
 *
 * @author  djdeng  [Tue Feb 18 09:22:07 CST 2014]
 * 
 */
public class CoTypesequencerelation implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性contracttypeid
     */
    private String contracttypeid;
	
    /** 
     * 属性sequenceid
     */
    private String sequenceid;
	
    /**
     * CoTypesequencerelation构造函数
     */
    public CoTypesequencerelation() {
        super();
    }  
	
    /**
     * CoTypesequencerelation完整的构造函数
     */  
    public CoTypesequencerelation(String guid){
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
     * 属性 contracttypeid 的get方法
     * @return String
     */
    public String getContracttypeid(){
        return contracttypeid;
    }
	
    /**
     * 属性 contracttypeid 的set方法
     * @return
     */
    public void setContracttypeid(String contracttypeid){
        this.contracttypeid = contracttypeid;
    } 
	
    /**
     * 属性 sequenceid 的get方法
     * @return String
     */
    public String getSequenceid(){
        return sequenceid;
    }
	
    /**
     * 属性 sequenceid 的set方法
     * @return
     */
    public void setSequenceid(String sequenceid){
        this.sequenceid = sequenceid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoTypesequencerelation))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        CoTypesequencerelation other = (CoTypesequencerelation) o;	        
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
            .append("contracttypeid"+":"+getContracttypeid())
            .append("sequenceid"+":"+getSequenceid())
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