package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaRegMktaadminload的POJO类
 *
 * @author  longshine  [Sat Mar 08 10:41:30 CST 2014]
 * 
 */
public class BaRegMktaadminload implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性loadId
     */
    private String loadId;
	
    /** 
     * 属性participantId
     */
    private String participantId;
	
    /** 
     * 属性loadName
     */
    private String loadName;
	
    /** 
     * 属性loadAliasname
     */
    private String loadAliasname;
	
    /** 
     * 属性industryType
     */
    private BigDecimal industryType;
	
    /** 
     * 属性loadType
     */
    private BigDecimal loadType;
	
    /** 
     * 属性normalCap
     */
    private BigDecimal normalCap;
	
    /** 
     * 属性maxLoad
     */
    private BigDecimal maxLoad;
	
    /** 
     * 属性powerFactor
     */
    private BigDecimal powerFactor;
	
    /** 
     * 属性validDate
     */
    private Date validDate;
	
    /** 
     * 属性invalidDate
     */
    private Date invalidDate;
	
    /** 
     * 属性updateTime
     */
    private Date updateTime;
	
    /** 
     * 属性updatePersonId
     */
    private String updatePersonId;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性operatedate
     */
    private Date operatedate;
	
    /** 
     * 属性operator
     */
    private String operator;
	
    /** 
     * 属性extend1
     */
    private String extend1;
	
    /** 
     * 属性extend2
     */
    private String extend2;
	
    /** 
     * 属性businessid
     */
    private String businessid;
	
    /** 
     * 属性voltageGrade
     */
    private BigDecimal voltageGrade;
	
    /** 
     * 属性userType
     */
    private BigDecimal userType;
	
    /** 
     * 属性loadSafeGrade
     */
    private BigDecimal loadSafeGrade;
	
    /** 
     * 属性transformerVolume
     */
    private BigDecimal transformerVolume;
	
    /** 
     * 属性mostVolume
     */
    private BigDecimal mostVolume;
	
    /** 
     * 属性directSupplyVolume
     */
    private BigDecimal directSupplyVolume;
	
    /** 
     * 属性transferAllotLoss
     */
    private BigDecimal transferAllotLoss;
	
    /**
     * BaRegMktaadminload构造函数
     */
    public BaRegMktaadminload() {
        super();
    }  
	
    /**
     * BaRegMktaadminload完整的构造函数
     */  
    public BaRegMktaadminload(String guid,String loadId,Date validDate,String marketid){
        this.guid = guid;
        this.loadId = loadId;
        this.validDate = validDate;
        this.marketid = marketid;
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
     * 属性 loadId 的get方法
     * @return String
     */
    public String getLoadId(){
        return loadId;
    }
	
    /**
     * 属性 loadId 的set方法
     * @return
     */
    public void setLoadId(String loadId){
        this.loadId = loadId;
    } 
	
	
	
    /**
     * 属性 participantId 的get方法
     * @return String
     */
    public String getParticipantId(){
        return participantId;
    }
	
    /**
     * 属性 participantId 的set方法
     * @return
     */
    public void setParticipantId(String participantId){
        this.participantId = participantId;
    } 
	
	
	
    /**
     * 属性 loadName 的get方法
     * @return String
     */
    public String getLoadName(){
        return loadName;
    }
	
    /**
     * 属性 loadName 的set方法
     * @return
     */
    public void setLoadName(String loadName){
        this.loadName = loadName;
    } 
	
	
	
    /**
     * 属性 loadAliasname 的get方法
     * @return String
     */
    public String getLoadAliasname(){
        return loadAliasname;
    }
	
    /**
     * 属性 loadAliasname 的set方法
     * @return
     */
    public void setLoadAliasname(String loadAliasname){
        this.loadAliasname = loadAliasname;
    } 
	
	
	
    /**
     * 属性 industryType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIndustryType(){
        return industryType;
    }
	
    /**
     * 属性 industryType 的set方法
     * @return
     */
    public void setIndustryType(BigDecimal industryType){
        this.industryType = industryType;
    } 
	
	
	
    /**
     * 属性 loadType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLoadType(){
        return loadType;
    }
	
    /**
     * 属性 loadType 的set方法
     * @return
     */
    public void setLoadType(BigDecimal loadType){
        this.loadType = loadType;
    } 
	
	
	
    /**
     * 属性 normalCap 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNormalCap(){
        return normalCap;
    }
	
    /**
     * 属性 normalCap 的set方法
     * @return
     */
    public void setNormalCap(BigDecimal normalCap){
        this.normalCap = normalCap;
    } 
	
	
	
    /**
     * 属性 maxLoad 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxLoad(){
        return maxLoad;
    }
	
    /**
     * 属性 maxLoad 的set方法
     * @return
     */
    public void setMaxLoad(BigDecimal maxLoad){
        this.maxLoad = maxLoad;
    } 
	
	
	
    /**
     * 属性 powerFactor 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowerFactor(){
        return powerFactor;
    }
	
    /**
     * 属性 powerFactor 的set方法
     * @return
     */
    public void setPowerFactor(BigDecimal powerFactor){
        this.powerFactor = powerFactor;
    } 
	
	
	
    /**
     * 属性 validDate 的get方法
     * @return Date
     */
    public Date getValidDate(){
        return validDate;
    }
	
    /**
     * 属性 validDate 的set方法
     * @return
     */
    public void setValidDate(Date validDate){
        this.validDate = validDate;
    } 
	
	
	
    /**
     * 属性 invalidDate 的get方法
     * @return Date
     */
    public Date getInvalidDate(){
        return invalidDate;
    }
	
    /**
     * 属性 invalidDate 的set方法
     * @return
     */
    public void setInvalidDate(Date invalidDate){
        this.invalidDate = invalidDate;
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
     * 属性 updatePersonId 的get方法
     * @return String
     */
    public String getUpdatePersonId(){
        return updatePersonId;
    }
	
    /**
     * 属性 updatePersonId 的set方法
     * @return
     */
    public void setUpdatePersonId(String updatePersonId){
        this.updatePersonId = updatePersonId;
    } 
	
	
	
    /**
     * 属性 marketid 的get方法
     * @return String
     */
    public String getMarketid(){
        return marketid;
    }
	
    /**
     * 属性 marketid 的set方法
     * @return
     */
    public void setMarketid(String marketid){
        this.marketid = marketid;
    } 
	
	
	
    /**
     * 属性 operatedate 的get方法
     * @return Date
     */
    public Date getOperatedate(){
        return operatedate;
    }
	
    /**
     * 属性 operatedate 的set方法
     * @return
     */
    public void setOperatedate(Date operatedate){
        this.operatedate = operatedate;
    } 
	
	
	
    /**
     * 属性 operator 的get方法
     * @return String
     */
    public String getOperator(){
        return operator;
    }
	
    /**
     * 属性 operator 的set方法
     * @return
     */
    public void setOperator(String operator){
        this.operator = operator;
    } 
	
	
	
    /**
     * 属性 extend1 的get方法
     * @return String
     */
    public String getExtend1(){
        return extend1;
    }
	
    /**
     * 属性 extend1 的set方法
     * @return
     */
    public void setExtend1(String extend1){
        this.extend1 = extend1;
    } 
	
	
	
    /**
     * 属性 extend2 的get方法
     * @return String
     */
    public String getExtend2(){
        return extend2;
    }
	
    /**
     * 属性 extend2 的set方法
     * @return
     */
    public void setExtend2(String extend2){
        this.extend2 = extend2;
    } 
	
	
	
    /**
     * 属性 businessid 的get方法
     * @return String
     */
    public String getBusinessid(){
        return businessid;
    }
	
    /**
     * 属性 businessid 的set方法
     * @return
     */
    public void setBusinessid(String businessid){
        this.businessid = businessid;
    } 
	
	
	
    /**
     * 属性 voltageGrade 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVoltageGrade(){
        return voltageGrade;
    }
	
    /**
     * 属性 voltageGrade 的set方法
     * @return
     */
    public void setVoltageGrade(BigDecimal voltageGrade){
        this.voltageGrade = voltageGrade;
    } 
	
	
	
    /**
     * 属性 userType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUserType(){
        return userType;
    }
	
    /**
     * 属性 userType 的set方法
     * @return
     */
    public void setUserType(BigDecimal userType){
        this.userType = userType;
    } 
	
	
	
    /**
     * 属性 loadSafeGrade 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLoadSafeGrade(){
        return loadSafeGrade;
    }
	
    /**
     * 属性 loadSafeGrade 的set方法
     * @return
     */
    public void setLoadSafeGrade(BigDecimal loadSafeGrade){
        this.loadSafeGrade = loadSafeGrade;
    } 
	
	
	
    /**
     * 属性 transformerVolume 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTransformerVolume(){
        return transformerVolume;
    }
	
    /**
     * 属性 transformerVolume 的set方法
     * @return
     */
    public void setTransformerVolume(BigDecimal transformerVolume){
        this.transformerVolume = transformerVolume;
    } 
	
	
	
    /**
     * 属性 mostVolume 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMostVolume(){
        return mostVolume;
    }
	
    /**
     * 属性 mostVolume 的set方法
     * @return
     */
    public void setMostVolume(BigDecimal mostVolume){
        this.mostVolume = mostVolume;
    } 
	
	
	
    /**
     * 属性 directSupplyVolume 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDirectSupplyVolume(){
        return directSupplyVolume;
    }
	
    /**
     * 属性 directSupplyVolume 的set方法
     * @return
     */
    public void setDirectSupplyVolume(BigDecimal directSupplyVolume){
        this.directSupplyVolume = directSupplyVolume;
    } 
	
	
	
    /**
     * 属性 transferAllotLoss 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTransferAllotLoss(){
        return transferAllotLoss;
    }
	
    /**
     * 属性 transferAllotLoss 的set方法
     * @return
     */
    public void setTransferAllotLoss(BigDecimal transferAllotLoss){
        this.transferAllotLoss = transferAllotLoss;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaRegMktaadminload))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaRegMktaadminload other = (BaRegMktaadminload) o;	        
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
            .append("loadId"+":"+getLoadId())
            .append("participantId"+":"+getParticipantId())
            .append("loadName"+":"+getLoadName())
            .append("loadAliasname"+":"+getLoadAliasname())
            .append("industryType"+":"+getIndustryType())
            .append("loadType"+":"+getLoadType())
            .append("normalCap"+":"+getNormalCap())
            .append("maxLoad"+":"+getMaxLoad())
            .append("powerFactor"+":"+getPowerFactor())
            .append("validDate"+":"+getValidDate())
            .append("invalidDate"+":"+getInvalidDate())
            .append("updateTime"+":"+getUpdateTime())
            .append("updatePersonId"+":"+getUpdatePersonId())
            .append("marketid"+":"+getMarketid())
            .append("operatedate"+":"+getOperatedate())
            .append("operator"+":"+getOperator())
            .append("extend1"+":"+getExtend1())
            .append("extend2"+":"+getExtend2())
            .append("businessid"+":"+getBusinessid())
            .append("voltageGrade"+":"+getVoltageGrade())
            .append("userType"+":"+getUserType())
            .append("loadSafeGrade"+":"+getLoadSafeGrade())
            .append("transformerVolume"+":"+getTransformerVolume())
            .append("mostVolume"+":"+getMostVolume())
            .append("directSupplyVolume"+":"+getDirectSupplyVolume())
            .append("transferAllotLoss"+":"+getTransferAllotLoss())
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