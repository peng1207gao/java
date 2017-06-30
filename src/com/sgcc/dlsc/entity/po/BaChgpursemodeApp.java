package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaChgpursemodeApp的POJO类
 *
 * @author  Administrator  [Sat Feb 15 11:19:13 CST 2014]
 * 
 */
public class BaChgpursemodeApp implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性participantId
     */
    private String participantId;
	
    /** 
     * 属性appNo
     */
    private String appNo;
	
    /** 
     * 属性upursemode
     */
    private BigDecimal upursemode;
	
    /** 
     * 属性appUser
     */
    private String appUser;
	
    /** 
     * 属性appDate
     */
    private Date appDate;
	
    /** 
     * 属性bizyear
     */
    private BigDecimal bizyear;
	
    /** 
     * 属性chkUser
     */
    private String chkUser;
	
    /** 
     * 属性chkDate
     */
    private Date chkDate;
	
    /** 
     * 属性isPass
     */
    private BigDecimal isPass;
	
    /** 
     * 属性isPub
     */
    private BigDecimal isPub;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * BaChgpursemodeApp构造函数
     */
    public BaChgpursemodeApp() {
        super();
    }  
	
    /**
     * BaChgpursemodeApp完整的构造函数
     */  
    public BaChgpursemodeApp(String guid,String participantId,String appNo,BigDecimal upursemode,String appUser,Date appDate,String marketId){
        this.guid = guid;
        this.participantId = participantId;
        this.appNo = appNo;
        this.upursemode = upursemode;
        this.appUser = appUser;
        this.appDate = appDate;
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
     * 属性 appNo 的get方法
     * @return String
     */
    public String getAppNo(){
        return appNo;
    }
	
    /**
     * 属性 appNo 的set方法
     * @return
     */
    public void setAppNo(String appNo){
        this.appNo = appNo;
    } 
	
    /**
     * 属性 upursemode 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUpursemode(){
        return upursemode;
    }
	
    /**
     * 属性 upursemode 的set方法
     * @return
     */
    public void setUpursemode(BigDecimal upursemode){
        this.upursemode = upursemode;
    } 
	
    /**
     * 属性 appUser 的get方法
     * @return String
     */
    public String getAppUser(){
        return appUser;
    }
	
    /**
     * 属性 appUser 的set方法
     * @return
     */
    public void setAppUser(String appUser){
        this.appUser = appUser;
    } 
	
    /**
     * 属性 appDate 的get方法
     * @return Date
     */
    public Date getAppDate(){
        return appDate;
    }
	
    /**
     * 属性 appDate 的set方法
     * @return
     */
    public void setAppDate(Date appDate){
        this.appDate = appDate;
    } 
	
    /**
     * 属性 bizyear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBizyear(){
        return bizyear;
    }
	
    /**
     * 属性 bizyear 的set方法
     * @return
     */
    public void setBizyear(BigDecimal bizyear){
        this.bizyear = bizyear;
    } 
	
    /**
     * 属性 chkUser 的get方法
     * @return String
     */
    public String getChkUser(){
        return chkUser;
    }
	
    /**
     * 属性 chkUser 的set方法
     * @return
     */
    public void setChkUser(String chkUser){
        this.chkUser = chkUser;
    } 
	
    /**
     * 属性 chkDate 的get方法
     * @return Date
     */
    public Date getChkDate(){
        return chkDate;
    }
	
    /**
     * 属性 chkDate 的set方法
     * @return
     */
    public void setChkDate(Date chkDate){
        this.chkDate = chkDate;
    } 
	
    /**
     * 属性 isPass 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsPass(){
        return isPass;
    }
	
    /**
     * 属性 isPass 的set方法
     * @return
     */
    public void setIsPass(BigDecimal isPass){
        this.isPass = isPass;
    } 
	
    /**
     * 属性 isPub 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsPub(){
        return isPub;
    }
	
    /**
     * 属性 isPub 的set方法
     * @return
     */
    public void setIsPub(BigDecimal isPub){
        this.isPub = isPub;
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
		
        if (o == null || !(o instanceof BaChgpursemodeApp))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaChgpursemodeApp other = (BaChgpursemodeApp) o;	        
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
            .append("participantId"+":"+getParticipantId())
            .append("appNo"+":"+getAppNo())
            .append("upursemode"+":"+getUpursemode())
            .append("appUser"+":"+getAppUser())
            .append("appDate"+":"+getAppDate())
            .append("bizyear"+":"+getBizyear())
            .append("chkUser"+":"+getChkUser())
            .append("chkDate"+":"+getChkDate())
            .append("isPass"+":"+getIsPass())
            .append("isPub"+":"+getIsPub())
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