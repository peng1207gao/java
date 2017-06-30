package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcDdDlrsj的POJO类
 *
 * @author  Administrator  [Mon Jun 23 14:49:45 CST 2014]
 * 
 */
public class SjjcDdDlrsj implements Serializable{

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
     * 属性plantname
     */
    private String plantname;
	
    /** 
     * 属性markname
     */
    private String markname;
	
    /** 
     * 属性infoTime
     */
    private Date infoTime;
	
    /** 
     * 属性forwardquantity
     */
    private BigDecimal forwardquantity;
	
    /** 
     * 属性oppositequantity
     */
    private BigDecimal oppositequantity;
	
    /** 
     * 属性dispatchcompanyname
     */
    private String dispatchcompanyname;
	
    /** 
     * 属性electricityquantity1
     */
    private BigDecimal electricityquantity1;
	
    /** 
     * 属性electricityquantity2
     */
    private BigDecimal electricityquantity2;
	
    /** 
     * 属性electricityquantity3
     */
    private BigDecimal electricityquantity3;
	
    /** 
     * 属性electricityquantity4
     */
    private BigDecimal electricityquantity4;
	
    /**
     * SjjcDdDlrsj构造函数
     */
    public SjjcDdDlrsj() {
        super();
    }  
	
    /**
     * SjjcDdDlrsj完整的构造函数
     */  
    public SjjcDdDlrsj(String objId,String companyname,String companyid,Date infoDate,String plantname,Date infoTime){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.infoDate = infoDate;
        this.plantname = plantname;
        this.infoTime = infoTime;
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
     * 属性 markname 的get方法
     * @return String
     */
    public String getMarkname(){
        return markname;
    }
	
    /**
     * 属性 markname 的set方法
     * @return
     */
    public void setMarkname(String markname){
        this.markname = markname;
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
     * 属性 forwardquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getForwardquantity(){
        return forwardquantity;
    }
	
    /**
     * 属性 forwardquantity 的set方法
     * @return
     */
    public void setForwardquantity(BigDecimal forwardquantity){
        this.forwardquantity = forwardquantity;
    } 
	
    /**
     * 属性 oppositequantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOppositequantity(){
        return oppositequantity;
    }
	
    /**
     * 属性 oppositequantity 的set方法
     * @return
     */
    public void setOppositequantity(BigDecimal oppositequantity){
        this.oppositequantity = oppositequantity;
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
     * 属性 electricityquantity1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricityquantity1(){
        return electricityquantity1;
    }
	
    /**
     * 属性 electricityquantity1 的set方法
     * @return
     */
    public void setElectricityquantity1(BigDecimal electricityquantity1){
        this.electricityquantity1 = electricityquantity1;
    } 
	
    /**
     * 属性 electricityquantity2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricityquantity2(){
        return electricityquantity2;
    }
	
    /**
     * 属性 electricityquantity2 的set方法
     * @return
     */
    public void setElectricityquantity2(BigDecimal electricityquantity2){
        this.electricityquantity2 = electricityquantity2;
    } 
	
    /**
     * 属性 electricityquantity3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricityquantity3(){
        return electricityquantity3;
    }
	
    /**
     * 属性 electricityquantity3 的set方法
     * @return
     */
    public void setElectricityquantity3(BigDecimal electricityquantity3){
        this.electricityquantity3 = electricityquantity3;
    } 
	
    /**
     * 属性 electricityquantity4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElectricityquantity4(){
        return electricityquantity4;
    }
	
    /**
     * 属性 electricityquantity4 的set方法
     * @return
     */
    public void setElectricityquantity4(BigDecimal electricityquantity4){
        this.electricityquantity4 = electricityquantity4;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcDdDlrsj))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcDdDlrsj other = (SjjcDdDlrsj) o;	        
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
            .append("plantname"+":"+getPlantname())
            .append("markname"+":"+getMarkname())
            .append("infoTime"+":"+getInfoTime())
            .append("forwardquantity"+":"+getForwardquantity())
            .append("oppositequantity"+":"+getOppositequantity())
            .append("dispatchcompanyname"+":"+getDispatchcompanyname())
            .append("electricityquantity1"+":"+getElectricityquantity1())
            .append("electricityquantity2"+":"+getElectricityquantity2())
            .append("electricityquantity3"+":"+getElectricityquantity3())
            .append("electricityquantity4"+":"+getElectricityquantity4())
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