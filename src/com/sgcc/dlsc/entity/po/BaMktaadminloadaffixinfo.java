package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaMktaadminloadaffixinfo的POJO类
 *
 * @author  liyuan  [Mon Mar 31 10:56:44 CST 2014]
 * 
 */
public class BaMktaadminloadaffixinfo implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性loadid
     */
    private String loadid;
	
    /** 
     * 属性affixno
     */
    private BigDecimal affixno;
	
    /** 
     * 属性affixname
     */
    private String affixname;
	
    /** 
     * 属性papercontractfile
     */
    private byte[] papercontractfile;
	
    /** 
     * 属性uploadperson
     */
    private String uploadperson;
	
    /** 
     * 属性uploadtime
     */
    private Date uploadtime;
	
    /** 
     * 属性description
     */
    private String description;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性affixtype
     */
    private BigDecimal affixtype;
	
    /**
     * BaMktaadminloadaffixinfo构造函数
     */
    public BaMktaadminloadaffixinfo() {
        super();
    }  
	
    /**
     * BaMktaadminloadaffixinfo完整的构造函数
     */  
    public BaMktaadminloadaffixinfo(String marketid,String loadid,BigDecimal affixno,String guid){
        this.marketid = marketid;
        this.loadid = loadid;
        this.affixno = affixno;
        this.guid = guid;
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
     * 属性 loadid 的get方法
     * @return String
     */
    public String getLoadid(){
        return loadid;
    }
	
    /**
     * 属性 loadid 的set方法
     * @return
     */
    public void setLoadid(String loadid){
        this.loadid = loadid;
    } 
	
    /**
     * 属性 affixno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAffixno(){
        return affixno;
    }
	
    /**
     * 属性 affixno 的set方法
     * @return
     */
    public void setAffixno(BigDecimal affixno){
        this.affixno = affixno;
    } 
	
    /**
     * 属性 affixname 的get方法
     * @return String
     */
    public String getAffixname(){
        return affixname;
    }
	
    /**
     * 属性 affixname 的set方法
     * @return
     */
    public void setAffixname(String affixname){
        this.affixname = affixname;
    } 
	
    /**
     * 属性 papercontractfile 的get方法
     * @return byte[]
     */
    public byte[] getPapercontractfile(){
        return papercontractfile;
    }
	
    /**
     * 属性 papercontractfile 的set方法
     * @return
     */
    public void setPapercontractfile(byte[] papercontractfile){
        this.papercontractfile = papercontractfile;
    } 
	
    /**
     * 属性 uploadperson 的get方法
     * @return String
     */
    public String getUploadperson(){
        return uploadperson;
    }
	
    /**
     * 属性 uploadperson 的set方法
     * @return
     */
    public void setUploadperson(String uploadperson){
        this.uploadperson = uploadperson;
    } 
	
    /**
     * 属性 uploadtime 的get方法
     * @return Date
     */
    public Date getUploadtime(){
        return uploadtime;
    }
	
    /**
     * 属性 uploadtime 的set方法
     * @return
     */
    public void setUploadtime(Date uploadtime){
        this.uploadtime = uploadtime;
    } 
	
    /**
     * 属性 description 的get方法
     * @return String
     */
    public String getDescription(){
        return description;
    }
	
    /**
     * 属性 description 的set方法
     * @return
     */
    public void setDescription(String description){
        this.description = description;
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
     * 属性 affixtype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAffixtype(){
        return affixtype;
    }
	
    /**
     * 属性 affixtype 的set方法
     * @return
     */
    public void setAffixtype(BigDecimal affixtype){
        this.affixtype = affixtype;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaMktaadminloadaffixinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaMktaadminloadaffixinfo other = (BaMktaadminloadaffixinfo) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("loadid"+":"+getLoadid())
            .append("affixno"+":"+getAffixno())
            .append("affixname"+":"+getAffixname())
            .append("papercontractfile"+":"+getPapercontractfile())
            .append("uploadperson"+":"+getUploadperson())
            .append("uploadtime"+":"+getUploadtime())
            .append("description"+":"+getDescription())
            .append("guid"+":"+getGuid())
            .append("affixtype"+":"+getAffixtype())
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