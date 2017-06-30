package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwConsumerdemandplan的POJO类
 *
 * @author  zhangpei  [Thu Mar 13 11:15:04 CST 2014]
 * 
 */
public class DwConsumerdemandplan implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性demandquantity
     */
    private BigDecimal demandquantity;
	
    /** 
     * 属性economicconsumerid
     */
    private String economicconsumerid;
	
    /** 
     * 属性purchasemode
     */
    private String purchasemode;
	
    /**
     * DwConsumerdemandplan构造函数
     */
    public DwConsumerdemandplan() {
        super();
    }  
	
    /**
     * DwConsumerdemandplan完整的构造函数
     */  
    public DwConsumerdemandplan(String guid){
        this.guid = guid;
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
        if(guid != null && guid.trim().length() == 0){
            this.guid = null;
        }else{
            this.guid = guid;
        }
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
     * 属性 theyear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTheyear(){
        return theyear;
    }
	
    /**
     * 属性 theyear 的set方法
     * @return
     */
    public void setTheyear(BigDecimal theyear){
        this.theyear = theyear;
    } 
	
    /**
     * 属性 themonth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getThemonth(){
        return themonth;
    }
	
    /**
     * 属性 themonth 的set方法
     * @return
     */
    public void setThemonth(BigDecimal themonth){
        this.themonth = themonth;
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
     * 属性 demandquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDemandquantity(){
        return demandquantity;
    }
	
    /**
     * 属性 demandquantity 的set方法
     * @return
     */
    public void setDemandquantity(BigDecimal demandquantity){
        this.demandquantity = demandquantity;
    } 
	
    /**
     * 属性 economicconsumerid 的get方法
     * @return String
     */
    public String getEconomicconsumerid(){
        return economicconsumerid;
    }
	
    /**
     * 属性 economicconsumerid 的set方法
     * @return
     */
    public void setEconomicconsumerid(String economicconsumerid){
        this.economicconsumerid = economicconsumerid;
    } 
	
    /**
     * 属性 purchasemode 的get方法
     * @return String
     */
    public String getPurchasemode(){
        return purchasemode;
    }
	
    /**
     * 属性 purchasemode 的set方法
     * @return
     */
    public void setPurchasemode(String purchasemode){
        this.purchasemode = purchasemode;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwConsumerdemandplan))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwConsumerdemandplan other = (DwConsumerdemandplan) o;	        
	    return new EqualsBuilder()
            .append(this.getGuid(), other.getGuid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("guid"+":"+getGuid())
            .append("participantid"+":"+getParticipantid())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("marketid"+":"+getMarketid())
            .append("demandquantity"+":"+getDemandquantity())
            .append("economicconsumerid"+":"+getEconomicconsumerid())
            .append("purchasemode"+":"+getPurchasemode())
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