package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaDpowerElec的POJO类
 *
 * @author  Administrator  [Thu Aug 01 15:36:19 CST 2013]
 * 
 */
public class BaDpowerElec implements Serializable{

    /**
	 * 
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
     * 属性allcapacaity
     */
    private BigDecimal allcapacaity;
	
    /** 
     * 属性capacitySWa
     */
    private BigDecimal capacitySWa;
	
    /** 
     * 属性capacitySFi
     */
    private BigDecimal capacitySFi;
	
    /** 
     * 属性capacitySNu
     */
    private BigDecimal capacitySNu;
	
    /** 
     * 属性capacitySWi
     */
    private BigDecimal capacitySWi;
	
    /** 
     * 属性capacitySSu
     */
    private BigDecimal capacitySSu;
	
    /** 
     * 属性capacitySOt
     */
    private BigDecimal capacitySOt;
	
    /** 
     * 属性repaircapcity
     */
    private BigDecimal repaircapcity;
	
    /** 
     * 属性schedulerepaircapcity
     */
    private BigDecimal schedulerepaircapcity;
	
    /** 
     * 属性temprepaircapcity
     */
    private BigDecimal temprepaircapcity;
	
    /** 
     * 属性congetioncapcity
     */
    private BigDecimal congetioncapcity;
	
    /** 
     * 属性blockcapacityWa
     */
    private BigDecimal blockcapacityWa;
	
    /** 
     * 属性blockcapacityFi
     */
    private BigDecimal blockcapacityFi;
	
    /** 
     * 属性blockcapacityNu
     */
    private BigDecimal blockcapacityNu;
	
    /** 
     * 属性blockcapacityWi
     */
    private BigDecimal blockcapacityWi;
	
    /** 
     * 属性blockcapacitySu
     */
    private BigDecimal blockcapacitySu;
	
    /** 
     * 属性blockcapacityOt
     */
    private BigDecimal blockcapacityOt;
	
    /** 
     * 属性adjustcapacity
     */
    private BigDecimal adjustcapacity;
	
    /** 
     * 属性elecsurplus
     */
    private BigDecimal elecsurplus;
	
    /** 
     * 属性buyenergy
     */
    private BigDecimal buyenergy;
	
    /** 
     * 属性saleenergy
     */
    private BigDecimal saleenergy;
	
    /** 
     * 属性powersurplus
     */
    private BigDecimal powersurplus;
	
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
     * 属性unifyqty
     */
    private BigDecimal unifyqty;
	
    /** 
     * 属性transload
     */
    private BigDecimal transload;
	
    /** 
     * 属性transmangerqty
     */
    private BigDecimal transmangerqty;
	
    /** 
     * 属性coldstandby
     */
    private BigDecimal coldstandby;
	
    /** 
     * 属性remark
     */
    private String remark;
	
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
     * 属性issueddate
     */
    private Date issueddate;
	
    /** 
     * 属性dsFlag
     */
    private String dsFlag;
	
    /**
     * BaDpowerElec构造函数
     */
    public BaDpowerElec() {
        super();
    }  
	
    /**
     * BaDpowerElec完整的构造函数
     */  
    public BaDpowerElec(String guid,String marketcode,Date tabDate,String dsFlag){
        this.guid = guid;
        this.marketcode = marketcode;
        this.tabDate = tabDate;
        this.dsFlag = dsFlag;
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
     * 属性 allcapacaity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAllcapacaity(){
        return allcapacaity;
    }
	
    /**
     * 属性 allcapacaity 的set方法
     * @return
     */
    public void setAllcapacaity(BigDecimal allcapacaity){
        this.allcapacaity = allcapacaity;
    } 
	
    /**
     * 属性 capacitySWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacitySWa(){
        return capacitySWa;
    }
	
    /**
     * 属性 capacitySWa 的set方法
     * @return
     */
    public void setCapacitySWa(BigDecimal capacitySWa){
        this.capacitySWa = capacitySWa;
    } 
	
    /**
     * 属性 capacitySFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacitySFi(){
        return capacitySFi;
    }
	
    /**
     * 属性 capacitySFi 的set方法
     * @return
     */
    public void setCapacitySFi(BigDecimal capacitySFi){
        this.capacitySFi = capacitySFi;
    } 
	
    /**
     * 属性 capacitySNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacitySNu(){
        return capacitySNu;
    }
	
    /**
     * 属性 capacitySNu 的set方法
     * @return
     */
    public void setCapacitySNu(BigDecimal capacitySNu){
        this.capacitySNu = capacitySNu;
    } 
	
    /**
     * 属性 capacitySWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacitySWi(){
        return capacitySWi;
    }
	
    /**
     * 属性 capacitySWi 的set方法
     * @return
     */
    public void setCapacitySWi(BigDecimal capacitySWi){
        this.capacitySWi = capacitySWi;
    } 
	
    /**
     * 属性 capacitySSu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacitySSu(){
        return capacitySSu;
    }
	
    /**
     * 属性 capacitySSu 的set方法
     * @return
     */
    public void setCapacitySSu(BigDecimal capacitySSu){
        this.capacitySSu = capacitySSu;
    } 
	
    /**
     * 属性 capacitySOt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacitySOt(){
        return capacitySOt;
    }
	
    /**
     * 属性 capacitySOt 的set方法
     * @return
     */
    public void setCapacitySOt(BigDecimal capacitySOt){
        this.capacitySOt = capacitySOt;
    } 
	
    /**
     * 属性 repaircapcity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRepaircapcity(){
        return repaircapcity;
    }
	
    /**
     * 属性 repaircapcity 的set方法
     * @return
     */
    public void setRepaircapcity(BigDecimal repaircapcity){
        this.repaircapcity = repaircapcity;
    } 
	
    /**
     * 属性 schedulerepaircapcity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSchedulerepaircapcity(){
        return schedulerepaircapcity;
    }
	
    /**
     * 属性 schedulerepaircapcity 的set方法
     * @return
     */
    public void setSchedulerepaircapcity(BigDecimal schedulerepaircapcity){
        this.schedulerepaircapcity = schedulerepaircapcity;
    } 
	
    /**
     * 属性 temprepaircapcity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTemprepaircapcity(){
        return temprepaircapcity;
    }
	
    /**
     * 属性 temprepaircapcity 的set方法
     * @return
     */
    public void setTemprepaircapcity(BigDecimal temprepaircapcity){
        this.temprepaircapcity = temprepaircapcity;
    } 
	
    /**
     * 属性 congetioncapcity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCongetioncapcity(){
        return congetioncapcity;
    }
	
    /**
     * 属性 congetioncapcity 的set方法
     * @return
     */
    public void setCongetioncapcity(BigDecimal congetioncapcity){
        this.congetioncapcity = congetioncapcity;
    } 
	
    /**
     * 属性 blockcapacityWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityWa(){
        return blockcapacityWa;
    }
	
    /**
     * 属性 blockcapacityWa 的set方法
     * @return
     */
    public void setBlockcapacityWa(BigDecimal blockcapacityWa){
        this.blockcapacityWa = blockcapacityWa;
    } 
	
    /**
     * 属性 blockcapacityFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityFi(){
        return blockcapacityFi;
    }
	
    /**
     * 属性 blockcapacityFi 的set方法
     * @return
     */
    public void setBlockcapacityFi(BigDecimal blockcapacityFi){
        this.blockcapacityFi = blockcapacityFi;
    } 
	
    /**
     * 属性 blockcapacityNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityNu(){
        return blockcapacityNu;
    }
	
    /**
     * 属性 blockcapacityNu 的set方法
     * @return
     */
    public void setBlockcapacityNu(BigDecimal blockcapacityNu){
        this.blockcapacityNu = blockcapacityNu;
    } 
	
    /**
     * 属性 blockcapacityWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityWi(){
        return blockcapacityWi;
    }
	
    /**
     * 属性 blockcapacityWi 的set方法
     * @return
     */
    public void setBlockcapacityWi(BigDecimal blockcapacityWi){
        this.blockcapacityWi = blockcapacityWi;
    } 
	
    /**
     * 属性 blockcapacitySu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacitySu(){
        return blockcapacitySu;
    }
	
    /**
     * 属性 blockcapacitySu 的set方法
     * @return
     */
    public void setBlockcapacitySu(BigDecimal blockcapacitySu){
        this.blockcapacitySu = blockcapacitySu;
    } 
	
    /**
     * 属性 blockcapacityOt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityOt(){
        return blockcapacityOt;
    }
	
    /**
     * 属性 blockcapacityOt 的set方法
     * @return
     */
    public void setBlockcapacityOt(BigDecimal blockcapacityOt){
        this.blockcapacityOt = blockcapacityOt;
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
     * 属性 unifyqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getUnifyqty(){
        return unifyqty;
    }
	
    /**
     * 属性 unifyqty 的set方法
     * @return
     */
    public void setUnifyqty(BigDecimal unifyqty){
        this.unifyqty = unifyqty;
    } 
	
    /**
     * 属性 transload 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTransload(){
        return transload;
    }
	
    /**
     * 属性 transload 的set方法
     * @return
     */
    public void setTransload(BigDecimal transload){
        this.transload = transload;
    } 
	
    /**
     * 属性 transmangerqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTransmangerqty(){
        return transmangerqty;
    }
	
    /**
     * 属性 transmangerqty 的set方法
     * @return
     */
    public void setTransmangerqty(BigDecimal transmangerqty){
        this.transmangerqty = transmangerqty;
    } 
	
    /**
     * 属性 coldstandby 的get方法
     * @return BigDecimal
     */
    public BigDecimal getColdstandby(){
        return coldstandby;
    }
	
    /**
     * 属性 coldstandby 的set方法
     * @return
     */
    public void setColdstandby(BigDecimal coldstandby){
        this.coldstandby = coldstandby;
    } 
	
    /**
     * 属性 remark 的get方法
     * @return String
     */
    public String getRemark(){
        return remark;
    }
	
    /**
     * 属性 remark 的set方法
     * @return
     */
    public void setRemark(String remark){
        this.remark = remark;
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
     * 属性 dsFlag 的get方法
     * @return String
     */
    public String getDsFlag(){
        return dsFlag;
    }
	
    /**
     * 属性 dsFlag 的set方法
     * @return
     */
    public void setDsFlag(String dsFlag){
        this.dsFlag = dsFlag;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaDpowerElec))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaDpowerElec other = (BaDpowerElec) o;	        
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
            .append("allcapacaity"+":"+getAllcapacaity())
            .append("capacitySWa"+":"+getCapacitySWa())
            .append("capacitySFi"+":"+getCapacitySFi())
            .append("capacitySNu"+":"+getCapacitySNu())
            .append("capacitySWi"+":"+getCapacitySWi())
            .append("capacitySSu"+":"+getCapacitySSu())
            .append("capacitySOt"+":"+getCapacitySOt())
            .append("repaircapcity"+":"+getRepaircapcity())
            .append("schedulerepaircapcity"+":"+getSchedulerepaircapcity())
            .append("temprepaircapcity"+":"+getTemprepaircapcity())
            .append("congetioncapcity"+":"+getCongetioncapcity())
            .append("blockcapacityWa"+":"+getBlockcapacityWa())
            .append("blockcapacityFi"+":"+getBlockcapacityFi())
            .append("blockcapacityNu"+":"+getBlockcapacityNu())
            .append("blockcapacityWi"+":"+getBlockcapacityWi())
            .append("blockcapacitySu"+":"+getBlockcapacitySu())
            .append("blockcapacityOt"+":"+getBlockcapacityOt())
            .append("adjustcapacity"+":"+getAdjustcapacity())
            .append("elecsurplus"+":"+getElecsurplus())
            .append("buyenergy"+":"+getBuyenergy())
            .append("saleenergy"+":"+getSaleenergy())
            .append("powersurplus"+":"+getPowersurplus())
            .append("buypower"+":"+getBuypower())
            .append("salepower"+":"+getSalepower())
            .append("iadjustcapacity"+":"+getIadjustcapacity())
            .append("backcapacity"+":"+getBackcapacity())
            .append("maxdemand"+":"+getMaxdemand())
            .append("unifyqty"+":"+getUnifyqty())
            .append("transload"+":"+getTransload())
            .append("transmangerqty"+":"+getTransmangerqty())
            .append("coldstandby"+":"+getColdstandby())
            .append("remark"+":"+getRemark())
            .append("version"+":"+getVersion())
            .append("newversion"+":"+getNewversion())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("updatetime"+":"+getUpdatetime())
            .append("versiondesc"+":"+getVersiondesc())
            .append("issueddate"+":"+getIssueddate())
            .append("dsFlag"+":"+getDsFlag())
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