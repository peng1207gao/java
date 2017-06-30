package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTransNetloss的POJO类
 *
 * @author  zhen  [Mon Nov 11 14:46:31 CST 2013]
 * 
 */
public class TrTransNetloss implements Serializable{

    /** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性roadId
     */
    private String roadId;
	
    /** 
     * 属性tielineId
     */
    private String tielineId;
	
    /** 
     * 属性netlossRatio
     */
    private BigDecimal netlossRatio;
	
    /** 
     * 属性valideDate
     */
    private Date valideDate;
	
    /** 
     * 属性regDate
     */
    private Date regDate;
	
    /** 
     * 属性regMenber
     */
    private String regMenber;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
    /** 
     * 属性remark
     */
    private String remark;
	
    /** 
     * 属性shudianfang
     */
    private String shudianfang;
	
    /**
     * TrTransNetloss构造函数
     */
    public TrTransNetloss() {
        super();
    }  
	
    /**
     * TrTransNetloss完整的构造函数
     */  
    public TrTransNetloss(String id,String roadId,String tielineId,Date valideDate,String shudianfang){
        this.id = id;
        this.roadId = roadId;
        this.tielineId = tielineId;
        this.valideDate = valideDate;
        this.shudianfang = shudianfang;
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
     * 属性 roadId 的get方法
     * @return String
     */
    public String getRoadId(){
        return roadId;
    }
	
    /**
     * 属性 roadId 的set方法
     * @return
     */
    public void setRoadId(String roadId){
        this.roadId = roadId;
    } 
	
    /**
     * 属性 tielineId 的get方法
     * @return String
     */
    public String getTielineId(){
        return tielineId;
    }
	
    /**
     * 属性 tielineId 的set方法
     * @return
     */
    public void setTielineId(String tielineId){
        this.tielineId = tielineId;
    } 
	
    /**
     * 属性 netlossRatio 的get方法
     * @return BigDecimal
     */
    public BigDecimal getNetlossRatio(){
        return netlossRatio;
    }
	
    /**
     * 属性 netlossRatio 的set方法
     * @return
     */
    public void setNetlossRatio(BigDecimal netlossRatio){
        this.netlossRatio = netlossRatio;
    } 
	
    /**
     * 属性 valideDate 的get方法
     * @return Date
     */
    public Date getValideDate(){
        return valideDate;
    }
	
    /**
     * 属性 valideDate 的set方法
     * @return
     */
    public void setValideDate(Date valideDate){
        this.valideDate = valideDate;
    } 
	
    /**
     * 属性 regDate 的get方法
     * @return Date
     */
    public Date getRegDate(){
        return regDate;
    }
	
    /**
     * 属性 regDate 的set方法
     * @return
     */
    public void setRegDate(Date regDate){
        this.regDate = regDate;
    } 
	
    /**
     * 属性 regMenber 的get方法
     * @return String
     */
    public String getRegMenber(){
        return regMenber;
    }
	
    /**
     * 属性 regMenber 的set方法
     * @return
     */
    public void setRegMenber(String regMenber){
        this.regMenber = regMenber;
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
     * 属性 shudianfang 的get方法
     * @return String
     */
    public String getShudianfang(){
        return shudianfang;
    }
	
    /**
     * 属性 shudianfang 的set方法
     * @return
     */
    public void setShudianfang(String shudianfang){
        this.shudianfang = shudianfang;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTransNetloss))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrTransNetloss other = (TrTransNetloss) o;	        
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
            .append("roadId"+":"+getRoadId())
            .append("tielineId"+":"+getTielineId())
            .append("netlossRatio"+":"+getNetlossRatio())
            .append("valideDate"+":"+getValideDate())
            .append("regDate"+":"+getRegDate())
            .append("regMenber"+":"+getRegMenber())
            .append("marketId"+":"+getMarketId())
            .append("remark"+":"+getRemark())
            .append("shudianfang"+":"+getShudianfang())
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