package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaUnitmapping的POJO类
 *
 * @author  Administrator  [Mon Jul 08 18:25:55 CST 2013]
 * 
 */
public class BaUnitmapping implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性balance
     */
    private String balance;
	
    /** 
     * 属性balanceDate
     */
    private Date balanceDate;
	
    /** 
     * 属性datatype
     */
    private BigDecimal datatype;
	
    /** 
     * 属性baUnit
     */
    private String baUnit;
	
    /**
     * BaUnitmapping构造函数
     */
    public BaUnitmapping() {
        super();
    }  
	
    /**
     * BaUnitmapping完整的构造函数
     */  
    public BaUnitmapping(String guid,String marketcode){
        this.guid = guid;
        this.marketcode = marketcode;
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
     * 属性 marketcode 的get方法
     * @return String
     */
    public String getMarketcode(){
        return marketcode;
    }
	
    /**
     * 属性 marketcode 的set方法
     * @return
     */
    public void setMarketcode(String marketcode){
        this.marketcode = marketcode;
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
     * 属性 balanceDate 的get方法
     * @return Date
     */
    public Date getBalanceDate(){
        return balanceDate;
    }
	
    /**
     * 属性 balanceDate 的set方法
     * @return
     */
    public void setBalanceDate(Date balanceDate){
        this.balanceDate = balanceDate;
    } 
	
    /**
     * 属性 datatype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDatatype(){
        return datatype;
    }
	
    /**
     * 属性 datatype 的set方法
     * @return
     */
    public void setDatatype(BigDecimal datatype){
        this.datatype = datatype;
    } 
	
    /**
     * 属性 baUnit 的get方法
     * @return String
     */
    public String getBaUnit(){
        return baUnit;
    }
	
    /**
     * 属性 baUnit 的set方法
     * @return
     */
    public void setBaUnit(String baUnit){
        this.baUnit = baUnit;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaUnitmapping))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaUnitmapping other = (BaUnitmapping) o;	        
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
            .append("marketcode"+":"+getMarketcode())
            .append("balance"+":"+getBalance())
            .append("balanceDate"+":"+getBalanceDate())
            .append("datatype"+":"+getDatatype())
            .append("baUnit"+":"+getBaUnit())
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