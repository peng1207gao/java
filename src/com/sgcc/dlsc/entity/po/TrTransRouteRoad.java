package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTransRouteRoad的POJO类
 *
 * @author  sss  [Mon Dec 02 10:51:36 CST 2013]
 * 
 */
public class TrTransRouteRoad implements Serializable{

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
     * 属性tielinenetId
     */
    private String tielinenetId;
	
    /** 
     * 属性isPass
     */
    private BigDecimal isPass;
	
    /** 
     * 属性orderNum
     */
    private BigDecimal orderNum;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性isPassTrans
     */
    private BigDecimal isPassTrans;
	
    /**
     * TrTransRouteRoad构造函数
     */
    public TrTransRouteRoad() {
        super();
    }  
	
    /**
     * TrTransRouteRoad完整的构造函数
     */  
    public TrTransRouteRoad(String guid,BigDecimal tradeseqId,BigDecimal routeId,String tielinenetId){
        this.guid = guid;
        this.tradeseqId = tradeseqId;
        this.routeId = routeId;
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
     * 属性 isPass 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsPass(){
        return isPass;
    }
	
    /**
     * 属性 isPass 的set方法
     * @return
     */
    public void setIsPass(BigDecimal isPass){
        this.isPass = isPass;
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
     * 属性 isPassTrans 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsPassTrans(){
        return isPassTrans;
    }
	
    /**
     * 属性 isPassTrans 的set方法
     * @return
     */
    public void setIsPassTrans(BigDecimal isPassTrans){
        this.isPassTrans = isPassTrans;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTransRouteRoad))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrTransRouteRoad other = (TrTransRouteRoad) o;	        
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
            .append("tielinenetId"+":"+getTielinenetId())
            .append("isPass"+":"+getIsPass())
            .append("orderNum"+":"+getOrderNum())
            .append("marketId"+":"+getMarketId())
            .append("isPassTrans"+":"+getIsPassTrans())
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