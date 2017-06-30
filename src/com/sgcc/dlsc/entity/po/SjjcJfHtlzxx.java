package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcJfHtlzxx的POJO类
 *
 * @author  Administrator  [Sun Mar 16 11:09:20 CST 2014]
 * 
 */
public class SjjcJfHtlzxx implements Serializable{

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
     * 属性intodate
     */
    private Date intodate;
	
    /** 
     * 属性contractstate
     */
    private BigDecimal contractstate;
	
    /** 
     * 属性contractsuggestion
     */
    private String contractsuggestion;
	
    /**
     * SjjcJfHtlzxx构造函数
     */
    public SjjcJfHtlzxx() {
        super();
    }  
	
    /**
     * SjjcJfHtlzxx完整的构造函数
     */  
    public SjjcJfHtlzxx(String objId,String companyname,String companyid,String contractid){
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
     * 属性 intodate 的get方法
     * @return Date
     */
    public Date getIntodate(){
        return intodate;
    }
	
    /**
     * 属性 intodate 的set方法
     * @return
     */
    public void setIntodate(Date intodate){
        this.intodate = intodate;
    } 
	
	
	
    /**
     * 属性 contractstate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractstate(){
        return contractstate;
    }
	
    /**
     * 属性 contractstate 的set方法
     * @return
     */
    public void setContractstate(BigDecimal contractstate){
        this.contractstate = contractstate;
    } 
	
	
	
    /**
     * 属性 contractsuggestion 的get方法
     * @return String
     */
    public String getContractsuggestion(){
        return contractsuggestion;
    }
	
    /**
     * 属性 contractsuggestion 的set方法
     * @return
     */
    public void setContractsuggestion(String contractsuggestion){
        this.contractsuggestion = contractsuggestion;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcJfHtlzxx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcJfHtlzxx other = (SjjcJfHtlzxx) o;	        
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
            .append("intodate"+":"+getIntodate())
            .append("contractstate"+":"+getContractstate())
            .append("contractsuggestion"+":"+getContractsuggestion())
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