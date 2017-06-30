package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubMGene的POJO类
 *
 * @author  yonggan  [Wed May 28 15:29:43 CST 2014]
 * 
 */
public class PubMGene implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性tyear
     */
    private BigDecimal tyear;
	
    /** 
     * 属性tmonth
     */
    private BigDecimal tmonth;
	
    /** 
     * 属性facid
     */
    private String facid;
	
    /** 
     * 属性facname
     */
    private String facname;
	
    /** 
     * 属性macid
     */
    private String macid;
	
    /** 
     * 属性macname
     */
    private String macname;
	
    /** 
     * 属性geogrregion
     */
    private String geogrregion;
	
    /** 
     * 属性mactype
     */
    private String mactype;
    
    public String getMactype() {
		return mactype;
	}

	public void setMactype(String mactype) {
		this.mactype = mactype;
	}


	/** 
     * 属性gldw
     */
    private String gldw;
	
    /** 
     * 属性maccap
     */
    private BigDecimal maccap;
	
    /** 
     * 属性accessvoltagegrading
     */
    private String accessvoltagegrading;
	
    /** 
     * 属性maxjscl
     */
    private BigDecimal maxjscl;
	
    /** 
     * 属性minjscl
     */
    private BigDecimal minjscl;
	
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
     * PubMGene构造函数
     */
    public PubMGene() {
        super();
    }  
	
    /**
     * PubMGene完整的构造函数
     */  
    public PubMGene(String guid,String marketid,BigDecimal tyear,BigDecimal tmonth,BigDecimal state,String fillinman,Date fillintime){
        this.guid = guid;
        this.marketid = marketid;
        this.tyear = tyear;
        this.tmonth = tmonth;
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
     * 属性 facid 的get方法
     * @return String
     */
    public String getFacid(){
        return facid;
    }
	
    /**
     * 属性 facid 的set方法
     * @return
     */
    public void setFacid(String facid){
        this.facid = facid;
    } 
	
    /**
     * 属性 facname 的get方法
     * @return String
     */
    public String getFacname(){
        return facname;
    }
	
    /**
     * 属性 facname 的set方法
     * @return
     */
    public void setFacname(String facname){
        this.facname = facname;
    } 
	
    /**
     * 属性 macid 的get方法
     * @return String
     */
    public String getMacid(){
        return macid;
    }
	
    /**
     * 属性 macid 的set方法
     * @return
     */
    public void setMacid(String macid){
        this.macid = macid;
    } 
	
    /**
     * 属性 macname 的get方法
     * @return String
     */
    public String getMacname(){
        return macname;
    }
	
    /**
     * 属性 macname 的set方法
     * @return
     */
    public void setMacname(String macname){
        this.macname = macname;
    } 
	
    /**
     * 属性 geogrregion 的get方法
     * @return String
     */
    public String getGeogrregion(){
        return geogrregion;
    }
	
    /**
     * 属性 geogrregion 的set方法
     * @return
     */
    public void setGeogrregion(String geogrregion){
        this.geogrregion = geogrregion;
    } 
	
    /**
     * 属性 gldw 的get方法
     * @return String
     */
    public String getGldw(){
        return gldw;
    }
	
    /**
     * 属性 gldw 的set方法
     * @return
     */
    public void setGldw(String gldw){
        this.gldw = gldw;
    } 
	
    /**
     * 属性 maccap 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaccap(){
        return maccap;
    }
	
    /**
     * 属性 maccap 的set方法
     * @return
     */
    public void setMaccap(BigDecimal maccap){
        this.maccap = maccap;
    } 
	
    /**
     * 属性 accessvoltagegrading 的get方法
     * @return String
     */
    public String getAccessvoltagegrading(){
        return accessvoltagegrading;
    }
	
    /**
     * 属性 accessvoltagegrading 的set方法
     * @return
     */
    public void setAccessvoltagegrading(String accessvoltagegrading){
        this.accessvoltagegrading = accessvoltagegrading;
    } 
	
    /**
     * 属性 maxjscl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxjscl(){
        return maxjscl;
    }
	
    /**
     * 属性 maxjscl 的set方法
     * @return
     */
    public void setMaxjscl(BigDecimal maxjscl){
        this.maxjscl = maxjscl;
    } 
	
    /**
     * 属性 minjscl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMinjscl(){
        return minjscl;
    }
	
    /**
     * 属性 minjscl 的set方法
     * @return
     */
    public void setMinjscl(BigDecimal minjscl){
        this.minjscl = minjscl;
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
		
        if (o == null || !(o instanceof PubMGene))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PubMGene other = (PubMGene) o;	        
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
            .append("tyear"+":"+getTyear())
            .append("tmonth"+":"+getTmonth())
            .append("facid"+":"+getFacid())
            .append("facname"+":"+getFacname())
            .append("macid"+":"+getMacid())
            .append("macname"+":"+getMacname())
            .append("geogrregion"+":"+getGeogrregion())
            .append("mactype"+":"+getMactype())
            .append("gldw"+":"+getGldw())
            .append("maccap"+":"+getMaccap())
            .append("accessvoltagegrading"+":"+getAccessvoltagegrading())
            .append("maxjscl"+":"+getMaxjscl())
            .append("minjscl"+":"+getMinjscl())
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