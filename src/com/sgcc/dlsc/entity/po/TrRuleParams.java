package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrRuleParams的POJO类
 *
 * @author  Administrator  [Thu Aug 15 15:41:42 CST 2013]
 * 
 */
public class TrRuleParams implements Serializable{

    /** 
     * 属性paramName
     */
    private String paramName;
	
    /** 
     * 属性dataType
     */
    private BigDecimal dataType;
	
    /** 
     * 属性keyClass
     */
    private String keyClass;
	
    /** 
     * 属性paramIsautopub
     */
    private BigDecimal paramIsautopub;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeRuleId
     */
    private String tradeRuleId;
	
    /** 
     * 属性paramCode
     */
    private String paramCode;
	
    /**
     * TrRuleParams构造函数
     */
    public TrRuleParams() {
        super();
    }  
	
    /**
     * TrRuleParams完整的构造函数
     */  
    public TrRuleParams(String paramName,BigDecimal dataType,String marketId,String guid,String tradeRuleId){
        this.paramName = paramName;
        this.dataType = dataType;
        this.marketId = marketId;
        this.guid = guid;
        this.tradeRuleId = tradeRuleId;
    }
 
    /**
     * 属性 paramName 的get方法
     * @return String
     */
    public String getParamName(){
        return paramName;
    }
	
    /**
     * 属性 paramName 的set方法
     * @return
     */
    public void setParamName(String paramName){
        this.paramName = paramName;
    } 
	
    /**
     * 属性 dataType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDataType(){
        return dataType;
    }
	
    /**
     * 属性 dataType 的set方法
     * @return
     */
    public void setDataType(BigDecimal dataType){
        this.dataType = dataType;
    } 
	
    /**
     * 属性 keyClass 的get方法
     * @return String
     */
    public String getKeyClass(){
        return keyClass;
    }
	
    /**
     * 属性 keyClass 的set方法
     * @return
     */
    public void setKeyClass(String keyClass){
        this.keyClass = keyClass;
    } 
	
    /**
     * 属性 paramIsautopub 的get方法
     * @return BigDecimal
     */
    public BigDecimal getParamIsautopub(){
        return paramIsautopub;
    }
	
    /**
     * 属性 paramIsautopub 的set方法
     * @return
     */
    public void setParamIsautopub(BigDecimal paramIsautopub){
        this.paramIsautopub = paramIsautopub;
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
     * 属性 tradeRuleId 的get方法
     * @return String
     */
    public String getTradeRuleId(){
        return tradeRuleId;
    }
	
    /**
     * 属性 tradeRuleId 的set方法
     * @return
     */
    public void setTradeRuleId(String tradeRuleId){
        this.tradeRuleId = tradeRuleId;
    } 
	
    /**
     * 属性 paramCode 的get方法
     * @return String
     */
    public String getParamCode(){
        return paramCode;
    }
	
    /**
     * 属性 paramCode 的set方法
     * @return
     */
    public void setParamCode(String paramCode){
        this.paramCode = paramCode;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrRuleParams))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrRuleParams other = (TrRuleParams) o;	        
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
            .append("paramName"+":"+getParamName())
            .append("dataType"+":"+getDataType())
            .append("keyClass"+":"+getKeyClass())
            .append("paramIsautopub"+":"+getParamIsautopub())
            .append("marketId"+":"+getMarketId())
            .append("guid"+":"+getGuid())
            .append("tradeRuleId"+":"+getTradeRuleId())
            .append("paramCode"+":"+getParamCode())
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