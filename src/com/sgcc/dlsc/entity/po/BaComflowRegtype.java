package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaComflowRegtype的POJO类
 *
 * @author  longshine  [Thu Jun 26 15:55:53 CST 2014]
 * 
 */
public class BaComflowRegtype implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性regtype
     */
    private String regtype;
	
    /** 
     * 属性flowid
     */
    private String flowid;
	
    /**
     * BaComflowRegtype构造函数
     */
    public BaComflowRegtype() {
        super();
    }  
	
    /**
     * BaComflowRegtype完整的构造函数
     */  
    public BaComflowRegtype(String guid,String regtype,String flowid){
        this.guid = guid;
        this.regtype = regtype;
        this.flowid = flowid;
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
     * 属性 regtype 的get方法
     * @return String
     */
    public String getRegtype(){
        return regtype;
    }
	
    /**
     * 属性 regtype 的set方法
     * @return
     */
    public void setRegtype(String regtype){
        this.regtype = regtype;
    } 
	
    /**
     * 属性 flowid 的get方法
     * @return String
     */
    public String getFlowid(){
        return flowid;
    }
	
    /**
     * 属性 flowid 的set方法
     * @return
     */
    public void setFlowid(String flowid){
        this.flowid = flowid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaComflowRegtype))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaComflowRegtype other = (BaComflowRegtype) o;	        
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
            .append("regtype"+":"+getRegtype())
            .append("flowid"+":"+getFlowid())
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