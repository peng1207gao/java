package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContractmonthqty的POJO类
 *
 * @author  Administrator  [Fri Jun 27 15:17:18 CST 2014]
 * 
 */
public class CoContractmonthqty implements Serializable{

    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性janqty
     */
    private BigDecimal janqty;
	
    /** 
     * 属性febqty
     */
    private BigDecimal febqty;
	
    /** 
     * 属性marqty
     */
    private BigDecimal marqty;
	
    /** 
     * 属性aprilqty
     */
    private BigDecimal aprilqty;
	
    /** 
     * 属性mayqty
     */
    private BigDecimal mayqty;
	
    /** 
     * 属性junqty
     */
    private BigDecimal junqty;
	
    /** 
     * 属性julyqty
     */
    private BigDecimal julyqty;
	
    /** 
     * 属性augqty
     */
    private BigDecimal augqty;
	
    /** 
     * 属性sepqty
     */
    private BigDecimal sepqty;
	
    /** 
     * 属性octqty
     */
    private BigDecimal octqty;
	
    /** 
     * 属性novqty
     */
    private BigDecimal novqty;
	
    /** 
     * 属性decqty
     */
    private BigDecimal decqty;
	
    /** 
     * 属性addpersonid
     */
    private String addpersonid;
	
    /** 
     * 属性adddate
     */
    private Date adddate;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性updatedate
     */
    private Date updatedate;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性monthqtytype
     */
    private BigDecimal monthqtytype;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /**
     * CoContractmonthqty构造函数
     */
    public CoContractmonthqty() {
        super();
    }  
	
    /**
     * CoContractmonthqty完整的构造函数
     */  
    public CoContractmonthqty(String contractid,String guid){
        this.contractid = contractid;
        this.guid = guid;
    }
 
    /**
     * 属性 contractid 的get方法
     * @return String
     */
    public String getContractid(){
        return contractid;
    }
	
    /**
     * 属性 contractid 的set方法
     * @return
     */
    public void setContractid(String contractid){
        if(contractid != null && contractid.trim().length() == 0){
            this.contractid = null;
        }else{
            this.contractid = contractid;
        }
    } 
	
    /**
     * 属性 janqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJanqty(){
        return janqty;
    }
	
    /**
     * 属性 janqty 的set方法
     * @return
     */
    public void setJanqty(BigDecimal janqty){
        this.janqty = janqty;
    } 
	
    /**
     * 属性 febqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFebqty(){
        return febqty;
    }
	
    /**
     * 属性 febqty 的set方法
     * @return
     */
    public void setFebqty(BigDecimal febqty){
        this.febqty = febqty;
    } 
	
    /**
     * 属性 marqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMarqty(){
        return marqty;
    }
	
    /**
     * 属性 marqty 的set方法
     * @return
     */
    public void setMarqty(BigDecimal marqty){
        this.marqty = marqty;
    } 
	
    /**
     * 属性 aprilqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAprilqty(){
        return aprilqty;
    }
	
    /**
     * 属性 aprilqty 的set方法
     * @return
     */
    public void setAprilqty(BigDecimal aprilqty){
        this.aprilqty = aprilqty;
    } 
	
    /**
     * 属性 mayqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMayqty(){
        return mayqty;
    }
	
    /**
     * 属性 mayqty 的set方法
     * @return
     */
    public void setMayqty(BigDecimal mayqty){
        this.mayqty = mayqty;
    } 
	
    /**
     * 属性 junqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJunqty(){
        return junqty;
    }
	
    /**
     * 属性 junqty 的set方法
     * @return
     */
    public void setJunqty(BigDecimal junqty){
        this.junqty = junqty;
    } 
	
    /**
     * 属性 julyqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJulyqty(){
        return julyqty;
    }
	
    /**
     * 属性 julyqty 的set方法
     * @return
     */
    public void setJulyqty(BigDecimal julyqty){
        this.julyqty = julyqty;
    } 
	
    /**
     * 属性 augqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAugqty(){
        return augqty;
    }
	
    /**
     * 属性 augqty 的set方法
     * @return
     */
    public void setAugqty(BigDecimal augqty){
        this.augqty = augqty;
    } 
	
    /**
     * 属性 sepqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSepqty(){
        return sepqty;
    }
	
    /**
     * 属性 sepqty 的set方法
     * @return
     */
    public void setSepqty(BigDecimal sepqty){
        this.sepqty = sepqty;
    } 
	
    /**
     * 属性 octqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOctqty(){
        return octqty;
    }
	
    /**
     * 属性 octqty 的set方法
     * @return
     */
    public void setOctqty(BigDecimal octqty){
        this.octqty = octqty;
    } 
	
    /**
     * 属性 novqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNovqty(){
        return novqty;
    }
	
    /**
     * 属性 novqty 的set方法
     * @return
     */
    public void setNovqty(BigDecimal novqty){
        this.novqty = novqty;
    } 
	
    /**
     * 属性 decqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDecqty(){
        return decqty;
    }
	
    /**
     * 属性 decqty 的set方法
     * @return
     */
    public void setDecqty(BigDecimal decqty){
        this.decqty = decqty;
    } 
	
    /**
     * 属性 addpersonid 的get方法
     * @return String
     */
    public String getAddpersonid(){
        return addpersonid;
    }
	
    /**
     * 属性 addpersonid 的set方法
     * @return
     */
    public void setAddpersonid(String addpersonid){
        this.addpersonid = addpersonid;
    } 
	
    /**
     * 属性 adddate 的get方法
     * @return Date
     */
    public Date getAdddate(){
        return adddate;
    }
	
    /**
     * 属性 adddate 的set方法
     * @return
     */
    public void setAdddate(Date adddate){
        this.adddate = adddate;
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
     * 属性 updatedate 的get方法
     * @return Date
     */
    public Date getUpdatedate(){
        return updatedate;
    }
	
    /**
     * 属性 updatedate 的set方法
     * @return
     */
    public void setUpdatedate(Date updatedate){
        this.updatedate = updatedate;
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
     * 属性 monthqtytype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonthqtytype(){
        return monthqtytype;
    }
	
    /**
     * 属性 monthqtytype 的set方法
     * @return
     */
    public void setMonthqtytype(BigDecimal monthqtytype){
        this.monthqtytype = monthqtytype;
    } 
	
    /**
     * 属性 guid 的get方法
     * @return String
     */
    public String getGuid(){
        return guid;
    }
	
    /**
     * 属性 guid 的set方法
     * @return
     */
    public void setGuid(String guid){
        this.guid = guid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContractmonthqty))
	        return false; 
			
        if(getContractid() == null) 
	        return false;

        CoContractmonthqty other = (CoContractmonthqty) o;	        
	    return new EqualsBuilder()
            .append(this.getContractid(), other.getContractid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("contractid"+":"+getContractid())
            .append("janqty"+":"+getJanqty())
            .append("febqty"+":"+getFebqty())
            .append("marqty"+":"+getMarqty())
            .append("aprilqty"+":"+getAprilqty())
            .append("mayqty"+":"+getMayqty())
            .append("junqty"+":"+getJunqty())
            .append("julyqty"+":"+getJulyqty())
            .append("augqty"+":"+getAugqty())
            .append("sepqty"+":"+getSepqty())
            .append("octqty"+":"+getOctqty())
            .append("novqty"+":"+getNovqty())
            .append("decqty"+":"+getDecqty())
            .append("addpersonid"+":"+getAddpersonid())
            .append("adddate"+":"+getAdddate())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("updatedate"+":"+getUpdatedate())
            .append("marketid"+":"+getMarketid())
            .append("monthqtytype"+":"+getMonthqtytype())
            .append("guid"+":"+getGuid())
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