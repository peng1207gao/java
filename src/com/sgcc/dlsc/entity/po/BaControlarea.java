package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaControlarea的POJO类
 *
 * @author  PETERZHANG  [Sun Feb 16 15:50:17 CST 2014]
 * 
 */
public class BaControlarea implements Serializable{

    /** 
     * 属性controlareaid
     */
    private String controlareaid;
	
    /** 
     * 属性controlareaname
     */
    private String controlareaname;
	
    /** 
     * 属性aliasname
     */
    private String aliasname;
	
    /** 
     * 属性netinterchange
     */
    private String netinterchange;
	
    /** 
     * 属性ptolerance
     */
    private String ptolerance;
	
    /** 
     * 属性controlareatype
     */
    private BigDecimal controlareatype;
	
    /** 
     * 属性suppercontrolareaid
     */
    private String suppercontrolareaid;
	
    /** 
     * 属性controlareacode
     */
    private String controlareacode;
	
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
     * 属性isdelete
     */
    private BigDecimal isdelete;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /**
     * BaControlarea构造函数
     */
    public BaControlarea() {
        super();
    }  
	
    /**
     * BaControlarea完整的构造函数
     */  
    public BaControlarea(String controlareaid,String controlareaname,String controlareacode,Date starteffectivedate,BigDecimal isdelete){
        this.controlareaid = controlareaid;
        this.controlareaname = controlareaname;
        this.controlareacode = controlareacode;
        this.starteffectivedate = starteffectivedate;
        this.isdelete = isdelete;
    }
 
    /**
     * 属性 controlareaid 的get方法
     * @return String
     */
    public String getControlareaid(){
        return controlareaid;
    }
	
    /**
     * 属性 controlareaid 的set方法
     * @return
     */
    public void setControlareaid(String controlareaid){
        if(controlareaid != null && controlareaid.trim().length() == 0){
            this.controlareaid = null;
        }else{
            this.controlareaid = controlareaid;
        }
    } 
	
    /**
     * 属性 controlareaname 的get方法
     * @return String
     */
    public String getControlareaname(){
        return controlareaname;
    }
	
    /**
     * 属性 controlareaname 的set方法
     * @return
     */
    public void setControlareaname(String controlareaname){
        this.controlareaname = controlareaname;
    } 
	
    /**
     * 属性 aliasname 的get方法
     * @return String
     */
    public String getAliasname(){
        return aliasname;
    }
	
    /**
     * 属性 aliasname 的set方法
     * @return
     */
    public void setAliasname(String aliasname){
        this.aliasname = aliasname;
    } 
	
    /**
     * 属性 netinterchange 的get方法
     * @return String
     */
    public String getNetinterchange(){
        return netinterchange;
    }
	
    /**
     * 属性 netinterchange 的set方法
     * @return
     */
    public void setNetinterchange(String netinterchange){
        this.netinterchange = netinterchange;
    } 
	
    /**
     * 属性 ptolerance 的get方法
     * @return String
     */
    public String getPtolerance(){
        return ptolerance;
    }
	
    /**
     * 属性 ptolerance 的set方法
     * @return
     */
    public void setPtolerance(String ptolerance){
        this.ptolerance = ptolerance;
    } 
	
    /**
     * 属性 controlareatype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getControlareatype(){
        return controlareatype;
    }
	
    /**
     * 属性 controlareatype 的set方法
     * @return
     */
    public void setControlareatype(BigDecimal controlareatype){
        this.controlareatype = controlareatype;
    } 
	
    /**
     * 属性 suppercontrolareaid 的get方法
     * @return String
     */
    public String getSuppercontrolareaid(){
        return suppercontrolareaid;
    }
	
    /**
     * 属性 suppercontrolareaid 的set方法
     * @return
     */
    public void setSuppercontrolareaid(String suppercontrolareaid){
        this.suppercontrolareaid = suppercontrolareaid;
    } 
	
    /**
     * 属性 controlareacode 的get方法
     * @return String
     */
    public String getControlareacode(){
        return controlareacode;
    }
	
    /**
     * 属性 controlareacode 的set方法
     * @return
     */
    public void setControlareacode(String controlareacode){
        this.controlareacode = controlareacode;
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
		
        if (o == null || !(o instanceof BaControlarea))
	        return false; 
			
        if(getControlareaid() == null) 
	        return false;

        BaControlarea other = (BaControlarea) o;	        
	    return new EqualsBuilder()
            .append(this.getControlareaid(), other.getControlareaid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("controlareaid"+":"+getControlareaid())
            .append("controlareaname"+":"+getControlareaname())
            .append("aliasname"+":"+getAliasname())
            .append("netinterchange"+":"+getNetinterchange())
            .append("ptolerance"+":"+getPtolerance())
            .append("controlareatype"+":"+getControlareatype())
            .append("suppercontrolareaid"+":"+getSuppercontrolareaid())
            .append("controlareacode"+":"+getControlareacode())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("isdelete"+":"+getIsdelete())
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