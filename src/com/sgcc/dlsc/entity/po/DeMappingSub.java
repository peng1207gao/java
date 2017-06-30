package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DeMappingSub的POJO类
 *
 * @author  Administrator  [Wed Apr 16 09:08:34 CST 2014]
 * 
 */
public class DeMappingSub implements Serializable{

    /** 
     * 属性showorder
     */
    private BigDecimal showorder;
	
    /** 
     * 属性sheetid
     */
    private String sheetid;
	
    /** 
     * 属性datastatusid
     */
    private BigDecimal datastatusid;
	
    /** 
     * 属性yszd
     */
    private String yszd;
	
    /** 
     * 属性mbzd
     */
    private String mbzd;
	
    /** 
     * 属性fsheetid
     */
    private String fsheetid;
	
    /** 
     * 属性sjsfhg
     */
    private String sjsfhg;
	
    /**
     * DeMappingSub构造函数
     */
    public DeMappingSub() {
        super();
    }  
	
    /**
     * DeMappingSub完整的构造函数
     */  
    public DeMappingSub(String sheetid){
        this.sheetid = sheetid;
    }
 
    /**
     * 属性 showorder 的get方法
     * @return BigDecimal
     */
    public BigDecimal getShoworder(){
        return showorder;
    }
	
    /**
     * 属性 showorder 的set方法
     * @return
     */
    public void setShoworder(BigDecimal showorder){
        this.showorder = showorder;
    } 
	
    /**
     * 属性 sheetid 的get方法
     * @return String
     */
    public String getSheetid(){
        return sheetid;
    }
	
    /**
     * 属性 sheetid 的set方法
     * @return
     */
    public void setSheetid(String sheetid){
        if(sheetid != null && sheetid.trim().length() == 0){
            this.sheetid = null;
        }else{
            this.sheetid = sheetid;
        }
    } 
	
    /**
     * 属性 datastatusid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDatastatusid(){
        return datastatusid;
    }
	
    /**
     * 属性 datastatusid 的set方法
     * @return
     */
    public void setDatastatusid(BigDecimal datastatusid){
        this.datastatusid = datastatusid;
    } 
	
    /**
     * 属性 yszd 的get方法
     * @return String
     */
    public String getYszd(){
        return yszd;
    }
	
    /**
     * 属性 yszd 的set方法
     * @return
     */
    public void setYszd(String yszd){
        this.yszd = yszd;
    } 
	
    /**
     * 属性 mbzd 的get方法
     * @return String
     */
    public String getMbzd(){
        return mbzd;
    }
	
    /**
     * 属性 mbzd 的set方法
     * @return
     */
    public void setMbzd(String mbzd){
        this.mbzd = mbzd;
    } 
	
    /**
     * 属性 fsheetid 的get方法
     * @return String
     */
    public String getFsheetid(){
        return fsheetid;
    }
	
    /**
     * 属性 fsheetid 的set方法
     * @return
     */
    public void setFsheetid(String fsheetid){
        this.fsheetid = fsheetid;
    } 
	
    /**
     * 属性 sjsfhg 的get方法
     * @return String
     */
    public String getSjsfhg(){
        return sjsfhg;
    }
	
    /**
     * 属性 sjsfhg 的set方法
     * @return
     */
    public void setSjsfhg(String sjsfhg){
        this.sjsfhg = sjsfhg;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DeMappingSub))
	        return false; 
			
        if(getSheetid() == null) 
	        return false;

        DeMappingSub other = (DeMappingSub) o;	        
	    return new EqualsBuilder()
            .append(this.getSheetid(), other.getSheetid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("showorder"+":"+getShoworder())
            .append("sheetid"+":"+getSheetid())
            .append("datastatusid"+":"+getDatastatusid())
            .append("yszd"+":"+getYszd())
            .append("mbzd"+":"+getMbzd())
            .append("fsheetid"+":"+getFsheetid())
            .append("sjsfhg"+":"+getSjsfhg())
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