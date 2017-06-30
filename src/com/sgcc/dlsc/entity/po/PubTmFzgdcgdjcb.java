package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubTmFzgdcgdjcb的POJO类
 *
 * @author  admin  [Tue Jun 24 10:57:39 CST 2014]
 * 
 */
public class PubTmFzgdcgdjcb implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tyear
     */
    private BigDecimal tyear;
	
    /** 
     * 属性tmonth
     */
    private BigDecimal tmonth;
	
    /** 
     * 属性markerid
     */
    private String markerid;
	
    /** 
     * 属性xh
     */
    private BigDecimal xh;
	
    /** 
     * 属性jzmc
     */
    private String jzmc;
	
    /** 
     * 属性dsmc
     */
    private String dsmc;
	
    /** 
     * 属性ssfdjt
     */
    private String ssfdjt;
	
    /** 
     * 属性jsdy
     */
    private String jsdy;
	
    /** 
     * 属性qt
     */
    private BigDecimal qt;
	
    /** 
     * 属性mx
     */
    private String mx;
	
    /** 
     * 属性fillinman
     */
    private String fillinman;
	
    /** 
     * 属性fillintime
     */
    private Date fillintime;
	
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
     * 属性hd
     */
    private BigDecimal hd;
	
    /** 
     * 属性sd
     */
    private BigDecimal sd;
	
    /** 
     * 属性hed
     */
    private BigDecimal hed;
	
    /** 
     * 属性fd
     */
    private BigDecimal fd;
	
    /** 
     * 属性state
     */
    private String state;
	
    /** 
     * 属性lcid
     */
    private String lcid;
	
    /**
     * PubTmFzgdcgdjcb构造函数
     */
    public PubTmFzgdcgdjcb() {
        super();
    }  
	
    /**
     * PubTmFzgdcgdjcb完整的构造函数
     */  
    public PubTmFzgdcgdjcb(String guid,BigDecimal tyear,BigDecimal tmonth,String markerid,String fillinman,Date fillintime){
        this.guid = guid;
        this.tyear = tyear;
        this.tmonth = tmonth;
        this.markerid = markerid;
        this.fillinman = fillinman;
        this.fillintime = fillintime;
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
     * 属性 jzmc 的get方法
     * @return String
     */
    public String getJzmc(){
        return jzmc;
    }
	
    /**
     * 属性 jzmc 的set方法
     * @return
     */
    public void setJzmc(String jzmc){
        this.jzmc = jzmc;
    } 
	
    /**
     * 属性 dsmc 的get方法
     * @return String
     */
    public String getDsmc(){
        return dsmc;
    }
	
    /**
     * 属性 dsmc 的set方法
     * @return
     */
    public void setDsmc(String dsmc){
        this.dsmc = dsmc;
    } 
	
    /**
     * 属性 ssfdjt 的get方法
     * @return String
     */
    public String getSsfdjt(){
        return ssfdjt;
    }
	
    /**
     * 属性 ssfdjt 的set方法
     * @return
     */
    public void setSsfdjt(String ssfdjt){
        this.ssfdjt = ssfdjt;
    } 
	
    /**
     * 属性 jsdy 的get方法
     * @return String
     */
    public String getJsdy(){
        return jsdy;
    }
	
    /**
     * 属性 jsdy 的set方法
     * @return
     */
    public void setJsdy(String jsdy){
        this.jsdy = jsdy;
    } 
	
    /**
     * 属性 qt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getQt(){
        return qt;
    }
	
    /**
     * 属性 qt 的set方法
     * @return
     */
    public void setQt(BigDecimal qt){
        this.qt = qt;
    } 
	
    /**
     * 属性 mx 的get方法
     * @return String
     */
    public String getMx(){
        return mx;
    }
	
    /**
     * 属性 mx 的set方法
     * @return
     */
    public void setMx(String mx){
        this.mx = mx;
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
     * 属性 fillintime 的get方法
     * @return Date
     */
    public Date getFillintime(){
        return fillintime;
    }
	
    /**
     * 属性 fillintime 的set方法
     * @return
     */
    public void setFillintime(Date fillintime){
        this.fillintime = fillintime;
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
     * 属性 hd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHd(){
        return hd;
    }
	
    /**
     * 属性 hd 的set方法
     * @return
     */
    public void setHd(BigDecimal hd){
        this.hd = hd;
    } 
	
    /**
     * 属性 sd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSd(){
        return sd;
    }
	
    /**
     * 属性 sd 的set方法
     * @return
     */
    public void setSd(BigDecimal sd){
        this.sd = sd;
    } 
	
    /**
     * 属性 hed 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHed(){
        return hed;
    }
	
    /**
     * 属性 hed 的set方法
     * @return
     */
    public void setHed(BigDecimal hed){
        this.hed = hed;
    } 
	
    /**
     * 属性 fd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFd(){
        return fd;
    }
	
    /**
     * 属性 fd 的set方法
     * @return
     */
    public void setFd(BigDecimal fd){
        this.fd = fd;
    } 
	
    /**
     * 属性 state 的get方法
     * @return String
     */
    public String getState(){
        return state;
    }
	
    /**
     * 属性 state 的set方法
     * @return
     */
    public void setState(String state){
        this.state = state;
    } 
	
    /**
     * 属性 lcid 的get方法
     * @return String
     */
    public String getLcid(){
        return lcid;
    }
	
    /**
     * 属性 lcid 的set方法
     * @return
     */
    public void setLcid(String lcid){
        this.lcid = lcid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PubTmFzgdcgdjcb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubTmFzgdcgdjcb other = (PubTmFzgdcgdjcb) o;	        
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
            .append("tyear"+":"+getTyear())
            .append("tmonth"+":"+getTmonth())
            .append("markerid"+":"+getMarkerid())
            .append("xh"+":"+getXh())
            .append("jzmc"+":"+getJzmc())
            .append("dsmc"+":"+getDsmc())
            .append("ssfdjt"+":"+getSsfdjt())
            .append("jsdy"+":"+getJsdy())
            .append("qt"+":"+getQt())
            .append("mx"+":"+getMx())
            .append("fillinman"+":"+getFillinman())
            .append("fillintime"+":"+getFillintime())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
            .append("hd"+":"+getHd())
            .append("sd"+":"+getSd())
            .append("hed"+":"+getHed())
            .append("fd"+":"+getFd())
            .append("state"+":"+getState())
            .append("lcid"+":"+getLcid())
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