package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwPurchasemode的POJO类
 *
 * @author  zhangpei  [Wed Mar 12 17:40:00 CST 2014]
 * 
 */
public class DwPurchasemode implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性participantid
     */
    private String participantid;
	
    /** 
     * 属性purchasemode
     */
    private String purchasemode;
	
    /** 
     * 属性starteffecttime
     */
    private Date starteffecttime;
	
    /** 
     * 属性endeffecttime
     */
    private Date endeffecttime;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /**
     * DwPurchasemode构造函数
     */
    public DwPurchasemode() {
        super();
    }  
	
    /**
     * DwPurchasemode完整的构造函数
     */  
    public DwPurchasemode(String guid,String participantid){
        this.guid = guid;
        this.participantid = participantid;
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
     * 属性 participantid 的get方法
     * @return String
     */
    public String getParticipantid(){
        return participantid;
    }
	
    /**
     * 属性 participantid 的set方法
     * @return
     */
    public void setParticipantid(String participantid){
        this.participantid = participantid;
    } 
	
    /**
     * 属性 purchasemode 的get方法
     * @return String
     */
    public String getPurchasemode(){
        return purchasemode;
    }
	
    /**
     * 属性 purchasemode 的set方法
     * @return
     */
    public void setPurchasemode(String purchasemode){
        this.purchasemode = purchasemode;
    } 
	
    /**
     * 属性 starteffecttime 的get方法
     * @return Date
     */
    public Date getStarteffecttime(){
        return starteffecttime;
    }
	
    /**
     * 属性 starteffecttime 的set方法
     * @return
     */
    public void setStarteffecttime(Date starteffecttime){
        this.starteffecttime = starteffecttime;
    } 
	
    /**
     * 属性 endeffecttime 的get方法
     * @return Date
     */
    public Date getEndeffecttime(){
        return endeffecttime;
    }
	
    /**
     * 属性 endeffecttime 的set方法
     * @return
     */
    public void setEndeffecttime(Date endeffecttime){
        this.endeffecttime = endeffecttime;
    } 
	
    /**
     * 属性 updatetime 的get方法
     * @return Date
     */
    public Date getUpdatetime(){
        return updatetime;
    }
	
    /**
     * 属性 updatetime 的set方法
     * @return
     */
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwPurchasemode))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DwPurchasemode other = (DwPurchasemode) o;	        
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
            .append("participantid"+":"+getParticipantid())
            .append("purchasemode"+":"+getPurchasemode())
            .append("starteffecttime"+":"+getStarteffecttime())
            .append("endeffecttime"+":"+getEndeffecttime())
            .append("updatetime"+":"+getUpdatetime())
            .append("marketid"+":"+getMarketid())
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