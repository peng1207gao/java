package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SjjcYxDlyhjbxx的POJO类
 *
 * @author  Administrator  [Sun Mar 16 15:44:57 CST 2014]
 * 
 */
public class SjjcYxDlyhjbxx implements Serializable{

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
     * 属性largeconsumername
     */
    private String largeconsumername;
	
    /** 
     * 属性largeconsumerid
     */
    private String largeconsumerid;
	
    /** 
     * 属性area
     */
    private String area;
	
    /** 
     * 属性electricitytype
     */
    private String electricitytype;
	
    /** 
     * 属性consumervoltage
     */
    private String consumervoltage;
	
    /** 
     * 属性consumeraddress
     */
    private String consumeraddress;
	
    /** 
     * 属性industrytype
     */
    private String industrytype;
	
    /** 
     * 属性productionshift
     */
    private String productionshift;
	
    /** 
     * 属性loadcharacter
     */
    private String loadcharacter;
	
    /** 
     * 属性contractqutantity
     */
    private BigDecimal contractqutantity;
	
    /** 
     * 属性functionqutantity
     */
    private BigDecimal functionqutantity;
	
    /** 
     * 属性consumertype
     */
    private String consumertype;
	
    /**
     * SjjcYxDlyhjbxx构造函数
     */
    public SjjcYxDlyhjbxx() {
        super();
    }  
	
    /**
     * SjjcYxDlyhjbxx完整的构造函数
     */  
    public SjjcYxDlyhjbxx(String objId,String provincename,String provinceid,String largeconsumername,String largeconsumerid){
        this.objId = objId;
        this.provincename = provincename;
        this.provinceid = provinceid;
        this.largeconsumername = largeconsumername;
        this.largeconsumerid = largeconsumerid;
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
     * 属性 largeconsumername 的get方法
     * @return String
     */
    public String getLargeconsumername(){
        return largeconsumername;
    }
	
    /**
     * 属性 largeconsumername 的set方法
     * @return
     */
    public void setLargeconsumername(String largeconsumername){
        this.largeconsumername = largeconsumername;
    } 
	
    /**
     * 属性 largeconsumerid 的get方法
     * @return String
     */
    public String getLargeconsumerid(){
        return largeconsumerid;
    }
	
    /**
     * 属性 largeconsumerid 的set方法
     * @return
     */
    public void setLargeconsumerid(String largeconsumerid){
        this.largeconsumerid = largeconsumerid;
    } 
	
    /**
     * 属性 area 的get方法
     * @return String
     */
    public String getArea(){
        return area;
    }
	
    /**
     * 属性 area 的set方法
     * @return
     */
    public void setArea(String area){
        this.area = area;
    } 
	
    /**
     * 属性 electricitytype 的get方法
     * @return String
     */
    public String getElectricitytype(){
        return electricitytype;
    }
	
    /**
     * 属性 electricitytype 的set方法
     * @return
     */
    public void setElectricitytype(String electricitytype){
        this.electricitytype = electricitytype;
    } 
	
    /**
     * 属性 consumervoltage 的get方法
     * @return String
     */
    public String getConsumervoltage(){
        return consumervoltage;
    }
	
    /**
     * 属性 consumervoltage 的set方法
     * @return
     */
    public void setConsumervoltage(String consumervoltage){
        this.consumervoltage = consumervoltage;
    } 
	
    /**
     * 属性 consumeraddress 的get方法
     * @return String
     */
    public String getConsumeraddress(){
        return consumeraddress;
    }
	
    /**
     * 属性 consumeraddress 的set方法
     * @return
     */
    public void setConsumeraddress(String consumeraddress){
        this.consumeraddress = consumeraddress;
    } 
	
    /**
     * 属性 industrytype 的get方法
     * @return String
     */
    public String getIndustrytype(){
        return industrytype;
    }
	
    /**
     * 属性 industrytype 的set方法
     * @return
     */
    public void setIndustrytype(String industrytype){
        this.industrytype = industrytype;
    } 
	
    /**
     * 属性 productionshift 的get方法
     * @return String
     */
    public String getProductionshift(){
        return productionshift;
    }
	
    /**
     * 属性 productionshift 的set方法
     * @return
     */
    public void setProductionshift(String productionshift){
        this.productionshift = productionshift;
    } 
	
    /**
     * 属性 loadcharacter 的get方法
     * @return String
     */
    public String getLoadcharacter(){
        return loadcharacter;
    }
	
    /**
     * 属性 loadcharacter 的set方法
     * @return
     */
    public void setLoadcharacter(String loadcharacter){
        this.loadcharacter = loadcharacter;
    } 
	
    /**
     * 属性 contractqutantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractqutantity(){
        return contractqutantity;
    }
	
    /**
     * 属性 contractqutantity 的set方法
     * @return
     */
    public void setContractqutantity(BigDecimal contractqutantity){
        this.contractqutantity = contractqutantity;
    } 
	
    /**
     * 属性 functionqutantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFunctionqutantity(){
        return functionqutantity;
    }
	
    /**
     * 属性 functionqutantity 的set方法
     * @return
     */
    public void setFunctionqutantity(BigDecimal functionqutantity){
        this.functionqutantity = functionqutantity;
    } 
	
    /**
     * 属性 consumertype 的get方法
     * @return String
     */
    public String getConsumertype(){
        return consumertype;
    }
	
    /**
     * 属性 consumertype 的set方法
     * @return
     */
    public void setConsumertype(String consumertype){
        this.consumertype = consumertype;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SjjcYxDlyhjbxx))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        SjjcYxDlyhjbxx other = (SjjcYxDlyhjbxx) o;	        
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
            .append("largeconsumername"+":"+getLargeconsumername())
            .append("largeconsumerid"+":"+getLargeconsumerid())
            .append("area"+":"+getArea())
            .append("electricitytype"+":"+getElectricitytype())
            .append("consumervoltage"+":"+getConsumervoltage())
            .append("consumeraddress"+":"+getConsumeraddress())
            .append("industrytype"+":"+getIndustrytype())
            .append("productionshift"+":"+getProductionshift())
            .append("loadcharacter"+":"+getLoadcharacter())
            .append("contractqutantity"+":"+getContractqutantity())
            .append("functionqutantity"+":"+getFunctionqutantity())
            .append("consumertype"+":"+getConsumertype())
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