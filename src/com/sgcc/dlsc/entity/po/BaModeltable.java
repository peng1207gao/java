package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaModeltable的POJO类
 *
 * @author  Administrator  [Thu Jul 18 16:41:28 CST 2013]
 * 
 */
public class BaModeltable implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性tabname
     */
    private String tabname;
	
    /** 
     * 属性tabid
     */
    private String tabid;
	
    /** 
     * 属性modelname
     */
    private String modelname;
	
    /** 
     * 属性version
     */
    private String version;
	
    /** 
     * 属性balance
     */
    private String balance;
	
    /** 
     * 属性state
     */
    private BigDecimal state;
	
    /** 
     * 属性dateType
     */
    private BigDecimal dateType;
	
    /** 
     * 属性balanceType
     */
    private BigDecimal balanceType;
	
    /**
     * BaModeltable构造函数
     */
    public BaModeltable() {
        super();
    }  
	
    /**
     * BaModeltable完整的构造函数
     */  
    public BaModeltable(String guid,BigDecimal dateType,BigDecimal balanceType){
        this.guid = guid;
        this.dateType = dateType;
        this.balanceType = balanceType;
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
     * 属性 marketid 的get方法
     * @return String
     */
    public String getMarketid(){
        return marketid;
    }
	
    /**
     * 属性 marketid 的set方法
     * @return
     */
    public void setMarketid(String marketid){
        this.marketid = marketid;
    } 
	
    /**
     * 属性 tabname 的get方法
     * @return String
     */
    public String getTabname(){
        return tabname;
    }
	
    /**
     * 属性 tabname 的set方法
     * @return
     */
    public void setTabname(String tabname){
        this.tabname = tabname;
    } 
	
    /**
     * 属性 tabid 的get方法
     * @return String
     */
    public String getTabid(){
        return tabid;
    }
	
    /**
     * 属性 tabid 的set方法
     * @return
     */
    public void setTabid(String tabid){
        this.tabid = tabid;
    } 
	
    /**
     * 属性 modelname 的get方法
     * @return String
     */
    public String getModelname(){
        return modelname;
    }
	
    /**
     * 属性 modelname 的set方法
     * @return
     */
    public void setModelname(String modelname){
        this.modelname = modelname;
    } 
	
    /**
     * 属性 version 的get方法
     * @return String
     */
    public String getVersion(){
        return version;
    }
	
    /**
     * 属性 version 的set方法
     * @return
     */
    public void setVersion(String version){
        this.version = version;
    } 
	
    /**
     * 属性 balance 的get方法
     * @return String
     */
    public String getBalance(){
        return balance;
    }
	
    /**
     * 属性 balance 的set方法
     * @return
     */
    public void setBalance(String balance){
        this.balance = balance;
    } 
	
    /**
     * 属性 state 的get方法
     * @return BigDecimal
     */
    public BigDecimal getState(){
        return state;
    }
	
    /**
     * 属性 state 的set方法
     * @return
     */
    public void setState(BigDecimal state){
        this.state = state;
    } 
	
    /**
     * 属性 dateType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDateType(){
        return dateType;
    }
	
    /**
     * 属性 dateType 的set方法
     * @return
     */
    public void setDateType(BigDecimal dateType){
        this.dateType = dateType;
    } 
	
    /**
     * 属性 balanceType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBalanceType(){
        return balanceType;
    }
	
    /**
     * 属性 balanceType 的set方法
     * @return
     */
    public void setBalanceType(BigDecimal balanceType){
        this.balanceType = balanceType;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaModeltable))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaModeltable other = (BaModeltable) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("tabname"+":"+getTabname())
            .append("tabid"+":"+getTabid())
            .append("modelname"+":"+getModelname())
            .append("version"+":"+getVersion())
            .append("balance"+":"+getBalance())
            .append("state"+":"+getState())
            .append("dateType"+":"+getDateType())
            .append("balanceType"+":"+getBalanceType())
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