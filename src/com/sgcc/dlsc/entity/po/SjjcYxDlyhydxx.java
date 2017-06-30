package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxDlyhydxx的POJO类
 *
 * @author  Administrator  [Mon Mar 17 10:20:16 CST 2014]
 * 
 */
public class SjjcYxDlyhydxx implements Serializable{

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
     * 属性consNo
     */
    private String consNo;
	
    /** 
     * 属性year
     */
    private String year;
	
    /** 
     * 属性month
     */
    private String month;
	
    /** 
     * 属性orgNo
     */
    private String orgNo;
	
    /** 
     * 属性orgName
     */
    private String orgName;
	
    /** 
     * 属性prcCode
     */
    private String prcCode;
	
    /** 
     * 属性elecTypeCode
     */
    private String elecTypeCode;
	
    /** 
     * 属性tradeTypeCode
     */
    private String tradeTypeCode;
	
    /** 
     * 属性tsettlePq
     */
    private BigDecimal tsettlePq;
	
    /**
     * SjjcYxDlyhydxx构造函数
     */
    public SjjcYxDlyhydxx() {
        super();
    }  
	
    /**
     * SjjcYxDlyhydxx完整的构造函数
     */  
    public SjjcYxDlyhydxx(String objId,String companyname,String companyid,String provincename,String elecTypeCode,String tradeTypeCode){
        this.objId = objId;
        this.companyname = companyname;
        this.companyid = companyid;
        this.provincename = provincename;
        this.elecTypeCode = elecTypeCode;
        this.tradeTypeCode = tradeTypeCode;
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
     * 属性 consNo 的get方法
     * @return String
     */
    public String getConsNo(){
        return consNo;
    }
	
    /**
     * 属性 consNo 的set方法
     * @return
     */
    public void setConsNo(String consNo){
        this.consNo = consNo;
    } 
	
    /**
     * 属性 year 的get方法
     * @return String
     */
    public String getYear(){
        return year;
    }
	
    /**
     * 属性 year 的set方法
     * @return
     */
    public void setYear(String year){
        this.year = year;
    } 
	
    /**
     * 属性 month 的get方法
     * @return String
     */
    public String getMonth(){
        return month;
    }
	
    /**
     * 属性 month 的set方法
     * @return
     */
    public void setMonth(String month){
        this.month = month;
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
     * 属性 prcCode 的get方法
     * @return String
     */
    public String getPrcCode(){
        return prcCode;
    }
	
    /**
     * 属性 prcCode 的set方法
     * @return
     */
    public void setPrcCode(String prcCode){
        this.prcCode = prcCode;
    } 
	
    /**
     * 属性 elecTypeCode 的get方法
     * @return String
     */
    public String getElecTypeCode(){
        return elecTypeCode;
    }
	
    /**
     * 属性 elecTypeCode 的set方法
     * @return
     */
    public void setElecTypeCode(String elecTypeCode){
        this.elecTypeCode = elecTypeCode;
    } 
	
    /**
     * 属性 tradeTypeCode 的get方法
     * @return String
     */
    public String getTradeTypeCode(){
        return tradeTypeCode;
    }
	
    /**
     * 属性 tradeTypeCode 的set方法
     * @return
     */
    public void setTradeTypeCode(String tradeTypeCode){
        this.tradeTypeCode = tradeTypeCode;
    } 
	
    /**
     * 属性 tsettlePq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTsettlePq(){
        return tsettlePq;
    }
	
    /**
     * 属性 tsettlePq 的set方法
     * @return
     */
    public void setTsettlePq(BigDecimal tsettlePq){
        this.tsettlePq = tsettlePq;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcYxDlyhydxx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxDlyhydxx other = (SjjcYxDlyhydxx) o;	        
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
            .append("consNo"+":"+getConsNo())
            .append("year"+":"+getYear())
            .append("month"+":"+getMonth())
            .append("orgNo"+":"+getOrgNo())
            .append("orgName"+":"+getOrgName())
            .append("prcCode"+":"+getPrcCode())
            .append("elecTypeCode"+":"+getElecTypeCode())
            .append("tradeTypeCode"+":"+getTradeTypeCode())
            .append("tsettlePq"+":"+getTsettlePq())
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