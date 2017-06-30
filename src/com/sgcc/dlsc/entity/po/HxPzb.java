package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * HxPzb的POJO类
 *
 * @author  lenovo  [Mon Sep 23 16:48:08 CST 2013]
 * 
 */
public class HxPzb implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tablename
     */
    private String tablename;
	
    /** 
     * 属性epmtableid
     */
    private String epmtableid;
	
    /** 
     * 属性datasource
     */
    private String datasource;
	
    /** 
     * 属性ddtableid
     */
    private String ddtableid;
	
    /** 
     * 属性cycletype
     */
    private BigDecimal cycletype;
	
    /** 
     * 属性cycle
     */
    private String cycle;
	
    /** 
     * 属性isvalid
     */
    private BigDecimal isvalid;
	
    /** 
     * 属性zqms
     */
    private String zqms;
	
    /** 
     * 属性drfs
     */
    private BigDecimal drfs;
	
    /** 
     * 属性transtype
     */
    private BigDecimal transtype;
	
    /** 
     * 属性orderno
     */
    private BigDecimal orderno;
	
    /**
     * HxPzb构造函数
     */
    public HxPzb() {
        super();
    }  
	
    /**
     * HxPzb完整的构造函数
     */  
    public HxPzb(String guid,String tablename,String epmtableid,String datasource,String ddtableid,BigDecimal cycletype,String cycle,BigDecimal isvalid){
        this.guid = guid;
        this.tablename = tablename;
        this.epmtableid = epmtableid;
        this.datasource = datasource;
        this.ddtableid = ddtableid;
        this.cycletype = cycletype;
        this.cycle = cycle;
        this.isvalid = isvalid;
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
     * 属性 tablename 的get方法
     * @return String
     */
    public String getTablename(){
        return tablename;
    }
	
    /**
     * 属性 tablename 的set方法
     * @return
     */
    public void setTablename(String tablename){
        this.tablename = tablename;
    } 
	
    /**
     * 属性 epmtableid 的get方法
     * @return String
     */
    public String getEpmtableid(){
        return epmtableid;
    }
	
    /**
     * 属性 epmtableid 的set方法
     * @return
     */
    public void setEpmtableid(String epmtableid){
        this.epmtableid = epmtableid;
    } 
	
    /**
     * 属性 datasource 的get方法
     * @return String
     */
    public String getDatasource(){
        return datasource;
    }
	
    /**
     * 属性 datasource 的set方法
     * @return
     */
    public void setDatasource(String datasource){
        this.datasource = datasource;
    } 
	
    /**
     * 属性 ddtableid 的get方法
     * @return String
     */
    public String getDdtableid(){
        return ddtableid;
    }
	
    /**
     * 属性 ddtableid 的set方法
     * @return
     */
    public void setDdtableid(String ddtableid){
        this.ddtableid = ddtableid;
    } 
	
    /**
     * 属性 cycletype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCycletype(){
        return cycletype;
    }
	
    /**
     * 属性 cycletype 的set方法
     * @return
     */
    public void setCycletype(BigDecimal cycletype){
        this.cycletype = cycletype;
    } 
	
    /**
     * 属性 cycle 的get方法
     * @return String
     */
    public String getCycle(){
        return cycle;
    }
	
    /**
     * 属性 cycle 的set方法
     * @return
     */
    public void setCycle(String cycle){
        this.cycle = cycle;
    } 
	
    /**
     * 属性 isvalid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsvalid(){
        return isvalid;
    }
	
    /**
     * 属性 isvalid 的set方法
     * @return
     */
    public void setIsvalid(BigDecimal isvalid){
        this.isvalid = isvalid;
    } 
	
    /**
     * 属性 zqms 的get方法
     * @return String
     */
    public String getZqms(){
        return zqms;
    }
	
    /**
     * 属性 zqms 的set方法
     * @return
     */
    public void setZqms(String zqms){
        this.zqms = zqms;
    } 
	
    /**
     * 属性 drfs 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDrfs(){
        return drfs;
    }
	
    /**
     * 属性 drfs 的set方法
     * @return
     */
    public void setDrfs(BigDecimal drfs){
        this.drfs = drfs;
    } 
	
    /**
     * 属性 transtype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTranstype(){
        return transtype;
    }
	
    /**
     * 属性 transtype 的set方法
     * @return
     */
    public void setTranstype(BigDecimal transtype){
        this.transtype = transtype;
    } 
	
    /**
     * 属性 orderno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOrderno(){
        return orderno;
    }
	
    /**
     * 属性 orderno 的set方法
     * @return
     */
    public void setOrderno(BigDecimal orderno){
        this.orderno = orderno;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof HxPzb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        HxPzb other = (HxPzb) o;	        
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
            .append("tablename"+":"+getTablename())
            .append("epmtableid"+":"+getEpmtableid())
            .append("datasource"+":"+getDatasource())
            .append("ddtableid"+":"+getDdtableid())
            .append("cycletype"+":"+getCycletype())
            .append("cycle"+":"+getCycle())
            .append("isvalid"+":"+getIsvalid())
            .append("zqms"+":"+getZqms())
            .append("drfs"+":"+getDrfs())
            .append("transtype"+":"+getTranstype())
            .append("orderno"+":"+getOrderno())
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