package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaIntertie的POJO类
 *
 * @author  Administrator  [Fri Mar 14 11:22:14 CST 2014]
 * 
 */
public class BaIntertie implements Serializable{

    /** 
     * 属性linkid
     */
    private String linkid;
	
    /** 
     * 属性linkname
     */
    private String linkname;
	
    /** 
     * 属性linktype
     */
    private BigDecimal linktype;
	
    /** 
     * 属性energytype
     */
    private BigDecimal energytype;
	
    /** 
     * 属性voltagegrade
     */
    private BigDecimal voltagegrade;
	
    /** 
     * 属性maxcapacity
     */
    private BigDecimal maxcapacity;
	
    /** 
     * 属性reversecapacity
     */
    private BigDecimal reversecapacity;
	
    /** 
     * 属性registerdate
     */
    private Date registerdate;
	
    /** 
     * 属性conductortype
     */
    private String conductortype;
	
    /** 
     * 属性linelength
     */
    private BigDecimal linelength;
	
    /** 
     * 属性dispatchunit
     */
    private String dispatchunit;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性linkcode
     */
    private String linkcode;
	
    /** 
     * 属性startgateid
     */
    private String startgateid;
	
    /** 
     * 属性endgateid
     */
    private String endgateid;
	
    /** 
     * 属性loss
     */
    private BigDecimal loss;
	
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
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性superlinkid
     */
    private String superlinkid;
	
    /**
     * BaIntertie构造函数
     */
    public BaIntertie() {
        super();
    }  
	
    /**
     * BaIntertie完整的构造函数
     */  
    public BaIntertie(String linkid,String linkname,Date registerdate,Date starteffectivedate,BigDecimal isdelete,String marketid){
        this.linkid = linkid;
        this.linkname = linkname;
        this.registerdate = registerdate;
        this.starteffectivedate = starteffectivedate;
        this.isdelete = isdelete;
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
     * 属性 linktype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLinktype(){
        return linktype;
    }
	
    /**
     * 属性 linktype 的set方法
     * @return
     */
    public void setLinktype(BigDecimal linktype){
        this.linktype = linktype;
    } 
	
    /**
     * 属性 energytype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergytype(){
        return energytype;
    }
	
    /**
     * 属性 energytype 的set方法
     * @return
     */
    public void setEnergytype(BigDecimal energytype){
        this.energytype = energytype;
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
     * 属性 conductortype 的get方法
     * @return String
     */
    public String getConductortype(){
        return conductortype;
    }
	
    /**
     * 属性 conductortype 的set方法
     * @return
     */
    public void setConductortype(String conductortype){
        this.conductortype = conductortype;
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
     * 属性 dispatchunit 的get方法
     * @return String
     */
    public String getDispatchunit(){
        return dispatchunit;
    }
	
    /**
     * 属性 dispatchunit 的set方法
     * @return
     */
    public void setDispatchunit(String dispatchunit){
        this.dispatchunit = dispatchunit;
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
     * 属性 linkcode 的get方法
     * @return String
     */
    public String getLinkcode(){
        return linkcode;
    }
	
    /**
     * 属性 linkcode 的set方法
     * @return
     */
    public void setLinkcode(String linkcode){
        this.linkcode = linkcode;
    } 
	
    /**
     * 属性 startgateid 的get方法
     * @return String
     */
    public String getStartgateid(){
        return startgateid;
    }
	
    /**
     * 属性 startgateid 的set方法
     * @return
     */
    public void setStartgateid(String startgateid){
        this.startgateid = startgateid;
    } 
	
    /**
     * 属性 endgateid 的get方法
     * @return String
     */
    public String getEndgateid(){
        return endgateid;
    }
	
    /**
     * 属性 endgateid 的set方法
     * @return
     */
    public void setEndgateid(String endgateid){
        this.endgateid = endgateid;
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
     * 属性 superlinkid 的get方法
     * @return String
     */
    public String getSuperlinkid(){
        return superlinkid;
    }
	
    /**
     * 属性 superlinkid 的set方法
     * @return
     */
    public void setSuperlinkid(String superlinkid){
        this.superlinkid = superlinkid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaIntertie))
	        return false; 
			
        if(getLinkid() == null) 
	        return false;

        BaIntertie other = (BaIntertie) o;	        
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
            .append("linktype"+":"+getLinktype())
            .append("energytype"+":"+getEnergytype())
            .append("voltagegrade"+":"+getVoltagegrade())
            .append("maxcapacity"+":"+getMaxcapacity())
            .append("reversecapacity"+":"+getReversecapacity())
            .append("registerdate"+":"+getRegisterdate())
            .append("conductortype"+":"+getConductortype())
            .append("linelength"+":"+getLinelength())
            .append("dispatchunit"+":"+getDispatchunit())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("linkcode"+":"+getLinkcode())
            .append("startgateid"+":"+getStartgateid())
            .append("endgateid"+":"+getEndgateid())
            .append("loss"+":"+getLoss())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("isdelete"+":"+getIsdelete())
            .append("marketid"+":"+getMarketid())
            .append("guid"+":"+getGuid())
            .append("superlinkid"+":"+getSuperlinkid())
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