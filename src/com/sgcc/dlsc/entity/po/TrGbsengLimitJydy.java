package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrGbsengLimitJydy的POJO类
 *
 * @author  Administrator  [Tue Nov 05 18:06:47 CST 2013]
 * 
 */
public class TrGbsengLimitJydy implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性tradeunitId
     */
    private String tradeunitId;
	
    /** 
     * 属性tradeRole
     */
    private BigDecimal tradeRole;
	
    /** 
     * 属性tradeTimepart
     */
    private BigDecimal tradeTimepart;
	
    /** 
     * 属性energyHiLmt
     */
    private BigDecimal energyHiLmt;
	
    /** 
     * 属性energyLowLmt
     */
    private BigDecimal energyLowLmt;
	
    /** 
     * 属性energyHiLmtPeriod1
     */
    private BigDecimal energyHiLmtPeriod1;
	
    /** 
     * 属性energyLowLmtPeriod1
     */
    private BigDecimal energyLowLmtPeriod1;
	
    /** 
     * 属性energyHiLmtPeriod2
     */
    private BigDecimal energyHiLmtPeriod2;
	
    /** 
     * 属性energyLowLmtPeriod2
     */
    private BigDecimal energyLowLmtPeriod2;
	
    /** 
     * 属性energyHiLmtPeriod3
     */
    private BigDecimal energyHiLmtPeriod3;
	
    /** 
     * 属性energyLowLmtPeriod3
     */
    private BigDecimal energyLowLmtPeriod3;
	
    /** 
     * 属性energyHiLmtPeriod4
     */
    private BigDecimal energyHiLmtPeriod4;
	
    /** 
     * 属性energyLowLmtPeriod4
     */
    private BigDecimal energyLowLmtPeriod4;
	
    /** 
     * 属性energyHiLmtPeriod5
     */
    private BigDecimal energyHiLmtPeriod5;
	
    /** 
     * 属性energyLowLmtPeriod5
     */
    private BigDecimal energyLowLmtPeriod5;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性updateTime
     */
    private Date updateTime;
	
    /**
     * TrGbsengLimitJydy构造函数
     */
    public TrGbsengLimitJydy() {
        super();
    }  
	
    /**
     * TrGbsengLimitJydy完整的构造函数
     */  
    public TrGbsengLimitJydy(String guid,BigDecimal tradeseqId,String tradeunitId,BigDecimal tradeRole,BigDecimal tradeTimepart){
        this.guid = guid;
        this.tradeseqId = tradeseqId;
        this.tradeunitId = tradeunitId;
        this.tradeRole = tradeRole;
        this.tradeTimepart = tradeTimepart;
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
     * 属性 tradeunitId 的get方法
     * @return String
     */
    public String getTradeunitId(){
        return tradeunitId;
    }
	
    /**
     * 属性 tradeunitId 的set方法
     * @return
     */
    public void setTradeunitId(String tradeunitId){
        this.tradeunitId = tradeunitId;
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
     * 属性 energyHiLmt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyHiLmt(){
        return energyHiLmt;
    }
	
    /**
     * 属性 energyHiLmt 的set方法
     * @return
     */
    public void setEnergyHiLmt(BigDecimal energyHiLmt){
        this.energyHiLmt = energyHiLmt;
    } 
	
	
	
    /**
     * 属性 energyLowLmt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyLowLmt(){
        return energyLowLmt;
    }
	
    /**
     * 属性 energyLowLmt 的set方法
     * @return
     */
    public void setEnergyLowLmt(BigDecimal energyLowLmt){
        this.energyLowLmt = energyLowLmt;
    } 
	
	
	
    /**
     * 属性 energyHiLmtPeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyHiLmtPeriod1(){
        return energyHiLmtPeriod1;
    }
	
    /**
     * 属性 energyHiLmtPeriod1 的set方法
     * @return
     */
    public void setEnergyHiLmtPeriod1(BigDecimal energyHiLmtPeriod1){
        this.energyHiLmtPeriod1 = energyHiLmtPeriod1;
    } 
	
	
	
    /**
     * 属性 energyLowLmtPeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyLowLmtPeriod1(){
        return energyLowLmtPeriod1;
    }
	
    /**
     * 属性 energyLowLmtPeriod1 的set方法
     * @return
     */
    public void setEnergyLowLmtPeriod1(BigDecimal energyLowLmtPeriod1){
        this.energyLowLmtPeriod1 = energyLowLmtPeriod1;
    } 
	
	
	
    /**
     * 属性 energyHiLmtPeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyHiLmtPeriod2(){
        return energyHiLmtPeriod2;
    }
	
    /**
     * 属性 energyHiLmtPeriod2 的set方法
     * @return
     */
    public void setEnergyHiLmtPeriod2(BigDecimal energyHiLmtPeriod2){
        this.energyHiLmtPeriod2 = energyHiLmtPeriod2;
    } 
	
	
	
    /**
     * 属性 energyLowLmtPeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyLowLmtPeriod2(){
        return energyLowLmtPeriod2;
    }
	
    /**
     * 属性 energyLowLmtPeriod2 的set方法
     * @return
     */
    public void setEnergyLowLmtPeriod2(BigDecimal energyLowLmtPeriod2){
        this.energyLowLmtPeriod2 = energyLowLmtPeriod2;
    } 
	
	
	
    /**
     * 属性 energyHiLmtPeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyHiLmtPeriod3(){
        return energyHiLmtPeriod3;
    }
	
    /**
     * 属性 energyHiLmtPeriod3 的set方法
     * @return
     */
    public void setEnergyHiLmtPeriod3(BigDecimal energyHiLmtPeriod3){
        this.energyHiLmtPeriod3 = energyHiLmtPeriod3;
    } 
	
	
	
    /**
     * 属性 energyLowLmtPeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyLowLmtPeriod3(){
        return energyLowLmtPeriod3;
    }
	
    /**
     * 属性 energyLowLmtPeriod3 的set方法
     * @return
     */
    public void setEnergyLowLmtPeriod3(BigDecimal energyLowLmtPeriod3){
        this.energyLowLmtPeriod3 = energyLowLmtPeriod3;
    } 
	
	
	
    /**
     * 属性 energyHiLmtPeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyHiLmtPeriod4(){
        return energyHiLmtPeriod4;
    }
	
    /**
     * 属性 energyHiLmtPeriod4 的set方法
     * @return
     */
    public void setEnergyHiLmtPeriod4(BigDecimal energyHiLmtPeriod4){
        this.energyHiLmtPeriod4 = energyHiLmtPeriod4;
    } 
	
	
	
    /**
     * 属性 energyLowLmtPeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyLowLmtPeriod4(){
        return energyLowLmtPeriod4;
    }
	
    /**
     * 属性 energyLowLmtPeriod4 的set方法
     * @return
     */
    public void setEnergyLowLmtPeriod4(BigDecimal energyLowLmtPeriod4){
        this.energyLowLmtPeriod4 = energyLowLmtPeriod4;
    } 
	
	
	
    /**
     * 属性 energyHiLmtPeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyHiLmtPeriod5(){
        return energyHiLmtPeriod5;
    }
	
    /**
     * 属性 energyHiLmtPeriod5 的set方法
     * @return
     */
    public void setEnergyHiLmtPeriod5(BigDecimal energyHiLmtPeriod5){
        this.energyHiLmtPeriod5 = energyHiLmtPeriod5;
    } 
	
	
	
    /**
     * 属性 energyLowLmtPeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyLowLmtPeriod5(){
        return energyLowLmtPeriod5;
    }
	
    /**
     * 属性 energyLowLmtPeriod5 的set方法
     * @return
     */
    public void setEnergyLowLmtPeriod5(BigDecimal energyLowLmtPeriod5){
        this.energyLowLmtPeriod5 = energyLowLmtPeriod5;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrGbsengLimitJydy))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrGbsengLimitJydy other = (TrGbsengLimitJydy) o;	        
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
            .append("tradeunitId"+":"+getTradeunitId())
            .append("tradeRole"+":"+getTradeRole())
            .append("tradeTimepart"+":"+getTradeTimepart())
            .append("energyHiLmt"+":"+getEnergyHiLmt())
            .append("energyLowLmt"+":"+getEnergyLowLmt())
            .append("energyHiLmtPeriod1"+":"+getEnergyHiLmtPeriod1())
            .append("energyLowLmtPeriod1"+":"+getEnergyLowLmtPeriod1())
            .append("energyHiLmtPeriod2"+":"+getEnergyHiLmtPeriod2())
            .append("energyLowLmtPeriod2"+":"+getEnergyLowLmtPeriod2())
            .append("energyHiLmtPeriod3"+":"+getEnergyHiLmtPeriod3())
            .append("energyLowLmtPeriod3"+":"+getEnergyLowLmtPeriod3())
            .append("energyHiLmtPeriod4"+":"+getEnergyHiLmtPeriod4())
            .append("energyLowLmtPeriod4"+":"+getEnergyLowLmtPeriod4())
            .append("energyHiLmtPeriod5"+":"+getEnergyHiLmtPeriod5())
            .append("energyLowLmtPeriod5"+":"+getEnergyLowLmtPeriod5())
            .append("marketId"+":"+getMarketId())
            .append("updateTime"+":"+getUpdateTime())
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