package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubTmZgdcgdjcbL的POJO类
 *
 * @author  zhangyr  [Tue Jun 24 11:50:51 CST 2014]
 * 
 */
public class PubTmZgdcgdjcbL implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tyear
     */
    private Integer tyear;
	
    /** 
     * 属性tmonth
     */
    private Integer tmonth;
	
    /** 
     * 属性markerid
     */
    private String markerid;
	
    /** 
     * 属性xh
     */
    private Integer xh;
	
    /** 
     * 属性jzmc
     */
    private String jzmc;
	
    /** 
     * 属性jzlx
     */
    private String jzlx;
	
    /** 
     * 属性jzrl
     */
    private String jzrl;
	
    /** 
     * 属性ssfdjt
     */
    private String ssfdjt;
	
    /** 
     * 属性jsdy
     */
    private String jsdy;
	
    /** 
     * 属性fillinman
     */
    private String fillinman;
	
    /** 
     * 属性vartime
     */
    private Date vartime;
	
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
     * 属性dcid
     */
    private String dcid;
	
    /** 
     * 属性jsdyid
     */
    private String jsdyid;
	
    /** 
     * 属性state
     */
    private Integer state;
	
    /** 
     * 属性lcid
     */
    private String lcid;
	
    /**
     * PubTmZgdcgdjcbL构造函数
     */
    public PubTmZgdcgdjcbL() {
        super();
    }  
	
    /**
     * PubTmZgdcgdjcbL完整的构造函数
     */  
    public PubTmZgdcgdjcbL(String guid,Integer tyear,Integer tmonth,String markerid,String fillinman,Date vartime){
        this.guid = guid;
        this.tyear = tyear;
        this.tmonth = tmonth;
        this.markerid = markerid;
        this.fillinman = fillinman;
        this.vartime = vartime;
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
     * @return Integer
     */
    public Integer getTyear(){
        return tyear;
    }
	
    /**
     * 属性 tyear 的set方法
     * @return
     */
    public void setTyear(Integer tyear){
        this.tyear = tyear;
    } 
	
    /**
     * 属性 tmonth 的get方法
     * @return Integer
     */
    public Integer getTmonth(){
        return tmonth;
    }
	
    /**
     * 属性 tmonth 的set方法
     * @return
     */
    public void setTmonth(Integer tmonth){
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
     * @return Integer
     */
    public Integer getXh(){
        return xh;
    }
	
    /**
     * 属性 xh 的set方法
     * @return
     */
    public void setXh(Integer xh){
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
     * 属性 jzlx 的get方法
     * @return String
     */
    public String getJzlx(){
        return jzlx;
    }
	
    /**
     * 属性 jzlx 的set方法
     * @return
     */
    public void setJzlx(String jzlx){
        this.jzlx = jzlx;
    } 
	
    /**
     * 属性 jzrl 的get方法
     * @return String
     */
    public String getJzrl(){
        return jzrl;
    }
	
    /**
     * 属性 jzrl 的set方法
     * @return
     */
    public void setJzrl(String jzrl){
        this.jzrl = jzrl;
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
     * 属性 vartime 的get方法
     * @return Date
     */
    public Date getVartime(){
        return vartime;
    }
	
    /**
     * 属性 vartime 的set方法
     * @return
     */
    public void setVartime(Date vartime){
        this.vartime = vartime;
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
     * 属性 dcid 的get方法
     * @return String
     */
    public String getDcid(){
        return dcid;
    }
	
    /**
     * 属性 dcid 的set方法
     * @return
     */
    public void setDcid(String dcid){
        this.dcid = dcid;
    } 
	
    /**
     * 属性 jsdyid 的get方法
     * @return String
     */
    public String getJsdyid(){
        return jsdyid;
    }
	
    /**
     * 属性 jsdyid 的set方法
     * @return
     */
    public void setJsdyid(String jsdyid){
        this.jsdyid = jsdyid;
    } 
	
    /**
     * 属性 state 的get方法
     * @return Integer
     */
    public Integer getState(){
        return state;
    }
	
    /**
     * 属性 state 的set方法
     * @return
     */
    public void setState(Integer state){
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
		
        if (o == null || !(o instanceof PubTmZgdcgdjcbL))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubTmZgdcgdjcbL other = (PubTmZgdcgdjcbL) o;	        
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
            .append("jzlx"+":"+getJzlx())
            .append("jzrl"+":"+getJzrl())
            .append("ssfdjt"+":"+getSsfdjt())
            .append("jsdy"+":"+getJsdy())
            .append("fillinman"+":"+getFillinman())
            .append("vartime"+":"+getVartime())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
            .append("dcid"+":"+getDcid())
            .append("jsdyid"+":"+getJsdyid())
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