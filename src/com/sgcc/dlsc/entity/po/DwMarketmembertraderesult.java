package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwMarketmembertraderesult的POJO类
 *
 * @author  eveliy  [Fri Mar 14 11:14:03 CST 2014]
 * 
 */
public class DwMarketmembertraderesult implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeseqid
     */
    private String tradeseqid;
	
    /** 
     * 属性timebrand
     */
    private BigDecimal timebrand;
	
    /** 
     * 属性theyear
     */
    private Date theyear;
	
    /** 
     * 属性themonth
     */
    private Date themonth;
	
    /** 
     * 属性vendeeparticipantid
     */
    private String vendeeparticipantid;
	
    /** 
     * 属性saleparticipantid
     */
    private String saleparticipantid;
	
    /** 
     * 属性vendeeenergy
     */
    private BigDecimal vendeeenergy;
	
    /** 
     * 属性saleenergy
     */
    private BigDecimal saleenergy;
	
    /** 
     * 属性thetype
     */
    private String thetype;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * DwMarketmembertraderesult构造函数
     */
    public DwMarketmembertraderesult() {
        super();
    }  
	
    /**
     * DwMarketmembertraderesult完整的构造函数
     */  
    public DwMarketmembertraderesult(String guid){
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
     * 属性 tradeseqid 的get方法
     * @return String
     */
    public String getTradeseqid(){
        return tradeseqid;
    }
	
    /**
     * 属性 tradeseqid 的set方法
     * @return
     */
    public void setTradeseqid(String tradeseqid){
        this.tradeseqid = tradeseqid;
    } 
	
    /**
     * 属性 timebrand 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTimebrand(){
        return timebrand;
    }
	
    /**
     * 属性 timebrand 的set方法
     * @return
     */
    public void setTimebrand(BigDecimal timebrand){
        this.timebrand = timebrand;
    } 
	
    /**
     * 属性 theyear 的get方法
     * @return Date
     */
    public Date getTheyear(){
        return theyear;
    }
	
    /**
     * 属性 theyear 的set方法
     * @return
     */
    public void setTheyear(Date theyear){
        this.theyear = theyear;
    } 
	
    /**
     * 属性 themonth 的get方法
     * @return Date
     */
    public Date getThemonth(){
        return themonth;
    }
	
    /**
     * 属性 themonth 的set方法
     * @return
     */
    public void setThemonth(Date themonth){
        this.themonth = themonth;
    } 
	
    /**
     * 属性 vendeeparticipantid 的get方法
     * @return String
     */
    public String getVendeeparticipantid(){
        return vendeeparticipantid;
    }
	
    /**
     * 属性 vendeeparticipantid 的set方法
     * @return
     */
    public void setVendeeparticipantid(String vendeeparticipantid){
        this.vendeeparticipantid = vendeeparticipantid;
    } 
	
    /**
     * 属性 saleparticipantid 的get方法
     * @return String
     */
    public String getSaleparticipantid(){
        return saleparticipantid;
    }
	
    /**
     * 属性 saleparticipantid 的set方法
     * @return
     */
    public void setSaleparticipantid(String saleparticipantid){
        this.saleparticipantid = saleparticipantid;
    } 
	
    /**
     * 属性 vendeeenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeenergy(){
        return vendeeenergy;
    }
	
    /**
     * 属性 vendeeenergy 的set方法
     * @return
     */
    public void setVendeeenergy(BigDecimal vendeeenergy){
        this.vendeeenergy = vendeeenergy;
    } 
	
    /**
     * 属性 saleenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleenergy(){
        return saleenergy;
    }
	
    /**
     * 属性 saleenergy 的set方法
     * @return
     */
    public void setSaleenergy(BigDecimal saleenergy){
        this.saleenergy = saleenergy;
    } 
	
    /**
     * 属性 thetype 的get方法
     * @return String
     */
    public String getThetype(){
        return thetype;
    }
	
    /**
     * 属性 thetype 的set方法
     * @return
     */
    public void setThetype(String thetype){
        this.thetype = thetype;
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
		
        if (o == null || !(o instanceof DwMarketmembertraderesult))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwMarketmembertraderesult other = (DwMarketmembertraderesult) o;	        
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
            .append("tradeseqid"+":"+getTradeseqid())
            .append("timebrand"+":"+getTimebrand())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("vendeeparticipantid"+":"+getVendeeparticipantid())
            .append("saleparticipantid"+":"+getSaleparticipantid())
            .append("vendeeenergy"+":"+getVendeeenergy())
            .append("saleenergy"+":"+getSaleenergy())
            .append("thetype"+":"+getThetype())
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