package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTransNetlossPrice的POJO类
 *
 * @author  sss  [Mon Nov 11 16:18:53 CST 2013]
 * 
 */
public class TrTransNetlossPrice implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性typeId
     */
    private BigDecimal typeId;
	
    /** 
     * 属性tielinenetId
     */
    private String tielinenetId;
	
    /** 
     * 属性orderNum
     */
    private BigDecimal orderNum;
	
    /** 
     * 属性netlossRatio
     */
    private BigDecimal netlossRatio;
	
    /** 
     * 属性netlossRatioPrice
     */
    private BigDecimal netlossRatioPrice;
	
    /** 
     * 属性transmitPrice
     */
    private BigDecimal transmitPrice;
	
    /** 
     * 属性defaultI1
     */
    private BigDecimal defaultI1;
	
    /** 
     * 属性defaultI2
     */
    private BigDecimal defaultI2;
	
    /** 
     * 属性defaultF1
     */
    private BigDecimal defaultF1;
	
    /** 
     * 属性defaultF2
     */
    private BigDecimal defaultF2;
	
    /** 
     * 属性defaultUc1
     */
    private String defaultUc1;
	
    /** 
     * 属性defaultUc2
     */
    private String defaultUc2;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * TrTransNetlossPrice构造函数
     */
    public TrTransNetlossPrice() {
        super();
    }  
	
    /**
     * TrTransNetlossPrice完整的构造函数
     */  
    public TrTransNetlossPrice(String guid,BigDecimal tradeseqId,BigDecimal typeId,String tielinenetId){
        this.guid = guid;
        this.tradeseqId = tradeseqId;
        this.typeId = typeId;
        this.tielinenetId = tielinenetId;
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
     * 属性 typeId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTypeId(){
        return typeId;
    }
	
    /**
     * 属性 typeId 的set方法
     * @return
     */
    public void setTypeId(BigDecimal typeId){
        this.typeId = typeId;
    } 
	
	
	
    /**
     * 属性 tielinenetId 的get方法
     * @return String
     */
    public String getTielinenetId(){
        return tielinenetId;
    }
	
    /**
     * 属性 tielinenetId 的set方法
     * @return
     */
    public void setTielinenetId(String tielinenetId){
        this.tielinenetId = tielinenetId;
    } 
	
	
	
    /**
     * 属性 orderNum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOrderNum(){
        return orderNum;
    }
	
    /**
     * 属性 orderNum 的set方法
     * @return
     */
    public void setOrderNum(BigDecimal orderNum){
        this.orderNum = orderNum;
    } 
	
	
	
    /**
     * 属性 netlossRatio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetlossRatio(){
        return netlossRatio;
    }
	
    /**
     * 属性 netlossRatio 的set方法
     * @return
     */
    public void setNetlossRatio(BigDecimal netlossRatio){
        this.netlossRatio = netlossRatio;
    } 
	
	
	
    /**
     * 属性 netlossRatioPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetlossRatioPrice(){
        return netlossRatioPrice;
    }
	
    /**
     * 属性 netlossRatioPrice 的set方法
     * @return
     */
    public void setNetlossRatioPrice(BigDecimal netlossRatioPrice){
        this.netlossRatioPrice = netlossRatioPrice;
    } 
	
	
	
    /**
     * 属性 transmitPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTransmitPrice(){
        return transmitPrice;
    }
	
    /**
     * 属性 transmitPrice 的set方法
     * @return
     */
    public void setTransmitPrice(BigDecimal transmitPrice){
        this.transmitPrice = transmitPrice;
    } 
	
	
	
    /**
     * 属性 defaultI1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDefaultI1(){
        return defaultI1;
    }
	
    /**
     * 属性 defaultI1 的set方法
     * @return
     */
    public void setDefaultI1(BigDecimal defaultI1){
        this.defaultI1 = defaultI1;
    } 
	
	
	
    /**
     * 属性 defaultI2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDefaultI2(){
        return defaultI2;
    }
	
    /**
     * 属性 defaultI2 的set方法
     * @return
     */
    public void setDefaultI2(BigDecimal defaultI2){
        this.defaultI2 = defaultI2;
    } 
	
	
	
    /**
     * 属性 defaultF1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDefaultF1(){
        return defaultF1;
    }
	
    /**
     * 属性 defaultF1 的set方法
     * @return
     */
    public void setDefaultF1(BigDecimal defaultF1){
        this.defaultF1 = defaultF1;
    } 
	
	
	
    /**
     * 属性 defaultF2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDefaultF2(){
        return defaultF2;
    }
	
    /**
     * 属性 defaultF2 的set方法
     * @return
     */
    public void setDefaultF2(BigDecimal defaultF2){
        this.defaultF2 = defaultF2;
    } 
	
	
	
    /**
     * 属性 defaultUc1 的get方法
     * @return String
     */
    public String getDefaultUc1(){
        return defaultUc1;
    }
	
    /**
     * 属性 defaultUc1 的set方法
     * @return
     */
    public void setDefaultUc1(String defaultUc1){
        this.defaultUc1 = defaultUc1;
    } 
	
	
	
    /**
     * 属性 defaultUc2 的get方法
     * @return String
     */
    public String getDefaultUc2(){
        return defaultUc2;
    }
	
    /**
     * 属性 defaultUc2 的set方法
     * @return
     */
    public void setDefaultUc2(String defaultUc2){
        this.defaultUc2 = defaultUc2;
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
		
        if (o == null || !(o instanceof TrTransNetlossPrice))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrTransNetlossPrice other = (TrTransNetlossPrice) o;	        
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
            .append("tradeseqId"+":"+getTradeseqId())
            .append("typeId"+":"+getTypeId())
            .append("tielinenetId"+":"+getTielinenetId())
            .append("orderNum"+":"+getOrderNum())
            .append("netlossRatio"+":"+getNetlossRatio())
            .append("netlossRatioPrice"+":"+getNetlossRatioPrice())
            .append("transmitPrice"+":"+getTransmitPrice())
            .append("defaultI1"+":"+getDefaultI1())
            .append("defaultI2"+":"+getDefaultI2())
            .append("defaultF1"+":"+getDefaultF1())
            .append("defaultF2"+":"+getDefaultF2())
            .append("defaultUc1"+":"+getDefaultUc1())
            .append("defaultUc2"+":"+getDefaultUc2())
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