package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * IrVerify的POJO类
 *
 * @author  toshiba  [Tue Aug 13 17:33:41 CST 2013]
 * 
 */
public class IrVerify implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性verifyinfo
     */
    private String verifyinfo;
	
    /** 
     * 属性verifyuser
     */
    private String verifyuser;
	
    /** 
     * 属性verifytime
     */
    private Date verifytime;
	
    /** 
     * 属性verifydetail
     */
    private String verifydetail;
	
    /** 
     * 属性verifyconclusion
     */
    private String verifyconclusion;
	
    /**
     * IrVerify构造函数
     */
    public IrVerify() {
        super();
    }  
	
    /**
     * IrVerify完整的构造函数
     */  
    public IrVerify(String guid,String verifyinfo){
        this.guid = guid;
        this.verifyinfo = verifyinfo;
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
     * 属性 verifyinfo 的get方法
     * @return String
     */
    public String getVerifyinfo(){
        return verifyinfo;
    }
	
    /**
     * 属性 verifyinfo 的set方法
     * @return
     */
    public void setVerifyinfo(String verifyinfo){
        this.verifyinfo = verifyinfo;
    } 
	
    /**
     * 属性 verifyuser 的get方法
     * @return String
     */
    public String getVerifyuser(){
        return verifyuser;
    }
	
    /**
     * 属性 verifyuser 的set方法
     * @return
     */
    public void setVerifyuser(String verifyuser){
        this.verifyuser = verifyuser;
    } 
	
    /**
     * 属性 verifytime 的get方法
     * @return Date
     */
    public Date getVerifytime(){
        return verifytime;
    }
	
    /**
     * 属性 verifytime 的set方法
     * @return
     */
    public void setVerifytime(Date verifytime){
        this.verifytime = verifytime;
    } 
	
    /**
     * 属性 verifydetail 的get方法
     * @return String
     */
    public String getVerifydetail(){
        return verifydetail;
    }
	
    /**
     * 属性 verifydetail 的set方法
     * @return
     */
    public void setVerifydetail(String verifydetail){
        this.verifydetail = verifydetail;
    } 
	
    /**
     * 属性 verifyconclusion 的get方法
     * @return String
     */
    public String getVerifyconclusion(){
        return verifyconclusion;
    }
	
    /**
     * 属性 verifyconclusion 的set方法
     * @return
     */
    public void setVerifyconclusion(String verifyconclusion){
        this.verifyconclusion = verifyconclusion;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof IrVerify))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        IrVerify other = (IrVerify) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("verifyinfo"+":"+getVerifyinfo())
            .append("verifyuser"+":"+getVerifyuser())
            .append("verifytime"+":"+getVerifytime())
            .append("verifydetail"+":"+getVerifydetail())
            .append("verifyconclusion"+":"+getVerifyconclusion())
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