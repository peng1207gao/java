package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrSortruleValue的POJO类
 *
 * @author  Administrator  [Sun Sep 01 15:35:11 CST 2013]
 * 
 */
public class TrSortruleValue implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性tradRole
     */
    private BigDecimal tradRole;
	
    /** 
     * 属性factorId
     */
    private String factorId;
	
    /** 
     * 属性factorName
     */
    private String factorName;
	
    /** 
     * 属性no
     */
    private BigDecimal no;
	
    /** 
     * 属性ascOrDesc
     */
    private BigDecimal ascOrDesc;
    
    private String ruleId;
    
    
	
    public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}


	/** 
     * 属性marketId
     */
    private String marketId;
    
    private BigDecimal sortQzRatio;
	
    public BigDecimal getSortQzRatio() {
		return sortQzRatio;
	}

	public void setSortQzRatio(BigDecimal sortQzRatio) {
		this.sortQzRatio = sortQzRatio;
	}

	/**
     * TrSortruleValue构造函数
     */
    public TrSortruleValue() {
        super();
    }  
	
    /**
     * TrSortruleValue完整的构造函数
     */  
    public TrSortruleValue(String id,BigDecimal tradeseqId,BigDecimal tradRole,String factorName,BigDecimal no,BigDecimal ascOrDesc,String marketId){
        this.id = id;
        this.tradeseqId = tradeseqId;
        this.tradRole = tradRole;
        this.factorName = factorName;
        this.no = no;
        this.ascOrDesc = ascOrDesc;
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
     * 属性 tradRole 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradRole(){
        return tradRole;
    }
	
    /**
     * 属性 tradRole 的set方法
     * @return
     */
    public void setTradRole(BigDecimal tradRole){
        this.tradRole = tradRole;
    } 
	
    /**
     * 属性 factorId 的get方法
     * @return String
     */
    public String getFactorId(){
        return factorId;
    }
	
    /**
     * 属性 factorId 的set方法
     * @return
     */
    public void setFactorId(String factorId){
        this.factorId = factorId;
    } 
	
    /**
     * 属性 factorName 的get方法
     * @return String
     */
    public String getFactorName(){
        return factorName;
    }
	
    /**
     * 属性 factorName 的set方法
     * @return
     */
    public void setFactorName(String factorName){
        this.factorName = factorName;
    } 
	
    /**
     * 属性 no 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNo(){
        return no;
    }
	
    /**
     * 属性 no 的set方法
     * @return
     */
    public void setNo(BigDecimal no){
        this.no = no;
    } 
	
    /**
     * 属性 ascOrDesc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAscOrDesc(){
        return ascOrDesc;
    }
	
    /**
     * 属性 ascOrDesc 的set方法
     * @return
     */
    public void setAscOrDesc(BigDecimal ascOrDesc){
        this.ascOrDesc = ascOrDesc;
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
		
        if (o == null || !(o instanceof TrSortruleValue))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrSortruleValue other = (TrSortruleValue) o;	        
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
            .append("tradRole"+":"+getTradRole())
            .append("factorId"+":"+getFactorId())
            .append("factorName"+":"+getFactorName())
            .append("no"+":"+getNo())
            .append("ascOrDesc"+":"+getAscOrDesc())
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