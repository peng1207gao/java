package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrBidinfoJydyLog的POJO类
 *
 * @author  Administrator  [Thu Feb 20 12:37:34 CST 2014]
 * 
 */
public class TrBidinfoJydyLog implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性bidinfoid
     */
    private String bidinfoid;
	
    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性jydyId
     */
    private String jydyId;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性interval
     */
    private BigDecimal interval;
	
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
     * 属性energy
     */
    private String energy;
	
    /** 
     * 属性price
     */
    private String price;
	
    /** 
     * 属性energyPeriod1
     */
    private String energyPeriod1;
	
    /** 
     * 属性pricePeriod1
     */
    private String pricePeriod1;
	
    /** 
     * 属性energyPeriod2
     */
    private String energyPeriod2;
	
    /** 
     * 属性pricePeriod2
     */
    private String pricePeriod2;
	
    /** 
     * 属性energyPeriod3
     */
    private String energyPeriod3;
	
    /** 
     * 属性pricePeriod3
     */
    private String pricePeriod3;
	
    /** 
     * 属性energyPeriod4
     */
    private String energyPeriod4;
	
    /** 
     * 属性pricePeriod4
     */
    private String pricePeriod4;
	
    /** 
     * 属性energyPeriod5
     */
    private String energyPeriod5;
	
    /** 
     * 属性pricePeriod5
     */
    private String pricePeriod5;
	
    /** 
     * 属性checkEnergy
     */
    private String checkEnergy;
	
    /** 
     * 属性checkEnergyPeriod1
     */
    private String checkEnergyPeriod1;
	
    /** 
     * 属性checkEnergyPeriod2
     */
    private String checkEnergyPeriod2;
	
    /** 
     * 属性checkEnergyPeriod3
     */
    private String checkEnergyPeriod3;
	
    /** 
     * 属性checkEnergyPeriod4
     */
    private String checkEnergyPeriod4;
	
    /** 
     * 属性checkEnergyPeriod5
     */
    private String checkEnergyPeriod5;
	
    /** 
     * 属性powerId
     */
    private String powerId;
	
    /** 
     * 属性stDate
     */
    private Date stDate;
	
    /** 
     * 属性endDate
     */
    private Date endDate;
	
    /** 
     * 属性updateTime
     */
    private Date updateTime;
	
    /** 
     * 属性bidPerson
     */
    private String bidPerson;
	
    /** 
     * 属性defaultI1
     */
    private BigDecimal defaultI1;
	
    /** 
     * 属性defaultI2
     */
    private BigDecimal defaultI2;
	
    /** 
     * 属性defaultF1
     */
    private BigDecimal defaultF1;
	
    /** 
     * 属性defaultF2
     */
    private BigDecimal defaultF2;
	
    /** 
     * 属性defaultUc1
     */
    private String defaultUc1;
	
    /** 
     * 属性defaultUc2
     */
    private String defaultUc2;
	
    /** 
     * 属性validateFlag
     */
    private BigDecimal validateFlag;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性reason
     */
    private String reason;
	
    /** 
     * 属性saleLoss
     */
    private BigDecimal saleLoss;
	
    /** 
     * 属性vendeeLoss
     */
    private BigDecimal vendeeLoss;
	
    /** 
     * 属性vendeeBreathPrice
     */
    private BigDecimal vendeeBreathPrice;
	
    /** 
     * 属性saleBreathPrice
     */
    private BigDecimal saleBreathPrice;
	
    /**
     * 用户最大电力
     */
    private BigDecimal userMaxPower;
    /**
     * 申报状态
     */
    private BigDecimal bidStatus;
    
    
    /**
     * TrBidinfoJydyLog构造函数
     */
    public TrBidinfoJydyLog() {
        super();
    }  
	
    /**
     * TrBidinfoJydyLog完整的构造函数
     */  
    public TrBidinfoJydyLog(String guid,String bidinfoid){
        this.guid = guid;
        this.bidinfoid = bidinfoid;
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
        this.guid = guid;
    } 
	
    public BigDecimal getUserMaxPower() {
		return userMaxPower;
	}

	public void setUserMaxPower(BigDecimal userMaxPower) {
		this.userMaxPower = userMaxPower;
	}

	public BigDecimal getBidStatus() {
		return bidStatus;
	}

	public void setBidStatus(BigDecimal bidStatus) {
		this.bidStatus = bidStatus;
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
        if(bidinfoid != null && bidinfoid.trim().length() == 0){
            this.bidinfoid = null;
        }else{
            this.bidinfoid = bidinfoid;
        }
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
        this.id = id;
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
     * 属性 interval 的get方法
     * @return BigDecimal
     */
    public BigDecimal getInterval(){
        return interval;
    }
	
    /**
     * 属性 interval 的set方法
     * @return
     */
    public void setInterval(BigDecimal interval){
        this.interval = interval;
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
     * 属性 energy 的get方法
     * @return String
     */
    public String getEnergy(){
        return energy;
    }
	
    /**
     * 属性 energy 的set方法
     * @return
     */
    public void setEnergy(String energy){
        this.energy = energy;
    } 
	
    /**
     * 属性 price 的get方法
     * @return String
     */
    public String getPrice(){
        return price;
    }
	
    /**
     * 属性 price 的set方法
     * @return
     */
    public void setPrice(String price){
        this.price = price;
    } 
	
    /**
     * 属性 energyPeriod1 的get方法
     * @return String
     */
    public String getEnergyPeriod1(){
        return energyPeriod1;
    }
	
    /**
     * 属性 energyPeriod1 的set方法
     * @return
     */
    public void setEnergyPeriod1(String energyPeriod1){
        this.energyPeriod1 = energyPeriod1;
    } 
	
    /**
     * 属性 pricePeriod1 的get方法
     * @return String
     */
    public String getPricePeriod1(){
        return pricePeriod1;
    }
	
    /**
     * 属性 pricePeriod1 的set方法
     * @return
     */
    public void setPricePeriod1(String pricePeriod1){
        this.pricePeriod1 = pricePeriod1;
    } 
	
    /**
     * 属性 energyPeriod2 的get方法
     * @return String
     */
    public String getEnergyPeriod2(){
        return energyPeriod2;
    }
	
    /**
     * 属性 energyPeriod2 的set方法
     * @return
     */
    public void setEnergyPeriod2(String energyPeriod2){
        this.energyPeriod2 = energyPeriod2;
    } 
	
    /**
     * 属性 pricePeriod2 的get方法
     * @return String
     */
    public String getPricePeriod2(){
        return pricePeriod2;
    }
	
    /**
     * 属性 pricePeriod2 的set方法
     * @return
     */
    public void setPricePeriod2(String pricePeriod2){
        this.pricePeriod2 = pricePeriod2;
    } 
	
    /**
     * 属性 energyPeriod3 的get方法
     * @return String
     */
    public String getEnergyPeriod3(){
        return energyPeriod3;
    }
	
    /**
     * 属性 energyPeriod3 的set方法
     * @return
     */
    public void setEnergyPeriod3(String energyPeriod3){
        this.energyPeriod3 = energyPeriod3;
    } 
	
    /**
     * 属性 pricePeriod3 的get方法
     * @return String
     */
    public String getPricePeriod3(){
        return pricePeriod3;
    }
	
    /**
     * 属性 pricePeriod3 的set方法
     * @return
     */
    public void setPricePeriod3(String pricePeriod3){
        this.pricePeriod3 = pricePeriod3;
    } 
	
    /**
     * 属性 energyPeriod4 的get方法
     * @return String
     */
    public String getEnergyPeriod4(){
        return energyPeriod4;
    }
	
    /**
     * 属性 energyPeriod4 的set方法
     * @return
     */
    public void setEnergyPeriod4(String energyPeriod4){
        this.energyPeriod4 = energyPeriod4;
    } 
	
    /**
     * 属性 pricePeriod4 的get方法
     * @return String
     */
    public String getPricePeriod4(){
        return pricePeriod4;
    }
	
    /**
     * 属性 pricePeriod4 的set方法
     * @return
     */
    public void setPricePeriod4(String pricePeriod4){
        this.pricePeriod4 = pricePeriod4;
    } 
	
    /**
     * 属性 energyPeriod5 的get方法
     * @return String
     */
    public String getEnergyPeriod5(){
        return energyPeriod5;
    }
	
    /**
     * 属性 energyPeriod5 的set方法
     * @return
     */
    public void setEnergyPeriod5(String energyPeriod5){
        this.energyPeriod5 = energyPeriod5;
    } 
	
    /**
     * 属性 pricePeriod5 的get方法
     * @return String
     */
    public String getPricePeriod5(){
        return pricePeriod5;
    }
	
    /**
     * 属性 pricePeriod5 的set方法
     * @return
     */
    public void setPricePeriod5(String pricePeriod5){
        this.pricePeriod5 = pricePeriod5;
    } 
	
    /**
     * 属性 checkEnergy 的get方法
     * @return String
     */
    public String getCheckEnergy(){
        return checkEnergy;
    }
	
    /**
     * 属性 checkEnergy 的set方法
     * @return
     */
    public void setCheckEnergy(String checkEnergy){
        this.checkEnergy = checkEnergy;
    } 
	
    /**
     * 属性 checkEnergyPeriod1 的get方法
     * @return String
     */
    public String getCheckEnergyPeriod1(){
        return checkEnergyPeriod1;
    }
	
    /**
     * 属性 checkEnergyPeriod1 的set方法
     * @return
     */
    public void setCheckEnergyPeriod1(String checkEnergyPeriod1){
        this.checkEnergyPeriod1 = checkEnergyPeriod1;
    } 
	
    /**
     * 属性 checkEnergyPeriod2 的get方法
     * @return String
     */
    public String getCheckEnergyPeriod2(){
        return checkEnergyPeriod2;
    }
	
    /**
     * 属性 checkEnergyPeriod2 的set方法
     * @return
     */
    public void setCheckEnergyPeriod2(String checkEnergyPeriod2){
        this.checkEnergyPeriod2 = checkEnergyPeriod2;
    } 
	
    /**
     * 属性 checkEnergyPeriod3 的get方法
     * @return String
     */
    public String getCheckEnergyPeriod3(){
        return checkEnergyPeriod3;
    }
	
    /**
     * 属性 checkEnergyPeriod3 的set方法
     * @return
     */
    public void setCheckEnergyPeriod3(String checkEnergyPeriod3){
        this.checkEnergyPeriod3 = checkEnergyPeriod3;
    } 
	
    /**
     * 属性 checkEnergyPeriod4 的get方法
     * @return String
     */
    public String getCheckEnergyPeriod4(){
        return checkEnergyPeriod4;
    }
	
    /**
     * 属性 checkEnergyPeriod4 的set方法
     * @return
     */
    public void setCheckEnergyPeriod4(String checkEnergyPeriod4){
        this.checkEnergyPeriod4 = checkEnergyPeriod4;
    } 
	
    /**
     * 属性 checkEnergyPeriod5 的get方法
     * @return String
     */
    public String getCheckEnergyPeriod5(){
        return checkEnergyPeriod5;
    }
	
    /**
     * 属性 checkEnergyPeriod5 的set方法
     * @return
     */
    public void setCheckEnergyPeriod5(String checkEnergyPeriod5){
        this.checkEnergyPeriod5 = checkEnergyPeriod5;
    } 
	
    /**
     * 属性 powerId 的get方法
     * @return String
     */
    public String getPowerId(){
        return powerId;
    }
	
    /**
     * 属性 powerId 的set方法
     * @return
     */
    public void setPowerId(String powerId){
        this.powerId = powerId;
    } 
	
    /**
     * 属性 stDate 的get方法
     * @return Date
     */
    public Date getStDate(){
        return stDate;
    }
	
    /**
     * 属性 stDate 的set方法
     * @return
     */
    public void setStDate(Date stDate){
        this.stDate = stDate;
    } 
	
    /**
     * 属性 endDate 的get方法
     * @return Date
     */
    public Date getEndDate(){
        return endDate;
    }
	
    /**
     * 属性 endDate 的set方法
     * @return
     */
    public void setEndDate(Date endDate){
        this.endDate = endDate;
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
     * 属性 defaultI1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDefaultI1(){
        return defaultI1;
    }
	
    /**
     * 属性 defaultI1 的set方法
     * @return
     */
    public void setDefaultI1(BigDecimal defaultI1){
        this.defaultI1 = defaultI1;
    } 
	
    /**
     * 属性 defaultI2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDefaultI2(){
        return defaultI2;
    }
	
    /**
     * 属性 defaultI2 的set方法
     * @return
     */
    public void setDefaultI2(BigDecimal defaultI2){
        this.defaultI2 = defaultI2;
    } 
	
    /**
     * 属性 defaultF1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDefaultF1(){
        return defaultF1;
    }
	
    /**
     * 属性 defaultF1 的set方法
     * @return
     */
    public void setDefaultF1(BigDecimal defaultF1){
        this.defaultF1 = defaultF1;
    } 
	
    /**
     * 属性 defaultF2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDefaultF2(){
        return defaultF2;
    }
	
    /**
     * 属性 defaultF2 的set方法
     * @return
     */
    public void setDefaultF2(BigDecimal defaultF2){
        this.defaultF2 = defaultF2;
    } 
	
    /**
     * 属性 defaultUc1 的get方法
     * @return String
     */
    public String getDefaultUc1(){
        return defaultUc1;
    }
	
    /**
     * 属性 defaultUc1 的set方法
     * @return
     */
    public void setDefaultUc1(String defaultUc1){
        this.defaultUc1 = defaultUc1;
    } 
	
    /**
     * 属性 defaultUc2 的get方法
     * @return String
     */
    public String getDefaultUc2(){
        return defaultUc2;
    }
	
    /**
     * 属性 defaultUc2 的set方法
     * @return
     */
    public void setDefaultUc2(String defaultUc2){
        this.defaultUc2 = defaultUc2;
    } 
	
    /**
     * 属性 validateFlag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getValidateFlag(){
        return validateFlag;
    }
	
    /**
     * 属性 validateFlag 的set方法
     * @return
     */
    public void setValidateFlag(BigDecimal validateFlag){
        this.validateFlag = validateFlag;
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
     * 属性 reason 的get方法
     * @return String
     */
    public String getReason(){
        return reason;
    }
	
    /**
     * 属性 reason 的set方法
     * @return
     */
    public void setReason(String reason){
        this.reason = reason;
    } 
	
    /**
     * 属性 saleLoss 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleLoss(){
        return saleLoss;
    }
	
    /**
     * 属性 saleLoss 的set方法
     * @return
     */
    public void setSaleLoss(BigDecimal saleLoss){
        this.saleLoss = saleLoss;
    } 
	
    /**
     * 属性 vendeeLoss 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeLoss(){
        return vendeeLoss;
    }
	
    /**
     * 属性 vendeeLoss 的set方法
     * @return
     */
    public void setVendeeLoss(BigDecimal vendeeLoss){
        this.vendeeLoss = vendeeLoss;
    } 
	
    /**
     * 属性 vendeeBreathPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeBreathPrice(){
        return vendeeBreathPrice;
    }
	
    /**
     * 属性 vendeeBreathPrice 的set方法
     * @return
     */
    public void setVendeeBreathPrice(BigDecimal vendeeBreathPrice){
        this.vendeeBreathPrice = vendeeBreathPrice;
    } 
	
    /**
     * 属性 saleBreathPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleBreathPrice(){
        return saleBreathPrice;
    }
	
    /**
     * 属性 saleBreathPrice 的set方法
     * @return
     */
    public void setSaleBreathPrice(BigDecimal saleBreathPrice){
        this.saleBreathPrice = saleBreathPrice;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrBidinfoJydyLog))
	        return false; 
			
        if(getBidinfoid() == null) 
	        return false;

        TrBidinfoJydyLog other = (TrBidinfoJydyLog) o;	        
	    return new EqualsBuilder()
            .append(this.getBidinfoid(), other.getBidinfoid())
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
            .append("id"+":"+getId())
            .append("jydyId"+":"+getJydyId())
            .append("tradeseqId"+":"+getTradeseqId())
            .append("interval"+":"+getInterval())
            .append("tradeTimepart"+":"+getTradeTimepart())
            .append("band"+":"+getBand())
            .append("tradeRole"+":"+getTradeRole())
            .append("energy"+":"+getEnergy())
            .append("price"+":"+getPrice())
            .append("energyPeriod1"+":"+getEnergyPeriod1())
            .append("pricePeriod1"+":"+getPricePeriod1())
            .append("energyPeriod2"+":"+getEnergyPeriod2())
            .append("pricePeriod2"+":"+getPricePeriod2())
            .append("energyPeriod3"+":"+getEnergyPeriod3())
            .append("pricePeriod3"+":"+getPricePeriod3())
            .append("energyPeriod4"+":"+getEnergyPeriod4())
            .append("pricePeriod4"+":"+getPricePeriod4())
            .append("energyPeriod5"+":"+getEnergyPeriod5())
            .append("pricePeriod5"+":"+getPricePeriod5())
            .append("checkEnergy"+":"+getCheckEnergy())
            .append("checkEnergyPeriod1"+":"+getCheckEnergyPeriod1())
            .append("checkEnergyPeriod2"+":"+getCheckEnergyPeriod2())
            .append("checkEnergyPeriod3"+":"+getCheckEnergyPeriod3())
            .append("checkEnergyPeriod4"+":"+getCheckEnergyPeriod4())
            .append("checkEnergyPeriod5"+":"+getCheckEnergyPeriod5())
            .append("powerId"+":"+getPowerId())
            .append("stDate"+":"+getStDate())
            .append("endDate"+":"+getEndDate())
            .append("updateTime"+":"+getUpdateTime())
            .append("bidPerson"+":"+getBidPerson())
            .append("defaultI1"+":"+getDefaultI1())
            .append("defaultI2"+":"+getDefaultI2())
            .append("defaultF1"+":"+getDefaultF1())
            .append("defaultF2"+":"+getDefaultF2())
            .append("defaultUc1"+":"+getDefaultUc1())
            .append("defaultUc2"+":"+getDefaultUc2())
            .append("validateFlag"+":"+getValidateFlag())
            .append("marketId"+":"+getMarketId())
            .append("reason"+":"+getReason())
            .append("saleLoss"+":"+getSaleLoss())
            .append("vendeeLoss"+":"+getVendeeLoss())
            .append("vendeeBreathPrice"+":"+getVendeeBreathPrice())
            .append("saleBreathPrice"+":"+getSaleBreathPrice())
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