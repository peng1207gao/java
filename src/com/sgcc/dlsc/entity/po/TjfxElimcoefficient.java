package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjfxElimcoefficient的POJO类
 *
 * @author  wangqibin  [Sun Mar 02 16:35:46 CST 2014]
 * 
 */
public class TjfxElimcoefficient implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性elimRatio
     */
    private BigDecimal elimRatio;
	
    /** 
     * 属性years
     */
    private BigDecimal years;
	
    /**
     * TjfxElimcoefficient构造函数
     */
    public TjfxElimcoefficient() {
        super();
    }  
	
    /**
     * TjfxElimcoefficient完整的构造函数
     */  
    public TjfxElimcoefficient(String guid){
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
     * 属性 elimRatio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElimRatio(){
        return elimRatio;
    }
	
    /**
     * 属性 elimRatio 的set方法
     * @return
     */
    public void setElimRatio(BigDecimal elimRatio){
        this.elimRatio = elimRatio;
    } 
	
    /**
     * 属性 years 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYears(){
        return years;
    }
	
    /**
     * 属性 years 的set方法
     * @return
     */
    public void setYears(BigDecimal years){
        this.years = years;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjfxElimcoefficient))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjfxElimcoefficient other = (TjfxElimcoefficient) o;	        
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
            .append("marketId"+":"+getMarketId())
            .append("elimRatio"+":"+getElimRatio())
            .append("years"+":"+getYears())
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