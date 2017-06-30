package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * StFdqjytjyb的POJO类
 *
 * @author  lenovo  [Sat Feb 15 11:29:55 CST 2014]
 * 
 */
public class StFdqjytjyb implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性dydl
     */
    private BigDecimal dydl;
	
    /** 
     * 属性dytqdl
     */
    private BigDecimal dytqdl;
	
    /** 
     * 属性dyjh
     */
    private BigDecimal dyjh;
	
    /** 
     * 属性dywcl
     */
    private BigDecimal dywcl;
	
    /** 
     * 属性zytddl
     */
    private BigDecimal zytddl;
	
    /** 
     * 属性zytdtqdl
     */
    private BigDecimal zytdtqdl;
	
    /** 
     * 属性gttdrl
     */
    private BigDecimal gttdrl;
	
    /** 
     * 属性gttdtqrl
     */
    private BigDecimal gttdtqrl;
	
    /** 
     * 属性gttddl
     */
    private BigDecimal gttddl;
	
    /** 
     * 属性gttdtqdl
     */
    private BigDecimal gttdtqdl;
	
    /** 
     * 属性jybm
     */
    private BigDecimal jybm;
	
    /** 
     * 属性jpso2
     */
    private BigDecimal jpso2;
	
    /** 
     * 属性jpco2
     */
    private BigDecimal jpco2;
	
    /** 
     * 属性hnjtnbfdqjydl
     */
    private BigDecimal hnjtnbfdqjydl;
	
    /** 
     * 属性dtjtnbfdqjydl
     */
    private BigDecimal dtjtnbfdqjydl;
	
    /** 
     * 属性gdjtnbfdqjydl
     */
    private BigDecimal gdjtnbfdqjydl;
	
    /** 
     * 属性hdjtnbfdqjydl
     */
    private BigDecimal hdjtnbfdqjydl;
	
    /** 
     * 属性zdtjtnbfdqjydl
     */
    private BigDecimal zdtjtnbfdqjydl;
	
    /** 
     * 属性ghjtnbfdqjydl
     */
    private BigDecimal ghjtnbfdqjydl;
	
    /** 
     * 属性qtjtnbfdqjydl
     */
    private BigDecimal qtjtnbfdqjydl;
	
    /** 
     * 属性ljdl
     */
    private BigDecimal ljdl;
	
    /** 
     * 属性ljtqdl
     */
    private BigDecimal ljtqdl;
	
    /** 
     * 属性ljzytddl
     */
    private BigDecimal ljzytddl;
	
    /** 
     * 属性ljzytdtqdl
     */
    private BigDecimal ljzytdtqdl;
	
    /** 
     * 属性ljgttdrl
     */
    private BigDecimal ljgttdrl;
	
    /** 
     * 属性ljgttdxzrl
     */
    private BigDecimal ljgttdxzrl;
	
    /** 
     * 属性ljgttdzbdl
     */
    private BigDecimal ljgttdzbdl;
	
    /** 
     * 属性ljgttdyjdl
     */
    private BigDecimal ljgttdyjdl;
	
    /** 
     * 属性ljjybm
     */
    private BigDecimal ljjybm;
	
    /** 
     * 属性ljjpso2
     */
    private BigDecimal ljjpso2;
	
    /** 
     * 属性ljjpco2
     */
    private BigDecimal ljjpco2;
	
    /** 
     * 属性sbzt
     */
    private String sbzt;
	
    /** 
     * 属性theyear
     */
    private BigDecimal theyear;
	
    /** 
     * 属性themonth
     */
    private BigDecimal themonth;
	
    /** 
     * 属性version
     */
    private String version;
	
    /**
     * StFdqjytjyb构造函数
     */
    public StFdqjytjyb() {
        super();
    }  
	
    /**
     * StFdqjytjyb完整的构造函数
     */  
    public StFdqjytjyb(String guid){
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
     * 属性 dydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDydl(){
        return dydl;
    }
	
    /**
     * 属性 dydl 的set方法
     * @return
     */
    public void setDydl(BigDecimal dydl){
        this.dydl = dydl;
    } 
	
    /**
     * 属性 dytqdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDytqdl(){
        return dytqdl;
    }
	
    /**
     * 属性 dytqdl 的set方法
     * @return
     */
    public void setDytqdl(BigDecimal dytqdl){
        this.dytqdl = dytqdl;
    } 
	
    /**
     * 属性 dyjh 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjh(){
        return dyjh;
    }
	
    /**
     * 属性 dyjh 的set方法
     * @return
     */
    public void setDyjh(BigDecimal dyjh){
        this.dyjh = dyjh;
    } 
	
    /**
     * 属性 dywcl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDywcl(){
        return dywcl;
    }
	
    /**
     * 属性 dywcl 的set方法
     * @return
     */
    public void setDywcl(BigDecimal dywcl){
        this.dywcl = dywcl;
    } 
	
    /**
     * 属性 zytddl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZytddl(){
        return zytddl;
    }
	
    /**
     * 属性 zytddl 的set方法
     * @return
     */
    public void setZytddl(BigDecimal zytddl){
        this.zytddl = zytddl;
    } 
	
    /**
     * 属性 zytdtqdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZytdtqdl(){
        return zytdtqdl;
    }
	
    /**
     * 属性 zytdtqdl 的set方法
     * @return
     */
    public void setZytdtqdl(BigDecimal zytdtqdl){
        this.zytdtqdl = zytdtqdl;
    } 
	
    /**
     * 属性 gttdrl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGttdrl(){
        return gttdrl;
    }
	
    /**
     * 属性 gttdrl 的set方法
     * @return
     */
    public void setGttdrl(BigDecimal gttdrl){
        this.gttdrl = gttdrl;
    } 
	
    /**
     * 属性 gttdtqrl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGttdtqrl(){
        return gttdtqrl;
    }
	
    /**
     * 属性 gttdtqrl 的set方法
     * @return
     */
    public void setGttdtqrl(BigDecimal gttdtqrl){
        this.gttdtqrl = gttdtqrl;
    } 
	
    /**
     * 属性 gttddl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGttddl(){
        return gttddl;
    }
	
    /**
     * 属性 gttddl 的set方法
     * @return
     */
    public void setGttddl(BigDecimal gttddl){
        this.gttddl = gttddl;
    } 
	
    /**
     * 属性 gttdtqdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGttdtqdl(){
        return gttdtqdl;
    }
	
    /**
     * 属性 gttdtqdl 的set方法
     * @return
     */
    public void setGttdtqdl(BigDecimal gttdtqdl){
        this.gttdtqdl = gttdtqdl;
    } 
	
    /**
     * 属性 jybm 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJybm(){
        return jybm;
    }
	
    /**
     * 属性 jybm 的set方法
     * @return
     */
    public void setJybm(BigDecimal jybm){
        this.jybm = jybm;
    } 
	
    /**
     * 属性 jpso2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJpso2(){
        return jpso2;
    }
	
    /**
     * 属性 jpso2 的set方法
     * @return
     */
    public void setJpso2(BigDecimal jpso2){
        this.jpso2 = jpso2;
    } 
	
    /**
     * 属性 jpco2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJpco2(){
        return jpco2;
    }
	
    /**
     * 属性 jpco2 的set方法
     * @return
     */
    public void setJpco2(BigDecimal jpco2){
        this.jpco2 = jpco2;
    } 
	
    /**
     * 属性 hnjtnbfdqjydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHnjtnbfdqjydl(){
        return hnjtnbfdqjydl;
    }
	
    /**
     * 属性 hnjtnbfdqjydl 的set方法
     * @return
     */
    public void setHnjtnbfdqjydl(BigDecimal hnjtnbfdqjydl){
        this.hnjtnbfdqjydl = hnjtnbfdqjydl;
    } 
	
    /**
     * 属性 dtjtnbfdqjydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDtjtnbfdqjydl(){
        return dtjtnbfdqjydl;
    }
	
    /**
     * 属性 dtjtnbfdqjydl 的set方法
     * @return
     */
    public void setDtjtnbfdqjydl(BigDecimal dtjtnbfdqjydl){
        this.dtjtnbfdqjydl = dtjtnbfdqjydl;
    } 
	
    /**
     * 属性 gdjtnbfdqjydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGdjtnbfdqjydl(){
        return gdjtnbfdqjydl;
    }
	
    /**
     * 属性 gdjtnbfdqjydl 的set方法
     * @return
     */
    public void setGdjtnbfdqjydl(BigDecimal gdjtnbfdqjydl){
        this.gdjtnbfdqjydl = gdjtnbfdqjydl;
    } 
	
    /**
     * 属性 hdjtnbfdqjydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getHdjtnbfdqjydl(){
        return hdjtnbfdqjydl;
    }
	
    /**
     * 属性 hdjtnbfdqjydl 的set方法
     * @return
     */
    public void setHdjtnbfdqjydl(BigDecimal hdjtnbfdqjydl){
        this.hdjtnbfdqjydl = hdjtnbfdqjydl;
    } 
	
    /**
     * 属性 zdtjtnbfdqjydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getZdtjtnbfdqjydl(){
        return zdtjtnbfdqjydl;
    }
	
    /**
     * 属性 zdtjtnbfdqjydl 的set方法
     * @return
     */
    public void setZdtjtnbfdqjydl(BigDecimal zdtjtnbfdqjydl){
        this.zdtjtnbfdqjydl = zdtjtnbfdqjydl;
    } 
	
    /**
     * 属性 ghjtnbfdqjydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGhjtnbfdqjydl(){
        return ghjtnbfdqjydl;
    }
	
    /**
     * 属性 ghjtnbfdqjydl 的set方法
     * @return
     */
    public void setGhjtnbfdqjydl(BigDecimal ghjtnbfdqjydl){
        this.ghjtnbfdqjydl = ghjtnbfdqjydl;
    } 
	
    /**
     * 属性 qtjtnbfdqjydl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getQtjtnbfdqjydl(){
        return qtjtnbfdqjydl;
    }
	
    /**
     * 属性 qtjtnbfdqjydl 的set方法
     * @return
     */
    public void setQtjtnbfdqjydl(BigDecimal qtjtnbfdqjydl){
        this.qtjtnbfdqjydl = qtjtnbfdqjydl;
    } 
	
    /**
     * 属性 ljdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjdl(){
        return ljdl;
    }
	
    /**
     * 属性 ljdl 的set方法
     * @return
     */
    public void setLjdl(BigDecimal ljdl){
        this.ljdl = ljdl;
    } 
	
    /**
     * 属性 ljtqdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjtqdl(){
        return ljtqdl;
    }
	
    /**
     * 属性 ljtqdl 的set方法
     * @return
     */
    public void setLjtqdl(BigDecimal ljtqdl){
        this.ljtqdl = ljtqdl;
    } 
	
    /**
     * 属性 ljzytddl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjzytddl(){
        return ljzytddl;
    }
	
    /**
     * 属性 ljzytddl 的set方法
     * @return
     */
    public void setLjzytddl(BigDecimal ljzytddl){
        this.ljzytddl = ljzytddl;
    } 
	
    /**
     * 属性 ljzytdtqdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjzytdtqdl(){
        return ljzytdtqdl;
    }
	
    /**
     * 属性 ljzytdtqdl 的set方法
     * @return
     */
    public void setLjzytdtqdl(BigDecimal ljzytdtqdl){
        this.ljzytdtqdl = ljzytdtqdl;
    } 
	
    /**
     * 属性 ljgttdrl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgttdrl(){
        return ljgttdrl;
    }
	
    /**
     * 属性 ljgttdrl 的set方法
     * @return
     */
    public void setLjgttdrl(BigDecimal ljgttdrl){
        this.ljgttdrl = ljgttdrl;
    } 
	
    /**
     * 属性 ljgttdxzrl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgttdxzrl(){
        return ljgttdxzrl;
    }
	
    /**
     * 属性 ljgttdxzrl 的set方法
     * @return
     */
    public void setLjgttdxzrl(BigDecimal ljgttdxzrl){
        this.ljgttdxzrl = ljgttdxzrl;
    } 
	
    /**
     * 属性 ljgttdzbdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgttdzbdl(){
        return ljgttdzbdl;
    }
	
    /**
     * 属性 ljgttdzbdl 的set方法
     * @return
     */
    public void setLjgttdzbdl(BigDecimal ljgttdzbdl){
        this.ljgttdzbdl = ljgttdzbdl;
    } 
	
    /**
     * 属性 ljgttdyjdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgttdyjdl(){
        return ljgttdyjdl;
    }
	
    /**
     * 属性 ljgttdyjdl 的set方法
     * @return
     */
    public void setLjgttdyjdl(BigDecimal ljgttdyjdl){
        this.ljgttdyjdl = ljgttdyjdl;
    } 
	
    /**
     * 属性 ljjybm 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjybm(){
        return ljjybm;
    }
	
    /**
     * 属性 ljjybm 的set方法
     * @return
     */
    public void setLjjybm(BigDecimal ljjybm){
        this.ljjybm = ljjybm;
    } 
	
    /**
     * 属性 ljjpso2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjpso2(){
        return ljjpso2;
    }
	
    /**
     * 属性 ljjpso2 的set方法
     * @return
     */
    public void setLjjpso2(BigDecimal ljjpso2){
        this.ljjpso2 = ljjpso2;
    } 
	
    /**
     * 属性 ljjpco2 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjpco2(){
        return ljjpco2;
    }
	
    /**
     * 属性 ljjpco2 的set方法
     * @return
     */
    public void setLjjpco2(BigDecimal ljjpco2){
        this.ljjpco2 = ljjpco2;
    } 
	
    /**
     * 属性 sbzt 的get方法
     * @return String
     */
    public String getSbzt(){
        return sbzt;
    }
	
    /**
     * 属性 sbzt 的set方法
     * @return
     */
    public void setSbzt(String sbzt){
        this.sbzt = sbzt;
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
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof StFdqjytjyb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        StFdqjytjyb other = (StFdqjytjyb) o;	        
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
            .append("marketid"+":"+getMarketid())
            .append("dydl"+":"+getDydl())
            .append("dytqdl"+":"+getDytqdl())
            .append("dyjh"+":"+getDyjh())
            .append("dywcl"+":"+getDywcl())
            .append("zytddl"+":"+getZytddl())
            .append("zytdtqdl"+":"+getZytdtqdl())
            .append("gttdrl"+":"+getGttdrl())
            .append("gttdtqrl"+":"+getGttdtqrl())
            .append("gttddl"+":"+getGttddl())
            .append("gttdtqdl"+":"+getGttdtqdl())
            .append("jybm"+":"+getJybm())
            .append("jpso2"+":"+getJpso2())
            .append("jpco2"+":"+getJpco2())
            .append("hnjtnbfdqjydl"+":"+getHnjtnbfdqjydl())
            .append("dtjtnbfdqjydl"+":"+getDtjtnbfdqjydl())
            .append("gdjtnbfdqjydl"+":"+getGdjtnbfdqjydl())
            .append("hdjtnbfdqjydl"+":"+getHdjtnbfdqjydl())
            .append("zdtjtnbfdqjydl"+":"+getZdtjtnbfdqjydl())
            .append("ghjtnbfdqjydl"+":"+getGhjtnbfdqjydl())
            .append("qtjtnbfdqjydl"+":"+getQtjtnbfdqjydl())
            .append("ljdl"+":"+getLjdl())
            .append("ljtqdl"+":"+getLjtqdl())
            .append("ljzytddl"+":"+getLjzytddl())
            .append("ljzytdtqdl"+":"+getLjzytdtqdl())
            .append("ljgttdrl"+":"+getLjgttdrl())
            .append("ljgttdxzrl"+":"+getLjgttdxzrl())
            .append("ljgttdzbdl"+":"+getLjgttdzbdl())
            .append("ljgttdyjdl"+":"+getLjgttdyjdl())
            .append("ljjybm"+":"+getLjjybm())
            .append("ljjpso2"+":"+getLjjpso2())
            .append("ljjpco2"+":"+getLjjpco2())
            .append("sbzt"+":"+getSbzt())
            .append("theyear"+":"+getTheyear())
            .append("themonth"+":"+getThemonth())
            .append("version"+":"+getVersion())
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