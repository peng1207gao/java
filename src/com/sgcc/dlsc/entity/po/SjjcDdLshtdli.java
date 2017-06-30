package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcDdLshtdli的POJO类
 *
 * @author  Administrator  [Mon Mar 17 10:18:36 CST 2014]
 * 
 */
public class SjjcDdLshtdli implements Serializable{

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
     * 属性serialnumber
     */
    private BigDecimal serialnumber;
	
    /** 
     * 属性starttime
     */
    private String starttime;
	
    /** 
     * 属性endtime
     */
    private String endtime;
	
    /** 
     * 属性powernumber
     */
    private BigDecimal powernumber;
	
    /** 
     * 属性dispatchcompanyname
     */
    private String dispatchcompanyname;
	
    
	
    /**
     * SjjcDdLshtdli构造函数
     */
    public SjjcDdLshtdli() {
        super();
    }  
	
    /**
     * SjjcDdLshtdli完整的构造函数
     */  
    public SjjcDdLshtdli(String objId,String companyname,String companyid,String contractname){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.contractname = contractname;
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
     * 属性 serialnumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSerialnumber(){
        return serialnumber;
    }
	
    /**
     * 属性 serialnumber 的set方法
     * @return
     */
    public void setSerialnumber(BigDecimal serialnumber){
        this.serialnumber = serialnumber;
    } 
	
    /**
     * 属性 starttime 的get方法
     * @return String
     */
    public String getStarttime(){
        return starttime;
    }
	
    /**
     * 属性 starttime 的set方法
     * @return
     */
    public void setStarttime(String starttime){
        this.starttime = starttime;
    } 
	
    /**
     * 属性 endtime 的get方法
     * @return String
     */
    public String getEndtime(){
        return endtime;
    }
	
    /**
     * 属性 endtime 的set方法
     * @return
     */
    public void setEndtime(String endtime){
        this.endtime = endtime;
    } 
	
    /**
     * 属性 powernumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowernumber(){
        return powernumber;
    }
	
    /**
     * 属性 powernumber 的set方法
     * @return
     */
    public void setPowernumber(BigDecimal powernumber){
        this.powernumber = powernumber;
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
		
        if (o == null || !(o instanceof SjjcDdLshtdli))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcDdLshtdli other = (SjjcDdLshtdli) o;	        
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
            .append("serialnumber"+":"+getSerialnumber())
            .append("starttime"+":"+getStarttime())
            .append("endtime"+":"+getEndtime())
            .append("powernumber"+":"+getPowernumber())
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