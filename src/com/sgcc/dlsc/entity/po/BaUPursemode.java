package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaUPursemode的POJO类
 *
 * @author  yangguang  [Wed Feb 12 17:31:12 CST 2014]
 * 
 */
public class BaUPursemode implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性participantId
     */
    private String participantId;
	
    /** 
     * 属性upursemode
     */
    private BigDecimal upursemode;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性appNo
     */
    private String appNo;
	
    /** 
     * 属性updatedate
     */
    private Date updatedate;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /**
     * BaUPursemode构造函数
     */
    public BaUPursemode() {
        super();
    }  
	
    /**
     * BaUPursemode完整的构造函数
     */  
    public BaUPursemode(String guid,String participantId,BigDecimal upursemode,Date starteffectivedate,String marketId){
        this.guid = guid;
        this.participantId = participantId;
        this.upursemode = upursemode;
        this.starteffectivedate = starteffectivedate;
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
     * 属性 starteffectivedate 的get方法
     * @return Date
     */
    public Date getStarteffectivedate(){
        return starteffectivedate;
    }
	
    /**
     * 属性 starteffectivedate 的set方法
     * @return
     */
    public void setStarteffectivedate(Date starteffectivedate){
        this.starteffectivedate = starteffectivedate;
    } 
	
    /**
     * 属性 endeffectivedate 的get方法
     * @return Date
     */
    public Date getEndeffectivedate(){
        return endeffectivedate;
    }
	
    /**
     * 属性 endeffectivedate 的set方法
     * @return
     */
    public void setEndeffectivedate(Date endeffectivedate){
        this.endeffectivedate = endeffectivedate;
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
     * 属性 updatedate 的get方法
     * @return Date
     */
    public Date getUpdatedate(){
        return updatedate;
    }
	
    /**
     * 属性 updatedate 的set方法
     * @return
     */
    public void setUpdatedate(Date updatedate){
        this.updatedate = updatedate;
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
		
        if (o == null || !(o instanceof BaUPursemode))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaUPursemode other = (BaUPursemode) o;	        
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
            .append("upursemode"+":"+getUpursemode())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("appNo"+":"+getAppNo())
            .append("updatedate"+":"+getUpdatedate())
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