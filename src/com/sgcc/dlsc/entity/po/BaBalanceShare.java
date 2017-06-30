package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaBalanceShare的POJO类
 *
 * @author  Administrator  [Fri Jul 19 09:06:32 CST 2013]
 * 
 */
public class BaBalanceShare implements Serializable{

    /** 
     * 属性balanceId
     */
    private String balanceId;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性shareid
     */
    private String shareid;
	
    /** 
     * 属性shareDate
     */
    private Date shareDate;
	
    /** 
     * 属性iswrite
     */
    private String iswrite;
	
    /**
     * BaBalanceShare构造函数
     */
    public BaBalanceShare() {
        super();
    }  
	
    /**
     * BaBalanceShare完整的构造函数
     */  
    public BaBalanceShare(String balanceId){
        this.balanceId = balanceId;
    }
 
    /**
     * 属性 balanceId 的get方法
     * @return String
     */
    public String getBalanceId(){
        return balanceId;
    }
	
    /**
     * 属性 balanceId 的set方法
     * @return
     */
    public void setBalanceId(String balanceId){
        if(balanceId != null && balanceId.trim().length() == 0){
            this.balanceId = null;
        }else{
            this.balanceId = balanceId;
        }
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
     * 属性 shareid 的get方法
     * @return String
     */
    public String getShareid(){
        return shareid;
    }
	
    /**
     * 属性 shareid 的set方法
     * @return
     */
    public void setShareid(String shareid){
        this.shareid = shareid;
    } 
	
    /**
     * 属性 shareDate 的get方法
     * @return Date
     */
    public Date getShareDate(){
        return shareDate;
    }
	
    /**
     * 属性 shareDate 的set方法
     * @return
     */
    public void setShareDate(Date shareDate){
        this.shareDate = shareDate;
    } 
	
    /**
     * 属性 iswrite 的get方法
     * @return String
     */
    public String getIswrite(){
        return iswrite;
    }
	
    /**
     * 属性 iswrite 的set方法
     * @return
     */
    public void setIswrite(String iswrite){
        this.iswrite = iswrite;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaBalanceShare))
	        return false; 
			
        if(getBalanceId() == null) 
	        return false;

        BaBalanceShare other = (BaBalanceShare) o;	        
	    return new EqualsBuilder()
            .append(this.getBalanceId(), other.getBalanceId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("balanceId"+":"+getBalanceId())
            .append("marketid"+":"+getMarketid())
            .append("shareid"+":"+getShareid())
            .append("shareDate"+":"+getShareDate())
            .append("iswrite"+":"+getIswrite())
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