package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrResultMainOrder的POJO类
 *
 * @author  Administrator  [Thu Nov 07 13:39:57 CST 2013]
 * 
 */
public class TrResultMainOrder implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性bidinfoid
     */
    private String bidinfoid;
	
    /** 
     * 属性orderno
     */
    private BigDecimal orderno;
	
    /** 
     * 属性jydyId
     */
    private String jydyId;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性tradeTimepart
     */
    private BigDecimal tradeTimepart;
	
    /**
     * TrResultMainOrder构造函数
     */
    public TrResultMainOrder() {
        super();
    }  
	
    /**
     * TrResultMainOrder完整的构造函数
     */  
    public TrResultMainOrder(String guid,String jydyId){
        this.guid = guid;
        this.jydyId = jydyId;
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
     * 属性 bidinfoid 的get方法
     * @return String
     */
    public String getBidinfoid(){
        return bidinfoid;
    }
	
    /**
     * 属性 bidinfoid 的set方法
     * @return
     */
    public void setBidinfoid(String bidinfoid){
        this.bidinfoid = bidinfoid;
    } 
	
	
	
    /**
     * 属性 orderno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOrderno(){
        return orderno;
    }
	
    /**
     * 属性 orderno 的set方法
     * @return
     */
    public void setOrderno(BigDecimal orderno){
        this.orderno = orderno;
    } 
	
	
	
    /**
     * 属性 jydyId 的get方法
     * @return String
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
     * 属性 tradeTimepart 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradeTimepart(){
        return tradeTimepart;
    }
	
    /**
     * 属性 tradeTimepart 的set方法
     * @return
     */
    public void setTradeTimepart(BigDecimal tradeTimepart){
        this.tradeTimepart = tradeTimepart;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrResultMainOrder))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrResultMainOrder other = (TrResultMainOrder) o;	        
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
            .append("bidinfoid"+":"+getBidinfoid())
            .append("orderno"+":"+getOrderno())
            .append("jydyId"+":"+getJydyId())
            .append("tradeseqId"+":"+getTradeseqId())
            .append("tradeTimepart"+":"+getTradeTimepart())
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