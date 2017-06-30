package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DeEReadLog的POJO类
 *
 * @author  liang  [Sun Mar 16 17:19:22 CST 2014]
 * 
 */
public class DeEReadLog implements Serializable{

    /** 
     * 属性showorder
     */
    private BigDecimal showorder;
	
    /** 
     * 属性sheetname
     */
    private String sheetname;
	
    /** 
     * 属性sheetid
     */
    private String sheetid;
	
    /** 
     * 属性datatype
     */
    private BigDecimal datatype;
	
    /** 
     * 属性datastatusid
     */
    private BigDecimal datastatusid;
	
    /** 
     * 属性wldz
     */
    private String wldz;
	
    /** 
     * 属性xrwjjdz
     */
    private String xrwjjdz;
	
    /** 
     * 属性sfcg
     */
    private String sfcg;
	
    /** 
     * 属性sbyy
     */
    private String sbyy;
	
    /** 
     * 属性createdate
     */
    private String createdate;
	
    /** 
     * 属性serviceipaddr
     */
    private String serviceipaddr;
	
    /**
     * DeEReadLog构造函数
     */
    public DeEReadLog() {
        super();
    }  
	
    /**
     * DeEReadLog完整的构造函数
     */  
    public DeEReadLog(String sheetid){
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
     * 属性 sheetname 的get方法
     * @return String
     */
    public String getSheetname(){
        return sheetname;
    }
	
    /**
     * 属性 sheetname 的set方法
     * @return
     */
    public void setSheetname(String sheetname){
        this.sheetname = sheetname;
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
     * 属性 datatype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDatatype(){
        return datatype;
    }
	
    /**
     * 属性 datatype 的set方法
     * @return
     */
    public void setDatatype(BigDecimal datatype){
        this.datatype = datatype;
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
     * 属性 wldz 的get方法
     * @return String
     */
    public String getWldz(){
        return wldz;
    }
	
    /**
     * 属性 wldz 的set方法
     * @return
     */
    public void setWldz(String wldz){
        this.wldz = wldz;
    } 
	
    /**
     * 属性 xrwjjdz 的get方法
     * @return String
     */
    public String getXrwjjdz(){
        return xrwjjdz;
    }
	
    /**
     * 属性 xrwjjdz 的set方法
     * @return
     */
    public void setXrwjjdz(String xrwjjdz){
        this.xrwjjdz = xrwjjdz;
    } 
	
    /**
     * 属性 sfcg 的get方法
     * @return String
     */
    public String getSfcg(){
        return sfcg;
    }
	
    /**
     * 属性 sfcg 的set方法
     * @return
     */
    public void setSfcg(String sfcg){
        this.sfcg = sfcg;
    } 
	
    /**
     * 属性 sbyy 的get方法
     * @return String
     */
    public String getSbyy(){
        return sbyy;
    }
	
    /**
     * 属性 sbyy 的set方法
     * @return
     */
    public void setSbyy(String sbyy){
        this.sbyy = sbyy;
    } 
	
    /**
     * 属性 createdate 的get方法
     * @return String
     */
    public String getCreatedate(){
        return createdate;
    }
	
    /**
     * 属性 createdate 的set方法
     * @return
     */
    public void setCreatedate(String createdate){
        this.createdate = createdate;
    } 
	
    /**
     * 属性 serviceipaddr 的get方法
     * @return String
     */
    public String getServiceipaddr(){
        return serviceipaddr;
    }
	
    /**
     * 属性 serviceipaddr 的set方法
     * @return
     */
    public void setServiceipaddr(String serviceipaddr){
        this.serviceipaddr = serviceipaddr;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DeEReadLog))
	        return false; 
			
        if(getSheetid() == null) 
	        return false;

        DeEReadLog other = (DeEReadLog) o;	        
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
            .append("sheetname"+":"+getSheetname())
            .append("sheetid"+":"+getSheetid())
            .append("datatype"+":"+getDatatype())
            .append("datastatusid"+":"+getDatastatusid())
            .append("wldz"+":"+getWldz())
            .append("xrwjjdz"+":"+getXrwjjdz())
            .append("sfcg"+":"+getSfcg())
            .append("sbyy"+":"+getSbyy())
            .append("createdate"+":"+getCreatedate())
            .append("serviceipaddr"+":"+getServiceipaddr())
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