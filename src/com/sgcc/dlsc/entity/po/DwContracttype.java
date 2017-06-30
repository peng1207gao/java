package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwContracttype的POJO类
 *
 * @author  djdeng  [Wed Mar 12 17:58:17 CST 2014]
 * 
 */
public class DwContracttype implements Serializable{

    /** 
     * 属性contracttypeid
     */
    private String contracttypeid;
	
    /** 
     * 属性typename
     */
    private String typename;
	
    /** 
     * 属性supertypeid
     */
    private String supertypeid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性effectiveflag
     */
    private BigDecimal effectiveflag;
	
    /**
     * DwContracttype构造函数
     */
    public DwContracttype() {
        super();
    }  
	
    /**
     * DwContracttype完整的构造函数
     */  
    public DwContracttype(String contracttypeid,String marketid){
        this.contracttypeid = contracttypeid;
        this.marketid = marketid;
    }
 
    /**
     * 属性 contracttypeid 的get方法
     * @return String
     */
    public String getContracttypeid(){
        return contracttypeid;
    }
	
    /**
     * 属性 contracttypeid 的set方法
     * @return
     */
    public void setContracttypeid(String contracttypeid){
        if(contracttypeid != null && contracttypeid.trim().length() == 0){
            this.contracttypeid = null;
        }else{
            this.contracttypeid = contracttypeid;
        }
    } 
	
    /**
     * 属性 typename 的get方法
     * @return String
     */
    public String getTypename(){
        return typename;
    }
	
    /**
     * 属性 typename 的set方法
     * @return
     */
    public void setTypename(String typename){
        this.typename = typename;
    } 
	
    /**
     * 属性 supertypeid 的get方法
     * @return String
     */
    public String getSupertypeid(){
        return supertypeid;
    }
	
    /**
     * 属性 supertypeid 的set方法
     * @return
     */
    public void setSupertypeid(String supertypeid){
        this.supertypeid = supertypeid;
    } 
	
    /**
     * 属性 marketid 的get方法
     * @return String
     */
    public String getMarketid(){
        return marketid;
    }
	
    /**
     * 属性 marketid 的set方法
     * @return
     */
    public void setMarketid(String marketid){
        this.marketid = marketid;
    } 
	
    /**
     * 属性 starteffectivedate 的get方法
     * @return Date
     */
    public Date getStarteffectivedate(){
        return starteffectivedate;
    }
	
    /**
     * 属性 starteffectivedate 的set方法
     * @return
     */
    public void setStarteffectivedate(Date starteffectivedate){
        this.starteffectivedate = starteffectivedate;
    } 
	
    /**
     * 属性 endeffectivedate 的get方法
     * @return Date
     */
    public Date getEndeffectivedate(){
        return endeffectivedate;
    }
	
    /**
     * 属性 endeffectivedate 的set方法
     * @return
     */
    public void setEndeffectivedate(Date endeffectivedate){
        this.endeffectivedate = endeffectivedate;
    } 
	
    /**
     * 属性 effectiveflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEffectiveflag(){
        return effectiveflag;
    }
	
    /**
     * 属性 effectiveflag 的set方法
     * @return
     */
    public void setEffectiveflag(BigDecimal effectiveflag){
        this.effectiveflag = effectiveflag;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwContracttype))
	        return false; 
			
        if(getContracttypeid() == null) 
	        return false;

        DwContracttype other = (DwContracttype) o;	        
	    return new EqualsBuilder()
            .append(this.getContracttypeid(), other.getContracttypeid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("contracttypeid"+":"+getContracttypeid())
            .append("typename"+":"+getTypename())
            .append("supertypeid"+":"+getSupertypeid())
            .append("marketid"+":"+getMarketid())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("effectiveflag"+":"+getEffectiveflag())
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