package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeanmtResult的POJO类
 *
 * @author  nmm  [Sat Jun 21 15:39:50 CST 2014]
 * 
 */
public class TrTradeanmtResult implements Serializable{

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
     * 属性peakElcIn
     */
    private BigDecimal peakElcIn;
	
    /** 
     * 属性valleyElcIn
     */
    private BigDecimal valleyElcIn;
	
    /** 
     * 属性averageElcIn
     */
    private BigDecimal averageElcIn;
	
    /** 
     * 属性powerIn
     */
    private BigDecimal powerIn;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性retType
     */
    private BigDecimal retType;
	
    /** 
     * 属性refreshtime
     */
    private Timestamp refreshtime;
	
    /** 
     * 属性tradeTimepart
     */
    private BigDecimal tradeTimepart;
	
    /** 
     * 属性band
     */
    private BigDecimal band;
	
    /** 
     * 属性tradeRole
     */
    private BigDecimal tradeRole;
	
    /** 
     * 属性auditFlag
     */
    private String auditFlag;
	
    /** 
     * 属性peakElcSum
     */
    private BigDecimal peakElcSum;
	
    /** 
     * 属性valleyElcSum
     */
    private BigDecimal valleyElcSum;
	
    /** 
     * 属性averageElcSum
     */
    private BigDecimal averageElcSum;
	
    /** 
     * 属性powerSum
     */
    private BigDecimal powerSum;
	
    /** 
     * 属性peakElcOut
     */
    private BigDecimal peakElcOut;
	
    /** 
     * 属性valleyElcOut
     */
    private BigDecimal valleyElcOut;
	
    /** 
     * 属性averageElcOut
     */
    private BigDecimal averageElcOut;
	
    /** 
     * 属性powerOut
     */
    private BigDecimal powerOut;
	
    /**
     * TrTradeanmtResult构造函数
     */
    public TrTradeanmtResult() {
        super();
    }  
	
    /**
     * TrTradeanmtResult完整的构造函数
     */  
    public TrTradeanmtResult(String id,BigDecimal tradeseqId,String jydyId,String marketId,BigDecimal tradeTimepart){
        this.id = id;
        this.tradeseqId = tradeseqId;
        this.jydyId = jydyId;
        this.marketId = marketId;
        this.tradeTimepart = tradeTimepart;
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
     * 属性 peakElcIn 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPeakElcIn(){
        return peakElcIn;
    }
	
    /**
     * 属性 peakElcIn 的set方法
     * @return
     */
    public void setPeakElcIn(BigDecimal peakElcIn){
        this.peakElcIn = peakElcIn;
    } 
	
    /**
     * 属性 valleyElcIn 的get方法
     * @return BigDecimal
     */
    public BigDecimal getValleyElcIn(){
        return valleyElcIn;
    }
	
    /**
     * 属性 valleyElcIn 的set方法
     * @return
     */
    public void setValleyElcIn(BigDecimal valleyElcIn){
        this.valleyElcIn = valleyElcIn;
    } 
	
    /**
     * 属性 averageElcIn 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAverageElcIn(){
        return averageElcIn;
    }
	
    /**
     * 属性 averageElcIn 的set方法
     * @return
     */
    public void setAverageElcIn(BigDecimal averageElcIn){
        this.averageElcIn = averageElcIn;
    } 
	
    /**
     * 属性 powerIn 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowerIn(){
        return powerIn;
    }
	
    /**
     * 属性 powerIn 的set方法
     * @return
     */
    public void setPowerIn(BigDecimal powerIn){
        this.powerIn = powerIn;
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
     * 属性 retType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRetType(){
        return retType;
    }
	
    /**
     * 属性 retType 的set方法
     * @return
     */
    public void setRetType(BigDecimal retType){
        this.retType = retType;
    } 
	
    /**
     * 属性 refreshtime 的get方法
     * @return Date
     */
    public Timestamp getRefreshtime(){
        return refreshtime;
    }
	
    /**
     * 属性 refreshtime 的set方法
     * @return
     */
    public void setRefreshtime(Timestamp refreshtime){
        this.refreshtime = refreshtime;
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
     * 属性 band 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBand(){
        return band;
    }
	
    /**
     * 属性 band 的set方法
     * @return
     */
    public void setBand(BigDecimal band){
        this.band = band;
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
     * 属性 auditFlag 的get方法
     * @return String
     */
    public String getAuditFlag(){
        return auditFlag;
    }
	
    /**
     * 属性 auditFlag 的set方法
     * @return
     */
    public void setAuditFlag(String auditFlag){
        this.auditFlag = auditFlag;
    } 
	
    /**
     * 属性 peakElcSum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPeakElcSum(){
        return peakElcSum;
    }
	
    /**
     * 属性 peakElcSum 的set方法
     * @return
     */
    public void setPeakElcSum(BigDecimal peakElcSum){
        this.peakElcSum = peakElcSum;
    } 
	
    /**
     * 属性 valleyElcSum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getValleyElcSum(){
        return valleyElcSum;
    }
	
    /**
     * 属性 valleyElcSum 的set方法
     * @return
     */
    public void setValleyElcSum(BigDecimal valleyElcSum){
        this.valleyElcSum = valleyElcSum;
    } 
	
    /**
     * 属性 averageElcSum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAverageElcSum(){
        return averageElcSum;
    }
	
    /**
     * 属性 averageElcSum 的set方法
     * @return
     */
    public void setAverageElcSum(BigDecimal averageElcSum){
        this.averageElcSum = averageElcSum;
    } 
	
    /**
     * 属性 powerSum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowerSum(){
        return powerSum;
    }
	
    /**
     * 属性 powerSum 的set方法
     * @return
     */
    public void setPowerSum(BigDecimal powerSum){
        this.powerSum = powerSum;
    } 
	
    /**
     * 属性 peakElcOut 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPeakElcOut(){
        return peakElcOut;
    }
	
    /**
     * 属性 peakElcOut 的set方法
     * @return
     */
    public void setPeakElcOut(BigDecimal peakElcOut){
        this.peakElcOut = peakElcOut;
    } 
	
    /**
     * 属性 valleyElcOut 的get方法
     * @return BigDecimal
     */
    public BigDecimal getValleyElcOut(){
        return valleyElcOut;
    }
	
    /**
     * 属性 valleyElcOut 的set方法
     * @return
     */
    public void setValleyElcOut(BigDecimal valleyElcOut){
        this.valleyElcOut = valleyElcOut;
    } 
	
    /**
     * 属性 averageElcOut 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAverageElcOut(){
        return averageElcOut;
    }
	
    /**
     * 属性 averageElcOut 的set方法
     * @return
     */
    public void setAverageElcOut(BigDecimal averageElcOut){
        this.averageElcOut = averageElcOut;
    } 
	
    /**
     * 属性 powerOut 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowerOut(){
        return powerOut;
    }
	
    /**
     * 属性 powerOut 的set方法
     * @return
     */
    public void setPowerOut(BigDecimal powerOut){
        this.powerOut = powerOut;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTradeanmtResult))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrTradeanmtResult other = (TrTradeanmtResult) o;	        
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
            .append("peakElcIn"+":"+getPeakElcIn())
            .append("valleyElcIn"+":"+getValleyElcIn())
            .append("averageElcIn"+":"+getAverageElcIn())
            .append("powerIn"+":"+getPowerIn())
            .append("marketId"+":"+getMarketId())
            .append("retType"+":"+getRetType())
            .append("refreshtime"+":"+getRefreshtime())
            .append("tradeTimepart"+":"+getTradeTimepart())
            .append("band"+":"+getBand())
            .append("tradeRole"+":"+getTradeRole())
            .append("auditFlag"+":"+getAuditFlag())
            .append("peakElcSum"+":"+getPeakElcSum())
            .append("valleyElcSum"+":"+getValleyElcSum())
            .append("averageElcSum"+":"+getAverageElcSum())
            .append("powerSum"+":"+getPowerSum())
            .append("peakElcOut"+":"+getPeakElcOut())
            .append("valleyElcOut"+":"+getValleyElcOut())
            .append("averageElcOut"+":"+getAverageElcOut())
            .append("powerOut"+":"+getPowerOut())
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