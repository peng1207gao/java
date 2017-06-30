package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrRuleMethod的POJO类
 *
 * @author  Administrator  [Fri Aug 23 15:18:33 CST 2013]
 * 
 */
public class TrRuleMethod implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeRuleId
     */
    private String tradeRuleId;
	
    /** 
     * 属性tradeAlgorithmId
     */
    private String tradeAlgorithmId;
	
    /**
     * TrRuleMethod构造函数
     */
    public TrRuleMethod() {
        super();
    }  
	
    /**
     * TrRuleMethod完整的构造函数
     */  
    public TrRuleMethod(String guid,String tradeRuleId,String tradeAlgorithmId){
        this.guid = guid;
        this.tradeRuleId = tradeRuleId;
        this.tradeAlgorithmId = tradeAlgorithmId;
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
        this.tradeRuleId = tradeRuleId;
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
        this.tradeAlgorithmId = tradeAlgorithmId;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrRuleMethod))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrRuleMethod other = (TrRuleMethod) o;	        
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
            .append("tradeRuleId"+":"+getTradeRuleId())
            .append("tradeAlgorithmId"+":"+getTradeAlgorithmId())
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