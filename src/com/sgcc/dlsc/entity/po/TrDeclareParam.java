package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrDeclareParam的POJO类
 *
 * @author  DWJ  [Fri May 16 15:13:19 CST 2014]
 * 
 */
public class TrDeclareParam implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性tradeunitId
     */
    private String tradeunitId;
	
    /** 
     * 属性participantcode
     */
    private String participantcode;
	
    /** 
     * 属性tradeRole
     */
    private BigDecimal tradeRole;
	
    /** 
     * 属性isVhvAbet
     */
    private BigDecimal isVhvAbet;
	
    /** 
     * 属性isColdbyair
     */
    private BigDecimal isColdbyair;
	
    /** 
     * 属性isConsumptionLowess
     */
    private BigDecimal isConsumptionLowess;
	
    /** 
     * 属性desulfuratedRate
     */
    private BigDecimal desulfuratedRate;
	
    /** 
     * 属性desaltRate
     */
    private BigDecimal desaltRate;
	
    /** 
     * 属性popedomCoefficient
     */
    private BigDecimal popedomCoefficient;
	
    /** 
     * 属性capCoefficient
     */
    private BigDecimal capCoefficient;
	
    /** 
     * 属性desulfuratedCoefficient
     */
    private BigDecimal desulfuratedCoefficient;
	
    /** 
     * 属性desaltCoefficient
     */
    private BigDecimal desaltCoefficient;
	
    /** 
     * 属性coldbyairCoefficient
     */
    private BigDecimal coldbyairCoefficient;
	
    /** 
     * 属性comprehensiveCoefficient
     */
    private BigDecimal comprehensiveCoefficient;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性declareTime
     */
    private Date declareTime;
	
    /** 
     * 属性calculatedTime
     */
    private Date calculatedTime;
	
    /**
     * TrDeclareParam构造函数
     */
    public TrDeclareParam() {
        super();
    }  
	
    /**
     * TrDeclareParam完整的构造函数
     */  
    public TrDeclareParam(String guid){
        this.guid = guid;
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
     * 属性 tradeunitId 的get方法
     * @return String
     */
    public String getTradeunitId(){
        return tradeunitId;
    }
	
    /**
     * 属性 tradeunitId 的set方法
     * @return
     */
    public void setTradeunitId(String tradeunitId){
        this.tradeunitId = tradeunitId;
    } 
	
    /**
     * 属性 participantcode 的get方法
     * @return String
     */
    public String getParticipantcode(){
        return participantcode;
    }
	
    /**
     * 属性 participantcode 的set方法
     * @return
     */
    public void setParticipantcode(String participantcode){
        this.participantcode = participantcode;
    } 
	
    /**
     * 属性 tradeRole 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradeRole(){
        return tradeRole;
    }
	
    /**
     * 属性 tradeRole 的set方法
     * @return
     */
    public void setTradeRole(BigDecimal tradeRole){
        this.tradeRole = tradeRole;
    } 
	
    /**
     * 属性 isVhvAbet 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsVhvAbet(){
        return isVhvAbet;
    }
	
    /**
     * 属性 isVhvAbet 的set方法
     * @return
     */
    public void setIsVhvAbet(BigDecimal isVhvAbet){
        this.isVhvAbet = isVhvAbet;
    } 
	
    /**
     * 属性 isColdbyair 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsColdbyair(){
        return isColdbyair;
    }
	
    /**
     * 属性 isColdbyair 的set方法
     * @return
     */
    public void setIsColdbyair(BigDecimal isColdbyair){
        this.isColdbyair = isColdbyair;
    } 
	
    /**
     * 属性 isConsumptionLowess 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsConsumptionLowess(){
        return isConsumptionLowess;
    }
	
    /**
     * 属性 isConsumptionLowess 的set方法
     * @return
     */
    public void setIsConsumptionLowess(BigDecimal isConsumptionLowess){
        this.isConsumptionLowess = isConsumptionLowess;
    } 
	
    /**
     * 属性 desulfuratedRate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDesulfuratedRate(){
        return desulfuratedRate;
    }
	
    /**
     * 属性 desulfuratedRate 的set方法
     * @return
     */
    public void setDesulfuratedRate(BigDecimal desulfuratedRate){
        this.desulfuratedRate = desulfuratedRate;
    } 
	
    /**
     * 属性 desaltRate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDesaltRate(){
        return desaltRate;
    }
	
    /**
     * 属性 desaltRate 的set方法
     * @return
     */
    public void setDesaltRate(BigDecimal desaltRate){
        this.desaltRate = desaltRate;
    } 
	
    /**
     * 属性 popedomCoefficient 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPopedomCoefficient(){
        return popedomCoefficient;
    }
	
    /**
     * 属性 popedomCoefficient 的set方法
     * @return
     */
    public void setPopedomCoefficient(BigDecimal popedomCoefficient){
        this.popedomCoefficient = popedomCoefficient;
    } 
	
    /**
     * 属性 capCoefficient 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapCoefficient(){
        return capCoefficient;
    }
	
    /**
     * 属性 capCoefficient 的set方法
     * @return
     */
    public void setCapCoefficient(BigDecimal capCoefficient){
        this.capCoefficient = capCoefficient;
    } 
	
    /**
     * 属性 desulfuratedCoefficient 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDesulfuratedCoefficient(){
        return desulfuratedCoefficient;
    }
	
    /**
     * 属性 desulfuratedCoefficient 的set方法
     * @return
     */
    public void setDesulfuratedCoefficient(BigDecimal desulfuratedCoefficient){
        this.desulfuratedCoefficient = desulfuratedCoefficient;
    } 
	
    /**
     * 属性 desaltCoefficient 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDesaltCoefficient(){
        return desaltCoefficient;
    }
	
    /**
     * 属性 desaltCoefficient 的set方法
     * @return
     */
    public void setDesaltCoefficient(BigDecimal desaltCoefficient){
        this.desaltCoefficient = desaltCoefficient;
    } 
	
    /**
     * 属性 coldbyairCoefficient 的get方法
     * @return BigDecimal
     */
    public BigDecimal getColdbyairCoefficient(){
        return coldbyairCoefficient;
    }
	
    /**
     * 属性 coldbyairCoefficient 的set方法
     * @return
     */
    public void setColdbyairCoefficient(BigDecimal coldbyairCoefficient){
        this.coldbyairCoefficient = coldbyairCoefficient;
    } 
	
    /**
     * 属性 comprehensiveCoefficient 的get方法
     * @return BigDecimal
     */
    public BigDecimal getComprehensiveCoefficient(){
        return comprehensiveCoefficient;
    }
	
    /**
     * 属性 comprehensiveCoefficient 的set方法
     * @return
     */
    public void setComprehensiveCoefficient(BigDecimal comprehensiveCoefficient){
        this.comprehensiveCoefficient = comprehensiveCoefficient;
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
     * 属性 declareTime 的get方法
     * @return Date
     */
    public Date getDeclareTime(){
        return declareTime;
    }
	
    /**
     * 属性 declareTime 的set方法
     * @return
     */
    public void setDeclareTime(Date declareTime){
        this.declareTime = declareTime;
    } 
	
    /**
     * 属性 calculatedTime 的get方法
     * @return Date
     */
    public Date getCalculatedTime(){
        return calculatedTime;
    }
	
    /**
     * 属性 calculatedTime 的set方法
     * @return
     */
    public void setCalculatedTime(Date calculatedTime){
        this.calculatedTime = calculatedTime;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrDeclareParam))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrDeclareParam other = (TrDeclareParam) o;	        
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
            .append("tradeunitId"+":"+getTradeunitId())
            .append("participantcode"+":"+getParticipantcode())
            .append("tradeRole"+":"+getTradeRole())
            .append("isVhvAbet"+":"+getIsVhvAbet())
            .append("isColdbyair"+":"+getIsColdbyair())
            .append("isConsumptionLowess"+":"+getIsConsumptionLowess())
            .append("desulfuratedRate"+":"+getDesulfuratedRate())
            .append("desaltRate"+":"+getDesaltRate())
            .append("popedomCoefficient"+":"+getPopedomCoefficient())
            .append("capCoefficient"+":"+getCapCoefficient())
            .append("desulfuratedCoefficient"+":"+getDesulfuratedCoefficient())
            .append("desaltCoefficient"+":"+getDesaltCoefficient())
            .append("coldbyairCoefficient"+":"+getColdbyairCoefficient())
            .append("comprehensiveCoefficient"+":"+getComprehensiveCoefficient())
            .append("marketId"+":"+getMarketId())
            .append("declareTime"+":"+getDeclareTime())
            .append("calculatedTime"+":"+getCalculatedTime())
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