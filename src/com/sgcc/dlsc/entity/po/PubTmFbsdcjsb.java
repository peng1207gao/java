package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubTmFbsdcjsb的POJO类
 *
 * @author  Administrator  [Tue Jun 24 11:38:34 CST 2014]
 * 
 */
public class PubTmFbsdcjsb implements Serializable{

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
     * 属性fbsdy
     */
    private String fbsdy;
	
    /** 
     * 属性jsdl
     */
    private BigDecimal jsdl;
	
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
     * 属性fbsdyid
     */
    private String fbsdyid;
	
    /** 
     * 属性state
     */
    private String state;
	
    /** 
     * 属性lcid
     */
    private String lcid;
	
    /**
     * PubTmFbsdcjsb构造函数
     */
    public PubTmFbsdcjsb() {
        super();
    }  
	
    /**
     * PubTmFbsdcjsb完整的构造函数
     */  
    public PubTmFbsdcjsb(String guid,BigDecimal tyear,BigDecimal tmonth,String markerid,String fillinman,Date vartime){
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
     * 属性 fbsdy 的get方法
     * @return String
     */
    public String getFbsdy(){
        return fbsdy;
    }
	
    /**
     * 属性 fbsdy 的set方法
     * @return
     */
    public void setFbsdy(String fbsdy){
        this.fbsdy = fbsdy;
    } 
	
    /**
     * 属性 jsdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJsdl(){
        return jsdl;
    }
	
    /**
     * 属性 jsdl 的set方法
     * @return
     */
    public void setJsdl(BigDecimal jsdl){
        this.jsdl = jsdl;
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
     * 属性 fbsdyid 的get方法
     * @return String
     */
    public String getFbsdyid(){
        return fbsdyid;
    }
	
    /**
     * 属性 fbsdyid 的set方法
     * @return
     */
    public void setFbsdyid(String fbsdyid){
        this.fbsdyid = fbsdyid;
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
		
        if (o == null || !(o instanceof PubTmFbsdcjsb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubTmFbsdcjsb other = (PubTmFbsdcjsb) o;	        
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
            .append("fbsdy"+":"+getFbsdy())
            .append("jsdl"+":"+getJsdl())
            .append("fillinman"+":"+getFillinman())
            .append("vartime"+":"+getVartime())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
            .append("fbsdyid"+":"+getFbsdyid())
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