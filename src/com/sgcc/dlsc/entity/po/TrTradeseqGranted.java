package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeseqGranted的POJO类
 *
 * @author  Administrator  [Wed Aug 07 17:30:51 CST 2013]
 * 
 */
public class TrTradeseqGranted implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性jydyId
     */
    private String jydyId;
	
    /** 
     * 属性tradeRole
     */
    private BigDecimal tradeRole;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * TrTradeseqGranted构造函数
     */
    public TrTradeseqGranted() {
        super();
    }  
	
    /**
     * TrTradeseqGranted完整的构造函数
     */  
    public TrTradeseqGranted(String id,BigDecimal tradeseqId,String jydyId,BigDecimal tradeRole,String marketId){
        this.id = id;
        this.tradeseqId = tradeseqId;
        this.jydyId = jydyId;
        this.tradeRole = tradeRole;
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
     * 属性 jydyId 的get方法
     * @return BigDecimal
     */
    public String getJydyId(){
        return jydyId;
    }
	
    /**
     * 属性 jydyId 的set方法
     * @return
     */
    public void setJydyId(String jydyId){
        this.jydyId = jydyId;
    } 
	
    /**
     * 属性 tradeRole 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradeRole(){
        return tradeRole;
    }
	
    /**
     * 属性 tradeRole 的set方法
     * @return
     */
    public void setTradeRole(BigDecimal tradeRole){
        this.tradeRole = tradeRole;
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
		
        if (o == null || !(o instanceof TrTradeseqGranted))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrTradeseqGranted other = (TrTradeseqGranted) o;	        
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
            .append("jydyId"+":"+getJydyId())
            .append("tradeRole"+":"+getTradeRole())
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