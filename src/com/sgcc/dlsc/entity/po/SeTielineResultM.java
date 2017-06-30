package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import java.sql.Timestamp;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SeTielineResultM的POJO类
 *
 * @author  dlsc  [Fri Oct 25 18:05:03 CST 2013]
 * 
 */
public class SeTielineResultM implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性mktMonth
     */
    private Date mktMonth;
	
    /** 
     * 属性tielineId
     */
    private String tielineId;
	
    /** 
     * 属性tielineIdN
     */
    private BigDecimal tielineIdN;
	
    /** 
     * 属性saleParticipantid
     */
    private String saleParticipantid;
	
    /** 
     * 属性vendeeParticipantid
     */
    private String vendeeParticipantid;
	
    /** 
     * 属性recipientParticipantid
     */
    private String recipientParticipantid;
	
    /** 
     * 属性payerParticipantid
     */
    private String payerParticipantid;
	
    /** 
     * 属性contractId
     */
    private String contractId;
	
    /** 
     * 属性sbstypeId
     */
    private String sbstypeId;
	
    /** 
     * 属性energyT
     */
    private BigDecimal energyT;
	
    /** 
     * 属性priceT
     */
    private BigDecimal priceT;
	
    /** 
     * 属性feeT
     */
    private BigDecimal feeT;
	
    /** 
     * 属性energyS
     */
    private BigDecimal energyS;
	
    /** 
     * 属性priceS
     */
    private BigDecimal priceS;
	
    /** 
     * 属性feeS
     */
    private BigDecimal feeS;
	
    /** 
     * 属性energyP
     */
    private BigDecimal energyP;
	
    /** 
     * 属性priceP
     */
    private BigDecimal priceP;
	
    /** 
     * 属性feeP
     */
    private BigDecimal feeP;
	
    /** 
     * 属性energyF
     */
    private BigDecimal energyF;
	
    /** 
     * 属性priceF
     */
    private BigDecimal priceF;
	
    /** 
     * 属性feeF
     */
    private BigDecimal feeF;
	
    /** 
     * 属性energyB
     */
    private BigDecimal energyB;
	
    /** 
     * 属性priceB
     */
    private BigDecimal priceB;
	
    /** 
     * 属性feeB
     */
    private BigDecimal feeB;
	
    /** 
     * 属性eenergyT
     */
    private BigDecimal eenergyT;
	
    /** 
     * 属性epriceT
     */
    private BigDecimal epriceT;
	
    /** 
     * 属性efeeT
     */
    private BigDecimal efeeT;
	
    /** 
     * 属性eenergyS
     */
    private BigDecimal eenergyS;
	
    /** 
     * 属性epriceS
     */
    private BigDecimal epriceS;
	
    /** 
     * 属性efeeS
     */
    private BigDecimal efeeS;
	
    /** 
     * 属性eenergyP
     */
    private BigDecimal eenergyP;
	
    /** 
     * 属性epriceP
     */
    private BigDecimal epriceP;
	
    /** 
     * 属性efeeP
     */
    private BigDecimal efeeP;
	
    /** 
     * 属性eenergyF
     */
    private BigDecimal eenergyF;
	
    /** 
     * 属性epriceF
     */
    private BigDecimal epriceF;
	
    /** 
     * 属性efeeF
     */
    private BigDecimal efeeF;
	
    /** 
     * 属性eenergyB
     */
    private BigDecimal eenergyB;
	
    /** 
     * 属性epriceB
     */
    private BigDecimal epriceB;
	
    /** 
     * 属性efeeB
     */
    private BigDecimal efeeB;
	
    /** 
     * 属性updateTime
     */
    private Timestamp updateTime;
	
    /**
     * SeTielineResultM构造函数
     */
    public SeTielineResultM() {
        super();
    }  
	
    /**
     * SeTielineResultM完整的构造函数
     */  
    public SeTielineResultM(String guid,String marketId,Date mktMonth,String tielineId,String contractId){
        this.guid = guid;
        this.marketId = marketId;
        this.mktMonth = mktMonth;
        this.tielineId = tielineId;
        this.contractId = contractId;
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
     * 属性 mktMonth 的get方法
     * @return Date
     */
    public Date getMktMonth(){
        return mktMonth;
    }
	
    /**
     * 属性 mktMonth 的set方法
     * @return
     */
    public void setMktMonth(Date mktMonth){
        this.mktMonth = mktMonth;
    } 
	
	
	
    /**
     * 属性 tielineId 的get方法
     * @return String
     */
    public String getTielineId(){
        return tielineId;
    }
	
    /**
     * 属性 tielineId 的set方法
     * @return
     */
    public void setTielineId(String tielineId){
        this.tielineId = tielineId;
    } 
	
	
	
    /**
     * 属性 tielineIdN 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTielineIdN(){
        return tielineIdN;
    }
	
    /**
     * 属性 tielineIdN 的set方法
     * @return
     */
    public void setTielineIdN(BigDecimal tielineIdN){
        this.tielineIdN = tielineIdN;
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
     * 属性 recipientParticipantid 的get方法
     * @return String
     */
    public String getRecipientParticipantid(){
        return recipientParticipantid;
    }
	
    /**
     * 属性 recipientParticipantid 的set方法
     * @return
     */
    public void setRecipientParticipantid(String recipientParticipantid){
        this.recipientParticipantid = recipientParticipantid;
    } 
	
	
	
    /**
     * 属性 payerParticipantid 的get方法
     * @return String
     */
    public String getPayerParticipantid(){
        return payerParticipantid;
    }
	
    /**
     * 属性 payerParticipantid 的set方法
     * @return
     */
    public void setPayerParticipantid(String payerParticipantid){
        this.payerParticipantid = payerParticipantid;
    } 
	
	
	
    /**
     * 属性 contractId 的get方法
     * @return String
     */
    public String getContractId(){
        return contractId;
    }
	
    /**
     * 属性 contractId 的set方法
     * @return
     */
    public void setContractId(String contractId){
        this.contractId = contractId;
    } 
	
	
	
    /**
     * 属性 sbstypeId 的get方法
     * @return String
     */
    public String getSbstypeId(){
        return sbstypeId;
    }
	
    /**
     * 属性 sbstypeId 的set方法
     * @return
     */
    public void setSbstypeId(String sbstypeId){
        this.sbstypeId = sbstypeId;
    } 
	
	
	
    /**
     * 属性 energyT 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyT(){
        return energyT;
    }
	
    /**
     * 属性 energyT 的set方法
     * @return
     */
    public void setEnergyT(BigDecimal energyT){
        this.energyT = energyT;
    } 
	
	
	
    /**
     * 属性 priceT 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPriceT(){
        return priceT;
    }
	
    /**
     * 属性 priceT 的set方法
     * @return
     */
    public void setPriceT(BigDecimal priceT){
        this.priceT = priceT;
    } 
	
	
	
    /**
     * 属性 feeT 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFeeT(){
        return feeT;
    }
	
    /**
     * 属性 feeT 的set方法
     * @return
     */
    public void setFeeT(BigDecimal feeT){
        this.feeT = feeT;
    } 
	
	
	
    /**
     * 属性 energyS 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyS(){
        return energyS;
    }
	
    /**
     * 属性 energyS 的set方法
     * @return
     */
    public void setEnergyS(BigDecimal energyS){
        this.energyS = energyS;
    } 
	
	
	
    /**
     * 属性 priceS 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPriceS(){
        return priceS;
    }
	
    /**
     * 属性 priceS 的set方法
     * @return
     */
    public void setPriceS(BigDecimal priceS){
        this.priceS = priceS;
    } 
	
	
	
    /**
     * 属性 feeS 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFeeS(){
        return feeS;
    }
	
    /**
     * 属性 feeS 的set方法
     * @return
     */
    public void setFeeS(BigDecimal feeS){
        this.feeS = feeS;
    } 
	
	
	
    /**
     * 属性 energyP 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyP(){
        return energyP;
    }
	
    /**
     * 属性 energyP 的set方法
     * @return
     */
    public void setEnergyP(BigDecimal energyP){
        this.energyP = energyP;
    } 
	
	
	
    /**
     * 属性 priceP 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPriceP(){
        return priceP;
    }
	
    /**
     * 属性 priceP 的set方法
     * @return
     */
    public void setPriceP(BigDecimal priceP){
        this.priceP = priceP;
    } 
	
	
	
    /**
     * 属性 feeP 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFeeP(){
        return feeP;
    }
	
    /**
     * 属性 feeP 的set方法
     * @return
     */
    public void setFeeP(BigDecimal feeP){
        this.feeP = feeP;
    } 
	
	
	
    /**
     * 属性 energyF 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyF(){
        return energyF;
    }
	
    /**
     * 属性 energyF 的set方法
     * @return
     */
    public void setEnergyF(BigDecimal energyF){
        this.energyF = energyF;
    } 
	
	
	
    /**
     * 属性 priceF 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPriceF(){
        return priceF;
    }
	
    /**
     * 属性 priceF 的set方法
     * @return
     */
    public void setPriceF(BigDecimal priceF){
        this.priceF = priceF;
    } 
	
	
	
    /**
     * 属性 feeF 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFeeF(){
        return feeF;
    }
	
    /**
     * 属性 feeF 的set方法
     * @return
     */
    public void setFeeF(BigDecimal feeF){
        this.feeF = feeF;
    } 
	
	
	
    /**
     * 属性 energyB 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyB(){
        return energyB;
    }
	
    /**
     * 属性 energyB 的set方法
     * @return
     */
    public void setEnergyB(BigDecimal energyB){
        this.energyB = energyB;
    } 
	
	
	
    /**
     * 属性 priceB 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPriceB(){
        return priceB;
    }
	
    /**
     * 属性 priceB 的set方法
     * @return
     */
    public void setPriceB(BigDecimal priceB){
        this.priceB = priceB;
    } 
	
	
	
    /**
     * 属性 feeB 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFeeB(){
        return feeB;
    }
	
    /**
     * 属性 feeB 的set方法
     * @return
     */
    public void setFeeB(BigDecimal feeB){
        this.feeB = feeB;
    } 
	
	
	
    /**
     * 属性 eenergyT 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEenergyT(){
        return eenergyT;
    }
	
    /**
     * 属性 eenergyT 的set方法
     * @return
     */
    public void setEenergyT(BigDecimal eenergyT){
        this.eenergyT = eenergyT;
    } 
	
	
	
    /**
     * 属性 epriceT 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEpriceT(){
        return epriceT;
    }
	
    /**
     * 属性 epriceT 的set方法
     * @return
     */
    public void setEpriceT(BigDecimal epriceT){
        this.epriceT = epriceT;
    } 
	
	
	
    /**
     * 属性 efeeT 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEfeeT(){
        return efeeT;
    }
	
    /**
     * 属性 efeeT 的set方法
     * @return
     */
    public void setEfeeT(BigDecimal efeeT){
        this.efeeT = efeeT;
    } 
	
	
	
    /**
     * 属性 eenergyS 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEenergyS(){
        return eenergyS;
    }
	
    /**
     * 属性 eenergyS 的set方法
     * @return
     */
    public void setEenergyS(BigDecimal eenergyS){
        this.eenergyS = eenergyS;
    } 
	
	
	
    /**
     * 属性 epriceS 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEpriceS(){
        return epriceS;
    }
	
    /**
     * 属性 epriceS 的set方法
     * @return
     */
    public void setEpriceS(BigDecimal epriceS){
        this.epriceS = epriceS;
    } 
	
	
	
    /**
     * 属性 efeeS 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEfeeS(){
        return efeeS;
    }
	
    /**
     * 属性 efeeS 的set方法
     * @return
     */
    public void setEfeeS(BigDecimal efeeS){
        this.efeeS = efeeS;
    } 
	
	
	
    /**
     * 属性 eenergyP 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEenergyP(){
        return eenergyP;
    }
	
    /**
     * 属性 eenergyP 的set方法
     * @return
     */
    public void setEenergyP(BigDecimal eenergyP){
        this.eenergyP = eenergyP;
    } 
	
	
	
    /**
     * 属性 epriceP 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEpriceP(){
        return epriceP;
    }
	
    /**
     * 属性 epriceP 的set方法
     * @return
     */
    public void setEpriceP(BigDecimal epriceP){
        this.epriceP = epriceP;
    } 
	
	
	
    /**
     * 属性 efeeP 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEfeeP(){
        return efeeP;
    }
	
    /**
     * 属性 efeeP 的set方法
     * @return
     */
    public void setEfeeP(BigDecimal efeeP){
        this.efeeP = efeeP;
    } 
	
	
	
    /**
     * 属性 eenergyF 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEenergyF(){
        return eenergyF;
    }
	
    /**
     * 属性 eenergyF 的set方法
     * @return
     */
    public void setEenergyF(BigDecimal eenergyF){
        this.eenergyF = eenergyF;
    } 
	
	
	
    /**
     * 属性 epriceF 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEpriceF(){
        return epriceF;
    }
	
    /**
     * 属性 epriceF 的set方法
     * @return
     */
    public void setEpriceF(BigDecimal epriceF){
        this.epriceF = epriceF;
    } 
	
	
	
    /**
     * 属性 efeeF 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEfeeF(){
        return efeeF;
    }
	
    /**
     * 属性 efeeF 的set方法
     * @return
     */
    public void setEfeeF(BigDecimal efeeF){
        this.efeeF = efeeF;
    } 
	
	
	
    /**
     * 属性 eenergyB 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEenergyB(){
        return eenergyB;
    }
	
    /**
     * 属性 eenergyB 的set方法
     * @return
     */
    public void setEenergyB(BigDecimal eenergyB){
        this.eenergyB = eenergyB;
    } 
	
	
	
    /**
     * 属性 epriceB 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEpriceB(){
        return epriceB;
    }
	
    /**
     * 属性 epriceB 的set方法
     * @return
     */
    public void setEpriceB(BigDecimal epriceB){
        this.epriceB = epriceB;
    } 
	
	
	
    /**
     * 属性 efeeB 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEfeeB(){
        return efeeB;
    }
	
    /**
     * 属性 efeeB 的set方法
     * @return
     */
    public void setEfeeB(BigDecimal efeeB){
        this.efeeB = efeeB;
    } 
	
	
	
    /**
     * 属性 updateTime 的get方法
     * @return Timestamp
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SeTielineResultM))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        SeTielineResultM other = (SeTielineResultM) o;	        
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
            .append("marketId"+":"+getMarketId())
            .append("mktMonth"+":"+getMktMonth())
            .append("tielineId"+":"+getTielineId())
            .append("tielineIdN"+":"+getTielineIdN())
            .append("saleParticipantid"+":"+getSaleParticipantid())
            .append("vendeeParticipantid"+":"+getVendeeParticipantid())
            .append("recipientParticipantid"+":"+getRecipientParticipantid())
            .append("payerParticipantid"+":"+getPayerParticipantid())
            .append("contractId"+":"+getContractId())
            .append("sbstypeId"+":"+getSbstypeId())
            .append("energyT"+":"+getEnergyT())
            .append("priceT"+":"+getPriceT())
            .append("feeT"+":"+getFeeT())
            .append("energyS"+":"+getEnergyS())
            .append("priceS"+":"+getPriceS())
            .append("feeS"+":"+getFeeS())
            .append("energyP"+":"+getEnergyP())
            .append("priceP"+":"+getPriceP())
            .append("feeP"+":"+getFeeP())
            .append("energyF"+":"+getEnergyF())
            .append("priceF"+":"+getPriceF())
            .append("feeF"+":"+getFeeF())
            .append("energyB"+":"+getEnergyB())
            .append("priceB"+":"+getPriceB())
            .append("feeB"+":"+getFeeB())
            .append("eenergyT"+":"+getEenergyT())
            .append("epriceT"+":"+getEpriceT())
            .append("efeeT"+":"+getEfeeT())
            .append("eenergyS"+":"+getEenergyS())
            .append("epriceS"+":"+getEpriceS())
            .append("efeeS"+":"+getEfeeS())
            .append("eenergyP"+":"+getEenergyP())
            .append("epriceP"+":"+getEpriceP())
            .append("efeeP"+":"+getEfeeP())
            .append("eenergyF"+":"+getEenergyF())
            .append("epriceF"+":"+getEpriceF())
            .append("efeeF"+":"+getEfeeF())
            .append("eenergyB"+":"+getEenergyB())
            .append("epriceB"+":"+getEpriceB())
            .append("efeeB"+":"+getEfeeB())
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