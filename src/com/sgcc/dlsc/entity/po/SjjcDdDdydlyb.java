package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcDdDdydlyb的POJO类
 *
 * @author  Administrator  [Mon Jun 23 15:36:37 CST 2014]
 * 
 */
public class SjjcDdDdydlyb implements Serializable{

    /** 
     * 属性objId
     */
    private String objId = "SYS_GUID()";
	
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
     * 属性totalelectricity
     */
    private BigDecimal totalelectricity;
	
    /** 
     * 属性energy1
     */
    private BigDecimal energy1;
	
    /** 
     * 属性energy2
     */
    private BigDecimal energy2;
	
    /** 
     * 属性energy3
     */
    private BigDecimal energy3;
	
    /** 
     * 属性energy4
     */
    private BigDecimal energy4;
	
    /**
     * SjjcDdDdydlyb构造函数
     */
    public SjjcDdDdydlyb() {
        super();
    }  
	
    /**
     * SjjcDdDdydlyb完整的构造函数
     */  
    public SjjcDdDdydlyb(String objId){
        this.objId = objId;
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
     * 属性 totalelectricity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTotalelectricity(){
        return totalelectricity;
    }
	
    /**
     * 属性 totalelectricity 的set方法
     * @return
     */
    public void setTotalelectricity(BigDecimal totalelectricity){
        this.totalelectricity = totalelectricity;
    } 
	
    /**
     * 属性 energy1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergy1(){
        return energy1;
    }
	
    /**
     * 属性 energy1 的set方法
     * @return
     */
    public void setEnergy1(BigDecimal energy1){
        this.energy1 = energy1;
    } 
	
    /**
     * 属性 energy2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergy2(){
        return energy2;
    }
	
    /**
     * 属性 energy2 的set方法
     * @return
     */
    public void setEnergy2(BigDecimal energy2){
        this.energy2 = energy2;
    } 
	
    /**
     * 属性 energy3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergy3(){
        return energy3;
    }
	
    /**
     * 属性 energy3 的set方法
     * @return
     */
    public void setEnergy3(BigDecimal energy3){
        this.energy3 = energy3;
    } 
	
    /**
     * 属性 energy4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergy4(){
        return energy4;
    }
	
    /**
     * 属性 energy4 的set方法
     * @return
     */
    public void setEnergy4(BigDecimal energy4){
        this.energy4 = energy4;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcDdDdydlyb))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcDdDdydlyb other = (SjjcDdDdydlyb) o;	        
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
            .append("totalelectricity"+":"+getTotalelectricity())
            .append("energy1"+":"+getEnergy1())
            .append("energy2"+":"+getEnergy2())
            .append("energy3"+":"+getEnergy3())
            .append("energy4"+":"+getEnergy4())
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