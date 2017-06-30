package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * MktsbsResultNR的POJO类
 *
 * @author  Administrator  [Sat Jun 15 10:08:35 CST 2013]
 * 
 */
public class MktsbsResultNR implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性mktDay
     */
    private Date mktDay;
	
    /** 
     * 属性bandIndex
     */
    private String bandIndex;
	
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
     * 属性recipientUnitId
     */
    private String recipientUnitId;
	
    /** 
     * 属性payerUnitId
     */
    private String payerUnitId;
	
    /** 
     * 属性contractId
     */
    private String contractId;
	
    /** 
     * 属性sbstypeId
     */
    private BigDecimal sbstypeId;
	
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
     * 属性energyL
     */
    private BigDecimal energyL;
	
    /** 
     * 属性priceL
     */
    private BigDecimal priceL;
	
    /** 
     * 属性feeL
     */
    private BigDecimal feeL;
	
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
     * 属性bakStr1
     */
    private String bakStr1;
	
    /** 
     * 属性bakStr2
     */
    private String bakStr2;
	
    /** 
     * 属性bakStr3
     */
    private String bakStr3;
	
    /** 
     * 属性bakInt1
     */
    private BigDecimal bakInt1;
	
    /** 
     * 属性bakInt2
     */
    private BigDecimal bakInt2;
	
    /** 
     * 属性bakInt3
     */
    private BigDecimal bakInt3;
	
    /** 
     * 属性bakDouble1
     */
    private BigDecimal bakDouble1;
	
    /** 
     * 属性bakDouble2
     */
    private BigDecimal bakDouble2;
	
    /** 
     * 属性bakDouble3
     */
    private BigDecimal bakDouble3;
	
    /** 
     * 属性bakDate1
     */
    private Date bakDate1;
	
    /** 
     * 属性bakDate2
     */
    private Date bakDate2;
	
    /** 
     * 属性bakDate3
     */
    private Date bakDate3;
	
    /**
     * MktsbsResultNR构造函数
     */
    public MktsbsResultNR() {
        super();
    }  
	
    /**
     * MktsbsResultNR完整的构造函数
     */  
    public MktsbsResultNR(String id,Date mktDay,String bandIndex,Date startDate,Date endDate,String sbsUnitId,String recipientUnitId,String payerUnitId,String contractId,BigDecimal sbstypeId){
        this.id = id;
        this.mktDay = mktDay;
        this.bandIndex = bandIndex;
        this.startDate = startDate;
        this.endDate = endDate;
        this.sbsUnitId = sbsUnitId;
        this.recipientUnitId = recipientUnitId;
        this.payerUnitId = payerUnitId;
        this.contractId = contractId;
        this.sbstypeId = sbstypeId;
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
     * 属性 mktDay 的get方法
     * @return Date
     */
    public Date getMktDay(){
        return mktDay;
    }
	
    /**
     * 属性 mktDay 的set方法
     * @return
     */
    public void setMktDay(Date mktDay){
        this.mktDay = mktDay;
    } 
	
    /**
     * 属性 bandIndex 的get方法
     * @return String
     */
    public String getBandIndex(){
        return bandIndex;
    }
	
    /**
     * 属性 bandIndex 的set方法
     * @return
     */
    public void setBandIndex(String bandIndex){
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
     * 属性 recipientUnitId 的get方法
     * @return String
     */
    public String getRecipientUnitId(){
        return recipientUnitId;
    }
	
    /**
     * 属性 recipientUnitId 的set方法
     * @return
     */
    public void setRecipientUnitId(String recipientUnitId){
        this.recipientUnitId = recipientUnitId;
    } 
	
    /**
     * 属性 payerUnitId 的get方法
     * @return String
     */
    public String getPayerUnitId(){
        return payerUnitId;
    }
	
    /**
     * 属性 payerUnitId 的set方法
     * @return
     */
    public void setPayerUnitId(String payerUnitId){
        this.payerUnitId = payerUnitId;
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
     * @return BigDecimal
     */
    public BigDecimal getSbstypeId(){
        return sbstypeId;
    }
	
    /**
     * 属性 sbstypeId 的set方法
     * @return
     */
    public void setSbstypeId(BigDecimal sbstypeId){
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
     * 属性 energyL 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergyL(){
        return energyL;
    }
	
    /**
     * 属性 energyL 的set方法
     * @return
     */
    public void setEnergyL(BigDecimal energyL){
        this.energyL = energyL;
    } 
	
    /**
     * 属性 priceL 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPriceL(){
        return priceL;
    }
	
    /**
     * 属性 priceL 的set方法
     * @return
     */
    public void setPriceL(BigDecimal priceL){
        this.priceL = priceL;
    } 
	
    /**
     * 属性 feeL 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFeeL(){
        return feeL;
    }
	
    /**
     * 属性 feeL 的set方法
     * @return
     */
    public void setFeeL(BigDecimal feeL){
        this.feeL = feeL;
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
     * 属性 bakStr1 的get方法
     * @return String
     */
    public String getBakStr1(){
        return bakStr1;
    }
	
    /**
     * 属性 bakStr1 的set方法
     * @return
     */
    public void setBakStr1(String bakStr1){
        this.bakStr1 = bakStr1;
    } 
	
    /**
     * 属性 bakStr2 的get方法
     * @return String
     */
    public String getBakStr2(){
        return bakStr2;
    }
	
    /**
     * 属性 bakStr2 的set方法
     * @return
     */
    public void setBakStr2(String bakStr2){
        this.bakStr2 = bakStr2;
    } 
	
    /**
     * 属性 bakStr3 的get方法
     * @return String
     */
    public String getBakStr3(){
        return bakStr3;
    }
	
    /**
     * 属性 bakStr3 的set方法
     * @return
     */
    public void setBakStr3(String bakStr3){
        this.bakStr3 = bakStr3;
    } 
	
    /**
     * 属性 bakInt1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt1(){
        return bakInt1;
    }
	
    /**
     * 属性 bakInt1 的set方法
     * @return
     */
    public void setBakInt1(BigDecimal bakInt1){
        this.bakInt1 = bakInt1;
    } 
	
    /**
     * 属性 bakInt2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt2(){
        return bakInt2;
    }
	
    /**
     * 属性 bakInt2 的set方法
     * @return
     */
    public void setBakInt2(BigDecimal bakInt2){
        this.bakInt2 = bakInt2;
    } 
	
    /**
     * 属性 bakInt3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt3(){
        return bakInt3;
    }
	
    /**
     * 属性 bakInt3 的set方法
     * @return
     */
    public void setBakInt3(BigDecimal bakInt3){
        this.bakInt3 = bakInt3;
    } 
	
    /**
     * 属性 bakDouble1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble1(){
        return bakDouble1;
    }
	
    /**
     * 属性 bakDouble1 的set方法
     * @return
     */
    public void setBakDouble1(BigDecimal bakDouble1){
        this.bakDouble1 = bakDouble1;
    } 
	
    /**
     * 属性 bakDouble2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble2(){
        return bakDouble2;
    }
	
    /**
     * 属性 bakDouble2 的set方法
     * @return
     */
    public void setBakDouble2(BigDecimal bakDouble2){
        this.bakDouble2 = bakDouble2;
    } 
	
    /**
     * 属性 bakDouble3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble3(){
        return bakDouble3;
    }
	
    /**
     * 属性 bakDouble3 的set方法
     * @return
     */
    public void setBakDouble3(BigDecimal bakDouble3){
        this.bakDouble3 = bakDouble3;
    } 
	
    /**
     * 属性 bakDate1 的get方法
     * @return Date
     */
    public Date getBakDate1(){
        return bakDate1;
    }
	
    /**
     * 属性 bakDate1 的set方法
     * @return
     */
    public void setBakDate1(Date bakDate1){
        this.bakDate1 = bakDate1;
    } 
	
    /**
     * 属性 bakDate2 的get方法
     * @return Date
     */
    public Date getBakDate2(){
        return bakDate2;
    }
	
    /**
     * 属性 bakDate2 的set方法
     * @return
     */
    public void setBakDate2(Date bakDate2){
        this.bakDate2 = bakDate2;
    } 
	
    /**
     * 属性 bakDate3 的get方法
     * @return Date
     */
    public Date getBakDate3(){
        return bakDate3;
    }
	
    /**
     * 属性 bakDate3 的set方法
     * @return
     */
    public void setBakDate3(Date bakDate3){
        this.bakDate3 = bakDate3;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof MktsbsResultNR))
	        return false; 
			
        if(getId() == null) 
	        return false;

        MktsbsResultNR other = (MktsbsResultNR) o;	        
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
            .append("mktDay"+":"+getMktDay())
            .append("bandIndex"+":"+getBandIndex())
            .append("startDate"+":"+getStartDate())
            .append("endDate"+":"+getEndDate())
            .append("sbsUnitId"+":"+getSbsUnitId())
            .append("recipientUnitId"+":"+getRecipientUnitId())
            .append("payerUnitId"+":"+getPayerUnitId())
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
            .append("energyL"+":"+getEnergyL())
            .append("priceL"+":"+getPriceL())
            .append("feeL"+":"+getFeeL())
            .append("energyB"+":"+getEnergyB())
            .append("priceB"+":"+getPriceB())
            .append("feeB"+":"+getFeeB())
            .append("bakStr1"+":"+getBakStr1())
            .append("bakStr2"+":"+getBakStr2())
            .append("bakStr3"+":"+getBakStr3())
            .append("bakInt1"+":"+getBakInt1())
            .append("bakInt2"+":"+getBakInt2())
            .append("bakInt3"+":"+getBakInt3())
            .append("bakDouble1"+":"+getBakDouble1())
            .append("bakDouble2"+":"+getBakDouble2())
            .append("bakDouble3"+":"+getBakDouble3())
            .append("bakDate1"+":"+getBakDate1())
            .append("bakDate2"+":"+getBakDate2())
            .append("bakDate3"+":"+getBakDate3())
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