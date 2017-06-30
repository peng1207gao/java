package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * SeTielineResultN的POJO类
 *
 * @author  DELL  [Wed Apr 23 15:00:46 CST 2014]
 * 
 */
public class SeTielineResultN implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性mktYear
     */
    private Date mktYear;
	
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
     * SeTielineResultN构造函数
     */
    public SeTielineResultN() {
        super();
    }  
	
    /**
     * SeTielineResultN完整的构造函数
     */  
    public SeTielineResultN(String guid,String marketId,Date mktYear,String tielineId,String saleParticipantid,String vendeeParticipantid,String recipientParticipantid,String payerParticipantid,String contractId,String sbstypeId){
        this.guid = guid;
        this.marketId = marketId;
        this.mktYear = mktYear;
        this.tielineId = tielineId;
        this.saleParticipantid = saleParticipantid;
        this.vendeeParticipantid = vendeeParticipantid;
        this.recipientParticipantid = recipientParticipantid;
        this.payerParticipantid = payerParticipantid;
        this.contractId = contractId;
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
     * 属性 mktYear 的get方法
     * @return Date
     */
    public Date getMktYear(){
        return mktYear;
    }
	
    /**
     * 属性 mktYear 的set方法
     * @return
     */
    public void setMktYear(Date mktYear){
        this.mktYear = mktYear;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof SeTielineResultN))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        SeTielineResultN other = (SeTielineResultN) o;	        
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
            .append("mktYear"+":"+getMktYear())
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