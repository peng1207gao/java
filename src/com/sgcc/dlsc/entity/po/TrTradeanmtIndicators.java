package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeanmtIndicators的POJO类
 *
 * @author  DWJ  [Fri Jun 20 18:18:03 CST 2014]
 * 
 */
public class TrTradeanmtIndicators implements Serializable{

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
     * 属性jydyId
     */
    private String jydyId;
	
    /** 
     * 属性peakElc
     */
    private BigDecimal peakElc;
	
    /** 
     * 属性valleyElc
     */
    private BigDecimal valleyElc;
	
    /** 
     * 属性averageElc
     */
    private BigDecimal averageElc;
	
    /** 
     * 属性power
     */
    private BigDecimal power;
	
    /** 
     * 属性tdssnl
     */
    private BigDecimal tdssnl;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性tradeTimepart
     */
    private BigDecimal tradeTimepart;
    
    /** 
     * 属性salePrice
     */
    private BigDecimal salePrice;
    
    /** 
     * 属性vendeePrice
     */
    private BigDecimal vendeePrice;
	
    /**
     * TrTradeanmtIndicators构造函数
     */
    public TrTradeanmtIndicators() {
        super();
    }  
	
    /**
     * TrTradeanmtIndicators完整的构造函数
     */  
    public TrTradeanmtIndicators(String id,BigDecimal tradeseqId,String tradeanmtId,String jydyId,String marketId,BigDecimal tradeTimepart,BigDecimal salePrice,BigDecimal vendeePrice){
        this.id = id;
        this.tradeseqId = tradeseqId;
        this.tradeanmtId = tradeanmtId;
        this.jydyId = jydyId;
        this.marketId = marketId;
        this.tradeTimepart = tradeTimepart;
        this.salePrice=salePrice;
        this.vendeePrice=vendeePrice;
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
     * 属性 jydyId 的get方法
     * @return String
     */
    public String getJydyId(){
        return jydyId;
    }
	
    /**
     * 属性 jydyId 的set方法
     * @return
     */
    public void setJydyId(String jydyId){
        this.jydyId = jydyId;
    } 
	
    /**
     * 属性 peakElc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPeakElc(){
        return peakElc;
    }
	
    /**
     * 属性 peakElc 的set方法
     * @return
     */
    public void setPeakElc(BigDecimal peakElc){
        this.peakElc = peakElc;
    } 
	
    /**
     * 属性 valleyElc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getValleyElc(){
        return valleyElc;
    }
	
    /**
     * 属性 valleyElc 的set方法
     * @return
     */
    public void setValleyElc(BigDecimal valleyElc){
        this.valleyElc = valleyElc;
    } 
	
    /**
     * 属性 averageElc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAverageElc(){
        return averageElc;
    }
	
    /**
     * 属性 averageElc 的set方法
     * @return
     */
    public void setAverageElc(BigDecimal averageElc){
        this.averageElc = averageElc;
    } 
	
    /**
     * 属性 power 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPower(){
        return power;
    }
	
    /**
     * 属性 power 的set方法
     * @return
     */
    public void setPower(BigDecimal power){
        this.power = power;
    } 
	
    /**
     * 属性 tdssnl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTdssnl(){
        return tdssnl;
    }
	
    /**
     * 属性 tdssnl 的set方法
     * @return
     */
    public void setTdssnl(BigDecimal tdssnl){
        this.tdssnl = tdssnl;
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
    
    public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public BigDecimal getVendeePrice() {
		return vendeePrice;
	}

	public void setVendeePrice(BigDecimal vendeePrice) {
		this.vendeePrice = vendeePrice;
	}

	/**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTradeanmtIndicators))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrTradeanmtIndicators other = (TrTradeanmtIndicators) o;	        
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
            .append("jydyId"+":"+getJydyId())
            .append("peakElc"+":"+getPeakElc())
            .append("valleyElc"+":"+getValleyElc())
            .append("averageElc"+":"+getAverageElc())
            .append("power"+":"+getPower())
            .append("tdssnl"+":"+getTdssnl())
            .append("marketId"+":"+getMarketId())
            .append("tradeTimepart"+":"+getTradeTimepart())
            .append("salePrice"+":"+getSalePrice())
            .append("vendeePrice"+":"+getVendeePrice())
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