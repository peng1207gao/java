package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaUserca的POJO类
 *
 * @author  Administrator  [Mon Mar 10 19:53:57 CST 2014]
 * 
 */
public class BaUserca implements Serializable{

    /** 
     * 属性userid
     */
    private String userid;
	
    /** 
     * 属性isout
     */
    private BigDecimal isout;
	
    /** 
     * 属性isca
     */
    private BigDecimal isca;
	
    /** 
     * 属性caid
     */
    private String caid;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性castartdate
     */
    private Date castartdate;
	
    /** 
     * 属性caenddate
     */
    private Date caenddate;
	
    /** 
     * 属性usercaid
     */
    private String usercaid;
	
    /** 
     * 属性username
     */
    private String username;
	
    /**
     * BaUserca构造函数
     */
    public BaUserca() {
        super();
    }  
	
    /**
     * BaUserca完整的构造函数
     */  
    public BaUserca(String userid,BigDecimal isca,String usercaid){
        this.userid = userid;
        this.isca = isca;
        this.usercaid = usercaid;
    }
 
    /**
     * 属性 userid 的get方法
     * @return String
     */
    public String getUserid(){
        return userid;
    }
	
    /**
     * 属性 userid 的set方法
     * @return
     */
    public void setUserid(String userid){
        this.userid = userid;
    } 
	
    /**
     * 属性 isout 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsout(){
        return isout;
    }
	
    /**
     * 属性 isout 的set方法
     * @return
     */
    public void setIsout(BigDecimal isout){
        this.isout = isout;
    } 
	
    /**
     * 属性 isca 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsca(){
        return isca;
    }
	
    /**
     * 属性 isca 的set方法
     * @return
     */
    public void setIsca(BigDecimal isca){
        this.isca = isca;
    } 
	
    /**
     * 属性 caid 的get方法
     * @return String
     */
    public String getCaid(){
        return caid;
    }
	
    /**
     * 属性 caid 的set方法
     * @return
     */
    public void setCaid(String caid){
        this.caid = caid;
    } 
	
    /**
     * 属性 updatepersonid 的get方法
     * @return String
     */
    public String getUpdatepersonid(){
        return updatepersonid;
    }
	
    /**
     * 属性 updatepersonid 的set方法
     * @return
     */
    public void setUpdatepersonid(String updatepersonid){
        this.updatepersonid = updatepersonid;
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
     * 属性 castartdate 的get方法
     * @return Date
     */
    public Date getCastartdate(){
        return castartdate;
    }
	
    /**
     * 属性 castartdate 的set方法
     * @return
     */
    public void setCastartdate(Date castartdate){
        this.castartdate = castartdate;
    } 
	
    /**
     * 属性 caenddate 的get方法
     * @return Date
     */
    public Date getCaenddate(){
        return caenddate;
    }
	
    /**
     * 属性 caenddate 的set方法
     * @return
     */
    public void setCaenddate(Date caenddate){
        this.caenddate = caenddate;
    } 
	
    /**
     * 属性 usercaid 的get方法
     * @return String
     */
    public String getUsercaid(){
        return usercaid;
    }
	
    /**
     * 属性 usercaid 的set方法
     * @return
     */
    public void setUsercaid(String usercaid){
        if(usercaid != null && usercaid.trim().length() == 0){
            this.usercaid = null;
        }else{
            this.usercaid = usercaid;
        }
    } 
	
    /**
     * 属性 username 的get方法
     * @return String
     */
    public String getUsername(){
        return username;
    }
	
    /**
     * 属性 username 的set方法
     * @return
     */
    public void setUsername(String username){
        this.username = username;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaUserca))
	        return false; 
			
        if(getUsercaid() == null) 
	        return false;

        BaUserca other = (BaUserca) o;	        
	    return new EqualsBuilder()
            .append(this.getUsercaid(), other.getUsercaid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("userid"+":"+getUserid())
            .append("isout"+":"+getIsout())
            .append("isca"+":"+getIsca())
            .append("caid"+":"+getCaid())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("updatetime"+":"+getUpdatetime())
            .append("castartdate"+":"+getCastartdate())
            .append("caenddate"+":"+getCaenddate())
            .append("usercaid"+":"+getUsercaid())
            .append("username"+":"+getUsername())
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