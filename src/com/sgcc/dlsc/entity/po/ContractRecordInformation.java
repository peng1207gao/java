package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxMaplineid的POJO类
 *
 * @author  Jingbo.Fu  [Wed Feb 12 11:29:21 CST 2014]
 * 
 */
public class ContractRecordInformation implements Serializable{

	
	private String contracrid;
	
	private String guidd;
	
	private String status;
	
	private String backuporg;
	
	private String ctype;
	
	private String backupperson;
	
	private String backupdate;
	
	private String description;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	private String contractnum;
	
	private BigDecimal backuptype; 
	
	private BigDecimal backupstatus;
	
	
    public BigDecimal getBackuptype() {
		return backuptype;
	}

	public void setBackuptype(BigDecimal backuptype) {
		this.backuptype = backuptype;
	}

	public BigDecimal getBackupstatus() {
		return backupstatus;
	}

	public void setBackupstatus(BigDecimal backupstatus) {
		this.backupstatus = backupstatus;
	}

	public String getContracrid() {
		return contracrid;
	}

	public void setContracrid(String contracrid) {
		this.contracrid = contracrid;
	}

	public String getGuidd() {
		return guidd;
	}

	public void setGuidd(String guidd) {
		this.guidd = guidd;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBackuporg() {
		return backuporg;
	}

	public void setBackuporg(String backuporg) {
		this.backuporg = backuporg;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public String getBackupperson() {
		return backupperson;
	}

	public void setBackupperson(String backupperson) {
		this.backupperson = backupperson;
	}

	public String getBackupdate() {
		return backupdate;
	}

	public void setBackupdate(String backupdate) {
		this.backupdate = backupdate;
	}

	public String getContractnum() {
		return contractnum;
	}

	public void setContractnum(String contractnum) {
		this.contractnum = contractnum;
	}


	/** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性maplineid
     */
    private String maplineid;
	
    /** 
     * 属性maplinename
     */
    private String maplinename;
	
    /** 
     * 属性linkid
     */
    private String linkid;
	
    /** 
     * 属性tradetype
     */
    private String tradetype;
	
    /**
     * TjfxMaplineid构造函数
     */
    public ContractRecordInformation() {
        super();
    }  
	
    /**
     * TjfxMaplineid完整的构造函数
     */  
    public ContractRecordInformation(String guid,String maplineid,String maplinename,String linkid,String tradetype,String contracrid,
    		String guidd,String status,String backuporg,String ctype,String backupperson,String backupdate,String contractnum,
    		BigDecimal backuptype, BigDecimal backupstatus,String description){
        this.guid = guid;
        this.maplineid = maplineid;
        this.maplinename = maplinename;
        this.linkid = linkid;
        this.tradetype = tradetype;
        
        this.contracrid = contracrid;
        this.guidd = guidd;
        this.status = status;
        this.backuporg = backuporg;
        this.ctype = ctype;
        this.backupperson = backupperson;
        this.backupdate = backupdate;
        this.contractnum = contractnum;
        this.backuptype= backuptype;
        this.backupstatus = backupstatus;
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
     * 属性 maplineid 的get方法
     * @return String
     */
    public String getMaplineid(){
        return maplineid;
    }
	
    /**
     * 属性 maplineid 的set方法
     * @return
     */
    public void setMaplineid(String maplineid){
        this.maplineid = maplineid;
    } 
	
    /**
     * 属性 maplinename 的get方法
     * @return String
     */
    public String getMaplinename(){
        return maplinename;
    }
	
    /**
     * 属性 maplinename 的set方法
     * @return
     */
    public void setMaplinename(String maplinename){
        this.maplinename = maplinename;
    } 
	
    /**
     * 属性 linkid 的get方法
     * @return String
     */
    public String getLinkid(){
        return linkid;
    }
	
    /**
     * 属性 linkid 的set方法
     * @return
     */
    public void setLinkid(String linkid){
        this.linkid = linkid;
    } 
	
    /**
     * 属性 tradetype 的get方法
     * @return String
     */
    public String getTradetype(){
        return tradetype;
    }
	
    /**
     * 属性 tradetype 的set方法
     * @return
     */
    public void setTradetype(String tradetype){
        this.tradetype = tradetype;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof ContractRecordInformation))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        ContractRecordInformation other = (ContractRecordInformation) o;	        
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
            .append("maplineid"+":"+getMaplineid())
            .append("maplinename"+":"+getMaplinename())
            .append("linkid"+":"+getLinkid())
            .append("tradetype"+":"+getTradetype())
            .append("contracrid"+":"+getContracrid())
            .append("guidd"+":"+getGuidd())
            .append("status"+":"+getStatus())
            .append("backuporg"+":"+getBackuporg())
            .append("ctype"+":"+getCtype())
            .append("backupperson"+":"+getBackupperson())
            .append("backupdate"+":"+getBackupdate())
            .append("contractnum"+":"+getContractnum())
            .append("backuptype"+":"+getBackuptype())
            .append("backupstatus"+":"+getBackupstatus())
            .append("description"+":"+getDescription())
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