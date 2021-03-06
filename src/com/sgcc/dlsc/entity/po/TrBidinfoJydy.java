package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrBidinfoJydy的POJO类
 *
 * @author  sss  [Tue Dec 03 09:07:49 CST 2013]
 * 
 */
public class TrBidinfoJydy implements Serializable{

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
    private BigDecimal energy;
	
    /** 
     * 属性price
     */
    private BigDecimal price;
	
    /** 
     * 属性energyPeriod1
     */
    private BigDecimal energyPeriod1;
	
    /** 
     * 属性pricePeriod1
     */
    private BigDecimal pricePeriod1;
	
    /** 
     * 属性energyPeriod2
     */
    private BigDecimal energyPeriod2;
	
    /** 
     * 属性pricePeriod2
     */
    private BigDecimal pricePeriod2;
	
    /** 
     * 属性energyPeriod3
     */
    private BigDecimal energyPeriod3;
	
    /** 
     * 属性pricePeriod3
     */
    private BigDecimal pricePeriod3;
	
    /** 
     * 属性energyPeriod4
     */
    private BigDecimal energyPeriod4;
	
    /** 
     * 属性pricePeriod4
     */
    private BigDecimal pricePeriod4;
	
    /** 
     * 属性energyPeriod5
     */
    private BigDecimal energyPeriod5;
	
    /** 
     * 属性pricePeriod5
     */
    private BigDecimal pricePeriod5;
	
    /** 
     * 属性checkEnergy
     */
    private BigDecimal checkEnergy;
	
    /** 
     * 属性checkEnergyPeriod1
     */
    private BigDecimal checkEnergyPeriod1;
	
    /** 
     * 属性checkEnergyPeriod2
     */
    private BigDecimal checkEnergyPeriod2;
	
    /** 
     * 属性checkEnergyPeriod3
     */
    private BigDecimal checkEnergyPeriod3;
	
    /** 
     * 属性checkEnergyPeriod4
     */
    private BigDecimal checkEnergyPeriod4;
	
    /** 
     * 属性checkEnergyPeriod5
     */
    private BigDecimal checkEnergyPeriod5;
	
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
    private Timestamp updateTime;
	
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
     * 属性tradeTimepart
     */
    private BigDecimal tradeTimepart;
	
    /** 
     * 属性reason
     */
    private String reason;
    /**
     * 购方网损
     */
    private BigDecimal vendeeLoss;
    /**
     * 售方网损
     */
    private BigDecimal saleLoss;
    /**
     * 售方违约电价
     */
    private BigDecimal saleBreathPrice;
    /**
     * 购方违约电价
     */
    private BigDecimal vendeeBreathPrice;
    /**
     * 用户最大电力
     */
    private BigDecimal userMaxPower;
    /**
     * 申报状态
     */
    private BigDecimal bidStatus;
    
	
    /**
     * TrBidinfoJydy构造函数
     */
    public TrBidinfoJydy() {
        super();
    }  
	
    /**
     * TrBidinfoJydy完整的构造函数
     */  
    public TrBidinfoJydy(String bidinfoid,BigDecimal tradeTimepart){
        this.bidinfoid = bidinfoid;
        this.tradeTimepart = tradeTimepart;
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
     * @return BigDecimal
     */
    public BigDecimal getEnergy(){
        return energy;
    }
	
    /**
     * 属性 energy 的set方法
     * @return
     */
    public void setEnergy(BigDecimal energy){
        this.energy = energy;
    } 
	
	
	
    /**
     * 属性 price 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrice(){
        return price;
    }
	
    /**
     * 属性 price 的set方法
     * @return
     */
    public void setPrice(BigDecimal price){
        this.price = price;
    } 
	
	
	
    /**
     * 属性 energyPeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyPeriod1(){
        return energyPeriod1;
    }
	
    /**
     * 属性 energyPeriod1 的set方法
     * @return
     */
    public void setEnergyPeriod1(BigDecimal energyPeriod1){
        this.energyPeriod1 = energyPeriod1;
    } 
	
	
	
    /**
     * 属性 pricePeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPricePeriod1(){
        return pricePeriod1;
    }
	
    /**
     * 属性 pricePeriod1 的set方法
     * @return
     */
    public void setPricePeriod1(BigDecimal pricePeriod1){
        this.pricePeriod1 = pricePeriod1;
    } 
	
	
	
    /**
     * 属性 energyPeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyPeriod2(){
        return energyPeriod2;
    }
	
    /**
     * 属性 energyPeriod2 的set方法
     * @return
     */
    public void setEnergyPeriod2(BigDecimal energyPeriod2){
        this.energyPeriod2 = energyPeriod2;
    } 
	
	
	
    /**
     * 属性 pricePeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPricePeriod2(){
        return pricePeriod2;
    }
	
    /**
     * 属性 pricePeriod2 的set方法
     * @return
     */
    public void setPricePeriod2(BigDecimal pricePeriod2){
        this.pricePeriod2 = pricePeriod2;
    } 
	
	
	
    /**
     * 属性 energyPeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyPeriod3(){
        return energyPeriod3;
    }
	
    /**
     * 属性 energyPeriod3 的set方法
     * @return
     */
    public void setEnergyPeriod3(BigDecimal energyPeriod3){
        this.energyPeriod3 = energyPeriod3;
    } 
	
	
	
    /**
     * 属性 pricePeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPricePeriod3(){
        return pricePeriod3;
    }
	
    /**
     * 属性 pricePeriod3 的set方法
     * @return
     */
    public void setPricePeriod3(BigDecimal pricePeriod3){
        this.pricePeriod3 = pricePeriod3;
    } 
	
	
	
    /**
     * 属性 energyPeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyPeriod4(){
        return energyPeriod4;
    }
	
    /**
     * 属性 energyPeriod4 的set方法
     * @return
     */
    public void setEnergyPeriod4(BigDecimal energyPeriod4){
        this.energyPeriod4 = energyPeriod4;
    } 
	
	
	
    /**
     * 属性 pricePeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPricePeriod4(){
        return pricePeriod4;
    }
	
    /**
     * 属性 pricePeriod4 的set方法
     * @return
     */
    public void setPricePeriod4(BigDecimal pricePeriod4){
        this.pricePeriod4 = pricePeriod4;
    } 
	
	
	
    /**
     * 属性 energyPeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyPeriod5(){
        return energyPeriod5;
    }
	
    /**
     * 属性 energyPeriod5 的set方法
     * @return
     */
    public void setEnergyPeriod5(BigDecimal energyPeriod5){
        this.energyPeriod5 = energyPeriod5;
    } 
	
	
	
    /**
     * 属性 pricePeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPricePeriod5(){
        return pricePeriod5;
    }
	
    /**
     * 属性 pricePeriod5 的set方法
     * @return
     */
    public void setPricePeriod5(BigDecimal pricePeriod5){
        this.pricePeriod5 = pricePeriod5;
    } 
	
	
	
    /**
     * 属性 checkEnergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCheckEnergy(){
        return checkEnergy;
    }
	
    /**
     * 属性 checkEnergy 的set方法
     * @return
     */
    public void setCheckEnergy(BigDecimal checkEnergy){
        this.checkEnergy = checkEnergy;
    } 
	
	
	
    /**
     * 属性 checkEnergyPeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCheckEnergyPeriod1(){
        return checkEnergyPeriod1;
    }
	
    /**
     * 属性 checkEnergyPeriod1 的set方法
     * @return
     */
    public void setCheckEnergyPeriod1(BigDecimal checkEnergyPeriod1){
        this.checkEnergyPeriod1 = checkEnergyPeriod1;
    } 
	
	
	
    /**
     * 属性 checkEnergyPeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCheckEnergyPeriod2(){
        return checkEnergyPeriod2;
    }
	
    /**
     * 属性 checkEnergyPeriod2 的set方法
     * @return
     */
    public void setCheckEnergyPeriod2(BigDecimal checkEnergyPeriod2){
        this.checkEnergyPeriod2 = checkEnergyPeriod2;
    } 
	
	
	
    /**
     * 属性 checkEnergyPeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCheckEnergyPeriod3(){
        return checkEnergyPeriod3;
    }
	
    /**
     * 属性 checkEnergyPeriod3 的set方法
     * @return
     */
    public void setCheckEnergyPeriod3(BigDecimal checkEnergyPeriod3){
        this.checkEnergyPeriod3 = checkEnergyPeriod3;
    } 
	
	
	
    /**
     * 属性 checkEnergyPeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCheckEnergyPeriod4(){
        return checkEnergyPeriod4;
    }
	
    /**
     * 属性 checkEnergyPeriod4 的set方法
     * @return
     */
    public void setCheckEnergyPeriod4(BigDecimal checkEnergyPeriod4){
        this.checkEnergyPeriod4 = checkEnergyPeriod4;
    } 
	
	
	
    /**
     * 属性 checkEnergyPeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCheckEnergyPeriod5(){
        return checkEnergyPeriod5;
    }
	
    /**
     * 属性 checkEnergyPeriod5 的set方法
     * @return
     */
    public void setCheckEnergyPeriod5(BigDecimal checkEnergyPeriod5){
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
    public Timestamp getUpdateTime(){
        return updateTime;
    }
	
    /**
     * 属性 updateTime 的set方法
     * @return
     */
    public void setUpdateTime(Timestamp updateTime){
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrBidinfoJydy))
	        return false; 
			
        if(getBidinfoid() == null) 
	        return false;

        TrBidinfoJydy other = (TrBidinfoJydy) o;	        
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
            .append("bidinfoid"+":"+getBidinfoid())
            .append("id"+":"+getId())
            .append("jydyId"+":"+getJydyId())
            .append("tradeseqId"+":"+getTradeseqId())
            .append("interval"+":"+getInterval())
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
            .append("tradeTimepart"+":"+getTradeTimepart())
            .append("reason"+":"+getReason())
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

	public BigDecimal getVendeeLoss() {
		return vendeeLoss;
	}

	public void setVendeeLoss(BigDecimal vendeeLoss) {
		this.vendeeLoss = vendeeLoss;
	}

	public BigDecimal getSaleLoss() {
		return saleLoss;
	}

	public void setSaleLoss(BigDecimal saleLoss) {
		this.saleLoss = saleLoss;
	}

	public BigDecimal getSaleBreathPrice() {
		return saleBreathPrice;
	}

	public void setSaleBreathPrice(BigDecimal saleBreathPrice) {
		this.saleBreathPrice = saleBreathPrice;
	}

	public BigDecimal getVendeeBreathPrice() {
		return vendeeBreathPrice;
	}

	public void setVendeeBreathPrice(BigDecimal vendeeBreathPrice) {
		this.vendeeBreathPrice = vendeeBreathPrice;
	}

}