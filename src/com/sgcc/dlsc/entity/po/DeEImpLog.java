package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DeEImpLog的POJO类
 *
 * @author  liang  [Sun Mar 16 19:07:03 CST 2014]
 * 
 */
public class DeEImpLog implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性fileAddressS
     */
    private String fileAddressS;
	
    /** 
     * 属性fileAddressC
     */
    private String fileAddressC;
	
    /** 
     * 属性etableName
     */
    private String etableName;
	
    /** 
     * 属性impRownums
     */
    private BigDecimal impRownums;
	
    /** 
     * 属性impTime
     */
    private Date impTime;
	
    /** 
     * 属性isSuc
     */
    private String isSuc;
	
    /** 
     * 属性failInfo
     */
    private String failInfo;
	
    /**
     * DeEImpLog构造函数
     */
    public DeEImpLog() {
        super();
    }  
	
    /**
     * DeEImpLog完整的构造函数
     */  
    public DeEImpLog(String guid){
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
     * 属性 fileAddressS 的get方法
     * @return String
     */
    public String getFileAddressS(){
        return fileAddressS;
    }
	
    /**
     * 属性 fileAddressS 的set方法
     * @return
     */
    public void setFileAddressS(String fileAddressS){
        this.fileAddressS = fileAddressS;
    } 
	
    /**
     * 属性 fileAddressC 的get方法
     * @return String
     */
    public String getFileAddressC(){
        return fileAddressC;
    }
	
    /**
     * 属性 fileAddressC 的set方法
     * @return
     */
    public void setFileAddressC(String fileAddressC){
        this.fileAddressC = fileAddressC;
    } 
	
    /**
     * 属性 etableName 的get方法
     * @return String
     */
    public String getEtableName(){
        return etableName;
    }
	
    /**
     * 属性 etableName 的set方法
     * @return
     */
    public void setEtableName(String etableName){
        this.etableName = etableName;
    } 
	
    /**
     * 属性 impRownums 的get方法
     * @return BigDecimal
     */
    public BigDecimal getImpRownums(){
        return impRownums;
    }
	
    /**
     * 属性 impRownums 的set方法
     * @return
     */
    public void setImpRownums(BigDecimal impRownums){
        this.impRownums = impRownums;
    } 
	
    /**
     * 属性 impTime 的get方法
     * @return Date
     */
    public Date getImpTime(){
        return impTime;
    }
	
    /**
     * 属性 impTime 的set方法
     * @return
     */
    public void setImpTime(Date impTime){
        this.impTime = impTime;
    } 
	
    /**
     * 属性 isSuc 的get方法
     * @return String
     */
    public String getIsSuc(){
        return isSuc;
    }
	
    /**
     * 属性 isSuc 的set方法
     * @return
     */
    public void setIsSuc(String isSuc){
        this.isSuc = isSuc;
    } 
	
    /**
     * 属性 failInfo 的get方法
     * @return String
     */
    public String getFailInfo(){
        return failInfo;
    }
	
    /**
     * 属性 failInfo 的set方法
     * @return
     */
    public void setFailInfo(String failInfo){
        this.failInfo = failInfo;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DeEImpLog))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DeEImpLog other = (DeEImpLog) o;	        
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
            .append("fileAddressS"+":"+getFileAddressS())
            .append("fileAddressC"+":"+getFileAddressC())
            .append("etableName"+":"+getEtableName())
            .append("impRownums"+":"+getImpRownums())
            .append("impTime"+":"+getImpTime())
            .append("isSuc"+":"+getIsSuc())
            .append("failInfo"+":"+getFailInfo())
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