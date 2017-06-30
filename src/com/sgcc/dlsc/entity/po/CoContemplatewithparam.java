package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContemplatewithparam的POJO类
 *
 * @author  thinpad  [Wed Feb 19 10:18:57 CST 2014]
 * 
 */
public class CoContemplatewithparam implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性contracttype
     */
    private String contracttype;
	
    /** 
     * 属性contracttemplatecode
     */
    private String contracttemplatecode;
	
    /** 
     * 属性contracttemplatename
     */
    private String contracttemplatename;
	
    /** 
     * 属性contracttemplatefile
     */
    private byte[] contracttemplatefile;
	
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
     * 属性isshare
     */
    private BigDecimal isshare;
	
    /** 
     * 属性descreption
     */
    private String descreption;
	
    /**
     * CoContemplatewithparam构造函数
     */
    public CoContemplatewithparam() {
        super();
    }  
	
    /**
     * CoContemplatewithparam完整的构造函数
     */  
    public CoContemplatewithparam(String marketid,String contracttemplatecode){
        this.marketid = marketid;
        this.contracttemplatecode = contracttemplatecode;
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
        if(contracttemplatecode != null && contracttemplatecode.trim().length() == 0){
            this.contracttemplatecode = null;
        }else{
            this.contracttemplatecode = contracttemplatecode;
        }
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
     * 属性 contracttemplatefile 的get方法
     * @return byte[]
     */
    public byte[] getContracttemplatefile(){
        return contracttemplatefile;
    }
	
    /**
     * 属性 contracttemplatefile 的set方法
     * @return
     */
    public void setContracttemplatefile(byte[] contracttemplatefile){
        this.contracttemplatefile = contracttemplatefile;
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
     * 属性 isshare 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsshare(){
        return isshare;
    }
	
    /**
     * 属性 isshare 的set方法
     * @return
     */
    public void setIsshare(BigDecimal isshare){
        this.isshare = isshare;
    } 
	
	
	
    /**
     * 属性 descreption 的get方法
     * @return String
     */
    public String getDescreption(){
        return descreption;
    }
	
    /**
     * 属性 descreption 的set方法
     * @return
     */
    public void setDescreption(String descreption){
        this.descreption = descreption;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContemplatewithparam))
	        return false; 
			
        if(getContracttemplatecode() == null) 
	        return false;

        CoContemplatewithparam other = (CoContemplatewithparam) o;	        
	    return new EqualsBuilder()
            .append(this.getContracttemplatecode(), other.getContracttemplatecode())
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
            .append("contracttemplatecode"+":"+getContracttemplatecode())
            .append("contracttemplatename"+":"+getContracttemplatename())
            .append("contracttemplatefile"+":"+getContracttemplatefile())
            .append("version"+":"+getVersion())
            .append("issueddate"+":"+getIssueddate())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("effectiveflag"+":"+getEffectiveflag())
            .append("isshare"+":"+getIsshare())
            .append("descreption"+":"+getDescreption())
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