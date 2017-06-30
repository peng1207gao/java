package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaIntertiegate的POJO类
 *
 * @author  Administrator  [Fri Feb 21 19:06:14 CST 2014]
 * 
 */
public class BaIntertiegate implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性linkid
     */
    private String linkid;
	
    /** 
     * 属性gateno
     */
    private BigDecimal gateno;
	
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
     * BaIntertiegate构造函数
     */
    public BaIntertiegate() {
        super();
    }  
	
    /**
     * BaIntertiegate完整的构造函数
     */  
    public BaIntertiegate(String guid,String linkid,String gateid,Date starteffectivedate){
        this.guid = guid;
        this.linkid = linkid;
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
     * 属性 linkid 的get方法
     * @return String
     */
    public String getLinkid(){
        return linkid;
    }
	
    /**
     * 属性 linkid 的set方法
     * @return
     */
    public void setLinkid(String linkid){
        this.linkid = linkid;
    } 
	
    /**
     * 属性 gateno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGateno(){
        return gateno;
    }
	
    /**
     * 属性 gateno 的set方法
     * @return
     */
    public void setGateno(BigDecimal gateno){
        this.gateno = gateno;
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
		
        if (o == null || !(o instanceof BaIntertiegate))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaIntertiegate other = (BaIntertiegate) o;	        
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
            .append("linkid"+":"+getLinkid())
            .append("gateno"+":"+getGateno())
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