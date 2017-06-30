package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaEconomicunit的POJO类
 *
 * @author  liyuan  [Thu Jan 23 17:01:08 CST 2014]
 * 
 */
public class BaEconomicunit implements Serializable{

    /** 
     * 属性ecounitid
     */
    private String ecounitid;
	
    /** 
     * 属性ecounitcode
     */
    private String ecounitcode;
	
    /** 
     * 属性ecounitname
     */
    private String ecounitname;
	
    /** 
     * 属性aliasname
     */
    private String aliasname;
	
    /** 
     * 属性description
     */
    private String description;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
    /** 
     * 属性ecounitcapacity
     */
    private BigDecimal ecounitcapacity;
	
    /** 
     * 属性generatorid
     */
    private String generatorid;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性isdelete
     */
    private BigDecimal isdelete;
	
    /** 
     * 属性ecoshare
     */
    private BigDecimal ecoshare;
	
    /** 
     * 属性price
     */
    private BigDecimal price;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * BaEconomicunit构造函数
     */
    public BaEconomicunit() {
        super();
    }  
	
    /**
     * BaEconomicunit完整的构造函数
     */  
    public BaEconomicunit(String ecounitid,String ecounitcode,String ecounitname,String participantid,String generatorid,Date starteffectivedate,BigDecimal isdelete,String marketid){
        this.ecounitid = ecounitid;
        this.ecounitcode = ecounitcode;
        this.ecounitname = ecounitname;
        this.participantid = participantid;
        this.generatorid = generatorid;
        this.starteffectivedate = starteffectivedate;
        this.isdelete = isdelete;
        this.marketid = marketid;
    }
 
    /**
     * 属性 ecounitid 的get方法
     * @return String
     */
    public String getEcounitid(){
        return ecounitid;
    }
	
    /**
     * 属性 ecounitid 的set方法
     * @return
     */
    public void setEcounitid(String ecounitid){
        if(ecounitid != null && ecounitid.trim().length() == 0){
            this.ecounitid = null;
        }else{
            this.ecounitid = ecounitid;
        }
    } 
	
    /**
     * 属性 ecounitcode 的get方法
     * @return String
     */
    public String getEcounitcode(){
        return ecounitcode;
    }
	
    /**
     * 属性 ecounitcode 的set方法
     * @return
     */
    public void setEcounitcode(String ecounitcode){
        this.ecounitcode = ecounitcode;
    } 
	
    /**
     * 属性 ecounitname 的get方法
     * @return String
     */
    public String getEcounitname(){
        return ecounitname;
    }
	
    /**
     * 属性 ecounitname 的set方法
     * @return
     */
    public void setEcounitname(String ecounitname){
        this.ecounitname = ecounitname;
    } 
	
    /**
     * 属性 aliasname 的get方法
     * @return String
     */
    public String getAliasname(){
        return aliasname;
    }
	
    /**
     * 属性 aliasname 的set方法
     * @return
     */
    public void setAliasname(String aliasname){
        this.aliasname = aliasname;
    } 
	
    /**
     * 属性 description 的get方法
     * @return String
     */
    public String getDescription(){
        return description;
    }
	
    /**
     * 属性 description 的set方法
     * @return
     */
    public void setDescription(String description){
        this.description = description;
    } 
	
    /**
     * 属性 participantid 的get方法
     * @return String
     */
    public String getParticipantid(){
        return participantid;
    }
	
    /**
     * 属性 participantid 的set方法
     * @return
     */
    public void setParticipantid(String participantid){
        this.participantid = participantid;
    } 
	
    /**
     * 属性 ecounitcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEcounitcapacity(){
        return ecounitcapacity;
    }
	
    /**
     * 属性 ecounitcapacity 的set方法
     * @return
     */
    public void setEcounitcapacity(BigDecimal ecounitcapacity){
        this.ecounitcapacity = ecounitcapacity;
    } 
	
    /**
     * 属性 generatorid 的get方法
     * @return String
     */
    public String getGeneratorid(){
        return generatorid;
    }
	
    /**
     * 属性 generatorid 的set方法
     * @return
     */
    public void setGeneratorid(String generatorid){
        this.generatorid = generatorid;
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
     * 属性 ecoshare 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEcoshare(){
        return ecoshare;
    }
	
    /**
     * 属性 ecoshare 的set方法
     * @return
     */
    public void setEcoshare(BigDecimal ecoshare){
        this.ecoshare = ecoshare;
    } 
	
    /**
     * 属性 price 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrice(){
        return price;
    }
	
    /**
     * 属性 price 的set方法
     * @return
     */
    public void setPrice(BigDecimal price){
        this.price = price;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaEconomicunit))
	        return false; 
			
        if(getEcounitid() == null) 
	        return false;

        BaEconomicunit other = (BaEconomicunit) o;	        
	    return new EqualsBuilder()
            .append(this.getEcounitid(), other.getEcounitid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("ecounitid"+":"+getEcounitid())
            .append("ecounitcode"+":"+getEcounitcode())
            .append("ecounitname"+":"+getEcounitname())
            .append("aliasname"+":"+getAliasname())
            .append("description"+":"+getDescription())
            .append("participantid"+":"+getParticipantid())
            .append("ecounitcapacity"+":"+getEcounitcapacity())
            .append("generatorid"+":"+getGeneratorid())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("isdelete"+":"+getIsdelete())
            .append("ecoshare"+":"+getEcoshare())
            .append("price"+":"+getPrice())
            .append("guid"+":"+getGuid())
            .append("marketid"+":"+getMarketid())
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