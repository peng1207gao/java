package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SeResultNM的POJO类
 *
 * @author  dlsc  [Mon Oct 28 19:48:56 CST 2013]
 * 
 */
public class SeResultNM implements Serializable{

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
     * 属性bandIndex
     */
    private BigDecimal bandIndex;
	
    /** 
     * 属性startDate
     */
    private Date startDate;
	
    /** 
     * 属性endDate
     */
    private Date endDate;
	
    /** 
     * 属性sbsUnitId
     */
    private String sbsUnitId;
	
    /** 
     * 属性sbsUnitIdN
     */
    private BigDecimal sbsUnitIdN;
	
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
     * 属性isAdd
     */
    private BigDecimal isAdd;
	
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
     * SeResultNM构造函数
     */
    public SeResultNM() {
        super();
    }  
	
    /**
     * SeResultNM完整的构造函数
     */  
    public SeResultNM(String guid,String marketId,Date mktMonth,BigDecimal bandIndex,Date startDate,Date endDate,String sbsUnitId,String recipientParticipantid,String payerParticipantid,String contractId,BigDecimal isAdd,String sbstypeId){
        this.guid = guid;
        this.marketId = marketId;
        this.mktMonth = mktMonth;
        this.bandIndex = bandIndex;
        this.startDate = startDate;
        this.endDate = endDate;
        this.sbsUnitId = sbsUnitId;
        this.recipientParticipantid = recipientParticipantid;
        this.payerParticipantid = payerParticipantid;
        this.contractId = contractId;
        this.isAdd = isAdd;
        this.sbstypeId = sbstypeId;
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
     * 属性 bandIndex 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBandIndex(){
        return bandIndex;
    }
	
    /**
     * 属性 bandIndex 的set方法
     * @return
     */
    public void setBandIndex(BigDecimal bandIndex){
        this.bandIndex = bandIndex;
    } 
	
	
	
    /**
     * 属性 startDate 的get方法
     * @return Date
     */
    public Date getStartDate(){
        return startDate;
    }
	
    /**
     * 属性 startDate 的set方法
     * @return
     */
    public void setStartDate(Date startDate){
        this.startDate = startDate;
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
     * 属性 sbsUnitId 的get方法
     * @return String
     */
    public String getSbsUnitId(){
        return sbsUnitId;
    }
	
    /**
     * 属性 sbsUnitId 的set方法
     * @return
     */
    public void setSbsUnitId(String sbsUnitId){
        this.sbsUnitId = sbsUnitId;
    } 
	
	
	
    /**
     * 属性 sbsUnitIdN 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSbsUnitIdN(){
        return sbsUnitIdN;
    }
	
    /**
     * 属性 sbsUnitIdN 的set方法
     * @return
     */
    public void setSbsUnitIdN(BigDecimal sbsUnitIdN){
        this.sbsUnitIdN = sbsUnitIdN;
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
     * 属性 isAdd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsAdd(){
        return isAdd;
    }
	
    /**
     * 属性 isAdd 的set方法
     * @return
     */
    public void setIsAdd(BigDecimal isAdd){
        this.isAdd = isAdd;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SeResultNM))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        SeResultNM other = (SeResultNM) o;	        
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
            .append("bandIndex"+":"+getBandIndex())
            .append("startDate"+":"+getStartDate())
            .append("endDate"+":"+getEndDate())
            .append("sbsUnitId"+":"+getSbsUnitId())
            .append("sbsUnitIdN"+":"+getSbsUnitIdN())
            .append("recipientParticipantid"+":"+getRecipientParticipantid())
            .append("payerParticipantid"+":"+getPayerParticipantid())
            .append("contractId"+":"+getContractId())
            .append("isAdd"+":"+getIsAdd())
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