package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrBibidJydy的POJO类
 *
 * @author  sss  [Sat Nov 16 11:48:00 CST 2013]
 * 
 */
public class TrBibidJydy implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性resultPartyId
     */
    private String resultPartyId;
	
    /** 
     * 属性saleUnitsId
     */
    private String saleUnitsId;
	
    /** 
     * 属性saleUnitsNames
     */
    private String saleUnitsNames;
	
    /** 
     * 属性vendeeUnitsId
     */
    private String vendeeUnitsId;
	
    /** 
     * 属性vendeeUnitsNames
     */
    private String vendeeUnitsNames;
	
    /** 
     * 属性vendeeEnergy
     */
    private BigDecimal vendeeEnergy;
	
    /** 
     * 属性saleEnergy
     */
    private BigDecimal saleEnergy;
	
    /** 
     * 属性vendeePrice
     */
    private BigDecimal vendeePrice;
	
    /** 
     * 属性salePrice
     */
    private BigDecimal salePrice;
	
    /** 
     * 属性vendeeEnergyPeriod1
     */
    private BigDecimal vendeeEnergyPeriod1;
	
    /** 
     * 属性saleEnergyPeriod1
     */
    private BigDecimal saleEnergyPeriod1;
	
    /** 
     * 属性vendeePricePeriod1
     */
    private BigDecimal vendeePricePeriod1;
	
    /** 
     * 属性salePricePeriod1
     */
    private BigDecimal salePricePeriod1;
	
    /** 
     * 属性vendeeEnergyPeriod2
     */
    private BigDecimal vendeeEnergyPeriod2;
	
    /** 
     * 属性saleEnergyPeriod2
     */
    private BigDecimal saleEnergyPeriod2;
	
    /** 
     * 属性vendeePricePeriod2
     */
    private BigDecimal vendeePricePeriod2;
	
    /** 
     * 属性salePricePeriod2
     */
    private BigDecimal salePricePeriod2;
	
    /** 
     * 属性vendeeEnergyPeriod3
     */
    private BigDecimal vendeeEnergyPeriod3;
	
    /** 
     * 属性saleEnergyPeriod3
     */
    private BigDecimal saleEnergyPeriod3;
	
    /** 
     * 属性vendeePricePeriod3
     */
    private BigDecimal vendeePricePeriod3;
	
    /** 
     * 属性salePricePeriod3
     */
    private BigDecimal salePricePeriod3;
	
    /** 
     * 属性vendeeEnergyPeriod4
     */
    private BigDecimal vendeeEnergyPeriod4;
	
    /** 
     * 属性saleEnergyPeriod4
     */
    private BigDecimal saleEnergyPeriod4;
	
    /** 
     * 属性vendeePricePeriod4
     */
    private BigDecimal vendeePricePeriod4;
	
    /** 
     * 属性salePricePeriod4
     */
    private BigDecimal salePricePeriod4;
	
    /** 
     * 属性vendeeEnergyPeriod5
     */
    private BigDecimal vendeeEnergyPeriod5;
	
    /** 
     * 属性saleEnergyPeriod5
     */
    private BigDecimal saleEnergyPeriod5;
	
    /** 
     * 属性vendeePricePeriod5
     */
    private BigDecimal vendeePricePeriod5;
	
    /** 
     * 属性salePricePeriod5
     */
    private BigDecimal salePricePeriod5;
	
    /** 
     * 属性vendeeGrosseng
     */
    private BigDecimal vendeeGrosseng;
	
    /** 
     * 属性saleGrosseng
     */
    private BigDecimal saleGrosseng;
	
    /** 
     * 属性vendeeGrossengPeriod1
     */
    private BigDecimal vendeeGrossengPeriod1;
	
    /** 
     * 属性saleGrossengPeriod1
     */
    private BigDecimal saleGrossengPeriod1;
	
    /** 
     * 属性vendeeGrossengPeriod2
     */
    private BigDecimal vendeeGrossengPeriod2;
	
    /** 
     * 属性saleGrossengPeriod2
     */
    private BigDecimal saleGrossengPeriod2;
	
    /** 
     * 属性vendeeGrossengPeriod3
     */
    private BigDecimal vendeeGrossengPeriod3;
	
    /** 
     * 属性saleGrossengPeriod3
     */
    private BigDecimal saleGrossengPeriod3;
	
    /** 
     * 属性vendeeGrossengPeriod4
     */
    private BigDecimal vendeeGrossengPeriod4;
	
    /** 
     * 属性saleGrossengPeriod4
     */
    private BigDecimal saleGrossengPeriod4;
	
    /** 
     * 属性vendeeGrossengPeriod5
     */
    private BigDecimal vendeeGrossengPeriod5;
	
    /** 
     * 属性saleGrossengPeriod5
     */
    private BigDecimal saleGrossengPeriod5;
	
    /** 
     * 属性vendeeGenRate
     */
    private BigDecimal vendeeGenRate;
	
    /** 
     * 属性saleGenRate
     */
    private BigDecimal saleGenRate;
	
    /** 
     * 属性vendeeLossRatio
     */
    private BigDecimal vendeeLossRatio;
	
    /** 
     * 属性saleLossRatio
     */
    private BigDecimal saleLossRatio;
	
    /** 
     * 属性outLossType
     */
    private BigDecimal outLossType;
	
    /** 
     * 属性powerCurveId
     */
    private String powerCurveId;
	
    /** 
     * 属性saleLoss
     */
    private BigDecimal saleLoss;
	
    /** 
     * 属性vendeeLoss
     */
    private BigDecimal vendeeLoss;
	
    /** 
     * 属性bidPerson
     */
    private String bidPerson;
	
    /** 
     * 属性bidTime
     */
    private Date bidTime;
	
    /** 
     * 属性querenPerson
     */
    private String querenPerson;
	
    /** 
     * 属性querenTime
     */
    private Date querenTime;
	
    /** 
     * 属性bidStatus
     */
    private BigDecimal bidStatus;
	
    /** 
     * 属性updateTime
     */
    private Date updateTime;
	
    /** 
     * 属性auditFlag
     */
    private String auditFlag;
	
    /** 
     * 属性bidType
     */
    private BigDecimal bidType;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * 属性Trade_TimePart
     */
    private BigDecimal tradeTimePart;
    /**
     * 购方违约赔偿电价
     */
    private BigDecimal vendeeBreathPrice;
    /**
     * 售方违约赔偿电价
     */
    private BigDecimal saleBreathPrice;
    /**
     * 反馈意见
     */
    private String feedbackIdea;
    /**
     * 属性Band
     */
    private BigDecimal band;
    
    private BigDecimal approvedTariff;
    private BigDecimal catalogPrice;
    private BigDecimal transferAllotPrice;
    private BigDecimal netDiscountLoss;
    private BigDecimal fundsandaddPrice;
    
    
    
    public BigDecimal getApprovedTariff() {
		return approvedTariff;
	}

	public void setApprovedTariff(BigDecimal approvedTariff) {
		this.approvedTariff = approvedTariff;
	}

	public BigDecimal getCatalogPrice() {
		return catalogPrice;
	}

	public void setCatalogPrice(BigDecimal catalogPrice) {
		this.catalogPrice = catalogPrice;
	}

	public BigDecimal getTransferAllotPrice() {
		return transferAllotPrice;
	}

	public void setTransferAllotPrice(BigDecimal transferAllotPrice) {
		this.transferAllotPrice = transferAllotPrice;
	}

	public BigDecimal getNetDiscountLoss() {
		return netDiscountLoss;
	}

	public void setNetDiscountLoss(BigDecimal netDiscountLoss) {
		this.netDiscountLoss = netDiscountLoss;
	}

	public BigDecimal getFundsandaddPrice() {
		return fundsandaddPrice;
	}

	public void setFundsandaddPrice(BigDecimal fundsandaddPrice) {
		this.fundsandaddPrice = fundsandaddPrice;
	}

	public BigDecimal getTradeTimePart() {
		return tradeTimePart;
	}

	public void setTradeTimePart(BigDecimal tradeTimePart) {
		this.tradeTimePart = tradeTimePart;
	}

	public BigDecimal getBand() {
		return band;
	}

	public void setBand(BigDecimal band) {
		this.band = band;
	}

	/**
     * TrBibidJydy构造函数
     */
    public TrBibidJydy() {
        super();
    }  
	
    /**
     * TrBibidJydy完整的构造函数
     */  
    public TrBibidJydy(String id,BigDecimal tradeseqId,String resultPartyId,String saleUnitsId,String saleUnitsNames){
        this.id = id;
        this.tradeseqId = tradeseqId;
        this.resultPartyId = resultPartyId;
        this.saleUnitsId = saleUnitsId;
        this.saleUnitsNames = saleUnitsNames;
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
     * 属性 resultPartyId 的get方法
     * @return String
     */
    public String getResultPartyId(){
        return resultPartyId;
    }
	
    /**
     * 属性 resultPartyId 的set方法
     * @return
     */
    public void setResultPartyId(String resultPartyId){
        this.resultPartyId = resultPartyId;
    } 
	
	
	
    /**
     * 属性 saleUnitsId 的get方法
     * @return String
     */
    public String getSaleUnitsId(){
        return saleUnitsId;
    }
	
    /**
     * 属性 saleUnitsId 的set方法
     * @return
     */
    public void setSaleUnitsId(String saleUnitsId){
        this.saleUnitsId = saleUnitsId;
    } 
	
	
	
    /**
     * 属性 saleUnitsNames 的get方法
     * @return String
     */
    public String getSaleUnitsNames(){
        return saleUnitsNames;
    }
	
    /**
     * 属性 saleUnitsNames 的set方法
     * @return
     */
    public void setSaleUnitsNames(String saleUnitsNames){
        this.saleUnitsNames = saleUnitsNames;
    } 
	
	
	
    /**
     * 属性 vendeeUnitsId 的get方法
     * @return String
     */
    public String getVendeeUnitsId(){
        return vendeeUnitsId;
    }
	
    /**
     * 属性 vendeeUnitsId 的set方法
     * @return
     */
    public void setVendeeUnitsId(String vendeeUnitsId){
        this.vendeeUnitsId = vendeeUnitsId;
    } 
	
	
	
    /**
     * 属性 vendeeUnitsNames 的get方法
     * @return String
     */
    public String getVendeeUnitsNames(){
        return vendeeUnitsNames;
    }
	
    /**
     * 属性 vendeeUnitsNames 的set方法
     * @return
     */
    public void setVendeeUnitsNames(String vendeeUnitsNames){
        this.vendeeUnitsNames = vendeeUnitsNames;
    } 
	
	
	
    /**
     * 属性 vendeeEnergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeEnergy(){
        return vendeeEnergy;
    }
	
    /**
     * 属性 vendeeEnergy 的set方法
     * @return
     */
    public void setVendeeEnergy(BigDecimal vendeeEnergy){
        this.vendeeEnergy = vendeeEnergy;
    } 
	
	
	
    /**
     * 属性 saleEnergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleEnergy(){
        return saleEnergy;
    }
	
    /**
     * 属性 saleEnergy 的set方法
     * @return
     */
    public void setSaleEnergy(BigDecimal saleEnergy){
        this.saleEnergy = saleEnergy;
    } 
	
	
	
    /**
     * 属性 vendeePrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeePrice(){
        return vendeePrice;
    }
	
    /**
     * 属性 vendeePrice 的set方法
     * @return
     */
    public void setVendeePrice(BigDecimal vendeePrice){
        this.vendeePrice = vendeePrice;
    } 
	
	
	
    /**
     * 属性 salePrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSalePrice(){
        return salePrice;
    }
	
    /**
     * 属性 salePrice 的set方法
     * @return
     */
    public void setSalePrice(BigDecimal salePrice){
        this.salePrice = salePrice;
    } 
	
	
	
    /**
     * 属性 vendeeEnergyPeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeEnergyPeriod1(){
        return vendeeEnergyPeriod1;
    }
	
    /**
     * 属性 vendeeEnergyPeriod1 的set方法
     * @return
     */
    public void setVendeeEnergyPeriod1(BigDecimal vendeeEnergyPeriod1){
        this.vendeeEnergyPeriod1 = vendeeEnergyPeriod1;
    } 
	
	
	
    /**
     * 属性 saleEnergyPeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleEnergyPeriod1(){
        return saleEnergyPeriod1;
    }
	
    /**
     * 属性 saleEnergyPeriod1 的set方法
     * @return
     */
    public void setSaleEnergyPeriod1(BigDecimal saleEnergyPeriod1){
        this.saleEnergyPeriod1 = saleEnergyPeriod1;
    } 
	
	
	
    /**
     * 属性 vendeePricePeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeePricePeriod1(){
        return vendeePricePeriod1;
    }
	
    /**
     * 属性 vendeePricePeriod1 的set方法
     * @return
     */
    public void setVendeePricePeriod1(BigDecimal vendeePricePeriod1){
        this.vendeePricePeriod1 = vendeePricePeriod1;
    } 
	
	
	
    /**
     * 属性 salePricePeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSalePricePeriod1(){
        return salePricePeriod1;
    }
	
    /**
     * 属性 salePricePeriod1 的set方法
     * @return
     */
    public void setSalePricePeriod1(BigDecimal salePricePeriod1){
        this.salePricePeriod1 = salePricePeriod1;
    } 
	
	
	
    /**
     * 属性 vendeeEnergyPeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeEnergyPeriod2(){
        return vendeeEnergyPeriod2;
    }
	
    /**
     * 属性 vendeeEnergyPeriod2 的set方法
     * @return
     */
    public void setVendeeEnergyPeriod2(BigDecimal vendeeEnergyPeriod2){
        this.vendeeEnergyPeriod2 = vendeeEnergyPeriod2;
    } 
	
	
	
    /**
     * 属性 saleEnergyPeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleEnergyPeriod2(){
        return saleEnergyPeriod2;
    }
	
    /**
     * 属性 saleEnergyPeriod2 的set方法
     * @return
     */
    public void setSaleEnergyPeriod2(BigDecimal saleEnergyPeriod2){
        this.saleEnergyPeriod2 = saleEnergyPeriod2;
    } 
	
	
	
    /**
     * 属性 vendeePricePeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeePricePeriod2(){
        return vendeePricePeriod2;
    }
	
    /**
     * 属性 vendeePricePeriod2 的set方法
     * @return
     */
    public void setVendeePricePeriod2(BigDecimal vendeePricePeriod2){
        this.vendeePricePeriod2 = vendeePricePeriod2;
    } 
	
	
	
    /**
     * 属性 salePricePeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSalePricePeriod2(){
        return salePricePeriod2;
    }
	
    /**
     * 属性 salePricePeriod2 的set方法
     * @return
     */
    public void setSalePricePeriod2(BigDecimal salePricePeriod2){
        this.salePricePeriod2 = salePricePeriod2;
    } 
	
	
	
    /**
     * 属性 vendeeEnergyPeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeEnergyPeriod3(){
        return vendeeEnergyPeriod3;
    }
	
    /**
     * 属性 vendeeEnergyPeriod3 的set方法
     * @return
     */
    public void setVendeeEnergyPeriod3(BigDecimal vendeeEnergyPeriod3){
        this.vendeeEnergyPeriod3 = vendeeEnergyPeriod3;
    } 
	
	
	
    /**
     * 属性 saleEnergyPeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleEnergyPeriod3(){
        return saleEnergyPeriod3;
    }
	
    /**
     * 属性 saleEnergyPeriod3 的set方法
     * @return
     */
    public void setSaleEnergyPeriod3(BigDecimal saleEnergyPeriod3){
        this.saleEnergyPeriod3 = saleEnergyPeriod3;
    } 
	
	
	
    /**
     * 属性 vendeePricePeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeePricePeriod3(){
        return vendeePricePeriod3;
    }
	
    /**
     * 属性 vendeePricePeriod3 的set方法
     * @return
     */
    public void setVendeePricePeriod3(BigDecimal vendeePricePeriod3){
        this.vendeePricePeriod3 = vendeePricePeriod3;
    } 
	
	
	
    /**
     * 属性 salePricePeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSalePricePeriod3(){
        return salePricePeriod3;
    }
	
    /**
     * 属性 salePricePeriod3 的set方法
     * @return
     */
    public void setSalePricePeriod3(BigDecimal salePricePeriod3){
        this.salePricePeriod3 = salePricePeriod3;
    } 
	
	
	
    /**
     * 属性 vendeeEnergyPeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeEnergyPeriod4(){
        return vendeeEnergyPeriod4;
    }
	
    /**
     * 属性 vendeeEnergyPeriod4 的set方法
     * @return
     */
    public void setVendeeEnergyPeriod4(BigDecimal vendeeEnergyPeriod4){
        this.vendeeEnergyPeriod4 = vendeeEnergyPeriod4;
    } 
	
	
	
    /**
     * 属性 saleEnergyPeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleEnergyPeriod4(){
        return saleEnergyPeriod4;
    }
	
    /**
     * 属性 saleEnergyPeriod4 的set方法
     * @return
     */
    public void setSaleEnergyPeriod4(BigDecimal saleEnergyPeriod4){
        this.saleEnergyPeriod4 = saleEnergyPeriod4;
    } 
	
	
	
    /**
     * 属性 vendeePricePeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeePricePeriod4(){
        return vendeePricePeriod4;
    }
	
    /**
     * 属性 vendeePricePeriod4 的set方法
     * @return
     */
    public void setVendeePricePeriod4(BigDecimal vendeePricePeriod4){
        this.vendeePricePeriod4 = vendeePricePeriod4;
    } 
	
	
	
    /**
     * 属性 salePricePeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSalePricePeriod4(){
        return salePricePeriod4;
    }
	
    /**
     * 属性 salePricePeriod4 的set方法
     * @return
     */
    public void setSalePricePeriod4(BigDecimal salePricePeriod4){
        this.salePricePeriod4 = salePricePeriod4;
    } 
	
	
	
    /**
     * 属性 vendeeEnergyPeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeEnergyPeriod5(){
        return vendeeEnergyPeriod5;
    }
	
    /**
     * 属性 vendeeEnergyPeriod5 的set方法
     * @return
     */
    public void setVendeeEnergyPeriod5(BigDecimal vendeeEnergyPeriod5){
        this.vendeeEnergyPeriod5 = vendeeEnergyPeriod5;
    } 
	
	
	
    /**
     * 属性 saleEnergyPeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleEnergyPeriod5(){
        return saleEnergyPeriod5;
    }
	
    /**
     * 属性 saleEnergyPeriod5 的set方法
     * @return
     */
    public void setSaleEnergyPeriod5(BigDecimal saleEnergyPeriod5){
        this.saleEnergyPeriod5 = saleEnergyPeriod5;
    } 
	
	
	
    /**
     * 属性 vendeePricePeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeePricePeriod5(){
        return vendeePricePeriod5;
    }
	
    /**
     * 属性 vendeePricePeriod5 的set方法
     * @return
     */
    public void setVendeePricePeriod5(BigDecimal vendeePricePeriod5){
        this.vendeePricePeriod5 = vendeePricePeriod5;
    } 
	
	
	
    /**
     * 属性 salePricePeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSalePricePeriod5(){
        return salePricePeriod5;
    }
	
    /**
     * 属性 salePricePeriod5 的set方法
     * @return
     */
    public void setSalePricePeriod5(BigDecimal salePricePeriod5){
        this.salePricePeriod5 = salePricePeriod5;
    } 
	
	
	
    /**
     * 属性 vendeeGrosseng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGrosseng(){
        return vendeeGrosseng;
    }
	
    /**
     * 属性 vendeeGrosseng 的set方法
     * @return
     */
    public void setVendeeGrosseng(BigDecimal vendeeGrosseng){
        this.vendeeGrosseng = vendeeGrosseng;
    } 
	
	
	
    /**
     * 属性 saleGrosseng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGrosseng(){
        return saleGrosseng;
    }
	
    /**
     * 属性 saleGrosseng 的set方法
     * @return
     */
    public void setSaleGrosseng(BigDecimal saleGrosseng){
        this.saleGrosseng = saleGrosseng;
    } 
	
	
	
    /**
     * 属性 vendeeGrossengPeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGrossengPeriod1(){
        return vendeeGrossengPeriod1;
    }
	
    /**
     * 属性 vendeeGrossengPeriod1 的set方法
     * @return
     */
    public void setVendeeGrossengPeriod1(BigDecimal vendeeGrossengPeriod1){
        this.vendeeGrossengPeriod1 = vendeeGrossengPeriod1;
    } 
	
	
	
    /**
     * 属性 saleGrossengPeriod1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGrossengPeriod1(){
        return saleGrossengPeriod1;
    }
	
    /**
     * 属性 saleGrossengPeriod1 的set方法
     * @return
     */
    public void setSaleGrossengPeriod1(BigDecimal saleGrossengPeriod1){
        this.saleGrossengPeriod1 = saleGrossengPeriod1;
    } 
	
	
	
    /**
     * 属性 vendeeGrossengPeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGrossengPeriod2(){
        return vendeeGrossengPeriod2;
    }
	
    /**
     * 属性 vendeeGrossengPeriod2 的set方法
     * @return
     */
    public void setVendeeGrossengPeriod2(BigDecimal vendeeGrossengPeriod2){
        this.vendeeGrossengPeriod2 = vendeeGrossengPeriod2;
    } 
	
	
	
    /**
     * 属性 saleGrossengPeriod2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGrossengPeriod2(){
        return saleGrossengPeriod2;
    }
	
    /**
     * 属性 saleGrossengPeriod2 的set方法
     * @return
     */
    public void setSaleGrossengPeriod2(BigDecimal saleGrossengPeriod2){
        this.saleGrossengPeriod2 = saleGrossengPeriod2;
    } 
	
	
	
    /**
     * 属性 vendeeGrossengPeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGrossengPeriod3(){
        return vendeeGrossengPeriod3;
    }
	
    /**
     * 属性 vendeeGrossengPeriod3 的set方法
     * @return
     */
    public void setVendeeGrossengPeriod3(BigDecimal vendeeGrossengPeriod3){
        this.vendeeGrossengPeriod3 = vendeeGrossengPeriod3;
    } 
	
	
	
    /**
     * 属性 saleGrossengPeriod3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGrossengPeriod3(){
        return saleGrossengPeriod3;
    }
	
    /**
     * 属性 saleGrossengPeriod3 的set方法
     * @return
     */
    public void setSaleGrossengPeriod3(BigDecimal saleGrossengPeriod3){
        this.saleGrossengPeriod3 = saleGrossengPeriod3;
    } 
	
	
	
    /**
     * 属性 vendeeGrossengPeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGrossengPeriod4(){
        return vendeeGrossengPeriod4;
    }
	
    /**
     * 属性 vendeeGrossengPeriod4 的set方法
     * @return
     */
    public void setVendeeGrossengPeriod4(BigDecimal vendeeGrossengPeriod4){
        this.vendeeGrossengPeriod4 = vendeeGrossengPeriod4;
    } 
	
	
	
    /**
     * 属性 saleGrossengPeriod4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGrossengPeriod4(){
        return saleGrossengPeriod4;
    }
	
    /**
     * 属性 saleGrossengPeriod4 的set方法
     * @return
     */
    public void setSaleGrossengPeriod4(BigDecimal saleGrossengPeriod4){
        this.saleGrossengPeriod4 = saleGrossengPeriod4;
    } 
	
	
	
    /**
     * 属性 vendeeGrossengPeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGrossengPeriod5(){
        return vendeeGrossengPeriod5;
    }
	
    /**
     * 属性 vendeeGrossengPeriod5 的set方法
     * @return
     */
    public void setVendeeGrossengPeriod5(BigDecimal vendeeGrossengPeriod5){
        this.vendeeGrossengPeriod5 = vendeeGrossengPeriod5;
    } 
	
	
	
    /**
     * 属性 saleGrossengPeriod5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGrossengPeriod5(){
        return saleGrossengPeriod5;
    }
	
    /**
     * 属性 saleGrossengPeriod5 的set方法
     * @return
     */
    public void setSaleGrossengPeriod5(BigDecimal saleGrossengPeriod5){
        this.saleGrossengPeriod5 = saleGrossengPeriod5;
    } 
	
	
	
    /**
     * 属性 vendeeGenRate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGenRate(){
        return vendeeGenRate;
    }
	
    /**
     * 属性 vendeeGenRate 的set方法
     * @return
     */
    public void setVendeeGenRate(BigDecimal vendeeGenRate){
        this.vendeeGenRate = vendeeGenRate;
    } 
	
	
	
    /**
     * 属性 saleGenRate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGenRate(){
        return saleGenRate;
    }
	
    /**
     * 属性 saleGenRate 的set方法
     * @return
     */
    public void setSaleGenRate(BigDecimal saleGenRate){
        this.saleGenRate = saleGenRate;
    } 
	
	
	
    /**
     * 属性 vendeeLossRatio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeLossRatio(){
        return vendeeLossRatio;
    }
	
    /**
     * 属性 vendeeLossRatio 的set方法
     * @return
     */
    public void setVendeeLossRatio(BigDecimal vendeeLossRatio){
        this.vendeeLossRatio = vendeeLossRatio;
    } 
	
	
	
    /**
     * 属性 saleLossRatio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleLossRatio(){
        return saleLossRatio;
    }
	
    /**
     * 属性 saleLossRatio 的set方法
     * @return
     */
    public void setSaleLossRatio(BigDecimal saleLossRatio){
        this.saleLossRatio = saleLossRatio;
    } 
	
	
	
    /**
     * 属性 outLossType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOutLossType(){
        return outLossType;
    }
	
    /**
     * 属性 outLossType 的set方法
     * @return
     */
    public void setOutLossType(BigDecimal outLossType){
        this.outLossType = outLossType;
    } 
	
	
	
    /**
     * 属性 powerCurveId 的get方法
     * @return String
     */
    public String getPowerCurveId(){
        return powerCurveId;
    }
	
    /**
     * 属性 powerCurveId 的set方法
     * @return
     */
    public void setPowerCurveId(String powerCurveId){
        this.powerCurveId = powerCurveId;
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
     * 属性 bidTime 的get方法
     * @return Date
     */
    public Date getBidTime(){
        return bidTime;
    }
	
    /**
     * 属性 bidTime 的set方法
     * @return
     */
    public void setBidTime(Date bidTime){
        this.bidTime = bidTime;
    } 
	
	
	
    /**
     * 属性 querenPerson 的get方法
     * @return String
     */
    public String getQuerenPerson(){
        return querenPerson;
    }
	
    /**
     * 属性 querenPerson 的set方法
     * @return
     */
    public void setQuerenPerson(String querenPerson){
        this.querenPerson = querenPerson;
    } 
	
	
	
    /**
     * 属性 querenTime 的get方法
     * @return Date
     */
    public Date getQuerenTime(){
        return querenTime;
    }
	
    /**
     * 属性 querenTime 的set方法
     * @return
     */
    public void setQuerenTime(Date querenTime){
        this.querenTime = querenTime;
    } 
	
	
	
    /**
     * 属性 bidStatus 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBidStatus(){
        return bidStatus;
    }
	
    /**
     * 属性 bidStatus 的set方法
     * @return
     */
    public void setBidStatus(BigDecimal bidStatus){
        this.bidStatus = bidStatus;
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
     * 属性 bidType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBidType(){
        return bidType;
    }
	
    /**
     * 属性 bidType 的set方法
     * @return
     */
    public void setBidType(BigDecimal bidType){
        this.bidType = bidType;
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
		
        if (o == null || !(o instanceof TrBibidJydy))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrBibidJydy other = (TrBibidJydy) o;	        
	    return new EqualsBuilder()
            .append(this.getId(), other.getId())
			.isEquals();
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

    
    
   /**
    * toString方法
    * @return String
    */
	@Override
	public String toString() {
		return "TrBibidJydy [id=" + id + ", tradeseqId=" + tradeseqId
				+ ", resultPartyId=" + resultPartyId + ", saleUnitsId="
				+ saleUnitsId + ", saleUnitsNames=" + saleUnitsNames
				+ ", vendeeUnitsId=" + vendeeUnitsId + ", vendeeUnitsNames="
				+ vendeeUnitsNames + ", vendeeEnergy=" + vendeeEnergy
				+ ", saleEnergy=" + saleEnergy + ", vendeePrice=" + vendeePrice
				+ ", salePrice=" + salePrice + ", vendeeEnergyPeriod1="
				+ vendeeEnergyPeriod1 + ", saleEnergyPeriod1="
				+ saleEnergyPeriod1 + ", vendeePricePeriod1="
				+ vendeePricePeriod1 + ", salePricePeriod1=" + salePricePeriod1
				+ ", vendeeEnergyPeriod2=" + vendeeEnergyPeriod2
				+ ", saleEnergyPeriod2=" + saleEnergyPeriod2
				+ ", vendeePricePeriod2=" + vendeePricePeriod2
				+ ", salePricePeriod2=" + salePricePeriod2
				+ ", vendeeEnergyPeriod3=" + vendeeEnergyPeriod3
				+ ", saleEnergyPeriod3=" + saleEnergyPeriod3
				+ ", vendeePricePeriod3=" + vendeePricePeriod3
				+ ", salePricePeriod3=" + salePricePeriod3
				+ ", vendeeEnergyPeriod4=" + vendeeEnergyPeriod4
				+ ", saleEnergyPeriod4=" + saleEnergyPeriod4
				+ ", vendeePricePeriod4=" + vendeePricePeriod4
				+ ", salePricePeriod4=" + salePricePeriod4
				+ ", vendeeEnergyPeriod5=" + vendeeEnergyPeriod5
				+ ", saleEnergyPeriod5=" + saleEnergyPeriod5
				+ ", vendeePricePeriod5=" + vendeePricePeriod5
				+ ", salePricePeriod5=" + salePricePeriod5
				+ ", vendeeGrosseng=" + vendeeGrosseng + ", saleGrosseng="
				+ saleGrosseng + ", vendeeGrossengPeriod1="
				+ vendeeGrossengPeriod1 + ", saleGrossengPeriod1="
				+ saleGrossengPeriod1 + ", vendeeGrossengPeriod2="
				+ vendeeGrossengPeriod2 + ", saleGrossengPeriod2="
				+ saleGrossengPeriod2 + ", vendeeGrossengPeriod3="
				+ vendeeGrossengPeriod3 + ", saleGrossengPeriod3="
				+ saleGrossengPeriod3 + ", vendeeGrossengPeriod4="
				+ vendeeGrossengPeriod4 + ", saleGrossengPeriod4="
				+ saleGrossengPeriod4 + ", vendeeGrossengPeriod5="
				+ vendeeGrossengPeriod5 + ", saleGrossengPeriod5="
				+ saleGrossengPeriod5 + ", vendeeGenRate=" + vendeeGenRate
				+ ", saleGenRate=" + saleGenRate + ", vendeeLossRatio="
				+ vendeeLossRatio + ", saleLossRatio=" + saleLossRatio
				+ ", outLossType=" + outLossType + ", powerCurveId="
				+ powerCurveId + ", saleLoss=" + saleLoss + ", vendeeLoss="
				+ vendeeLoss + ", bidPerson=" + bidPerson + ", bidTime="
				+ bidTime + ", querenPerson=" + querenPerson + ", querenTime="
				+ querenTime + ", bidStatus=" + bidStatus + ", updateTime="
				+ updateTime + ", auditFlag=" + auditFlag + ", bidType="
				+ bidType + ", marketId=" + marketId + ", tradeTimePart="
				+ tradeTimePart + ", vendeeBreathPrice=" + vendeeBreathPrice
				+ ", saleBreathPrice=" + saleBreathPrice + ", feedbackIdea="
				+ feedbackIdea + ", band=" + band + ", approvedTariff="
				+ approvedTariff + ", catalogPrice=" + catalogPrice
				+ ", transferAllotPrice=" + transferAllotPrice
				+ ", netDiscountLoss=" + netDiscountLoss
				+ ", fundsandaddPrice=" + fundsandaddPrice + "]";
	}

	public BigDecimal getVendeeBreathPrice() {
		return vendeeBreathPrice;
	}

	public void setVendeeBreathPrice(BigDecimal vendeeBreathPrice) {
		this.vendeeBreathPrice = vendeeBreathPrice;
	}

	public BigDecimal getSaleBreathPrice() {
		return saleBreathPrice;
	}

	public void setSaleBreathPrice(BigDecimal saleBreathPrice) {
		this.saleBreathPrice = saleBreathPrice;
	}

	public String getFeedbackIdea() {
		return feedbackIdea;
	}

	public void setFeedbackIdea(String feedbackIdea) {
		this.feedbackIdea = feedbackIdea;
	}

}