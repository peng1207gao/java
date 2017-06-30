package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubTmZgdcgdjcbR的POJO类
 *
 * @author  zhangyr  [Tue Jun 24 11:52:11 CST 2014]
 * 
 */
public class PubTmZgdcgdjcbR implements Serializable{

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
     * 属性jsdy
     */
    private String jsdy;
	
    /** 
     * 属性lb
     */
    private String lb;
	
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
     * 属性hj
     */
    private BigDecimal hj;
	
    /** 
     * 属性js
     */
    private BigDecimal js;
	
    /** 
     * 属性wsd
     */
    private BigDecimal wsd;
	
    /** 
     * 属性fdq
     */
    private BigDecimal fdq;
	
    /** 
     * 属性dyh
     */
    private BigDecimal dyh;
	
    /** 
     * 属性cszb
     */
    private BigDecimal cszb;
	
    /** 
     * 属性csxn
     */
    private BigDecimal csxn;
	
    /** 
     * 属性qt
     */
    private BigDecimal qt;
	
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
     * PubTmZgdcgdjcbR构造函数
     */
    public PubTmZgdcgdjcbR() {
        super();
    }  
	
    /**
     * PubTmZgdcgdjcbR完整的构造函数
     */  
    public PubTmZgdcgdjcbR(String guid,Integer tyear,Integer tmonth,String markerid,String fillinman,Date vartime){
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
     * 属性 lb 的get方法
     * @return String
     */
    public String getLb(){
        return lb;
    }
	
    /**
     * 属性 lb 的set方法
     * @return
     */
    public void setLb(String lb){
        this.lb = lb;
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
     * 属性 hj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHj(){
        return hj;
    }
	
    /**
     * 属性 hj 的set方法
     * @return
     */
    public void setHj(BigDecimal hj){
        this.hj = hj;
    } 
	
    /**
     * 属性 js 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJs(){
        return js;
    }
	
    /**
     * 属性 js 的set方法
     * @return
     */
    public void setJs(BigDecimal js){
        this.js = js;
    } 
	
    /**
     * 属性 wsd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWsd(){
        return wsd;
    }
	
    /**
     * 属性 wsd 的set方法
     * @return
     */
    public void setWsd(BigDecimal wsd){
        this.wsd = wsd;
    } 
	
    /**
     * 属性 fdq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFdq(){
        return fdq;
    }
	
    /**
     * 属性 fdq 的set方法
     * @return
     */
    public void setFdq(BigDecimal fdq){
        this.fdq = fdq;
    } 
	
    /**
     * 属性 dyh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyh(){
        return dyh;
    }
	
    /**
     * 属性 dyh 的set方法
     * @return
     */
    public void setDyh(BigDecimal dyh){
        this.dyh = dyh;
    } 
	
    /**
     * 属性 cszb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCszb(){
        return cszb;
    }
	
    /**
     * 属性 cszb 的set方法
     * @return
     */
    public void setCszb(BigDecimal cszb){
        this.cszb = cszb;
    } 
	
    /**
     * 属性 csxn 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCsxn(){
        return csxn;
    }
	
    /**
     * 属性 csxn 的set方法
     * @return
     */
    public void setCsxn(BigDecimal csxn){
        this.csxn = csxn;
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
		
        if (o == null || !(o instanceof PubTmZgdcgdjcbR))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubTmZgdcgdjcbR other = (PubTmZgdcgdjcbR) o;	        
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
            .append("jsdy"+":"+getJsdy())
            .append("lb"+":"+getLb())
            .append("fillinman"+":"+getFillinman())
            .append("vartime"+":"+getVartime())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
            .append("hj"+":"+getHj())
            .append("js"+":"+getJs())
            .append("wsd"+":"+getWsd())
            .append("fdq"+":"+getFdq())
            .append("dyh"+":"+getDyh())
            .append("cszb"+":"+getCszb())
            .append("csxn"+":"+getCsxn())
            .append("qt"+":"+getQt())
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