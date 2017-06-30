package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeanmtTranscap的POJO类
 *
 * @author  DWJ  [Fri Jun 20 18:20:44 CST 2014]
 * 
 */
public class TrTradeanmtTranscap implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性tradeanmtId
     */
    private String tradeanmtId;
	
    /** 
     * 属性tdxekssj
     */
    private Date tdxekssj;
	
    /** 
     * 属性tdxejssj
     */
    private Date tdxejssj;
	
    /** 
     * 属性xez
     */
    private BigDecimal xez;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性tradeTimepart
     */
    private BigDecimal tradeTimepart;
	
    /**
     * TrTradeanmtTranscap构造函数
     */
    public TrTradeanmtTranscap() {
        super();
    }  
	
    /**
     * TrTradeanmtTranscap完整的构造函数
     */  
    public TrTradeanmtTranscap(String id,BigDecimal tradeseqId,String tradeanmtId,String marketId,BigDecimal tradeTimepart){
        this.id = id;
        this.tradeseqId = tradeseqId;
        this.tradeanmtId = tradeanmtId;
        this.marketId = marketId;
        this.tradeTimepart = tradeTimepart;
    }
 
    /**
     * 属性 id 的get方法
     * @return String
     */
    public String getId(){
        return id;
    }
	
    /**
     * 属性 id 的set方法
     * @return
     */
    public void setId(String id){
        if(id != null && id.trim().length() == 0){
            this.id = null;
        }else{
            this.id = id;
        }
    } 
	
    /**
     * 属性 tradeseqId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradeseqId(){
        return tradeseqId;
    }
	
    /**
     * 属性 tradeseqId 的set方法
     * @return
     */
    public void setTradeseqId(BigDecimal tradeseqId){
        this.tradeseqId = tradeseqId;
    } 
	
    /**
     * 属性 tradeanmtId 的get方法
     * @return String
     */
    public String getTradeanmtId(){
        return tradeanmtId;
    }
	
    /**
     * 属性 tradeanmtId 的set方法
     * @return
     */
    public void setTradeanmtId(String tradeanmtId){
        this.tradeanmtId = tradeanmtId;
    } 
	
    /**
     * 属性 tdxekssj 的get方法
     * @return Date
     */
    public Date getTdxekssj(){
        return tdxekssj;
    }
	
    /**
     * 属性 tdxekssj 的set方法
     * @return
     */
    public void setTdxekssj(Date tdxekssj){
        this.tdxekssj = tdxekssj;
    } 
	
    /**
     * 属性 tdxejssj 的get方法
     * @return Date
     */
    public Date getTdxejssj(){
        return tdxejssj;
    }
	
    /**
     * 属性 tdxejssj 的set方法
     * @return
     */
    public void setTdxejssj(Date tdxejssj){
        this.tdxejssj = tdxejssj;
    } 
	
    /**
     * 属性 xez 的get方法
     * @return BigDecimal
     */
    public BigDecimal getXez(){
        return xez;
    }
	
    /**
     * 属性 xez 的set方法
     * @return
     */
    public void setXez(BigDecimal xez){
        this.xez = xez;
    } 
	
    /**
     * 属性 marketId 的get方法
     * @return String
     */
    public String getMarketId(){
        return marketId;
    }
	
    /**
     * 属性 marketId 的set方法
     * @return
     */
    public void setMarketId(String marketId){
        this.marketId = marketId;
    } 
	
    /**
     * 属性 tradeTimepart 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradeTimepart(){
        return tradeTimepart;
    }
	
    /**
     * 属性 tradeTimepart 的set方法
     * @return
     */
    public void setTradeTimepart(BigDecimal tradeTimepart){
        this.tradeTimepart = tradeTimepart;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTradeanmtTranscap))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrTradeanmtTranscap other = (TrTradeanmtTranscap) o;	        
	    return new EqualsBuilder()
            .append(this.getId(), other.getId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("id"+":"+getId())
            .append("tradeseqId"+":"+getTradeseqId())
            .append("tradeanmtId"+":"+getTradeanmtId())
            .append("tdxekssj"+":"+getTdxekssj())
            .append("tdxejssj"+":"+getTdxejssj())
            .append("xez"+":"+getXez())
            .append("marketId"+":"+getMarketId())
            .append("tradeTimepart"+":"+getTradeTimepart())
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