package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxMbMj的POJO类
 *
 * @author  ASUS  [Sun Mar 16 10:14:45 CST 2014]
 * 
 */
public class SjjcYxMbMj implements Serializable{

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
     * 属性codeSortId
     */
    private BigDecimal codeSortId;
	
    /** 
     * 属性name
     */
    private String name;
	
    /** 
     * 属性maintTypeCode
     */
    private String maintTypeCode;
	
    /** 
     * 属性maintOrgNo
     */
    private String maintOrgNo;
	
    /** 
     * 属性vn
     */
    private String vn;
	
    /** 
     * 属性codeType
     */
    private String codeType;
	
    /** 
     * 属性validFlag
     */
    private String validFlag;
	
    /** 
     * 属性effectDate
     */
    private Date effectDate;
	
    /**
     * SjjcYxMbMj构造函数
     */
    public SjjcYxMbMj() {
        super();
    }  
	
    /**
     * SjjcYxMbMj完整的构造函数
     */  
    public SjjcYxMbMj(String objId,String companyname,String companyid,String provincename,String provinceid,BigDecimal codeSortId){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.codeSortId = codeSortId;
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
     * 属性 codeSortId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCodeSortId(){
        return codeSortId;
    }
	
    /**
     * 属性 codeSortId 的set方法
     * @return
     */
    public void setCodeSortId(BigDecimal codeSortId){
        this.codeSortId = codeSortId;
    } 
	
    /**
     * 属性 name 的get方法
     * @return String
     */
    public String getName(){
        return name;
    }
	
    /**
     * 属性 name 的set方法
     * @return
     */
    public void setName(String name){
        this.name = name;
    } 
	
    /**
     * 属性 maintTypeCode 的get方法
     * @return String
     */
    public String getMaintTypeCode(){
        return maintTypeCode;
    }
	
    /**
     * 属性 maintTypeCode 的set方法
     * @return
     */
    public void setMaintTypeCode(String maintTypeCode){
        this.maintTypeCode = maintTypeCode;
    } 
	
    /**
     * 属性 maintOrgNo 的get方法
     * @return String
     */
    public String getMaintOrgNo(){
        return maintOrgNo;
    }
	
    /**
     * 属性 maintOrgNo 的set方法
     * @return
     */
    public void setMaintOrgNo(String maintOrgNo){
        this.maintOrgNo = maintOrgNo;
    } 
	
    /**
     * 属性 vn 的get方法
     * @return String
     */
    public String getVn(){
        return vn;
    }
	
    /**
     * 属性 vn 的set方法
     * @return
     */
    public void setVn(String vn){
        this.vn = vn;
    } 
	
    /**
     * 属性 codeType 的get方法
     * @return String
     */
    public String getCodeType(){
        return codeType;
    }
	
    /**
     * 属性 codeType 的set方法
     * @return
     */
    public void setCodeType(String codeType){
        this.codeType = codeType;
    } 
	
    /**
     * 属性 validFlag 的get方法
     * @return String
     */
    public String getValidFlag(){
        return validFlag;
    }
	
    /**
     * 属性 validFlag 的set方法
     * @return
     */
    public void setValidFlag(String validFlag){
        this.validFlag = validFlag;
    } 
	
    /**
     * 属性 effectDate 的get方法
     * @return Date
     */
    public Date getEffectDate(){
        return effectDate;
    }
	
    /**
     * 属性 effectDate 的set方法
     * @return
     */
    public void setEffectDate(Date effectDate){
        this.effectDate = effectDate;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcYxMbMj))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxMbMj other = (SjjcYxMbMj) o;	        
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
            .append("codeSortId"+":"+getCodeSortId())
            .append("name"+":"+getName())
            .append("maintTypeCode"+":"+getMaintTypeCode())
            .append("maintOrgNo"+":"+getMaintOrgNo())
            .append("vn"+":"+getVn())
            .append("codeType"+":"+getCodeType())
            .append("validFlag"+":"+getValidFlag())
            .append("effectDate"+":"+getEffectDate())
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