package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContracttemplate的POJO类
 *
 * @author  mengke  [Thu May 22 11:23:03 CST 2014]
 * 
 */
public class CoContracttemplate implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性contracttype
     */
    private String contracttype;
	
    /** 
     * 属性contracttemplateid
     */
    private String contracttemplateid;
	
    /** 
     * 属性contracttemplatecode
     */
    private String contracttemplatecode;
	
    /** 
     * 属性contracttemplatename
     */
    private String contracttemplatename;
	
    /** 
     * 属性version
     */
    private String version;
	
    /** 
     * 属性issueddate
     */
    private Date issueddate;
	
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
     * 属性isdelete
     */
    private BigDecimal isdelete;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /**
     * CoContracttemplate构造函数
     */
    public CoContracttemplate() {
        super();
    }  
	
    /**
     * CoContracttemplate完整的构造函数
     */  
    public CoContracttemplate(String marketid,String contracttemplateid,BigDecimal isdelete){
        this.marketid = marketid;
        this.contracttemplateid = contracttemplateid;
        this.isdelete = isdelete;
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
     * 属性 contracttype 的get方法
     * @return String
     */
    public String getContracttype(){
        return contracttype;
    }
	
    /**
     * 属性 contracttype 的set方法
     * @return
     */
    public void setContracttype(String contracttype){
        this.contracttype = contracttype;
    } 
	
    /**
     * 属性 contracttemplateid 的get方法
     * @return String
     */
    public String getContracttemplateid(){
        return contracttemplateid;
    }
	
    /**
     * 属性 contracttemplateid 的set方法
     * @return
     */
    public void setContracttemplateid(String contracttemplateid){
        if(contracttemplateid != null && contracttemplateid.trim().length() == 0){
            this.contracttemplateid = null;
        }else{
            this.contracttemplateid = contracttemplateid;
        }
    } 
	
    /**
     * 属性 contracttemplatecode 的get方法
     * @return String
     */
    public String getContracttemplatecode(){
        return contracttemplatecode;
    }
	
    /**
     * 属性 contracttemplatecode 的set方法
     * @return
     */
    public void setContracttemplatecode(String contracttemplatecode){
        this.contracttemplatecode = contracttemplatecode;
    } 
	
    /**
     * 属性 contracttemplatename 的get方法
     * @return String
     */
    public String getContracttemplatename(){
        return contracttemplatename;
    }
	
    /**
     * 属性 contracttemplatename 的set方法
     * @return
     */
    public void setContracttemplatename(String contracttemplatename){
        this.contracttemplatename = contracttemplatename;
    } 
	
    /**
     * 属性 version 的get方法
     * @return String
     */
    public String getVersion(){
        return version;
    }
	
    /**
     * 属性 version 的set方法
     * @return
     */
    public void setVersion(String version){
        this.version = version;
    } 
	
    /**
     * 属性 issueddate 的get方法
     * @return Date
     */
    public Date getIssueddate(){
        return issueddate;
    }
	
    /**
     * 属性 issueddate 的set方法
     * @return
     */
    public void setIssueddate(Date issueddate){
        this.issueddate = issueddate;
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
     * 属性 isdelete 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdelete(){
        return isdelete;
    }
	
    /**
     * 属性 isdelete 的set方法
     * @return
     */
    public void setIsdelete(BigDecimal isdelete){
        this.isdelete = isdelete;
    } 
	
    /**
     * 属性 updatetime 的get方法
     * @return Date
     */
    public Date getUpdatetime(){
        return updatetime;
    }
	
    /**
     * 属性 updatetime 的set方法
     * @return
     */
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
    } 
	
    /**
     * 属性 updatepersonid 的get方法
     * @return String
     */
    public String getUpdatepersonid(){
        return updatepersonid;
    }
	
    /**
     * 属性 updatepersonid 的set方法
     * @return
     */
    public void setUpdatepersonid(String updatepersonid){
        this.updatepersonid = updatepersonid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContracttemplate))
	        return false; 
			
        if(getContracttemplateid() == null) 
	        return false;

        CoContracttemplate other = (CoContracttemplate) o;	        
	    return new EqualsBuilder()
            .append(this.getContracttemplateid(), other.getContracttemplateid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("marketid"+":"+getMarketid())
            .append("contracttype"+":"+getContracttype())
            .append("contracttemplateid"+":"+getContracttemplateid())
            .append("contracttemplatecode"+":"+getContracttemplatecode())
            .append("contracttemplatename"+":"+getContracttemplatename())
            .append("version"+":"+getVersion())
            .append("issueddate"+":"+getIssueddate())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("effectiveflag"+":"+getEffectiveflag())
            .append("isdelete"+":"+getIsdelete())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
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