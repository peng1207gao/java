package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwTrademarketmember的POJO类
 *
 * @author  zndw0  [Fri Mar 14 09:59:00 CST 2014]
 * 
 */
public class DwTrademarketmember implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeseqid
     */
    private String tradeseqid;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
    /** 
     * 属性thetype
     */
    private String thetype;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性busiunitid
     */
    private String busiunitid;
	
    /**
     * DwTrademarketmember构造函数
     */
    public DwTrademarketmember() {
        super();
    }  
	
    /**
     * DwTrademarketmember完整的构造函数
     */  
    public DwTrademarketmember(String guid){
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
     * 属性 tradeseqid 的get方法
     * @return String
     */
    public String getTradeseqid(){
        return tradeseqid;
    }
	
    /**
     * 属性 tradeseqid 的set方法
     * @return
     */
    public void setTradeseqid(String tradeseqid){
        this.tradeseqid = tradeseqid;
    } 
	
    /**
     * 属性 participantid 的get方法
     * @return String
     */
    public String getParticipantid(){
        return participantid;
    }
	
    /**
     * 属性 participantid 的set方法
     * @return
     */
    public void setParticipantid(String participantid){
        this.participantid = participantid;
    } 
	
    /**
     * 属性 thetype 的get方法
     * @return String
     */
    public String getThetype(){
        return thetype;
    }
	
    /**
     * 属性 thetype 的set方法
     * @return
     */
    public void setThetype(String thetype){
        this.thetype = thetype;
    } 
	
    /**
     * 属性 marketid 的get方法
     * @return String
     */
    public String getMarketid(){
        return marketid;
    }
	
    /**
     * 属性 marketid 的set方法
     * @return
     */
    public void setMarketid(String marketid){
        this.marketid = marketid;
    } 
	
    /**
     * 属性 busiunitid 的get方法
     * @return String
     */
    public String getBusiunitid(){
        return busiunitid;
    }
	
    /**
     * 属性 busiunitid 的set方法
     * @return
     */
    public void setBusiunitid(String busiunitid){
        this.busiunitid = busiunitid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwTrademarketmember))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwTrademarketmember other = (DwTrademarketmember) o;	        
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
            .append("tradeseqid"+":"+getTradeseqid())
            .append("participantid"+":"+getParticipantid())
            .append("thetype"+":"+getThetype())
            .append("marketid"+":"+getMarketid())
            .append("busiunitid"+":"+getBusiunitid())
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