package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubTrResultMainSum的POJO类
 *
 * @author  sss  [Mon Nov 25 10:31:29 CST 2013]
 * 
 */
public class PubTrResultMainSum implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性intervalIndex
     */
    private BigDecimal intervalIndex;
	
    /** 
     * 属性saleParticipantid
     */
    private String saleParticipantid;
	
    /** 
     * 属性vendeeParticipantid
     */
    private String vendeeParticipantid;
	
    /** 
     * 属性band
     */
    private BigDecimal band;
	
    /** 
     * 属性tradeTimepart
     */
    private BigDecimal tradeTimepart;
	
    /** 
     * 属性tradetypeId
     */
    private String tradetypeId;
	
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
     * 属性powerCurveId
     */
    private String powerCurveId;
	
    /** 
     * 属性remark
     */
    private String remark;
	
    /** 
     * 属性saleUnitsName
     */
    private String saleUnitsName;
	
    /** 
     * 属性vendeeUnitsName
     */
    private String vendeeUnitsName;
	
    /** 
     * 属性stDate
     */
    private Date stDate;
	
    /** 
     * 属性tradeStatType
     */
    private BigDecimal tradeStatType;
	
    /** 
     * 属性vendeeGenRate
     */
    private BigDecimal vendeeGenRate;
	
    /** 
     * 属性saleGenRate
     */
    private BigDecimal saleGenRate;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性flowid
     */
    private String flowid;
	
    /** 
     * 属性confirmState
     */
    private BigDecimal confirmState;
	
    /** 
     * 属性bak1
     */
    private String bak1;
	
    /** 
     * 属性bak2
     */
    private String bak2;
	
    /** 
     * 属性bak3
     */
    private String bak3;
	
    /** 
     * 属性bak4
     */
    private String bak4;
	
    /** 
     * 属性bak5
     */
    private String bak5;
	
    /** 
     * 属性bak6
     */
    private String bak6;
	
    /** 
     * 属性bak7
     */
    private String bak7;
	
    /** 
     * 属性bak8
     */
    private String bak8;
	
    /** 
     * 属性bak9
     */
    private String bak9;
	
    /** 
     * 属性bak10
     */
    private String bak10;
	
    /**
     * PubTrResultMainSum构造函数
     */
    public PubTrResultMainSum() {
        super();
    }  
	
    /**
     * PubTrResultMainSum完整的构造函数
     */  
    public PubTrResultMainSum(String id){
        this.id = id;
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
     * 属性 intervalIndex 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIntervalIndex(){
        return intervalIndex;
    }
	
    /**
     * 属性 intervalIndex 的set方法
     * @return
     */
    public void setIntervalIndex(BigDecimal intervalIndex){
        this.intervalIndex = intervalIndex;
    } 
	
	
	
    /**
     * 属性 saleParticipantid 的get方法
     * @return String
     */
    public String getSaleParticipantid(){
        return saleParticipantid;
    }
	
    /**
     * 属性 saleParticipantid 的set方法
     * @return
     */
    public void setSaleParticipantid(String saleParticipantid){
        this.saleParticipantid = saleParticipantid;
    } 
	
	
	
    /**
     * 属性 vendeeParticipantid 的get方法
     * @return String
     */
    public String getVendeeParticipantid(){
        return vendeeParticipantid;
    }
	
    /**
     * 属性 vendeeParticipantid 的set方法
     * @return
     */
    public void setVendeeParticipantid(String vendeeParticipantid){
        this.vendeeParticipantid = vendeeParticipantid;
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
     * 属性 tradetypeId 的get方法
     * @return String
     */
    public String getTradetypeId(){
        return tradetypeId;
    }
	
    /**
     * 属性 tradetypeId 的set方法
     * @return
     */
    public void setTradetypeId(String tradetypeId){
        this.tradetypeId = tradetypeId;
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
     * 属性 remark 的get方法
     * @return String
     */
    public String getRemark(){
        return remark;
    }
	
    /**
     * 属性 remark 的set方法
     * @return
     */
    public void setRemark(String remark){
        this.remark = remark;
    } 
	
	
	
    /**
     * 属性 saleUnitsName 的get方法
     * @return String
     */
    public String getSaleUnitsName(){
        return saleUnitsName;
    }
	
    /**
     * 属性 saleUnitsName 的set方法
     * @return
     */
    public void setSaleUnitsName(String saleUnitsName){
        this.saleUnitsName = saleUnitsName;
    } 
	
	
	
    /**
     * 属性 vendeeUnitsName 的get方法
     * @return String
     */
    public String getVendeeUnitsName(){
        return vendeeUnitsName;
    }
	
    /**
     * 属性 vendeeUnitsName 的set方法
     * @return
     */
    public void setVendeeUnitsName(String vendeeUnitsName){
        this.vendeeUnitsName = vendeeUnitsName;
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
     * 属性 tradeStatType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradeStatType(){
        return tradeStatType;
    }
	
    /**
     * 属性 tradeStatType 的set方法
     * @return
     */
    public void setTradeStatType(BigDecimal tradeStatType){
        this.tradeStatType = tradeStatType;
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
     * 属性 flowid 的get方法
     * @return String
     */
    public String getFlowid(){
        return flowid;
    }
	
    /**
     * 属性 flowid 的set方法
     * @return
     */
    public void setFlowid(String flowid){
        this.flowid = flowid;
    } 
	
	
	
    /**
     * 属性 confirmState 的get方法
     * @return BigDecimal
     */
    public BigDecimal getConfirmState(){
        return confirmState;
    }
	
    /**
     * 属性 confirmState 的set方法
     * @return
     */
    public void setConfirmState(BigDecimal confirmState){
        this.confirmState = confirmState;
    } 
	
	
	
    /**
     * 属性 bak1 的get方法
     * @return String
     */
    public String getBak1(){
        return bak1;
    }
	
    /**
     * 属性 bak1 的set方法
     * @return
     */
    public void setBak1(String bak1){
        this.bak1 = bak1;
    } 
	
	
	
    /**
     * 属性 bak2 的get方法
     * @return String
     */
    public String getBak2(){
        return bak2;
    }
	
    /**
     * 属性 bak2 的set方法
     * @return
     */
    public void setBak2(String bak2){
        this.bak2 = bak2;
    } 
	
	
	
    /**
     * 属性 bak3 的get方法
     * @return String
     */
    public String getBak3(){
        return bak3;
    }
	
    /**
     * 属性 bak3 的set方法
     * @return
     */
    public void setBak3(String bak3){
        this.bak3 = bak3;
    } 
	
	
	
    /**
     * 属性 bak4 的get方法
     * @return String
     */
    public String getBak4(){
        return bak4;
    }
	
    /**
     * 属性 bak4 的set方法
     * @return
     */
    public void setBak4(String bak4){
        this.bak4 = bak4;
    } 
	
	
	
    /**
     * 属性 bak5 的get方法
     * @return String
     */
    public String getBak5(){
        return bak5;
    }
	
    /**
     * 属性 bak5 的set方法
     * @return
     */
    public void setBak5(String bak5){
        this.bak5 = bak5;
    } 
	
	
	
    /**
     * 属性 bak6 的get方法
     * @return String
     */
    public String getBak6(){
        return bak6;
    }
	
    /**
     * 属性 bak6 的set方法
     * @return
     */
    public void setBak6(String bak6){
        this.bak6 = bak6;
    } 
	
	
	
    /**
     * 属性 bak7 的get方法
     * @return String
     */
    public String getBak7(){
        return bak7;
    }
	
    /**
     * 属性 bak7 的set方法
     * @return
     */
    public void setBak7(String bak7){
        this.bak7 = bak7;
    } 
	
	
	
    /**
     * 属性 bak8 的get方法
     * @return String
     */
    public String getBak8(){
        return bak8;
    }
	
    /**
     * 属性 bak8 的set方法
     * @return
     */
    public void setBak8(String bak8){
        this.bak8 = bak8;
    } 
	
	
	
    /**
     * 属性 bak9 的get方法
     * @return String
     */
    public String getBak9(){
        return bak9;
    }
	
    /**
     * 属性 bak9 的set方法
     * @return
     */
    public void setBak9(String bak9){
        this.bak9 = bak9;
    } 
	
	
	
    /**
     * 属性 bak10 的get方法
     * @return String
     */
    public String getBak10(){
        return bak10;
    }
	
    /**
     * 属性 bak10 的set方法
     * @return
     */
    public void setBak10(String bak10){
        this.bak10 = bak10;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PubTrResultMainSum))
	        return false; 
			
        if(getId() == null) 
	        return false;

        PubTrResultMainSum other = (PubTrResultMainSum) o;	        
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
            .append("intervalIndex"+":"+getIntervalIndex())
            .append("saleParticipantid"+":"+getSaleParticipantid())
            .append("vendeeParticipantid"+":"+getVendeeParticipantid())
            .append("band"+":"+getBand())
            .append("tradeTimepart"+":"+getTradeTimepart())
            .append("tradetypeId"+":"+getTradetypeId())
            .append("vendeeEnergy"+":"+getVendeeEnergy())
            .append("saleEnergy"+":"+getSaleEnergy())
            .append("vendeePrice"+":"+getVendeePrice())
            .append("salePrice"+":"+getSalePrice())
            .append("vendeeEnergyPeriod1"+":"+getVendeeEnergyPeriod1())
            .append("saleEnergyPeriod1"+":"+getSaleEnergyPeriod1())
            .append("vendeePricePeriod1"+":"+getVendeePricePeriod1())
            .append("salePricePeriod1"+":"+getSalePricePeriod1())
            .append("vendeeEnergyPeriod2"+":"+getVendeeEnergyPeriod2())
            .append("saleEnergyPeriod2"+":"+getSaleEnergyPeriod2())
            .append("vendeePricePeriod2"+":"+getVendeePricePeriod2())
            .append("salePricePeriod2"+":"+getSalePricePeriod2())
            .append("vendeeEnergyPeriod3"+":"+getVendeeEnergyPeriod3())
            .append("saleEnergyPeriod3"+":"+getSaleEnergyPeriod3())
            .append("vendeePricePeriod3"+":"+getVendeePricePeriod3())
            .append("salePricePeriod3"+":"+getSalePricePeriod3())
            .append("vendeeEnergyPeriod4"+":"+getVendeeEnergyPeriod4())
            .append("saleEnergyPeriod4"+":"+getSaleEnergyPeriod4())
            .append("vendeePricePeriod4"+":"+getVendeePricePeriod4())
            .append("salePricePeriod4"+":"+getSalePricePeriod4())
            .append("vendeeEnergyPeriod5"+":"+getVendeeEnergyPeriod5())
            .append("saleEnergyPeriod5"+":"+getSaleEnergyPeriod5())
            .append("vendeePricePeriod5"+":"+getVendeePricePeriod5())
            .append("salePricePeriod5"+":"+getSalePricePeriod5())
            .append("vendeeGrosseng"+":"+getVendeeGrosseng())
            .append("saleGrosseng"+":"+getSaleGrosseng())
            .append("vendeeGrossengPeriod1"+":"+getVendeeGrossengPeriod1())
            .append("saleGrossengPeriod1"+":"+getSaleGrossengPeriod1())
            .append("vendeeGrossengPeriod2"+":"+getVendeeGrossengPeriod2())
            .append("saleGrossengPeriod2"+":"+getSaleGrossengPeriod2())
            .append("vendeeGrossengPeriod3"+":"+getVendeeGrossengPeriod3())
            .append("saleGrossengPeriod3"+":"+getSaleGrossengPeriod3())
            .append("vendeeGrossengPeriod4"+":"+getVendeeGrossengPeriod4())
            .append("saleGrossengPeriod4"+":"+getSaleGrossengPeriod4())
            .append("vendeeGrossengPeriod5"+":"+getVendeeGrossengPeriod5())
            .append("powerCurveId"+":"+getPowerCurveId())
            .append("remark"+":"+getRemark())
            .append("saleUnitsName"+":"+getSaleUnitsName())
            .append("vendeeUnitsName"+":"+getVendeeUnitsName())
            .append("stDate"+":"+getStDate())
            .append("tradeStatType"+":"+getTradeStatType())
            .append("vendeeGenRate"+":"+getVendeeGenRate())
            .append("saleGenRate"+":"+getSaleGenRate())
            .append("marketId"+":"+getMarketId())
            .append("flowid"+":"+getFlowid())
            .append("confirmState"+":"+getConfirmState())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
            .append("bak7"+":"+getBak7())
            .append("bak8"+":"+getBak8())
            .append("bak9"+":"+getBak9())
            .append("bak10"+":"+getBak10())
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