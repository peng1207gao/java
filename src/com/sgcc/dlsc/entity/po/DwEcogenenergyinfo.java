package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
* DwEcogenenergyinfo的POJO类
*
* @author  wangqibin  [Fri Mar 07 11:24:44 CST 2014]
* 
*/
public class DwEcogenenergyinfo implements Serializable{

  /** 
   * 属性guid
   */
  private String guid;
	
  /** 
   * 属性theyear
   */
  private BigDecimal theyear;
	
  /** 
   * 属性themonth
   */
  private BigDecimal themonth;
	
  /** 
   * 属性quantity
   */
  private BigDecimal quantity;
	
  /** 
   * 属性elecquantity
   */
  private BigDecimal elecquantity;
	
  /** 
   * 属性jsquantity
   */
  private BigDecimal jsquantity;
	
  /** 
   * 属性marketid
   */
  private String marketid;
	
  /** 
   * 属性hdquantity
   */
  private BigDecimal hdquantity;
	
  /** 
   * 属性sdquantity
   */
  private BigDecimal sdquantity;
	
  /** 
   * 属性hedquantity
   */
  private BigDecimal hedquantity;
	
  /** 
   * 属性fdquantity
   */
  private BigDecimal fdquantity;
	
  /** 
   * 属性tynquantity
   */
  private BigDecimal tynquantity;
	
  /** 
   * 属性otherqty
   */
  private BigDecimal otherqty;
  private String marketname;
  public String getMarketname() {
	 return marketname;
  }

  public void setMarketname(String marketname) {
	 this.marketname = marketname;
  }
	
  /**
   * DwEcogenenergyinfo构造函数
   */
  public DwEcogenenergyinfo() {
      super();
  }  
	
  /**
   * DwEcogenenergyinfo完整的构造函数
   */  
  public DwEcogenenergyinfo(String guid){
      this.guid = guid;
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
   * 属性 theyear 的get方法
   * @return BigDecimal
   */
  public BigDecimal getTheyear(){
      return theyear;
  }
	
  /**
   * 属性 theyear 的set方法
   * @return
   */
  public void setTheyear(BigDecimal theyear){
      this.theyear = theyear;
  } 
	
  /**
   * 属性 themonth 的get方法
   * @return BigDecimal
   */
  public BigDecimal getThemonth(){
      return themonth;
  }
	
  /**
   * 属性 themonth 的set方法
   * @return
   */
  public void setThemonth(BigDecimal themonth){
      this.themonth = themonth;
  } 
	
  /**
   * 属性 quantity 的get方法
   * @return BigDecimal
   */
  public BigDecimal getQuantity(){
      return quantity;
  }
	
  /**
   * 属性 quantity 的set方法
   * @return
   */
  public void setQuantity(BigDecimal quantity){
      this.quantity = quantity;
  } 
	
  /**
   * 属性 elecquantity 的get方法
   * @return BigDecimal
   */
  public BigDecimal getElecquantity(){
      return elecquantity;
  }
	
  /**
   * 属性 elecquantity 的set方法
   * @return
   */
  public void setElecquantity(BigDecimal elecquantity){
      this.elecquantity = elecquantity;
  } 
	
  /**
   * 属性 jsquantity 的get方法
   * @return BigDecimal
   */
  public BigDecimal getJsquantity(){
      return jsquantity;
  }
	
  /**
   * 属性 jsquantity 的set方法
   * @return
   */
  public void setJsquantity(BigDecimal jsquantity){
      this.jsquantity = jsquantity;
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
   * 属性 hdquantity 的get方法
   * @return BigDecimal
   */
  public BigDecimal getHdquantity(){
      return hdquantity;
  }
	
  /**
   * 属性 hdquantity 的set方法
   * @return
   */
  public void setHdquantity(BigDecimal hdquantity){
      this.hdquantity = hdquantity;
  } 
	
  /**
   * 属性 sdquantity 的get方法
   * @return BigDecimal
   */
  public BigDecimal getSdquantity(){
      return sdquantity;
  }
	
  /**
   * 属性 sdquantity 的set方法
   * @return
   */
  public void setSdquantity(BigDecimal sdquantity){
      this.sdquantity = sdquantity;
  } 
	
  /**
   * 属性 hedquantity 的get方法
   * @return BigDecimal
   */
  public BigDecimal getHedquantity(){
      return hedquantity;
  }
	
  /**
   * 属性 hedquantity 的set方法
   * @return
   */
  public void setHedquantity(BigDecimal hedquantity){
      this.hedquantity = hedquantity;
  } 
	
  /**
   * 属性 fdquantity 的get方法
   * @return BigDecimal
   */
  public BigDecimal getFdquantity(){
      return fdquantity;
  }
	
  /**
   * 属性 fdquantity 的set方法
   * @return
   */
  public void setFdquantity(BigDecimal fdquantity){
      this.fdquantity = fdquantity;
  } 
	
  /**
   * 属性 tynquantity 的get方法
   * @return BigDecimal
   */
  public BigDecimal getTynquantity(){
      return tynquantity;
  }
	
  /**
   * 属性 tynquantity 的set方法
   * @return
   */
  public void setTynquantity(BigDecimal tynquantity){
      this.tynquantity = tynquantity;
  } 
	
  /**
   * 属性 otherqty 的get方法
   * @return BigDecimal
   */
  public BigDecimal getOtherqty(){
      return otherqty;
  }
	
  /**
   * 属性 otherqty 的set方法
   * @return
   */
  public void setOtherqty(BigDecimal otherqty){
      this.otherqty = otherqty;
  } 
	
  /**
   * Hibernate通过该方法判断对象是否相等
   * @return boolean
   */  
  public boolean equals(Object o) {
      if (this == o)
			return true;
		
      if (o == null || !(o instanceof DwEcogenenergyinfo))
	        return false; 
			
      if(getGuid() == null) 
	        return false;

      DwEcogenenergyinfo other = (DwEcogenenergyinfo) o;	        
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
          .append("theyear"+":"+getTheyear())
          .append("themonth"+":"+getThemonth())
          .append("quantity"+":"+getQuantity())
          .append("elecquantity"+":"+getElecquantity())
          .append("jsquantity"+":"+getJsquantity())
          .append("marketid"+":"+getMarketid())
          .append("hdquantity"+":"+getHdquantity())
          .append("sdquantity"+":"+getSdquantity())
          .append("hedquantity"+":"+getHedquantity())
          .append("fdquantity"+":"+getFdquantity())
          .append("tynquantity"+":"+getTynquantity())
          .append("otherqty"+":"+getOtherqty())
          .append("marketname"+":"+getMarketname())
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