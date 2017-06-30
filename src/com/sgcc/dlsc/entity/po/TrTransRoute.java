package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTransRoute的POJO类
 *
 * @author  zhen  [Mon Nov 11 14:48:38 CST 2013]
 * 
 */
public class TrTransRoute implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性routeId
     */
    private BigDecimal routeId;
	
    /** 
     * 属性routeName
     */
    private String routeName;
	
    /** 
     * 属性startgateid
     */
    private String startgateid;
	
    /** 
     * 属性endgateid
     */
    private String endgateid;
	
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
     * TrTransRoute构造函数
     */
    public TrTransRoute() {
        super();
    }  
	
    /**
     * TrTransRoute完整的构造函数
     */  
    public TrTransRoute(String guid,BigDecimal tradeseqId,BigDecimal routeId,String routeName,String startgateid,String endgateid){
        this.guid = guid;
        this.tradeseqId = tradeseqId;
        this.routeId = routeId;
        this.routeName = routeName;
        this.startgateid = startgateid;
        this.endgateid = endgateid;
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
     * 属性 routeId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRouteId(){
        return routeId;
    }
	
    /**
     * 属性 routeId 的set方法
     * @return
     */
    public void setRouteId(BigDecimal routeId){
        this.routeId = routeId;
    } 
	
    /**
     * 属性 routeName 的get方法
     * @return String
     */
    public String getRouteName(){
        return routeName;
    }
	
    /**
     * 属性 routeName 的set方法
     * @return
     */
    public void setRouteName(String routeName){
        this.routeName = routeName;
    } 
	
    /**
     * 属性 startgateid 的get方法
     * @return String
     */
    public String getStartgateid(){
        return startgateid;
    }
	
    /**
     * 属性 startgateid 的set方法
     * @return
     */
    public void setStartgateid(String startgateid){
        this.startgateid = startgateid;
    } 
	
    /**
     * 属性 endgateid 的get方法
     * @return String
     */
    public String getEndgateid(){
        return endgateid;
    }
	
    /**
     * 属性 endgateid 的set方法
     * @return
     */
    public void setEndgateid(String endgateid){
        this.endgateid = endgateid;
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
		
        if (o == null || !(o instanceof TrTransRoute))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrTransRoute other = (TrTransRoute) o;	        
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
            .append("routeId"+":"+getRouteId())
            .append("routeName"+":"+getRouteName())
            .append("startgateid"+":"+getStartgateid())
            .append("endgateid"+":"+getEndgateid())
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