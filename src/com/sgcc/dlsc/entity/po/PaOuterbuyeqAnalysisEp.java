package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PaOuterbuyeqAnalysisEp的POJO类
 *
 * @author  Administrator  [Sat Jun 15 14:48:39 CST 2013]
 * 
 */
public class PaOuterbuyeqAnalysisEp implements Serializable{

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
     * 属性linklineid
     */
    private String linklineid;
	
    /** 
     * 属性linklinename
     */
    private String linklinename;
	
    /** 
     * 属性buyeq
     */
    private BigDecimal buyeq;
	
    /** 
     * 属性spanprovinceeq
     */
    private BigDecimal spanprovinceeq;
	
    /** 
     * 属性spanareaeq
     */
    private BigDecimal spanareaeq;
	
    /** 
     * 属性longtimeeq
     */
    private BigDecimal longtimeeq;
	
    /** 
     * 属性shorttimeeq
     */
    private BigDecimal shorttimeeq;
	
    /** 
     * 属性reduceco2
     */
    private BigDecimal reduceco2;
	
    /** 
     * 属性reduceso2
     */
    private BigDecimal reduceso2;
	
    /** 
     * 属性economycoal
     */
    private BigDecimal economycoal;
	
    /** 
     * 属性bakStr1
     */
    private String bakStr1;
	
    /** 
     * 属性bakStr2
     */
    private String bakStr2;
	
    /** 
     * 属性bakStr3
     */
    private String bakStr3;
	
    /** 
     * 属性bakInt1
     */
    private BigDecimal bakInt1;
	
    /** 
     * 属性bakInt2
     */
    private BigDecimal bakInt2;
	
    /** 
     * 属性bakInt3
     */
    private BigDecimal bakInt3;
	
    /** 
     * 属性bakDouble1
     */
    private BigDecimal bakDouble1;
	
    /** 
     * 属性bakDouble2
     */
    private BigDecimal bakDouble2;
	
    /** 
     * 属性bakDouble3
     */
    private BigDecimal bakDouble3;
	
    /** 
     * 属性bakDate1
     */
    private Date bakDate1;
	
    /** 
     * 属性bakDate2
     */
    private Date bakDate2;
	
    /** 
     * 属性bakDate3
     */
    private Date bakDate3;
	
    /**
     * PaOuterbuyeqAnalysisEp构造函数
     */
    public PaOuterbuyeqAnalysisEp() {
        super();
    }  
	
    /**
     * PaOuterbuyeqAnalysisEp完整的构造函数
     */  
    public PaOuterbuyeqAnalysisEp(String guid,String marketid,Date querydate,String linklineid){
        this.guid = guid;
        this.marketid = marketid;
        this.querydate = querydate;
        this.linklineid = linklineid;
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
     * 属性 linklineid 的get方法
     * @return String
     */
    public String getLinklineid(){
        return linklineid;
    }
	
    /**
     * 属性 linklineid 的set方法
     * @return
     */
    public void setLinklineid(String linklineid){
        this.linklineid = linklineid;
    } 
	
    /**
     * 属性 linklinename 的get方法
     * @return String
     */
    public String getLinklinename(){
        return linklinename;
    }
	
    /**
     * 属性 linklinename 的set方法
     * @return
     */
    public void setLinklinename(String linklinename){
        this.linklinename = linklinename;
    } 
	
    /**
     * 属性 buyeq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBuyeq(){
        return buyeq;
    }
	
    /**
     * 属性 buyeq 的set方法
     * @return
     */
    public void setBuyeq(BigDecimal buyeq){
        this.buyeq = buyeq;
    } 
	
    /**
     * 属性 spanprovinceeq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSpanprovinceeq(){
        return spanprovinceeq;
    }
	
    /**
     * 属性 spanprovinceeq 的set方法
     * @return
     */
    public void setSpanprovinceeq(BigDecimal spanprovinceeq){
        this.spanprovinceeq = spanprovinceeq;
    } 
	
    /**
     * 属性 spanareaeq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSpanareaeq(){
        return spanareaeq;
    }
	
    /**
     * 属性 spanareaeq 的set方法
     * @return
     */
    public void setSpanareaeq(BigDecimal spanareaeq){
        this.spanareaeq = spanareaeq;
    } 
	
    /**
     * 属性 longtimeeq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLongtimeeq(){
        return longtimeeq;
    }
	
    /**
     * 属性 longtimeeq 的set方法
     * @return
     */
    public void setLongtimeeq(BigDecimal longtimeeq){
        this.longtimeeq = longtimeeq;
    } 
	
    /**
     * 属性 shorttimeeq 的get方法
     * @return BigDecimal
     */
    public BigDecimal getShorttimeeq(){
        return shorttimeeq;
    }
	
    /**
     * 属性 shorttimeeq 的set方法
     * @return
     */
    public void setShorttimeeq(BigDecimal shorttimeeq){
        this.shorttimeeq = shorttimeeq;
    } 
	
    /**
     * 属性 reduceco2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getReduceco2(){
        return reduceco2;
    }
	
    /**
     * 属性 reduceco2 的set方法
     * @return
     */
    public void setReduceco2(BigDecimal reduceco2){
        this.reduceco2 = reduceco2;
    } 
	
    /**
     * 属性 reduceso2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getReduceso2(){
        return reduceso2;
    }
	
    /**
     * 属性 reduceso2 的set方法
     * @return
     */
    public void setReduceso2(BigDecimal reduceso2){
        this.reduceso2 = reduceso2;
    } 
	
    /**
     * 属性 economycoal 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEconomycoal(){
        return economycoal;
    }
	
    /**
     * 属性 economycoal 的set方法
     * @return
     */
    public void setEconomycoal(BigDecimal economycoal){
        this.economycoal = economycoal;
    } 
	
    /**
     * 属性 bakStr1 的get方法
     * @return String
     */
    public String getBakStr1(){
        return bakStr1;
    }
	
    /**
     * 属性 bakStr1 的set方法
     * @return
     */
    public void setBakStr1(String bakStr1){
        this.bakStr1 = bakStr1;
    } 
	
    /**
     * 属性 bakStr2 的get方法
     * @return String
     */
    public String getBakStr2(){
        return bakStr2;
    }
	
    /**
     * 属性 bakStr2 的set方法
     * @return
     */
    public void setBakStr2(String bakStr2){
        this.bakStr2 = bakStr2;
    } 
	
    /**
     * 属性 bakStr3 的get方法
     * @return String
     */
    public String getBakStr3(){
        return bakStr3;
    }
	
    /**
     * 属性 bakStr3 的set方法
     * @return
     */
    public void setBakStr3(String bakStr3){
        this.bakStr3 = bakStr3;
    } 
	
    /**
     * 属性 bakInt1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt1(){
        return bakInt1;
    }
	
    /**
     * 属性 bakInt1 的set方法
     * @return
     */
    public void setBakInt1(BigDecimal bakInt1){
        this.bakInt1 = bakInt1;
    } 
	
    /**
     * 属性 bakInt2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt2(){
        return bakInt2;
    }
	
    /**
     * 属性 bakInt2 的set方法
     * @return
     */
    public void setBakInt2(BigDecimal bakInt2){
        this.bakInt2 = bakInt2;
    } 
	
    /**
     * 属性 bakInt3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakInt3(){
        return bakInt3;
    }
	
    /**
     * 属性 bakInt3 的set方法
     * @return
     */
    public void setBakInt3(BigDecimal bakInt3){
        this.bakInt3 = bakInt3;
    } 
	
    /**
     * 属性 bakDouble1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble1(){
        return bakDouble1;
    }
	
    /**
     * 属性 bakDouble1 的set方法
     * @return
     */
    public void setBakDouble1(BigDecimal bakDouble1){
        this.bakDouble1 = bakDouble1;
    } 
	
    /**
     * 属性 bakDouble2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble2(){
        return bakDouble2;
    }
	
    /**
     * 属性 bakDouble2 的set方法
     * @return
     */
    public void setBakDouble2(BigDecimal bakDouble2){
        this.bakDouble2 = bakDouble2;
    } 
	
    /**
     * 属性 bakDouble3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBakDouble3(){
        return bakDouble3;
    }
	
    /**
     * 属性 bakDouble3 的set方法
     * @return
     */
    public void setBakDouble3(BigDecimal bakDouble3){
        this.bakDouble3 = bakDouble3;
    } 
	
    /**
     * 属性 bakDate1 的get方法
     * @return Date
     */
    public Date getBakDate1(){
        return bakDate1;
    }
	
    /**
     * 属性 bakDate1 的set方法
     * @return
     */
    public void setBakDate1(Date bakDate1){
        this.bakDate1 = bakDate1;
    } 
	
    /**
     * 属性 bakDate2 的get方法
     * @return Date
     */
    public Date getBakDate2(){
        return bakDate2;
    }
	
    /**
     * 属性 bakDate2 的set方法
     * @return
     */
    public void setBakDate2(Date bakDate2){
        this.bakDate2 = bakDate2;
    } 
	
    /**
     * 属性 bakDate3 的get方法
     * @return Date
     */
    public Date getBakDate3(){
        return bakDate3;
    }
	
    /**
     * 属性 bakDate3 的set方法
     * @return
     */
    public void setBakDate3(Date bakDate3){
        this.bakDate3 = bakDate3;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof PaOuterbuyeqAnalysisEp))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        PaOuterbuyeqAnalysisEp other = (PaOuterbuyeqAnalysisEp) o;	        
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
            .append("linklineid"+":"+getLinklineid())
            .append("linklinename"+":"+getLinklinename())
            .append("buyeq"+":"+getBuyeq())
            .append("spanprovinceeq"+":"+getSpanprovinceeq())
            .append("spanareaeq"+":"+getSpanareaeq())
            .append("longtimeeq"+":"+getLongtimeeq())
            .append("shorttimeeq"+":"+getShorttimeeq())
            .append("reduceco2"+":"+getReduceco2())
            .append("reduceso2"+":"+getReduceso2())
            .append("economycoal"+":"+getEconomycoal())
            .append("bakStr1"+":"+getBakStr1())
            .append("bakStr2"+":"+getBakStr2())
            .append("bakStr3"+":"+getBakStr3())
            .append("bakInt1"+":"+getBakInt1())
            .append("bakInt2"+":"+getBakInt2())
            .append("bakInt3"+":"+getBakInt3())
            .append("bakDouble1"+":"+getBakDouble1())
            .append("bakDouble2"+":"+getBakDouble2())
            .append("bakDouble3"+":"+getBakDouble3())
            .append("bakDate1"+":"+getBakDate1())
            .append("bakDate2"+":"+getBakDate2())
            .append("bakDate3"+":"+getBakDate3())
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