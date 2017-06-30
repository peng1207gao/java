package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * ZxjcDxpConfigUnit的POJO类
 *
 * @author  Administrator  [Wed Apr 23 10:11:33 CST 2014]
 * 
 */
public class ZxjcDxpConfigUnit implements Serializable{

    /** 
     * 属性objId
     */
    private String objId;
	
    /** 
     * 属性filePath
     */
    private String filePath;
	
    /** 
     * 属性fdeptcodesrc
     */
    private String fdeptcodesrc;
	
    /** 
     * 属性foperationname
     */
    private String foperationname;
	
    /** 
     * 属性rfeportdeptname
     */
    private String rfeportdeptname;
	
    /** 
     * 属性fusername
     */
    private String fusername;
	
    /** 
     * 属性fpassword
     */
    private String fpassword;
	
    /** 
     * 属性furlsrc
     */
    private String furlsrc;
	
    /** 
     * 属性isjms
     */
    private String isjms;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性jmsaddr
     */
    private String jmsaddr;
	
    /** 
     * 属性jmsmessagequeue
     */
    private String jmsmessagequeue;
	
    /**
     * ZxjcDxpConfigUnit构造函数
     */
    public ZxjcDxpConfigUnit() {
        super();
    }  
	
    /**
     * ZxjcDxpConfigUnit完整的构造函数
     */  
    public ZxjcDxpConfigUnit(String objId){
        this.objId = objId;
    }
 
    /**
     * 属性 objId 的get方法
     * @return String
     */
    public String getObjId(){
        return objId;
    }
	
    /**
     * 属性 objId 的set方法
     * @return
     */
    public void setObjId(String objId){
        if(objId != null && objId.trim().length() == 0){
            this.objId = null;
        }else{
            this.objId = objId;
        }
    } 
	
    /**
     * 属性 filePath 的get方法
     * @return String
     */
    public String getFilePath(){
        return filePath;
    }
	
    /**
     * 属性 filePath 的set方法
     * @return
     */
    public void setFilePath(String filePath){
        this.filePath = filePath;
    } 
	
    /**
     * 属性 fdeptcodesrc 的get方法
     * @return String
     */
    public String getFdeptcodesrc(){
        return fdeptcodesrc;
    }
	
    /**
     * 属性 fdeptcodesrc 的set方法
     * @return
     */
    public void setFdeptcodesrc(String fdeptcodesrc){
        this.fdeptcodesrc = fdeptcodesrc;
    } 
	
    /**
     * 属性 foperationname 的get方法
     * @return String
     */
    public String getFoperationname(){
        return foperationname;
    }
	
    /**
     * 属性 foperationname 的set方法
     * @return
     */
    public void setFoperationname(String foperationname){
        this.foperationname = foperationname;
    } 
	
    /**
     * 属性 rfeportdeptname 的get方法
     * @return String
     */
    public String getRfeportdeptname(){
        return rfeportdeptname;
    }
	
    /**
     * 属性 rfeportdeptname 的set方法
     * @return
     */
    public void setRfeportdeptname(String rfeportdeptname){
        this.rfeportdeptname = rfeportdeptname;
    } 
	
    /**
     * 属性 fusername 的get方法
     * @return String
     */
    public String getFusername(){
        return fusername;
    }
	
    /**
     * 属性 fusername 的set方法
     * @return
     */
    public void setFusername(String fusername){
        this.fusername = fusername;
    } 
	
    /**
     * 属性 fpassword 的get方法
     * @return String
     */
    public String getFpassword(){
        return fpassword;
    }
	
    /**
     * 属性 fpassword 的set方法
     * @return
     */
    public void setFpassword(String fpassword){
        this.fpassword = fpassword;
    } 
	
    /**
     * 属性 furlsrc 的get方法
     * @return String
     */
    public String getFurlsrc(){
        return furlsrc;
    }
	
    /**
     * 属性 furlsrc 的set方法
     * @return
     */
    public void setFurlsrc(String furlsrc){
        this.furlsrc = furlsrc;
    } 
	
    /**
     * 属性 isjms 的get方法
     * @return String
     */
    public String getIsjms(){
        return isjms;
    }
	
    /**
     * 属性 isjms 的set方法
     * @return
     */
    public void setIsjms(String isjms){
        this.isjms = isjms;
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
     * 属性 jmsaddr 的get方法
     * @return String
     */
    public String getJmsaddr(){
        return jmsaddr;
    }
	
    /**
     * 属性 jmsaddr 的set方法
     * @return
     */
    public void setJmsaddr(String jmsaddr){
        this.jmsaddr = jmsaddr;
    } 
	
    /**
     * 属性 jmsmessagequeue 的get方法
     * @return String
     */
    public String getJmsmessagequeue(){
        return jmsmessagequeue;
    }
	
    /**
     * 属性 jmsmessagequeue 的set方法
     * @return
     */
    public void setJmsmessagequeue(String jmsmessagequeue){
        this.jmsmessagequeue = jmsmessagequeue;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof ZxjcDxpConfigUnit))
	        return false; 
			
        if(getObjId() == null) 
	        return false;

        ZxjcDxpConfigUnit other = (ZxjcDxpConfigUnit) o;	        
	    return new EqualsBuilder()
            .append(this.getObjId(), other.getObjId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("objId"+":"+getObjId())
            .append("filePath"+":"+getFilePath())
            .append("fdeptcodesrc"+":"+getFdeptcodesrc())
            .append("foperationname"+":"+getFoperationname())
            .append("rfeportdeptname"+":"+getRfeportdeptname())
            .append("fusername"+":"+getFusername())
            .append("fpassword"+":"+getFpassword())
            .append("furlsrc"+":"+getFurlsrc())
            .append("isjms"+":"+getIsjms())
            .append("marketid"+":"+getMarketid())
            .append("jmsaddr"+":"+getJmsaddr())
            .append("jmsmessagequeue"+":"+getJmsmessagequeue())
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