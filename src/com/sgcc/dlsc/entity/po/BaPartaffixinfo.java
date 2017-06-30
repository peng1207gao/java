package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaPartaffixinfo的POJO类
 *
 * @author  Administrator  [Thu Jan 23 10:08:24 CST 2014]
 * 
 */
public class BaPartaffixinfo implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
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
     * BaPartaffixinfo构造函数
     */
    public BaPartaffixinfo() {
        super();
    }  
	
    /**
     * BaPartaffixinfo完整的构造函数
     */  
    public BaPartaffixinfo(String marketid,String participantid,BigDecimal affixno,String guid){
        this.marketid = marketid;
        this.participantid = participantid;
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
     * 属性 participantid 的get方法
     * @return String
     */
    public String getParticipantid(){
        return participantid;
    }
	
    /**
     * 属性 participantid 的set方法
     * @return
     */
    public void setParticipantid(String participantid){
        this.participantid = participantid;
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
		
        if (o == null || !(o instanceof BaPartaffixinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaPartaffixinfo other = (BaPartaffixinfo) o;	        
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
            .append("participantid"+":"+getParticipantid())
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