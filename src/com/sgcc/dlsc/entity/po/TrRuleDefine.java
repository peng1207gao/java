package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrRuleDefine的POJO类
 *
 * @author  Administrator  [Fri Aug 16 15:33:35 CST 2013]
 * 
 */
public class TrRuleDefine implements Serializable{

    /** 
     * 属性tradeRuleId
     */
    private String tradeRuleId;
	
    /** 
     * 属性tradeRuleName
     */
    private String tradeRuleName;
	
    /** 
     * 属性tradeRuleCode
     */
    private String tradeRuleCode;
	
    /** 
     * 属性tradeRuleType
     */
    private BigDecimal tradeRuleType;
	
    /** 
     * 属性tradeRuleRole
     */
    private BigDecimal tradeRuleRole;
	
    /** 
     * 属性regDate
     */
    private Date regDate;
	
    /** 
     * 属性regPerson
     */
    private String regPerson;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性logicDesc
     */
    private String logicDesc;
	
    /**
     * TrRuleDefine构造函数
     */
    public TrRuleDefine() {
        super();
    }  
	
    /**
     * TrRuleDefine完整的构造函数
     */  
    public TrRuleDefine(String tradeRuleId,String tradeRuleName,String tradeRuleCode,BigDecimal tradeRuleType,BigDecimal tradeRuleRole,String marketId){
        this.tradeRuleId = tradeRuleId;
        this.tradeRuleName = tradeRuleName;
        this.tradeRuleCode = tradeRuleCode;
        this.tradeRuleType = tradeRuleType;
        this.tradeRuleRole = tradeRuleRole;
        this.marketId = marketId;
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
        if(tradeRuleId != null && tradeRuleId.trim().length() == 0){
            this.tradeRuleId = null;
        }else{
            this.tradeRuleId = tradeRuleId;
        }
    } 
	
    /**
     * 属性 tradeRuleName 的get方法
     * @return String
     */
    public String getTradeRuleName(){
        return tradeRuleName;
    }
	
    /**
     * 属性 tradeRuleName 的set方法
     * @return
     */
    public void setTradeRuleName(String tradeRuleName){
        this.tradeRuleName = tradeRuleName;
    } 
	
    /**
     * 属性 tradeRuleCode 的get方法
     * @return String
     */
    public String getTradeRuleCode(){
        return tradeRuleCode;
    }
	
    /**
     * 属性 tradeRuleCode 的set方法
     * @return
     */
    public void setTradeRuleCode(String tradeRuleCode){
        this.tradeRuleCode = tradeRuleCode;
    } 
	
    /**
     * 属性 tradeRuleType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradeRuleType(){
        return tradeRuleType;
    }
	
    /**
     * 属性 tradeRuleType 的set方法
     * @return
     */
    public void setTradeRuleType(BigDecimal tradeRuleType){
        this.tradeRuleType = tradeRuleType;
    } 
	
    /**
     * 属性 tradeRuleRole 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradeRuleRole(){
        return tradeRuleRole;
    }
	
    /**
     * 属性 tradeRuleRole 的set方法
     * @return
     */
    public void setTradeRuleRole(BigDecimal tradeRuleRole){
        this.tradeRuleRole = tradeRuleRole;
    } 
	
    /**
     * 属性 regDate 的get方法
     * @return Date
     */
    public Date getRegDate(){
        return regDate;
    }
	
    /**
     * 属性 regDate 的set方法
     * @return
     */
    public void setRegDate(Date regDate){
        this.regDate = regDate;
    } 
	
    /**
     * 属性 regPerson 的get方法
     * @return String
     */
    public String getRegPerson(){
        return regPerson;
    }
	
    /**
     * 属性 regPerson 的set方法
     * @return
     */
    public void setRegPerson(String regPerson){
        this.regPerson = regPerson;
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
     * 属性 logicDesc 的get方法
     * @return String
     */
    public String getLogicDesc(){
        return logicDesc;
    }
	
    /**
     * 属性 logicDesc 的set方法
     * @return
     */
    public void setLogicDesc(String logicDesc){
        this.logicDesc = logicDesc;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrRuleDefine))
	        return false; 
			
        if(getTradeRuleId() == null) 
	        return false;

        TrRuleDefine other = (TrRuleDefine) o;	        
	    return new EqualsBuilder()
            .append(this.getTradeRuleId(), other.getTradeRuleId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("tradeRuleId"+":"+getTradeRuleId())
            .append("tradeRuleName"+":"+getTradeRuleName())
            .append("tradeRuleCode"+":"+getTradeRuleCode())
            .append("tradeRuleType"+":"+getTradeRuleType())
            .append("tradeRuleRole"+":"+getTradeRuleRole())
            .append("regDate"+":"+getRegDate())
            .append("regPerson"+":"+getRegPerson())
            .append("marketId"+":"+getMarketId())
            .append("logicDesc"+":"+getLogicDesc())
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