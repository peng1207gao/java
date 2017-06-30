package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubTmTtfdjhtjb的POJO类
 *
 * @author  Administrator  [Mon Jun 09 17:13:42 CST 2014]
 * 
 */
public class PubTmTtfdjhtjb implements Serializable{

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
     * 属性tjxm
     */
    private String tjxm;
	
    /** 
     * 属性jdfdljhjdjh
     */
    private BigDecimal jdfdljhjdjh;
	
    /** 
     * 属性jdfdljhjdjhzf
     */
    private BigDecimal jdfdljhjdjhzf;
	
    /** 
     * 属性jdfdljhhd
     */
    private BigDecimal jdfdljhhd;
	
    /** 
     * 属性jdfdljhhdzf
     */
    private BigDecimal jdfdljhhdzf;
	
    /** 
     * 属性jdfdljhsd
     */
    private BigDecimal jdfdljhsd;
	
    /** 
     * 属性jdfdljhsdzf
     */
    private BigDecimal jdfdljhsdzf;
	
    /** 
     * 属性yfdljhdy
     */
    private BigDecimal yfdljhdy;
	
    /** 
     * 属性yfdljhdyzf
     */
    private BigDecimal yfdljhdyzf;
	
    /** 
     * 属性yfdljhhd
     */
    private BigDecimal yfdljhhd;
	
    /** 
     * 属性yfdljhhdzf
     */
    private BigDecimal yfdljhhdzf;
	
    /** 
     * 属性yfdljhsd
     */
    private BigDecimal yfdljhsd;
	
    /** 
     * 属性yfdljhsdzf
     */
    private BigDecimal yfdljhsdzf;
	
    /** 
     * 属性lyxszf
     */
    private BigDecimal lyxszf;
	
    /** 
     * 属性lyxsyj
     */
    private BigDecimal lyxsyj;
	
    /** 
     * 属性lyxshd
     */
    private BigDecimal lyxshd;
	
    /** 
     * 属性lyxssd
     */
    private BigDecimal lyxssd;
	
    /** 
     * 属性xh
     */
    private BigDecimal xh;
	
    /** 
     * 属性state
     */
    private BigDecimal state;
	
    /** 
     * 属性subjectguid
     */
    private String subjectguid;
	
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
     * PubTmTtfdjhtjb构造函数
     */
    public PubTmTtfdjhtjb() {
        super();
    }  
	
    /**
     * PubTmTtfdjhtjb完整的构造函数
     */  
    public PubTmTtfdjhtjb(String guid,BigDecimal tyear,BigDecimal tmonth,String markerid,BigDecimal state,String fillinman,Date fillintime){
        this.guid = guid;
        this.tyear = tyear;
        this.tmonth = tmonth;
        this.markerid = markerid;
        this.state = state;
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
     * 属性 tjxm 的get方法
     * @return String
     */
    public String getTjxm(){
        return tjxm;
    }
	
    /**
     * 属性 tjxm 的set方法
     * @return
     */
    public void setTjxm(String tjxm){
        this.tjxm = tjxm;
    } 
	
    /**
     * 属性 jdfdljhjdjh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJdfdljhjdjh(){
        return jdfdljhjdjh;
    }
	
    /**
     * 属性 jdfdljhjdjh 的set方法
     * @return
     */
    public void setJdfdljhjdjh(BigDecimal jdfdljhjdjh){
        this.jdfdljhjdjh = jdfdljhjdjh;
    } 
	
    /**
     * 属性 jdfdljhjdjhzf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJdfdljhjdjhzf(){
        return jdfdljhjdjhzf;
    }
	
    /**
     * 属性 jdfdljhjdjhzf 的set方法
     * @return
     */
    public void setJdfdljhjdjhzf(BigDecimal jdfdljhjdjhzf){
        this.jdfdljhjdjhzf = jdfdljhjdjhzf;
    } 
	
    /**
     * 属性 jdfdljhhd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJdfdljhhd(){
        return jdfdljhhd;
    }
	
    /**
     * 属性 jdfdljhhd 的set方法
     * @return
     */
    public void setJdfdljhhd(BigDecimal jdfdljhhd){
        this.jdfdljhhd = jdfdljhhd;
    } 
	
    /**
     * 属性 jdfdljhhdzf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJdfdljhhdzf(){
        return jdfdljhhdzf;
    }
	
    /**
     * 属性 jdfdljhhdzf 的set方法
     * @return
     */
    public void setJdfdljhhdzf(BigDecimal jdfdljhhdzf){
        this.jdfdljhhdzf = jdfdljhhdzf;
    } 
	
    /**
     * 属性 jdfdljhsd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJdfdljhsd(){
        return jdfdljhsd;
    }
	
    /**
     * 属性 jdfdljhsd 的set方法
     * @return
     */
    public void setJdfdljhsd(BigDecimal jdfdljhsd){
        this.jdfdljhsd = jdfdljhsd;
    } 
	
    /**
     * 属性 jdfdljhsdzf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJdfdljhsdzf(){
        return jdfdljhsdzf;
    }
	
    /**
     * 属性 jdfdljhsdzf 的set方法
     * @return
     */
    public void setJdfdljhsdzf(BigDecimal jdfdljhsdzf){
        this.jdfdljhsdzf = jdfdljhsdzf;
    } 
	
    /**
     * 属性 yfdljhdy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYfdljhdy(){
        return yfdljhdy;
    }
	
    /**
     * 属性 yfdljhdy 的set方法
     * @return
     */
    public void setYfdljhdy(BigDecimal yfdljhdy){
        this.yfdljhdy = yfdljhdy;
    } 
	
    /**
     * 属性 yfdljhdyzf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYfdljhdyzf(){
        return yfdljhdyzf;
    }
	
    /**
     * 属性 yfdljhdyzf 的set方法
     * @return
     */
    public void setYfdljhdyzf(BigDecimal yfdljhdyzf){
        this.yfdljhdyzf = yfdljhdyzf;
    } 
	
    /**
     * 属性 yfdljhhd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYfdljhhd(){
        return yfdljhhd;
    }
	
    /**
     * 属性 yfdljhhd 的set方法
     * @return
     */
    public void setYfdljhhd(BigDecimal yfdljhhd){
        this.yfdljhhd = yfdljhhd;
    } 
	
    /**
     * 属性 yfdljhhdzf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYfdljhhdzf(){
        return yfdljhhdzf;
    }
	
    /**
     * 属性 yfdljhhdzf 的set方法
     * @return
     */
    public void setYfdljhhdzf(BigDecimal yfdljhhdzf){
        this.yfdljhhdzf = yfdljhhdzf;
    } 
	
    /**
     * 属性 yfdljhsd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYfdljhsd(){
        return yfdljhsd;
    }
	
    /**
     * 属性 yfdljhsd 的set方法
     * @return
     */
    public void setYfdljhsd(BigDecimal yfdljhsd){
        this.yfdljhsd = yfdljhsd;
    } 
	
    /**
     * 属性 yfdljhsdzf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYfdljhsdzf(){
        return yfdljhsdzf;
    }
	
    /**
     * 属性 yfdljhsdzf 的set方法
     * @return
     */
    public void setYfdljhsdzf(BigDecimal yfdljhsdzf){
        this.yfdljhsdzf = yfdljhsdzf;
    } 
	
    /**
     * 属性 lyxszf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLyxszf(){
        return lyxszf;
    }
	
    /**
     * 属性 lyxszf 的set方法
     * @return
     */
    public void setLyxszf(BigDecimal lyxszf){
        this.lyxszf = lyxszf;
    } 
	
    /**
     * 属性 lyxsyj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLyxsyj(){
        return lyxsyj;
    }
	
    /**
     * 属性 lyxsyj 的set方法
     * @return
     */
    public void setLyxsyj(BigDecimal lyxsyj){
        this.lyxsyj = lyxsyj;
    } 
	
    /**
     * 属性 lyxshd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLyxshd(){
        return lyxshd;
    }
	
    /**
     * 属性 lyxshd 的set方法
     * @return
     */
    public void setLyxshd(BigDecimal lyxshd){
        this.lyxshd = lyxshd;
    } 
	
    /**
     * 属性 lyxssd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLyxssd(){
        return lyxssd;
    }
	
    /**
     * 属性 lyxssd 的set方法
     * @return
     */
    public void setLyxssd(BigDecimal lyxssd){
        this.lyxssd = lyxssd;
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
     * 属性 subjectguid 的get方法
     * @return String
     */
    public String getSubjectguid(){
        return subjectguid;
    }
	
    /**
     * 属性 subjectguid 的set方法
     * @return
     */
    public void setSubjectguid(String subjectguid){
        this.subjectguid = subjectguid;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PubTmTtfdjhtjb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubTmTtfdjhtjb other = (PubTmTtfdjhtjb) o;	        
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
            .append("tjxm"+":"+getTjxm())
            .append("jdfdljhjdjh"+":"+getJdfdljhjdjh())
            .append("jdfdljhjdjhzf"+":"+getJdfdljhjdjhzf())
            .append("jdfdljhhd"+":"+getJdfdljhhd())
            .append("jdfdljhhdzf"+":"+getJdfdljhhdzf())
            .append("jdfdljhsd"+":"+getJdfdljhsd())
            .append("jdfdljhsdzf"+":"+getJdfdljhsdzf())
            .append("yfdljhdy"+":"+getYfdljhdy())
            .append("yfdljhdyzf"+":"+getYfdljhdyzf())
            .append("yfdljhhd"+":"+getYfdljhhd())
            .append("yfdljhhdzf"+":"+getYfdljhhdzf())
            .append("yfdljhsd"+":"+getYfdljhsd())
            .append("yfdljhsdzf"+":"+getYfdljhsdzf())
            .append("lyxszf"+":"+getLyxszf())
            .append("lyxsyj"+":"+getLyxsyj())
            .append("lyxshd"+":"+getLyxshd())
            .append("lyxssd"+":"+getLyxssd())
            .append("xh"+":"+getXh())
            .append("state"+":"+getState())
            .append("subjectguid"+":"+getSubjectguid())
            .append("fillinman"+":"+getFillinman())
            .append("fillintime"+":"+getFillintime())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .append("bak4"+":"+getBak4())
            .append("bak5"+":"+getBak5())
            .append("bak6"+":"+getBak6())
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