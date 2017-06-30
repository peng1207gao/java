package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxDrrz的POJO类
 *
 * @author  shaowei  [Wed Apr 09 20:25:10 CST 2014]
 * 
 */
public class TjfxDrrz implements Serializable{

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
     * 属性czzt
     */
    private String czzt;
	
    /**
     * TjfxDrrz构造函数
     */
    public TjfxDrrz() {
        super();
    }  
	
    /**
     * TjfxDrrz完整的构造函数
     */  
    public TjfxDrrz(String guid,Timestamp drsj){
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
     * 属性 czzt 的get方法
     * @return String
     */
    public String getCzzt(){
        return czzt;
    }
	
    /**
     * 属性 czzt 的set方法
     * @return
     */
    public void setCzzt(String czzt){
        this.czzt = czzt;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjfxDrrz))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxDrrz other = (TjfxDrrz) o;	        
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
            .append("czzt"+":"+getCzzt())
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