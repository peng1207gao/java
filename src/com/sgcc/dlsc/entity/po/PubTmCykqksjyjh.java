package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubTmCykqksjyjh的POJO类
 *
 * @author  lenovo  [Fri Jul 18 09:46:09 CST 2014]
 * 
 */
public class PubTmCykqksjyjh implements Serializable{

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
     * 属性jymc
     */
    private String jymc;
	
    /** 
     * 属性jycf
     */
    private String jycf;
	
    /** 
     * 属性jydlnd
     */
    private BigDecimal jydlnd;
	
    /** 
     * 属性jydlyd
     */
    private BigDecimal jydlyd;
	
    /** 
     * 属性jydlqt
     */
    private BigDecimal jydlqt;
	
    /** 
     * 属性gfdl
     */
    private BigDecimal gfdl;
	
    /** 
     * 属性fgb
     */
    private BigDecimal fgb;
	
    /** 
     * 属性gdf
     */
    private String gdf;
	
    /** 
     * 属性seller
     */
    private String seller;
	
    /** 
     * 属性sdf
     */
    private String sdf;
	
    /** 
     * 属性yjhdl
     */
    private BigDecimal yjhdl;
	
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
     * PubTmCykqksjyjh构造函数
     */
    public PubTmCykqksjyjh() {
        super();
    }  
	
    /**
     * PubTmCykqksjyjh完整的构造函数
     */  
    public PubTmCykqksjyjh(String guid,BigDecimal tyear,BigDecimal tmonth,String markerid,BigDecimal state,String fillinman,Date fillintime){
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
     * 属性 jymc 的get方法
     * @return String
     */
    public String getJymc(){
        return jymc;
    }
	
    /**
     * 属性 jymc 的set方法
     * @return
     */
    public void setJymc(String jymc){
        this.jymc = jymc;
    } 
	
    /**
     * 属性 jycf 的get方法
     * @return String
     */
    public String getJycf(){
        return jycf;
    }
	
    /**
     * 属性 jycf 的set方法
     * @return
     */
    public void setJycf(String jycf){
        this.jycf = jycf;
    } 
	
    /**
     * 属性 jydlnd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJydlnd(){
        return jydlnd;
    }
	
    /**
     * 属性 jydlnd 的set方法
     * @return
     */
    public void setJydlnd(BigDecimal jydlnd){
        this.jydlnd = jydlnd;
    } 
	
    /**
     * 属性 jydlyd 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJydlyd(){
        return jydlyd;
    }
	
    /**
     * 属性 jydlyd 的set方法
     * @return
     */
    public void setJydlyd(BigDecimal jydlyd){
        this.jydlyd = jydlyd;
    } 
	
    /**
     * 属性 jydlqt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJydlqt(){
        return jydlqt;
    }
	
    /**
     * 属性 jydlqt 的set方法
     * @return
     */
    public void setJydlqt(BigDecimal jydlqt){
        this.jydlqt = jydlqt;
    } 
	
    /**
     * 属性 gfdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGfdl(){
        return gfdl;
    }
	
    /**
     * 属性 gfdl 的set方法
     * @return
     */
    public void setGfdl(BigDecimal gfdl){
        this.gfdl = gfdl;
    } 
	
    /**
     * 属性 fgb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFgb(){
        return fgb;
    }
	
    /**
     * 属性 fgb 的set方法
     * @return
     */
    public void setFgb(BigDecimal fgb){
        this.fgb = fgb;
    } 
	
    /**
     * 属性 gdf 的get方法
     * @return String
     */
    public String getGdf(){
        return gdf;
    }
	
    /**
     * 属性 gdf 的set方法
     * @return
     */
    public void setGdf(String gdf){
        this.gdf = gdf;
    } 
	
    /**
     * 属性 seller 的get方法
     * @return String
     */
    public String getSeller(){
        return seller;
    }
	
    /**
     * 属性 seller 的set方法
     * @return
     */
    public void setSeller(String seller){
        this.seller = seller;
    } 
	
    /**
     * 属性 sdf 的get方法
     * @return String
     */
    public String getSdf(){
        return sdf;
    }
	
    /**
     * 属性 sdf 的set方法
     * @return
     */
    public void setSdf(String sdf){
        this.sdf = sdf;
    } 
	
    /**
     * 属性 yjhdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getYjhdl(){
        return yjhdl;
    }
	
    /**
     * 属性 yjhdl 的set方法
     * @return
     */
    public void setYjhdl(BigDecimal yjhdl){
        this.yjhdl = yjhdl;
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
		
        if (o == null || !(o instanceof PubTmCykqksjyjh))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubTmCykqksjyjh other = (PubTmCykqksjyjh) o;	        
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
            .append("jymc"+":"+getJymc())
            .append("jycf"+":"+getJycf())
            .append("jydlnd"+":"+getJydlnd())
            .append("jydlyd"+":"+getJydlyd())
            .append("jydlqt"+":"+getJydlqt())
            .append("gfdl"+":"+getGfdl())
            .append("fgb"+":"+getFgb())
            .append("gdf"+":"+getGdf())
            .append("seller"+":"+getSeller())
            .append("sdf"+":"+getSdf())
            .append("yjhdl"+":"+getYjhdl())
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