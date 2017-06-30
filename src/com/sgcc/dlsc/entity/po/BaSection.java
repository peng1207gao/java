package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaSection的POJO类
 *
 * @author  xuhao  [Mon Feb 17 10:58:37 CST 2014]
 * 
 */
public class BaSection implements Serializable{

    /** 
     * 属性sectionid
     */
    private String sectionid;
	
    /** 
     * 属性sectionname
     */
    private String sectionname;
	
    /** 
     * 属性sectiontype
     */
    private BigDecimal sectiontype;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性registerdate
     */
    private Date registerdate;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性sectioncode
     */
    private String sectioncode;
	
    /** 
     * 属性maxcapacity
     */
    private BigDecimal maxcapacity;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性isdelete
     */
    private BigDecimal isdelete;
	
    /** 
     * 属性supersectionid
     */
    private String supersectionid;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /**
     * BaSection构造函数
     */
    public BaSection() {
        super();
    }  
	
    /**
     * BaSection完整的构造函数
     */  
    public BaSection(String sectionid,String sectionname,BigDecimal sectiontype,Date starteffectivedate,BigDecimal isdelete){
        this.sectionid = sectionid;
        this.sectionname = sectionname;
        this.sectiontype = sectiontype;
        this.starteffectivedate = starteffectivedate;
        this.isdelete = isdelete;
    }
 
    /**
     * 属性 sectionid 的get方法
     * @return String
     */
    public String getSectionid(){
        return sectionid;
    }
	
    /**
     * 属性 sectionid 的set方法
     * @return
     */
    public void setSectionid(String sectionid){
        if(sectionid != null && sectionid.trim().length() == 0){
            this.sectionid = null;
        }else{
            this.sectionid = sectionid;
        }
    } 
	
    /**
     * 属性 sectionname 的get方法
     * @return String
     */
    public String getSectionname(){
        return sectionname;
    }
	
    /**
     * 属性 sectionname 的set方法
     * @return
     */
    public void setSectionname(String sectionname){
        this.sectionname = sectionname;
    } 
	
    /**
     * 属性 sectiontype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSectiontype(){
        return sectiontype;
    }
	
    /**
     * 属性 sectiontype 的set方法
     * @return
     */
    public void setSectiontype(BigDecimal sectiontype){
        this.sectiontype = sectiontype;
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
     * 属性 registerdate 的get方法
     * @return Date
     */
    public Date getRegisterdate(){
        return registerdate;
    }
	
    /**
     * 属性 registerdate 的set方法
     * @return
     */
    public void setRegisterdate(Date registerdate){
        this.registerdate = registerdate;
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
     * 属性 sectioncode 的get方法
     * @return String
     */
    public String getSectioncode(){
        return sectioncode;
    }
	
    /**
     * 属性 sectioncode 的set方法
     * @return
     */
    public void setSectioncode(String sectioncode){
        this.sectioncode = sectioncode;
    } 
	
    /**
     * 属性 maxcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxcapacity(){
        return maxcapacity;
    }
	
    /**
     * 属性 maxcapacity 的set方法
     * @return
     */
    public void setMaxcapacity(BigDecimal maxcapacity){
        this.maxcapacity = maxcapacity;
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
     * 属性 isdelete 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdelete(){
        return isdelete;
    }
	
    /**
     * 属性 isdelete 的set方法
     * @return
     */
    public void setIsdelete(BigDecimal isdelete){
        this.isdelete = isdelete;
    } 
	
    /**
     * 属性 supersectionid 的get方法
     * @return String
     */
    public String getSupersectionid(){
        return supersectionid;
    }
	
    /**
     * 属性 supersectionid 的set方法
     * @return
     */
    public void setSupersectionid(String supersectionid){
        this.supersectionid = supersectionid;
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
        this.guid = guid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaSection))
	        return false; 
			
        if(getSectionid() == null) 
	        return false;

        BaSection other = (BaSection) o;	        
	    return new EqualsBuilder()
            .append(this.getSectionid(), other.getSectionid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("sectionid"+":"+getSectionid())
            .append("sectionname"+":"+getSectionname())
            .append("sectiontype"+":"+getSectiontype())
            .append("marketid"+":"+getMarketid())
            .append("registerdate"+":"+getRegisterdate())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("sectioncode"+":"+getSectioncode())
            .append("maxcapacity"+":"+getMaxcapacity())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("isdelete"+":"+getIsdelete())
            .append("supersectionid"+":"+getSupersectionid())
            .append("guid"+":"+getGuid())
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