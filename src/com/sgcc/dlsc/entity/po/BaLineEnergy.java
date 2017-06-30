package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaLineEnergy的POJO类
 *
 * @author  Administrator  [Tue Jul 16 15:15:50 CST 2013]
 * 
 */
public class BaLineEnergy implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketcode
     */
    private String marketcode;
	
    /** 
     * 属性dateType
     */
    private BigDecimal dateType;
	
    /** 
     * 属性tabdate
     */
    private Date tabdate;
	
    /** 
     * 属性linename
     */
    private String linename;
	
    /** 
     * 属性lineid
     */
    private String lineid;
	
    /** 
     * 属性compositionname
     */
    private String compositionname;
	
    /** 
     * 属性compositionid
     */
    private String compositionid;
	
    /** 
     * 属性buyerid
     */
    private String buyerid;
	
    /** 
     * 属性saleerid
     */
    private String saleerid;
	
    /** 
     * 属性buypower
     */
    private BigDecimal buypower;
	
    /** 
     * 属性salepower
     */
    private BigDecimal salepower;
	
    /** 
     * 属性buyenergy
     */
    private BigDecimal buyenergy;
	
    /** 
     * 属性saleenergy
     */
    private BigDecimal saleenergy;
	
    /**
     * BaLineEnergy构造函数
     */
    public BaLineEnergy() {
        super();
    }  
	
    /**
     * BaLineEnergy完整的构造函数
     */  
    public BaLineEnergy(String guid,String marketcode,BigDecimal dateType,Date tabdate,String lineid,String compositionid){
        this.guid = guid;
        this.marketcode = marketcode;
        this.dateType = dateType;
        this.tabdate = tabdate;
        this.lineid = lineid;
        this.compositionid = compositionid;
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
     * 属性 dateType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDateType(){
        return dateType;
    }
	
    /**
     * 属性 dateType 的set方法
     * @return
     */
    public void setDateType(BigDecimal dateType){
        this.dateType = dateType;
    } 
	
    /**
     * 属性 tabdate 的get方法
     * @return Date
     */
    public Date getTabdate(){
        return tabdate;
    }
	
    /**
     * 属性 tabdate 的set方法
     * @return
     */
    public void setTabdate(Date tabdate){
        this.tabdate = tabdate;
    } 
	
    /**
     * 属性 linename 的get方法
     * @return String
     */
    public String getLinename(){
        return linename;
    }
	
    /**
     * 属性 linename 的set方法
     * @return
     */
    public void setLinename(String linename){
        this.linename = linename;
    } 
	
    /**
     * 属性 lineid 的get方法
     * @return String
     */
    public String getLineid(){
        return lineid;
    }
	
    /**
     * 属性 lineid 的set方法
     * @return
     */
    public void setLineid(String lineid){
        this.lineid = lineid;
    } 
	
    /**
     * 属性 compositionname 的get方法
     * @return String
     */
    public String getCompositionname(){
        return compositionname;
    }
	
    /**
     * 属性 compositionname 的set方法
     * @return
     */
    public void setCompositionname(String compositionname){
        this.compositionname = compositionname;
    } 
	
    /**
     * 属性 compositionid 的get方法
     * @return String
     */
    public String getCompositionid(){
        return compositionid;
    }
	
    /**
     * 属性 compositionid 的set方法
     * @return
     */
    public void setCompositionid(String compositionid){
        this.compositionid = compositionid;
    } 
	
    /**
     * 属性 buyerid 的get方法
     * @return String
     */
    public String getBuyerid(){
        return buyerid;
    }
	
    /**
     * 属性 buyerid 的set方法
     * @return
     */
    public void setBuyerid(String buyerid){
        this.buyerid = buyerid;
    } 
	
    /**
     * 属性 saleerid 的get方法
     * @return String
     */
    public String getSaleerid(){
        return saleerid;
    }
	
    /**
     * 属性 saleerid 的set方法
     * @return
     */
    public void setSaleerid(String saleerid){
        this.saleerid = saleerid;
    } 
	
    /**
     * 属性 buypower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBuypower(){
        return buypower;
    }
	
    /**
     * 属性 buypower 的set方法
     * @return
     */
    public void setBuypower(BigDecimal buypower){
        this.buypower = buypower;
    } 
	
    /**
     * 属性 salepower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSalepower(){
        return salepower;
    }
	
    /**
     * 属性 salepower 的set方法
     * @return
     */
    public void setSalepower(BigDecimal salepower){
        this.salepower = salepower;
    } 
	
    /**
     * 属性 buyenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBuyenergy(){
        return buyenergy;
    }
	
    /**
     * 属性 buyenergy 的set方法
     * @return
     */
    public void setBuyenergy(BigDecimal buyenergy){
        this.buyenergy = buyenergy;
    } 
	
    /**
     * 属性 saleenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleenergy(){
        return saleenergy;
    }
	
    /**
     * 属性 saleenergy 的set方法
     * @return
     */
    public void setSaleenergy(BigDecimal saleenergy){
        this.saleenergy = saleenergy;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaLineEnergy))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaLineEnergy other = (BaLineEnergy) o;	        
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
            .append("marketcode"+":"+getMarketcode())
            .append("dateType"+":"+getDateType())
            .append("tabdate"+":"+getTabdate())
            .append("linename"+":"+getLinename())
            .append("lineid"+":"+getLineid())
            .append("compositionname"+":"+getCompositionname())
            .append("compositionid"+":"+getCompositionid())
            .append("buyerid"+":"+getBuyerid())
            .append("saleerid"+":"+getSaleerid())
            .append("buypower"+":"+getBuypower())
            .append("salepower"+":"+getSalepower())
            .append("buyenergy"+":"+getBuyenergy())
            .append("saleenergy"+":"+getSaleenergy())
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