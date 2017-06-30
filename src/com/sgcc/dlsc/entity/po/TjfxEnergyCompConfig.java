package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
* TjfxEnergyCompConfig的POJO类
*
* @author  wangqibin  [Mon Mar 10 11:52:05 CST 2014]
* 
*/
public class TjfxEnergyCompConfig implements Serializable{

  /** 
   * 属性guid
   */
  private String guid;
	
  /** 
   * 属性marketId
   */
  private String marketId;
	
  /** 
   * 属性years
   */
  private BigDecimal years;
	
  /** 
   * 属性coalCons
   */
  private BigDecimal coalCons;
	
  /** 
   * 属性co2Coeff
   */
  private BigDecimal co2Coeff;
	
  /** 
   * 属性so2Coeff
   */
  private BigDecimal so2Coeff;
	
  /** 
   * 属性smokeCoeff
   */
  private BigDecimal smokeCoeff;
	
  /** 
   * 属性ashCoeff
   */
  private BigDecimal ashCoeff;
	
  /**
   * TjfxEnergyCompConfig构造函数
   */
  public TjfxEnergyCompConfig() {
      super();
  }  
	
  /**
   * TjfxEnergyCompConfig完整的构造函数
   */  
  public TjfxEnergyCompConfig(String guid,String marketId){
      this.guid = guid;
      this.marketId = marketId;
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
   * 属性 years 的get方法
   * @return BigDecimal
   */
  public BigDecimal getYears(){
      return years;
  }
	
  /**
   * 属性 years 的set方法
   * @return
   */
  public void setYears(BigDecimal years){
      this.years = years;
  } 
	
  /**
   * 属性 coalCons 的get方法
   * @return BigDecimal
   */
  public BigDecimal getCoalCons(){
      return coalCons;
  }
	
  /**
   * 属性 coalCons 的set方法
   * @return
   */
  public void setCoalCons(BigDecimal coalCons){
      this.coalCons = coalCons;
  } 
	
  /**
   * 属性 co2Coeff 的get方法
   * @return BigDecimal
   */
  public BigDecimal getCo2Coeff(){
      return co2Coeff;
  }
	
  /**
   * 属性 co2Coeff 的set方法
   * @return
   */
  public void setCo2Coeff(BigDecimal co2Coeff){
      this.co2Coeff = co2Coeff;
  } 
	
  /**
   * 属性 so2Coeff 的get方法
   * @return BigDecimal
   */
  public BigDecimal getSo2Coeff(){
      return so2Coeff;
  }
	
  /**
   * 属性 so2Coeff 的set方法
   * @return
   */
  public void setSo2Coeff(BigDecimal so2Coeff){
      this.so2Coeff = so2Coeff;
  } 
	
  /**
   * 属性 smokeCoeff 的get方法
   * @return BigDecimal
   */
  public BigDecimal getSmokeCoeff(){
      return smokeCoeff;
  }
	
  /**
   * 属性 smokeCoeff 的set方法
   * @return
   */
  public void setSmokeCoeff(BigDecimal smokeCoeff){
      this.smokeCoeff = smokeCoeff;
  } 
	
  /**
   * 属性 ashCoeff 的get方法
   * @return BigDecimal
   */
  public BigDecimal getAshCoeff(){
      return ashCoeff;
  }
	
  /**
   * 属性 ashCoeff 的set方法
   * @return
   */
  public void setAshCoeff(BigDecimal ashCoeff){
      this.ashCoeff = ashCoeff;
  } 
	
  /**
   * Hibernate通过该方法判断对象是否相等
   * @return boolean
   */  
  public boolean equals(Object o) {
      if (this == o)
			return true;
		
      if (o == null || !(o instanceof TjfxEnergyCompConfig))
	        return false; 
			
      if(getGuid() == null) 
	        return false;

      TjfxEnergyCompConfig other = (TjfxEnergyCompConfig) o;	        
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
          .append("marketId"+":"+getMarketId())
          .append("years"+":"+getYears())
          .append("coalCons"+":"+getCoalCons())
          .append("co2Coeff"+":"+getCo2Coeff())
          .append("so2Coeff"+":"+getSo2Coeff())
          .append("smokeCoeff"+":"+getSmokeCoeff())
          .append("ashCoeff"+":"+getAshCoeff())
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