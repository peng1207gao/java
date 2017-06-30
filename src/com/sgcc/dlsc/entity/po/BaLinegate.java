package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaLinegate的POJO类
 *
 * @author  Administrator  [Sun Feb 23 14:15:56 CST 2014]
 * 
 */
public class BaLinegate implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性lineid
     */
    private String lineid;
	
    /** 
     * 属性gateid
     */
    private String gateid;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /**
     * BaLinegate构造函数
     */
    public BaLinegate() {
        super();
    }  
	
    /**
     * BaLinegate完整的构造函数
     */  
    public BaLinegate(String guid,String lineid,String gateid,Date starteffectivedate){
        this.guid = guid;
        this.lineid = lineid;
        this.gateid = gateid;
        this.starteffectivedate = starteffectivedate;
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
     * 属性 lineid 的get方法
     * @return String
     */
    public String getLineid(){
        return lineid;
    }
	
    /**
     * 属性 lineid 的set方法
     * @return
     */
    public void setLineid(String lineid){
        this.lineid = lineid;
    } 
	
    /**
     * 属性 gateid 的get方法
     * @return String
     */
    public String getGateid(){
        return gateid;
    }
	
    /**
     * 属性 gateid 的set方法
     * @return
     */
    public void setGateid(String gateid){
        this.gateid = gateid;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaLinegate))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaLinegate other = (BaLinegate) o;	        
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
            .append("lineid"+":"+getLineid())
            .append("gateid"+":"+getGateid())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
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