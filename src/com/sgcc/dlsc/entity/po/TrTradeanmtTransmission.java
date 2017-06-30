package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeanmtTransmission的POJO类
 *
 * @author  zndw0  [Tue Jul 08 16:00:29 CST 2014]
 * 
 */
public class TrTradeanmtTransmission implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性tradeanmtId
     */
    private String tradeanmtId;
	
    /** 
     * 属性transmission
     */
    private String transmission;
	
    /** 
     * 属性linkid
     */
    private String linkid;
	
    /** 
     * 属性linkno
     */
    private BigDecimal linkno;
	
    /** 
     * 属性gateid
     */
    private String gateid;
	
    /** 
     * 属性startprice
     */
    private BigDecimal startprice;
	
    /** 
     * 属性endprice
     */
    private BigDecimal endprice;
	
    /** 
     * 属性transprice
     */
    private BigDecimal transprice;
	
    /** 
     * 属性lossrate
     */
    private BigDecimal lossrate;
	
    /** 
     * 属性transqty
     */
    private BigDecimal transqty;
	
    /** 
     * 属性capfee
     */
    private BigDecimal capfee;
	
    /** 
     * 属性seprate
     */
    private BigDecimal seprate;
	
    /** 
     * 属性peakregurate
     */
    private BigDecimal peakregurate;
	
    /** 
     * 属性isincludetax
     */
    private BigDecimal isincludetax;
	
    /** 
     * 属性power
     */
    private BigDecimal power;
	
    /** 
     * 属性explanation
     */
    private String explanation;
	
    /** 
     * 属性transcap
     */
    private BigDecimal transcap;
	
    /** 
     * 属性capprice
     */
    private BigDecimal capprice;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * TrTradeanmtTransmission构造函数
     */
    public TrTradeanmtTransmission() {
        super();
    }  
	
    /**
     * TrTradeanmtTransmission完整的构造函数
     */  
    public TrTradeanmtTransmission(String id,BigDecimal tradeseqId,String tradeanmtId,String transmission,String linkid,String marketId){
        this.id = id;
        this.tradeseqId = tradeseqId;
        this.tradeanmtId = tradeanmtId;
        this.transmission = transmission;
        this.linkid = linkid;
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
     * 属性 tradeanmtId 的get方法
     * @return String
     */
    public String getTradeanmtId(){
        return tradeanmtId;
    }
	
    /**
     * 属性 tradeanmtId 的set方法
     * @return
     */
    public void setTradeanmtId(String tradeanmtId){
        this.tradeanmtId = tradeanmtId;
    } 
	
    /**
     * 属性 transmission 的get方法
     * @return String
     */
    public String getTransmission(){
        return transmission;
    }
	
    /**
     * 属性 transmission 的set方法
     * @return
     */
    public void setTransmission(String transmission){
        this.transmission = transmission;
    } 
	
    /**
     * 属性 linkid 的get方法
     * @return String
     */
    public String getLinkid(){
        return linkid;
    }
	
    /**
     * 属性 linkid 的set方法
     * @return
     */
    public void setLinkid(String linkid){
        this.linkid = linkid;
    } 
	
    /**
     * 属性 linkno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLinkno(){
        return linkno;
    }
	
    /**
     * 属性 linkno 的set方法
     * @return
     */
    public void setLinkno(BigDecimal linkno){
        this.linkno = linkno;
    } 
	
    /**
     * 属性 gateid 的get方法
     * @return String
     */
    public String getGateid(){
        return gateid;
    }
	
    /**
     * 属性 gateid 的set方法
     * @return
     */
    public void setGateid(String gateid){
        this.gateid = gateid;
    } 
	
    /**
     * 属性 startprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getStartprice(){
        return startprice;
    }
	
    /**
     * 属性 startprice 的set方法
     * @return
     */
    public void setStartprice(BigDecimal startprice){
        this.startprice = startprice;
    } 
	
    /**
     * 属性 endprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEndprice(){
        return endprice;
    }
	
    /**
     * 属性 endprice 的set方法
     * @return
     */
    public void setEndprice(BigDecimal endprice){
        this.endprice = endprice;
    } 
	
    /**
     * 属性 transprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTransprice(){
        return transprice;
    }
	
    /**
     * 属性 transprice 的set方法
     * @return
     */
    public void setTransprice(BigDecimal transprice){
        this.transprice = transprice;
    } 
	
    /**
     * 属性 lossrate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLossrate(){
        return lossrate;
    }
	
    /**
     * 属性 lossrate 的set方法
     * @return
     */
    public void setLossrate(BigDecimal lossrate){
        this.lossrate = lossrate;
    } 
	
    /**
     * 属性 transqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTransqty(){
        return transqty;
    }
	
    /**
     * 属性 transqty 的set方法
     * @return
     */
    public void setTransqty(BigDecimal transqty){
        this.transqty = transqty;
    } 
	
    /**
     * 属性 capfee 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapfee(){
        return capfee;
    }
	
    /**
     * 属性 capfee 的set方法
     * @return
     */
    public void setCapfee(BigDecimal capfee){
        this.capfee = capfee;
    } 
	
    /**
     * 属性 seprate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSeprate(){
        return seprate;
    }
	
    /**
     * 属性 seprate 的set方法
     * @return
     */
    public void setSeprate(BigDecimal seprate){
        this.seprate = seprate;
    } 
	
    /**
     * 属性 peakregurate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPeakregurate(){
        return peakregurate;
    }
	
    /**
     * 属性 peakregurate 的set方法
     * @return
     */
    public void setPeakregurate(BigDecimal peakregurate){
        this.peakregurate = peakregurate;
    } 
	
    /**
     * 属性 isincludetax 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsincludetax(){
        return isincludetax;
    }
	
    /**
     * 属性 isincludetax 的set方法
     * @return
     */
    public void setIsincludetax(BigDecimal isincludetax){
        this.isincludetax = isincludetax;
    } 
	
    /**
     * 属性 power 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPower(){
        return power;
    }
	
    /**
     * 属性 power 的set方法
     * @return
     */
    public void setPower(BigDecimal power){
        this.power = power;
    } 
	
    /**
     * 属性 explanation 的get方法
     * @return String
     */
    public String getExplanation(){
        return explanation;
    }
	
    /**
     * 属性 explanation 的set方法
     * @return
     */
    public void setExplanation(String explanation){
        this.explanation = explanation;
    } 
	
    /**
     * 属性 transcap 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTranscap(){
        return transcap;
    }
	
    /**
     * 属性 transcap 的set方法
     * @return
     */
    public void setTranscap(BigDecimal transcap){
        this.transcap = transcap;
    } 
	
    /**
     * 属性 capprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapprice(){
        return capprice;
    }
	
    /**
     * 属性 capprice 的set方法
     * @return
     */
    public void setCapprice(BigDecimal capprice){
        this.capprice = capprice;
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
		
        if (o == null || !(o instanceof TrTradeanmtTransmission))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrTradeanmtTransmission other = (TrTradeanmtTransmission) o;	        
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
            .append("tradeanmtId"+":"+getTradeanmtId())
            .append("transmission"+":"+getTransmission())
            .append("linkid"+":"+getLinkid())
            .append("linkno"+":"+getLinkno())
            .append("gateid"+":"+getGateid())
            .append("startprice"+":"+getStartprice())
            .append("endprice"+":"+getEndprice())
            .append("transprice"+":"+getTransprice())
            .append("lossrate"+":"+getLossrate())
            .append("transqty"+":"+getTransqty())
            .append("capfee"+":"+getCapfee())
            .append("seprate"+":"+getSeprate())
            .append("peakregurate"+":"+getPeakregurate())
            .append("isincludetax"+":"+getIsincludetax())
            .append("power"+":"+getPower())
            .append("explanation"+":"+getExplanation())
            .append("transcap"+":"+getTranscap())
            .append("capprice"+":"+getCapprice())
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