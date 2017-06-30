package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContractbackupinfo的POJO类
 *
 * @author  xiabaike  [Thu Jan 23 09:05:55 CST 2014]
 * 
 */
public class CoContractbackupinfo implements Serializable{

    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性backupdate
     */
    private Date backupdate;
	
    /** 
     * 属性backupperson
     */
    private String backupperson;
	
    /** 
     * 属性backuporg
     */
    private String backuporg;
	
    /** 
     * 属性backuptype
     */
    private BigDecimal backuptype;
	
    /** 
     * 属性contractnum
     */
    private BigDecimal contractnum;
	
    /** 
     * 属性backupstatus
     */
    private BigDecimal backupstatus;
	
    /** 
     * 属性description
     */
    private String description;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /**
     * CoContractbackupinfo构造函数
     */
    public CoContractbackupinfo() {
        super();
    }  
	
    /**
     * CoContractbackupinfo完整的构造函数
     */  
    public CoContractbackupinfo(String contractid,String backuporg,String guid){
        this.contractid = contractid;
        this.backuporg = backuporg;
        this.guid = guid;
    }
 
    /**
     * 属性 contractid 的get方法
     * @return String
     */
    public String getContractid(){
        return contractid;
    }
	
    /**
     * 属性 contractid 的set方法
     * @return
     */
    public void setContractid(String contractid){
        this.contractid = contractid;
    } 
	
    /**
     * 属性 backupdate 的get方法
     * @return Date
     */
    public Date getBackupdate(){
        return backupdate;
    }
	
    /**
     * 属性 backupdate 的set方法
     * @return
     */
    public void setBackupdate(Date backupdate){
        this.backupdate = backupdate;
    } 
	
    /**
     * 属性 backupperson 的get方法
     * @return String
     */
    public String getBackupperson(){
        return backupperson;
    }
	
    /**
     * 属性 backupperson 的set方法
     * @return
     */
    public void setBackupperson(String backupperson){
        this.backupperson = backupperson;
    } 
	
    /**
     * 属性 backuporg 的get方法
     * @return String
     */
    public String getBackuporg(){
        return backuporg;
    }
	
    /**
     * 属性 backuporg 的set方法
     * @return
     */
    public void setBackuporg(String backuporg){
        this.backuporg = backuporg;
    } 
	
    /**
     * 属性 backuptype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackuptype(){
        return backuptype;
    }
	
    /**
     * 属性 backuptype 的set方法
     * @return
     */
    public void setBackuptype(BigDecimal backuptype){
        this.backuptype = backuptype;
    } 
	
    /**
     * 属性 contractnum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractnum(){
        return contractnum;
    }
	
    /**
     * 属性 contractnum 的set方法
     * @return
     */
    public void setContractnum(BigDecimal contractnum){
        this.contractnum = contractnum;
    } 
	
    /**
     * 属性 backupstatus 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackupstatus(){
        return backupstatus;
    }
	
    /**
     * 属性 backupstatus 的set方法
     * @return
     */
    public void setBackupstatus(BigDecimal backupstatus){
        this.backupstatus = backupstatus;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContractbackupinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        CoContractbackupinfo other = (CoContractbackupinfo) o;	        
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
            .append("contractid"+":"+getContractid())
            .append("backupdate"+":"+getBackupdate())
            .append("backupperson"+":"+getBackupperson())
            .append("backuporg"+":"+getBackuporg())
            .append("backuptype"+":"+getBackuptype())
            .append("contractnum"+":"+getContractnum())
            .append("backupstatus"+":"+getBackupstatus())
            .append("description"+":"+getDescription())
            .append("guid"+":"+getGuid())
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