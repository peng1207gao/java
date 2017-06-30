package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeseqItem的POJO类
 *
 * @author  Administrator  [Tue Aug 06 14:52:46 CST 2013]
 * 
 */
public class TrTradeseqItem implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性itemName
     */
    private String itemName;
	
    /** 
     * 属性itemType
     */
    private BigDecimal itemType;
	
    /** 
     * 属性itemValue
     */
    private String itemValue;
	
    /** 
     * 属性keyClass
     */
    private String keyClass;
	
    /** 
     * 属性itemIsautopub
     */
    private BigDecimal itemIsautopub;
	
    /** 
     * 属性marketId
     */
    private String marketId;
    private String itemCode;
	
    /**
     * TrTradeseqItem构造函数
     */
    public TrTradeseqItem() {
        super();
    }  
	
    /**
     * TrTradeseqItem完整的构造函数
     */  
    public TrTradeseqItem(String id,BigDecimal tradeseqId,String itemName,BigDecimal itemType,String itemValue,String marketId){
        this.id = id;
        this.tradeseqId = tradeseqId;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemValue = itemValue;
        this.marketId = marketId;
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
     * 属性 itemType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getItemType(){
        return itemType;
    }
	
    /**
     * 属性 itemType 的set方法
     * @return
     */
    public void setItemType(BigDecimal itemType){
        this.itemType = itemType;
    } 
	
    /**
     * 属性 itemValue 的get方法
     * @return String
     */
    public String getItemValue(){
        return itemValue;
    }
	
    public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	/**
     * 属性 itemValue 的set方法
     * @return
     */
    public void setItemValue(String itemValue){
        this.itemValue = itemValue;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTradeseqItem))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrTradeseqItem other = (TrTradeseqItem) o;	        
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
            .append("itemName"+":"+getItemName())
            .append("itemType"+":"+getItemType())
            .append("itemValue"+":"+getItemValue())
            .append("keyClass"+":"+getKeyClass())
            .append("itemIsautopub"+":"+getItemIsautopub())
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