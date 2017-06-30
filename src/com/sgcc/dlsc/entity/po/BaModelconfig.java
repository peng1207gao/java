package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaModelconfig的POJO类
 *
 * @author  Administrator  [Mon Jul 22 09:45:05 CST 2013]
 * 
 */
public class BaModelconfig implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性modelId
     */
    private String modelId;
	
    /** 
     * 属性unitId
     */
    private String unitId;
	
    /** 
     * 属性displayName
     */
    private String displayName;
	
    /** 
     * 属性isDisplay
     */
    private BigDecimal isDisplay;
	
    /** 
     * 属性displayNo
     */
    private BigDecimal displayNo;
	
    /** 
     * 属性itemId
     */
    private String itemId;
	
    /** 
     * 属性itemName
     */
    private String itemName;
	
    /** 
     * 属性rcId
     */
    private BigDecimal rcId;
	
    /**
     * BaModelconfig构造函数
     */
    public BaModelconfig() {
        super();
    }  
	
    /**
     * BaModelconfig完整的构造函数
     */  
    public BaModelconfig(String guid,String modelId){
        this.guid = guid;
        this.modelId = modelId;
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
     * 属性 modelId 的get方法
     * @return String
     */
    public String getModelId(){
        return modelId;
    }
	
    /**
     * 属性 modelId 的set方法
     * @return
     */
    public void setModelId(String modelId){
        this.modelId = modelId;
    } 
	
    /**
     * 属性 unitId 的get方法
     * @return String
     */
    public String getUnitId(){
        return unitId;
    }
	
    /**
     * 属性 unitId 的set方法
     * @return
     */
    public void setUnitId(String unitId){
        this.unitId = unitId;
    } 
	
    /**
     * 属性 displayName 的get方法
     * @return String
     */
    public String getDisplayName(){
        return displayName;
    }
	
    /**
     * 属性 displayName 的set方法
     * @return
     */
    public void setDisplayName(String displayName){
        this.displayName = displayName;
    } 
	
    /**
     * 属性 isDisplay 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsDisplay(){
        return isDisplay;
    }
	
    /**
     * 属性 isDisplay 的set方法
     * @return
     */
    public void setIsDisplay(BigDecimal isDisplay){
        this.isDisplay = isDisplay;
    } 
	
    /**
     * 属性 displayNo 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDisplayNo(){
        return displayNo;
    }
	
    /**
     * 属性 displayNo 的set方法
     * @return
     */
    public void setDisplayNo(BigDecimal displayNo){
        this.displayNo = displayNo;
    } 
	
    /**
     * 属性 itemId 的get方法
     * @return String
     */
    public String getItemId(){
        return itemId;
    }
	
    /**
     * 属性 itemId 的set方法
     * @return
     */
    public void setItemId(String itemId){
        this.itemId = itemId;
    } 
	
    /**
     * 属性 itemName 的get方法
     * @return String
     */
    public String getItemName(){
        return itemName;
    }
	
    /**
     * 属性 itemName 的set方法
     * @return
     */
    public void setItemName(String itemName){
        this.itemName = itemName;
    } 
	
    /**
     * 属性 rcId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRcId(){
        return rcId;
    }
	
    /**
     * 属性 rcId 的set方法
     * @return
     */
    public void setRcId(BigDecimal rcId){
        this.rcId = rcId;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaModelconfig))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaModelconfig other = (BaModelconfig) o;	        
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
            .append("modelId"+":"+getModelId())
            .append("unitId"+":"+getUnitId())
            .append("displayName"+":"+getDisplayName())
            .append("isDisplay"+":"+getIsDisplay())
            .append("displayNo"+":"+getDisplayNo())
            .append("itemId"+":"+getItemId())
            .append("itemName"+":"+getItemName())
            .append("rcId"+":"+getRcId())
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