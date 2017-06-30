package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * ScYeargenItems的POJO类
 *
 * @author  Administrator  [Tue Jul 09 15:09:09 CST 2013]
 * 
 */
public class ScYeargenItems implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性planDate
     */
    private Date planDate;
	
    /** 
     * 属性versionId
     */
    private String versionId;
    
    /** 
     * 属性planunitId
     */
    private String planunitId;
	
    /** 
     * 属性plantypeId
     */
    private String plantypeId;
	
    /** 
     * 属性contractId
     */
    private String contractId;
	
    /** 
     * 属性grossEng
     */
    private BigDecimal grossEng;
	
    /** 
     * 属性netEng
     */
    private BigDecimal netEng;
	
    /** 
     * 属性grossEngM1
     */
    private BigDecimal grossEngM1;
	
    /** 
     * 属性netEngM1
     */
    private BigDecimal netEngM1;
	
    /** 
     * 属性grossEngM2
     */
    private BigDecimal grossEngM2;
	
    /** 
     * 属性netEngM2
     */
    private BigDecimal netEngM2;
	
    /** 
     * 属性grossEngM3
     */
    private BigDecimal grossEngM3;
	
    /** 
     * 属性netEngM3
     */
    private BigDecimal netEngM3;
	
    /** 
     * 属性grossEngM4
     */
    private BigDecimal grossEngM4;
	
    /** 
     * 属性netEngM4
     */
    private BigDecimal netEngM4;
	
    /** 
     * 属性grossEngM5
     */
    private BigDecimal grossEngM5;
	
    /** 
     * 属性netEngM5
     */
    private BigDecimal netEngM5;
	
    /** 
     * 属性grossEngM6
     */
    private BigDecimal grossEngM6;
	
    /** 
     * 属性netEngM6
     */
    private BigDecimal netEngM6;
	
    /** 
     * 属性grossEngM7
     */
    private BigDecimal grossEngM7;
	
    /** 
     * 属性netEngM7
     */
    private BigDecimal netEngM7;
	
    /** 
     * 属性grossEngM8
     */
    private BigDecimal grossEngM8;
	
    /** 
     * 属性netEngM8
     */
    private BigDecimal netEngM8;
	
    /** 
     * 属性grossEngM9
     */
    private BigDecimal grossEngM9;
	
    /** 
     * 属性netEngM9
     */
    private BigDecimal netEngM9;
	
    /** 
     * 属性grossEngM10
     */
    private BigDecimal grossEngM10;
	
    /** 
     * 属性netEngM10
     */
    private BigDecimal netEngM10;
	
    /** 
     * 属性grossEngM11
     */
    private BigDecimal grossEngM11;
	
    /** 
     * 属性netEngM11
     */
    private BigDecimal netEngM11;
	
    /** 
     * 属性grossEngM12
     */
    private BigDecimal grossEngM12;
	
    /** 
     * 属性netEngM12
     */
    private BigDecimal netEngM12;
	
    /** 
     * 属性remark
     */
    private String remark;
	
    /** 
     * 属性updateTime
     */
    private Date updateTime;
	
    /** 
     * 属性phyunitName
     */
    private String phyunitName;
	
    /** 
     * 属性operUser
     */
    private String userName;
	
    /** 
     * 属性startDate
     */
    private Date startDate;
	
    /** 
     * 属性endDate
     */
    private Date endDate;
	
    /**
     * ScYeargenItems构造函数
     */
    public ScYeargenItems() {
        super();
    }  
	
    /**
     * ScYeargenItems完整的构造函数
     */  
    public ScYeargenItems(String id){
        this.id = id;
    }
 
    /**
     * 属性 id 的get方法
     * @return String
     */
    public String getId(){
        return id;
    }
	
    /**
     * 属性 id 的set方法
     * @return
     */
    public void setId(String id){
        if(id != null && id.trim().length() == 0){
            this.id = null;
        }else{
            this.id = id;
        }
    } 
	
    /**
     * 属性 marketId 的get方法
     * @return String
     */
    public String getMarketId(){
        return marketId;
    }
	
    /**
     * 属性 marketId 的set方法
     * @return
     */
    public void setMarketId(String marketId){
        this.marketId = marketId;
    } 
	
    /**
     * 属性 planDate 的get方法
     * @return Date
     */
    public Date getPlanDate(){
        return planDate;
    }
	
    /**
     * 属性 planDate 的set方法
     * @return
     */
    public void setPlanDate(Date planDate){
        this.planDate = planDate;
    } 
	
    /**
     * 属性 versionId 的get方法
     * @return Date
     */
    public String getVersionId(){
        return versionId;
    }
	
    /**
     * 属性 versionId 的set方法
     * @return
     */
    public void setVersionId(String versionId){
        this.versionId = versionId;
    } 
    /**
     * 属性 planunitId 的get方法
     * @return String
     */
    public String getPlanunitId(){
        return planunitId;
    }
	
    /**
     * 属性 planunitId 的set方法
     * @return
     */
    public void setPlanunitId(String planunitId){
        this.planunitId = planunitId;
    } 
	
    /**
     * 属性 plantypeId 的get方法
     * @return String
     */
    public String getPlantypeId(){
        return plantypeId;
    }
	
    /**
     * 属性 plantypeId 的set方法
     * @return
     */
    public void setPlantypeId(String plantypeId){
        this.plantypeId = plantypeId;
    } 
	
    /**
     * 属性 contractId 的get方法
     * @return String
     */
    public String getContractId(){
        return contractId;
    }
	
    /**
     * 属性 contractId 的set方法
     * @return
     */
    public void setContractId(String contractId){
        this.contractId = contractId;
    } 
	
    /**
     * 属性 grossEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEng(){
        return grossEng;
    }
	
    /**
     * 属性 grossEng 的set方法
     * @return
     */
    public void setGrossEng(BigDecimal grossEng){
        this.grossEng = grossEng;
    } 
	
    /**
     * 属性 netEng 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEng(){
        return netEng;
    }
	
    /**
     * 属性 netEng 的set方法
     * @return
     */
    public void setNetEng(BigDecimal netEng){
        this.netEng = netEng;
    } 
	
    /**
     * 属性 grossEngM1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEngM1(){
        return grossEngM1;
    }
	
    /**
     * 属性 grossEngM1 的set方法
     * @return
     */
    public void setGrossEngM1(BigDecimal grossEngM1){
        this.grossEngM1 = grossEngM1;
    } 
	
    /**
     * 属性 netEngM1 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEngM1(){
        return netEngM1;
    }
	
    /**
     * 属性 netEngM1 的set方法
     * @return
     */
    public void setNetEngM1(BigDecimal netEngM1){
        this.netEngM1 = netEngM1;
    } 
	
    /**
     * 属性 grossEngM2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEngM2(){
        return grossEngM2;
    }
	
    /**
     * 属性 grossEngM2 的set方法
     * @return
     */
    public void setGrossEngM2(BigDecimal grossEngM2){
        this.grossEngM2 = grossEngM2;
    } 
	
    /**
     * 属性 netEngM2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEngM2(){
        return netEngM2;
    }
	
    /**
     * 属性 netEngM2 的set方法
     * @return
     */
    public void setNetEngM2(BigDecimal netEngM2){
        this.netEngM2 = netEngM2;
    } 
	
    /**
     * 属性 grossEngM3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEngM3(){
        return grossEngM3;
    }
	
    /**
     * 属性 grossEngM3 的set方法
     * @return
     */
    public void setGrossEngM3(BigDecimal grossEngM3){
        this.grossEngM3 = grossEngM3;
    } 
	
    /**
     * 属性 netEngM3 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEngM3(){
        return netEngM3;
    }
	
    /**
     * 属性 netEngM3 的set方法
     * @return
     */
    public void setNetEngM3(BigDecimal netEngM3){
        this.netEngM3 = netEngM3;
    } 
	
    /**
     * 属性 grossEngM4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEngM4(){
        return grossEngM4;
    }
	
    /**
     * 属性 grossEngM4 的set方法
     * @return
     */
    public void setGrossEngM4(BigDecimal grossEngM4){
        this.grossEngM4 = grossEngM4;
    } 
	
    /**
     * 属性 netEngM4 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEngM4(){
        return netEngM4;
    }
	
    /**
     * 属性 netEngM4 的set方法
     * @return
     */
    public void setNetEngM4(BigDecimal netEngM4){
        this.netEngM4 = netEngM4;
    } 
	
    /**
     * 属性 grossEngM5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEngM5(){
        return grossEngM5;
    }
	
    /**
     * 属性 grossEngM5 的set方法
     * @return
     */
    public void setGrossEngM5(BigDecimal grossEngM5){
        this.grossEngM5 = grossEngM5;
    } 
	
    /**
     * 属性 netEngM5 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEngM5(){
        return netEngM5;
    }
	
    /**
     * 属性 netEngM5 的set方法
     * @return
     */
    public void setNetEngM5(BigDecimal netEngM5){
        this.netEngM5 = netEngM5;
    } 
	
    /**
     * 属性 grossEngM6 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEngM6(){
        return grossEngM6;
    }
	
    /**
     * 属性 grossEngM6 的set方法
     * @return
     */
    public void setGrossEngM6(BigDecimal grossEngM6){
        this.grossEngM6 = grossEngM6;
    } 
	
    /**
     * 属性 netEngM6 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEngM6(){
        return netEngM6;
    }
	
    /**
     * 属性 netEngM6 的set方法
     * @return
     */
    public void setNetEngM6(BigDecimal netEngM6){
        this.netEngM6 = netEngM6;
    } 
	
    /**
     * 属性 grossEngM7 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEngM7(){
        return grossEngM7;
    }
	
    /**
     * 属性 grossEngM7 的set方法
     * @return
     */
    public void setGrossEngM7(BigDecimal grossEngM7){
        this.grossEngM7 = grossEngM7;
    } 
	
    /**
     * 属性 netEngM7 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEngM7(){
        return netEngM7;
    }
	
    /**
     * 属性 netEngM7 的set方法
     * @return
     */
    public void setNetEngM7(BigDecimal netEngM7){
        this.netEngM7 = netEngM7;
    } 
	
    /**
     * 属性 grossEngM8 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEngM8(){
        return grossEngM8;
    }
	
    /**
     * 属性 grossEngM8 的set方法
     * @return
     */
    public void setGrossEngM8(BigDecimal grossEngM8){
        this.grossEngM8 = grossEngM8;
    } 
	
    /**
     * 属性 netEngM8 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEngM8(){
        return netEngM8;
    }
	
    /**
     * 属性 netEngM8 的set方法
     * @return
     */
    public void setNetEngM8(BigDecimal netEngM8){
        this.netEngM8 = netEngM8;
    } 
	
    /**
     * 属性 grossEngM9 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEngM9(){
        return grossEngM9;
    }
	
    /**
     * 属性 grossEngM9 的set方法
     * @return
     */
    public void setGrossEngM9(BigDecimal grossEngM9){
        this.grossEngM9 = grossEngM9;
    } 
	
    /**
     * 属性 netEngM9 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEngM9(){
        return netEngM9;
    }
	
    /**
     * 属性 netEngM9 的set方法
     * @return
     */
    public void setNetEngM9(BigDecimal netEngM9){
        this.netEngM9 = netEngM9;
    } 
	
    /**
     * 属性 grossEngM10 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEngM10(){
        return grossEngM10;
    }
	
    /**
     * 属性 grossEngM10 的set方法
     * @return
     */
    public void setGrossEngM10(BigDecimal grossEngM10){
        this.grossEngM10 = grossEngM10;
    } 
	
    /**
     * 属性 netEngM10 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEngM10(){
        return netEngM10;
    }
	
    /**
     * 属性 netEngM10 的set方法
     * @return
     */
    public void setNetEngM10(BigDecimal netEngM10){
        this.netEngM10 = netEngM10;
    } 
	
    /**
     * 属性 grossEngM11 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEngM11(){
        return grossEngM11;
    }
	
    /**
     * 属性 grossEngM11 的set方法
     * @return
     */
    public void setGrossEngM11(BigDecimal grossEngM11){
        this.grossEngM11 = grossEngM11;
    } 
	
    /**
     * 属性 netEngM11 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEngM11(){
        return netEngM11;
    }
	
    /**
     * 属性 netEngM11 的set方法
     * @return
     */
    public void setNetEngM11(BigDecimal netEngM11){
        this.netEngM11 = netEngM11;
    } 
	
    /**
     * 属性 grossEngM12 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGrossEngM12(){
        return grossEngM12;
    }
	
    /**
     * 属性 grossEngM12 的set方法
     * @return
     */
    public void setGrossEngM12(BigDecimal grossEngM12){
        this.grossEngM12 = grossEngM12;
    } 
	
    /**
     * 属性 netEngM12 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetEngM12(){
        return netEngM12;
    }
	
    /**
     * 属性 netEngM12 的set方法
     * @return
     */
    public void setNetEngM12(BigDecimal netEngM12){
        this.netEngM12 = netEngM12;
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
     * 属性 updateTime 的get方法
     * @return Date
     */
    public Date getUpdateTime(){
        return updateTime;
    }
	
    /**
     * 属性 updateTime 的set方法
     * @return
     */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    } 
	
    /**
     * 属性 phyunitName 的get方法
     * @return String
     */
    public String getPhyunitName(){
        return phyunitName;
    }
	
    /**
     * 属性 phyunitName 的set方法
     * @return
     */
    public void setPhyunitName(String phyunitName){
        this.phyunitName = phyunitName;
    } 
	
    /**
     * 属性 operUser 的get方法
     * @return String
     */
    public String getUserName(){
        return userName;
    }
	
    /**
     * 属性 operUser 的set方法
     * @return
     */
    public void setUserName(String userName){
        this.userName = userName;
    } 
	
    /**
     * 属性 startDate 的get方法
     * @return Date
     */
    public Date getStartDate(){
        return startDate;
    }
	
    /**
     * 属性 startDate 的set方法
     * @return
     */
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    } 
	
    /**
     * 属性 endDate 的get方法
     * @return Date
     */
    public Date getEndDate(){
        return endDate;
    }
	
    /**
     * 属性 endDate 的set方法
     * @return
     */
    public void setEndDate(Date endDate){
        this.endDate = endDate;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof ScYeargenItems))
	        return false; 
			
        if(getId() == null) 
	        return false;

        ScYeargenItems other = (ScYeargenItems) o;	        
	    return new EqualsBuilder()
            .append(this.getId(), other.getId())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){
		
		  return new StringBuffer()
            .append("id"+":"+getId())
            .append("marketId"+":"+getMarketId())
            .append("planDate"+":"+getPlanDate())
            .append("versionId"+":"+getVersionId())
            .append("planunitId"+":"+getPlanunitId())
            .append("plantypeId"+":"+getPlantypeId())
            .append("contractId"+":"+getContractId())
            .append("grossEng"+":"+getGrossEng())
            .append("netEng"+":"+getNetEng())
            .append("grossEngM1"+":"+getGrossEngM1())
            .append("netEngM1"+":"+getNetEngM1())
            .append("grossEngM2"+":"+getGrossEngM2())
            .append("netEngM2"+":"+getNetEngM2())
            .append("grossEngM3"+":"+getGrossEngM3())
            .append("netEngM3"+":"+getNetEngM3())
            .append("grossEngM4"+":"+getGrossEngM4())
            .append("netEngM4"+":"+getNetEngM4())
            .append("grossEngM5"+":"+getGrossEngM5())
            .append("netEngM5"+":"+getNetEngM5())
            .append("grossEngM6"+":"+getGrossEngM6())
            .append("netEngM6"+":"+getNetEngM6())
            .append("grossEngM7"+":"+getGrossEngM7())
            .append("netEngM7"+":"+getNetEngM7())
            .append("grossEngM8"+":"+getGrossEngM8())
            .append("netEngM8"+":"+getNetEngM8())
            .append("grossEngM9"+":"+getGrossEngM9())
            .append("netEngM9"+":"+getNetEngM9())
            .append("grossEngM10"+":"+getGrossEngM10())
            .append("netEngM10"+":"+getNetEngM10())
            .append("grossEngM11"+":"+getGrossEngM11())
            .append("netEngM11"+":"+getNetEngM11())
            .append("grossEngM12"+":"+getGrossEngM12())
            .append("netEngM12"+":"+getNetEngM12())
            .append("remark"+":"+getRemark())
            .append("updateTime"+":"+getUpdateTime())
            .append("phyunitName"+":"+getPhyunitName())
            .append("operUser"+":"+getUserName())
            .append("startDate"+":"+getStartDate())
            .append("endDate"+":"+getEndDate())
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