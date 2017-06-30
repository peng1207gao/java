package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * StQyksjysjsb的POJO类
 *
 * @author  sss  [Wed Feb 19 16:27:53 CST 2014]
 * 
 */
public class StQyksjysjsb implements Serializable{

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
     * 属性tradename
     */
    private String tradename;
	
    /** 
     * 属性jscf
     */
    private String jscf;
	
    /** 
     * 属性tradetype
     */
    private String tradetype;
	
    /** 
     * 属性dyjyjhdl
     */
    private BigDecimal dyjyjhdl;
	
    /** 
     * 属性cyjyjhdl
     */
    private BigDecimal cyjyjhdl;
	
    /** 
     * 属性seller
     */
    private String seller;
	
    /** 
     * 属性sdl
     */
    private BigDecimal sdl;
	
    /** 
     * 属性sdjg
     */
    private BigDecimal sdjg;
	
    /** 
     * 属性purchaser
     */
    private String purchaser;
	
    /** 
     * 属性gdl
     */
    private BigDecimal gdl;
	
    /** 
     * 属性gdjg
     */
    private BigDecimal gdjg;
	
    /** 
     * 属性sdf
     */
    private BigDecimal sdf;
	
    /** 
     * 属性gdf
     */
    private BigDecimal gdf;
	
    /** 
     * 属性jyjhwcl
     */
    private BigDecimal jyjhwcl;
	
    /** 
     * 属性jydlt
     */
    private BigDecimal jydlt;
	
    /** 
     * 属性gdspjxsdj
     */
    private BigDecimal gdspjxsdj;
	
    /** 
     * 属性gdshdtlbgdj
     */
    private BigDecimal gdshdtlbgdj;
	
    /** 
     * 属性gdspjgdj
     */
    private BigDecimal gdspjgdj;
	
    /** 
     * 属性jygdsgdcb
     */
    private BigDecimal jygdsgdcb;
	
    /** 
     * 属性jysy
     */
    private BigDecimal jysy;
	
    /** 
     * 属性ljjyjhdl
     */
    private BigDecimal ljjyjhdl;
	
    /** 
     * 属性ljsdl
     */
    private BigDecimal ljsdl;
	
    /** 
     * 属性ljsdjg
     */
    private BigDecimal ljsdjg;
	
    /** 
     * 属性ljsdf
     */
    private BigDecimal ljsdf;
	
    /** 
     * 属性ljgdl
     */
    private BigDecimal ljgdl;
	
    /** 
     * 属性ljgdjg
     */
    private BigDecimal ljgdjg;
	
    /** 
     * 属性ljgdf
     */
    private BigDecimal ljgdf;
	
    /** 
     * 属性bnpjxsdj
     */
    private BigDecimal bnpjxsdj;
	
    /** 
     * 属性bnpjgdj
     */
    private BigDecimal bnpjgdj;
	
    /** 
     * 属性jydlljtb
     */
    private BigDecimal jydlljtb;
	
    /** 
     * 属性ljjygdsgdcb
     */
    private BigDecimal ljjygdsgdcb;
	
    /** 
     * 属性ljjysy
     */
    private BigDecimal ljjysy;
	
    /** 
     * 属性sbzt
     */
    private String sbzt;
	
    /** 
     * 属性version
     */
    private String version;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性dcswdl
     */
    private BigDecimal dcswdl;
	
    /** 
     * 属性dcswdj
     */
    private BigDecimal dcswdj;
	
    /** 
     * 属性ljsdsgdcdl
     */
    private BigDecimal ljsdsgdcdl;
	
    /** 
     * 属性ljsdsgdcdj
     */
    private BigDecimal ljsdsgdcdj;
	
    /** 
     * 属性ljsdsgdcdf
     */
    private BigDecimal ljsdsgdcdf;
	
    /**
     * StQyksjysjsb构造函数
     */
    public StQyksjysjsb() {
        super();
    }  
	
    /**
     * StQyksjysjsb完整的构造函数
     */  
    public StQyksjysjsb(String guid,BigDecimal theyear,BigDecimal themonth,String tradename,String jscf,String tradetype){
        this.guid = guid;
        this.theyear = theyear;
        this.themonth = themonth;
        this.tradename = tradename;
        this.jscf = jscf;
        this.tradetype = tradetype;
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
     * 属性 tradename 的get方法
     * @return String
     */
    public String getTradename(){
        return tradename;
    }
	
    /**
     * 属性 tradename 的set方法
     * @return
     */
    public void setTradename(String tradename){
        this.tradename = tradename;
    } 
	
	
	
    /**
     * 属性 jscf 的get方法
     * @return String
     */
    public String getJscf(){
        return jscf;
    }
	
    /**
     * 属性 jscf 的set方法
     * @return
     */
    public void setJscf(String jscf){
        this.jscf = jscf;
    } 
	
	
	
    /**
     * 属性 tradetype 的get方法
     * @return String
     */
    public String getTradetype(){
        return tradetype;
    }
	
    /**
     * 属性 tradetype 的set方法
     * @return
     */
    public void setTradetype(String tradetype){
        this.tradetype = tradetype;
    } 
	
	
	
    /**
     * 属性 dyjyjhdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDyjyjhdl(){
        return dyjyjhdl;
    }
	
    /**
     * 属性 dyjyjhdl 的set方法
     * @return
     */
    public void setDyjyjhdl(BigDecimal dyjyjhdl){
        this.dyjyjhdl = dyjyjhdl;
    } 
	
	
	
    /**
     * 属性 cyjyjhdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCyjyjhdl(){
        return cyjyjhdl;
    }
	
    /**
     * 属性 cyjyjhdl 的set方法
     * @return
     */
    public void setCyjyjhdl(BigDecimal cyjyjhdl){
        this.cyjyjhdl = cyjyjhdl;
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
     * 属性 sdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSdl(){
        return sdl;
    }
	
    /**
     * 属性 sdl 的set方法
     * @return
     */
    public void setSdl(BigDecimal sdl){
        this.sdl = sdl;
    } 
	
	
	
    /**
     * 属性 sdjg 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSdjg(){
        return sdjg;
    }
	
    /**
     * 属性 sdjg 的set方法
     * @return
     */
    public void setSdjg(BigDecimal sdjg){
        this.sdjg = sdjg;
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
     * 属性 gdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGdl(){
        return gdl;
    }
	
    /**
     * 属性 gdl 的set方法
     * @return
     */
    public void setGdl(BigDecimal gdl){
        this.gdl = gdl;
    } 
	
	
	
    /**
     * 属性 gdjg 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGdjg(){
        return gdjg;
    }
	
    /**
     * 属性 gdjg 的set方法
     * @return
     */
    public void setGdjg(BigDecimal gdjg){
        this.gdjg = gdjg;
    } 
	
	
	
    /**
     * 属性 sdf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSdf(){
        return sdf;
    }
	
    /**
     * 属性 sdf 的set方法
     * @return
     */
    public void setSdf(BigDecimal sdf){
        this.sdf = sdf;
    } 
	
	
	
    /**
     * 属性 gdf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGdf(){
        return gdf;
    }
	
    /**
     * 属性 gdf 的set方法
     * @return
     */
    public void setGdf(BigDecimal gdf){
        this.gdf = gdf;
    } 
	
	
	
    /**
     * 属性 jyjhwcl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJyjhwcl(){
        return jyjhwcl;
    }
	
    /**
     * 属性 jyjhwcl 的set方法
     * @return
     */
    public void setJyjhwcl(BigDecimal jyjhwcl){
        this.jyjhwcl = jyjhwcl;
    } 
	
	
	
    /**
     * 属性 jydlt 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJydlt(){
        return jydlt;
    }
	
    /**
     * 属性 jydlt 的set方法
     * @return
     */
    public void setJydlt(BigDecimal jydlt){
        this.jydlt = jydlt;
    } 
	
	
	
    /**
     * 属性 gdspjxsdj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGdspjxsdj(){
        return gdspjxsdj;
    }
	
    /**
     * 属性 gdspjxsdj 的set方法
     * @return
     */
    public void setGdspjxsdj(BigDecimal gdspjxsdj){
        this.gdspjxsdj = gdspjxsdj;
    } 
	
	
	
    /**
     * 属性 gdshdtlbgdj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGdshdtlbgdj(){
        return gdshdtlbgdj;
    }
	
    /**
     * 属性 gdshdtlbgdj 的set方法
     * @return
     */
    public void setGdshdtlbgdj(BigDecimal gdshdtlbgdj){
        this.gdshdtlbgdj = gdshdtlbgdj;
    } 
	
	
	
    /**
     * 属性 gdspjgdj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getGdspjgdj(){
        return gdspjgdj;
    }
	
    /**
     * 属性 gdspjgdj 的set方法
     * @return
     */
    public void setGdspjgdj(BigDecimal gdspjgdj){
        this.gdspjgdj = gdspjgdj;
    } 
	
	
	
    /**
     * 属性 jygdsgdcb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJygdsgdcb(){
        return jygdsgdcb;
    }
	
    /**
     * 属性 jygdsgdcb 的set方法
     * @return
     */
    public void setJygdsgdcb(BigDecimal jygdsgdcb){
        this.jygdsgdcb = jygdsgdcb;
    } 
	
	
	
    /**
     * 属性 jysy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJysy(){
        return jysy;
    }
	
    /**
     * 属性 jysy 的set方法
     * @return
     */
    public void setJysy(BigDecimal jysy){
        this.jysy = jysy;
    } 
	
	
	
    /**
     * 属性 ljjyjhdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjyjhdl(){
        return ljjyjhdl;
    }
	
    /**
     * 属性 ljjyjhdl 的set方法
     * @return
     */
    public void setLjjyjhdl(BigDecimal ljjyjhdl){
        this.ljjyjhdl = ljjyjhdl;
    } 
	
	
	
    /**
     * 属性 ljsdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjsdl(){
        return ljsdl;
    }
	
    /**
     * 属性 ljsdl 的set方法
     * @return
     */
    public void setLjsdl(BigDecimal ljsdl){
        this.ljsdl = ljsdl;
    } 
	
	
	
    /**
     * 属性 ljsdjg 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjsdjg(){
        return ljsdjg;
    }
	
    /**
     * 属性 ljsdjg 的set方法
     * @return
     */
    public void setLjsdjg(BigDecimal ljsdjg){
        this.ljsdjg = ljsdjg;
    } 
	
	
	
    /**
     * 属性 ljsdf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjsdf(){
        return ljsdf;
    }
	
    /**
     * 属性 ljsdf 的set方法
     * @return
     */
    public void setLjsdf(BigDecimal ljsdf){
        this.ljsdf = ljsdf;
    } 
	
	
	
    /**
     * 属性 ljgdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgdl(){
        return ljgdl;
    }
	
    /**
     * 属性 ljgdl 的set方法
     * @return
     */
    public void setLjgdl(BigDecimal ljgdl){
        this.ljgdl = ljgdl;
    } 
	
	
	
    /**
     * 属性 ljgdjg 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgdjg(){
        return ljgdjg;
    }
	
    /**
     * 属性 ljgdjg 的set方法
     * @return
     */
    public void setLjgdjg(BigDecimal ljgdjg){
        this.ljgdjg = ljgdjg;
    } 
	
	
	
    /**
     * 属性 ljgdf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjgdf(){
        return ljgdf;
    }
	
    /**
     * 属性 ljgdf 的set方法
     * @return
     */
    public void setLjgdf(BigDecimal ljgdf){
        this.ljgdf = ljgdf;
    } 
	
	
	
    /**
     * 属性 bnpjxsdj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBnpjxsdj(){
        return bnpjxsdj;
    }
	
    /**
     * 属性 bnpjxsdj 的set方法
     * @return
     */
    public void setBnpjxsdj(BigDecimal bnpjxsdj){
        this.bnpjxsdj = bnpjxsdj;
    } 
	
	
	
    /**
     * 属性 bnpjgdj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getBnpjgdj(){
        return bnpjgdj;
    }
	
    /**
     * 属性 bnpjgdj 的set方法
     * @return
     */
    public void setBnpjgdj(BigDecimal bnpjgdj){
        this.bnpjgdj = bnpjgdj;
    } 
	
	
	
    /**
     * 属性 jydlljtb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getJydlljtb(){
        return jydlljtb;
    }
	
    /**
     * 属性 jydlljtb 的set方法
     * @return
     */
    public void setJydlljtb(BigDecimal jydlljtb){
        this.jydlljtb = jydlljtb;
    } 
	
	
	
    /**
     * 属性 ljjygdsgdcb 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjygdsgdcb(){
        return ljjygdsgdcb;
    }
	
    /**
     * 属性 ljjygdsgdcb 的set方法
     * @return
     */
    public void setLjjygdsgdcb(BigDecimal ljjygdsgdcb){
        this.ljjygdsgdcb = ljjygdsgdcb;
    } 
	
	
	
    /**
     * 属性 ljjysy 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjjysy(){
        return ljjysy;
    }
	
    /**
     * 属性 ljjysy 的set方法
     * @return
     */
    public void setLjjysy(BigDecimal ljjysy){
        this.ljjysy = ljjysy;
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
     * 属性 dcswdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDcswdl(){
        return dcswdl;
    }
	
    /**
     * 属性 dcswdl 的set方法
     * @return
     */
    public void setDcswdl(BigDecimal dcswdl){
        this.dcswdl = dcswdl;
    } 
	
	
	
    /**
     * 属性 dcswdj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getDcswdj(){
        return dcswdj;
    }
	
    /**
     * 属性 dcswdj 的set方法
     * @return
     */
    public void setDcswdj(BigDecimal dcswdj){
        this.dcswdj = dcswdj;
    } 
	
	
	
    /**
     * 属性 ljsdsgdcdl 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjsdsgdcdl(){
        return ljsdsgdcdl;
    }
	
    /**
     * 属性 ljsdsgdcdl 的set方法
     * @return
     */
    public void setLjsdsgdcdl(BigDecimal ljsdsgdcdl){
        this.ljsdsgdcdl = ljsdsgdcdl;
    } 
	
	
	
    /**
     * 属性 ljsdsgdcdj 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjsdsgdcdj(){
        return ljsdsgdcdj;
    }
	
    /**
     * 属性 ljsdsgdcdj 的set方法
     * @return
     */
    public void setLjsdsgdcdj(BigDecimal ljsdsgdcdj){
        this.ljsdsgdcdj = ljsdsgdcdj;
    } 
	
	
	
    /**
     * 属性 ljsdsgdcdf 的get方法
     * @return BigDecimal
     */
    public BigDecimal getLjsdsgdcdf(){
        return ljsdsgdcdf;
    }
	
    /**
     * 属性 ljsdsgdcdf 的set方法
     * @return
     */
    public void setLjsdsgdcdf(BigDecimal ljsdsgdcdf){
        this.ljsdsgdcdf = ljsdsgdcdf;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof StQyksjysjsb))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        StQyksjysjsb other = (StQyksjysjsb) o;	        
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
            .append("tradename"+":"+getTradename())
            .append("jscf"+":"+getJscf())
            .append("tradetype"+":"+getTradetype())
            .append("dyjyjhdl"+":"+getDyjyjhdl())
            .append("cyjyjhdl"+":"+getCyjyjhdl())
            .append("seller"+":"+getSeller())
            .append("sdl"+":"+getSdl())
            .append("sdjg"+":"+getSdjg())
            .append("purchaser"+":"+getPurchaser())
            .append("gdl"+":"+getGdl())
            .append("gdjg"+":"+getGdjg())
            .append("sdf"+":"+getSdf())
            .append("gdf"+":"+getGdf())
            .append("jyjhwcl"+":"+getJyjhwcl())
            .append("jydlt"+":"+getJydlt())
            .append("gdspjxsdj"+":"+getGdspjxsdj())
            .append("gdshdtlbgdj"+":"+getGdshdtlbgdj())
            .append("gdspjgdj"+":"+getGdspjgdj())
            .append("jygdsgdcb"+":"+getJygdsgdcb())
            .append("jysy"+":"+getJysy())
            .append("ljjyjhdl"+":"+getLjjyjhdl())
            .append("ljsdl"+":"+getLjsdl())
            .append("ljsdjg"+":"+getLjsdjg())
            .append("ljsdf"+":"+getLjsdf())
            .append("ljgdl"+":"+getLjgdl())
            .append("ljgdjg"+":"+getLjgdjg())
            .append("ljgdf"+":"+getLjgdf())
            .append("bnpjxsdj"+":"+getBnpjxsdj())
            .append("bnpjgdj"+":"+getBnpjgdj())
            .append("jydlljtb"+":"+getJydlljtb())
            .append("ljjygdsgdcb"+":"+getLjjygdsgdcb())
            .append("ljjysy"+":"+getLjjysy())
            .append("sbzt"+":"+getSbzt())
            .append("version"+":"+getVersion())
            .append("marketid"+":"+getMarketid())
            .append("dcswdl"+":"+getDcswdl())
            .append("dcswdj"+":"+getDcswdj())
            .append("ljsdsgdcdl"+":"+getLjsdsgdcdl())
            .append("ljsdsgdcdj"+":"+getLjsdsgdcdj())
            .append("ljsdsgdcdf"+":"+getLjsdsgdcdf())
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