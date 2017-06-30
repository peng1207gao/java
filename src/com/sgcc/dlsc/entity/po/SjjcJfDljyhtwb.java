package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcJfDljyhtwb的POJO类
 *
 * @author  Administrator  [Sun Mar 16 11:09:09 CST 2014]
 * 
 */
public class SjjcJfDljyhtwb implements Serializable{

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
     * 属性contractname
     */
    private String contractname;
	
    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性contractno
     */
    private String contractno;
	
    /** 
     * 属性appendixname
     */
    private String appendixname;
	
    /** 
     * 属性appendixtype
     */
    private String appendixtype;
	
    /** 
     * 属性contracttext
     */
    private String contracttext;
	
    /**
     * SjjcJfDljyhtwb构造函数
     */
    public SjjcJfDljyhtwb() {
        super();
    }  
	
    /**
     * SjjcJfDljyhtwb完整的构造函数
     */  
    public SjjcJfDljyhtwb(String objId,String companyname,String companyid,String contractid){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.contractid = contractid;
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
     * 属性 contractname 的get方法
     * @return String
     */
    public String getContractname(){
        return contractname;
    }
	
    /**
     * 属性 contractname 的set方法
     * @return
     */
    public void setContractname(String contractname){
        this.contractname = contractname;
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
     * 属性 contractno 的get方法
     * @return String
     */
    public String getContractno(){
        return contractno;
    }
	
    /**
     * 属性 contractno 的set方法
     * @return
     */
    public void setContractno(String contractno){
        this.contractno = contractno;
    } 
	
	
	
    /**
     * 属性 appendixname 的get方法
     * @return String
     */
    public String getAppendixname(){
        return appendixname;
    }
	
    /**
     * 属性 appendixname 的set方法
     * @return
     */
    public void setAppendixname(String appendixname){
        this.appendixname = appendixname;
    } 
	
	
	
    /**
     * 属性 appendixtype 的get方法
     * @return String
     */
    public String getAppendixtype(){
        return appendixtype;
    }
	
    /**
     * 属性 appendixtype 的set方法
     * @return
     */
    public void setAppendixtype(String appendixtype){
        this.appendixtype = appendixtype;
    } 
	
	
	
    /**
     * 属性 contracttext 的get方法
     * @return String
     */
    public String getContracttext(){
        return contracttext;
    }
	
    /**
     * 属性 contracttext 的set方法
     * @return
     */
    public void setContracttext(String contracttext){
        this.contracttext = contracttext;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcJfDljyhtwb))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcJfDljyhtwb other = (SjjcJfDljyhtwb) o;	        
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
            .append("contractname"+":"+getContractname())
            .append("contractid"+":"+getContractid())
            .append("contractno"+":"+getContractno())
            .append("appendixname"+":"+getAppendixname())
            .append("appendixtype"+":"+getAppendixtype())
            .append("contracttext"+":"+getContracttext())
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