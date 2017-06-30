package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxDjxxZxfw的POJO类
 *
 * @author  ASUS  [Sat Mar 15 11:20:00 CST 2014]
 * 
 */
public class SjjcYxDjxxZxfw implements Serializable{

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
     * 属性rangeId
     */
    private BigDecimal rangeId;
	
    /** 
     * 属性catPrcId
     */
    private BigDecimal catPrcId;
	
    /** 
     * 属性policyTypeCode
     */
    private String policyTypeCode;
	
    /** 
     * 属性rangeTypeCode
     */
    private String rangeTypeCode;
	
    /** 
     * 属性bgnValue
     */
    private BigDecimal bgnValue;
	
    /** 
     * 属性endValue
     */
    private BigDecimal endValue;
	
    /** 
     * 属性refRangeFlag
     */
    private String refRangeFlag;
	
    /** 
     * 属性rangeRemark
     */
    private String rangeRemark;
	
    /** 
     * 属性iduFlag
     */
    private String iduFlag;
	
    /**
     * SjjcYxDjxxZxfw构造函数
     */
    public SjjcYxDjxxZxfw() {
        super();
    }  
	
    /**
     * SjjcYxDjxxZxfw完整的构造函数
     */  
    public SjjcYxDjxxZxfw(String objId,String companyname,String companyid,String provincename,String provinceid,BigDecimal rangeId,BigDecimal catPrcId,String policyTypeCode,String rangeTypeCode,BigDecimal bgnValue,BigDecimal endValue,String refRangeFlag){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.rangeId = rangeId;
        this.catPrcId = catPrcId;
        this.policyTypeCode = policyTypeCode;
        this.rangeTypeCode = rangeTypeCode;
        this.bgnValue = bgnValue;
        this.endValue = endValue;
        this.refRangeFlag = refRangeFlag;
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
     * 属性 rangeId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRangeId(){
        return rangeId;
    }
	
    /**
     * 属性 rangeId 的set方法
     * @return
     */
    public void setRangeId(BigDecimal rangeId){
        this.rangeId = rangeId;
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
     * 属性 policyTypeCode 的get方法
     * @return String
     */
    public String getPolicyTypeCode(){
        return policyTypeCode;
    }
	
    /**
     * 属性 policyTypeCode 的set方法
     * @return
     */
    public void setPolicyTypeCode(String policyTypeCode){
        this.policyTypeCode = policyTypeCode;
    } 
	
    /**
     * 属性 rangeTypeCode 的get方法
     * @return String
     */
    public String getRangeTypeCode(){
        return rangeTypeCode;
    }
	
    /**
     * 属性 rangeTypeCode 的set方法
     * @return
     */
    public void setRangeTypeCode(String rangeTypeCode){
        this.rangeTypeCode = rangeTypeCode;
    } 
	
    /**
     * 属性 bgnValue 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBgnValue(){
        return bgnValue;
    }
	
    /**
     * 属性 bgnValue 的set方法
     * @return
     */
    public void setBgnValue(BigDecimal bgnValue){
        this.bgnValue = bgnValue;
    } 
	
    /**
     * 属性 endValue 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEndValue(){
        return endValue;
    }
	
    /**
     * 属性 endValue 的set方法
     * @return
     */
    public void setEndValue(BigDecimal endValue){
        this.endValue = endValue;
    } 
	
    /**
     * 属性 refRangeFlag 的get方法
     * @return String
     */
    public String getRefRangeFlag(){
        return refRangeFlag;
    }
	
    /**
     * 属性 refRangeFlag 的set方法
     * @return
     */
    public void setRefRangeFlag(String refRangeFlag){
        this.refRangeFlag = refRangeFlag;
    } 
	
    /**
     * 属性 rangeRemark 的get方法
     * @return String
     */
    public String getRangeRemark(){
        return rangeRemark;
    }
	
    /**
     * 属性 rangeRemark 的set方法
     * @return
     */
    public void setRangeRemark(String rangeRemark){
        this.rangeRemark = rangeRemark;
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
		
        if (o == null || !(o instanceof SjjcYxDjxxZxfw))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxDjxxZxfw other = (SjjcYxDjxxZxfw) o;	        
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
            .append("rangeId"+":"+getRangeId())
            .append("catPrcId"+":"+getCatPrcId())
            .append("policyTypeCode"+":"+getPolicyTypeCode())
            .append("rangeTypeCode"+":"+getRangeTypeCode())
            .append("bgnValue"+":"+getBgnValue())
            .append("endValue"+":"+getEndValue())
            .append("refRangeFlag"+":"+getRefRangeFlag())
            .append("rangeRemark"+":"+getRangeRemark())
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