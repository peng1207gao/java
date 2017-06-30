package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * Plantdatequantityinformation的POJO类
 *
 * @author  Administrator  [Sat Jun 15 14:49:14 CST 2013]
 * 
 */
public class Plantdatequantityinformation implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性unitid
     */
    private String unitid;
	
    /** 
     * 属性infoid
     */
    private String infoid;
	
    /** 
     * 属性netqty
     */
    private BigDecimal netqty;
	
    /** 
     * 属性settdate
     */
    private Date settdate;
	
    /** 
     * 属性genqty
     */
    private BigDecimal genqty;
	
    /** 
     * 属性price
     */
    private BigDecimal price;
	
    /** 
     * 属性pricetype
     */
    private String pricetype;
	
    /** 
     * 属性fee
     */
    private BigDecimal fee;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性exflag
     */
    private BigDecimal exflag;
	
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
     * Plantdatequantityinformation构造函数
     */
    public Plantdatequantityinformation() {
        super();
    }  
	
    /**
     * Plantdatequantityinformation完整的构造函数
     */  
    public Plantdatequantityinformation(String unitid,String infoid,BigDecimal netqty,Date settdate,BigDecimal genqty,BigDecimal price,BigDecimal exflag){
        this.unitid = unitid;
        this.infoid = infoid;
        this.netqty = netqty;
        this.settdate = settdate;
        this.genqty = genqty;
        this.price = price;
        this.exflag = exflag;
    }
 
    /**
     * 属性 unitid 的get方法
     * @return String
     */
    public String getUnitid(){
        return unitid;
    }
	
    /**
     * 属性 unitid 的set方法
     * @return
     */
    public void setUnitid(String unitid){
        if(unitid != null && unitid.trim().length() == 0){
            this.unitid = null;
        }else{
            this.unitid = unitid;
        }
    } 
	
    /**
     * 属性 infoid 的get方法
     * @return String
     */
    public String getInfoid(){
        return infoid;
    }
	
    /**
     * 属性 infoid 的set方法
     * @return
     */
    public void setInfoid(String infoid){
        this.infoid = infoid;
    } 
	
    /**
     * 属性 netqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetqty(){
        return netqty;
    }
	
    /**
     * 属性 netqty 的set方法
     * @return
     */
    public void setNetqty(BigDecimal netqty){
        this.netqty = netqty;
    } 
	
    /**
     * 属性 settdate 的get方法
     * @return Date
     */
    public Date getSettdate(){
        return settdate;
    }
	
    /**
     * 属性 settdate 的set方法
     * @return
     */
    public void setSettdate(Date settdate){
        this.settdate = settdate;
    } 
	
    /**
     * 属性 genqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenqty(){
        return genqty;
    }
	
    /**
     * 属性 genqty 的set方法
     * @return
     */
    public void setGenqty(BigDecimal genqty){
        this.genqty = genqty;
    } 
	
    /**
     * 属性 price 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrice(){
        return price;
    }
	
    /**
     * 属性 price 的set方法
     * @return
     */
    public void setPrice(BigDecimal price){
        this.price = price;
    } 
	
    /**
     * 属性 pricetype 的get方法
     * @return String
     */
    public String getPricetype(){
        return pricetype;
    }
	
    /**
     * 属性 pricetype 的set方法
     * @return
     */
    public void setPricetype(String pricetype){
        this.pricetype = pricetype;
    } 
	
    /**
     * 属性 fee 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFee(){
        return fee;
    }
	
    /**
     * 属性 fee 的set方法
     * @return
     */
    public void setFee(BigDecimal fee){
        this.fee = fee;
    } 
	
    /**
     * 属性 updatetime 的get方法
     * @return Date
     */
    public Date getUpdatetime(){
        return updatetime;
    }
	
    /**
     * 属性 updatetime 的set方法
     * @return
     */
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
    } 
	
    /**
     * 属性 exflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getExflag(){
        return exflag;
    }
	
    /**
     * 属性 exflag 的set方法
     * @return
     */
    public void setExflag(BigDecimal exflag){
        this.exflag = exflag;
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
		
        if (o == null || !(o instanceof Plantdatequantityinformation))
	        return false; 
			
        if(getUnitid() == null) 
	        return false;

        Plantdatequantityinformation other = (Plantdatequantityinformation) o;	        
	    return new EqualsBuilder()
            .append(this.getUnitid(), other.getUnitid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("unitid"+":"+getUnitid())
            .append("infoid"+":"+getInfoid())
            .append("netqty"+":"+getNetqty())
            .append("settdate"+":"+getSettdate())
            .append("genqty"+":"+getGenqty())
            .append("price"+":"+getPrice())
            .append("pricetype"+":"+getPricetype())
            .append("fee"+":"+getFee())
            .append("updatetime"+":"+getUpdatetime())
            .append("exflag"+":"+getExflag())
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