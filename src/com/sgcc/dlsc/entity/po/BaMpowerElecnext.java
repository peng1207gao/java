package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaMpowerElecnext的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:34:14 CST 2013]
 * 
 */
public class BaMpowerElecnext implements Serializable{

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
     * 属性tabDate
     */
    private Date tabDate;
	
    /** 
     * 属性capacaity
     */
    private BigDecimal capacaity;
	
    /** 
     * 属性avgplanfixcapacity
     */
    private BigDecimal avgplanfixcapacity;
	
    /** 
     * 属性avgblockcapacity
     */
    private BigDecimal avgblockcapacity;
	
    /** 
     * 属性adjustcapacity
     */
    private BigDecimal adjustcapacity;
	
    /** 
     * 属性buypower
     */
    private BigDecimal buypower;
	
    /** 
     * 属性salepower
     */
    private BigDecimal salepower;
	
    /** 
     * 属性iadjustcapacity
     */
    private BigDecimal iadjustcapacity;
	
    /** 
     * 属性backcapacity
     */
    private BigDecimal backcapacity;
	
    /** 
     * 属性maxdemand
     */
    private BigDecimal maxdemand;
	
    /** 
     * 属性powersurplus
     */
    private BigDecimal powersurplus;
	
    /** 
     * 属性usingdemand
     */
    private BigDecimal usingdemand;
	
    /** 
     * 属性generateelec
     */
    private BigDecimal generateelec;
	
    /** 
     * 属性buyelec
     */
    private BigDecimal buyelec;
	
    /** 
     * 属性saleelec
     */
    private BigDecimal saleelec;
	
    /** 
     * 属性isupplyelec
     */
    private BigDecimal isupplyelec;
	
    /** 
     * 属性elecsurplus
     */
    private BigDecimal elecsurplus;
	
    /** 
     * 属性balanceanalyse
     */
    private String balanceanalyse;
	
    /** 
     * 属性version
     */
    private BigDecimal version;
	
    /** 
     * 属性newversion
     */
    private BigDecimal newversion;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性versiondesc
     */
    private String versiondesc;
	
    /** 
     * 属性baType
     */
    private BigDecimal baType;
	
    /** 
     * 属性issueddate
     */
    private Date issueddate;
	
    /** 
     * 属性perreserve
     */
    private BigDecimal perreserve;
	
    /**
     * BaMpowerElecnext构造函数
     */
    public BaMpowerElecnext() {
        super();
    }  
	
    /**
     * BaMpowerElecnext完整的构造函数
     */  
    public BaMpowerElecnext(String guid,String marketcode,Date tabDate){
        this.guid = guid;
        this.marketcode = marketcode;
        this.tabDate = tabDate;
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
     * 属性 tabDate 的get方法
     * @return Date
     */
    public Date getTabDate(){
        return tabDate;
    }
	
    /**
     * 属性 tabDate 的set方法
     * @return
     */
    public void setTabDate(Date tabDate){
        this.tabDate = tabDate;
    } 
	
    /**
     * 属性 capacaity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacaity(){
        return capacaity;
    }
	
    /**
     * 属性 capacaity 的set方法
     * @return
     */
    public void setCapacaity(BigDecimal capacaity){
        this.capacaity = capacaity;
    } 
	
    /**
     * 属性 avgplanfixcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAvgplanfixcapacity(){
        return avgplanfixcapacity;
    }
	
    /**
     * 属性 avgplanfixcapacity 的set方法
     * @return
     */
    public void setAvgplanfixcapacity(BigDecimal avgplanfixcapacity){
        this.avgplanfixcapacity = avgplanfixcapacity;
    } 
	
    /**
     * 属性 avgblockcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAvgblockcapacity(){
        return avgblockcapacity;
    }
	
    /**
     * 属性 avgblockcapacity 的set方法
     * @return
     */
    public void setAvgblockcapacity(BigDecimal avgblockcapacity){
        this.avgblockcapacity = avgblockcapacity;
    } 
	
    /**
     * 属性 adjustcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAdjustcapacity(){
        return adjustcapacity;
    }
	
    /**
     * 属性 adjustcapacity 的set方法
     * @return
     */
    public void setAdjustcapacity(BigDecimal adjustcapacity){
        this.adjustcapacity = adjustcapacity;
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
     * 属性 iadjustcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIadjustcapacity(){
        return iadjustcapacity;
    }
	
    /**
     * 属性 iadjustcapacity 的set方法
     * @return
     */
    public void setIadjustcapacity(BigDecimal iadjustcapacity){
        this.iadjustcapacity = iadjustcapacity;
    } 
	
    /**
     * 属性 backcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackcapacity(){
        return backcapacity;
    }
	
    /**
     * 属性 backcapacity 的set方法
     * @return
     */
    public void setBackcapacity(BigDecimal backcapacity){
        this.backcapacity = backcapacity;
    } 
	
    /**
     * 属性 maxdemand 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxdemand(){
        return maxdemand;
    }
	
    /**
     * 属性 maxdemand 的set方法
     * @return
     */
    public void setMaxdemand(BigDecimal maxdemand){
        this.maxdemand = maxdemand;
    } 
	
    /**
     * 属性 powersurplus 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPowersurplus(){
        return powersurplus;
    }
	
    /**
     * 属性 powersurplus 的set方法
     * @return
     */
    public void setPowersurplus(BigDecimal powersurplus){
        this.powersurplus = powersurplus;
    } 
	
    /**
     * 属性 usingdemand 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUsingdemand(){
        return usingdemand;
    }
	
    /**
     * 属性 usingdemand 的set方法
     * @return
     */
    public void setUsingdemand(BigDecimal usingdemand){
        this.usingdemand = usingdemand;
    } 
	
    /**
     * 属性 generateelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelec(){
        return generateelec;
    }
	
    /**
     * 属性 generateelec 的set方法
     * @return
     */
    public void setGenerateelec(BigDecimal generateelec){
        this.generateelec = generateelec;
    } 
	
    /**
     * 属性 buyelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBuyelec(){
        return buyelec;
    }
	
    /**
     * 属性 buyelec 的set方法
     * @return
     */
    public void setBuyelec(BigDecimal buyelec){
        this.buyelec = buyelec;
    } 
	
    /**
     * 属性 saleelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleelec(){
        return saleelec;
    }
	
    /**
     * 属性 saleelec 的set方法
     * @return
     */
    public void setSaleelec(BigDecimal saleelec){
        this.saleelec = saleelec;
    } 
	
    /**
     * 属性 isupplyelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsupplyelec(){
        return isupplyelec;
    }
	
    /**
     * 属性 isupplyelec 的set方法
     * @return
     */
    public void setIsupplyelec(BigDecimal isupplyelec){
        this.isupplyelec = isupplyelec;
    } 
	
    /**
     * 属性 elecsurplus 的get方法
     * @return BigDecimal
     */
    public BigDecimal getElecsurplus(){
        return elecsurplus;
    }
	
    /**
     * 属性 elecsurplus 的set方法
     * @return
     */
    public void setElecsurplus(BigDecimal elecsurplus){
        this.elecsurplus = elecsurplus;
    } 
	
    /**
     * 属性 balanceanalyse 的get方法
     * @return String
     */
    public String getBalanceanalyse(){
        return balanceanalyse;
    }
	
    /**
     * 属性 balanceanalyse 的set方法
     * @return
     */
    public void setBalanceanalyse(String balanceanalyse){
        this.balanceanalyse = balanceanalyse;
    } 
	
    /**
     * 属性 version 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVersion(){
        return version;
    }
	
    /**
     * 属性 version 的set方法
     * @return
     */
    public void setVersion(BigDecimal version){
        this.version = version;
    } 
	
    /**
     * 属性 newversion 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNewversion(){
        return newversion;
    }
	
    /**
     * 属性 newversion 的set方法
     * @return
     */
    public void setNewversion(BigDecimal newversion){
        this.newversion = newversion;
    } 
	
    /**
     * 属性 updatepersonid 的get方法
     * @return String
     */
    public String getUpdatepersonid(){
        return updatepersonid;
    }
	
    /**
     * 属性 updatepersonid 的set方法
     * @return
     */
    public void setUpdatepersonid(String updatepersonid){
        this.updatepersonid = updatepersonid;
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
     * 属性 versiondesc 的get方法
     * @return String
     */
    public String getVersiondesc(){
        return versiondesc;
    }
	
    /**
     * 属性 versiondesc 的set方法
     * @return
     */
    public void setVersiondesc(String versiondesc){
        this.versiondesc = versiondesc;
    } 
	
    /**
     * 属性 baType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBaType(){
        return baType;
    }
	
    /**
     * 属性 baType 的set方法
     * @return
     */
    public void setBaType(BigDecimal baType){
        this.baType = baType;
    } 
	
    /**
     * 属性 issueddate 的get方法
     * @return Date
     */
    public Date getIssueddate(){
        return issueddate;
    }
	
    /**
     * 属性 issueddate 的set方法
     * @return
     */
    public void setIssueddate(Date issueddate){
        this.issueddate = issueddate;
    } 
	
    /**
     * 属性 perreserve 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPerreserve(){
        return perreserve;
    }
	
    /**
     * 属性 perreserve 的set方法
     * @return
     */
    public void setPerreserve(BigDecimal perreserve){
        this.perreserve = perreserve;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaMpowerElecnext))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaMpowerElecnext other = (BaMpowerElecnext) o;	        
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
            .append("tabDate"+":"+getTabDate())
            .append("capacaity"+":"+getCapacaity())
            .append("avgplanfixcapacity"+":"+getAvgplanfixcapacity())
            .append("avgblockcapacity"+":"+getAvgblockcapacity())
            .append("adjustcapacity"+":"+getAdjustcapacity())
            .append("buypower"+":"+getBuypower())
            .append("salepower"+":"+getSalepower())
            .append("iadjustcapacity"+":"+getIadjustcapacity())
            .append("backcapacity"+":"+getBackcapacity())
            .append("maxdemand"+":"+getMaxdemand())
            .append("powersurplus"+":"+getPowersurplus())
            .append("usingdemand"+":"+getUsingdemand())
            .append("generateelec"+":"+getGenerateelec())
            .append("buyelec"+":"+getBuyelec())
            .append("saleelec"+":"+getSaleelec())
            .append("isupplyelec"+":"+getIsupplyelec())
            .append("elecsurplus"+":"+getElecsurplus())
            .append("balanceanalyse"+":"+getBalanceanalyse())
            .append("version"+":"+getVersion())
            .append("newversion"+":"+getNewversion())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("updatetime"+":"+getUpdatetime())
            .append("versiondesc"+":"+getVersiondesc())
            .append("baType"+":"+getBaType())
            .append("issueddate"+":"+getIssueddate())
            .append("perreserve"+":"+getPerreserve())
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