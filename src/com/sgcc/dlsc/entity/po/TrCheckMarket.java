package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrCheckMarket的POJO类
 *
 * @author  sss  [Tue Dec 10 14:57:50 CST 2013]
 * 
 */
public class TrCheckMarket implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性checkMarketid
     */
    private String checkMarketid;
	
    /**
     * TrCheckMarket构造函数
     */
    public TrCheckMarket() {
        super();
    }  
	
    /**
     * TrCheckMarket完整的构造函数
     */  
    public TrCheckMarket(String guid){
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
     * 属性 checkMarketid 的get方法
     * @return String
     */
    public String getCheckMarketid(){
        return checkMarketid;
    }
	
    /**
     * 属性 checkMarketid 的set方法
     * @return
     */
    public void setCheckMarketid(String checkMarketid){
        this.checkMarketid = checkMarketid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrCheckMarket))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrCheckMarket other = (TrCheckMarket) o;	        
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
            .append("tradeseqId"+":"+getTradeseqId())
            .append("checkMarketid"+":"+getCheckMarketid())
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