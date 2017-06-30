package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwTradeseqinfo的POJO类
 *
 * @author  zndw0  [Wed Mar 12 20:24:59 CST 2014]
 * 
 */
public class DwTradeseqinfo implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeseqid
     */
    private BigDecimal tradeseqid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性tradename
     */
    private String tradename;
	
    /** 
     * 属性startdate
     */
    private Date startdate;
	
    /** 
     * 属性enddate
     */
    private Date enddate;
	
    /** 
     * 属性bandnumb
     */
    private BigDecimal bandnumb;
	
    /** 
     * 属性buyerstartdate
     */
    private Date buyerstartdate;
	
    /** 
     * 属性buyerenddate
     */
    private Date buyerenddate;
	
    /** 
     * 属性gencapacity
     */
    private BigDecimal gencapacity;
	
    /** 
     * 属性comsumercapacity
     */
    private BigDecimal comsumercapacity;
	
    /** 
     * 属性consumerrate
     */
    private BigDecimal consumerrate;
	
    /** 
     * 属性tradetypeid
     */
    private String tradetypeid;
	
    /** 
     * 属性sellerstartdate
     */
    private Date sellerstartdate;
	
    /** 
     * 属性sellerenddate
     */
    private Date sellerenddate;
	
    /**
     * DwTradeseqinfo构造函数
     */
    public DwTradeseqinfo() {
        super();
    }  
	
    /**
     * DwTradeseqinfo完整的构造函数
     */  
    public DwTradeseqinfo(String guid,BigDecimal tradeseqid,String marketid){
        this.guid = guid;
        this.tradeseqid = tradeseqid;
        this.marketid = marketid;
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
     * @return BigDecimal
     */
    public BigDecimal getTradeseqid(){
        return tradeseqid;
    }
	
    /**
     * 属性 tradeseqid 的set方法
     * @return
     */
    public void setTradeseqid(BigDecimal tradeseqid){
        this.tradeseqid = tradeseqid;
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
     * 属性 tradename 的get方法
     * @return String
     */
    public String getTradename(){
        return tradename;
    }
	
    /**
     * 属性 tradename 的set方法
     * @return
     */
    public void setTradename(String tradename){
        this.tradename = tradename;
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
     * 属性 bandnumb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBandnumb(){
        return bandnumb;
    }
	
    /**
     * 属性 bandnumb 的set方法
     * @return
     */
    public void setBandnumb(BigDecimal bandnumb){
        this.bandnumb = bandnumb;
    } 
	
    /**
     * 属性 buyerstartdate 的get方法
     * @return Date
     */
    public Date getBuyerstartdate(){
        return buyerstartdate;
    }
	
    /**
     * 属性 buyerstartdate 的set方法
     * @return
     */
    public void setBuyerstartdate(Date buyerstartdate){
        this.buyerstartdate = buyerstartdate;
    } 
	
    /**
     * 属性 buyerenddate 的get方法
     * @return Date
     */
    public Date getBuyerenddate(){
        return buyerenddate;
    }
	
    /**
     * 属性 buyerenddate 的set方法
     * @return
     */
    public void setBuyerenddate(Date buyerenddate){
        this.buyerenddate = buyerenddate;
    } 
	
    /**
     * 属性 gencapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGencapacity(){
        return gencapacity;
    }
	
    /**
     * 属性 gencapacity 的set方法
     * @return
     */
    public void setGencapacity(BigDecimal gencapacity){
        this.gencapacity = gencapacity;
    } 
	
    /**
     * 属性 comsumercapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getComsumercapacity(){
        return comsumercapacity;
    }
	
    /**
     * 属性 comsumercapacity 的set方法
     * @return
     */
    public void setComsumercapacity(BigDecimal comsumercapacity){
        this.comsumercapacity = comsumercapacity;
    } 
	
    /**
     * 属性 consumerrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getConsumerrate(){
        return consumerrate;
    }
	
    /**
     * 属性 consumerrate 的set方法
     * @return
     */
    public void setConsumerrate(BigDecimal consumerrate){
        this.consumerrate = consumerrate;
    } 
	
    /**
     * 属性 tradetypeid 的get方法
     * @return String
     */
    public String getTradetypeid(){
        return tradetypeid;
    }
	
    /**
     * 属性 tradetypeid 的set方法
     * @return
     */
    public void setTradetypeid(String tradetypeid){
        this.tradetypeid = tradetypeid;
    } 
	
    /**
     * 属性 sellerstartdate 的get方法
     * @return Date
     */
    public Date getSellerstartdate(){
        return sellerstartdate;
    }
	
    /**
     * 属性 sellerstartdate 的set方法
     * @return
     */
    public void setSellerstartdate(Date sellerstartdate){
        this.sellerstartdate = sellerstartdate;
    } 
	
    /**
     * 属性 sellerenddate 的get方法
     * @return Date
     */
    public Date getSellerenddate(){
        return sellerenddate;
    }
	
    /**
     * 属性 sellerenddate 的set方法
     * @return
     */
    public void setSellerenddate(Date sellerenddate){
        this.sellerenddate = sellerenddate;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwTradeseqinfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwTradeseqinfo other = (DwTradeseqinfo) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("tradename"+":"+getTradename())
            .append("startdate"+":"+getStartdate())
            .append("enddate"+":"+getEnddate())
            .append("bandnumb"+":"+getBandnumb())
            .append("buyerstartdate"+":"+getBuyerstartdate())
            .append("buyerenddate"+":"+getBuyerenddate())
            .append("gencapacity"+":"+getGencapacity())
            .append("comsumercapacity"+":"+getComsumercapacity())
            .append("consumerrate"+":"+getConsumerrate())
            .append("tradetypeid"+":"+getTradetypeid())
            .append("sellerstartdate"+":"+getSellerstartdate())
            .append("sellerenddate"+":"+getSellerenddate())
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