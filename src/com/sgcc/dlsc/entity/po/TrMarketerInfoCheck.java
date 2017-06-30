package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrMarketerInfoCheck的POJO类
 *
 * @author  Administrator  [Wed Feb 12 09:27:15 CST 2014]
 * 
 */
public class TrMarketerInfoCheck implements Serializable{

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
     * 属性participantcode
     */
    private String participantcode;
	
    /** 
     * 属性maxcapacity
     */
    private BigDecimal maxcapacity;
	
    /** 
     * 属性sumcapacity
     */
    private BigDecimal sumcapacity;
	
    /** 
     * 属性isFirstCloseout
     */
    private BigDecimal isFirstCloseout;
	
    /** 
     * 属性isRatingTransferallotPrice
     */
    private BigDecimal isRatingTransferallotPrice;
	
    /** 
     * 属性catalogPrice
     */
    private BigDecimal catalogPrice;
	
    /** 
     * 属性transferAllotPrice
     */
    private BigDecimal transferAllotPrice;
	
    /** 
     * 属性netDiscountLoss
     */
    private BigDecimal netDiscountLoss;
	
    /** 
     * 属性fundsandaddPrice
     */
    private BigDecimal fundsandaddPrice;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性approvedTariff
     */
    private BigDecimal approvedTariff;
	
    /** 
     * 属性participanttype
     */
    private BigDecimal participanttype;
    
    /** 
     * 属性transferallotloss
     */
    private BigDecimal transferAllotLoss;
	
    /**
     * 临界机组属性
     */
    private BigDecimal  boilerPressure;
    
    /**
     * 是否供热
     */
    private BigDecimal isHeatSupply;
    
    /**
     * 上年度用电量比例
     */
    private BigDecimal lastYearRemoteControl;
    
    /**
     * 是否脱尘
     */
    private BigDecimal generatorClass2;
    
    /**
     *是否脱硝
     */
    private BigDecimal isDesalt;
    
    /**
     * 是否脱硫
     */
    private BigDecimal isDesulfurated;
    
    /**
     * 是否空冷
     */
    private BigDecimal isColdbyair;
    
    public BigDecimal getGeneratorClass2() {
		return generatorClass2;
	}

	public void setGeneratorClass2(BigDecimal generatorClass2) {
		this.generatorClass2 = generatorClass2;
	}

	public BigDecimal getIsDesalt() {
		return isDesalt;
	}

	public void setIsDesalt(BigDecimal isDesalt) {
		this.isDesalt = isDesalt;
	}

	public BigDecimal getIsDesulfurated() {
		return isDesulfurated;
	}

	public void setIsDesulfurated(BigDecimal isDesulfurated) {
		this.isDesulfurated = isDesulfurated;
	}

	public BigDecimal getIsColdbyair() {
		return isColdbyair;
	}

	public void setIsColdbyair(BigDecimal isColdbyair) {
		this.isColdbyair = isColdbyair;
	}

	public BigDecimal getLastYearRemoteControl() {
		return lastYearRemoteControl;
	}

	public void setLastYearRemoteControl(BigDecimal lastYearRemoteControl) {
		this.lastYearRemoteControl = lastYearRemoteControl;
	}

	public BigDecimal getIsHeatSupply() {
		return isHeatSupply;
	}

	public void setIsHeatSupply(BigDecimal isHeatSupply) {
		this.isHeatSupply = isHeatSupply;
	}

	public BigDecimal getBoilerPressure() {
		return boilerPressure;
	}

	public void setBoilerPressure(BigDecimal boilerPressure) {
		this.boilerPressure = boilerPressure;
	}

	public BigDecimal getTransferAllotLoss() {
		return transferAllotLoss;
	}

	public void setTransferAllotLoss(BigDecimal transferAllotLoss) {
		this.transferAllotLoss = transferAllotLoss;
	}

	/**
     * TrMarketerInfoCheck构造函数
     */
    public TrMarketerInfoCheck() {
        super();
    }  
	
    /**
     * TrMarketerInfoCheck完整的构造函数
     */  
    public TrMarketerInfoCheck(String guid){
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
     * 属性 participantcode 的get方法
     * @return String
     */
    public String getParticipantcode(){
        return participantcode;
    }
	
    /**
     * 属性 participantcode 的set方法
     * @return
     */
    public void setParticipantcode(String participantcode){
        this.participantcode = participantcode;
    } 
	
    /**
     * 属性 maxcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxcapacity(){
        return maxcapacity;
    }
	
    /**
     * 属性 maxcapacity 的set方法
     * @return
     */
    public void setMaxcapacity(BigDecimal maxcapacity){
        this.maxcapacity = maxcapacity;
    } 
	
    /**
     * 属性 sumcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSumcapacity(){
        return sumcapacity;
    }
	
    /**
     * 属性 sumcapacity 的set方法
     * @return
     */
    public void setSumcapacity(BigDecimal sumcapacity){
        this.sumcapacity = sumcapacity;
    } 
	
    /**
     * 属性 isFirstCloseout 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsFirstCloseout(){
        return isFirstCloseout;
    }
	
    /**
     * 属性 isFirstCloseout 的set方法
     * @return
     */
    public void setIsFirstCloseout(BigDecimal isFirstCloseout){
        this.isFirstCloseout = isFirstCloseout;
    } 
	
    /**
     * 属性 isRatingTransferallotPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsRatingTransferallotPrice(){
        return isRatingTransferallotPrice;
    }
	
    /**
     * 属性 isRatingTransferallotPrice 的set方法
     * @return
     */
    public void setIsRatingTransferallotPrice(BigDecimal isRatingTransferallotPrice){
        this.isRatingTransferallotPrice = isRatingTransferallotPrice;
    } 
	
    /**
     * 属性 catalogPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCatalogPrice(){
        return catalogPrice;
    }
	
    /**
     * 属性 catalogPrice 的set方法
     * @return
     */
    public void setCatalogPrice(BigDecimal catalogPrice){
        this.catalogPrice = catalogPrice;
    } 
	
    /**
     * 属性 transferAllotPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTransferAllotPrice(){
        return transferAllotPrice;
    }
	
    /**
     * 属性 transferAllotPrice 的set方法
     * @return
     */
    public void setTransferAllotPrice(BigDecimal transferAllotPrice){
        this.transferAllotPrice = transferAllotPrice;
    } 
	
    /**
     * 属性 netDiscountLoss 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetDiscountLoss(){
        return netDiscountLoss;
    }
	
    /**
     * 属性 netDiscountLoss 的set方法
     * @return
     */
    public void setNetDiscountLoss(BigDecimal netDiscountLoss){
        this.netDiscountLoss = netDiscountLoss;
    } 
	
    /**
     * 属性 fundsandaddPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFundsandaddPrice(){
        return fundsandaddPrice;
    }
	
    /**
     * 属性 fundsandaddPrice 的set方法
     * @return
     */
    public void setFundsandaddPrice(BigDecimal fundsandaddPrice){
        this.fundsandaddPrice = fundsandaddPrice;
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
     * 属性 updatetime 的get方法
     * @return Date
     */
    public Date getUpdatetime(){
        return updatetime;
    }
	
    /**
     * 属性 updatetime 的set方法
     * @return
     */
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
    } 
	
    /**
     * 属性 approvedTariff 的get方法
     * @return BigDecimal
     */
    public BigDecimal getApprovedTariff(){
        return approvedTariff;
    }
	
    /**
     * 属性 approvedTariff 的set方法
     * @return
     */
    public void setApprovedTariff(BigDecimal approvedTariff){
        this.approvedTariff = approvedTariff;
    } 
	
    /**
     * 属性 participanttype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getParticipanttype(){
        return participanttype;
    }
	
    /**
     * 属性 participanttype 的set方法
     * @return
     */
    public void setParticipanttype(BigDecimal participanttype){
        this.participanttype = participanttype;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrMarketerInfoCheck))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrMarketerInfoCheck other = (TrMarketerInfoCheck) o;	        
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
            .append("participantcode"+":"+getParticipantcode())
            .append("maxcapacity"+":"+getMaxcapacity())
            .append("sumcapacity"+":"+getSumcapacity())
            .append("isFirstCloseout"+":"+getIsFirstCloseout())
            .append("isRatingTransferallotPrice"+":"+getIsRatingTransferallotPrice())
            .append("catalogPrice"+":"+getCatalogPrice())
            .append("transferAllotPrice"+":"+getTransferAllotPrice())
            .append("netDiscountLoss"+":"+getNetDiscountLoss())
            .append("fundsandaddPrice"+":"+getFundsandaddPrice())
            .append("marketId"+":"+getMarketId())
            .append("updatetime"+":"+getUpdatetime())
            .append("approvedTariff"+":"+getApprovedTariff())
            .append("participanttype"+":"+getParticipanttype())
            .append("transferAllotLoss"+":"+getTransferAllotLoss())
            .append("boilerPressure"+":"+getBoilerPressure())
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