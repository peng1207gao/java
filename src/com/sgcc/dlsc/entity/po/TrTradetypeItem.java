package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradetypeItem的POJO类
 *
 * @author  Administrator  [Wed Aug 14 14:42:55 CST 2013]
 * 
 */
public class TrTradetypeItem implements Serializable{

    /** 
     * 属性itemName
     */
    private String itemName;
	
    /** 
     * 属性itemNo
     */
    private BigDecimal itemNo;
	
    /** 
     * 属性dataType
     */
    private BigDecimal dataType;
	
    /** 
     * 属性keyClass
     */
    private String keyClass;
	
    /** 
     * 属性itemEncryption
     */
    private BigDecimal itemEncryption;
	
    /** 
     * 属性itemIsautopub
     */
    private BigDecimal itemIsautopub;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradetypeId
     */
    private String tradetypeId;
    
    /** 
     * 属性itemCode
     */
    private String itemCode;
	
    

	/**
     * TrTradetypeItem构造函数
     */
    public TrTradetypeItem() {
        super();
    }  
	
    /**
     * TrTradetypeItem完整的构造函数
     */  
    public TrTradetypeItem(BigDecimal itemNo,BigDecimal dataType,String marketId,String guid,String tradetypeId,String itemCode){
        this.itemNo = itemNo;
        this.dataType = dataType;
        this.marketId = marketId;
        this.guid = guid;
        this.tradetypeId = tradetypeId;
        this.itemCode = itemCode;
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
     * 属性 itemNo 的get方法
     * @return BigDecimal
     */
    public BigDecimal getItemNo(){
        return itemNo;
    }
	
    /**
     * 属性 itemNo 的set方法
     * @return
     */
    public void setItemNo(BigDecimal itemNo){
        this.itemNo = itemNo;
    } 
	
    /**
     * 属性 dataType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDataType(){
        return dataType;
    }
	
    /**
     * 属性 dataType 的set方法
     * @return
     */
    public void setDataType(BigDecimal dataType){
        this.dataType = dataType;
    } 
	
    /**
     * 属性 keyClass 的get方法
     * @return String
     */
    public String getKeyClass(){
        return keyClass;
    }
	
    /**
     * 属性 keyClass 的set方法
     * @return
     */
    public void setKeyClass(String keyClass){
        this.keyClass = keyClass;
    } 
	
    /**
     * 属性 itemEncryption 的get方法
     * @return BigDecimal
     */
    public BigDecimal getItemEncryption(){
        return itemEncryption;
    }
	
    /**
     * 属性 itemEncryption 的set方法
     * @return
     */
    public void setItemEncryption(BigDecimal itemEncryption){
        this.itemEncryption = itemEncryption;
    } 
	
    /**
     * 属性 itemIsautopub 的get方法
     * @return BigDecimal
     */
    public BigDecimal getItemIsautopub(){
        return itemIsautopub;
    }
	
    /**
     * 属性 itemIsautopub 的set方法
     * @return
     */
    public void setItemIsautopub(BigDecimal itemIsautopub){
        this.itemIsautopub = itemIsautopub;
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
     * 属性 tradetypeId 的get方法
     * @return String
     */
    public String getTradetypeId(){
        return tradetypeId;
    }
	
    /**
     * 属性 tradetypeId 的set方法
     * @return
     */
    public void setTradetypeId(String tradetypeId){
        this.tradetypeId = tradetypeId;
    } 
    
    /**
     * 属性 itemCode 的get方法
     * @return String
     */
    public String getItemCode() {
		return itemCode;
	}

    /**
     * 属性 itemCode 的set方法
     * @return
     */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTradetypeItem))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrTradetypeItem other = (TrTradetypeItem) o;	        
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
            .append("itemName"+":"+getItemName())
            .append("itemNo"+":"+getItemNo())
            .append("dataType"+":"+getDataType())
            .append("keyClass"+":"+getKeyClass())
            .append("itemEncryption"+":"+getItemEncryption())
            .append("itemIsautopub"+":"+getItemIsautopub())
            .append("marketId"+":"+getMarketId())
            .append("guid"+":"+getGuid())
            .append("tradetypeId"+":"+getTradetypeId())
            .append("itemCode"+":"+getItemCode())
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