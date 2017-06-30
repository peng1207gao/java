package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PaUnitrunhoursM的POJO类
 *
 * @author  Administrator  [Wed Jun 19 17:42:45 CST 2013]
 * 
 */
public class PaUnitrunhoursM implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性querydate
     */
    private Date querydate;
	
    /** 
     * 属性physicalunitid
     */
    private String physicalunitid;
	
    /** 
     * 属性physicalunitname
     */
    private String physicalunitname;
	
    /** 
     * 属性stationid
     */
    private String stationid;
	
    /** 
     * 属性stationname
     */
    private String stationname;
	
    /** 
     * 属性gengroupid
     */
    private String gengroupid;
	
    /** 
     * 属性gengroupname
     */
    private String gengroupname;
	
    /** 
     * 属性gentype
     */
    private BigDecimal gentype;
	
    /** 
     * 属性unitcap
     */
    private BigDecimal unitcap;
	
    /** 
     * 属性genratorclass
     */
    private BigDecimal genratorclass;
	
    /** 
     * 属性monrealgenereq
     */
    private BigDecimal monrealgenereq;
	
    /** 
     * 属性monplangenereq
     */
    private BigDecimal monplangenereq;
	
    /** 
     * 属性monrealgenereqT
     */
    private BigDecimal monrealgenereqT;
	
    /** 
     * 属性monplangenereqT
     */
    private BigDecimal monplangenereqT;
	
    /** 
     * 属性monrealneteq
     */
    private BigDecimal monrealneteq;
	
    /** 
     * 属性monplanneteq
     */
    private BigDecimal monplanneteq;
	
    /** 
     * 属性backStr1
     */
    private String backStr1;
	
    /** 
     * 属性backStr2
     */
    private String backStr2;
	
    /** 
     * 属性backStr3
     */
    private String backStr3;
	
    /** 
     * 属性backStr4
     */
    private String backStr4;
	
    /** 
     * 属性backStr5
     */
    private String backStr5;
	
    /** 
     * 属性backInt1
     */
    private BigDecimal backInt1;
	
    /** 
     * 属性backInt2
     */
    private BigDecimal backInt2;
	
    /** 
     * 属性backInt3
     */
    private BigDecimal backInt3;
	
    /** 
     * 属性backInt4
     */
    private BigDecimal backInt4;
	
    /** 
     * 属性backInt5
     */
    private BigDecimal backInt5;
	
    /** 
     * 属性backDouble1
     */
    private BigDecimal backDouble1;
	
    /** 
     * 属性backDouble2
     */
    private BigDecimal backDouble2;
	
    /** 
     * 属性backDouble3
     */
    private BigDecimal backDouble3;
	
    /** 
     * 属性backDouble4
     */
    private BigDecimal backDouble4;
	
    /** 
     * 属性backDouble5
     */
    private BigDecimal backDouble5;
	
    /** 
     * 属性backDouble6
     */
    private BigDecimal backDouble6;
	
    /** 
     * 属性backDouble7
     */
    private BigDecimal backDouble7;
	
    /** 
     * 属性backDouble8
     */
    private BigDecimal backDouble8;
	
    /** 
     * 属性backDate1
     */
    private Date backDate1;
	
    /** 
     * 属性backDate2
     */
    private Date backDate2;
	
    /** 
     * 属性backDate3
     */
    private Date backDate3;
	
    /**
     * PaUnitrunhoursM构造函数
     */
    public PaUnitrunhoursM() {
        super();
    }  
	
    /**
     * PaUnitrunhoursM完整的构造函数
     */  
    public PaUnitrunhoursM(String guid){
        this.guid = guid;
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
     * 属性 querydate 的get方法
     * @return Date
     */
    public Date getQuerydate(){
        return querydate;
    }
	
    /**
     * 属性 querydate 的set方法
     * @return
     */
    public void setQuerydate(Date querydate){
        this.querydate = querydate;
    } 
	
    /**
     * 属性 physicalunitid 的get方法
     * @return String
     */
    public String getPhysicalunitid(){
        return physicalunitid;
    }
	
    /**
     * 属性 physicalunitid 的set方法
     * @return
     */
    public void setPhysicalunitid(String physicalunitid){
        this.physicalunitid = physicalunitid;
    } 
	
    /**
     * 属性 physicalunitname 的get方法
     * @return String
     */
    public String getPhysicalunitname(){
        return physicalunitname;
    }
	
    /**
     * 属性 physicalunitname 的set方法
     * @return
     */
    public void setPhysicalunitname(String physicalunitname){
        this.physicalunitname = physicalunitname;
    } 
	
    /**
     * 属性 stationid 的get方法
     * @return String
     */
    public String getStationid(){
        return stationid;
    }
	
    /**
     * 属性 stationid 的set方法
     * @return
     */
    public void setStationid(String stationid){
        this.stationid = stationid;
    } 
	
    /**
     * 属性 stationname 的get方法
     * @return String
     */
    public String getStationname(){
        return stationname;
    }
	
    /**
     * 属性 stationname 的set方法
     * @return
     */
    public void setStationname(String stationname){
        this.stationname = stationname;
    } 
	
    /**
     * 属性 gengroupid 的get方法
     * @return String
     */
    public String getGengroupid(){
        return gengroupid;
    }
	
    /**
     * 属性 gengroupid 的set方法
     * @return
     */
    public void setGengroupid(String gengroupid){
        this.gengroupid = gengroupid;
    } 
	
    /**
     * 属性 gengroupname 的get方法
     * @return String
     */
    public String getGengroupname(){
        return gengroupname;
    }
	
    /**
     * 属性 gengroupname 的set方法
     * @return
     */
    public void setGengroupname(String gengroupname){
        this.gengroupname = gengroupname;
    } 
	
    /**
     * 属性 gentype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGentype(){
        return gentype;
    }
	
    /**
     * 属性 gentype 的set方法
     * @return
     */
    public void setGentype(BigDecimal gentype){
        this.gentype = gentype;
    } 
	
    /**
     * 属性 unitcap 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUnitcap(){
        return unitcap;
    }
	
    /**
     * 属性 unitcap 的set方法
     * @return
     */
    public void setUnitcap(BigDecimal unitcap){
        this.unitcap = unitcap;
    } 
	
    /**
     * 属性 genratorclass 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenratorclass(){
        return genratorclass;
    }
	
    /**
     * 属性 genratorclass 的set方法
     * @return
     */
    public void setGenratorclass(BigDecimal genratorclass){
        this.genratorclass = genratorclass;
    } 
	
    /**
     * 属性 monrealgenereq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonrealgenereq(){
        return monrealgenereq;
    }
	
    /**
     * 属性 monrealgenereq 的set方法
     * @return
     */
    public void setMonrealgenereq(BigDecimal monrealgenereq){
        this.monrealgenereq = monrealgenereq;
    } 
	
    /**
     * 属性 monplangenereq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonplangenereq(){
        return monplangenereq;
    }
	
    /**
     * 属性 monplangenereq 的set方法
     * @return
     */
    public void setMonplangenereq(BigDecimal monplangenereq){
        this.monplangenereq = monplangenereq;
    } 
	
    /**
     * 属性 monrealgenereqT 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonrealgenereqT(){
        return monrealgenereqT;
    }
	
    /**
     * 属性 monrealgenereqT 的set方法
     * @return
     */
    public void setMonrealgenereqT(BigDecimal monrealgenereqT){
        this.monrealgenereqT = monrealgenereqT;
    } 
	
    /**
     * 属性 monplangenereqT 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonplangenereqT(){
        return monplangenereqT;
    }
	
    /**
     * 属性 monplangenereqT 的set方法
     * @return
     */
    public void setMonplangenereqT(BigDecimal monplangenereqT){
        this.monplangenereqT = monplangenereqT;
    } 
	
    /**
     * 属性 monrealneteq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonrealneteq(){
        return monrealneteq;
    }
	
    /**
     * 属性 monrealneteq 的set方法
     * @return
     */
    public void setMonrealneteq(BigDecimal monrealneteq){
        this.monrealneteq = monrealneteq;
    } 
	
    /**
     * 属性 monplanneteq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMonplanneteq(){
        return monplanneteq;
    }
	
    /**
     * 属性 monplanneteq 的set方法
     * @return
     */
    public void setMonplanneteq(BigDecimal monplanneteq){
        this.monplanneteq = monplanneteq;
    } 
	
    /**
     * 属性 backStr1 的get方法
     * @return String
     */
    public String getBackStr1(){
        return backStr1;
    }
	
    /**
     * 属性 backStr1 的set方法
     * @return
     */
    public void setBackStr1(String backStr1){
        this.backStr1 = backStr1;
    } 
	
    /**
     * 属性 backStr2 的get方法
     * @return String
     */
    public String getBackStr2(){
        return backStr2;
    }
	
    /**
     * 属性 backStr2 的set方法
     * @return
     */
    public void setBackStr2(String backStr2){
        this.backStr2 = backStr2;
    } 
	
    /**
     * 属性 backStr3 的get方法
     * @return String
     */
    public String getBackStr3(){
        return backStr3;
    }
	
    /**
     * 属性 backStr3 的set方法
     * @return
     */
    public void setBackStr3(String backStr3){
        this.backStr3 = backStr3;
    } 
	
    /**
     * 属性 backStr4 的get方法
     * @return String
     */
    public String getBackStr4(){
        return backStr4;
    }
	
    /**
     * 属性 backStr4 的set方法
     * @return
     */
    public void setBackStr4(String backStr4){
        this.backStr4 = backStr4;
    } 
	
    /**
     * 属性 backStr5 的get方法
     * @return String
     */
    public String getBackStr5(){
        return backStr5;
    }
	
    /**
     * 属性 backStr5 的set方法
     * @return
     */
    public void setBackStr5(String backStr5){
        this.backStr5 = backStr5;
    } 
	
    /**
     * 属性 backInt1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackInt1(){
        return backInt1;
    }
	
    /**
     * 属性 backInt1 的set方法
     * @return
     */
    public void setBackInt1(BigDecimal backInt1){
        this.backInt1 = backInt1;
    } 
	
    /**
     * 属性 backInt2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackInt2(){
        return backInt2;
    }
	
    /**
     * 属性 backInt2 的set方法
     * @return
     */
    public void setBackInt2(BigDecimal backInt2){
        this.backInt2 = backInt2;
    } 
	
    /**
     * 属性 backInt3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackInt3(){
        return backInt3;
    }
	
    /**
     * 属性 backInt3 的set方法
     * @return
     */
    public void setBackInt3(BigDecimal backInt3){
        this.backInt3 = backInt3;
    } 
	
    /**
     * 属性 backInt4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackInt4(){
        return backInt4;
    }
	
    /**
     * 属性 backInt4 的set方法
     * @return
     */
    public void setBackInt4(BigDecimal backInt4){
        this.backInt4 = backInt4;
    } 
	
    /**
     * 属性 backInt5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackInt5(){
        return backInt5;
    }
	
    /**
     * 属性 backInt5 的set方法
     * @return
     */
    public void setBackInt5(BigDecimal backInt5){
        this.backInt5 = backInt5;
    } 
	
    /**
     * 属性 backDouble1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble1(){
        return backDouble1;
    }
	
    /**
     * 属性 backDouble1 的set方法
     * @return
     */
    public void setBackDouble1(BigDecimal backDouble1){
        this.backDouble1 = backDouble1;
    } 
	
    /**
     * 属性 backDouble2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble2(){
        return backDouble2;
    }
	
    /**
     * 属性 backDouble2 的set方法
     * @return
     */
    public void setBackDouble2(BigDecimal backDouble2){
        this.backDouble2 = backDouble2;
    } 
	
    /**
     * 属性 backDouble3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble3(){
        return backDouble3;
    }
	
    /**
     * 属性 backDouble3 的set方法
     * @return
     */
    public void setBackDouble3(BigDecimal backDouble3){
        this.backDouble3 = backDouble3;
    } 
	
    /**
     * 属性 backDouble4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble4(){
        return backDouble4;
    }
	
    /**
     * 属性 backDouble4 的set方法
     * @return
     */
    public void setBackDouble4(BigDecimal backDouble4){
        this.backDouble4 = backDouble4;
    } 
	
    /**
     * 属性 backDouble5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble5(){
        return backDouble5;
    }
	
    /**
     * 属性 backDouble5 的set方法
     * @return
     */
    public void setBackDouble5(BigDecimal backDouble5){
        this.backDouble5 = backDouble5;
    } 
	
    /**
     * 属性 backDouble6 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble6(){
        return backDouble6;
    }
	
    /**
     * 属性 backDouble6 的set方法
     * @return
     */
    public void setBackDouble6(BigDecimal backDouble6){
        this.backDouble6 = backDouble6;
    } 
	
    /**
     * 属性 backDouble7 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble7(){
        return backDouble7;
    }
	
    /**
     * 属性 backDouble7 的set方法
     * @return
     */
    public void setBackDouble7(BigDecimal backDouble7){
        this.backDouble7 = backDouble7;
    } 
	
    /**
     * 属性 backDouble8 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackDouble8(){
        return backDouble8;
    }
	
    /**
     * 属性 backDouble8 的set方法
     * @return
     */
    public void setBackDouble8(BigDecimal backDouble8){
        this.backDouble8 = backDouble8;
    } 
	
    /**
     * 属性 backDate1 的get方法
     * @return Date
     */
    public Date getBackDate1(){
        return backDate1;
    }
	
    /**
     * 属性 backDate1 的set方法
     * @return
     */
    public void setBackDate1(Date backDate1){
        this.backDate1 = backDate1;
    } 
	
    /**
     * 属性 backDate2 的get方法
     * @return Date
     */
    public Date getBackDate2(){
        return backDate2;
    }
	
    /**
     * 属性 backDate2 的set方法
     * @return
     */
    public void setBackDate2(Date backDate2){
        this.backDate2 = backDate2;
    } 
	
    /**
     * 属性 backDate3 的get方法
     * @return Date
     */
    public Date getBackDate3(){
        return backDate3;
    }
	
    /**
     * 属性 backDate3 的set方法
     * @return
     */
    public void setBackDate3(Date backDate3){
        this.backDate3 = backDate3;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PaUnitrunhoursM))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PaUnitrunhoursM other = (PaUnitrunhoursM) o;	        
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
            .append("querydate"+":"+getQuerydate())
            .append("physicalunitid"+":"+getPhysicalunitid())
            .append("physicalunitname"+":"+getPhysicalunitname())
            .append("stationid"+":"+getStationid())
            .append("stationname"+":"+getStationname())
            .append("gengroupid"+":"+getGengroupid())
            .append("gengroupname"+":"+getGengroupname())
            .append("gentype"+":"+getGentype())
            .append("unitcap"+":"+getUnitcap())
            .append("genratorclass"+":"+getGenratorclass())
            .append("monrealgenereq"+":"+getMonrealgenereq())
            .append("monplangenereq"+":"+getMonplangenereq())
            .append("monrealgenereqT"+":"+getMonrealgenereqT())
            .append("monplangenereqT"+":"+getMonplangenereqT())
            .append("monrealneteq"+":"+getMonrealneteq())
            .append("monplanneteq"+":"+getMonplanneteq())
            .append("backStr1"+":"+getBackStr1())
            .append("backStr2"+":"+getBackStr2())
            .append("backStr3"+":"+getBackStr3())
            .append("backStr4"+":"+getBackStr4())
            .append("backStr5"+":"+getBackStr5())
            .append("backInt1"+":"+getBackInt1())
            .append("backInt2"+":"+getBackInt2())
            .append("backInt3"+":"+getBackInt3())
            .append("backInt4"+":"+getBackInt4())
            .append("backInt5"+":"+getBackInt5())
            .append("backDouble1"+":"+getBackDouble1())
            .append("backDouble2"+":"+getBackDouble2())
            .append("backDouble3"+":"+getBackDouble3())
            .append("backDouble4"+":"+getBackDouble4())
            .append("backDouble5"+":"+getBackDouble5())
            .append("backDouble6"+":"+getBackDouble6())
            .append("backDouble7"+":"+getBackDouble7())
            .append("backDouble8"+":"+getBackDouble8())
            .append("backDate1"+":"+getBackDate1())
            .append("backDate2"+":"+getBackDate2())
            .append("backDate3"+":"+getBackDate3())
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