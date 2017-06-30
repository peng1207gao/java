package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaMarket的POJO类
 *
 * @author  Administrator  [Sat Jun 15 16:18:26 CST 2013]
 * 
 */
public class BaMarket implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性parentmarketid
     */
    private String parentmarketid;
	
    /** 
     * 属性marketlevel
     */
    private BigDecimal marketlevel;
	
    /** 
     * 属性marketname
     */
    private String marketname;
	
    /** 
     * 属性comments
     */
    private String comments;
	
    /** 
     * 属性operationregioncode
     */
    private String operationregioncode;
	
    /** 
     * 属性starteffectivedate
     */
    private Date starteffectivedate;
	
    /** 
     * 属性endeffectivedate
     */
    private Date endeffectivedate;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
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
     * 属性orderno
     */
    private BigDecimal orderno;
	
    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性wsbm
     */
    private String wsbm;
	
    /**
     * BaMarket构造函数
     */
    public BaMarket() {
        super();
    }  
	
    /**
     * BaMarket完整的构造函数
     */  
    public BaMarket(String marketid,String marketname,Date starteffectivedate,BigDecimal isdelete){
        this.marketid = marketid;
        this.marketname = marketname;
        this.starteffectivedate = starteffectivedate;
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
        if(marketid != null && marketid.trim().length() == 0){
            this.marketid = null;
        }else{
            this.marketid = marketid;
        }
    } 
	
    /**
     * 属性 parentmarketid 的get方法
     * @return String
     */
    public String getParentmarketid(){
        return parentmarketid;
    }
	
    /**
     * 属性 parentmarketid 的set方法
     * @return
     */
    public void setParentmarketid(String parentmarketid){
        this.parentmarketid = parentmarketid;
    } 
	
    /**
     * 属性 marketlevel 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMarketlevel(){
        return marketlevel;
    }
	
    /**
     * 属性 marketlevel 的set方法
     * @return
     */
    public void setMarketlevel(BigDecimal marketlevel){
        this.marketlevel = marketlevel;
    } 
	
    /**
     * 属性 marketname 的get方法
     * @return String
     */
    public String getMarketname(){
        return marketname;
    }
	
    /**
     * 属性 marketname 的set方法
     * @return
     */
    public void setMarketname(String marketname){
        this.marketname = marketname;
    } 
	
    /**
     * 属性 comments 的get方法
     * @return String
     */
    public String getComments(){
        return comments;
    }
	
    /**
     * 属性 comments 的set方法
     * @return
     */
    public void setComments(String comments){
        this.comments = comments;
    } 
	
    /**
     * 属性 operationregioncode 的get方法
     * @return String
     */
    public String getOperationregioncode(){
        return operationregioncode;
    }
	
    /**
     * 属性 operationregioncode 的set方法
     * @return
     */
    public void setOperationregioncode(String operationregioncode){
        this.operationregioncode = operationregioncode;
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
     * 属性 marketcode 的get方法
     * @return String
     */
    public String getMarketcode(){
        return marketcode;
    }
	
    /**
     * 属性 marketcode 的set方法
     * @return
     */
    public void setMarketcode(String marketcode){
        this.marketcode = marketcode;
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
     * 属性 wsbm 的get方法
     * @return String
     */
    public String getWsbm(){
        return wsbm;
    }
	
    /**
     * 属性 wsbm 的set方法
     * @return
     */
    public void setWsbm(String wsbm){
        this.wsbm = wsbm;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaMarket))
	        return false; 
			
        if(getMarketid() == null) 
	        return false;

        BaMarket other = (BaMarket) o;	        
	    return new EqualsBuilder()
            .append(this.getMarketid(), other.getMarketid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("marketid"+":"+getMarketid())
            .append("parentmarketid"+":"+getParentmarketid())
            .append("marketlevel"+":"+getMarketlevel())
            .append("marketname"+":"+getMarketname())
            .append("comments"+":"+getComments())
            .append("operationregioncode"+":"+getOperationregioncode())
            .append("starteffectivedate"+":"+getStarteffectivedate())
            .append("endeffectivedate"+":"+getEndeffectivedate())
            .append("marketcode"+":"+getMarketcode())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("isdelete"+":"+getIsdelete())
            .append("orderno"+":"+getOrderno())
            .append("guid"+":"+getGuid())
            .append("wsbm"+":"+getWsbm())
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