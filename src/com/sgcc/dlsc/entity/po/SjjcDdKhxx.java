package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcDdKhxx的POJO类
 *
 * @author  Administrator  [Mon Mar 17 10:13:47 CST 2014]
 * 
 */
public class SjjcDdKhxx implements Serializable{

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
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性plantname
     */
    private String plantname;
	
    /** 
     * 属性unitname
     */
    private String unitname;
	
    /** 
     * 属性assessmentclass
     */
    private BigDecimal assessmentclass;
	
    /** 
     * 属性assessmentquantity
     */
    private BigDecimal assessmentquantity;
	
    /** 
     * 属性assessmentexpenses
     */
    private BigDecimal assessmentexpenses;
	
    /** 
     * 属性dispatchcompanyname
     */
    private String dispatchcompanyname;
	
     
	
    /**
     * SjjcDdKhxx构造函数
     */
    public SjjcDdKhxx() {
        super();
    }  
	
    /**
     * SjjcDdKhxx完整的构造函数
     */  
    public SjjcDdKhxx(String objId,String companyname,String companyid,BigDecimal theyear,BigDecimal themonth){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.theyear = theyear;
        this.themonth = themonth;
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
     * 属性 theyear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTheyear(){
        return theyear;
    }
	
    /**
     * 属性 theyear 的set方法
     * @return
     */
    public void setTheyear(BigDecimal theyear){
        this.theyear = theyear;
    } 
	
    /**
     * 属性 themonth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getThemonth(){
        return themonth;
    }
	
    /**
     * 属性 themonth 的set方法
     * @return
     */
    public void setThemonth(BigDecimal themonth){
        this.themonth = themonth;
    } 
	
    /**
     * 属性 plantname 的get方法
     * @return String
     */
    public String getPlantname(){
        return plantname;
    }
	
    /**
     * 属性 plantname 的set方法
     * @return
     */
    public void setPlantname(String plantname){
        this.plantname = plantname;
    } 
	
    /**
     * 属性 unitname 的get方法
     * @return String
     */
    public String getUnitname(){
        return unitname;
    }
	
    /**
     * 属性 unitname 的set方法
     * @return
     */
    public void setUnitname(String unitname){
        this.unitname = unitname;
    } 
	
    /**
     * 属性 assessmentclass 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAssessmentclass(){
        return assessmentclass;
    }
	
    /**
     * 属性 assessmentclass 的set方法
     * @return
     */
    public void setAssessmentclass(BigDecimal assessmentclass){
        this.assessmentclass = assessmentclass;
    } 
	
    /**
     * 属性 assessmentquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAssessmentquantity(){
        return assessmentquantity;
    }
	
    /**
     * 属性 assessmentquantity 的set方法
     * @return
     */
    public void setAssessmentquantity(BigDecimal assessmentquantity){
        this.assessmentquantity = assessmentquantity;
    } 
	
    /**
     * 属性 assessmentexpenses 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAssessmentexpenses(){
        return assessmentexpenses;
    }
	
    /**
     * 属性 assessmentexpenses 的set方法
     * @return
     */
    public void setAssessmentexpenses(BigDecimal assessmentexpenses){
        this.assessmentexpenses = assessmentexpenses;
    } 
	
    /**
     * 属性 dispatchcompanyname 的get方法
     * @return String
     */
    public String getDispatchcompanyname(){
        return dispatchcompanyname;
    }
	
    /**
     * 属性 dispatchcompanyname 的set方法
     * @return
     */
    public void setDispatchcompanyname(String dispatchcompanyname){
        this.dispatchcompanyname = dispatchcompanyname;
    } 
	
     
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcDdKhxx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcDdKhxx other = (SjjcDdKhxx) o;	        
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
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("plantname"+":"+getPlantname())
            .append("unitname"+":"+getUnitname())
            .append("assessmentclass"+":"+getAssessmentclass())
            .append("assessmentquantity"+":"+getAssessmentquantity())
            .append("assessmentexpenses"+":"+getAssessmentexpenses())
            .append("dispatchcompanyname"+":"+getDispatchcompanyname())
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