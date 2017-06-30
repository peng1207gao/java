package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TjZxqx的POJO类
 *
 * @author  Administrator  [Fri Jul 18 10:21:36 CST 2014]
 * 
 */
public class TjZxqx implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性markerid
     */
    private String markerid;
	
    /** 
     * 属性xh
     */
    private BigDecimal xh;
	
    /** 
     * 属性rptid
     */
    private String rptid;
	
    /** 
     * 属性fillinman
     */
    private String fillinman;
	
    /** 
     * 属性filldept
     */
    private String filldept;
	
    /** 
     * 属性sjqx
     */
    private BigDecimal sjqx;
	
    /** 
     * 属性tyear
     */
    private BigDecimal tyear;
	
    /** 
     * 属性tmonth
     */
    private BigDecimal tmonth;
	
    /** 
     * 属性tday
     */
    private Date tday;
	
    /** 
     * 属性xkr
     */
    private String xkr;
	
    /** 
     * 属性xksj
     */
    private Date xksj;
	
    /** 
     * 属性bak1
     */
    private BigDecimal bak1;
	
    /** 
     * 属性bak2
     */
    private BigDecimal bak2;
	
    /** 
     * 属性bak3
     */
    private String bak3;
	
    /** 
     * 属性bak4
     */
    private String bak4;
	
    /** 
     * 属性bak5
     */
    private String bak5;
	
    /** 
     * 属性bak6
     */
    private String bak6;
	
    /** 
     * 属性bak7
     */
    private BigDecimal bak7;
	
    /** 
     * 属性bak8
     */
    private BigDecimal bak8;
	
    /** 
     * 属性bak9
     */
    private String bak9;
	
    /** 
     * 属性bak10
     */
    private String bak10;
	
    /** 
     * 属性bak11
     */
    private String bak11;
	
    /** 
     * 属性bak12
     */
    private String bak12;
	
    /**
     * TjZxqx构造函数
     */
    public TjZxqx() {
        super();
    }  
	
    /**
     * TjZxqx完整的构造函数
     */  
    public TjZxqx(String guid,String markerid,String fillinman){
        this.guid = guid;
        this.markerid = markerid;
        this.fillinman = fillinman;
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
     * 属性 markerid 的get方法
     * @return String
     */
    public String getMarkerid(){
        return markerid;
    }
	
    /**
     * 属性 markerid 的set方法
     * @return
     */
    public void setMarkerid(String markerid){
        this.markerid = markerid;
    } 
	
    /**
     * 属性 xh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getXh(){
        return xh;
    }
	
    /**
     * 属性 xh 的set方法
     * @return
     */
    public void setXh(BigDecimal xh){
        this.xh = xh;
    } 
	
    /**
     * 属性 rptid 的get方法
     * @return String
     */
    public String getRptid(){
        return rptid;
    }
	
    /**
     * 属性 rptid 的set方法
     * @return
     */
    public void setRptid(String rptid){
        this.rptid = rptid;
    } 
	
    /**
     * 属性 fillinman 的get方法
     * @return String
     */
    public String getFillinman(){
        return fillinman;
    }
	
    /**
     * 属性 fillinman 的set方法
     * @return
     */
    public void setFillinman(String fillinman){
        this.fillinman = fillinman;
    } 
	
    /**
     * 属性 filldept 的get方法
     * @return String
     */
    public String getFilldept(){
        return filldept;
    }
	
    /**
     * 属性 filldept 的set方法
     * @return
     */
    public void setFilldept(String filldept){
        this.filldept = filldept;
    } 
	
    /**
     * 属性 sjqx 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSjqx(){
        return sjqx;
    }
	
    /**
     * 属性 sjqx 的set方法
     * @return
     */
    public void setSjqx(BigDecimal sjqx){
        this.sjqx = sjqx;
    } 
	
    /**
     * 属性 tyear 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTyear(){
        return tyear;
    }
	
    /**
     * 属性 tyear 的set方法
     * @return
     */
    public void setTyear(BigDecimal tyear){
        this.tyear = tyear;
    } 
	
    /**
     * 属性 tmonth 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTmonth(){
        return tmonth;
    }
	
    /**
     * 属性 tmonth 的set方法
     * @return
     */
    public void setTmonth(BigDecimal tmonth){
        this.tmonth = tmonth;
    } 
	
    /**
     * 属性 tday 的get方法
     * @return Date
     */
    public Date getTday(){
        return tday;
    }
	
    /**
     * 属性 tday 的set方法
     * @return
     */
    public void setTday(Date tday){
        this.tday = tday;
    } 
	
    /**
     * 属性 xkr 的get方法
     * @return String
     */
    public String getXkr(){
        return xkr;
    }
	
    /**
     * 属性 xkr 的set方法
     * @return
     */
    public void setXkr(String xkr){
        this.xkr = xkr;
    } 
	
    /**
     * 属性 xksj 的get方法
     * @return Date
     */
    public Date getXksj(){
        return xksj;
    }
	
    /**
     * 属性 xksj 的set方法
     * @return
     */
    public void setXksj(Date xksj){
        this.xksj = xksj;
    } 
	
    /**
     * 属性 bak1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak1(){
        return bak1;
    }
	
    /**
     * 属性 bak1 的set方法
     * @return
     */
    public void setBak1(BigDecimal bak1){
        this.bak1 = bak1;
    } 
	
    /**
     * 属性 bak2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak2(){
        return bak2;
    }
	
    /**
     * 属性 bak2 的set方法
     * @return
     */
    public void setBak2(BigDecimal bak2){
        this.bak2 = bak2;
    } 
	
    /**
     * 属性 bak3 的get方法
     * @return String
     */
    public String getBak3(){
        return bak3;
    }
	
    /**
     * 属性 bak3 的set方法
     * @return
     */
    public void setBak3(String bak3){
        this.bak3 = bak3;
    } 
	
    /**
     * 属性 bak4 的get方法
     * @return String
     */
    public String getBak4(){
        return bak4;
    }
	
    /**
     * 属性 bak4 的set方法
     * @return
     */
    public void setBak4(String bak4){
        this.bak4 = bak4;
    } 
	
    /**
     * 属性 bak5 的get方法
     * @return String
     */
    public String getBak5(){
        return bak5;
    }
	
    /**
     * 属性 bak5 的set方法
     * @return
     */
    public void setBak5(String bak5){
        this.bak5 = bak5;
    } 
	
    /**
     * 属性 bak6 的get方法
     * @return String
     */
    public String getBak6(){
        return bak6;
    }
	
    /**
     * 属性 bak6 的set方法
     * @return
     */
    public void setBak6(String bak6){
        this.bak6 = bak6;
    } 
	
    /**
     * 属性 bak7 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak7(){
        return bak7;
    }
	
    /**
     * 属性 bak7 的set方法
     * @return
     */
    public void setBak7(BigDecimal bak7){
        this.bak7 = bak7;
    } 
	
    /**
     * 属性 bak8 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBak8(){
        return bak8;
    }
	
    /**
     * 属性 bak8 的set方法
     * @return
     */
    public void setBak8(BigDecimal bak8){
        this.bak8 = bak8;
    } 
	
    /**
     * 属性 bak9 的get方法
     * @return String
     */
    public String getBak9(){
        return bak9;
    }
	
    /**
     * 属性 bak9 的set方法
     * @return
     */
    public void setBak9(String bak9){
        this.bak9 = bak9;
    } 
	
    /**
     * 属性 bak10 的get方法
     * @return String
     */
    public String getBak10(){
        return bak10;
    }
	
    /**
     * 属性 bak10 的set方法
     * @return
     */
    public void setBak10(String bak10){
        this.bak10 = bak10;
    } 
	
    /**
     * 属性 bak11 的get方法
     * @return String
     */
    public String getBak11(){
        return bak11;
    }
	
    /**
     * 属性 bak11 的set方法
     * @return
     */
    public void setBak11(String bak11){
        this.bak11 = bak11;
    } 
	
    /**
     * 属性 bak12 的get方法
     * @return String
     */
    public String getBak12(){
        return bak12;
    }
	
    /**
     * 属性 bak12 的set方法
     * @return
     */
    public void setBak12(String bak12){
        this.bak12 = bak12;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TjZxqx))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TjZxqx other = (TjZxqx) o;	        
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
            .append("markerid"+":"+getMarkerid())
            .append("xh"+":"+getXh())
            .append("rptid"+":"+getRptid())
            .append("fillinman"+":"+getFillinman())
            .append("filldept"+":"+getFilldept())
            .append("sjqx"+":"+getSjqx())
            .append("tyear"+":"+getTyear())
            .append("tmonth"+":"+getTmonth())
            .append("tday"+":"+getTday())
            .append("xkr"+":"+getXkr())
            .append("xksj"+":"+getXksj())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
            .append("bak7"+":"+getBak7())
            .append("bak8"+":"+getBak8())
            .append("bak9"+":"+getBak9())
            .append("bak10"+":"+getBak10())
            .append("bak11"+":"+getBak11())
            .append("bak12"+":"+getBak12())
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