package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxYxydxx的POJO类
 *
 * @author  Administrator  [Fri Mar 14 15:42:25 CST 2014]
 * 
 */
public class SjjcYxYxydxx implements Serializable{

    /** 
     * 属性objId
     */
    private String objId;
	
    /** 
     * 属性companyname
     */
    private String companyname;
	
    /** 
     * 属性companyid
     */
    private String companyid;
	
    /** 
     * 属性provincename
     */
    private String provincename;
	
    /** 
     * 属性provinceid
     */
    private String provinceid;
	
    /** 
     * 属性infodate
     */
    private Date infodate;
	
    /** 
     * 属性ldpower
     */
    private BigDecimal ldpower;
	
    /** 
     * 属性cfpower
     */
    private BigDecimal cfpower;
	
    /** 
     * 属性bfpower
     */
    private BigDecimal bfpower;
	
    /** 
     * 属性fkpower
     */
    private BigDecimal fkpower;
	
    /** 
     * 属性llquantity
     */
    private BigDecimal llquantity;
	
    /** 
     * 属性cfquantity
     */
    private BigDecimal cfquantity;
	
    /** 
     * 属性bfquantity
     */
    private BigDecimal bfquantity;
	
    /** 
     * 属性fkquantity
     */
    private BigDecimal fkquantity;
	
    /** 
     * 属性powergap
     */
    private BigDecimal powergap;
	
    /**
     * SjjcYxYxydxx构造函数
     */
    public SjjcYxYxydxx() {
        super();
    }  
	
    /**
     * SjjcYxYxydxx完整的构造函数
     */  
    public SjjcYxYxydxx(String objId,String companyname,String companyid,String provincename,String provinceid,Date infodate){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.infodate = infodate;
    }
 
    /**
     * 属性 objId 的get方法
     * @return String
     */
    public String getObjId(){
        return objId;
    }
	
    /**
     * 属性 objId 的set方法
     * @return
     */
    public void setObjId(String objId){
        if(objId != null && objId.trim().length() == 0){
            this.objId = null;
        }else{
            this.objId = objId;
        }
    } 
	
    /**
     * 属性 companyname 的get方法
     * @return String
     */
    public String getCompanyname(){
        return companyname;
    }
	
    /**
     * 属性 companyname 的set方法
     * @return
     */
    public void setCompanyname(String companyname){
        this.companyname = companyname;
    } 
	
    /**
     * 属性 companyid 的get方法
     * @return String
     */
    public String getCompanyid(){
        return companyid;
    }
	
    /**
     * 属性 companyid 的set方法
     * @return
     */
    public void setCompanyid(String companyid){
        this.companyid = companyid;
    } 
	
    /**
     * 属性 provincename 的get方法
     * @return String
     */
    public String getProvincename(){
        return provincename;
    }
	
    /**
     * 属性 provincename 的set方法
     * @return
     */
    public void setProvincename(String provincename){
        this.provincename = provincename;
    } 
	
    /**
     * 属性 provinceid 的get方法
     * @return String
     */
    public String getProvinceid(){
        return provinceid;
    }
	
    /**
     * 属性 provinceid 的set方法
     * @return
     */
    public void setProvinceid(String provinceid){
        this.provinceid = provinceid;
    } 
	
    /**
     * 属性 infodate 的get方法
     * @return Date
     */
    public Date getInfodate(){
        return infodate;
    }
	
    /**
     * 属性 infodate 的set方法
     * @return
     */
    public void setInfodate(Date infodate){
        this.infodate = infodate;
    } 
	
    /**
     * 属性 ldpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLdpower(){
        return ldpower;
    }
	
    /**
     * 属性 ldpower 的set方法
     * @return
     */
    public void setLdpower(BigDecimal ldpower){
        this.ldpower = ldpower;
    } 
	
    /**
     * 属性 cfpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCfpower(){
        return cfpower;
    }
	
    /**
     * 属性 cfpower 的set方法
     * @return
     */
    public void setCfpower(BigDecimal cfpower){
        this.cfpower = cfpower;
    } 
	
    /**
     * 属性 bfpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBfpower(){
        return bfpower;
    }
	
    /**
     * 属性 bfpower 的set方法
     * @return
     */
    public void setBfpower(BigDecimal bfpower){
        this.bfpower = bfpower;
    } 
	
    /**
     * 属性 fkpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFkpower(){
        return fkpower;
    }
	
    /**
     * 属性 fkpower 的set方法
     * @return
     */
    public void setFkpower(BigDecimal fkpower){
        this.fkpower = fkpower;
    } 
	
    /**
     * 属性 llquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLlquantity(){
        return llquantity;
    }
	
    /**
     * 属性 llquantity 的set方法
     * @return
     */
    public void setLlquantity(BigDecimal llquantity){
        this.llquantity = llquantity;
    } 
	
    /**
     * 属性 cfquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCfquantity(){
        return cfquantity;
    }
	
    /**
     * 属性 cfquantity 的set方法
     * @return
     */
    public void setCfquantity(BigDecimal cfquantity){
        this.cfquantity = cfquantity;
    } 
	
    /**
     * 属性 bfquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBfquantity(){
        return bfquantity;
    }
	
    /**
     * 属性 bfquantity 的set方法
     * @return
     */
    public void setBfquantity(BigDecimal bfquantity){
        this.bfquantity = bfquantity;
    } 
	
    /**
     * 属性 fkquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFkquantity(){
        return fkquantity;
    }
	
    /**
     * 属性 fkquantity 的set方法
     * @return
     */
    public void setFkquantity(BigDecimal fkquantity){
        this.fkquantity = fkquantity;
    } 
	
    /**
     * 属性 powergap 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowergap(){
        return powergap;
    }
	
    /**
     * 属性 powergap 的set方法
     * @return
     */
    public void setPowergap(BigDecimal powergap){
        this.powergap = powergap;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcYxYxydxx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxYxydxx other = (SjjcYxYxydxx) o;	        
	    return new EqualsBuilder()
            .append(this.getObjId(), other.getObjId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("objId"+":"+getObjId())
            .append("companyname"+":"+getCompanyname())
            .append("companyid"+":"+getCompanyid())
            .append("provincename"+":"+getProvincename())
            .append("provinceid"+":"+getProvinceid())
            .append("infodate"+":"+getInfodate())
            .append("ldpower"+":"+getLdpower())
            .append("cfpower"+":"+getCfpower())
            .append("bfpower"+":"+getBfpower())
            .append("fkpower"+":"+getFkpower())
            .append("llquantity"+":"+getLlquantity())
            .append("cfquantity"+":"+getCfquantity())
            .append("bfquantity"+":"+getBfquantity())
            .append("fkquantity"+":"+getFkquantity())
            .append("powergap"+":"+getPowergap())
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