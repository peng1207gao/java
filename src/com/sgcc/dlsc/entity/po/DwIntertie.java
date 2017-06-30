package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwIntertie的POJO类
 *
 * @author  wangqibin  [Fri Mar 07 09:29:08 CST 2014]
 * 
 */
public class DwIntertie implements Serializable{

    /** 
     * 属性linkid
     */
    private String linkid;
	
    /** 
     * 属性linkname
     */
    private String linkname;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性startpoint
     */
    private String startpoint;
	
    /** 
     * 属性endpoint
     */
    private String endpoint;
	
    /** 
     * 属性linktype
     */
    private String linktype;
	
    /** 
     * 属性energytype
     */
    private String energytype;
	
    /** 
     * 属性loss
     */
    private BigDecimal loss;
	
    /** 
     * 属性maxcapacity
     */
    private BigDecimal maxcapacity;
	
    /** 
     * 属性reversecapacity
     */
    private BigDecimal reversecapacity;
	
    /** 
     * 属性linelength
     */
    private BigDecimal linelength;
	
    /** 
     * 属性voltagegrade
     */
    private BigDecimal voltagegrade;
	
    /** 
     * 属性registerdate
     */
    private Date registerdate;
	
    /** 
     * 属性startstation
     */
    private String startstation;
	
    /** 
     * 属性endstarion
     */
    private String endstarion;
	
    /**
     * DwIntertie构造函数
     */
    public DwIntertie() {
        super();
    }  
	
    /**
     * DwIntertie完整的构造函数
     */  
    public DwIntertie(String linkid,String linkname,String marketid){
        this.linkid = linkid;
        this.linkname = linkname;
        this.marketid = marketid;
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
        if(linkid != null && linkid.trim().length() == 0){
            this.linkid = null;
        }else{
            this.linkid = linkid;
        }
    } 
	
    /**
     * 属性 linkname 的get方法
     * @return String
     */
    public String getLinkname(){
        return linkname;
    }
	
    /**
     * 属性 linkname 的set方法
     * @return
     */
    public void setLinkname(String linkname){
        this.linkname = linkname;
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
     * 属性 startpoint 的get方法
     * @return String
     */
    public String getStartpoint(){
        return startpoint;
    }
	
    /**
     * 属性 startpoint 的set方法
     * @return
     */
    public void setStartpoint(String startpoint){
        this.startpoint = startpoint;
    } 
	
    /**
     * 属性 endpoint 的get方法
     * @return String
     */
    public String getEndpoint(){
        return endpoint;
    }
	
    /**
     * 属性 endpoint 的set方法
     * @return
     */
    public void setEndpoint(String endpoint){
        this.endpoint = endpoint;
    } 
	
    /**
     * 属性 linktype 的get方法
     * @return String
     */
    public String getLinktype(){
        return linktype;
    }
	
    /**
     * 属性 linktype 的set方法
     * @return
     */
    public void setLinktype(String linktype){
        this.linktype = linktype;
    } 
	
    /**
     * 属性 energytype 的get方法
     * @return String
     */
    public String getEnergytype(){
        return energytype;
    }
	
    /**
     * 属性 energytype 的set方法
     * @return
     */
    public void setEnergytype(String energytype){
        this.energytype = energytype;
    } 
	
    /**
     * 属性 loss 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLoss(){
        return loss;
    }
	
    /**
     * 属性 loss 的set方法
     * @return
     */
    public void setLoss(BigDecimal loss){
        this.loss = loss;
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
     * 属性 reversecapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getReversecapacity(){
        return reversecapacity;
    }
	
    /**
     * 属性 reversecapacity 的set方法
     * @return
     */
    public void setReversecapacity(BigDecimal reversecapacity){
        this.reversecapacity = reversecapacity;
    } 
	
    /**
     * 属性 linelength 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLinelength(){
        return linelength;
    }
	
    /**
     * 属性 linelength 的set方法
     * @return
     */
    public void setLinelength(BigDecimal linelength){
        this.linelength = linelength;
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
     * 属性 startstation 的get方法
     * @return String
     */
    public String getStartstation(){
        return startstation;
    }
	
    /**
     * 属性 startstation 的set方法
     * @return
     */
    public void setStartstation(String startstation){
        this.startstation = startstation;
    } 
	
    /**
     * 属性 endstarion 的get方法
     * @return String
     */
    public String getEndstarion(){
        return endstarion;
    }
	
    /**
     * 属性 endstarion 的set方法
     * @return
     */
    public void setEndstarion(String endstarion){
        this.endstarion = endstarion;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwIntertie))
	        return false; 
			
        if(getLinkid() == null) 
	        return false;

        DwIntertie other = (DwIntertie) o;	        
	    return new EqualsBuilder()
            .append(this.getLinkid(), other.getLinkid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("linkid"+":"+getLinkid())
            .append("linkname"+":"+getLinkname())
            .append("marketid"+":"+getMarketid())
            .append("startpoint"+":"+getStartpoint())
            .append("endpoint"+":"+getEndpoint())
            .append("linktype"+":"+getLinktype())
            .append("energytype"+":"+getEnergytype())
            .append("loss"+":"+getLoss())
            .append("maxcapacity"+":"+getMaxcapacity())
            .append("reversecapacity"+":"+getReversecapacity())
            .append("linelength"+":"+getLinelength())
            .append("voltagegrade"+":"+getVoltagegrade())
            .append("registerdate"+":"+getRegisterdate())
            .append("startstation"+":"+getStartstation())
            .append("endstarion"+":"+getEndstarion())
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