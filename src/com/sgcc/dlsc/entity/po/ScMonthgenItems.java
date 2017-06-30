package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * ScMonthgenItems的POJO类
 *
 * @author  Administrator  [Mon Jul 08 16:17:58 CST 2013]
 * 
 */
public class ScMonthgenItems implements Serializable{

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
     * 属性planunitId
     */
    private String planunitId;
	
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
     * 属性contractType
     */
    private BigDecimal contractType;
	
    /** 
     * 属性grossEng
     */
    private BigDecimal grossEng;
	
    /** 
     * 属性netEng
     */
    private BigDecimal netEng;
	
    /** 
     * 属性spireGrossEng
     */
    private BigDecimal spireGrossEng;
	
    /** 
     * 属性spirePeakNetEng
     */
    private BigDecimal spirePeakNetEng;
	
    /** 
     * 属性peakGrossEng
     */
    private BigDecimal peakGrossEng;
	
    /** 
     * 属性peakNetEng
     */
    private BigDecimal peakNetEng;
	
    /** 
     * 属性plainGrossEng
     */
    private BigDecimal plainGrossEng;
	
    /** 
     * 属性plainNetEng
     */
    private BigDecimal plainNetEng;
	
    /** 
     * 属性bottomGrossEng
     */
    private BigDecimal bottomGrossEng;
	
    /** 
     * 属性bottomNetEng
     */
    private BigDecimal bottomNetEng;
	
    /** 
     * 属性phyunitName
     */
    private String phyunitName;
	
    /** 
     * 属性userName
     */
    private String userName;
	
    /** 
     * 属性startDate
     */
    private Date startDate;
	
    /** 
     * 属性endDate
     */
    private Date endDate;
	
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
     * 属性remark
     */
    private String remark;
	
    /** 
     * 属性updateTime
     */
    private Date updateTime;
	
    /**
     * ScMonthgenItems构造函数
     */
    public ScMonthgenItems() {
        super();
    }  
	
    /**
     * ScMonthgenItems完整的构造函数
     */  
    public ScMonthgenItems(String id,String marketId,Date planDate,String versionId,String planunitId,String plantypeId,String contractId,BigDecimal bandIndex,BigDecimal contractType){
        this.id = id;
        this.marketId = marketId;
        this.planDate = planDate;
        this.versionId = versionId;
        this.planunitId = planunitId;
        this.plantypeId = plantypeId;
        this.contractId = contractId;
        this.bandIndex = bandIndex;
        this.contractType = contractType;
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
     * 属性 planunitId 的get方法
     * @return String
     */
    public String getPlanunitId(){
        return planunitId;
    }
	
    /**
     * 属性 planunitId 的set方法
     * @return
     */
    public void setPlanunitId(String planunitId){
        this.planunitId = planunitId;
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
     * 属性 grossEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEng(){
        return grossEng;
    }
	
    /**
     * 属性 grossEng 的set方法
     * @return
     */
    public void setGrossEng(BigDecimal grossEng){
        this.grossEng = grossEng;
    } 
	
    /**
     * 属性 netEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEng(){
        return netEng;
    }
	
    /**
     * 属性 netEng 的set方法
     * @return
     */
    public void setNetEng(BigDecimal netEng){
        this.netEng = netEng;
    } 
	
    /**
     * 属性 spireGrossEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSpireGrossEng(){
        return spireGrossEng;
    }
	
    /**
     * 属性 spireGrossEng 的set方法
     * @return
     */
    public void setSpireGrossEng(BigDecimal spireGrossEng){
        this.spireGrossEng = spireGrossEng;
    } 
	
    /**
     * 属性 spirePeakNetEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSpirePeakNetEng(){
        return spirePeakNetEng;
    }
	
    /**
     * 属性 spirePeakNetEng 的set方法
     * @return
     */
    public void setSpirePeakNetEng(BigDecimal spirePeakNetEng){
        this.spirePeakNetEng = spirePeakNetEng;
    } 
	
    /**
     * 属性 peakGrossEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPeakGrossEng(){
        return peakGrossEng;
    }
	
    /**
     * 属性 peakGrossEng 的set方法
     * @return
     */
    public void setPeakGrossEng(BigDecimal peakGrossEng){
        this.peakGrossEng = peakGrossEng;
    } 
	
    /**
     * 属性 peakNetEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPeakNetEng(){
        return peakNetEng;
    }
	
    /**
     * 属性 peakNetEng 的set方法
     * @return
     */
    public void setPeakNetEng(BigDecimal peakNetEng){
        this.peakNetEng = peakNetEng;
    } 
	
    /**
     * 属性 plainGrossEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlainGrossEng(){
        return plainGrossEng;
    }
	
    /**
     * 属性 plainGrossEng 的set方法
     * @return
     */
    public void setPlainGrossEng(BigDecimal plainGrossEng){
        this.plainGrossEng = plainGrossEng;
    } 
	
    /**
     * 属性 plainNetEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlainNetEng(){
        return plainNetEng;
    }
	
    /**
     * 属性 plainNetEng 的set方法
     * @return
     */
    public void setPlainNetEng(BigDecimal plainNetEng){
        this.plainNetEng = plainNetEng;
    } 
	
    /**
     * 属性 bottomGrossEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBottomGrossEng(){
        return bottomGrossEng;
    }
	
    /**
     * 属性 bottomGrossEng 的set方法
     * @return
     */
    public void setBottomGrossEng(BigDecimal bottomGrossEng){
        this.bottomGrossEng = bottomGrossEng;
    } 
	
    /**
     * 属性 bottomNetEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBottomNetEng(){
        return bottomNetEng;
    }
	
    /**
     * 属性 bottomNetEng 的set方法
     * @return
     */
    public void setBottomNetEng(BigDecimal bottomNetEng){
        this.bottomNetEng = bottomNetEng;
    } 
	
    /**
     * 属性 phyunitName 的get方法
     * @return String
     */
    public String getPhyunitName(){
        return phyunitName;
    }
	
    /**
     * 属性 phyunitName 的set方法
     * @return
     */
    public void setPhyunitName(String phyunitName){
        this.phyunitName = phyunitName;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof ScMonthgenItems))
	        return false; 
			
        if(getId() == null) 
	        return false;

        ScMonthgenItems other = (ScMonthgenItems) o;	        
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
            .append("planunitId"+":"+getPlanunitId())
            .append("plantypeId"+":"+getPlantypeId())
            .append("contractId"+":"+getContractId())
            .append("bandIndex"+":"+getBandIndex())
            .append("contractType"+":"+getContractType())
            .append("grossEng"+":"+getGrossEng())
            .append("netEng"+":"+getNetEng())
            .append("spireGrossEng"+":"+getSpireGrossEng())
            .append("spirePeakNetEng"+":"+getSpirePeakNetEng())
            .append("peakGrossEng"+":"+getPeakGrossEng())
            .append("peakNetEng"+":"+getPeakNetEng())
            .append("plainGrossEng"+":"+getPlainGrossEng())
            .append("plainNetEng"+":"+getPlainNetEng())
            .append("bottomGrossEng"+":"+getBottomGrossEng())
            .append("bottomNetEng"+":"+getBottomNetEng())
            .append("phyunitName"+":"+getPhyunitName())
            .append("userName"+":"+getUserName())
            .append("startDate"+":"+getStartDate())
            .append("endDate"+":"+getEndDate())
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
            .append("remark"+":"+getRemark())
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