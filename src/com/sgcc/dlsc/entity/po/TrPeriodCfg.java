package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrPeriodCfg的POJO类
 *
 * @author  Administrator  [Fri Jan 24 08:45:27 CST 2014]
 * 
 */
public class TrPeriodCfg implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性tradeTimepart
     */
    private BigDecimal tradeTimepart;
	
    /** 
     * 属性starttime
     */
    private Date starttime;
	
    /** 
     * 属性endtime
     */
    private Date endtime;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * TrPeriodCfg构造函数
     */
    public TrPeriodCfg() {
        super();
    }  
	
    /**
     * TrPeriodCfg完整的构造函数
     */  
    public TrPeriodCfg(String id,BigDecimal tradeseqId,BigDecimal tradeTimepart){
        this.id = id;
        this.tradeseqId = tradeseqId;
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
     * 属性 starttime 的get方法
     * @return Date
     */
    public Date getStarttime(){
        return starttime;
    }
	
    /**
     * 属性 starttime 的set方法
     * @return
     */
    public void setStarttime(Date starttime){
        this.starttime = starttime;
    } 
	
    /**
     * 属性 endtime 的get方法
     * @return Date
     */
    public Date getEndtime(){
        return endtime;
    }
	
    /**
     * 属性 endtime 的set方法
     * @return
     */
    public void setEndtime(Date endtime){
        this.endtime = endtime;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrPeriodCfg))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrPeriodCfg other = (TrPeriodCfg) o;	        
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
            .append("tradeTimepart"+":"+getTradeTimepart())
            .append("starttime"+":"+getStarttime())
            .append("endtime"+":"+getEndtime())
            .append("marketId"+":"+getMarketId())
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