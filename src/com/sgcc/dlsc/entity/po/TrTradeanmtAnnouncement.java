package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeanmtAnnouncement的POJO类
 *
 * @author  DWJ  [Fri Jun 20 18:17:07 CST 2014]
 * 
 */
public class TrTradeanmtAnnouncement implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性tradPower
     */
    private BigDecimal tradPower;
	
    /** 
     * 属性tradMark
     */
    private String tradMark;
	
    /** 
     * 属性deadlinetrial
     */
    private Date deadlinetrial;
	
    /** 
     * 属性wysjgfbsj
     */
    private Date wysjgfbsj;
	
    /** 
     * 属性yysjgfbsj
     */
    private Date yysjgfbsj;
	
    /** 
     * 属性tgyjhxs
     */
    private BigDecimal tgyjhxs;
	
    /** 
     * 属性tgyljl
     */
    private BigDecimal tgyljl;
	
    /** 
     * 属性sblx
     */
    private BigDecimal sblx;
	
    /** 
     * 属性marketId
     */
    private String marketId;
    
    /** 
     * 属性jyjgzt
     */
    private BigDecimal jyjgzt;
	/**
	 * 属性priceInfo
	 */
    private String priceInfo;
    public String getPriceInfo() {
		return priceInfo;
	}

	public void setPriceInfo(String priceInfo) {
		this.priceInfo = priceInfo;
	}

	/**
     * TrTradeanmtAnnouncement构造函数
     */
    public TrTradeanmtAnnouncement() {
        super();
    }  
	
    /**
     * TrTradeanmtAnnouncement完整的构造函数
     */  
    public TrTradeanmtAnnouncement(String id,BigDecimal tradeseqId,String marketId){
        this.id = id;
        this.tradeseqId = tradeseqId;
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
     * 属性 tradPower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradPower(){
        return tradPower;
    }
	
    /**
     * 属性 tradPower 的set方法
     * @return
     */
    public void setTradPower(BigDecimal tradPower){
        this.tradPower = tradPower;
    } 
	
    /**
     * 属性 tradMark 的get方法
     * @return String
     */
    public String getTradMark(){
        return tradMark;
    }
	
    /**
     * 属性 tradMark 的set方法
     * @return
     */
    public void setTradMark(String tradMark){
        this.tradMark = tradMark;
    } 
	
    /**
     * 属性 deadlinetrial 的get方法
     * @return Date
     */
    public Date getDeadlinetrial(){
        return deadlinetrial;
    }
	
    /**
     * 属性 deadlinetrial 的set方法
     * @return
     */
    public void setDeadlinetrial(Date deadlinetrial){
        this.deadlinetrial = deadlinetrial;
    } 
	
    /**
     * 属性 wysjgfbsj 的get方法
     * @return Date
     */
    public Date getWysjgfbsj(){
        return wysjgfbsj;
    }
	
    /**
     * 属性 wysjgfbsj 的set方法
     * @return
     */
    public void setWysjgfbsj(Date wysjgfbsj){
        this.wysjgfbsj = wysjgfbsj;
    } 
	
    /**
     * 属性 yysjgfbsj 的get方法
     * @return Date
     */
    public Date getYysjgfbsj(){
        return yysjgfbsj;
    }
	
    /**
     * 属性 yysjgfbsj 的set方法
     * @return
     */
    public void setYysjgfbsj(Date yysjgfbsj){
        this.yysjgfbsj = yysjgfbsj;
    } 
	
    /**
     * 属性 tgyjhxs 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTgyjhxs(){
        return tgyjhxs;
    }
	
    /**
     * 属性 tgyjhxs 的set方法
     * @return
     */
    public void setTgyjhxs(BigDecimal tgyjhxs){
        this.tgyjhxs = tgyjhxs;
    } 
	
    /**
     * 属性 tgyljl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTgyljl(){
        return tgyljl;
    }
	
    /**
     * 属性 tgyljl 的set方法
     * @return
     */
    public void setTgyljl(BigDecimal tgyljl){
        this.tgyljl = tgyljl;
    } 
	
    /**
     * 属性 sblx 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSblx(){
        return sblx;
    }
	
    /**
     * 属性 sblx 的set方法
     * @return
     */
    public void setSblx(BigDecimal sblx){
        this.sblx = sblx;
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
	
    
	public BigDecimal getJyjgzt() {
		return jyjgzt;
	}

	public void setJyjgzt(BigDecimal jyjgzt) {
		this.jyjgzt = jyjgzt;
	}

	/**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTradeanmtAnnouncement))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrTradeanmtAnnouncement other = (TrTradeanmtAnnouncement) o;	        
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
            .append("tradPower"+":"+getTradPower())
            .append("tradMark"+":"+getTradMark())
            .append("deadlinetrial"+":"+getDeadlinetrial())
            .append("wysjgfbsj"+":"+getWysjgfbsj())
            .append("yysjgfbsj"+":"+getYysjgfbsj())
            .append("tgyjhxs"+":"+getTgyjhxs())
            .append("tgyljl"+":"+getTgyljl())
            .append("sblx"+":"+getSblx())
            .append("marketId"+":"+getMarketId())
            .append("jyjgzt"+":"+getJyjgzt())
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