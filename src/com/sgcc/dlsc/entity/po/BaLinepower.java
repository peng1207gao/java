package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaLinepower的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:33:39 CST 2013]
 * 
 */
public class BaLinepower implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性dateType
     */
    private BigDecimal dateType;
	
    /** 
     * 属性tabdate
     */
    private Date tabdate;
	
    /** 
     * 属性linename
     */
    private String linename;
	
    /** 
     * 属性lineid
     */
    private String lineid;
	
    /** 
     * 属性time
     */
    private Date time;
	
    /** 
     * 属性powernumber
     */
    private BigDecimal powernumber;
	
    /**
     * BaLinepower构造函数
     */
    public BaLinepower() {
        super();
    }  
	
    /**
     * BaLinepower完整的构造函数
     */  
    public BaLinepower(String guid,String marketcode,BigDecimal dateType,Date tabdate,String lineid,Date time,BigDecimal powernumber){
        this.guid = guid;
        this.marketcode = marketcode;
        this.dateType = dateType;
        this.tabdate = tabdate;
        this.lineid = lineid;
        this.time = time;
        this.powernumber = powernumber;
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
        if(guid != null && guid.trim().length() == 0){
            this.guid = null;
        }else{
            this.guid = guid;
        }
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
     * 属性 dateType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDateType(){
        return dateType;
    }
	
    /**
     * 属性 dateType 的set方法
     * @return
     */
    public void setDateType(BigDecimal dateType){
        this.dateType = dateType;
    } 
	
    /**
     * 属性 tabdate 的get方法
     * @return Date
     */
    public Date getTabdate(){
        return tabdate;
    }
	
    /**
     * 属性 tabdate 的set方法
     * @return
     */
    public void setTabdate(Date tabdate){
        this.tabdate = tabdate;
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
        this.lineid = lineid;
    } 
	
    /**
     * 属性 time 的get方法
     * @return Date
     */
    public Date getTime(){
        return time;
    }
	
    /**
     * 属性 time 的set方法
     * @return
     */
    public void setTime(Date time){
        this.time = time;
    } 
	
    /**
     * 属性 powernumber 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowernumber(){
        return powernumber;
    }
	
    /**
     * 属性 powernumber 的set方法
     * @return
     */
    public void setPowernumber(BigDecimal powernumber){
        this.powernumber = powernumber;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaLinepower))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaLinepower other = (BaLinepower) o;	        
	    return new EqualsBuilder()
            .append(this.getGuid(), other.getGuid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("guid"+":"+getGuid())
            .append("marketcode"+":"+getMarketcode())
            .append("dateType"+":"+getDateType())
            .append("tabdate"+":"+getTabdate())
            .append("linename"+":"+getLinename())
            .append("lineid"+":"+getLineid())
            .append("time"+":"+getTime())
            .append("powernumber"+":"+getPowernumber())
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