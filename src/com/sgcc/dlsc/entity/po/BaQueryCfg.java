package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaQueryCfg的POJO类
 *
 * @author  Administrator  [Fri Nov 08 09:40:11 CST 2013]
 * 
 */
public class BaQueryCfg implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性cjid
     */
    private String cjid;
	
    /** 
     * 属性gnid
     */
    private String gnid;
	
    /** 
     * 属性yhid
     */
    private String yhid;
	
    /** 
     * 属性mrmc
     */
    private String mrmc;
	
    /** 
     * 属性sx
     */
    private String sx;
	
    /** 
     * 属性lx
     */
    private String lx;
	
    /** 
     * 属性z
     */
    private String z;
	
    /** 
     * 属性fzlx
     */
    private String fzlx;
	
    /** 
     * 属性fzhs
     */
    private String fzhs;
	
    /** 
     * 属性fzwz
     */
    private String fzwz;
	
    /** 
     * 属性glzd
     */
    private String glzd;
	
    /** 
     * 属性glz
     */
    private String glz;
	
    /** 
     * 属性sfxs
     */
    private String sfxs;
	
    /** 
     * 属性gnxsmc
     */
    private String gnxsmc;
	
    /** 
     * 属性ys
     */
    private String ys;
	
    /** 
     * 属性sfbt
     */
    private String sfbt;
	
    /** 
     * 属性byzd1
     */
    private String byzd1;
	
    /** 
     * 属性byzd2
     */
    private String byzd2;
	
    /**
     * BaQueryCfg构造函数
     */
    public BaQueryCfg() {
        super();
    }  
	
    /**
     * BaQueryCfg完整的构造函数
     */  
    public BaQueryCfg(String guid,String cjid,String gnid,String yhid,String mrmc,String sx,String lx,String fzlx,String sfxs,String sfbt){
        this.guid = guid;
        this.cjid = cjid;
        this.gnid = gnid;
        this.yhid = yhid;
        this.mrmc = mrmc;
        this.sx = sx;
        this.lx = lx;
        this.fzlx = fzlx;
        this.sfxs = sfxs;
        this.sfbt = sfbt;
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
     * 属性 cjid 的get方法
     * @return String
     */
    public String getCjid(){
        return cjid;
    }
	
    /**
     * 属性 cjid 的set方法
     * @return
     */
    public void setCjid(String cjid){
        this.cjid = cjid;
    } 
	
	
	
    /**
     * 属性 gnid 的get方法
     * @return String
     */
    public String getGnid(){
        return gnid;
    }
	
    /**
     * 属性 gnid 的set方法
     * @return
     */
    public void setGnid(String gnid){
        this.gnid = gnid;
    } 
	
	
	
    /**
     * 属性 yhid 的get方法
     * @return String
     */
    public String getYhid(){
        return yhid;
    }
	
    /**
     * 属性 yhid 的set方法
     * @return
     */
    public void setYhid(String yhid){
        this.yhid = yhid;
    } 
	
	
	
    /**
     * 属性 mrmc 的get方法
     * @return String
     */
    public String getMrmc(){
        return mrmc;
    }
	
    /**
     * 属性 mrmc 的set方法
     * @return
     */
    public void setMrmc(String mrmc){
        this.mrmc = mrmc;
    } 
	
	
	
    /**
     * 属性 sx 的get方法
     * @return String
     */
    public String getSx(){
        return sx;
    }
	
    /**
     * 属性 sx 的set方法
     * @return
     */
    public void setSx(String sx){
        this.sx = sx;
    } 
	
	
	
    /**
     * 属性 lx 的get方法
     * @return String
     */
    public String getLx(){
        return lx;
    }
	
    /**
     * 属性 lx 的set方法
     * @return
     */
    public void setLx(String lx){
        this.lx = lx;
    } 
	
	
	
    /**
     * 属性 z 的get方法
     * @return String
     */
    public String getZ(){
        return z;
    }
	
    /**
     * 属性 z 的set方法
     * @return
     */
    public void setZ(String z){
        this.z = z;
    } 
	
	
	
    /**
     * 属性 fzlx 的get方法
     * @return String
     */
    public String getFzlx(){
        return fzlx;
    }
	
    /**
     * 属性 fzlx 的set方法
     * @return
     */
    public void setFzlx(String fzlx){
        this.fzlx = fzlx;
    } 
	
	
	
    /**
     * 属性 fzhs 的get方法
     * @return String
     */
    public String getFzhs(){
        return fzhs;
    }
	
    /**
     * 属性 fzhs 的set方法
     * @return
     */
    public void setFzhs(String fzhs){
        this.fzhs = fzhs;
    } 
	
	
	
    /**
     * 属性 fzwz 的get方法
     * @return String
     */
    public String getFzwz(){
        return fzwz;
    }
	
    /**
     * 属性 fzwz 的set方法
     * @return
     */
    public void setFzwz(String fzwz){
        this.fzwz = fzwz;
    } 
	
	
	
    /**
     * 属性 glzd 的get方法
     * @return String
     */
    public String getGlzd(){
        return glzd;
    }
	
    /**
     * 属性 glzd 的set方法
     * @return
     */
    public void setGlzd(String glzd){
        this.glzd = glzd;
    } 
	
	
	
    /**
     * 属性 glz 的get方法
     * @return String
     */
    public String getGlz(){
        return glz;
    }
	
    /**
     * 属性 glz 的set方法
     * @return
     */
    public void setGlz(String glz){
        this.glz = glz;
    } 
	
	
	
    /**
     * 属性 sfxs 的get方法
     * @return String
     */
    public String getSfxs(){
        return sfxs;
    }
	
    /**
     * 属性 sfxs 的set方法
     * @return
     */
    public void setSfxs(String sfxs){
        this.sfxs = sfxs;
    } 
	
	
	
    /**
     * 属性 gnxsmc 的get方法
     * @return String
     */
    public String getGnxsmc(){
        return gnxsmc;
    }
	
    /**
     * 属性 gnxsmc 的set方法
     * @return
     */
    public void setGnxsmc(String gnxsmc){
        this.gnxsmc = gnxsmc;
    } 
	
	
	
    /**
     * 属性 ys 的get方法
     * @return String
     */
    public String getYs(){
        return ys;
    }
	
    /**
     * 属性 ys 的set方法
     * @return
     */
    public void setYs(String ys){
        this.ys = ys;
    } 
	
	
	
    /**
     * 属性 sfbt 的get方法
     * @return String
     */
    public String getSfbt(){
        return sfbt;
    }
	
    /**
     * 属性 sfbt 的set方法
     * @return
     */
    public void setSfbt(String sfbt){
        this.sfbt = sfbt;
    } 
	
	
	
    /**
     * 属性 byzd1 的get方法
     * @return String
     */
    public String getByzd1(){
        return byzd1;
    }
	
    /**
     * 属性 byzd1 的set方法
     * @return
     */
    public void setByzd1(String byzd1){
        this.byzd1 = byzd1;
    } 
	
	
	
    /**
     * 属性 byzd2 的get方法
     * @return String
     */
    public String getByzd2(){
        return byzd2;
    }
	
    /**
     * 属性 byzd2 的set方法
     * @return
     */
    public void setByzd2(String byzd2){
        this.byzd2 = byzd2;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaQueryCfg))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        BaQueryCfg other = (BaQueryCfg) o;	        
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
            .append("cjid"+":"+getCjid())
            .append("gnid"+":"+getGnid())
            .append("yhid"+":"+getYhid())
            .append("mrmc"+":"+getMrmc())
            .append("sx"+":"+getSx())
            .append("lx"+":"+getLx())
            .append("z"+":"+getZ())
            .append("fzlx"+":"+getFzlx())
            .append("fzhs"+":"+getFzhs())
            .append("fzwz"+":"+getFzwz())
            .append("glzd"+":"+getGlzd())
            .append("glz"+":"+getGlz())
            .append("sfxs"+":"+getSfxs())
            .append("gnxsmc"+":"+getGnxsmc())
            .append("ys"+":"+getYs())
            .append("sfbt"+":"+getSfbt())
            .append("byzd1"+":"+getByzd1())
            .append("byzd2"+":"+getByzd2())
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