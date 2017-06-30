package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTransPrice的POJO类
 *
 * @author  Administrator  [Thu Aug 01 14:18:46 CST 2013]
 * 
 */
public class TrTransPrice implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性id
     */
    private String id;
	
    /** 
     * 属性roadId
     */
    private String roadId;
	
    /** 
     * 属性lineId
     */
    private String lineId;
	
    /** 
     * 属性transmitPrice
     */
    private BigDecimal transmitPrice;
	
    /** 
     * 属性marketId
     */
    private String marketId;
	
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
     * 属性shudianfang
     */
    private String shudianfang;
    /**
     * TrTransPrice构造函数
     */
    public TrTransPrice() {
        super();
    }  
	
    /**
     * TrTransPrice完整的构造函数
     */  
    public TrTransPrice(String id,String roadId,String lineId,String marketId,Date valideDate,String shudianfang ){
        this.id = id;
        this.roadId = roadId;
        this.lineId = lineId;
        this.marketId = marketId;
        this.valideDate = valideDate;
        this.shudianfang=shudianfang;
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
     * 属性 lineId 的get方法
     * @return String
     */
    public String getLineId(){
        return lineId;
    }
	
    /**
     * 属性 lineId 的set方法
     * @return
     */
    public void setLineId(String lineId){
        this.lineId = lineId;
    } 
	
    /**
     * 属性 transmitPrice 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTransmitPrice(){
        return transmitPrice;
    }
	
    /**
     * 属性 transmitPrice 的set方法
     * @return
     */
    public void setTransmitPrice(BigDecimal transmitPrice){
        this.transmitPrice = transmitPrice;
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
		
        if (o == null || !(o instanceof TrTransPrice))
	        return false; 
			
        if(getId() == null) 
	        return false;

        TrTransPrice other = (TrTransPrice) o;	        
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
            .append("lineId"+":"+getLineId())
            .append("transmitPrice"+":"+getTransmitPrice())
            .append("marketId"+":"+getMarketId())
            .append("valideDate"+":"+getValideDate())
            .append("regDate"+":"+getRegDate())
            .append("regMenber"+":"+getRegMenber())
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