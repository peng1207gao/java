package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubTmCydcydjyjh的POJO类
 *
 * @author  yonggan  [Mon Jul 14 15:18:35 CST 2014]
 * 
 */
public class PubTmCydcydjyjh implements Serializable{

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
     * 属性numid
     */
    private BigDecimal numid;
	
    /** 
     * 属性bsdw
     */
    private String bsdw;
	
    /** 
     * 属性jyzt
     */
    private String jyzt;
	
    /** 
     * 属性swjsdljh
     */
    private BigDecimal swjsdljh;
	
    /** 
     * 属性swwsdljh
     */
    private BigDecimal swwsdljh;
	
    /** 
     * 属性swfdqdljh
     */
    private BigDecimal swfdqdljh;
	
    /** 
     * 属性swzjjydljh
     */
    private BigDecimal swzjjydljh;
	
    /** 
     * 属性swqtdljh
     */
    private BigDecimal swqtdljh;
	
    /** 
     * 属性swdlhj
     */
    private BigDecimal swdlhj;
	
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
     * PubTmCydcydjyjh构造函数
     */
    public PubTmCydcydjyjh() {
        super();
    }  
	
    /**
     * PubTmCydcydjyjh完整的构造函数
     */  
    public PubTmCydcydjyjh(String guid,BigDecimal tyear,BigDecimal tmonth,String markerid,BigDecimal state,String fillinman,Date fillintime){
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
     * 属性 numid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNumid(){
        return numid;
    }
	
    /**
     * 属性 numid 的set方法
     * @return
     */
    public void setNumid(BigDecimal numid){
        this.numid = numid;
    } 
	
    /**
     * 属性 bsdw 的get方法
     * @return String
     */
    public String getBsdw(){
        return bsdw;
    }
	
    /**
     * 属性 bsdw 的set方法
     * @return
     */
    public void setBsdw(String bsdw){
        this.bsdw = bsdw;
    } 
	
    /**
     * 属性 jyzt 的get方法
     * @return String
     */
    public String getJyzt(){
        return jyzt;
    }
	
    /**
     * 属性 jyzt 的set方法
     * @return
     */
    public void setJyzt(String jyzt){
        this.jyzt = jyzt;
    } 
	
    /**
     * 属性 swjsdljh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSwjsdljh(){
        return swjsdljh;
    }
	
    /**
     * 属性 swjsdljh 的set方法
     * @return
     */
    public void setSwjsdljh(BigDecimal swjsdljh){
        this.swjsdljh = swjsdljh;
    } 
	
    /**
     * 属性 swwsdljh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSwwsdljh(){
        return swwsdljh;
    }
	
    /**
     * 属性 swwsdljh 的set方法
     * @return
     */
    public void setSwwsdljh(BigDecimal swwsdljh){
        this.swwsdljh = swwsdljh;
    } 
	
    /**
     * 属性 swfdqdljh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSwfdqdljh(){
        return swfdqdljh;
    }
	
    /**
     * 属性 swfdqdljh 的set方法
     * @return
     */
    public void setSwfdqdljh(BigDecimal swfdqdljh){
        this.swfdqdljh = swfdqdljh;
    } 
	
    /**
     * 属性 swzjjydljh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSwzjjydljh(){
        return swzjjydljh;
    }
	
    /**
     * 属性 swzjjydljh 的set方法
     * @return
     */
    public void setSwzjjydljh(BigDecimal swzjjydljh){
        this.swzjjydljh = swzjjydljh;
    } 
	
    /**
     * 属性 swqtdljh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSwqtdljh(){
        return swqtdljh;
    }
	
    /**
     * 属性 swqtdljh 的set方法
     * @return
     */
    public void setSwqtdljh(BigDecimal swqtdljh){
        this.swqtdljh = swqtdljh;
    } 
	
    /**
     * 属性 swdlhj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSwdlhj(){
        return swdlhj;
    }
	
    /**
     * 属性 swdlhj 的set方法
     * @return
     */
    public void setSwdlhj(BigDecimal swdlhj){
        this.swdlhj = swdlhj;
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
		
        if (o == null || !(o instanceof PubTmCydcydjyjh))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubTmCydcydjyjh other = (PubTmCydcydjyjh) o;	        
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
            .append("numid"+":"+getNumid())
            .append("bsdw"+":"+getBsdw())
            .append("jyzt"+":"+getJyzt())
            .append("swjsdljh"+":"+getSwjsdljh())
            .append("swwsdljh"+":"+getSwwsdljh())
            .append("swfdqdljh"+":"+getSwfdqdljh())
            .append("swzjjydljh"+":"+getSwzjjydljh())
            .append("swqtdljh"+":"+getSwqtdljh())
            .append("swdlhj"+":"+getSwdlhj())
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