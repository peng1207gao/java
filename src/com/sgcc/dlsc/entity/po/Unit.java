package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * Unit的POJO类
 *
 * @author  lenovo  [Thu Sep 26 10:20:29 CST 2013]
 * 
 */
public class Unit implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性unitid
     */
    private String unitid;
	
    /** 
     * 属性unitname
     */
    private String unitname;
	
    /** 
     * 属性parentid
     */
    private String parentid;
	
    /**
     * Unit构造函数
     */
    public Unit() {
        super();
    }  
	
    /**
     * Unit完整的构造函数
     */  
    public Unit(String guid,String unitid){
        this.guid = guid;
        this.unitid = unitid;
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
        this.guid = guid;
    } 
	
    /**
     * 属性 unitid 的get方法
     * @return String
     */
    public String getUnitid(){
        return unitid;
    }
	
    /**
     * 属性 unitid 的set方法
     * @return
     */
    public void setUnitid(String unitid){
        if(unitid != null && unitid.trim().length() == 0){
            this.unitid = null;
        }else{
            this.unitid = unitid;
        }
    } 
	
    /**
     * 属性 unitname 的get方法
     * @return String
     */
    public String getUnitname(){
        return unitname;
    }
	
    /**
     * 属性 unitname 的set方法
     * @return
     */
    public void setUnitname(String unitname){
        this.unitname = unitname;
    } 
	
    /**
     * 属性 parentid 的get方法
     * @return String
     */
    public String getParentid(){
        return parentid;
    }
	
    /**
     * 属性 parentid 的set方法
     * @return
     */
    public void setParentid(String parentid){
        this.parentid = parentid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof Unit))
	        return false; 
			
        if(getUnitid() == null) 
	        return false;

        Unit other = (Unit) o;	        
	    return new EqualsBuilder()
            .append(this.getUnitid(), other.getUnitid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("guid"+":"+getGuid())
            .append("unitid"+":"+getUnitid())
            .append("unitname"+":"+getUnitname())
            .append("parentid"+":"+getParentid())
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