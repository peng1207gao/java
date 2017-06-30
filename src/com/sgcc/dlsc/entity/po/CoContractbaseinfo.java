package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContractbaseinfo的POJO类
 *
 * @author  xiabaike  [Fri Feb 07 20:30:37 CST 2014]
 * 
 */
public class CoContractbaseinfo implements Serializable{

    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性contractid
     */
    private String contractid;
	
    /** 
     * 属性supercontractid
     */
    private String supercontractid;
	
    /** 
     * 属性contractname
     */
    private String contractname;
	
    /** 
     * 属性contracttype
     */
    private String contracttype;
	
    /** 
     * 属性papercontractcode
     */
    private String papercontractcode;
	
    /** 
     * 属性papercontractname
     */
    private String papercontractname;
	
    /** 
     * 属性contracttemplateid
     */
    private String contracttemplateid;
	
    /** 
     * 属性signstate
     */
    private BigDecimal signstate;
	
    /** 
     * 属性signeddate
     */
    private Date signeddate;
	
    /** 
     * 属性notsignedreason
     */
    private String notsignedreason;
	
    /** 
     * 属性signedperson
     */
    private String signedperson;
	
    /** 
     * 属性signedsite
     */
    private String signedsite;
	
    /** 
     * 属性backupperson
     */
    private String backupperson;
	
    /** 
     * 属性backupdate
     */
    private Date backupdate;
	
    /** 
     * 属性backupstate
     */
    private BigDecimal backupstate;
	
    /** 
     * 属性backuporg
     */
    private String backuporg;
	
    /** 
     * 属性disbackupreason
     */
    private String disbackupreason;
	
    /** 
     * 属性isend
     */
    private BigDecimal isend;
	
    /** 
     * 属性prepcontractflag
     */
    private BigDecimal prepcontractflag;
	
    /** 
     * 属性issecrecyflag
     */
    private BigDecimal issecrecyflag;
	
    /** 
     * 属性contractcyc
     */
    private BigDecimal contractcyc;
	
    /** 
     * 属性purchaser
     */
    private String purchaser;
	
    /** 
     * 属性seller
     */
    private String seller;
	
    /** 
     * 属性sellerunit
     */
    private String sellerunit;
	
    /** 
     * 属性purchaseunit
     */
    private String purchaseunit;
	
    /** 
     * 属性contractqty
     */
    private BigDecimal contractqty;
	
    /** 
     * 属性qtytype
     */
    private BigDecimal qtytype;
	
    /** 
     * 属性contractstartdate
     */
    private Date contractstartdate;
	
    /** 
     * 属性contractenddate
     */
    private Date contractenddate;
	
    /** 
     * 属性transactionid
     */
    private String transactionid;
	
    /** 
     * 属性transactiontype
     */
    private String transactiontype;
	
    /** 
     * 属性rightsettlementside
     */
    private BigDecimal rightsettlementside;
	
    /** 
     * 属性isrepurchaseflag
     */
    private BigDecimal isrepurchaseflag;
	
    /** 
     * 属性replacetype
     */
    private String replacetype;
	
    /** 
     * 属性areatype
     */
    private BigDecimal areatype;
	
    /** 
     * 属性isehvflag
     */
    private BigDecimal isehvflag;
	
    /** 
     * 属性isresaleflag
     */
    private BigDecimal isresaleflag;
	
    /** 
     * 属性isopen
     */
    private BigDecimal isopen;
	
    /** 
     * 属性purchasegate
     */
    private String purchasegate;
	
    /** 
     * 属性settlegate
     */
    private String settlegate;
	
    /** 
     * 属性lossundertaker
     */
    private BigDecimal lossundertaker;
	
    /** 
     * 属性purchaserperson
     */
    private String purchaserperson;
	
    /** 
     * 属性purchaserphone
     */
    private String purchaserphone;
	
    /** 
     * 属性purchaserconftime
     */
    private Date purchaserconftime;
	
    /** 
     * 属性sellerperson
     */
    private String sellerperson;
	
    /** 
     * 属性sellerphone
     */
    private String sellerphone;
	
    /** 
     * 属性sellerconftime
     */
    private Date sellerconftime;
	
    /** 
     * 属性transperson
     */
    private String transperson;
	
    /** 
     * 属性transphone
     */
    private String transphone;
	
    /** 
     * 属性transconftime
     */
    private Date transconftime;
	
    /** 
     * 属性changetimes
     */
    private BigDecimal changetimes;
	
    /** 
     * 属性description
     */
    private String description;
	
    /** 
     * 属性isdelete
     */
    private BigDecimal isdelete;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性versionid
     */
    private String versionid;
	
    /** 
     * 属性version
     */
    private String version;
	
    /** 
     * 属性versiondesc
     */
    private String versiondesc;
	
    /** 
     * 属性isrelation
     */
    private BigDecimal isrelation;
	
    /** 
     * 属性exectype
     */
    private BigDecimal exectype;
	
    /** 
     * 属性flow
     */
    private BigDecimal flow;
	
    /** 
     * 属性settleside
     */
    private BigDecimal settleside;
	
    /** 
     * 属性businessid
     */
    private String businessid;
	
    /** 
     * 属性flowflag
     */
    private BigDecimal flowflag;
	
    /** 
     * 属性sequenceid
     */
    private String sequenceid;
	
    /** 
     * 属性energy
     */
    private BigDecimal energy;
	
    /** 
     * 属性contractprice
     */
    private BigDecimal contractprice;
	
    /** 
     * 属性contractenergy
     */
    private BigDecimal contractenergy;
	
    /** 
     * 属性superexecid
     */
    private String superexecid;
	
    /** 
     * 属性ingodown
     */
    private BigDecimal ingodown;
	
    /** 
     * 属性expend1
     */
    private BigDecimal expend1;
	
    /** 
     * 属性expend2
     */
    private BigDecimal expend2;
	
    /** 
     * 属性expend3
     */
    private BigDecimal expend3;
	
    /** 
     * 属性expend4
     */
    private Date expend4;
	
    /** 
     * 属性expend5
     */
    private String expend5;
	
    /** 
     * 属性expend6
     */
    private String expend6;
	
    /** 
     * 属性purchasergen
     */
    private BigDecimal purchasergen;
	
    /** 
     * 属性purchaserenergy
     */
    private BigDecimal purchaserenergy;
	
    /** 
     * 属性sellergen
     */
    private BigDecimal sellergen;
	
    /** 
     * 属性sellerenergy
     */
    private BigDecimal sellerenergy;
	
    /** 
     * 属性coVersion
     */
    private String coVersion;
	
    /** 
     * 属性isTax
     */
    private BigDecimal isTax;
	
    /** 
     * 属性vendeeGenRate
     */
    private BigDecimal vendeeGenRate;
	
    /** 
     * 属性saleGenRate
     */
    private BigDecimal saleGenRate;
	
    /** 
     * 属性saleLoss
     */
    private BigDecimal saleLoss;
	
    /** 
     * 属性vendeeLoss
     */
    private BigDecimal vendeeLoss;
	
    /** 
     * 属性vendeeBreathPrice
     */
    private BigDecimal vendeeBreathPrice;
	
    /** 
     * 属性saleBreathPrice
     */
    private BigDecimal saleBreathPrice;
	
    /** 
     * 属性approvedTariff
     */
    private BigDecimal approvedTariff;
	
    /** 
     * 属性catalogPrice
     */
    private BigDecimal catalogPrice;
	
    /** 
     * 属性transferAllotPrice
     */
    private BigDecimal transferAllotPrice;
	
    /** 
     * 属性netDiscountLoss
     */
    private BigDecimal netDiscountLoss;
	
    /** 
     * 属性fundsandaddPrice
     */
    private BigDecimal fundsandaddPrice;
	
    /** 
     * 属性tradePriceMargin
     */
    private BigDecimal tradePriceMargin;
    
    /**
     * CoContractbaseinfo构造函数
     */
    public CoContractbaseinfo() {
        super();
    }  
	
    /**
     * CoContractbaseinfo完整的构造函数
     */  
    public CoContractbaseinfo(String marketid,String contractid,BigDecimal isdelete,String versionid){
        this.marketid = marketid;
        this.contractid = contractid;
        this.isdelete = isdelete;
        this.versionid = versionid;
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
     * 属性 contractid 的get方法
     * @return String
     */
    public String getContractid(){
        return contractid;
    }
	
    /**
     * 属性 contractid 的set方法
     * @return
     */
    public void setContractid(String contractid){
        if(contractid != null && contractid.trim().length() == 0){
            this.contractid = null;
        }else{
            this.contractid = contractid;
        }
    } 
	
    /**
     * 属性 supercontractid 的get方法
     * @return String
     */
    public String getSupercontractid(){
        return supercontractid;
    }
	
    /**
     * 属性 supercontractid 的set方法
     * @return
     */
    public void setSupercontractid(String supercontractid){
        this.supercontractid = supercontractid;
    } 
	
    /**
     * 属性 contractname 的get方法
     * @return String
     */
    public String getContractname(){
        return contractname;
    }
	
    /**
     * 属性 contractname 的set方法
     * @return
     */
    public void setContractname(String contractname){
        this.contractname = contractname;
    } 
	
    /**
     * 属性 contracttype 的get方法
     * @return String
     */
    public String getContracttype(){
        return contracttype;
    }
	
    /**
     * 属性 contracttype 的set方法
     * @return
     */
    public void setContracttype(String contracttype){
        this.contracttype = contracttype;
    } 
	
    /**
     * 属性 papercontractcode 的get方法
     * @return String
     */
    public String getPapercontractcode(){
        return papercontractcode;
    }
	
    /**
     * 属性 papercontractcode 的set方法
     * @return
     */
    public void setPapercontractcode(String papercontractcode){
        this.papercontractcode = papercontractcode;
    } 
	
    /**
     * 属性 papercontractname 的get方法
     * @return String
     */
    public String getPapercontractname(){
        return papercontractname;
    }
	
    /**
     * 属性 papercontractname 的set方法
     * @return
     */
    public void setPapercontractname(String papercontractname){
        this.papercontractname = papercontractname;
    } 
	
    /**
     * 属性 contracttemplateid 的get方法
     * @return String
     */
    public String getContracttemplateid(){
        return contracttemplateid;
    }
	
    /**
     * 属性 contracttemplateid 的set方法
     * @return
     */
    public void setContracttemplateid(String contracttemplateid){
        this.contracttemplateid = contracttemplateid;
    } 
	
    /**
     * 属性 signstate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSignstate(){
        return signstate;
    }
	
    /**
     * 属性 signstate 的set方法
     * @return
     */
    public void setSignstate(BigDecimal signstate){
        this.signstate = signstate;
    } 
	
    /**
     * 属性 signeddate 的get方法
     * @return Date
     */
    public Date getSigneddate(){
        return signeddate;
    }
	
    /**
     * 属性 signeddate 的set方法
     * @return
     */
    public void setSigneddate(Date signeddate){
        this.signeddate = signeddate;
    } 
	
    /**
     * 属性 notsignedreason 的get方法
     * @return String
     */
    public String getNotsignedreason(){
        return notsignedreason;
    }
	
    /**
     * 属性 notsignedreason 的set方法
     * @return
     */
    public void setNotsignedreason(String notsignedreason){
        this.notsignedreason = notsignedreason;
    } 
	
    /**
     * 属性 signedperson 的get方法
     * @return String
     */
    public String getSignedperson(){
        return signedperson;
    }
	
    /**
     * 属性 signedperson 的set方法
     * @return
     */
    public void setSignedperson(String signedperson){
        this.signedperson = signedperson;
    } 
	
    /**
     * 属性 signedsite 的get方法
     * @return String
     */
    public String getSignedsite(){
        return signedsite;
    }
	
    /**
     * 属性 signedsite 的set方法
     * @return
     */
    public void setSignedsite(String signedsite){
        this.signedsite = signedsite;
    } 
	
    /**
     * 属性 backupperson 的get方法
     * @return String
     */
    public String getBackupperson(){
        return backupperson;
    }
	
    /**
     * 属性 backupperson 的set方法
     * @return
     */
    public void setBackupperson(String backupperson){
        this.backupperson = backupperson;
    } 
	
    /**
     * 属性 backupdate 的get方法
     * @return Date
     */
    public Date getBackupdate(){
        return backupdate;
    }
	
    /**
     * 属性 backupdate 的set方法
     * @return
     */
    public void setBackupdate(Date backupdate){
        this.backupdate = backupdate;
    } 
	
    /**
     * 属性 backupstate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBackupstate(){
        return backupstate;
    }
	
    /**
     * 属性 backupstate 的set方法
     * @return
     */
    public void setBackupstate(BigDecimal backupstate){
        this.backupstate = backupstate;
    } 
	
    /**
     * 属性 backuporg 的get方法
     * @return String
     */
    public String getBackuporg(){
        return backuporg;
    }
	
    /**
     * 属性 backuporg 的set方法
     * @return
     */
    public void setBackuporg(String backuporg){
        this.backuporg = backuporg;
    } 
	
    /**
     * 属性 disbackupreason 的get方法
     * @return String
     */
    public String getDisbackupreason(){
        return disbackupreason;
    }
	
    /**
     * 属性 disbackupreason 的set方法
     * @return
     */
    public void setDisbackupreason(String disbackupreason){
        this.disbackupreason = disbackupreason;
    } 
	
    /**
     * 属性 isend 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsend(){
        return isend;
    }
	
    /**
     * 属性 isend 的set方法
     * @return
     */
    public void setIsend(BigDecimal isend){
        this.isend = isend;
    } 
	
    /**
     * 属性 prepcontractflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPrepcontractflag(){
        return prepcontractflag;
    }
	
    /**
     * 属性 prepcontractflag 的set方法
     * @return
     */
    public void setPrepcontractflag(BigDecimal prepcontractflag){
        this.prepcontractflag = prepcontractflag;
    } 
	
    /**
     * 属性 issecrecyflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIssecrecyflag(){
        return issecrecyflag;
    }
	
    /**
     * 属性 issecrecyflag 的set方法
     * @return
     */
    public void setIssecrecyflag(BigDecimal issecrecyflag){
        this.issecrecyflag = issecrecyflag;
    } 
	
    /**
     * 属性 contractcyc 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractcyc(){
        return contractcyc;
    }
	
    /**
     * 属性 contractcyc 的set方法
     * @return
     */
    public void setContractcyc(BigDecimal contractcyc){
        this.contractcyc = contractcyc;
    } 
	
    /**
     * 属性 purchaser 的get方法
     * @return String
     */
    public String getPurchaser(){
        return purchaser;
    }
	
    /**
     * 属性 purchaser 的set方法
     * @return
     */
    public void setPurchaser(String purchaser){
        this.purchaser = purchaser;
    } 
	
    /**
     * 属性 seller 的get方法
     * @return String
     */
    public String getSeller(){
        return seller;
    }
	
    /**
     * 属性 seller 的set方法
     * @return
     */
    public void setSeller(String seller){
        this.seller = seller;
    } 
	
    /**
     * 属性 sellerunit 的get方法
     * @return String
     */
    public String getSellerunit(){
        return sellerunit;
    }
	
    /**
     * 属性 sellerunit 的set方法
     * @return
     */
    public void setSellerunit(String sellerunit){
        this.sellerunit = sellerunit;
    } 
	
    /**
     * 属性 purchaseunit 的get方法
     * @return String
     */
    public String getPurchaseunit(){
        return purchaseunit;
    }
	
    /**
     * 属性 purchaseunit 的set方法
     * @return
     */
    public void setPurchaseunit(String purchaseunit){
        this.purchaseunit = purchaseunit;
    } 
	
    /**
     * 属性 contractqty 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractqty(){
        return contractqty;
    }
	
    /**
     * 属性 contractqty 的set方法
     * @return
     */
    public void setContractqty(BigDecimal contractqty){
        this.contractqty = contractqty;
    } 
	
    /**
     * 属性 qtytype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getQtytype(){
        return qtytype;
    }
	
    /**
     * 属性 qtytype 的set方法
     * @return
     */
    public void setQtytype(BigDecimal qtytype){
        this.qtytype = qtytype;
    } 
	
    /**
     * 属性 contractstartdate 的get方法
     * @return Date
     */
    public Date getContractstartdate(){
        return contractstartdate;
    }
	
    /**
     * 属性 contractstartdate 的set方法
     * @return
     */
    public void setContractstartdate(Date contractstartdate){
        this.contractstartdate = contractstartdate;
    } 
	
    /**
     * 属性 contractenddate 的get方法
     * @return Date
     */
    public Date getContractenddate(){
        return contractenddate;
    }
	
    /**
     * 属性 contractenddate 的set方法
     * @return
     */
    public void setContractenddate(Date contractenddate){
        this.contractenddate = contractenddate;
    } 
	
    /**
     * 属性 transactionid 的get方法
     * @return String
     */
    public String getTransactionid(){
        return transactionid;
    }
	
    /**
     * 属性 transactionid 的set方法
     * @return
     */
    public void setTransactionid(String transactionid){
        this.transactionid = transactionid;
    } 
	
    /**
     * 属性 transactiontype 的get方法
     * @return BigDecimal
     */
    public String getTransactiontype(){
        return transactiontype;
    }
	
    /**
     * 属性 transactiontype 的set方法
     * @return
     */
    public void setTransactiontype(String transactiontype){
        this.transactiontype = transactiontype;
    } 
	
    /**
     * 属性 rightsettlementside 的get方法
     * @return BigDecimal
     */
    public BigDecimal getRightsettlementside(){
        return rightsettlementside;
    }
	
    /**
     * 属性 rightsettlementside 的set方法
     * @return
     */
    public void setRightsettlementside(BigDecimal rightsettlementside){
        this.rightsettlementside = rightsettlementside;
    } 
	
    /**
     * 属性 isrepurchaseflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsrepurchaseflag(){
        return isrepurchaseflag;
    }
	
    /**
     * 属性 isrepurchaseflag 的set方法
     * @return
     */
    public void setIsrepurchaseflag(BigDecimal isrepurchaseflag){
        this.isrepurchaseflag = isrepurchaseflag;
    } 
	
    /**
     * 属性 replacetype 的get方法
     * @return String
     */
    public String getReplacetype(){
        return replacetype;
    }
	
    /**
     * 属性 replacetype 的set方法
     * @return
     */
    public void setReplacetype(String replacetype){
        this.replacetype = replacetype;
    } 
	
    /**
     * 属性 areatype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getAreatype(){
        return areatype;
    }
	
    /**
     * 属性 areatype 的set方法
     * @return
     */
    public void setAreatype(BigDecimal areatype){
        this.areatype = areatype;
    } 
	
    /**
     * 属性 isehvflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsehvflag(){
        return isehvflag;
    }
	
    /**
     * 属性 isehvflag 的set方法
     * @return
     */
    public void setIsehvflag(BigDecimal isehvflag){
        this.isehvflag = isehvflag;
    } 
	
    /**
     * 属性 isresaleflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsresaleflag(){
        return isresaleflag;
    }
	
    /**
     * 属性 isresaleflag 的set方法
     * @return
     */
    public void setIsresaleflag(BigDecimal isresaleflag){
        this.isresaleflag = isresaleflag;
    } 
	
    /**
     * 属性 isopen 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsopen(){
        return isopen;
    }
	
    /**
     * 属性 isopen 的set方法
     * @return
     */
    public void setIsopen(BigDecimal isopen){
        this.isopen = isopen;
    } 
	
    /**
     * 属性 purchasegate 的get方法
     * @return String
     */
    public String getPurchasegate(){
        return purchasegate;
    }
	
    /**
     * 属性 purchasegate 的set方法
     * @return
     */
    public void setPurchasegate(String purchasegate){
        this.purchasegate = purchasegate;
    } 
	
    /**
     * 属性 settlegate 的get方法
     * @return String
     */
    public String getSettlegate(){
        return settlegate;
    }
	
    /**
     * 属性 settlegate 的set方法
     * @return
     */
    public void setSettlegate(String settlegate){
        this.settlegate = settlegate;
    } 
	
    /**
     * 属性 lossundertaker 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLossundertaker(){
        return lossundertaker;
    }
	
    /**
     * 属性 lossundertaker 的set方法
     * @return
     */
    public void setLossundertaker(BigDecimal lossundertaker){
        this.lossundertaker = lossundertaker;
    } 
	
    /**
     * 属性 purchaserperson 的get方法
     * @return String
     */
    public String getPurchaserperson(){
        return purchaserperson;
    }
	
    /**
     * 属性 purchaserperson 的set方法
     * @return
     */
    public void setPurchaserperson(String purchaserperson){
        this.purchaserperson = purchaserperson;
    } 
	
    /**
     * 属性 purchaserphone 的get方法
     * @return String
     */
    public String getPurchaserphone(){
        return purchaserphone;
    }
	
    /**
     * 属性 purchaserphone 的set方法
     * @return
     */
    public void setPurchaserphone(String purchaserphone){
        this.purchaserphone = purchaserphone;
    } 
	
    /**
     * 属性 purchaserconftime 的get方法
     * @return Date
     */
    public Date getPurchaserconftime(){
        return purchaserconftime;
    }
	
    /**
     * 属性 purchaserconftime 的set方法
     * @return
     */
    public void setPurchaserconftime(Date purchaserconftime){
        this.purchaserconftime = purchaserconftime;
    } 
	
    /**
     * 属性 sellerperson 的get方法
     * @return String
     */
    public String getSellerperson(){
        return sellerperson;
    }
	
    /**
     * 属性 sellerperson 的set方法
     * @return
     */
    public void setSellerperson(String sellerperson){
        this.sellerperson = sellerperson;
    } 
	
    /**
     * 属性 sellerphone 的get方法
     * @return String
     */
    public String getSellerphone(){
        return sellerphone;
    }
	
    /**
     * 属性 sellerphone 的set方法
     * @return
     */
    public void setSellerphone(String sellerphone){
        this.sellerphone = sellerphone;
    } 
	
    /**
     * 属性 sellerconftime 的get方法
     * @return Date
     */
    public Date getSellerconftime(){
        return sellerconftime;
    }
	
    /**
     * 属性 sellerconftime 的set方法
     * @return
     */
    public void setSellerconftime(Date sellerconftime){
        this.sellerconftime = sellerconftime;
    } 
	
    /**
     * 属性 transperson 的get方法
     * @return String
     */
    public String getTransperson(){
        return transperson;
    }
	
    /**
     * 属性 transperson 的set方法
     * @return
     */
    public void setTransperson(String transperson){
        this.transperson = transperson;
    } 
	
    /**
     * 属性 transphone 的get方法
     * @return String
     */
    public String getTransphone(){
        return transphone;
    }
	
    /**
     * 属性 transphone 的set方法
     * @return
     */
    public void setTransphone(String transphone){
        this.transphone = transphone;
    } 
	
    /**
     * 属性 transconftime 的get方法
     * @return Date
     */
    public Date getTransconftime(){
        return transconftime;
    }
	
    /**
     * 属性 transconftime 的set方法
     * @return
     */
    public void setTransconftime(Date transconftime){
        this.transconftime = transconftime;
    } 
	
    /**
     * 属性 changetimes 的get方法
     * @return BigDecimal
     */
    public BigDecimal getChangetimes(){
        return changetimes;
    }
	
    /**
     * 属性 changetimes 的set方法
     * @return
     */
    public void setChangetimes(BigDecimal changetimes){
        this.changetimes = changetimes;
    } 
	
    /**
     * 属性 description 的get方法
     * @return String
     */
    public String getDescription(){
        return description;
    }
	
    /**
     * 属性 description 的set方法
     * @return
     */
    public void setDescription(String description){
        this.description = description;
    } 
	
    /**
     * 属性 isdelete 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsdelete(){
        return isdelete;
    }
	
    /**
     * 属性 isdelete 的set方法
     * @return
     */
    public void setIsdelete(BigDecimal isdelete){
        this.isdelete = isdelete;
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
     * 属性 versionid 的get方法
     * @return String
     */
    public String getVersionid(){
        return versionid;
    }
	
    /**
     * 属性 versionid 的set方法
     * @return
     */
    public void setVersionid(String versionid){
        this.versionid = versionid;
    } 
	
    /**
     * 属性 version 的get方法
     * @return String
     */
    public String getVersion(){
        return version;
    }
	
    /**
     * 属性 version 的set方法
     * @return
     */
    public void setVersion(String version){
        this.version = version;
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
     * 属性 isrelation 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsrelation(){
        return isrelation;
    }
	
    /**
     * 属性 isrelation 的set方法
     * @return
     */
    public void setIsrelation(BigDecimal isrelation){
        this.isrelation = isrelation;
    } 
	
    /**
     * 属性 exectype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getExectype(){
        return exectype;
    }
	
    /**
     * 属性 exectype 的set方法
     * @return
     */
    public void setExectype(BigDecimal exectype){
        this.exectype = exectype;
    } 
	
    /**
     * 属性 flow 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFlow(){
        return flow;
    }
	
    /**
     * 属性 flow 的set方法
     * @return
     */
    public void setFlow(BigDecimal flow){
        this.flow = flow;
    } 
	
    /**
     * 属性 settleside 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSettleside(){
        return settleside;
    }
	
    /**
     * 属性 settleside 的set方法
     * @return
     */
    public void setSettleside(BigDecimal settleside){
        this.settleside = settleside;
    } 
	
    /**
     * 属性 businessid 的get方法
     * @return String
     */
    public String getBusinessid(){
        return businessid;
    }
	
    /**
     * 属性 businessid 的set方法
     * @return
     */
    public void setBusinessid(String businessid){
        this.businessid = businessid;
    } 
	
    /**
     * 属性 flowflag 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFlowflag(){
        return flowflag;
    }
	
    /**
     * 属性 flowflag 的set方法
     * @return
     */
    public void setFlowflag(BigDecimal flowflag){
        this.flowflag = flowflag;
    } 
	
    /**
     * 属性 sequenceid 的get方法
     * @return String
     */
    public String getSequenceid(){
        return sequenceid;
    }
	
    /**
     * 属性 sequenceid 的set方法
     * @return
     */
    public void setSequenceid(String sequenceid){
        this.sequenceid = sequenceid;
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
     * 属性 contractprice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractprice(){
        return contractprice;
    }
	
    /**
     * 属性 contractprice 的set方法
     * @return
     */
    public void setContractprice(BigDecimal contractprice){
        this.contractprice = contractprice;
    } 
	
    /**
     * 属性 contractenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getContractenergy(){
        return contractenergy;
    }
	
    /**
     * 属性 contractenergy 的set方法
     * @return
     */
    public void setContractenergy(BigDecimal contractenergy){
        this.contractenergy = contractenergy;
    } 
	
    /**
     * 属性 superexecid 的get方法
     * @return String
     */
    public String getSuperexecid(){
        return superexecid;
    }
	
    /**
     * 属性 superexecid 的set方法
     * @return
     */
    public void setSuperexecid(String superexecid){
        this.superexecid = superexecid;
    } 
	
    /**
     * 属性 ingodown 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIngodown(){
        return ingodown;
    }
	
    /**
     * 属性 ingodown 的set方法
     * @return
     */
    public void setIngodown(BigDecimal ingodown){
        this.ingodown = ingodown;
    } 
	
    /**
     * 属性 expend1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getExpend1(){
        return expend1;
    }
	
    /**
     * 属性 expend1 的set方法
     * @return
     */
    public void setExpend1(BigDecimal expend1){
        this.expend1 = expend1;
    } 
	
    /**
     * 属性 expend2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getExpend2(){
        return expend2;
    }
	
    /**
     * 属性 expend2 的set方法
     * @return
     */
    public void setExpend2(BigDecimal expend2){
        this.expend2 = expend2;
    } 
	
    /**
     * 属性 expend3 的get方法
     * @return Date
     */
    public BigDecimal getExpend3(){
        return expend3;
    }
	
    /**
     * 属性 expend3 的set方法
     * @return
     */
    public void setExpend3(BigDecimal expend3){
        this.expend3 = expend3;
    } 
	
    /**
     * 属性 expend4 的get方法
     * @return Date
     */
    public Date getExpend4(){
        return expend4;
    }
	
    /**
     * 属性 expend4 的set方法
     * @return
     */
    public void setExpend4(Date expend4){
        this.expend4 = expend4;
    } 
	
    /**
     * 属性 expend5 的get方法
     * @return String
     */
    public String getExpend5(){
        return expend5;
    }
	
    /**
     * 属性 expend5 的set方法
     * @return
     */
    public void setExpend5(String expend5){
        this.expend5 = expend5;
    } 
	
    /**
     * 属性 expend6 的get方法
     * @return String
     */
    public String getExpend6(){
        return expend6;
    }
	
    /**
     * 属性 expend6 的set方法
     * @return
     */
    public void setExpend6(String expend6){
        this.expend6 = expend6;
    } 
	
    /**
     * 属性 purchasergen 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPurchasergen(){
        return purchasergen;
    }
	
    /**
     * 属性 purchasergen 的set方法
     * @return
     */
    public void setPurchasergen(BigDecimal purchasergen){
        this.purchasergen = purchasergen;
    } 
	
    /**
     * 属性 purchaserenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getPurchaserenergy(){
        return purchaserenergy;
    }
	
    /**
     * 属性 purchaserenergy 的set方法
     * @return
     */
    public void setPurchaserenergy(BigDecimal purchaserenergy){
        this.purchaserenergy = purchaserenergy;
    } 
	
    /**
     * 属性 sellergen 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSellergen(){
        return sellergen;
    }
	
    /**
     * 属性 sellergen 的set方法
     * @return
     */
    public void setSellergen(BigDecimal sellergen){
        this.sellergen = sellergen;
    } 
	
    /**
     * 属性 sellerenergy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSellerenergy(){
        return sellerenergy;
    }
	
    /**
     * 属性 sellerenergy 的set方法
     * @return
     */
    public void setSellerenergy(BigDecimal sellerenergy){
        this.sellerenergy = sellerenergy;
    } 
	
    /**
     * 属性 coVersion 的get方法
     * @return String
     */
    public String getCoVersion(){
        return coVersion;
    }
	
    /**
     * 属性 coVersion 的set方法
     * @return
     */
    public void setCoVersion(String coVersion){
        this.coVersion = coVersion;
    } 
	
    /**
     * 属性 isTax 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsTax(){
        return isTax;
    }
	
    /**
     * 属性 isTax 的set方法
     * @return
     */
    public void setIsTax(BigDecimal isTax){
        this.isTax = isTax;
    } 
	
    /**
     * 属性 vendeeGenRate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeGenRate(){
        return vendeeGenRate;
    }
	
    /**
     * 属性 vendeeGenRate 的set方法
     * @return
     */
    public void setVendeeGenRate(BigDecimal vendeeGenRate){
        this.vendeeGenRate = vendeeGenRate;
    } 
	
    /**
     * 属性 saleGenRate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleGenRate(){
        return saleGenRate;
    }
	
    /**
     * 属性 saleGenRate 的set方法
     * @return
     */
    public void setSaleGenRate(BigDecimal saleGenRate){
        this.saleGenRate = saleGenRate;
    } 
	
    /**
     * 属性 saleLoss 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleLoss(){
        return saleLoss;
    }
	
    /**
     * 属性 saleLoss 的set方法
     * @return
     */
    public void setSaleLoss(BigDecimal saleLoss){
        this.saleLoss = saleLoss;
    } 
	
    /**
     * 属性 vendeeLoss 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeLoss(){
        return vendeeLoss;
    }
	
    /**
     * 属性 vendeeLoss 的set方法
     * @return
     */
    public void setVendeeLoss(BigDecimal vendeeLoss){
        this.vendeeLoss = vendeeLoss;
    } 
	
    /**
     * 属性 vendeeBreathPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getVendeeBreathPrice(){
        return vendeeBreathPrice;
    }
	
    /**
     * 属性 vendeeBreathPrice 的set方法
     * @return
     */
    public void setVendeeBreathPrice(BigDecimal vendeeBreathPrice){
        this.vendeeBreathPrice = vendeeBreathPrice;
    } 
	
    /**
     * 属性 saleBreathPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSaleBreathPrice(){
        return saleBreathPrice;
    }
	
    /**
     * 属性 saleBreathPrice 的set方法
     * @return
     */
    public void setSaleBreathPrice(BigDecimal saleBreathPrice){
        this.saleBreathPrice = saleBreathPrice;
    } 
	
    /**
     * 属性 approvedTariff 的get方法
     * @return BigDecimal
     */
    public BigDecimal getApprovedTariff(){
        return approvedTariff;
    }
	
    /**
     * 属性 approvedTariff 的set方法
     * @return
     */
    public void setApprovedTariff(BigDecimal approvedTariff){
        this.approvedTariff = approvedTariff;
    } 
	
    /**
     * 属性 catalogPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCatalogPrice(){
        return catalogPrice;
    }
	
    /**
     * 属性 catalogPrice 的set方法
     * @return
     */
    public void setCatalogPrice(BigDecimal catalogPrice){
        this.catalogPrice = catalogPrice;
    } 
	
    /**
     * 属性 transferAllotPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTransferAllotPrice(){
        return transferAllotPrice;
    }
	
    /**
     * 属性 transferAllotPrice 的set方法
     * @return
     */
    public void setTransferAllotPrice(BigDecimal transferAllotPrice){
        this.transferAllotPrice = transferAllotPrice;
    } 
	
    /**
     * 属性 netDiscountLoss 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetDiscountLoss(){
        return netDiscountLoss;
    }
	
    /**
     * 属性 netDiscountLoss 的set方法
     * @return
     */
    public void setNetDiscountLoss(BigDecimal netDiscountLoss){
        this.netDiscountLoss = netDiscountLoss;
    } 
	
    /**
     * 属性 fundsandaddPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getFundsandaddPrice(){
        return fundsandaddPrice;
    }
	
    /**
     * 属性 fundsandaddPrice 的set方法
     * @return
     */
    public void setFundsandaddPrice(BigDecimal fundsandaddPrice){
        this.fundsandaddPrice = fundsandaddPrice;
    } 
	
    /**
     * 属性 tradePriceMargin 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradePriceMargin(){
        return tradePriceMargin;
    }
	
    /**
     * 属性 tradePriceMargin 的set方法
     * @return
     */
    public void setTradePriceMargin(BigDecimal tradePriceMargin){
        this.tradePriceMargin = tradePriceMargin;
    }
    
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContractbaseinfo))
	        return false; 
			
        if(getContractid() == null) 
	        return false;

        CoContractbaseinfo other = (CoContractbaseinfo) o;	        
	    return new EqualsBuilder()
            .append(this.getContractid(), other.getContractid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("marketid"+":"+getMarketid())
            .append("contractid"+":"+getContractid())
            .append("supercontractid"+":"+getSupercontractid())
            .append("contractname"+":"+getContractname())
            .append("contracttype"+":"+getContracttype())
            .append("papercontractcode"+":"+getPapercontractcode())
            .append("papercontractname"+":"+getPapercontractname())
            .append("contracttemplateid"+":"+getContracttemplateid())
            .append("signstate"+":"+getSignstate())
            .append("signeddate"+":"+getSigneddate())
            .append("notsignedreason"+":"+getNotsignedreason())
            .append("signedperson"+":"+getSignedperson())
            .append("signedsite"+":"+getSignedsite())
            .append("backupperson"+":"+getBackupperson())
            .append("backupdate"+":"+getBackupdate())
            .append("backupstate"+":"+getBackupstate())
            .append("backuporg"+":"+getBackuporg())
            .append("disbackupreason"+":"+getDisbackupreason())
            .append("isend"+":"+getIsend())
            .append("prepcontractflag"+":"+getPrepcontractflag())
            .append("issecrecyflag"+":"+getIssecrecyflag())
            .append("contractcyc"+":"+getContractcyc())
            .append("purchaser"+":"+getPurchaser())
            .append("seller"+":"+getSeller())
            .append("sellerunit"+":"+getSellerunit())
            .append("purchaseunit"+":"+getPurchaseunit())
            .append("contractqty"+":"+getContractqty())
            .append("qtytype"+":"+getQtytype())
            .append("contractstartdate"+":"+getContractstartdate())
            .append("contractenddate"+":"+getContractenddate())
            .append("transactionid"+":"+getTransactionid())
            .append("transactiontype"+":"+getTransactiontype())
            .append("rightsettlementside"+":"+getRightsettlementside())
            .append("isrepurchaseflag"+":"+getIsrepurchaseflag())
            .append("replacetype"+":"+getReplacetype())
            .append("areatype"+":"+getAreatype())
            .append("isehvflag"+":"+getIsehvflag())
            .append("isresaleflag"+":"+getIsresaleflag())
            .append("isopen"+":"+getIsopen())
            .append("purchasegate"+":"+getPurchasegate())
            .append("settlegate"+":"+getSettlegate())
            .append("lossundertaker"+":"+getLossundertaker())
            .append("purchaserperson"+":"+getPurchaserperson())
            .append("purchaserphone"+":"+getPurchaserphone())
            .append("purchaserconftime"+":"+getPurchaserconftime())
            .append("sellerperson"+":"+getSellerperson())
            .append("sellerphone"+":"+getSellerphone())
            .append("sellerconftime"+":"+getSellerconftime())
            .append("transperson"+":"+getTransperson())
            .append("transphone"+":"+getTransphone())
            .append("transconftime"+":"+getTransconftime())
            .append("changetimes"+":"+getChangetimes())
            .append("description"+":"+getDescription())
            .append("isdelete"+":"+getIsdelete())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("versionid"+":"+getVersionid())
            .append("version"+":"+getVersion())
            .append("versiondesc"+":"+getVersiondesc())
            .append("isrelation"+":"+getIsrelation())
            .append("exectype"+":"+getExectype())
            .append("flow"+":"+getFlow())
            .append("settleside"+":"+getSettleside())
            .append("businessid"+":"+getBusinessid())
            .append("flowflag"+":"+getFlowflag())
            .append("sequenceid"+":"+getSequenceid())
            .append("energy"+":"+getEnergy())
            .append("contractprice"+":"+getContractprice())
            .append("contractenergy"+":"+getContractenergy())
            .append("superexecid"+":"+getSuperexecid())
            .append("ingodown"+":"+getIngodown())
            .append("expend1"+":"+getExpend1())
            .append("expend2"+":"+getExpend2())
            .append("expend3"+":"+getExpend3())
            .append("expend4"+":"+getExpend4())
            .append("expend5"+":"+getExpend5())
            .append("expend6"+":"+getExpend6())
            .append("purchasergen"+":"+getPurchasergen())
            .append("purchaserenergy"+":"+getPurchaserenergy())
            .append("sellergen"+":"+getSellergen())
            .append("sellerenergy"+":"+getSellerenergy())
            .append("coVersion"+":"+getCoVersion())
            .append("isTax"+":"+getIsTax())
            .append("vendeeGenRate"+":"+getVendeeGenRate())
            .append("saleGenRate"+":"+getSaleGenRate())
            .append("saleLoss"+":"+getSaleLoss())
            .append("vendeeLoss"+":"+getVendeeLoss())
            .append("vendeeBreathPrice"+":"+getVendeeBreathPrice())
            .append("saleBreathPrice"+":"+getSaleBreathPrice())
            .append("approvedTariff"+":"+getApprovedTariff())
            .append("catalogPrice"+":"+getCatalogPrice())
            .append("transferAllotPrice"+":"+getTransferAllotPrice())
            .append("netDiscountLoss"+":"+getNetDiscountLoss())
            .append("fundsandaddPrice"+":"+getFundsandaddPrice())
            .append("tradePriceMargin"+":"+getTradePriceMargin())
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