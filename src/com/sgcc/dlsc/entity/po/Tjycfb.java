package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * Tjycfb的POJO类
 *
 * @author  sss  [Thu Dec 05 09:29:08 CST 2013]
 * 
 */
public class Tjycfb implements Serializable{

    /** 
     * 属性comptid
     */
    private String comptid;
	
    /** 
     * 属性comptname
     */
    private String comptname;
	
    /** 
     * 属性superiorcomptid
     */
    private String superiorcomptid;
	
    /** 
     * 属性jylx
     */
    private String jylx;
	
    /** 
     * 属性powerType
     */
    private String powerType;
	
    /** 
     * 属性linegroupid
     */
    private String linegroupid;
	
    /** 
     * 属性fstart
     */
    private String fstart;
	
    /** 
     * 属性ffinish
     */
    private String ffinish;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性sfzd
     */
    private String sfzd;
	
    /** 
     * 属性sx
     */
    private BigDecimal sx;
	
    /** 
     * 属性sfhzcf
     */
    private String sfhzcf;
	
    /** 
     * 属性sfhz
     */
    private String sfhz;
	
    /** 
     * 属性systemid
     */
    private BigDecimal systemid;
	
    /** 
     * 属性systemname
     */
    private String systemname;
	
    /** 
     * 属性pri
     */
    private BigDecimal pri;
	
    /** 
     * 属性ismust
     */
    private BigDecimal ismust;
	
    /** 
     * 属性statistype
     */
    private String statistype;
	
    /** 
     * 属性showname
     */
    private String showname;
	
    /** 
     * 属性qylx
     */
    private String qylx;
	
    /** 
     * 属性isstate
     */
    private BigDecimal isstate;
	
    /** 
     * 属性compttype
     */
    private BigDecimal compttype;
	
    /** 
     * 属性iserp
     */
    private BigDecimal iserp;
	
    /** 
     * 属性settletype
     */
    private BigDecimal settletype;
	
    /** 
     * 属性memberrelation
     */
    private BigDecimal memberrelation;
	
    /** 
     * 属性netsidename
     */
    private String netsidename;
	
    /** 
     * 属性fallsidename
     */
    private String fallsidename;
	
    /** 
     * 属性trademodel
     */
    private BigDecimal trademodel;
	
    /** 
     * 属性priceanalyse
     */
    private BigDecimal priceanalyse;
	
    /** 
     * 属性isfallside
     */
    private BigDecimal isfallside;
	
    /** 
     * 属性sellid
     */
    private String sellid;
	
    /**
     * Tjycfb构造函数
     */
    public Tjycfb() {
        super();
    }  
	
    /**
     * Tjycfb完整的构造函数
     */  
    public Tjycfb(String comptid,String sfzd){
        this.comptid = comptid;
        this.sfzd = sfzd;
    }
 
	
	
    /**
     * 属性 comptid 的get方法
     * @return String
     */
    public String getComptid(){
        return comptid;
    }
	
    /**
     * 属性 comptid 的set方法
     * @return
     */
    public void setComptid(String comptid){
        if(comptid != null && comptid.trim().length() == 0){
            this.comptid = null;
        }else{
            this.comptid = comptid;
        }
    } 
	
	
	
    /**
     * 属性 comptname 的get方法
     * @return String
     */
    public String getComptname(){
        return comptname;
    }
	
    /**
     * 属性 comptname 的set方法
     * @return
     */
    public void setComptname(String comptname){
        this.comptname = comptname;
    } 
	
	
	
    /**
     * 属性 superiorcomptid 的get方法
     * @return String
     */
    public String getSuperiorcomptid(){
        return superiorcomptid;
    }
	
    /**
     * 属性 superiorcomptid 的set方法
     * @return
     */
    public void setSuperiorcomptid(String superiorcomptid){
        this.superiorcomptid = superiorcomptid;
    } 
	
	
	
    /**
     * 属性 jylx 的get方法
     * @return String
     */
    public String getJylx(){
        return jylx;
    }
	
    /**
     * 属性 jylx 的set方法
     * @return
     */
    public void setJylx(String jylx){
        this.jylx = jylx;
    } 
	
	
	
    /**
     * 属性 powerType 的get方法
     * @return String
     */
    public String getPowerType(){
        return powerType;
    }
	
    /**
     * 属性 powerType 的set方法
     * @return
     */
    public void setPowerType(String powerType){
        this.powerType = powerType;
    } 
	
	
	
    /**
     * 属性 linegroupid 的get方法
     * @return String
     */
    public String getLinegroupid(){
        return linegroupid;
    }
	
    /**
     * 属性 linegroupid 的set方法
     * @return
     */
    public void setLinegroupid(String linegroupid){
        this.linegroupid = linegroupid;
    } 
	
	
	
    /**
     * 属性 fstart 的get方法
     * @return String
     */
    public String getFstart(){
        return fstart;
    }
	
    /**
     * 属性 fstart 的set方法
     * @return
     */
    public void setFstart(String fstart){
        this.fstart = fstart;
    } 
	
	
	
    /**
     * 属性 ffinish 的get方法
     * @return String
     */
    public String getFfinish(){
        return ffinish;
    }
	
    /**
     * 属性 ffinish 的set方法
     * @return
     */
    public void setFfinish(String ffinish){
        this.ffinish = ffinish;
    } 
	
	
	
    /**
     * 属性 marketcode 的get方法
     * @return String
     */
    public String getMarketcode(){
        return marketcode;
    }
	
    /**
     * 属性 marketcode 的set方法
     * @return
     */
    public void setMarketcode(String marketcode){
        this.marketcode = marketcode;
    } 
	
	
	
    /**
     * 属性 sfzd 的get方法
     * @return String
     */
    public String getSfzd(){
        return sfzd;
    }
	
    /**
     * 属性 sfzd 的set方法
     * @return
     */
    public void setSfzd(String sfzd){
        this.sfzd = sfzd;
    } 
	
	
	
    /**
     * 属性 sx 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSx(){
        return sx;
    }
	
    /**
     * 属性 sx 的set方法
     * @return
     */
    public void setSx(BigDecimal sx){
        this.sx = sx;
    } 
	
	
	
    /**
     * 属性 sfhzcf 的get方法
     * @return String
     */
    public String getSfhzcf(){
        return sfhzcf;
    }
	
    /**
     * 属性 sfhzcf 的set方法
     * @return
     */
    public void setSfhzcf(String sfhzcf){
        this.sfhzcf = sfhzcf;
    } 
	
	
	
    /**
     * 属性 sfhz 的get方法
     * @return String
     */
    public String getSfhz(){
        return sfhz;
    }
	
    /**
     * 属性 sfhz 的set方法
     * @return
     */
    public void setSfhz(String sfhz){
        this.sfhz = sfhz;
    } 
	
	
	
    /**
     * 属性 systemid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSystemid(){
        return systemid;
    }
	
    /**
     * 属性 systemid 的set方法
     * @return
     */
    public void setSystemid(BigDecimal systemid){
        this.systemid = systemid;
    } 
	
	
	
    /**
     * 属性 systemname 的get方法
     * @return String
     */
    public String getSystemname(){
        return systemname;
    }
	
    /**
     * 属性 systemname 的set方法
     * @return
     */
    public void setSystemname(String systemname){
        this.systemname = systemname;
    } 
	
	
	
    /**
     * 属性 pri 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPri(){
        return pri;
    }
	
    /**
     * 属性 pri 的set方法
     * @return
     */
    public void setPri(BigDecimal pri){
        this.pri = pri;
    } 
	
	
	
    /**
     * 属性 ismust 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsmust(){
        return ismust;
    }
	
    /**
     * 属性 ismust 的set方法
     * @return
     */
    public void setIsmust(BigDecimal ismust){
        this.ismust = ismust;
    } 
	
	
	
    /**
     * 属性 statistype 的get方法
     * @return String
     */
    public String getStatistype(){
        return statistype;
    }
	
    /**
     * 属性 statistype 的set方法
     * @return
     */
    public void setStatistype(String statistype){
        this.statistype = statistype;
    } 
	
	
	
    /**
     * 属性 showname 的get方法
     * @return String
     */
    public String getShowname(){
        return showname;
    }
	
    /**
     * 属性 showname 的set方法
     * @return
     */
    public void setShowname(String showname){
        this.showname = showname;
    } 
	
	
	
    /**
     * 属性 qylx 的get方法
     * @return String
     */
    public String getQylx(){
        return qylx;
    }
	
    /**
     * 属性 qylx 的set方法
     * @return
     */
    public void setQylx(String qylx){
        this.qylx = qylx;
    } 
	
	
	
    /**
     * 属性 isstate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsstate(){
        return isstate;
    }
	
    /**
     * 属性 isstate 的set方法
     * @return
     */
    public void setIsstate(BigDecimal isstate){
        this.isstate = isstate;
    } 
	
	
	
    /**
     * 属性 compttype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCompttype(){
        return compttype;
    }
	
    /**
     * 属性 compttype 的set方法
     * @return
     */
    public void setCompttype(BigDecimal compttype){
        this.compttype = compttype;
    } 
	
	
	
    /**
     * 属性 iserp 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIserp(){
        return iserp;
    }
	
    /**
     * 属性 iserp 的set方法
     * @return
     */
    public void setIserp(BigDecimal iserp){
        this.iserp = iserp;
    } 
	
	
	
    /**
     * 属性 settletype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSettletype(){
        return settletype;
    }
	
    /**
     * 属性 settletype 的set方法
     * @return
     */
    public void setSettletype(BigDecimal settletype){
        this.settletype = settletype;
    } 
	
	
	
    /**
     * 属性 memberrelation 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMemberrelation(){
        return memberrelation;
    }
	
    /**
     * 属性 memberrelation 的set方法
     * @return
     */
    public void setMemberrelation(BigDecimal memberrelation){
        this.memberrelation = memberrelation;
    } 
	
	
	
    /**
     * 属性 netsidename 的get方法
     * @return String
     */
    public String getNetsidename(){
        return netsidename;
    }
	
    /**
     * 属性 netsidename 的set方法
     * @return
     */
    public void setNetsidename(String netsidename){
        this.netsidename = netsidename;
    } 
	
	
	
    /**
     * 属性 fallsidename 的get方法
     * @return String
     */
    public String getFallsidename(){
        return fallsidename;
    }
	
    /**
     * 属性 fallsidename 的set方法
     * @return
     */
    public void setFallsidename(String fallsidename){
        this.fallsidename = fallsidename;
    } 
	
	
	
    /**
     * 属性 trademodel 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTrademodel(){
        return trademodel;
    }
	
    /**
     * 属性 trademodel 的set方法
     * @return
     */
    public void setTrademodel(BigDecimal trademodel){
        this.trademodel = trademodel;
    } 
	
	
	
    /**
     * 属性 priceanalyse 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPriceanalyse(){
        return priceanalyse;
    }
	
    /**
     * 属性 priceanalyse 的set方法
     * @return
     */
    public void setPriceanalyse(BigDecimal priceanalyse){
        this.priceanalyse = priceanalyse;
    } 
	
	
	
    /**
     * 属性 isfallside 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsfallside(){
        return isfallside;
    }
	
    /**
     * 属性 isfallside 的set方法
     * @return
     */
    public void setIsfallside(BigDecimal isfallside){
        this.isfallside = isfallside;
    } 
	
	
	
    /**
     * 属性 sellid 的get方法
     * @return String
     */
    public String getSellid(){
        return sellid;
    }
	
    /**
     * 属性 sellid 的set方法
     * @return
     */
    public void setSellid(String sellid){
        this.sellid = sellid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof Tjycfb))
	        return false; 
			
        if(getComptid() == null) 
	        return false;

        Tjycfb other = (Tjycfb) o;	        
	    return new EqualsBuilder()
            .append(this.getComptid(), other.getComptid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("comptid"+":"+getComptid())
            .append("comptname"+":"+getComptname())
            .append("superiorcomptid"+":"+getSuperiorcomptid())
            .append("jylx"+":"+getJylx())
            .append("powerType"+":"+getPowerType())
            .append("linegroupid"+":"+getLinegroupid())
            .append("fstart"+":"+getFstart())
            .append("ffinish"+":"+getFfinish())
            .append("marketcode"+":"+getMarketcode())
            .append("sfzd"+":"+getSfzd())
            .append("sx"+":"+getSx())
            .append("sfhzcf"+":"+getSfhzcf())
            .append("sfhz"+":"+getSfhz())
            .append("systemid"+":"+getSystemid())
            .append("systemname"+":"+getSystemname())
            .append("pri"+":"+getPri())
            .append("ismust"+":"+getIsmust())
            .append("statistype"+":"+getStatistype())
            .append("showname"+":"+getShowname())
            .append("qylx"+":"+getQylx())
            .append("isstate"+":"+getIsstate())
            .append("compttype"+":"+getCompttype())
            .append("iserp"+":"+getIserp())
            .append("settletype"+":"+getSettletype())
            .append("memberrelation"+":"+getMemberrelation())
            .append("netsidename"+":"+getNetsidename())
            .append("fallsidename"+":"+getFallsidename())
            .append("trademodel"+":"+getTrademodel())
            .append("priceanalyse"+":"+getPriceanalyse())
            .append("isfallside"+":"+getIsfallside())
            .append("sellid"+":"+getSellid())
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