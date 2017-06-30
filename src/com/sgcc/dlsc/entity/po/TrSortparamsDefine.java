package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrSortparamsDefine的POJO类
 *
 * @author  Administrator  [Mon Aug 19 11:09:14 CST 2013]
 * 
 */
public class TrSortparamsDefine implements Serializable{

    /** 
     * 属性factorId
     */
    private String factorId;
	
    /** 
     * 属性factorName
     */
    private String factorName;
	
    /** 
     * 属性valueObject
     */
    private String valueObject;
	
    /** 
     * 属性property
     */
    private String property;
	
    /** 
     * 属性qrySql
     */
    private String qrySql;
	
    /** 
     * 属性returnType
     */
    private BigDecimal returnType;
	
    /** 
     * 属性menuTypeCode
     */
    private String menuTypeCode;
	
    /** 
     * 属性marketId
     */
    private String marketId;
    
    /** 
     * 属性ratioIsPermit
     */
    private BigDecimal ratioIsPermit;
	
    
    
   

	/**
     * TrSortparamsDefine构造函数
     */
    public TrSortparamsDefine() {
        super();
    }  
	
    /**
     * TrSortparamsDefine完整的构造函数
     */  
    public TrSortparamsDefine(String factorId,String factorName,BigDecimal returnType,String marketId){
        this.factorId = factorId;
        this.factorName = factorName;
        this.returnType = returnType;
        this.marketId = marketId;
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
        if(factorId != null && factorId.trim().length() == 0){
            this.factorId = null;
        }else{
            this.factorId = factorId;
        }
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
     * 属性 valueObject 的get方法
     * @return String
     */
    public String getValueObject(){
        return valueObject;
    }
	
    /**
     * 属性 valueObject 的set方法
     * @return
     */
    public void setValueObject(String valueObject){
        this.valueObject = valueObject;
    } 
	
    /**
     * 属性 property 的get方法
     * @return String
     */
    public String getProperty(){
        return property;
    }
	
    /**
     * 属性 property 的set方法
     * @return
     */
    public void setProperty(String property){
        this.property = property;
    } 
	
    /**
     * 属性 qrySql 的get方法
     * @return String
     */
    public String getQrySql(){
        return qrySql;
    }
	
    /**
     * 属性 qrySql 的set方法
     * @return
     */
    public void setQrySql(String qrySql){
        this.qrySql = qrySql;
    } 
	
    /**
     * 属性 returnType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getReturnType(){
        return returnType;
    }
	
    /**
     * 属性 returnType 的set方法
     * @return
     */
    public void setReturnType(BigDecimal returnType){
        this.returnType = returnType;
    } 
	
    /**
     * 属性 menuTypeCode 的get方法
     * @return String
     */
    public String getMenuTypeCode(){
        return menuTypeCode;
    }
	
    /**
     * 属性 menuTypeCode 的set方法
     * @return
     */
    public void setMenuTypeCode(String menuTypeCode){
        this.menuTypeCode = menuTypeCode;
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
     * 属性 ratioIsPermit 的get方法
     * @return
     */
    public BigDecimal getRatioIsPermit() {
		return ratioIsPermit;
	}
    /**
     * 属性 ratioIsPermit 的set方法
     * @return
     */
	public void setRatioIsPermit(BigDecimal ratioIsPermit) {
		this.ratioIsPermit = ratioIsPermit;
	}
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrSortparamsDefine))
	        return false; 
			
        if(getFactorId() == null) 
	        return false;

        TrSortparamsDefine other = (TrSortparamsDefine) o;	        
	    return new EqualsBuilder()
            .append(this.getFactorId(), other.getFactorId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("factorId"+":"+getFactorId())
            .append("factorName"+":"+getFactorName())
            .append("valueObject"+":"+getValueObject())
            .append("property"+":"+getProperty())
            .append("qrySql"+":"+getQrySql())
            .append("returnType"+":"+getReturnType())
            .append("menuTypeCode"+":"+getMenuTypeCode())
            .append("marketId"+":"+getMarketId())
            .append("ratioIsPermit"+":"+getRatioIsPermit())
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