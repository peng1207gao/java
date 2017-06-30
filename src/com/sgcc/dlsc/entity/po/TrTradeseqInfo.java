package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeseqInfo的POJO类
 *
 * @author  Administrator  [Sat Aug 03 14:31:59 CST 2013]
 * 
 */
public class TrTradeseqInfo implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性tradeseqName
     */
    private String tradeseqName;
	
    /** 
     * 属性tradeseqCaption
     */
    private String tradeseqCaption;
	
    /** 
     * 属性tradetypeId
     */
    private String tradetypeId;
	
    /** 
     * 属性tradeseqCycle
     */
    private BigDecimal tradeseqCycle;
	
    /** 
     * 属性beginTime
     */
    private Date beginTime;
	
    /** 
     * 属性endTime
     */
    private Date endTime;
	
    /** 
     * 属性intervalNum
     */
    private BigDecimal intervalNum;
	
    /** 
     * 属性bandNum
     */
    private BigDecimal bandNum;
	
    /** 
     * 属性isFixedbands
     */
    private BigDecimal isFixedbands;
	
    /** 
     * 属性isOpenContract
     */
    private BigDecimal isOpenContract;
	
    /** 
     * 属性peakbottomTypeid
     */
    private BigDecimal peakbottomTypeid;
	
    /** 
     * 属性tradeComments
     */
    private String tradeComments;
	
    /** 
     * 属性createTime
     */
    private Date createTime;
	
    /** 
     * 属性createUser
     */
    private String createUser;
	
    /** 
     * 属性gbsRuleId
     */
    private BigDecimal gbsRuleId;
	
    /** 
     * 属性permitRuleId
     */
    private BigDecimal permitRuleId;
	
    /** 
     * 属性sortRuleId
     */
    private BigDecimal sortRuleId;
	
    /** 
     * 属性calcuRuleId
     */
    private BigDecimal calcuRuleId;
	
    /** 
     * 属性wfInstanceId
     */
    private String wfInstanceId;
	
    /** 
     * 属性pubId
     */
    private BigDecimal pubId;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * TrTradeseqInfo构造函数
     */
    public TrTradeseqInfo() {
        super();
    }  
	
    /**
     * TrTradeseqInfo完整的构造函数
     */  
    public TrTradeseqInfo(String guid,BigDecimal tradeseqId,String tradeseqName,String tradeseqCaption,String tradetypeId,BigDecimal tradeseqCycle,Date beginTime,Date endTime,BigDecimal intervalNum,BigDecimal bandNum,BigDecimal isFixedbands,BigDecimal isOpenContract,BigDecimal peakbottomTypeid,BigDecimal gbsRuleId,BigDecimal permitRuleId,BigDecimal sortRuleId,BigDecimal calcuRuleId,BigDecimal wfInstanceId,String marketId){
        this.guid = guid;
        this.tradeseqId = tradeseqId;
        this.tradeseqName = tradeseqName;
        this.tradeseqCaption = tradeseqCaption;
        this.tradetypeId = tradetypeId;
        this.tradeseqCycle = tradeseqCycle;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.intervalNum = intervalNum;
        this.bandNum = bandNum;
        this.isFixedbands = isFixedbands;
        this.isOpenContract = isOpenContract;
        this.peakbottomTypeid = peakbottomTypeid;
        this.gbsRuleId = gbsRuleId;
        this.permitRuleId = permitRuleId;
        this.sortRuleId = sortRuleId;
        this.calcuRuleId = calcuRuleId;
        this.marketId = marketId;
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
     * 属性 tradeseqName 的get方法
     * @return String
     */
    public String getTradeseqName(){
        return tradeseqName;
    }
	
    /**
     * 属性 tradeseqName 的set方法
     * @return
     */
    public void setTradeseqName(String tradeseqName){
        this.tradeseqName = tradeseqName;
    } 
	
    /**
     * 属性 tradeseqCaption 的get方法
     * @return String
     */
    public String getTradeseqCaption(){
        return tradeseqCaption;
    }
	
    /**
     * 属性 tradeseqCaption 的set方法
     * @return
     */
    public void setTradeseqCaption(String tradeseqCaption){
        this.tradeseqCaption = tradeseqCaption;
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
     * 属性 tradeseqCycle 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradeseqCycle(){
        return tradeseqCycle;
    }
	
    /**
     * 属性 tradeseqCycle 的set方法
     * @return
     */
    public void setTradeseqCycle(BigDecimal tradeseqCycle){
        this.tradeseqCycle = tradeseqCycle;
    } 
	
    /**
     * 属性 beginTime 的get方法
     * @return Date
     */
    public Date getBeginTime(){
        return beginTime;
    }
	
    /**
     * 属性 beginTime 的set方法
     * @return
     */
    public void setBeginTime(Date beginTime){
        this.beginTime = beginTime;
    } 
	
    /**
     * 属性 endTime 的get方法
     * @return Date
     */
    public Date getEndTime(){
        return endTime;
    }
	
    /**
     * 属性 endTime 的set方法
     * @return
     */
    public void setEndTime(Date endTime){
        this.endTime = endTime;
    } 
	
    /**
     * 属性 intervalNum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIntervalNum(){
        return intervalNum;
    }
	
    /**
     * 属性 intervalNum 的set方法
     * @return
     */
    public void setIntervalNum(BigDecimal intervalNum){
        this.intervalNum = intervalNum;
    } 
	
    /**
     * 属性 bandNum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBandNum(){
        return bandNum;
    }
	
    /**
     * 属性 bandNum 的set方法
     * @return
     */
    public void setBandNum(BigDecimal bandNum){
        this.bandNum = bandNum;
    } 
	
    /**
     * 属性 isFixedbands 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsFixedbands(){
        return isFixedbands;
    }
	
    /**
     * 属性 isFixedbands 的set方法
     * @return
     */
    public void setIsFixedbands(BigDecimal isFixedbands){
        this.isFixedbands = isFixedbands;
    } 
	
    /**
     * 属性 isOpenContract 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsOpenContract(){
        return isOpenContract;
    }
	
    /**
     * 属性 isOpenContract 的set方法
     * @return
     */
    public void setIsOpenContract(BigDecimal isOpenContract){
        this.isOpenContract = isOpenContract;
    } 
	
    /**
     * 属性 peakbottomTypeid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPeakbottomTypeid(){
        return peakbottomTypeid;
    }
	
    /**
     * 属性 peakbottomTypeid 的set方法
     * @return
     */
    public void setPeakbottomTypeid(BigDecimal peakbottomTypeid){
        this.peakbottomTypeid = peakbottomTypeid;
    } 
	
    /**
     * 属性 tradeComments 的get方法
     * @return String
     */
    public String getTradeComments(){
        return tradeComments;
    }
	
    /**
     * 属性 tradeComments 的set方法
     * @return
     */
    public void setTradeComments(String tradeComments){
        this.tradeComments = tradeComments;
    } 
	
    /**
     * 属性 createTime 的get方法
     * @return Date
     */
    public Date getCreateTime(){
        return createTime;
    }
	
    /**
     * 属性 createTime 的set方法
     * @return
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    } 
	
    /**
     * 属性 createUser 的get方法
     * @return String
     */
    public String getCreateUser(){
        return createUser;
    }
	
    /**
     * 属性 createUser 的set方法
     * @return
     */
    public void setCreateUser(String createUser){
        this.createUser = createUser;
    } 
	
    /**
     * 属性 gbsRuleId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGbsRuleId(){
        return gbsRuleId;
    }
	
    /**
     * 属性 gbsRuleId 的set方法
     * @return
     */
    public void setGbsRuleId(BigDecimal gbsRuleId){
        this.gbsRuleId = gbsRuleId;
    } 
	
    /**
     * 属性 permitRuleId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPermitRuleId(){
        return permitRuleId;
    }
	
    /**
     * 属性 permitRuleId 的set方法
     * @return
     */
    public void setPermitRuleId(BigDecimal permitRuleId){
        this.permitRuleId = permitRuleId;
    } 
	
    /**
     * 属性 sortRuleId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSortRuleId(){
        return sortRuleId;
    }
	
    /**
     * 属性 sortRuleId 的set方法
     * @return
     */
    public void setSortRuleId(BigDecimal sortRuleId){
        this.sortRuleId = sortRuleId;
    } 
	
    /**
     * 属性 calcuRuleId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCalcuRuleId(){
        return calcuRuleId;
    }
	
    /**
     * 属性 calcuRuleId 的set方法
     * @return
     */
    public void setCalcuRuleId(BigDecimal calcuRuleId){
        this.calcuRuleId = calcuRuleId;
    } 
	
   
	
    public String getWfInstanceId() {
		return wfInstanceId;
	}

	public void setWfInstanceId(String wfInstanceId) {
		this.wfInstanceId = wfInstanceId;
	}

	/**
     * 属性 pubId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPubId(){
        return pubId;
    }
	
    /**
     * 属性 pubId 的set方法
     * @return
     */
    public void setPubId(BigDecimal pubId){
        this.pubId = pubId;
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
		
        if (o == null || !(o instanceof TrTradeseqInfo))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrTradeseqInfo other = (TrTradeseqInfo) o;	        
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
            .append("tradeseqName"+":"+getTradeseqName())
            .append("tradeseqCaption"+":"+getTradeseqCaption())
            .append("tradetypeId"+":"+getTradetypeId())
            .append("tradeseqCycle"+":"+getTradeseqCycle())
            .append("beginTime"+":"+getBeginTime())
            .append("endTime"+":"+getEndTime())
            .append("intervalNum"+":"+getIntervalNum())
            .append("bandNum"+":"+getBandNum())
            .append("isFixedbands"+":"+getIsFixedbands())
            .append("isOpenContract"+":"+getIsOpenContract())
            .append("peakbottomTypeid"+":"+getPeakbottomTypeid())
            .append("tradeComments"+":"+getTradeComments())
            .append("createTime"+":"+getCreateTime())
            .append("createUser"+":"+getCreateUser())
            .append("gbsRuleId"+":"+getGbsRuleId())
            .append("permitRuleId"+":"+getPermitRuleId())
            .append("sortRuleId"+":"+getSortRuleId())
            .append("calcuRuleId"+":"+getCalcuRuleId())
            .append("wfInstanceId"+":"+getWfInstanceId())
            .append("pubId"+":"+getPubId())
            .append("marketId"+":"+getMarketId())
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