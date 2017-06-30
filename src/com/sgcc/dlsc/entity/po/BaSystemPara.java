package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaSystemPara的POJO类
 *
 * @author  Administrator  [Fri Feb 14 14:01:38 CST 2014]
 * 
 */
public class BaSystemPara implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性dorder
     */
    private BigDecimal dorder;
	
    /** 
     * 属性paraId
     */
    private String paraId;
	
    /** 
     * 属性paraName
     */
    private String paraName;
	
    /** 
     * 属性paraValue
     */
    private String paraValue;
	
    /** 
     * 属性paraRemark
     */
    private String paraRemark;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * BaSystemPara构造函数
     */
    public BaSystemPara() {
        super();
    }  
	
    /**
     * BaSystemPara完整的构造函数
     */  
    public BaSystemPara(String guid,String paraId,String paraName,String marketId){
        this.guid = guid;
        this.paraId = paraId;
        this.paraName = paraName;
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
     * 属性 dorder 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDorder(){
        return dorder;
    }
	
    /**
     * 属性 dorder 的set方法
     * @return
     */
    public void setDorder(BigDecimal dorder){
        this.dorder = dorder;
    } 
	
    /**
     * 属性 paraId 的get方法
     * @return String
     */
    public String getParaId(){
        return paraId;
    }
	
    /**
     * 属性 paraId 的set方法
     * @return
     */
    public void setParaId(String paraId){
        this.paraId = paraId;
    } 
	
    /**
     * 属性 paraName 的get方法
     * @return String
     */
    public String getParaName(){
        return paraName;
    }
	
    /**
     * 属性 paraName 的set方法
     * @return
     */
    public void setParaName(String paraName){
        this.paraName = paraName;
    } 
	
    /**
     * 属性 paraValue 的get方法
     * @return String
     */
    public String getParaValue(){
        return paraValue;
    }
	
    /**
     * 属性 paraValue 的set方法
     * @return
     */
    public void setParaValue(String paraValue){
        this.paraValue = paraValue;
    } 
	
    /**
     * 属性 paraRemark 的get方法
     * @return String
     */
    public String getParaRemark(){
        return paraRemark;
    }
	
    /**
     * 属性 paraRemark 的set方法
     * @return
     */
    public void setParaRemark(String paraRemark){
        this.paraRemark = paraRemark;
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
		
        if (o == null || !(o instanceof BaSystemPara))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaSystemPara other = (BaSystemPara) o;	        
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
            .append("dorder"+":"+getDorder())
            .append("paraId"+":"+getParaId())
            .append("paraName"+":"+getParaName())
            .append("paraValue"+":"+getParaValue())
            .append("paraRemark"+":"+getParaRemark())
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