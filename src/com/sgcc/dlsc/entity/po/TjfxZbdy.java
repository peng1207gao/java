package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
* TjfxZbdy的POJO类
*
* @author  GZHASUS  [Thu Apr 24 14:18:18 CST 2014]
* 
*/
public class TjfxZbdy implements Serializable{

  /** 
   * 属性guid
   */
  private String guid;
	
  /** 
   * 属性zbfl
   */
  private String zbfl;
	
  /** 
   * 属性zbmc
   */
  private String zbmc;
	
  /** 
   * 属性datasource
   */
  private String datasource;
	
  /** 
   * 属性bm
   */
  private String bm;
	
  /** 
   * 属性sjpd
   */
  private String sjpd;
	
  /** 
   * 属性sjsj
   */
  private String sjsj;
	
  /** 
   * 属性sfkwh
   */
  private String sfkwh;
	
  /** 
   * 属性sszb
   */
  private String sszb;
	
  /** 
   * 属性scsql
   */
  private String scsql;
	
  /** 
   * 属性gxsql
   */
  private String gxsql;
	
  /** 
   * 属性zdycqfu
   */
  private String zdycqfu;
	
  /** 
   * 属性bhgsjsql
   */
  private String bhgsjsql;
	
  /** 
   * 属性bz
   */
  private String bz;
	
  /** 
   * 属性sfqy
   */
  private String sfqy;
	
  /** 
   * 属性px
   */
  private BigDecimal px;
	
  /** 
   * 属性ssld
   */
  private BigDecimal ssld;
	
  /** 
   * 属性ssldz
   */
  private BigDecimal ssldz;
	
  /**
   * TjfxZbdy构造函数
   */
  public TjfxZbdy() {
      super();
  }  
	
  /**
   * TjfxZbdy完整的构造函数
   */  
  public TjfxZbdy(String guid,String zbfl){
      this.guid = guid;
      this.zbfl = zbfl;
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
   * 属性 zbfl 的get方法
   * @return String
   */
  public String getZbfl(){
      return zbfl;
  }
	
  /**
   * 属性 zbfl 的set方法
   * @return
   */
  public void setZbfl(String zbfl){
      this.zbfl = zbfl;
  } 
	
  /**
   * 属性 zbmc 的get方法
   * @return String
   */
  public String getZbmc(){
      return zbmc;
  }
	
  /**
   * 属性 zbmc 的set方法
   * @return
   */
  public void setZbmc(String zbmc){
      this.zbmc = zbmc;
  } 
	
  /**
   * 属性 datasource 的get方法
   * @return String
   */
  public String getDatasource(){
      return datasource;
  }
	
  /**
   * 属性 datasource 的set方法
   * @return
   */
  public void setDatasource(String datasource){
      this.datasource = datasource;
  } 
	
  /**
   * 属性 bm 的get方法
   * @return String
   */
  public String getBm(){
      return bm;
  }
	
  /**
   * 属性 bm 的set方法
   * @return
   */
  public void setBm(String bm){
      this.bm = bm;
  } 
	
  /**
   * 属性 sjpd 的get方法
   * @return String
   */
  public String getSjpd(){
      return sjpd;
  }
	
  /**
   * 属性 sjpd 的set方法
   * @return
   */
  public void setSjpd(String sjpd){
      this.sjpd = sjpd;
  } 
	
  /**
   * 属性 sjsj 的get方法
   * @return String
   */
  public String getSjsj(){
      return sjsj;
  }
	
  /**
   * 属性 sjsj 的set方法
   * @return
   */
  public void setSjsj(String sjsj){
      this.sjsj = sjsj;
  } 
	
  /**
   * 属性 sfkwh 的get方法
   * @return String
   */
  public String getSfkwh(){
      return sfkwh;
  }
	
  /**
   * 属性 sfkwh 的set方法
   * @return
   */
  public void setSfkwh(String sfkwh){
      this.sfkwh = sfkwh;
  } 
	
  /**
   * 属性 sszb 的get方法
   * @return String
   */
  public String getSszb(){
      return sszb;
  }
	
  /**
   * 属性 sszb 的set方法
   * @return
   */
  public void setSszb(String sszb){
      this.sszb = sszb;
  } 
	
  /**
   * 属性 scsql 的get方法
   * @return String
   */
  public String getScsql(){
      return scsql;
  }
	
  /**
   * 属性 scsql 的set方法
   * @return
   */
  public void setScsql(String scsql){
      this.scsql = scsql;
  } 
	
  /**
   * 属性 gxsql 的get方法
   * @return String
   */
  public String getGxsql(){
      return gxsql;
  }
	
  /**
   * 属性 gxsql 的set方法
   * @return
   */
  public void setGxsql(String gxsql){
      this.gxsql = gxsql;
  } 
	
  /**
   * 属性 zdycqfu 的get方法
   * @return String
   */
  public String getZdycqfu(){
      return zdycqfu;
  }
	
  /**
   * 属性 zdycqfu 的set方法
   * @return
   */
  public void setZdycqfu(String zdycqfu){
      this.zdycqfu = zdycqfu;
  } 
	
  /**
   * 属性 bhgsjsql 的get方法
   * @return String
   */
  public String getBhgsjsql(){
      return bhgsjsql;
  }
	
  /**
   * 属性 bhgsjsql 的set方法
   * @return
   */
  public void setBhgsjsql(String bhgsjsql){
      this.bhgsjsql = bhgsjsql;
  } 
	
  /**
   * 属性 bz 的get方法
   * @return String
   */
  public String getBz(){
      return bz;
  }
	
  /**
   * 属性 bz 的set方法
   * @return
   */
  public void setBz(String bz){
      this.bz = bz;
  } 
	
  /**
   * 属性 sfqy 的get方法
   * @return String
   */
  public String getSfqy(){
      return sfqy;
  }
	
  /**
   * 属性 sfqy 的set方法
   * @return
   */
  public void setSfqy(String sfqy){
      this.sfqy = sfqy;
  } 
	
  /**
   * 属性 px 的get方法
   * @return BigDecimal
   */
  public BigDecimal getPx(){
      return px;
  }
	
  /**
   * 属性 px 的set方法
   * @return
   */
  public void setPx(BigDecimal px){
      this.px = px;
  } 
	
  /**
   * 属性 ssld 的get方法
   * @return BigDecimal
   */
  public BigDecimal getSsld(){
      return ssld;
  }
	
  /**
   * 属性 ssld 的set方法
   * @return
   */
  public void setSsld(BigDecimal ssld){
      this.ssld = ssld;
  } 
	
  /**
   * 属性 ssldz 的get方法
   * @return BigDecimal
   */
  public BigDecimal getSsldz(){
      return ssldz;
  }
	
  /**
   * 属性 ssldz 的set方法
   * @return
   */
  public void setSsldz(BigDecimal ssldz){
      this.ssldz = ssldz;
  } 
	
  /**
   * Hibernate通过该方法判断对象是否相等
   * @return boolean
   */  
  public boolean equals(Object o) {
      if (this == o)
			return true;
		
      if (o == null || !(o instanceof TjfxZbdy))
	        return false; 
			
      if(getGuid() == null) 
	        return false;

      TjfxZbdy other = (TjfxZbdy) o;	        
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
          .append("zbfl"+":"+getZbfl())
          .append("zbmc"+":"+getZbmc())
          .append("datasource"+":"+getDatasource())
          .append("bm"+":"+getBm())
          .append("sjpd"+":"+getSjpd())
          .append("sjsj"+":"+getSjsj())
          .append("sfkwh"+":"+getSfkwh())
          .append("sszb"+":"+getSszb())
          .append("scsql"+":"+getScsql())
          .append("gxsql"+":"+getGxsql())
          .append("zdycqfu"+":"+getZdycqfu())
          .append("bhgsjsql"+":"+getBhgsjsql())
          .append("bz"+":"+getBz())
          .append("sfqy"+":"+getSfqy())
          .append("px"+":"+getPx())
          .append("ssld"+":"+getSsld())
          .append("ssldz"+":"+getSsldz())
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