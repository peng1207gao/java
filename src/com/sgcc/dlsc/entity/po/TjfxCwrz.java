package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxCwrz的POJO类
 *
 * @author  shaowei  [Wed Apr 09 20:26:41 CST 2014]
 * 
 */
public class TjfxCwrz implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性drsj
     */
    private Timestamp drsj;
	
    /** 
     * 属性zbmc
     */
    private String zbmc;
	
    /** 
     * 属性czr
     */
    private String czr;
	
    /** 
     * 属性sql
     */
    private String sql;
	
    /** 
     * 属性cwxx
     */
    private String cwxx;
	
    /**
     * TjfxCwrz构造函数
     */
    public TjfxCwrz() {
        super();
    }  
	
    /**
     * TjfxCwrz完整的构造函数
     */  
    public TjfxCwrz(String guid,Timestamp drsj){
        this.guid = guid;
        this.drsj = drsj;
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
     * 属性 drsj 的get方法
     * @return Date
     */
    public Timestamp getDrsj(){
        return drsj;
    }
	
    /**
     * 属性 drsj 的set方法
     * @return
     */
    public void setDrsj(Timestamp drsj){
        this.drsj = drsj;
    } 
	
    /**
     * 属性 zbmc 的get方法
     * @return String
     */
    public String getZbmc(){
        return zbmc;
    }
	
    /**
     * 属性 zbmc 的set方法
     * @return
     */
    public void setZbmc(String zbmc){
        this.zbmc = zbmc;
    } 
	
    /**
     * 属性 czr 的get方法
     * @return String
     */
    public String getCzr(){
        return czr;
    }
	
    /**
     * 属性 czr 的set方法
     * @return
     */
    public void setCzr(String czr){
        this.czr = czr;
    } 
	
    /**
     * 属性 sql 的get方法
     * @return String
     */
    public String getSql(){
        return sql;
    }
	
    /**
     * 属性 sql 的set方法
     * @return
     */
    public void setSql(String sql){
        this.sql = sql;
    } 
	
    /**
     * 属性 cwxx 的get方法
     * @return String
     */
    public String getCwxx(){
        return cwxx;
    }
	
    /**
     * 属性 cwxx 的set方法
     * @return
     */
    public void setCwxx(String cwxx){
        this.cwxx = cwxx;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjfxCwrz))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxCwrz other = (TjfxCwrz) o;	        
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
            .append("drsj"+":"+getDrsj())
            .append("zbmc"+":"+getZbmc())
            .append("czr"+":"+getCzr())
            .append("sql"+":"+getSql())
            .append("cwxx"+":"+getCwxx())
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