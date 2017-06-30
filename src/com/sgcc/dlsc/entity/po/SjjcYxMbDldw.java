package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxMbDldw的POJO类
 *
 * @author  ASUS  [Sat Mar 15 19:39:13 CST 2014]
 * 
 */
public class SjjcYxMbDldw implements Serializable{

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
     * 属性orgNo
     */
    private String orgNo;
	
    /** 
     * 属性orgName
     */
    private String orgName;
	
    /** 
     * 属性porgNo
     */
    private String porgNo;
	
    /** 
     * 属性orgType
     */
    private String orgType;
	
    /** 
     * 属性sortNo
     */
    private BigDecimal sortNo;
	
    /**
     * SjjcYxMbDldw构造函数
     */
    public SjjcYxMbDldw() {
        super();
    }  
	
    /**
     * SjjcYxMbDldw完整的构造函数
     */  
    public SjjcYxMbDldw(String objId,String companyname,String companyid,String provincename,String provinceid,String orgNo){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.orgNo = orgNo;
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
     * 属性 orgNo 的get方法
     * @return String
     */
    public String getOrgNo(){
        return orgNo;
    }
	
    /**
     * 属性 orgNo 的set方法
     * @return
     */
    public void setOrgNo(String orgNo){
        this.orgNo = orgNo;
    } 
	
    /**
     * 属性 orgName 的get方法
     * @return String
     */
    public String getOrgName(){
        return orgName;
    }
	
    /**
     * 属性 orgName 的set方法
     * @return
     */
    public void setOrgName(String orgName){
        this.orgName = orgName;
    } 
	
    /**
     * 属性 porgNo 的get方法
     * @return String
     */
    public String getPorgNo(){
        return porgNo;
    }
	
    /**
     * 属性 porgNo 的set方法
     * @return
     */
    public void setPorgNo(String porgNo){
        this.porgNo = porgNo;
    } 
	
    /**
     * 属性 orgType 的get方法
     * @return String
     */
    public String getOrgType(){
        return orgType;
    }
	
    /**
     * 属性 orgType 的set方法
     * @return
     */
    public void setOrgType(String orgType){
        this.orgType = orgType;
    } 
	
    /**
     * 属性 sortNo 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSortNo(){
        return sortNo;
    }
	
    /**
     * 属性 sortNo 的set方法
     * @return
     */
    public void setSortNo(BigDecimal sortNo){
        this.sortNo = sortNo;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcYxMbDldw))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxMbDldw other = (SjjcYxMbDldw) o;	        
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
            .append("orgNo"+":"+getOrgNo())
            .append("orgName"+":"+getOrgName())
            .append("porgNo"+":"+getPorgNo())
            .append("orgType"+":"+getOrgType())
            .append("sortNo"+":"+getSortNo())
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