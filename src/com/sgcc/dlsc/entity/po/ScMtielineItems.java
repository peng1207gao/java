package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import java.sql.Timestamp;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * ScMtielineItems的POJO类
 *
 * @author  dlsc  [Thu Oct 24 17:55:42 CST 2013]
 * 
 */
public class ScMtielineItems implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性planDate
     */
    private Date planDate;
	
    /** 
     * 属性versionId
     */
    private String versionId;
	
    /** 
     * 属性sellerId
     */
    private String sellerId;
	
    /** 
     * 属性vendeeId
     */
    private String vendeeId;
	
    /** 
     * 属性plantypeId
     */
    private String plantypeId;
	
    /** 
     * 属性contractId
     */
    private String contractId;
	
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
     * 属性contractType
     */
    private BigDecimal contractType;
	
    /** 
     * 属性energy
     */
    private BigDecimal energy;
	
    /** 
     * 属性avgEng
     */
    private BigDecimal avgEng;
	
    /** 
     * 属性power
     */
    private BigDecimal power;
	
    /** 
     * 属性spireEng
     */
    private BigDecimal spireEng;
	
    /** 
     * 属性spirePower
     */
    private BigDecimal spirePower;
	
    /** 
     * 属性peakEng
     */
    private BigDecimal peakEng;
	
    /** 
     * 属性peakPower
     */
    private BigDecimal peakPower;
	
    /** 
     * 属性plainEng
     */
    private BigDecimal plainEng;
	
    /** 
     * 属性plainPower
     */
    private BigDecimal plainPower;
	
    /** 
     * 属性bottomEng
     */
    private BigDecimal bottomEng;
	
    /** 
     * 属性bottomPower
     */
    private BigDecimal bottomPower;
	
    /** 
     * 属性lossEng
     */
    private BigDecimal lossEng;
	
    /** 
     * 属性lossRatio
     */
    private BigDecimal lossRatio;
	
    /** 
     * 属性sellerBusid
     */
    private BigDecimal sellerBusid;
	
    /** 
     * 属性vendeeBusid
     */
    private BigDecimal vendeeBusid;
	
    /** 
     * 属性remark
     */
    private String remark;
	
    /** 
     * 属性updateTime
     */
    private Timestamp updateTime;
	
    /** 
     * 属性userName
     */
    private String userName;
	
    /** 
     * 属性bandStartDate
     */
    private Date bandStartDate;
	
    /** 
     * 属性bandEndDate
     */
    private Date bandEndDate;
	
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
     * ScMtielineItems构造函数
     */
    public ScMtielineItems() {
        super();
    }  
	
    /**
     * ScMtielineItems完整的构造函数
     */  
    public ScMtielineItems(String id,String marketId,Date planDate,String versionId,String plantypeId,String contractId,BigDecimal bandIndex,BigDecimal contractType,BigDecimal sellerBusid,BigDecimal vendeeBusid){
        this.id = id;
        this.marketId = marketId;
        this.planDate = planDate;
        this.versionId = versionId;
        this.plantypeId = plantypeId;
        this.contractId = contractId;
        this.bandIndex = bandIndex;
        this.contractType = contractType;
        this.sellerBusid = sellerBusid;
        this.vendeeBusid = vendeeBusid;
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
     * 属性 planDate 的get方法
     * @return Date
     */
    public Date getPlanDate(){
        return planDate;
    }
	
    /**
     * 属性 planDate 的set方法
     * @return
     */
    public void setPlanDate(Date planDate){
        this.planDate = planDate;
    } 
	
	
	
    /**
     * 属性 versionId 的get方法
     * @return String
     */
    public String getVersionId(){
        return versionId;
    }
	
    /**
     * 属性 versionId 的set方法
     * @return
     */
    public void setVersionId(String versionId){
        this.versionId = versionId;
    } 
	
	
	
    /**
     * 属性 sellerId 的get方法
     * @return String
     */
    public String getSellerId(){
        return sellerId;
    }
	
    /**
     * 属性 sellerId 的set方法
     * @return
     */
    public void setSellerId(String sellerId){
        this.sellerId = sellerId;
    } 
	
	
	
    /**
     * 属性 vendeeId 的get方法
     * @return String
     */
    public String getVendeeId(){
        return vendeeId;
    }
	
    /**
     * 属性 vendeeId 的set方法
     * @return
     */
    public void setVendeeId(String vendeeId){
        this.vendeeId = vendeeId;
    } 
	
	
	
    /**
     * 属性 plantypeId 的get方法
     * @return String
     */
    public String getPlantypeId(){
        return plantypeId;
    }
	
    /**
     * 属性 plantypeId 的set方法
     * @return
     */
    public void setPlantypeId(String plantypeId){
        this.plantypeId = plantypeId;
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
     * 属性 contractType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractType(){
        return contractType;
    }
	
    /**
     * 属性 contractType 的set方法
     * @return
     */
    public void setContractType(BigDecimal contractType){
        this.contractType = contractType;
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
     * 属性 avgEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAvgEng(){
        return avgEng;
    }
	
    /**
     * 属性 avgEng 的set方法
     * @return
     */
    public void setAvgEng(BigDecimal avgEng){
        this.avgEng = avgEng;
    } 
	
	
	
    /**
     * 属性 power 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPower(){
        return power;
    }
	
    /**
     * 属性 power 的set方法
     * @return
     */
    public void setPower(BigDecimal power){
        this.power = power;
    } 
	
	
	
    /**
     * 属性 spireEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSpireEng(){
        return spireEng;
    }
	
    /**
     * 属性 spireEng 的set方法
     * @return
     */
    public void setSpireEng(BigDecimal spireEng){
        this.spireEng = spireEng;
    } 
	
	
	
    /**
     * 属性 spirePower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSpirePower(){
        return spirePower;
    }
	
    /**
     * 属性 spirePower 的set方法
     * @return
     */
    public void setSpirePower(BigDecimal spirePower){
        this.spirePower = spirePower;
    } 
	
	
	
    /**
     * 属性 peakEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPeakEng(){
        return peakEng;
    }
	
    /**
     * 属性 peakEng 的set方法
     * @return
     */
    public void setPeakEng(BigDecimal peakEng){
        this.peakEng = peakEng;
    } 
	
	
	
    /**
     * 属性 peakPower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPeakPower(){
        return peakPower;
    }
	
    /**
     * 属性 peakPower 的set方法
     * @return
     */
    public void setPeakPower(BigDecimal peakPower){
        this.peakPower = peakPower;
    } 
	
	
	
    /**
     * 属性 plainEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlainEng(){
        return plainEng;
    }
	
    /**
     * 属性 plainEng 的set方法
     * @return
     */
    public void setPlainEng(BigDecimal plainEng){
        this.plainEng = plainEng;
    } 
	
	
	
    /**
     * 属性 plainPower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlainPower(){
        return plainPower;
    }
	
    /**
     * 属性 plainPower 的set方法
     * @return
     */
    public void setPlainPower(BigDecimal plainPower){
        this.plainPower = plainPower;
    } 
	
	
	
    /**
     * 属性 bottomEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBottomEng(){
        return bottomEng;
    }
	
    /**
     * 属性 bottomEng 的set方法
     * @return
     */
    public void setBottomEng(BigDecimal bottomEng){
        this.bottomEng = bottomEng;
    } 
	
	
	
    /**
     * 属性 bottomPower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBottomPower(){
        return bottomPower;
    }
	
    /**
     * 属性 bottomPower 的set方法
     * @return
     */
    public void setBottomPower(BigDecimal bottomPower){
        this.bottomPower = bottomPower;
    } 
	
	
	
    /**
     * 属性 lossEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLossEng(){
        return lossEng;
    }
	
    /**
     * 属性 lossEng 的set方法
     * @return
     */
    public void setLossEng(BigDecimal lossEng){
        this.lossEng = lossEng;
    } 
	
	
	
    /**
     * 属性 lossRatio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLossRatio(){
        return lossRatio;
    }
	
    /**
     * 属性 lossRatio 的set方法
     * @return
     */
    public void setLossRatio(BigDecimal lossRatio){
        this.lossRatio = lossRatio;
    } 
	
	
	
    /**
     * 属性 sellerBusid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSellerBusid(){
        return sellerBusid;
    }
	
    /**
     * 属性 sellerBusid 的set方法
     * @return
     */
    public void setSellerBusid(BigDecimal sellerBusid){
        this.sellerBusid = sellerBusid;
    } 
	
	
	
    /**
     * 属性 vendeeBusid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeBusid(){
        return vendeeBusid;
    }
	
    /**
     * 属性 vendeeBusid 的set方法
     * @return
     */
    public void setVendeeBusid(BigDecimal vendeeBusid){
        this.vendeeBusid = vendeeBusid;
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
     * 属性 userName 的get方法
     * @return String
     */
    public String getUserName(){
        return userName;
    }
	
    /**
     * 属性 userName 的set方法
     * @return
     */
    public void setUserName(String userName){
        this.userName = userName;
    } 
	
	
	
    /**
     * 属性 bandStartDate 的get方法
     * @return Date
     */
    public Date getBandStartDate(){
        return bandStartDate;
    }
	
    /**
     * 属性 bandStartDate 的set方法
     * @return
     */
    public void setBandStartDate(Date bandStartDate){
        this.bandStartDate = bandStartDate;
    } 
	
	
	
    /**
     * 属性 bandEndDate 的get方法
     * @return Date
     */
    public Date getBandEndDate(){
        return bandEndDate;
    }
	
    /**
     * 属性 bandEndDate 的set方法
     * @return
     */
    public void setBandEndDate(Date bandEndDate){
        this.bandEndDate = bandEndDate;
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
		
        if (o == null || !(o instanceof ScMtielineItems))
	        return false; 
			
        if(getId() == null) 
	        return false;

        ScMtielineItems other = (ScMtielineItems) o;	        
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
            .append("marketId"+":"+getMarketId())
            .append("planDate"+":"+getPlanDate())
            .append("versionId"+":"+getVersionId())
            .append("sellerId"+":"+getSellerId())
            .append("vendeeId"+":"+getVendeeId())
            .append("plantypeId"+":"+getPlantypeId())
            .append("contractId"+":"+getContractId())
            .append("bandIndex"+":"+getBandIndex())
            .append("startDate"+":"+getStartDate())
            .append("endDate"+":"+getEndDate())
            .append("contractType"+":"+getContractType())
            .append("energy"+":"+getEnergy())
            .append("avgEng"+":"+getAvgEng())
            .append("power"+":"+getPower())
            .append("spireEng"+":"+getSpireEng())
            .append("spirePower"+":"+getSpirePower())
            .append("peakEng"+":"+getPeakEng())
            .append("peakPower"+":"+getPeakPower())
            .append("plainEng"+":"+getPlainEng())
            .append("plainPower"+":"+getPlainPower())
            .append("bottomEng"+":"+getBottomEng())
            .append("bottomPower"+":"+getBottomPower())
            .append("lossEng"+":"+getLossEng())
            .append("lossRatio"+":"+getLossRatio())
            .append("sellerBusid"+":"+getSellerBusid())
            .append("vendeeBusid"+":"+getVendeeBusid())
            .append("remark"+":"+getRemark())
            .append("updateTime"+":"+getUpdateTime())
            .append("userName"+":"+getUserName())
            .append("bandStartDate"+":"+getBandStartDate())
            .append("bandEndDate"+":"+getBandEndDate())
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