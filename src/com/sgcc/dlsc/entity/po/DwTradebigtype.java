package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DwTradebigtype的POJO类
 *
 * @author  liang  [Wed Mar 12 11:15:30 CST 2014]
 * 
 */
public class DwTradebigtype implements Serializable{

    /** 
     * 属性tradetypeid
     */
    private String tradetypeid;
	
    /** 
     * 属性tradetypecode
     */
    private String tradetypecode;
	
    /** 
     * 属性tradetypename
     */
    private String tradetypename;
	
    /** 
     * 属性tradetypeshortname
     */
    private String tradetypeshortname;
	
    /** 
     * 属性begindate
     */
    private Date begindate;
	
    /** 
     * 属性exitdate
     */
    private Date exitdate;
	
    /** 
     * 属性registerdate
     */
    private Date registerdate;
	
    /** 
     * 属性createperson
     */
    private String createperson;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性remark
     */
    private String remark;
	
    /**
     * DwTradebigtype构造函数
     */
    public DwTradebigtype() {
        super();
    }  
	
    /**
     * DwTradebigtype完整的构造函数
     */  
    public DwTradebigtype(String tradetypeid){
        this.tradetypeid = tradetypeid;
    }
 
    /**
     * 属性 tradetypeid 的get方法
     * @return String
     */
    public String getTradetypeid(){
        return tradetypeid;
    }
	
    /**
     * 属性 tradetypeid 的set方法
     * @return
     */
    public void setTradetypeid(String tradetypeid){
        if(tradetypeid != null && tradetypeid.trim().length() == 0){
            this.tradetypeid = null;
        }else{
            this.tradetypeid = tradetypeid;
        }
    } 
	
    /**
     * 属性 tradetypecode 的get方法
     * @return String
     */
    public String getTradetypecode(){
        return tradetypecode;
    }
	
    /**
     * 属性 tradetypecode 的set方法
     * @return
     */
    public void setTradetypecode(String tradetypecode){
        this.tradetypecode = tradetypecode;
    } 
	
    /**
     * 属性 tradetypename 的get方法
     * @return String
     */
    public String getTradetypename(){
        return tradetypename;
    }
	
    /**
     * 属性 tradetypename 的set方法
     * @return
     */
    public void setTradetypename(String tradetypename){
        this.tradetypename = tradetypename;
    } 
	
    /**
     * 属性 tradetypeshortname 的get方法
     * @return String
     */
    public String getTradetypeshortname(){
        return tradetypeshortname;
    }
	
    /**
     * 属性 tradetypeshortname 的set方法
     * @return
     */
    public void setTradetypeshortname(String tradetypeshortname){
        this.tradetypeshortname = tradetypeshortname;
    } 
	
    /**
     * 属性 begindate 的get方法
     * @return Date
     */
    public Date getBegindate(){
        return begindate;
    }
	
    /**
     * 属性 begindate 的set方法
     * @return
     */
    public void setBegindate(Date begindate){
        this.begindate = begindate;
    } 
	
    /**
     * 属性 exitdate 的get方法
     * @return Date
     */
    public Date getExitdate(){
        return exitdate;
    }
	
    /**
     * 属性 exitdate 的set方法
     * @return
     */
    public void setExitdate(Date exitdate){
        this.exitdate = exitdate;
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
     * 属性 createperson 的get方法
     * @return String
     */
    public String getCreateperson(){
        return createperson;
    }
	
    /**
     * 属性 createperson 的set方法
     * @return
     */
    public void setCreateperson(String createperson){
        this.createperson = createperson;
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
     * 属性 remark 的get方法
     * @return String
     */
    public String getRemark(){
        return remark;
    }
	
    /**
     * 属性 remark 的set方法
     * @return
     */
    public void setRemark(String remark){
        this.remark = remark;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DwTradebigtype))
	        return false; 
			
        if(getTradetypeid() == null) 
	        return false;

        DwTradebigtype other = (DwTradebigtype) o;	        
	    return new EqualsBuilder()
            .append(this.getTradetypeid(), other.getTradetypeid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("tradetypeid"+":"+getTradetypeid())
            .append("tradetypecode"+":"+getTradetypecode())
            .append("tradetypename"+":"+getTradetypename())
            .append("tradetypeshortname"+":"+getTradetypeshortname())
            .append("begindate"+":"+getBegindate())
            .append("exitdate"+":"+getExitdate())
            .append("registerdate"+":"+getRegisterdate())
            .append("createperson"+":"+getCreateperson())
            .append("marketid"+":"+getMarketid())
            .append("remark"+":"+getRemark())
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