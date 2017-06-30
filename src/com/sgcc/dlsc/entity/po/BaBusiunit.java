package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaBusiunit的POJO类
 *
 * @author  Administrator  [Mon Jul 08 16:56:12 CST 2013]
 * 
 */
public class BaBusiunit implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性busiunitid
     */
    private String busiunitid;
	
    /** 
     * 属性busiunitname
     */
    private String busiunitname;
	
    /** 
     * 属性aliasname
     */
    private String aliasname;
	
    /** 
     * 属性busiunitcode
     */
    private String busiunitcode;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性bidtype
     */
    private BigDecimal bidtype;
	
    /** 
     * 属性relatedevtype
     */
    private BigDecimal relatedevtype;
	
    /** 
     * 属性portconjest
     */
    private BigDecimal portconjest;
	
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
     * 属性participantid
     */
    private String participantid;
	
    /**
     * BaBusiunit构造函数
     */
    public BaBusiunit() {
        super();
    }  
	
    /**
     * BaBusiunit完整的构造函数
     */  
    public BaBusiunit(String busiunitid,String busiunitname,Date starteffectivedate,BigDecimal bidtype,BigDecimal isdelete,String marketid,String participantid){
        this.busiunitid = busiunitid;
        this.busiunitname = busiunitname;
        this.starteffectivedate = starteffectivedate;
        this.bidtype = bidtype;
        this.isdelete = isdelete;
        this.marketid = marketid;
        this.participantid = participantid;
    }
 
    /**
     * 属性 busiunitid 的get方法
     * @return String
     */
    public String getBusiunitid(){
        return busiunitid;
    }
	
    /**
     * 属性 busiunitid 的set方法
     * @return
     */
    public void setBusiunitid(String busiunitid){
        if(busiunitid != null && busiunitid.trim().length() == 0){
            this.busiunitid = null;
        }else{
            this.busiunitid = busiunitid;
        }
    } 
	
    /**
     * 属性 busiunitname 的get方法
     * @return String
     */
    public String getBusiunitname(){
        return busiunitname;
    }
	
    /**
     * 属性 busiunitname 的set方法
     * @return
     */
    public void setBusiunitname(String busiunitname){
        this.busiunitname = busiunitname;
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
     * 属性 busiunitcode 的get方法
     * @return String
     */
    public String getBusiunitcode(){
        return busiunitcode;
    }
	
    /**
     * 属性 busiunitcode 的set方法
     * @return
     */
    public void setBusiunitcode(String busiunitcode){
        this.busiunitcode = busiunitcode;
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
     * 属性 bidtype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBidtype(){
        return bidtype;
    }
	
    /**
     * 属性 bidtype 的set方法
     * @return
     */
    public void setBidtype(BigDecimal bidtype){
        this.bidtype = bidtype;
    } 
	
    /**
     * 属性 relatedevtype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRelatedevtype(){
        return relatedevtype;
    }
	
    /**
     * 属性 relatedevtype 的set方法
     * @return
     */
    public void setRelatedevtype(BigDecimal relatedevtype){
        this.relatedevtype = relatedevtype;
    } 
	
    /**
     * 属性 portconjest 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPortconjest(){
        return portconjest;
    }
	
    /**
     * 属性 portconjest 的set方法
     * @return
     */
    public void setPortconjest(BigDecimal portconjest){
        this.portconjest = portconjest;
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
     * 属性 participantid 的get方法
     * @return String
     */
    public String getParticipantid(){
        return participantid;
    }
	
    /**
     * 属性 participantid 的set方法
     * @return
     */
    public void setParticipantid(String participantid){
        this.participantid = participantid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaBusiunit))
	        return false; 
			
        if(getBusiunitid() == null) 
	        return false;

        BaBusiunit other = (BaBusiunit) o;	        
	    return new EqualsBuilder()
            .append(this.getBusiunitid(), other.getBusiunitid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("busiunitid"+":"+getBusiunitid())
            .append("busiunitname"+":"+getBusiunitname())
            .append("aliasname"+":"+getAliasname())
            .append("busiunitcode"+":"+getBusiunitcode())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("bidtype"+":"+getBidtype())
            .append("relatedevtype"+":"+getRelatedevtype())
            .append("portconjest"+":"+getPortconjest())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("isdelete"+":"+getIsdelete())
            .append("marketid"+":"+getMarketid())
            .append("guid"+":"+getGuid())
            .append("participantid"+":"+getParticipantid())
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