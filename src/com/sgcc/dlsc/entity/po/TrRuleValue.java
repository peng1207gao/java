package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrRuleValue的POJO类
 *
 * @author  Administrator  [Thu Aug 15 09:16:39 CST 2013]
 * 
 */
public class TrRuleValue implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性ruleId
     */
    private String ruleId;
	
    /** 
     * 属性paramName
     */
    private String paramName;
	
    /** 
     * 属性paramType
     */
    private BigDecimal paramType;
	
    /** 
     * 属性paramValue
     */
    private String paramValue;
	
    /** 
     * 属性keyClass
     */
    private String keyClass;
	
    /** 
     * 属性marketId
     */
    private String marketId;
    
    private String paramCode;
	
    /**
     * TrRuleValue构造函数
     */
    public TrRuleValue() {
        super();
    }  
	
    /**
     * TrRuleValue完整的构造函数
     */  
    public TrRuleValue(String id,BigDecimal tradeseqId,String ruleId,String paramName,BigDecimal paramType,String paramValue,String marketId){
        this.id = id;
        this.tradeseqId = tradeseqId;
        this.ruleId = ruleId;
        this.paramName = paramName;
        this.paramType = paramType;
        this.paramValue = paramValue;
        this.marketId = marketId;
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
     * 属性 ruleId 的get方法
     * @return String
     */
    public String getRuleId(){
        return ruleId;
    }
	
    /**
     * 属性 ruleId 的set方法
     * @return
     */
    public void setRuleId(String ruleId){
        this.ruleId = ruleId;
    } 
	
    public String getParamCode() {
		return paramCode;
	}

	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
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
     * 属性 paramType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getParamType(){
        return paramType;
    }
	
    /**
     * 属性 paramType 的set方法
     * @return
     */
    public void setParamType(BigDecimal paramType){
        this.paramType = paramType;
    } 
	
    /**
     * 属性 paramValue 的get方法
     * @return String
     */
    public String getParamValue(){
        return paramValue;
    }
	
    /**
     * 属性 paramValue 的set方法
     * @return
     */
    public void setParamValue(String paramValue){
        this.paramValue = paramValue;
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
		
        if (o == null || !(o instanceof TrRuleValue))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrRuleValue other = (TrRuleValue) o;	        
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
            .append("ruleId"+":"+getRuleId())
            .append("paramName"+":"+getParamName())
            .append("paramType"+":"+getParamType())
            .append("paramValue"+":"+getParamValue())
            .append("keyClass"+":"+getKeyClass())
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