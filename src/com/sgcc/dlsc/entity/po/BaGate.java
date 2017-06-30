package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaGate的POJO类
 *
 * @author  PETERZHANG  [Sat Feb 15 14:38:57 CST 2014]
 * 
 */
public class BaGate implements Serializable{

    /** 
     * 属性gateid
     */
    private String gateid;
	
    /** 
     * 属性gatename
     */
    private String gatename;
	
    /** 
     * 属性disgateid
     */
    private String disgateid;
	
    /** 
     * 属性meterratio
     */
    private BigDecimal meterratio;
	
    /** 
     * 属性gatetype
     */
    private BigDecimal gatetype;
	
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
     * 属性gatecode
     */
    private String gatecode;
	
    /** 
     * 属性controlareaid
     */
    private String controlareaid;
	
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
     * BaGate构造函数
     */
    public BaGate() {
        super();
    }  
	
    /**
     * BaGate完整的构造函数
     */  
    public BaGate(String gateid,String gatename,BigDecimal gatetype,Date registerdate,Date starteffectivedate,BigDecimal isdelete,String marketid){
        this.gateid = gateid;
        this.gatename = gatename;
        this.gatetype = gatetype;
        this.registerdate = registerdate;
        this.starteffectivedate = starteffectivedate;
        this.isdelete = isdelete;
        this.marketid = marketid;
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
        if(gateid != null && gateid.trim().length() == 0){
            this.gateid = null;
        }else{
            this.gateid = gateid;
        }
    } 
	
    /**
     * 属性 gatename 的get方法
     * @return String
     */
    public String getGatename(){
        return gatename;
    }
	
    /**
     * 属性 gatename 的set方法
     * @return
     */
    public void setGatename(String gatename){
        this.gatename = gatename;
    } 
	
    /**
     * 属性 disgateid 的get方法
     * @return String
     */
    public String getDisgateid(){
        return disgateid;
    }
	
    /**
     * 属性 disgateid 的set方法
     * @return
     */
    public void setDisgateid(String disgateid){
        this.disgateid = disgateid;
    } 
	
    /**
     * 属性 meterratio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMeterratio(){
        return meterratio;
    }
	
    /**
     * 属性 meterratio 的set方法
     * @return
     */
    public void setMeterratio(BigDecimal meterratio){
        this.meterratio = meterratio;
    } 
	
    /**
     * 属性 gatetype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGatetype(){
        return gatetype;
    }
	
    /**
     * 属性 gatetype 的set方法
     * @return
     */
    public void setGatetype(BigDecimal gatetype){
        this.gatetype = gatetype;
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
     * 属性 gatecode 的get方法
     * @return String
     */
    public String getGatecode(){
        return gatecode;
    }
	
    /**
     * 属性 gatecode 的set方法
     * @return
     */
    public void setGatecode(String gatecode){
        this.gatecode = gatecode;
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
        this.controlareaid = controlareaid;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaGate))
	        return false; 
			
        if(getGateid() == null) 
	        return false;

        BaGate other = (BaGate) o;	        
	    return new EqualsBuilder()
            .append(this.getGateid(), other.getGateid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("gateid"+":"+getGateid())
            .append("gatename"+":"+getGatename())
            .append("disgateid"+":"+getDisgateid())
            .append("meterratio"+":"+getMeterratio())
            .append("gatetype"+":"+getGatetype())
            .append("registerdate"+":"+getRegisterdate())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("gatecode"+":"+getGatecode())
            .append("controlareaid"+":"+getControlareaid())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("isdelete"+":"+getIsdelete())
            .append("marketid"+":"+getMarketid())
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