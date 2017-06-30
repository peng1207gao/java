package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwReportmarketmember的POJO类
 *
 * @author  zndw0  [Fri Mar 14 11:20:38 CST 2014]
 * 
 */
public class DwReportmarketmember implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeseqid
     */
    private String tradeseqid;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
    /** 
     * 属性busiunitid
     */
    private String busiunitid;
	
    /** 
     * 属性startdate
     */
    private Date startdate;
	
    /** 
     * 属性enddate
     */
    private Date enddate;
	
    /** 
     * 属性tradbrandnum
     */
    private BigDecimal tradbrandnum;
	
    /** 
     * 属性reportbrandnumb
     */
    private BigDecimal reportbrandnumb;
	
    /** 
     * 属性thetype
     */
    private String thetype;
	
    /** 
     * 属性elecquantity
     */
    private BigDecimal elecquantity;
	
    /** 
     * 属性price
     */
    private BigDecimal price;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性intervalnum
     */
    private BigDecimal intervalnum;
	
    /**
     * DwReportmarketmember构造函数
     */
    public DwReportmarketmember() {
        super();
    }  
	
    /**
     * DwReportmarketmember完整的构造函数
     */  
    public DwReportmarketmember(String guid){
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
     * 属性 busiunitid 的get方法
     * @return String
     */
    public String getBusiunitid(){
        return busiunitid;
    }
	
    /**
     * 属性 busiunitid 的set方法
     * @return
     */
    public void setBusiunitid(String busiunitid){
        this.busiunitid = busiunitid;
    } 
	
    /**
     * 属性 startdate 的get方法
     * @return Date
     */
    public Date getStartdate(){
        return startdate;
    }
	
    /**
     * 属性 startdate 的set方法
     * @return
     */
    public void setStartdate(Date startdate){
        this.startdate = startdate;
    } 
	
    /**
     * 属性 enddate 的get方法
     * @return Date
     */
    public Date getEnddate(){
        return enddate;
    }
	
    /**
     * 属性 enddate 的set方法
     * @return
     */
    public void setEnddate(Date enddate){
        this.enddate = enddate;
    } 
	
    /**
     * 属性 tradbrandnum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradbrandnum(){
        return tradbrandnum;
    }
	
    /**
     * 属性 tradbrandnum 的set方法
     * @return
     */
    public void setTradbrandnum(BigDecimal tradbrandnum){
        this.tradbrandnum = tradbrandnum;
    } 
	
    /**
     * 属性 reportbrandnumb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getReportbrandnumb(){
        return reportbrandnumb;
    }
	
    /**
     * 属性 reportbrandnumb 的set方法
     * @return
     */
    public void setReportbrandnumb(BigDecimal reportbrandnumb){
        this.reportbrandnumb = reportbrandnumb;
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
     * 属性 elecquantity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElecquantity(){
        return elecquantity;
    }
	
    /**
     * 属性 elecquantity 的set方法
     * @return
     */
    public void setElecquantity(BigDecimal elecquantity){
        this.elecquantity = elecquantity;
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
     * 属性 intervalnum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIntervalnum(){
        return intervalnum;
    }
	
    /**
     * 属性 intervalnum 的set方法
     * @return
     */
    public void setIntervalnum(BigDecimal intervalnum){
        this.intervalnum = intervalnum;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwReportmarketmember))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwReportmarketmember other = (DwReportmarketmember) o;	        
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
            .append("participantid"+":"+getParticipantid())
            .append("busiunitid"+":"+getBusiunitid())
            .append("startdate"+":"+getStartdate())
            .append("enddate"+":"+getEnddate())
            .append("tradbrandnum"+":"+getTradbrandnum())
            .append("reportbrandnumb"+":"+getReportbrandnumb())
            .append("thetype"+":"+getThetype())
            .append("elecquantity"+":"+getElecquantity())
            .append("price"+":"+getPrice())
            .append("marketid"+":"+getMarketid())
            .append("intervalnum"+":"+getIntervalnum())
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