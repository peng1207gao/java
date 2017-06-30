package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DeMappingMain的POJO类
 *
 * @author  Administrator  [Tue Apr 15 19:58:22 CST 2014]
 * 
 */
public class DeMappingMain implements Serializable{

    /** 
     * 属性showorder
     */
    private BigDecimal showorder;
	
    /** 
     * 属性sheetname
     */
    private String sheetname;
	
    /** 
     * 属性sheetid
     */
    private String sheetid;
	
    /** 
     * 属性datatype
     */
    private BigDecimal datatype;
	
    /** 
     * 属性datastatusid
     */
    private BigDecimal datastatusid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性kzzd1
     */
    private String kzzd1;
	
    /** 
     * 属性kzzd2
     */
    private String kzzd2;
	
    /** 
     * 属性kzzd3
     */
    private String kzzd3;
	
    /** 
     * 属性kssysj
     */
    private String kssysj;
	
    /** 
     * 属性jssysj
     */
    private String jssysj;
	
    /** 
     * 属性ysysb
     */
    private String ysysb;
	
    /** 
     * 属性ysmbb
     */
    private String ysmbb;
	
    /** 
     * 属性bz
     */
    private String bz;
	
    /** 
     * 属性ysbidzd
     */
    private String ysbidzd;
	
    /** 
     * 属性ysbmczd
     */
    private String ysbmczd;
	
    /** 
     * 属性ysbtj
     */
    private String ysbtj;
	
    /** 
     * 属性ysbsfqz
     */
    private String ysbsfqz;
	
    /** 
     * 属性mbbidzd
     */
    private String mbbidzd;
	
    /** 
     * 属性mbbmczd
     */
    private String mbbmczd;
	
    /** 
     * 属性mbbtj
     */
    private String mbbtj;
	
    /** 
     * 属性mbbsfqz
     */
    private String mbbsfqz;
	
    /** 
     * 属性ysbpxtj
     */
    private String ysbpxtj;
	
    /** 
     * 属性mbbpxtj
     */
    private String mbbpxtj;
	
    /** 
     * 属性ysbcfnr
     */
    private String ysbcfnr;
	
    /** 
     * 属性mbbcfnr
     */
    private String mbbcfnr;
	
    /** 
     * 属性bxtqb
     */
    private String bxtqb;
	
    /** 
     * 属性wxtqb
     */
    private String wxtqb;
	
    /** 
     * 属性xtpx
     */
    private BigDecimal xtpx;
	
    /**
     * DeMappingMain构造函数
     */
    public DeMappingMain() {
        super();
    }  
	
    /**
     * DeMappingMain完整的构造函数
     */  
    public DeMappingMain(String sheetid){
        this.sheetid = sheetid;
    }
 
    /**
     * 属性 showorder 的get方法
     * @return BigDecimal
     */
    public BigDecimal getShoworder(){
        return showorder;
    }
	
    /**
     * 属性 showorder 的set方法
     * @return
     */
    public void setShoworder(BigDecimal showorder){
        this.showorder = showorder;
    } 
	
    /**
     * 属性 sheetname 的get方法
     * @return String
     */
    public String getSheetname(){
        return sheetname;
    }
	
    /**
     * 属性 sheetname 的set方法
     * @return
     */
    public void setSheetname(String sheetname){
        this.sheetname = sheetname;
    } 
	
    /**
     * 属性 sheetid 的get方法
     * @return String
     */
    public String getSheetid(){
        return sheetid;
    }
	
    /**
     * 属性 sheetid 的set方法
     * @return
     */
    public void setSheetid(String sheetid){
        if(sheetid != null && sheetid.trim().length() == 0){
            this.sheetid = null;
        }else{
            this.sheetid = sheetid;
        }
    } 
	
    /**
     * 属性 datatype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDatatype(){
        return datatype;
    }
	
    /**
     * 属性 datatype 的set方法
     * @return
     */
    public void setDatatype(BigDecimal datatype){
        this.datatype = datatype;
    } 
	
    /**
     * 属性 datastatusid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDatastatusid(){
        return datastatusid;
    }
	
    /**
     * 属性 datastatusid 的set方法
     * @return
     */
    public void setDatastatusid(BigDecimal datastatusid){
        this.datastatusid = datastatusid;
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
     * 属性 kzzd1 的get方法
     * @return String
     */
    public String getKzzd1(){
        return kzzd1;
    }
	
    /**
     * 属性 kzzd1 的set方法
     * @return
     */
    public void setKzzd1(String kzzd1){
        this.kzzd1 = kzzd1;
    } 
	
    /**
     * 属性 kzzd2 的get方法
     * @return String
     */
    public String getKzzd2(){
        return kzzd2;
    }
	
    /**
     * 属性 kzzd2 的set方法
     * @return
     */
    public void setKzzd2(String kzzd2){
        this.kzzd2 = kzzd2;
    } 
	
    /**
     * 属性 kzzd3 的get方法
     * @return String
     */
    public String getKzzd3(){
        return kzzd3;
    }
	
    /**
     * 属性 kzzd3 的set方法
     * @return
     */
    public void setKzzd3(String kzzd3){
        this.kzzd3 = kzzd3;
    } 
	
    /**
     * 属性 kssysj 的get方法
     * @return String
     */
    public String getKssysj(){
        return kssysj;
    }
	
    /**
     * 属性 kssysj 的set方法
     * @return
     */
    public void setKssysj(String kssysj){
        this.kssysj = kssysj;
    } 
	
    /**
     * 属性 jssysj 的get方法
     * @return String
     */
    public String getJssysj(){
        return jssysj;
    }
	
    /**
     * 属性 jssysj 的set方法
     * @return
     */
    public void setJssysj(String jssysj){
        this.jssysj = jssysj;
    } 
	
    /**
     * 属性 ysysb 的get方法
     * @return String
     */
    public String getYsysb(){
        return ysysb;
    }
	
    /**
     * 属性 ysysb 的set方法
     * @return
     */
    public void setYsysb(String ysysb){
        this.ysysb = ysysb;
    } 
	
    /**
     * 属性 ysmbb 的get方法
     * @return String
     */
    public String getYsmbb(){
        return ysmbb;
    }
	
    /**
     * 属性 ysmbb 的set方法
     * @return
     */
    public void setYsmbb(String ysmbb){
        this.ysmbb = ysmbb;
    } 
	
    /**
     * 属性 bz 的get方法
     * @return String
     */
    public String getBz(){
        return bz;
    }
	
    /**
     * 属性 bz 的set方法
     * @return
     */
    public void setBz(String bz){
        this.bz = bz;
    } 
	
    /**
     * 属性 ysbidzd 的get方法
     * @return String
     */
    public String getYsbidzd(){
        return ysbidzd;
    }
	
    /**
     * 属性 ysbidzd 的set方法
     * @return
     */
    public void setYsbidzd(String ysbidzd){
        this.ysbidzd = ysbidzd;
    } 
	
    /**
     * 属性 ysbmczd 的get方法
     * @return String
     */
    public String getYsbmczd(){
        return ysbmczd;
    }
	
    /**
     * 属性 ysbmczd 的set方法
     * @return
     */
    public void setYsbmczd(String ysbmczd){
        this.ysbmczd = ysbmczd;
    } 
	
    /**
     * 属性 ysbtj 的get方法
     * @return String
     */
    public String getYsbtj(){
        return ysbtj;
    }
	
    /**
     * 属性 ysbtj 的set方法
     * @return
     */
    public void setYsbtj(String ysbtj){
        this.ysbtj = ysbtj;
    } 
	
    /**
     * 属性 ysbsfqz 的get方法
     * @return String
     */
    public String getYsbsfqz(){
        return ysbsfqz;
    }
	
    /**
     * 属性 ysbsfqz 的set方法
     * @return
     */
    public void setYsbsfqz(String ysbsfqz){
        this.ysbsfqz = ysbsfqz;
    } 
	
    /**
     * 属性 mbbidzd 的get方法
     * @return String
     */
    public String getMbbidzd(){
        return mbbidzd;
    }
	
    /**
     * 属性 mbbidzd 的set方法
     * @return
     */
    public void setMbbidzd(String mbbidzd){
        this.mbbidzd = mbbidzd;
    } 
	
    /**
     * 属性 mbbmczd 的get方法
     * @return String
     */
    public String getMbbmczd(){
        return mbbmczd;
    }
	
    /**
     * 属性 mbbmczd 的set方法
     * @return
     */
    public void setMbbmczd(String mbbmczd){
        this.mbbmczd = mbbmczd;
    } 
	
    /**
     * 属性 mbbtj 的get方法
     * @return String
     */
    public String getMbbtj(){
        return mbbtj;
    }
	
    /**
     * 属性 mbbtj 的set方法
     * @return
     */
    public void setMbbtj(String mbbtj){
        this.mbbtj = mbbtj;
    } 
	
    /**
     * 属性 mbbsfqz 的get方法
     * @return String
     */
    public String getMbbsfqz(){
        return mbbsfqz;
    }
	
    /**
     * 属性 mbbsfqz 的set方法
     * @return
     */
    public void setMbbsfqz(String mbbsfqz){
        this.mbbsfqz = mbbsfqz;
    } 
	
    /**
     * 属性 ysbpxtj 的get方法
     * @return String
     */
    public String getYsbpxtj(){
        return ysbpxtj;
    }
	
    /**
     * 属性 ysbpxtj 的set方法
     * @return
     */
    public void setYsbpxtj(String ysbpxtj){
        this.ysbpxtj = ysbpxtj;
    } 
	
    /**
     * 属性 mbbpxtj 的get方法
     * @return String
     */
    public String getMbbpxtj(){
        return mbbpxtj;
    }
	
    /**
     * 属性 mbbpxtj 的set方法
     * @return
     */
    public void setMbbpxtj(String mbbpxtj){
        this.mbbpxtj = mbbpxtj;
    } 
	
    /**
     * 属性 ysbcfnr 的get方法
     * @return String
     */
    public String getYsbcfnr(){
        return ysbcfnr;
    }
	
    /**
     * 属性 ysbcfnr 的set方法
     * @return
     */
    public void setYsbcfnr(String ysbcfnr){
        this.ysbcfnr = ysbcfnr;
    } 
	
    /**
     * 属性 mbbcfnr 的get方法
     * @return String
     */
    public String getMbbcfnr(){
        return mbbcfnr;
    }
	
    /**
     * 属性 mbbcfnr 的set方法
     * @return
     */
    public void setMbbcfnr(String mbbcfnr){
        this.mbbcfnr = mbbcfnr;
    } 
	
    /**
     * 属性 bxtqb 的get方法
     * @return String
     */
    public String getBxtqb(){
        return bxtqb;
    }
	
    /**
     * 属性 bxtqb 的set方法
     * @return
     */
    public void setBxtqb(String bxtqb){
        this.bxtqb = bxtqb;
    } 
	
    /**
     * 属性 wxtqb 的get方法
     * @return String
     */
    public String getWxtqb(){
        return wxtqb;
    }
	
    /**
     * 属性 wxtqb 的set方法
     * @return
     */
    public void setWxtqb(String wxtqb){
        this.wxtqb = wxtqb;
    } 
	
    /**
     * 属性 xtpx 的get方法
     * @return BigDecimal
     */
    public BigDecimal getXtpx(){
        return xtpx;
    }
	
    /**
     * 属性 xtpx 的set方法
     * @return
     */
    public void setXtpx(BigDecimal xtpx){
        this.xtpx = xtpx;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DeMappingMain))
	        return false; 
			
        if(getSheetid() == null) 
	        return false;

        DeMappingMain other = (DeMappingMain) o;	        
	    return new EqualsBuilder()
            .append(this.getSheetid(), other.getSheetid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("showorder"+":"+getShoworder())
            .append("sheetname"+":"+getSheetname())
            .append("sheetid"+":"+getSheetid())
            .append("datatype"+":"+getDatatype())
            .append("datastatusid"+":"+getDatastatusid())
            .append("marketid"+":"+getMarketid())
            .append("kzzd1"+":"+getKzzd1())
            .append("kzzd2"+":"+getKzzd2())
            .append("kzzd3"+":"+getKzzd3())
            .append("kssysj"+":"+getKssysj())
            .append("jssysj"+":"+getJssysj())
            .append("ysysb"+":"+getYsysb())
            .append("ysmbb"+":"+getYsmbb())
            .append("bz"+":"+getBz())
            .append("ysbidzd"+":"+getYsbidzd())
            .append("ysbmczd"+":"+getYsbmczd())
            .append("ysbtj"+":"+getYsbtj())
            .append("ysbsfqz"+":"+getYsbsfqz())
            .append("mbbidzd"+":"+getMbbidzd())
            .append("mbbmczd"+":"+getMbbmczd())
            .append("mbbtj"+":"+getMbbtj())
            .append("mbbsfqz"+":"+getMbbsfqz())
            .append("ysbpxtj"+":"+getYsbpxtj())
            .append("mbbpxtj"+":"+getMbbpxtj())
            .append("ysbcfnr"+":"+getYsbcfnr())
            .append("mbbcfnr"+":"+getMbbcfnr())
            .append("bxtqb"+":"+getBxtqb())
            .append("wxtqb"+":"+getWxtqb())
            .append("xtpx"+":"+getXtpx())
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