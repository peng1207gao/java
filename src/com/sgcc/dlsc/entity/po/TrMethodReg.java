package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;

import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrMethodReg的POJO类
 *
 * @author  Administrator  [Thu Aug 22 14:51:03 CST 2013]
 * 
 */
public class TrMethodReg implements Serializable{

    /** 
     * 属性tradeAlgorithmId
     */
    private String tradeAlgorithmId;
	
    /** 
     * 属性tradeAlgorithmName
     */
    private String tradeAlgorithmName;
	
    /** 
     * 属性sourceClass
     */
    private String sourceClass;
	
    /** 
     * 属性sourceMethod
     */
    private String sourceMethod;
	
    /** 
     * 属性regDate
     */
    private Date regDate;
	
    /** 
     * 属性regPerson
     */
    private String regPerson;
	
    /** 
     * 属性bigtypeId
     */
    private String bigtypeId;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * TrMethodReg构造函数
     */
    public TrMethodReg() {
        super();
    }  
	
    /**
     * TrMethodReg完整的构造函数
     */  
    public TrMethodReg(String tradeAlgorithmId,String tradeAlgorithmName,String bigtypeId,String marketId){
        this.tradeAlgorithmId = tradeAlgorithmId;
        this.tradeAlgorithmName = tradeAlgorithmName;
        this.bigtypeId = bigtypeId;
        this.marketId = marketId;
    }
 
    /**
     * 属性 tradeAlgorithmId 的get方法
     * @return String
     */
    public String getTradeAlgorithmId(){
        return tradeAlgorithmId;
    }
	
    /**
     * 属性 tradeAlgorithmId 的set方法
     * @return
     */
    public void setTradeAlgorithmId(String tradeAlgorithmId){
        if(tradeAlgorithmId != null && tradeAlgorithmId.trim().length() == 0){
            this.tradeAlgorithmId = null;
        }else{
            this.tradeAlgorithmId = tradeAlgorithmId;
        }
    } 
	
    /**
     * 属性 tradeAlgorithmName 的get方法
     * @return String
     */
    public String getTradeAlgorithmName(){
        return tradeAlgorithmName;
    }
	
    /**
     * 属性 tradeAlgorithmName 的set方法
     * @return
     */
    public void setTradeAlgorithmName(String tradeAlgorithmName){
        this.tradeAlgorithmName = tradeAlgorithmName;
    } 
	
    /**
     * 属性 sourceClass 的get方法
     * @return String
     */
    public String getSourceClass(){
        return sourceClass;
    }
	
    /**
     * 属性 sourceClass 的set方法
     * @return
     */
    public void setSourceClass(String sourceClass){
        this.sourceClass = sourceClass;
    } 
	
    /**
     * 属性 sourceMethod 的get方法
     * @return String
     */
    public String getSourceMethod(){
        return sourceMethod;
    }
	
    /**
     * 属性 sourceMethod 的set方法
     * @return
     */
    public void setSourceMethod(String sourceMethod){
        this.sourceMethod = sourceMethod;
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
     * 属性 bigtypeId 的get方法
     * @return String
     */
    public String getBigtypeId(){
        return bigtypeId;
    }
	
    /**
     * 属性 bigtypeId 的set方法
     * @return
     */
    public void setBigtypeId(String bigtypeId){
        this.bigtypeId = bigtypeId;
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
		
        if (o == null || !(o instanceof TrMethodReg))
	        return false; 
			
        if(getTradeAlgorithmId() == null) 
	        return false;

        TrMethodReg other = (TrMethodReg) o;	        
	    return new EqualsBuilder()
            .append(this.getTradeAlgorithmId(), other.getTradeAlgorithmId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("tradeAlgorithmId"+":"+getTradeAlgorithmId())
            .append("tradeAlgorithmName"+":"+getTradeAlgorithmName())
            .append("sourceClass"+":"+getSourceClass())
            .append("sourceMethod"+":"+getSourceMethod())
            .append("regDate"+":"+getRegDate())
            .append("regPerson"+":"+getRegPerson())
            .append("bigtypeId"+":"+getBigtypeId())
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