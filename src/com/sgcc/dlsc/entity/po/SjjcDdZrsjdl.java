package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcDdZrsjdl的POJO类
 *
 * @author  Administrator  [Mon Jun 23 15:22:10 CST 2014]
 * 
 */
public class SjjcDdZrsjdl implements Serializable{

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
     * 属性infoDate
     */
    private Date infoDate;
	
    /** 
     * 属性infoClass
     */
    private BigDecimal infoClass;
	
    /** 
     * 属性unitlinename
     */
    private String unitlinename;
	
    /** 
     * 属性infoTime
     */
    private Date infoTime;
	
    /** 
     * 属性linequantity
     */
    private BigDecimal linequantity;
	
    /** 
     * 属性generationquantity
     */
    private BigDecimal generationquantity;
	
    /** 
     * 属性dispatchcompanyname
     */
    private String dispatchcompanyname;
	
    /** 
     * 属性monthcumulativecapacity
     */
    private BigDecimal monthcumulativecapacity;
	
    /** 
     * 属性bootmode
     */
    private String bootmode;
	
    /**
     * SjjcDdZrsjdl构造函数
     */
    public SjjcDdZrsjdl() {
        super();
    }  
	
    /**
     * SjjcDdZrsjdl完整的构造函数
     */  
    public SjjcDdZrsjdl(String objId,String companyname,String companyid,String dispatchcompanyname){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.dispatchcompanyname = dispatchcompanyname;
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
     * 属性 infoDate 的get方法
     * @return Date
     */
    public Date getInfoDate(){
        return infoDate;
    }
	
    /**
     * 属性 infoDate 的set方法
     * @return
     */
    public void setInfoDate(Date infoDate){
        this.infoDate = infoDate;
    } 
	
    /**
     * 属性 infoClass 的get方法
     * @return BigDecimal
     */
    public BigDecimal getInfoClass(){
        return infoClass;
    }
	
    /**
     * 属性 infoClass 的set方法
     * @return
     */
    public void setInfoClass(BigDecimal infoClass){
        this.infoClass = infoClass;
    } 
	
    /**
     * 属性 unitlinename 的get方法
     * @return String
     */
    public String getUnitlinename(){
        return unitlinename;
    }
	
    /**
     * 属性 unitlinename 的set方法
     * @return
     */
    public void setUnitlinename(String unitlinename){
        this.unitlinename = unitlinename;
    } 
	
    /**
     * 属性 infoTime 的get方法
     * @return Date
     */
    public Date getInfoTime(){
        return infoTime;
    }
	
    /**
     * 属性 infoTime 的set方法
     * @return
     */
    public void setInfoTime(Date infoTime){
        this.infoTime = infoTime;
    } 
	
    /**
     * 属性 linequantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLinequantity(){
        return linequantity;
    }
	
    /**
     * 属性 linequantity 的set方法
     * @return
     */
    public void setLinequantity(BigDecimal linequantity){
        this.linequantity = linequantity;
    } 
	
    /**
     * 属性 generationquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerationquantity(){
        return generationquantity;
    }
	
    /**
     * 属性 generationquantity 的set方法
     * @return
     */
    public void setGenerationquantity(BigDecimal generationquantity){
        this.generationquantity = generationquantity;
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
     * 属性 monthcumulativecapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthcumulativecapacity(){
        return monthcumulativecapacity;
    }
	
    /**
     * 属性 monthcumulativecapacity 的set方法
     * @return
     */
    public void setMonthcumulativecapacity(BigDecimal monthcumulativecapacity){
        this.monthcumulativecapacity = monthcumulativecapacity;
    } 
	
    /**
     * 属性 bootmode 的get方法
     * @return String
     */
    public String getBootmode(){
        return bootmode;
    }
	
    /**
     * 属性 bootmode 的set方法
     * @return
     */
    public void setBootmode(String bootmode){
        this.bootmode = bootmode;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcDdZrsjdl))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcDdZrsjdl other = (SjjcDdZrsjdl) o;	        
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
            .append("infoDate"+":"+getInfoDate())
            .append("infoClass"+":"+getInfoClass())
            .append("unitlinename"+":"+getUnitlinename())
            .append("infoTime"+":"+getInfoTime())
            .append("linequantity"+":"+getLinequantity())
            .append("generationquantity"+":"+getGenerationquantity())
            .append("dispatchcompanyname"+":"+getDispatchcompanyname())
            .append("monthcumulativecapacity"+":"+getMonthcumulativecapacity())
            .append("bootmode"+":"+getBootmode())
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