package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrCoefficientConfig的POJO类
 *
 * @author  DWJ  [Fri Jul 04 09:33:31 CST 2014]
 * 
 */
public class TrCoefficientConfig implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性paramTypeCode
     */
    private String paramTypeCode;
	
    /** 
     * 属性paramName
     */
    private String paramName;
	
    /** 
     * 属性paramCode
     */
    private String paramCode;
	
    /** 
     * 属性paramValue
     */
    private BigDecimal paramValue;
	
    /** 
     * 属性bakNum1
     */
    private BigDecimal bakNum1;
	
    /** 
     * 属性bakNum2
     */
    private BigDecimal bakNum2;
	
    /** 
     * 属性bakNum3
     */
    private BigDecimal bakNum3;
	
    /** 
     * 属性bakNum4
     */
    private BigDecimal bakNum4;
	
    /** 
     * 属性bakStr1
     */
    private String bakStr1;
	
    /** 
     * 属性bakStr2
     */
    private String bakStr2;
	
    /** 
     * 属性bakStr3
     */
    private String bakStr3;
	
    /** 
     * 属性bakStr4
     */
    private String bakStr4;
	
    /** 
     * 属性updatePersion
     */
    private String updatePersion;
	
    /** 
     * 属性updateTime
     */
    private Date updateTime;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * TrCoefficientConfig构造函数
     */
    public TrCoefficientConfig() {
        super();
    }  
	
    /**
     * TrCoefficientConfig完整的构造函数
     */  
    public TrCoefficientConfig(String id){
        this.id = id;
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
     * 属性 paramTypeCode 的get方法
     * @return String
     */
    public String getParamTypeCode(){
        return paramTypeCode;
    }
	
    /**
     * 属性 paramTypeCode 的set方法
     * @return
     */
    public void setParamTypeCode(String paramTypeCode){
        this.paramTypeCode = paramTypeCode;
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
     * 属性 paramValue 的get方法
     * @return BigDecimal
     */
    public BigDecimal getParamValue(){
        return paramValue;
    }
	
    /**
     * 属性 paramValue 的set方法
     * @return
     */
    public void setParamValue(BigDecimal paramValue){
        this.paramValue = paramValue;
    } 
	
    /**
     * 属性 bakNum1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakNum1(){
        return bakNum1;
    }
	
    /**
     * 属性 bakNum1 的set方法
     * @return
     */
    public void setBakNum1(BigDecimal bakNum1){
        this.bakNum1 = bakNum1;
    } 
	
    /**
     * 属性 bakNum2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakNum2(){
        return bakNum2;
    }
	
    /**
     * 属性 bakNum2 的set方法
     * @return
     */
    public void setBakNum2(BigDecimal bakNum2){
        this.bakNum2 = bakNum2;
    } 
	
    /**
     * 属性 bakNum3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakNum3(){
        return bakNum3;
    }
	
    /**
     * 属性 bakNum3 的set方法
     * @return
     */
    public void setBakNum3(BigDecimal bakNum3){
        this.bakNum3 = bakNum3;
    } 
	
    /**
     * 属性 bakNum4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakNum4(){
        return bakNum4;
    }
	
    /**
     * 属性 bakNum4 的set方法
     * @return
     */
    public void setBakNum4(BigDecimal bakNum4){
        this.bakNum4 = bakNum4;
    } 
	
    /**
     * 属性 bakStr1 的get方法
     * @return String
     */
    public String getBakStr1(){
        return bakStr1;
    }
	
    /**
     * 属性 bakStr1 的set方法
     * @return
     */
    public void setBakStr1(String bakStr1){
        this.bakStr1 = bakStr1;
    } 
	
    /**
     * 属性 bakStr2 的get方法
     * @return String
     */
    public String getBakStr2(){
        return bakStr2;
    }
	
    /**
     * 属性 bakStr2 的set方法
     * @return
     */
    public void setBakStr2(String bakStr2){
        this.bakStr2 = bakStr2;
    } 
	
    /**
     * 属性 bakStr3 的get方法
     * @return String
     */
    public String getBakStr3(){
        return bakStr3;
    }
	
    /**
     * 属性 bakStr3 的set方法
     * @return
     */
    public void setBakStr3(String bakStr3){
        this.bakStr3 = bakStr3;
    } 
	
    /**
     * 属性 bakStr4 的get方法
     * @return String
     */
    public String getBakStr4(){
        return bakStr4;
    }
	
    /**
     * 属性 bakStr4 的set方法
     * @return
     */
    public void setBakStr4(String bakStr4){
        this.bakStr4 = bakStr4;
    } 
	
    /**
     * 属性 updatePersion 的get方法
     * @return String
     */
    public String getUpdatePersion(){
        return updatePersion;
    }
	
    /**
     * 属性 updatePersion 的set方法
     * @return
     */
    public void setUpdatePersion(String updatePersion){
        this.updatePersion = updatePersion;
    } 
	
    /**
     * 属性 updateTime 的get方法
     * @return Date
     */
    public Date getUpdateTime(){
        return updateTime;
    }
	
    /**
     * 属性 updateTime 的set方法
     * @return
     */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
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
		
        if (o == null || !(o instanceof TrCoefficientConfig))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrCoefficientConfig other = (TrCoefficientConfig) o;	        
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
            .append("paramTypeCode"+":"+getParamTypeCode())
            .append("paramName"+":"+getParamName())
            .append("paramCode"+":"+getParamCode())
            .append("paramValue"+":"+getParamValue())
            .append("bakNum1"+":"+getBakNum1())
            .append("bakNum2"+":"+getBakNum2())
            .append("bakNum3"+":"+getBakNum3())
            .append("bakNum4"+":"+getBakNum4())
            .append("bakStr1"+":"+getBakStr1())
            .append("bakStr2"+":"+getBakStr2())
            .append("bakStr3"+":"+getBakStr3())
            .append("bakStr4"+":"+getBakStr4())
            .append("updatePersion"+":"+getUpdatePersion())
            .append("updateTime"+":"+getUpdateTime())
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