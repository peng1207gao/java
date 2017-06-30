package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PaValueVer的POJO类
 *
 * @author  Administrator  [Sat Jun 15 14:49:19 CST 2013]
 * 
 */
public class PaValueVer implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性effectivedate
     */
    private Date effectivedate;
	
    /** 
     * 属性valueid
     */
    private BigDecimal valueid;
	
    /** 
     * 属性valuename
     */
    private String valuename;
	
    /** 
     * 属性thevalue
     */
    private BigDecimal thevalue;
	
    /** 
     * 属性theversion
     */
    private String theversion;
	
    /** 
     * 属性bakStr1
     */
    private String bakStr1;
	
    /** 
     * 属性bakStr2
     */
    private String bakStr2;
	
    /** 
     * 属性bakStr3
     */
    private String bakStr3;
	
    /** 
     * 属性bakInt1
     */
    private BigDecimal bakInt1;
	
    /** 
     * 属性bakInt2
     */
    private BigDecimal bakInt2;
	
    /** 
     * 属性bakInt3
     */
    private BigDecimal bakInt3;
	
    /** 
     * 属性bakDouble1
     */
    private BigDecimal bakDouble1;
	
    /** 
     * 属性bakDouble2
     */
    private BigDecimal bakDouble2;
	
    /** 
     * 属性bakDouble3
     */
    private BigDecimal bakDouble3;
	
    /** 
     * 属性bakDate1
     */
    private Date bakDate1;
	
    /** 
     * 属性bakDate2
     */
    private Date bakDate2;
	
    /** 
     * 属性bakDate3
     */
    private Date bakDate3;
	
    /**
     * PaValueVer构造函数
     */
    public PaValueVer() {
        super();
    }  
	
    /**
     * PaValueVer完整的构造函数
     */  
    public PaValueVer(String guid,String marketid,Date effectivedate,String theversion){
        this.guid = guid;
        this.marketid = marketid;
        this.effectivedate = effectivedate;
        this.theversion = theversion;
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
     * 属性 effectivedate 的get方法
     * @return Date
     */
    public Date getEffectivedate(){
        return effectivedate;
    }
	
    /**
     * 属性 effectivedate 的set方法
     * @return
     */
    public void setEffectivedate(Date effectivedate){
        this.effectivedate = effectivedate;
    } 
	
    /**
     * 属性 valueid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getValueid(){
        return valueid;
    }
	
    /**
     * 属性 valueid 的set方法
     * @return
     */
    public void setValueid(BigDecimal valueid){
        this.valueid = valueid;
    } 
	
    /**
     * 属性 valuename 的get方法
     * @return String
     */
    public String getValuename(){
        return valuename;
    }
	
    /**
     * 属性 valuename 的set方法
     * @return
     */
    public void setValuename(String valuename){
        this.valuename = valuename;
    } 
	
    /**
     * 属性 thevalue 的get方法
     * @return BigDecimal
     */
    public BigDecimal getThevalue(){
        return thevalue;
    }
	
    /**
     * 属性 thevalue 的set方法
     * @return
     */
    public void setThevalue(BigDecimal thevalue){
        this.thevalue = thevalue;
    } 
	
    /**
     * 属性 theversion 的get方法
     * @return String
     */
    public String getTheversion(){
        return theversion;
    }
	
    /**
     * 属性 theversion 的set方法
     * @return
     */
    public void setTheversion(String theversion){
        this.theversion = theversion;
    } 
	
    /**
     * 属性 bakStr1 的get方法
     * @return String
     */
    public String getBakStr1(){
        return bakStr1;
    }
	
    /**
     * 属性 bakStr1 的set方法
     * @return
     */
    public void setBakStr1(String bakStr1){
        this.bakStr1 = bakStr1;
    } 
	
    /**
     * 属性 bakStr2 的get方法
     * @return String
     */
    public String getBakStr2(){
        return bakStr2;
    }
	
    /**
     * 属性 bakStr2 的set方法
     * @return
     */
    public void setBakStr2(String bakStr2){
        this.bakStr2 = bakStr2;
    } 
	
    /**
     * 属性 bakStr3 的get方法
     * @return String
     */
    public String getBakStr3(){
        return bakStr3;
    }
	
    /**
     * 属性 bakStr3 的set方法
     * @return
     */
    public void setBakStr3(String bakStr3){
        this.bakStr3 = bakStr3;
    } 
	
    /**
     * 属性 bakInt1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt1(){
        return bakInt1;
    }
	
    /**
     * 属性 bakInt1 的set方法
     * @return
     */
    public void setBakInt1(BigDecimal bakInt1){
        this.bakInt1 = bakInt1;
    } 
	
    /**
     * 属性 bakInt2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt2(){
        return bakInt2;
    }
	
    /**
     * 属性 bakInt2 的set方法
     * @return
     */
    public void setBakInt2(BigDecimal bakInt2){
        this.bakInt2 = bakInt2;
    } 
	
    /**
     * 属性 bakInt3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt3(){
        return bakInt3;
    }
	
    /**
     * 属性 bakInt3 的set方法
     * @return
     */
    public void setBakInt3(BigDecimal bakInt3){
        this.bakInt3 = bakInt3;
    } 
	
    /**
     * 属性 bakDouble1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble1(){
        return bakDouble1;
    }
	
    /**
     * 属性 bakDouble1 的set方法
     * @return
     */
    public void setBakDouble1(BigDecimal bakDouble1){
        this.bakDouble1 = bakDouble1;
    } 
	
    /**
     * 属性 bakDouble2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble2(){
        return bakDouble2;
    }
	
    /**
     * 属性 bakDouble2 的set方法
     * @return
     */
    public void setBakDouble2(BigDecimal bakDouble2){
        this.bakDouble2 = bakDouble2;
    } 
	
    /**
     * 属性 bakDouble3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble3(){
        return bakDouble3;
    }
	
    /**
     * 属性 bakDouble3 的set方法
     * @return
     */
    public void setBakDouble3(BigDecimal bakDouble3){
        this.bakDouble3 = bakDouble3;
    } 
	
    /**
     * 属性 bakDate1 的get方法
     * @return Date
     */
    public Date getBakDate1(){
        return bakDate1;
    }
	
    /**
     * 属性 bakDate1 的set方法
     * @return
     */
    public void setBakDate1(Date bakDate1){
        this.bakDate1 = bakDate1;
    } 
	
    /**
     * 属性 bakDate2 的get方法
     * @return Date
     */
    public Date getBakDate2(){
        return bakDate2;
    }
	
    /**
     * 属性 bakDate2 的set方法
     * @return
     */
    public void setBakDate2(Date bakDate2){
        this.bakDate2 = bakDate2;
    } 
	
    /**
     * 属性 bakDate3 的get方法
     * @return Date
     */
    public Date getBakDate3(){
        return bakDate3;
    }
	
    /**
     * 属性 bakDate3 的set方法
     * @return
     */
    public void setBakDate3(Date bakDate3){
        this.bakDate3 = bakDate3;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PaValueVer))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PaValueVer other = (PaValueVer) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("effectivedate"+":"+getEffectivedate())
            .append("valueid"+":"+getValueid())
            .append("valuename"+":"+getValuename())
            .append("thevalue"+":"+getThevalue())
            .append("theversion"+":"+getTheversion())
            .append("bakStr1"+":"+getBakStr1())
            .append("bakStr2"+":"+getBakStr2())
            .append("bakStr3"+":"+getBakStr3())
            .append("bakInt1"+":"+getBakInt1())
            .append("bakInt2"+":"+getBakInt2())
            .append("bakInt3"+":"+getBakInt3())
            .append("bakDouble1"+":"+getBakDouble1())
            .append("bakDouble2"+":"+getBakDouble2())
            .append("bakDouble3"+":"+getBakDouble3())
            .append("bakDate1"+":"+getBakDate1())
            .append("bakDate2"+":"+getBakDate2())
            .append("bakDate3"+":"+getBakDate3())
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