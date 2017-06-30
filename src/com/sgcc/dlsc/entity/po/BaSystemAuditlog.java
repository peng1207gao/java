package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;

import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaSystemAuditlog的POJO类
 *
 * @author  chenyue  [Tue Jul 15 15:52:47 CST 2014]
 * 
 */
public class BaSystemAuditlog implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性modulename
     */
    private String modulename;
	
    /** 
     * 属性funcname
     */
    private String funcname;
	
    /** 
     * 属性opratype
     */
    private String opratype;
	
    /** 
     * 属性opraperson
     */
    private String opraperson;
	
    /** 
     * 属性opradate
     */
    private Date opradate;
	
    /** 
     * 属性opratime
     */
    private String opratime;
	
    /** 
     * 属性remark
     */
    private String remark;
	
    /**
     * BaSystemAuditlog构造函数
     */
    public BaSystemAuditlog() {
        super();
    }  
	
    /**
     * BaSystemAuditlog完整的构造函数
     */  
    public BaSystemAuditlog(String guid){
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
     * 属性 modulename 的get方法
     * @return String
     */
    public String getModulename(){
        return modulename;
    }
	
    /**
     * 属性 modulename 的set方法
     * @return
     */
    public void setModulename(String modulename){
        this.modulename = modulename;
    } 
	
    /**
     * 属性 funcname 的get方法
     * @return String
     */
    public String getFuncname(){
        return funcname;
    }
	
    /**
     * 属性 funcname 的set方法
     * @return
     */
    public void setFuncname(String funcname){
        this.funcname = funcname;
    } 
	
    /**
     * 属性 opratype 的get方法
     * @return String
     */
    public String getOpratype(){
        return opratype;
    }
	
    /**
     * 属性 opratype 的set方法
     * @return
     */
    public void setOpratype(String opratype){
        this.opratype = opratype;
    } 
	
    /**
     * 属性 opraperson 的get方法
     * @return String
     */
    public String getOpraperson(){
        return opraperson;
    }
	
    /**
     * 属性 opraperson 的set方法
     * @return
     */
    public void setOpraperson(String opraperson){
        this.opraperson = opraperson;
    } 
	
    /**
     * 属性 opradate 的get方法
     * @return Date
     */
    public Date getOpradate(){
        return opradate;
    }
	
    /**
     * 属性 opradate 的set方法
     * @return
     */
    public void setOpradate(Date opradate){
        this.opradate = opradate;
    } 
	
    /**
     * 属性 opratime 的get方法
     * @return String
     */
    public String getOpratime(){
        return opratime;
    }
	
    /**
     * 属性 opratime 的set方法
     * @return
     */
    public void setOpratime(String opratime){
        this.opratime = opratime;
    } 
	
    /**
     * 属性 remark 的get方法
     * @return String
     */
    public String getRemark(){
        return remark;
    }
	
    /**
     * 属性 remark 的set方法
     * @return
     */
    public void setRemark(String remark){
        this.remark = remark;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaSystemAuditlog))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaSystemAuditlog other = (BaSystemAuditlog) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("modulename"+":"+getModulename())
            .append("funcname"+":"+getFuncname())
            .append("opratype"+":"+getOpratype())
            .append("opraperson"+":"+getOpraperson())
            .append("opradate"+":"+getOpradate())
            .append("opratime"+":"+getOpratime())
            .append("remark"+":"+getRemark())
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