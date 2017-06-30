package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * FuMonthpowercoalbalance的POJO类
 *
 * @author  Administrator  [Thu Jul 25 11:20:12 CST 2013]
 * 
 */
public class FuMonthpowercoalbalance implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性mpcbid
     */
    private String mpcbid;
	
    /** 
     * 属性datatime
     */
    private Date datatime;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性ormarketid
     */
    private String ormarketid;
	
    /** 
     * 属性appdate
     */
    private Date appdate;
	
    /** 
     * 属性userid
     */
    private String userid;
	
    /** 
     * 属性docflag
     */
    private BigDecimal docflag;
	
    /** 
     * 属性currentqty
     */
    private BigDecimal currentqty;
	
    /** 
     * 属性currenttherqty
     */
    private BigDecimal currenttherqty;
	
    /** 
     * 属性currenthydroqty
     */
    private BigDecimal currenthydroqty;
	
    /** 
     * 属性currentotherqty
     */
    private BigDecimal currentotherqty;
	
    /** 
     * 属性relationid
     */
    private BigDecimal relationid;
	
    /** 
     * 属性currentuseqty
     */
    private BigDecimal currentuseqty;
	
    /** 
     * 属性startstock
     */
    private BigDecimal startstock;
	
    /** 
     * 属性expectsupply
     */
    private BigDecimal expectsupply;
	
    /** 
     * 属性expectconsum
     */
    private BigDecimal expectconsum;
	
    /** 
     * 属性endstock
     */
    private BigDecimal endstock;
	
    /** 
     * 属性availdays
     */
    private BigDecimal availdays;
	
    /** 
     * 属性cfireqty
     */
    private BigDecimal cfireqty;
	
    /** 
     * 属性afireqty
     */
    private BigDecimal afireqty;
	
    /** 
     * 属性fileid
     */
    private String fileid;
	
    /** 
     * 属性filename
     */
    private String filename;
	
    /** 
     * 属性sendmarketid
     */
    private String sendmarketid;
	
    /** 
     * 属性state
     */
    private BigDecimal state;
	
    /** 
     * 属性receiveid
     */
    private String receiveid;
	
    /**
     * FuMonthpowercoalbalance构造函数
     */
    public FuMonthpowercoalbalance() {
        super();
    }  
	
    /**
     * FuMonthpowercoalbalance完整的构造函数
     */  
    public FuMonthpowercoalbalance(String mpcbid,Date datatime,String marketid,String ormarketid,Date appdate,String userid,BigDecimal docflag){
        this.mpcbid = mpcbid;
        this.datatime = datatime;
        this.marketid = marketid;
        this.ormarketid = ormarketid;
        this.appdate = appdate;
        this.userid = userid;
        this.docflag = docflag;
    }
 
    /**
     * 属性 mpcbid 的get方法
     * @return String
     */
    public String getMpcbid(){
        return mpcbid;
    }
	
    /**
     * 属性 mpcbid 的set方法
     * @return
     */
    public void setMpcbid(String mpcbid){
        if(mpcbid != null && mpcbid.trim().length() == 0){
            this.mpcbid = null;
        }else{
            this.mpcbid = mpcbid;
        }
    } 
	
    /**
     * 属性 datatime 的get方法
     * @return Date
     */
    public Date getDatatime(){
        return datatime;
    }
	
    /**
     * 属性 datatime 的set方法
     * @return
     */
    public void setDatatime(Date datatime){
        this.datatime = datatime;
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
     * 属性 ormarketid 的get方法
     * @return String
     */
    public String getOrmarketid(){
        return ormarketid;
    }
	
    /**
     * 属性 ormarketid 的set方法
     * @return
     */
    public void setOrmarketid(String ormarketid){
        this.ormarketid = ormarketid;
    } 
	
    /**
     * 属性 appdate 的get方法
     * @return Date
     */
    public Date getAppdate(){
        return appdate;
    }
	
    /**
     * 属性 appdate 的set方法
     * @return
     */
    public void setAppdate(Date appdate){
        this.appdate = appdate;
    } 
	
    /**
     * 属性 userid 的get方法
     * @return String
     */
    public String getUserid(){
        return userid;
    }
	
    /**
     * 属性 userid 的set方法
     * @return
     */
    public void setUserid(String userid){
        this.userid = userid;
    } 
	
    /**
     * 属性 docflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDocflag(){
        return docflag;
    }
	
    /**
     * 属性 docflag 的set方法
     * @return
     */
    public void setDocflag(BigDecimal docflag){
        this.docflag = docflag;
    } 
	
    /**
     * 属性 currentqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCurrentqty(){
        return currentqty;
    }
	
    /**
     * 属性 currentqty 的set方法
     * @return
     */
    public void setCurrentqty(BigDecimal currentqty){
        this.currentqty = currentqty;
    } 
	
    /**
     * 属性 currenttherqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCurrenttherqty(){
        return currenttherqty;
    }
	
    /**
     * 属性 currenttherqty 的set方法
     * @return
     */
    public void setCurrenttherqty(BigDecimal currenttherqty){
        this.currenttherqty = currenttherqty;
    } 
	
    /**
     * 属性 currenthydroqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCurrenthydroqty(){
        return currenthydroqty;
    }
	
    /**
     * 属性 currenthydroqty 的set方法
     * @return
     */
    public void setCurrenthydroqty(BigDecimal currenthydroqty){
        this.currenthydroqty = currenthydroqty;
    } 
	
    /**
     * 属性 currentotherqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCurrentotherqty(){
        return currentotherqty;
    }
	
    /**
     * 属性 currentotherqty 的set方法
     * @return
     */
    public void setCurrentotherqty(BigDecimal currentotherqty){
        this.currentotherqty = currentotherqty;
    } 
	
    /**
     * 属性 relationid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRelationid(){
        return relationid;
    }
	
    /**
     * 属性 relationid 的set方法
     * @return
     */
    public void setRelationid(BigDecimal relationid){
        this.relationid = relationid;
    } 
	
    /**
     * 属性 currentuseqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCurrentuseqty(){
        return currentuseqty;
    }
	
    /**
     * 属性 currentuseqty 的set方法
     * @return
     */
    public void setCurrentuseqty(BigDecimal currentuseqty){
        this.currentuseqty = currentuseqty;
    } 
	
    /**
     * 属性 startstock 的get方法
     * @return BigDecimal
     */
    public BigDecimal getStartstock(){
        return startstock;
    }
	
    /**
     * 属性 startstock 的set方法
     * @return
     */
    public void setStartstock(BigDecimal startstock){
        this.startstock = startstock;
    } 
	
    /**
     * 属性 expectsupply 的get方法
     * @return BigDecimal
     */
    public BigDecimal getExpectsupply(){
        return expectsupply;
    }
	
    /**
     * 属性 expectsupply 的set方法
     * @return
     */
    public void setExpectsupply(BigDecimal expectsupply){
        this.expectsupply = expectsupply;
    } 
	
    /**
     * 属性 expectconsum 的get方法
     * @return BigDecimal
     */
    public BigDecimal getExpectconsum(){
        return expectconsum;
    }
	
    /**
     * 属性 expectconsum 的set方法
     * @return
     */
    public void setExpectconsum(BigDecimal expectconsum){
        this.expectconsum = expectconsum;
    } 
	
    /**
     * 属性 endstock 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEndstock(){
        return endstock;
    }
	
    /**
     * 属性 endstock 的set方法
     * @return
     */
    public void setEndstock(BigDecimal endstock){
        this.endstock = endstock;
    } 
	
    /**
     * 属性 availdays 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAvaildays(){
        return availdays;
    }
	
    /**
     * 属性 availdays 的set方法
     * @return
     */
    public void setAvaildays(BigDecimal availdays){
        this.availdays = availdays;
    } 
	
    /**
     * 属性 cfireqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCfireqty(){
        return cfireqty;
    }
	
    /**
     * 属性 cfireqty 的set方法
     * @return
     */
    public void setCfireqty(BigDecimal cfireqty){
        this.cfireqty = cfireqty;
    } 
	
    /**
     * 属性 afireqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAfireqty(){
        return afireqty;
    }
	
    /**
     * 属性 afireqty 的set方法
     * @return
     */
    public void setAfireqty(BigDecimal afireqty){
        this.afireqty = afireqty;
    } 
	
    /**
     * 属性 fileid 的get方法
     * @return String
     */
    public String getFileid(){
        return fileid;
    }
	
    /**
     * 属性 fileid 的set方法
     * @return
     */
    public void setFileid(String fileid){
        this.fileid = fileid;
    } 
	
    /**
     * 属性 filename 的get方法
     * @return String
     */
    public String getFilename(){
        return filename;
    }
	
    /**
     * 属性 filename 的set方法
     * @return
     */
    public void setFilename(String filename){
        this.filename = filename;
    } 
	
    /**
     * 属性 sendmarketid 的get方法
     * @return String
     */
    public String getSendmarketid(){
        return sendmarketid;
    }
	
    /**
     * 属性 sendmarketid 的set方法
     * @return
     */
    public void setSendmarketid(String sendmarketid){
        this.sendmarketid = sendmarketid;
    } 
	
    /**
     * 属性 state 的get方法
     * @return BigDecimal
     */
    public BigDecimal getState(){
        return state;
    }
	
    /**
     * 属性 state 的set方法
     * @return
     */
    public void setState(BigDecimal state){
        this.state = state;
    } 
	
    /**
     * 属性 receiveid 的get方法
     * @return String
     */
    public String getReceiveid(){
        return receiveid;
    }
	
    /**
     * 属性 receiveid 的set方法
     * @return
     */
    public void setReceiveid(String receiveid){
        this.receiveid = receiveid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof FuMonthpowercoalbalance))
	        return false; 
			
        if(getMpcbid() == null) 
	        return false;

        FuMonthpowercoalbalance other = (FuMonthpowercoalbalance) o;	        
	    return new EqualsBuilder()
            .append(this.getMpcbid(), other.getMpcbid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("mpcbid"+":"+getMpcbid())
            .append("datatime"+":"+getDatatime())
            .append("marketid"+":"+getMarketid())
            .append("ormarketid"+":"+getOrmarketid())
            .append("appdate"+":"+getAppdate())
            .append("userid"+":"+getUserid())
            .append("docflag"+":"+getDocflag())
            .append("currentqty"+":"+getCurrentqty())
            .append("currenttherqty"+":"+getCurrenttherqty())
            .append("currenthydroqty"+":"+getCurrenthydroqty())
            .append("currentotherqty"+":"+getCurrentotherqty())
            .append("relationid"+":"+getRelationid())
            .append("currentuseqty"+":"+getCurrentuseqty())
            .append("startstock"+":"+getStartstock())
            .append("expectsupply"+":"+getExpectsupply())
            .append("expectconsum"+":"+getExpectconsum())
            .append("endstock"+":"+getEndstock())
            .append("availdays"+":"+getAvaildays())
            .append("cfireqty"+":"+getCfireqty())
            .append("afireqty"+":"+getAfireqty())
            .append("fileid"+":"+getFileid())
            .append("filename"+":"+getFilename())
            .append("sendmarketid"+":"+getSendmarketid())
            .append("state"+":"+getState())
            .append("receiveid"+":"+getReceiveid())
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