package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeanmtReport的POJO类
 *
 * @author  DWJ  [Fri Jun 20 18:19:29 CST 2014]
 * 
 */
public class TrTradeanmtReport implements Serializable{

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
     * 属性peakElc
     */
    private BigDecimal peakElc;
	
    /** 
     * 属性valleyElc
     */
    private BigDecimal valleyElc;
	
    /** 
     * 属性averageElc
     */
    private BigDecimal averageElc;
	
    /** 
     * 属性power
     */
    private BigDecimal power;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性refreshtime
     */
    private Date refreshtime;
	
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
     * 属性updateTime
     */
    private Date updateTime;
	
    /** 
     * 属性bidPerson
     */
    private String bidPerson;
	
    /**
     * TrTradeanmtReport构造函数
     */
    public TrTradeanmtReport() {
        super();
    }  
	
    /**
     * TrTradeanmtReport完整的构造函数
     */  
    public TrTradeanmtReport(String id,BigDecimal tradeseqId,String jydyId,String marketId,BigDecimal tradeTimepart){
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
     * 属性 peakElc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPeakElc(){
        return peakElc;
    }
	
    /**
     * 属性 peakElc 的set方法
     * @return
     */
    public void setPeakElc(BigDecimal peakElc){
        this.peakElc = peakElc;
    } 
	
    /**
     * 属性 valleyElc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getValleyElc(){
        return valleyElc;
    }
	
    /**
     * 属性 valleyElc 的set方法
     * @return
     */
    public void setValleyElc(BigDecimal valleyElc){
        this.valleyElc = valleyElc;
    } 
	
    /**
     * 属性 averageElc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAverageElc(){
        return averageElc;
    }
	
    /**
     * 属性 averageElc 的set方法
     * @return
     */
    public void setAverageElc(BigDecimal averageElc){
        this.averageElc = averageElc;
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
     * 属性 refreshtime 的get方法
     * @return Date
     */
    public Date getRefreshtime(){
        return refreshtime;
    }
	
    /**
     * 属性 refreshtime 的set方法
     * @return
     */
    public void setRefreshtime(Date refreshtime){
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
     * 属性 updateTime 的get方法
     * @return Date
     */
    public Date getUpdateTime(){
        return updateTime;
    }
	
    /**
     * 属性 updateTime 的set方法
     * @return
     */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    } 
	
    /**
     * 属性 bidPerson 的get方法
     * @return String
     */
    public String getBidPerson(){
        return bidPerson;
    }
	
    /**
     * 属性 bidPerson 的set方法
     * @return
     */
    public void setBidPerson(String bidPerson){
        this.bidPerson = bidPerson;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTradeanmtReport))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrTradeanmtReport other = (TrTradeanmtReport) o;	        
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
            .append("peakElc"+":"+getPeakElc())
            .append("valleyElc"+":"+getValleyElc())
            .append("averageElc"+":"+getAverageElc())
            .append("power"+":"+getPower())
            .append("marketId"+":"+getMarketId())
            .append("refreshtime"+":"+getRefreshtime())
            .append("tradeTimepart"+":"+getTradeTimepart())
            .append("band"+":"+getBand())
            .append("tradeRole"+":"+getTradeRole())
            .append("updateTime"+":"+getUpdateTime())
            .append("bidPerson"+":"+getBidPerson())
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