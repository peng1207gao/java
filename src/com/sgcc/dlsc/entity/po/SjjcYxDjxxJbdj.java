package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxDjxxJbdj的POJO类
 *
 * @author  ASUS  [Sat Mar 15 16:47:34 CST 2014]
 * 
 */
public class SjjcYxDjxxJbdj implements Serializable{

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
     * 属性prcId
     */
    private BigDecimal prcId;
	
    /** 
     * 属性catPrcId
     */
    private BigDecimal catPrcId;
	
    /** 
     * 属性capPrc
     */
    private BigDecimal capPrc;
	
    /** 
     * 属性dmdPrc
     */
    private BigDecimal dmdPrc;
	
    /** 
     * 属性iduFlag
     */
    private String iduFlag;
	
    /**
     * SjjcYxDjxxJbdj构造函数
     */
    public SjjcYxDjxxJbdj() {
        super();
    }  
	
    /**
     * SjjcYxDjxxJbdj完整的构造函数
     */  
    public SjjcYxDjxxJbdj(String objId,String companyname,String companyid,String provincename,String provinceid,BigDecimal prcId,BigDecimal catPrcId,BigDecimal capPrc){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.prcId = prcId;
        this.catPrcId = catPrcId;
        this.capPrc = capPrc;
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
     * 属性 prcId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrcId(){
        return prcId;
    }
	
    /**
     * 属性 prcId 的set方法
     * @return
     */
    public void setPrcId(BigDecimal prcId){
        this.prcId = prcId;
    } 
	
    /**
     * 属性 catPrcId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCatPrcId(){
        return catPrcId;
    }
	
    /**
     * 属性 catPrcId 的set方法
     * @return
     */
    public void setCatPrcId(BigDecimal catPrcId){
        this.catPrcId = catPrcId;
    } 
	
    /**
     * 属性 capPrc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapPrc(){
        return capPrc;
    }
	
    /**
     * 属性 capPrc 的set方法
     * @return
     */
    public void setCapPrc(BigDecimal capPrc){
        this.capPrc = capPrc;
    } 
	
    /**
     * 属性 dmdPrc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDmdPrc(){
        return dmdPrc;
    }
	
    /**
     * 属性 dmdPrc 的set方法
     * @return
     */
    public void setDmdPrc(BigDecimal dmdPrc){
        this.dmdPrc = dmdPrc;
    } 
	
    /**
     * 属性 iduFlag 的get方法
     * @return String
     */
    public String getIduFlag(){
        return iduFlag;
    }
	
    /**
     * 属性 iduFlag 的set方法
     * @return
     */
    public void setIduFlag(String iduFlag){
        this.iduFlag = iduFlag;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcYxDjxxJbdj))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxDjxxJbdj other = (SjjcYxDjxxJbdj) o;	        
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
            .append("prcId"+":"+getPrcId())
            .append("catPrcId"+":"+getCatPrcId())
            .append("capPrc"+":"+getCapPrc())
            .append("dmdPrc"+":"+getDmdPrc())
            .append("iduFlag"+":"+getIduFlag())
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