package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaLine的POJO类
 *
 * @author  Administrator  [Sat Feb 22 20:47:47 CST 2014]
 * 
 */
public class BaLine implements Serializable{

    /** 
     * 属性lineid
     */
    private String lineid;
	
    /** 
     * 属性linkid
     */
    private String linkid;
	
    /** 
     * 属性linename
     */
    private String linename;
	
    /** 
     * 属性linetype
     */
    private BigDecimal linetype;
	
    /** 
     * 属性voltagegrade
     */
    private BigDecimal voltagegrade;
	
    /** 
     * 属性maxcapacity
     */
    private BigDecimal maxcapacity;
	
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
     * 属性linecode
     */
    private String linecode;
	
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
     * 属性marketid
     */
    private String marketid;
	
    /**
     * BaLine构造函数
     */
    public BaLine() {
        super();
    }  
	
    /**
     * BaLine完整的构造函数
     */  
    public BaLine(String lineid,String linename,Date registerdate,Date starteffectivedate,BigDecimal isdelete){
        this.lineid = lineid;
        this.linename = linename;
        this.registerdate = registerdate;
        this.starteffectivedate = starteffectivedate;
        this.isdelete = isdelete;
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
        if(lineid != null && lineid.trim().length() == 0){
            this.lineid = null;
        }else{
            this.lineid = lineid;
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
     * 属性 linename 的get方法
     * @return String
     */
    public String getLinename(){
        return linename;
    }
	
    /**
     * 属性 linename 的set方法
     * @return
     */
    public void setLinename(String linename){
        this.linename = linename;
    } 
	
    /**
     * 属性 linetype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLinetype(){
        return linetype;
    }
	
    /**
     * 属性 linetype 的set方法
     * @return
     */
    public void setLinetype(BigDecimal linetype){
        this.linetype = linetype;
    } 
	
    /**
     * 属性 voltagegrade 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVoltagegrade(){
        return voltagegrade;
    }
	
    /**
     * 属性 voltagegrade 的set方法
     * @return
     */
    public void setVoltagegrade(BigDecimal voltagegrade){
        this.voltagegrade = voltagegrade;
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
     * 属性 linecode 的get方法
     * @return String
     */
    public String getLinecode(){
        return linecode;
    }
	
    /**
     * 属性 linecode 的set方法
     * @return
     */
    public void setLinecode(String linecode){
        this.linecode = linecode;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaLine))
	        return false; 
			
        if(getLineid() == null) 
	        return false;

        BaLine other = (BaLine) o;	        
	    return new EqualsBuilder()
            .append(this.getLineid(), other.getLineid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("lineid"+":"+getLineid())
            .append("linkid"+":"+getLinkid())
            .append("linename"+":"+getLinename())
            .append("linetype"+":"+getLinetype())
            .append("voltagegrade"+":"+getVoltagegrade())
            .append("maxcapacity"+":"+getMaxcapacity())
            .append("registerdate"+":"+getRegisterdate())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("linecode"+":"+getLinecode())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("isdelete"+":"+getIsdelete())
            .append("marketid"+":"+getMarketid())
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