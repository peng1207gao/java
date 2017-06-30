package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaElecnext的POJO类
 *
 * @author  Administrator  [Wed Jul 17 16:29:10 CST 2013]
 * 
 */
public class BaElecnext implements Serializable{

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
     * 属性tabDate
     */
    private Date tabDate;
	
    /** 
     * 属性capacityS
     */
    private BigDecimal capacityS;
	
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
     * 属性capacityN
     */
    private BigDecimal capacityN;
	
    /** 
     * 属性capacityNWa
     */
    private BigDecimal capacityNWa;
	
    /** 
     * 属性capacityNFi
     */
    private BigDecimal capacityNFi;
	
    /** 
     * 属性capacityNNu
     */
    private BigDecimal capacityNNu;
	
    /** 
     * 属性capacityNWi
     */
    private BigDecimal capacityNWi;
	
    /** 
     * 属性capacityNSu
     */
    private BigDecimal capacityNSu;
	
    /** 
     * 属性capacityNOt
     */
    private BigDecimal capacityNOt;
	
    /** 
     * 属性capacityR
     */
    private BigDecimal capacityR;
	
    /** 
     * 属性capacityRWa
     */
    private BigDecimal capacityRWa;
	
    /** 
     * 属性capacityRFi
     */
    private BigDecimal capacityRFi;
	
    /** 
     * 属性capacityRNu
     */
    private BigDecimal capacityRNu;
	
    /** 
     * 属性capacityRWi
     */
    private BigDecimal capacityRWi;
	
    /** 
     * 属性capacityRSu
     */
    private BigDecimal capacityRSu;
	
    /** 
     * 属性capacityROt
     */
    private BigDecimal capacityROt;
	
    /** 
     * 属性planfixcapacity
     */
    private BigDecimal planfixcapacity;
	
    /** 
     * 属性planfixcapacityWa
     */
    private BigDecimal planfixcapacityWa;
	
    /** 
     * 属性planfixcapacityFi
     */
    private BigDecimal planfixcapacityFi;
	
    /** 
     * 属性planfixcapacityNu
     */
    private BigDecimal planfixcapacityNu;
	
    /** 
     * 属性planfixcapacityWi
     */
    private BigDecimal planfixcapacityWi;
	
    /** 
     * 属性planfixcapacitySu
     */
    private BigDecimal planfixcapacitySu;
	
    /** 
     * 属性planfixcapacityOt
     */
    private BigDecimal planfixcapacityOt;
	
    /** 
     * 属性actualfixcapacity
     */
    private BigDecimal actualfixcapacity;
	
    /** 
     * 属性actualfixcapacityWa
     */
    private BigDecimal actualfixcapacityWa;
	
    /** 
     * 属性actualfixcapacityFi
     */
    private BigDecimal actualfixcapacityFi;
	
    /** 
     * 属性actualfixcapacityNu
     */
    private BigDecimal actualfixcapacityNu;
	
    /** 
     * 属性actualfixcapacityWi
     */
    private BigDecimal actualfixcapacityWi;
	
    /** 
     * 属性actualfixcapacitySu
     */
    private BigDecimal actualfixcapacitySu;
	
    /** 
     * 属性actualfixcapacityOt
     */
    private BigDecimal actualfixcapacityOt;
	
    /** 
     * 属性blockcapacity
     */
    private BigDecimal blockcapacity;
	
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
     * 属性blockcapacityN
     */
    private BigDecimal blockcapacityN;
	
    /** 
     * 属性blockcapacityP
     */
    private BigDecimal blockcapacityP;
	
    /** 
     * 属性blockcapacityFu
     */
    private BigDecimal blockcapacityFu;
	
    /** 
     * 属性blockcapacityC
     */
    private BigDecimal blockcapacityC;
	
    /** 
     * 属性blockcapacityG
     */
    private BigDecimal blockcapacityG;
	
    /** 
     * 属性blockcapacityH
     */
    private BigDecimal blockcapacityH;
	
    /** 
     * 属性freepacity
     */
    private BigDecimal freepacity;
	
    /** 
     * 属性perreserve
     */
    private BigDecimal perreserve;
	
    /** 
     * 属性backcapacity
     */
    private BigDecimal backcapacity;
	
    /** 
     * 属性coldstandby
     */
    private BigDecimal coldstandby;
	
    /** 
     * 属性realreserve
     */
    private BigDecimal realreserve;
	
    /** 
     * 属性adjustcapacity
     */
    private BigDecimal adjustcapacity;
	
    /** 
     * 属性iadjustcapacity
     */
    private BigDecimal iadjustcapacity;
	
    /** 
     * 属性generateelec
     */
    private BigDecimal generateelec;
	
    /** 
     * 属性generateelecWa
     */
    private BigDecimal generateelecWa;
	
    /** 
     * 属性generateelecFi
     */
    private BigDecimal generateelecFi;
	
    /** 
     * 属性generateelecNu
     */
    private BigDecimal generateelecNu;
	
    /** 
     * 属性generateelecWi
     */
    private BigDecimal generateelecWi;
	
    /** 
     * 属性generateelecSu
     */
    private BigDecimal generateelecSu;
	
    /** 
     * 属性generateelecOt
     */
    private BigDecimal generateelecOt;
	
    /** 
     * 属性energy
     */
    private BigDecimal energy;
	
    /** 
     * 属性buyenergy
     */
    private BigDecimal buyenergy;
	
    /** 
     * 属性saleenergy
     */
    private BigDecimal saleenergy;
	
    /** 
     * 属性power
     */
    private BigDecimal power;
	
    /** 
     * 属性buypower
     */
    private BigDecimal buypower;
	
    /** 
     * 属性salepower
     */
    private BigDecimal salepower;
	
    /** 
     * 属性usingdemand
     */
    private BigDecimal usingdemand;
	
    /** 
     * 属性maxdemand
     */
    private BigDecimal maxdemand;
	
    /** 
     * 属性unifyqty
     */
    private BigDecimal unifyqty;
	
    /** 
     * 属性allunifyqty
     */
    private BigDecimal allunifyqty;
	
    /** 
     * 属性powersurplus
     */
    private BigDecimal powersurplus;
	
    /** 
     * 属性elecsurplus
     */
    private BigDecimal elecsurplus;
	
    /** 
     * 属性lineenergy
     */
    private BigDecimal lineenergy;
	
    /** 
     * 属性linepower
     */
    private BigDecimal linepower;
	
    /** 
     * 属性serpower
     */
    private BigDecimal serpower;
	
    /** 
     * 属性serenergy
     */
    private BigDecimal serenergy;
	
    /** 
     * 属性serenergyWa
     */
    private BigDecimal serenergyWa;
	
    /** 
     * 属性serenergyFi
     */
    private BigDecimal serenergyFi;
	
    /** 
     * 属性serenergyNu
     */
    private BigDecimal serenergyNu;
	
    /** 
     * 属性serenergyWi
     */
    private BigDecimal serenergyWi;
	
    /** 
     * 属性serenergySu
     */
    private BigDecimal serenergySu;
	
    /** 
     * 属性serenergyOt
     */
    private BigDecimal serenergyOt;
	
    /** 
     * 属性maxpullpower
     */
    private BigDecimal maxpullpower;
	
    /** 
     * 属性maxlimitpower
     */
    private BigDecimal maxlimitpower;
	
    /** 
     * 属性pullelec
     */
    private BigDecimal pullelec;
	
    /** 
     * 属性limitelec
     */
    private BigDecimal limitelec;
	
    /** 
     * 属性cfpower
     */
    private BigDecimal cfpower;
	
    /** 
     * 属性bfpower
     */
    private BigDecimal bfpower;
	
    /** 
     * 属性cfelec
     */
    private BigDecimal cfelec;
	
    /** 
     * 属性bfelec
     */
    private BigDecimal bfelec;
	
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
     * BaElecnext构造函数
     */
    public BaElecnext() {
        super();
    }  
	
    /**
     * BaElecnext完整的构造函数
     */  
    public BaElecnext(String guid,String marketcode,BigDecimal dateType,Date tabDate){
        this.guid = guid;
        this.marketcode = marketcode;
        this.dateType = dateType;
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
     * 属性 capacityS 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityS(){
        return capacityS;
    }
	
    /**
     * 属性 capacityS 的set方法
     * @return
     */
    public void setCapacityS(BigDecimal capacityS){
        this.capacityS = capacityS;
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
     * 属性 capacityN 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityN(){
        return capacityN;
    }
	
    /**
     * 属性 capacityN 的set方法
     * @return
     */
    public void setCapacityN(BigDecimal capacityN){
        this.capacityN = capacityN;
    } 
	
    /**
     * 属性 capacityNWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityNWa(){
        return capacityNWa;
    }
	
    /**
     * 属性 capacityNWa 的set方法
     * @return
     */
    public void setCapacityNWa(BigDecimal capacityNWa){
        this.capacityNWa = capacityNWa;
    } 
	
    /**
     * 属性 capacityNFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityNFi(){
        return capacityNFi;
    }
	
    /**
     * 属性 capacityNFi 的set方法
     * @return
     */
    public void setCapacityNFi(BigDecimal capacityNFi){
        this.capacityNFi = capacityNFi;
    } 
	
    /**
     * 属性 capacityNNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityNNu(){
        return capacityNNu;
    }
	
    /**
     * 属性 capacityNNu 的set方法
     * @return
     */
    public void setCapacityNNu(BigDecimal capacityNNu){
        this.capacityNNu = capacityNNu;
    } 
	
    /**
     * 属性 capacityNWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityNWi(){
        return capacityNWi;
    }
	
    /**
     * 属性 capacityNWi 的set方法
     * @return
     */
    public void setCapacityNWi(BigDecimal capacityNWi){
        this.capacityNWi = capacityNWi;
    } 
	
    /**
     * 属性 capacityNSu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityNSu(){
        return capacityNSu;
    }
	
    /**
     * 属性 capacityNSu 的set方法
     * @return
     */
    public void setCapacityNSu(BigDecimal capacityNSu){
        this.capacityNSu = capacityNSu;
    } 
	
    /**
     * 属性 capacityNOt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityNOt(){
        return capacityNOt;
    }
	
    /**
     * 属性 capacityNOt 的set方法
     * @return
     */
    public void setCapacityNOt(BigDecimal capacityNOt){
        this.capacityNOt = capacityNOt;
    } 
	
    /**
     * 属性 capacityR 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityR(){
        return capacityR;
    }
	
    /**
     * 属性 capacityR 的set方法
     * @return
     */
    public void setCapacityR(BigDecimal capacityR){
        this.capacityR = capacityR;
    } 
	
    /**
     * 属性 capacityRWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityRWa(){
        return capacityRWa;
    }
	
    /**
     * 属性 capacityRWa 的set方法
     * @return
     */
    public void setCapacityRWa(BigDecimal capacityRWa){
        this.capacityRWa = capacityRWa;
    } 
	
    /**
     * 属性 capacityRFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityRFi(){
        return capacityRFi;
    }
	
    /**
     * 属性 capacityRFi 的set方法
     * @return
     */
    public void setCapacityRFi(BigDecimal capacityRFi){
        this.capacityRFi = capacityRFi;
    } 
	
    /**
     * 属性 capacityRNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityRNu(){
        return capacityRNu;
    }
	
    /**
     * 属性 capacityRNu 的set方法
     * @return
     */
    public void setCapacityRNu(BigDecimal capacityRNu){
        this.capacityRNu = capacityRNu;
    } 
	
    /**
     * 属性 capacityRWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityRWi(){
        return capacityRWi;
    }
	
    /**
     * 属性 capacityRWi 的set方法
     * @return
     */
    public void setCapacityRWi(BigDecimal capacityRWi){
        this.capacityRWi = capacityRWi;
    } 
	
    /**
     * 属性 capacityRSu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityRSu(){
        return capacityRSu;
    }
	
    /**
     * 属性 capacityRSu 的set方法
     * @return
     */
    public void setCapacityRSu(BigDecimal capacityRSu){
        this.capacityRSu = capacityRSu;
    } 
	
    /**
     * 属性 capacityROt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCapacityROt(){
        return capacityROt;
    }
	
    /**
     * 属性 capacityROt 的set方法
     * @return
     */
    public void setCapacityROt(BigDecimal capacityROt){
        this.capacityROt = capacityROt;
    } 
	
    /**
     * 属性 planfixcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacity(){
        return planfixcapacity;
    }
	
    /**
     * 属性 planfixcapacity 的set方法
     * @return
     */
    public void setPlanfixcapacity(BigDecimal planfixcapacity){
        this.planfixcapacity = planfixcapacity;
    } 
	
    /**
     * 属性 planfixcapacityWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacityWa(){
        return planfixcapacityWa;
    }
	
    /**
     * 属性 planfixcapacityWa 的set方法
     * @return
     */
    public void setPlanfixcapacityWa(BigDecimal planfixcapacityWa){
        this.planfixcapacityWa = planfixcapacityWa;
    } 
	
    /**
     * 属性 planfixcapacityFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacityFi(){
        return planfixcapacityFi;
    }
	
    /**
     * 属性 planfixcapacityFi 的set方法
     * @return
     */
    public void setPlanfixcapacityFi(BigDecimal planfixcapacityFi){
        this.planfixcapacityFi = planfixcapacityFi;
    } 
	
    /**
     * 属性 planfixcapacityNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacityNu(){
        return planfixcapacityNu;
    }
	
    /**
     * 属性 planfixcapacityNu 的set方法
     * @return
     */
    public void setPlanfixcapacityNu(BigDecimal planfixcapacityNu){
        this.planfixcapacityNu = planfixcapacityNu;
    } 
	
    /**
     * 属性 planfixcapacityWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacityWi(){
        return planfixcapacityWi;
    }
	
    /**
     * 属性 planfixcapacityWi 的set方法
     * @return
     */
    public void setPlanfixcapacityWi(BigDecimal planfixcapacityWi){
        this.planfixcapacityWi = planfixcapacityWi;
    } 
	
    /**
     * 属性 planfixcapacitySu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacitySu(){
        return planfixcapacitySu;
    }
	
    /**
     * 属性 planfixcapacitySu 的set方法
     * @return
     */
    public void setPlanfixcapacitySu(BigDecimal planfixcapacitySu){
        this.planfixcapacitySu = planfixcapacitySu;
    } 
	
    /**
     * 属性 planfixcapacityOt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPlanfixcapacityOt(){
        return planfixcapacityOt;
    }
	
    /**
     * 属性 planfixcapacityOt 的set方法
     * @return
     */
    public void setPlanfixcapacityOt(BigDecimal planfixcapacityOt){
        this.planfixcapacityOt = planfixcapacityOt;
    } 
	
    /**
     * 属性 actualfixcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacity(){
        return actualfixcapacity;
    }
	
    /**
     * 属性 actualfixcapacity 的set方法
     * @return
     */
    public void setActualfixcapacity(BigDecimal actualfixcapacity){
        this.actualfixcapacity = actualfixcapacity;
    } 
	
    /**
     * 属性 actualfixcapacityWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacityWa(){
        return actualfixcapacityWa;
    }
	
    /**
     * 属性 actualfixcapacityWa 的set方法
     * @return
     */
    public void setActualfixcapacityWa(BigDecimal actualfixcapacityWa){
        this.actualfixcapacityWa = actualfixcapacityWa;
    } 
	
    /**
     * 属性 actualfixcapacityFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacityFi(){
        return actualfixcapacityFi;
    }
	
    /**
     * 属性 actualfixcapacityFi 的set方法
     * @return
     */
    public void setActualfixcapacityFi(BigDecimal actualfixcapacityFi){
        this.actualfixcapacityFi = actualfixcapacityFi;
    } 
	
    /**
     * 属性 actualfixcapacityNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacityNu(){
        return actualfixcapacityNu;
    }
	
    /**
     * 属性 actualfixcapacityNu 的set方法
     * @return
     */
    public void setActualfixcapacityNu(BigDecimal actualfixcapacityNu){
        this.actualfixcapacityNu = actualfixcapacityNu;
    } 
	
    /**
     * 属性 actualfixcapacityWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacityWi(){
        return actualfixcapacityWi;
    }
	
    /**
     * 属性 actualfixcapacityWi 的set方法
     * @return
     */
    public void setActualfixcapacityWi(BigDecimal actualfixcapacityWi){
        this.actualfixcapacityWi = actualfixcapacityWi;
    } 
	
    /**
     * 属性 actualfixcapacitySu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacitySu(){
        return actualfixcapacitySu;
    }
	
    /**
     * 属性 actualfixcapacitySu 的set方法
     * @return
     */
    public void setActualfixcapacitySu(BigDecimal actualfixcapacitySu){
        this.actualfixcapacitySu = actualfixcapacitySu;
    } 
	
    /**
     * 属性 actualfixcapacityOt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getActualfixcapacityOt(){
        return actualfixcapacityOt;
    }
	
    /**
     * 属性 actualfixcapacityOt 的set方法
     * @return
     */
    public void setActualfixcapacityOt(BigDecimal actualfixcapacityOt){
        this.actualfixcapacityOt = actualfixcapacityOt;
    } 
	
    /**
     * 属性 blockcapacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacity(){
        return blockcapacity;
    }
	
    /**
     * 属性 blockcapacity 的set方法
     * @return
     */
    public void setBlockcapacity(BigDecimal blockcapacity){
        this.blockcapacity = blockcapacity;
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
     * 属性 blockcapacityN 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityN(){
        return blockcapacityN;
    }
	
    /**
     * 属性 blockcapacityN 的set方法
     * @return
     */
    public void setBlockcapacityN(BigDecimal blockcapacityN){
        this.blockcapacityN = blockcapacityN;
    } 
	
    /**
     * 属性 blockcapacityP 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityP(){
        return blockcapacityP;
    }
	
    /**
     * 属性 blockcapacityP 的set方法
     * @return
     */
    public void setBlockcapacityP(BigDecimal blockcapacityP){
        this.blockcapacityP = blockcapacityP;
    } 
	
    /**
     * 属性 blockcapacityFu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityFu(){
        return blockcapacityFu;
    }
	
    /**
     * 属性 blockcapacityFu 的set方法
     * @return
     */
    public void setBlockcapacityFu(BigDecimal blockcapacityFu){
        this.blockcapacityFu = blockcapacityFu;
    } 
	
    /**
     * 属性 blockcapacityC 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityC(){
        return blockcapacityC;
    }
	
    /**
     * 属性 blockcapacityC 的set方法
     * @return
     */
    public void setBlockcapacityC(BigDecimal blockcapacityC){
        this.blockcapacityC = blockcapacityC;
    } 
	
    /**
     * 属性 blockcapacityG 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityG(){
        return blockcapacityG;
    }
	
    /**
     * 属性 blockcapacityG 的set方法
     * @return
     */
    public void setBlockcapacityG(BigDecimal blockcapacityG){
        this.blockcapacityG = blockcapacityG;
    } 
	
    /**
     * 属性 blockcapacityH 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBlockcapacityH(){
        return blockcapacityH;
    }
	
    /**
     * 属性 blockcapacityH 的set方法
     * @return
     */
    public void setBlockcapacityH(BigDecimal blockcapacityH){
        this.blockcapacityH = blockcapacityH;
    } 
	
    /**
     * 属性 freepacity 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFreepacity(){
        return freepacity;
    }
	
    /**
     * 属性 freepacity 的set方法
     * @return
     */
    public void setFreepacity(BigDecimal freepacity){
        this.freepacity = freepacity;
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
     * 属性 realreserve 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRealreserve(){
        return realreserve;
    }
	
    /**
     * 属性 realreserve 的set方法
     * @return
     */
    public void setRealreserve(BigDecimal realreserve){
        this.realreserve = realreserve;
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
     * 属性 generateelecWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelecWa(){
        return generateelecWa;
    }
	
    /**
     * 属性 generateelecWa 的set方法
     * @return
     */
    public void setGenerateelecWa(BigDecimal generateelecWa){
        this.generateelecWa = generateelecWa;
    } 
	
    /**
     * 属性 generateelecFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelecFi(){
        return generateelecFi;
    }
	
    /**
     * 属性 generateelecFi 的set方法
     * @return
     */
    public void setGenerateelecFi(BigDecimal generateelecFi){
        this.generateelecFi = generateelecFi;
    } 
	
    /**
     * 属性 generateelecNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelecNu(){
        return generateelecNu;
    }
	
    /**
     * 属性 generateelecNu 的set方法
     * @return
     */
    public void setGenerateelecNu(BigDecimal generateelecNu){
        this.generateelecNu = generateelecNu;
    } 
	
    /**
     * 属性 generateelecWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelecWi(){
        return generateelecWi;
    }
	
    /**
     * 属性 generateelecWi 的set方法
     * @return
     */
    public void setGenerateelecWi(BigDecimal generateelecWi){
        this.generateelecWi = generateelecWi;
    } 
	
    /**
     * 属性 generateelecSu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelecSu(){
        return generateelecSu;
    }
	
    /**
     * 属性 generateelecSu 的set方法
     * @return
     */
    public void setGenerateelecSu(BigDecimal generateelecSu){
        this.generateelecSu = generateelecSu;
    } 
	
    /**
     * 属性 generateelecOt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGenerateelecOt(){
        return generateelecOt;
    }
	
    /**
     * 属性 generateelecOt 的set方法
     * @return
     */
    public void setGenerateelecOt(BigDecimal generateelecOt){
        this.generateelecOt = generateelecOt;
    } 
	
    /**
     * 属性 energy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getEnergy(){
        return energy;
    }
	
    /**
     * 属性 energy 的set方法
     * @return
     */
    public void setEnergy(BigDecimal energy){
        this.energy = energy;
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
     * 属性 power 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPower(){
        return power;
    }
	
    /**
     * 属性 power 的set方法
     * @return
     */
    public void setPower(BigDecimal power){
        this.power = power;
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
     * 属性 allunifyqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAllunifyqty(){
        return allunifyqty;
    }
	
    /**
     * 属性 allunifyqty 的set方法
     * @return
     */
    public void setAllunifyqty(BigDecimal allunifyqty){
        this.allunifyqty = allunifyqty;
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
     * 属性 lineenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLineenergy(){
        return lineenergy;
    }
	
    /**
     * 属性 lineenergy 的set方法
     * @return
     */
    public void setLineenergy(BigDecimal lineenergy){
        this.lineenergy = lineenergy;
    } 
	
    /**
     * 属性 linepower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLinepower(){
        return linepower;
    }
	
    /**
     * 属性 linepower 的set方法
     * @return
     */
    public void setLinepower(BigDecimal linepower){
        this.linepower = linepower;
    } 
	
    /**
     * 属性 serpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSerpower(){
        return serpower;
    }
	
    /**
     * 属性 serpower 的set方法
     * @return
     */
    public void setSerpower(BigDecimal serpower){
        this.serpower = serpower;
    } 
	
    /**
     * 属性 serenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSerenergy(){
        return serenergy;
    }
	
    /**
     * 属性 serenergy 的set方法
     * @return
     */
    public void setSerenergy(BigDecimal serenergy){
        this.serenergy = serenergy;
    } 
	
    /**
     * 属性 serenergyWa 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSerenergyWa(){
        return serenergyWa;
    }
	
    /**
     * 属性 serenergyWa 的set方法
     * @return
     */
    public void setSerenergyWa(BigDecimal serenergyWa){
        this.serenergyWa = serenergyWa;
    } 
	
    /**
     * 属性 serenergyFi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSerenergyFi(){
        return serenergyFi;
    }
	
    /**
     * 属性 serenergyFi 的set方法
     * @return
     */
    public void setSerenergyFi(BigDecimal serenergyFi){
        this.serenergyFi = serenergyFi;
    } 
	
    /**
     * 属性 serenergyNu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSerenergyNu(){
        return serenergyNu;
    }
	
    /**
     * 属性 serenergyNu 的set方法
     * @return
     */
    public void setSerenergyNu(BigDecimal serenergyNu){
        this.serenergyNu = serenergyNu;
    } 
	
    /**
     * 属性 serenergyWi 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSerenergyWi(){
        return serenergyWi;
    }
	
    /**
     * 属性 serenergyWi 的set方法
     * @return
     */
    public void setSerenergyWi(BigDecimal serenergyWi){
        this.serenergyWi = serenergyWi;
    } 
	
    /**
     * 属性 serenergySu 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSerenergySu(){
        return serenergySu;
    }
	
    /**
     * 属性 serenergySu 的set方法
     * @return
     */
    public void setSerenergySu(BigDecimal serenergySu){
        this.serenergySu = serenergySu;
    } 
	
    /**
     * 属性 serenergyOt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSerenergyOt(){
        return serenergyOt;
    }
	
    /**
     * 属性 serenergyOt 的set方法
     * @return
     */
    public void setSerenergyOt(BigDecimal serenergyOt){
        this.serenergyOt = serenergyOt;
    } 
	
    /**
     * 属性 maxpullpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxpullpower(){
        return maxpullpower;
    }
	
    /**
     * 属性 maxpullpower 的set方法
     * @return
     */
    public void setMaxpullpower(BigDecimal maxpullpower){
        this.maxpullpower = maxpullpower;
    } 
	
    /**
     * 属性 maxlimitpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getMaxlimitpower(){
        return maxlimitpower;
    }
	
    /**
     * 属性 maxlimitpower 的set方法
     * @return
     */
    public void setMaxlimitpower(BigDecimal maxlimitpower){
        this.maxlimitpower = maxlimitpower;
    } 
	
    /**
     * 属性 pullelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPullelec(){
        return pullelec;
    }
	
    /**
     * 属性 pullelec 的set方法
     * @return
     */
    public void setPullelec(BigDecimal pullelec){
        this.pullelec = pullelec;
    } 
	
    /**
     * 属性 limitelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLimitelec(){
        return limitelec;
    }
	
    /**
     * 属性 limitelec 的set方法
     * @return
     */
    public void setLimitelec(BigDecimal limitelec){
        this.limitelec = limitelec;
    } 
	
    /**
     * 属性 cfpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCfpower(){
        return cfpower;
    }
	
    /**
     * 属性 cfpower 的set方法
     * @return
     */
    public void setCfpower(BigDecimal cfpower){
        this.cfpower = cfpower;
    } 
	
    /**
     * 属性 bfpower 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBfpower(){
        return bfpower;
    }
	
    /**
     * 属性 bfpower 的set方法
     * @return
     */
    public void setBfpower(BigDecimal bfpower){
        this.bfpower = bfpower;
    } 
	
    /**
     * 属性 cfelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCfelec(){
        return cfelec;
    }
	
    /**
     * 属性 cfelec 的set方法
     * @return
     */
    public void setCfelec(BigDecimal cfelec){
        this.cfelec = cfelec;
    } 
	
    /**
     * 属性 bfelec 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBfelec(){
        return bfelec;
    }
	
    /**
     * 属性 bfelec 的set方法
     * @return
     */
    public void setBfelec(BigDecimal bfelec){
        this.bfelec = bfelec;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaElecnext))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaElecnext other = (BaElecnext) o;	        
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
            .append("tabDate"+":"+getTabDate())
            .append("capacityS"+":"+getCapacityS())
            .append("capacitySWa"+":"+getCapacitySWa())
            .append("capacitySFi"+":"+getCapacitySFi())
            .append("capacitySNu"+":"+getCapacitySNu())
            .append("capacitySWi"+":"+getCapacitySWi())
            .append("capacitySSu"+":"+getCapacitySSu())
            .append("capacitySOt"+":"+getCapacitySOt())
            .append("capacityN"+":"+getCapacityN())
            .append("capacityNWa"+":"+getCapacityNWa())
            .append("capacityNFi"+":"+getCapacityNFi())
            .append("capacityNNu"+":"+getCapacityNNu())
            .append("capacityNWi"+":"+getCapacityNWi())
            .append("capacityNSu"+":"+getCapacityNSu())
            .append("capacityNOt"+":"+getCapacityNOt())
            .append("capacityR"+":"+getCapacityR())
            .append("capacityRWa"+":"+getCapacityRWa())
            .append("capacityRFi"+":"+getCapacityRFi())
            .append("capacityRNu"+":"+getCapacityRNu())
            .append("capacityRWi"+":"+getCapacityRWi())
            .append("capacityRSu"+":"+getCapacityRSu())
            .append("capacityROt"+":"+getCapacityROt())
            .append("planfixcapacity"+":"+getPlanfixcapacity())
            .append("planfixcapacityWa"+":"+getPlanfixcapacityWa())
            .append("planfixcapacityFi"+":"+getPlanfixcapacityFi())
            .append("planfixcapacityNu"+":"+getPlanfixcapacityNu())
            .append("planfixcapacityWi"+":"+getPlanfixcapacityWi())
            .append("planfixcapacitySu"+":"+getPlanfixcapacitySu())
            .append("planfixcapacityOt"+":"+getPlanfixcapacityOt())
            .append("actualfixcapacity"+":"+getActualfixcapacity())
            .append("actualfixcapacityWa"+":"+getActualfixcapacityWa())
            .append("actualfixcapacityFi"+":"+getActualfixcapacityFi())
            .append("actualfixcapacityNu"+":"+getActualfixcapacityNu())
            .append("actualfixcapacityWi"+":"+getActualfixcapacityWi())
            .append("actualfixcapacitySu"+":"+getActualfixcapacitySu())
            .append("actualfixcapacityOt"+":"+getActualfixcapacityOt())
            .append("blockcapacity"+":"+getBlockcapacity())
            .append("blockcapacityWa"+":"+getBlockcapacityWa())
            .append("blockcapacityFi"+":"+getBlockcapacityFi())
            .append("blockcapacityNu"+":"+getBlockcapacityNu())
            .append("blockcapacityWi"+":"+getBlockcapacityWi())
            .append("blockcapacitySu"+":"+getBlockcapacitySu())
            .append("blockcapacityOt"+":"+getBlockcapacityOt())
            .append("blockcapacityN"+":"+getBlockcapacityN())
            .append("blockcapacityP"+":"+getBlockcapacityP())
            .append("blockcapacityFu"+":"+getBlockcapacityFu())
            .append("blockcapacityC"+":"+getBlockcapacityC())
            .append("blockcapacityG"+":"+getBlockcapacityG())
            .append("blockcapacityH"+":"+getBlockcapacityH())
            .append("freepacity"+":"+getFreepacity())
            .append("perreserve"+":"+getPerreserve())
            .append("backcapacity"+":"+getBackcapacity())
            .append("coldstandby"+":"+getColdstandby())
            .append("realreserve"+":"+getRealreserve())
            .append("adjustcapacity"+":"+getAdjustcapacity())
            .append("iadjustcapacity"+":"+getIadjustcapacity())
            .append("generateelec"+":"+getGenerateelec())
            .append("generateelecWa"+":"+getGenerateelecWa())
            .append("generateelecFi"+":"+getGenerateelecFi())
            .append("generateelecNu"+":"+getGenerateelecNu())
            .append("generateelecWi"+":"+getGenerateelecWi())
            .append("generateelecSu"+":"+getGenerateelecSu())
            .append("generateelecOt"+":"+getGenerateelecOt())
            .append("energy"+":"+getEnergy())
            .append("buyenergy"+":"+getBuyenergy())
            .append("saleenergy"+":"+getSaleenergy())
            .append("power"+":"+getPower())
            .append("buypower"+":"+getBuypower())
            .append("salepower"+":"+getSalepower())
            .append("usingdemand"+":"+getUsingdemand())
            .append("maxdemand"+":"+getMaxdemand())
            .append("unifyqty"+":"+getUnifyqty())
            .append("allunifyqty"+":"+getAllunifyqty())
            .append("powersurplus"+":"+getPowersurplus())
            .append("elecsurplus"+":"+getElecsurplus())
            .append("lineenergy"+":"+getLineenergy())
            .append("linepower"+":"+getLinepower())
            .append("serpower"+":"+getSerpower())
            .append("serenergy"+":"+getSerenergy())
            .append("serenergyWa"+":"+getSerenergyWa())
            .append("serenergyFi"+":"+getSerenergyFi())
            .append("serenergyNu"+":"+getSerenergyNu())
            .append("serenergyWi"+":"+getSerenergyWi())
            .append("serenergySu"+":"+getSerenergySu())
            .append("serenergyOt"+":"+getSerenergyOt())
            .append("maxpullpower"+":"+getMaxpullpower())
            .append("maxlimitpower"+":"+getMaxlimitpower())
            .append("pullelec"+":"+getPullelec())
            .append("limitelec"+":"+getLimitelec())
            .append("cfpower"+":"+getCfpower())
            .append("bfpower"+":"+getBfpower())
            .append("cfelec"+":"+getCfelec())
            .append("bfelec"+":"+getBfelec())
            .append("version"+":"+getVersion())
            .append("newversion"+":"+getNewversion())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("updatetime"+":"+getUpdatetime())
            .append("versiondesc"+":"+getVersiondesc())
            .append("issueddate"+":"+getIssueddate())
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